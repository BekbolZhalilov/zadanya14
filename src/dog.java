public class dog {
    private String name;
    private int age;
    private int weight;

    public dog(String sharic){

    }
    public  dog(String name,int age,int weight){
        this.name = name;
        this.age = age;
        this.weight = weight;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

}
