import MyFirstPackage.MySecondClass;

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
