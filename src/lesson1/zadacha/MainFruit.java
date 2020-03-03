package lesson1.zadacha;

public class MainFruit {
    public static void main(String[] args) {
        Box<Orange> or = new Box<>();
        Box<Orange> or1 = new Box<>();
        Box<Apple> ap = new Box<>();
        Box<Apple> ap1 = new Box<>();
        System.out.println("'g' -> addFruit: ");
        or.addFruit(new Orange(),10);
        or1.addFruit(new Orange(),12);
        ap.addFruit(new Apple(),8);
        ap1.addFruit(new Apple(),4);
        System.out.println("Box 1: "+or.getWeight());
        System.out.println("Box 2: "+or1.getWeight());
        System.out.println("Box 3: "+ap.getWeight());
        System.out.println("Box 4: "+ap1.getWeight());
        System.out.println("'e' -> compare(): ");
        System.out.println("Box 1 сравниваем с box 3: "+or.compare(ap));
        System.out.println("Box 2 сравниваем с box 4: "+or1.compare(ap1));
        System.out.println("'f' -> Intersperse(): ");
        or.Intersperse(or1);
        ap.Intersperse(ap1);
        System.out.println("Box 1: "+or.getWeight());
        System.out.println("Box 2: "+or1.getWeight());
        System.out.println("Box 3: "+ap.getWeight());
        System.out.println("Box 4: "+ap1.getWeight());
    }
}
