public class popugai {
    private String name;
    private String talk;
    private int age;

    public popugai(){

    }

    public popugai(String name,String talk,int age){
        this.name = name;
        this.talk = talk;
        this.age = age;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTalk(String talk) {
        this.talk = talk;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {

        return name;
    }

    public String getTalk() {
        return talk;
    }

    public int getAge() {
        return age;
    }
}
