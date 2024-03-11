 class E {
    static int i=10;
    public static void main(String[] args) {
        System.out.println(i);//refers to the static variable
        int i=20;                               
        System.out.println(i); //refers to the local variable
        System.out.println(E.i); // if there is a local variable of the same name as a static variable in order to access the static variable we have to specify the class name otherwise the jre will display return the local variable
        
    }   
}
