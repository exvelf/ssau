class MyFirstClass {
    public static void main(String[] args){
        int i, j;

        for (i=1; i<=8; i++) {
            for (j=1; j <=8; j++) {
                MySecondClass o = new MySecondClass();
                o.setParam1(i);
                o.setParam2(j);
                System.out.print(" ");
                System.out.print(o.summ());
            }
            System.out.println();
        }
    }
}
class MySecondClass {
    private int param1, param2;
    public int summ () {
        return this.param1+this.param2;
    }

    public MySecondClass() {
    }

    public MySecondClass(int param1, int param2) {
        this.param1 = param1;
        this.param2 = param2;
    }

    public int getParam2() {
        return param2;
    }

    public void setParam2(int param2) {
        this.param2 = param2;
    }

    public int getParam1() {
        return param1;
    }

    public void setParam1(int param1) {
        this.param1 = param1;
    }
}