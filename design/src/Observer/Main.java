package Observer;

public class Main {
    public static void main(String[] args) {
        Subject subject = new EpidemicSubject();
        subject.addObserver(new StudentObserver());
        subject.addObserver(new DoctorObserver());
        subject.addObserver(new NormalObserver());
        int stage = Stage.UNHAPPENED;
        try {
            while (stage <= Stage.END) {
                switch (stage) {
                    case Stage.UNHAPPENED:
                        System.out.println("疫情未出现:");
                        break;
                    case Stage.HAPPENED:
                        System.out.println("疫情出现:");
                        break;
                    case Stage.BROKEN:
                        System.out.println("疫情爆发:");
                        break;
                    case Stage.TOP:
                        System.out.println("疫情达到巅峰:");
                        break;
                    case Stage.DECREASED:
                        System.out.println("疫情好转:");
                        break;
                    case Stage.END:
                        System.out.println("疫情结束:");
                        break;
                    default:
                        break;
                }
                subject.notifyObserver(stage);
                stage++;
                Thread.sleep(1000);
            }
            System.out.println("疫情结束!!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
