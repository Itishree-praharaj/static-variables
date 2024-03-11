
 class B {
    static int i=1;
    public static void main(String[] args) {
        m1();
        B.i=25;
        m1();
    }
    public static void m1(){
        System.out.println("M1 starts");
        System.out.println(B.i);
        System.out.println("M2 ends");
    }
}
