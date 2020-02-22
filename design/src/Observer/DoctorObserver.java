package Observer;

public class DoctorObserver implements Observer {
    @Override
    public void display(int stage) {
        System.out.print("医护人员: ");
        switch (stage) {
            case Stage.UNHAPPENED:
                System.out.println("照常工作");
                break;
            case Stage.HAPPENED:
                System.out.println("有所警觉");
                break;
            case Stage.BROKEN:
                System.out.println("整装待发");
                break;
            case Stage.TOP:
                System.out.println("全民支援武汉");
                break;
            case Stage.DECREASED:
                System.out.println("不放松警惕");
                break;
            case Stage.END:
                System.out.println("回家休息(支援日本？)");
                break;
            default:
                break;
        }
    }
}
