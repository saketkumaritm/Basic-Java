import javax.sound.sampled.SourceDataLine;

/*Incr./Decre Operator*/

class prepost {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);
        System.out.println("Prepost incre...!");
        System.out.println(a++);
        System.out.println(++a);

        System.out.println("Prepost Decre...!");
        System.out.println(a--);
        System.out.println(--a);
    }
}