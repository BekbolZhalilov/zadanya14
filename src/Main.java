public class Main {
    public static void main(String[] args) {

        dog dog = new dog("Sharic",15,50);
        System.out.println(dog.getName());
        System.out.println(dog.getWeight());
        System.out.println(dog.getAge());
        System.out.println();




        cat cat = new cat("Murca",8,10);
        System.out.println(cat.getName());
        System.out.println(cat.getWeight());
        System.out.println(cat.getAge());
        System.out.println();


        popugai popugai = new popugai("Rio","povtoriaet",80);
        System.out.println(popugai.getName());
        System.out.println(popugai.getTalk());
        System.out.println(popugai.getAge());
    }
}