import javax.sound.sampled.SourceDataLine;

/*Logical operator */
class Logical {
    public static void main(String[] args) {
        System.out.println("Logical And");
        System.out.println((10 > 5) && (2 > 1));
        System.out.println((10 < 5) && (2 < 1));
        System.out.println((10 > 5) && (2 < 1));
        System.out.println("Logical OR");
        System.out.println((10 > 5) || (2 > 1));
        System.out.println((10 < 5) || (2 < 1));
        System.out.println((10 > 5) || (2 < 1));
        System.out.println("Logical NOT");
        System.out.println((10 > 5) && (2 > 1));
        System.out.println(!(10 > 5));
        System.out.println(!(10 < 5));
    }
}