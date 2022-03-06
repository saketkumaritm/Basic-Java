class variables {
    int a = 10;
    static int b = 20;

    public static void main(String[] args) {
        int c = 30;
        final int D = 40;
        Test t = new Test();
        System.out.println(t, a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(D);
    }
}