
class Animal{
    private String name;
    private int maximum_lifetime;

    Animal(){}

    Animal(String name, int maximum_lifetime){
        this.name = name;
        this.maximum_lifetime = maximum_lifetime;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){

    }

    public int getMaximum_lifetime(){
        return maximum_lifetime;
    }

    public void setMaximum_lifetime(int maximum_lifetime){

    }

    public String toString(){

        return("고양이의 이름은 " + this.getName() + "이고 수명은 " + this.getMaximum_lifetime() + "입니다.");
    }
}