public class cat {
    private String name;
    private int weight;
    private int age;

    public cat(){

    }

    public cat(String name, int weight,int age){
        this.name = name;
        this.weight = weight;
        this.age = age;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight= weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }
}
