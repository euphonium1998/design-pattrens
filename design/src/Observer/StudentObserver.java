package Observer;

class StudentObserver implements Observer {
    @Override
    public void display(int stage) {
        System.out.print("学生: ");
        switch (stage) {
            case Stage.UNHAPPENED:
                System.out.println("学校上学");
                break;
            case Stage.HAPPENED:
                System.out.println("开始放假");
                break;
            case Stage.BROKEN:
                System.out.println("在家隔离");
                break;
            case Stage.TOP:
                System.out.println("远程教学");
                break;
            case Stage.DECREASED:
                System.out.println("收到开学通知");
                break;
            case Stage.END:
                System.out.println("回归正常生活");
                break;
            default:
                break;
        }
    }
}
