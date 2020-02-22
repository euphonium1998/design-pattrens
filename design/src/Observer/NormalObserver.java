package Observer;

class NormalObserver implements Observer{
    @Override
    public void display(int stage) {
        System.out.print("普通工作人员: ");
        switch (stage) {
            case Stage.UNHAPPENED:
            case Stage.HAPPENED:
                System.out.println("照常工作");
                break;
            case Stage.BROKEN:
                System.out.println("在家隔离");
                break;
            case Stage.TOP:
                System.out.println("在家远程办公");
                break;
            case Stage.DECREASED:
                System.out.println("陆续返工");
                break;
            case Stage.END:
                System.out.println("回归正常生活");
                break;
            default:
                break;
        }
    }
}
