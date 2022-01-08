class robot {
    private String Name;
    private int Weight;
    private String Color;

    void setName(String newName) {
        Name = newName;
    }

    void setWeight(int newWeight){
        Weight = newWeight;
    }

    void setColor(String newColor) {
        Color = newColor;
    }

    void introduce() {
        System.out.println("Hello my name is " + Name);
    }

    public static void main(String[] args) {
        robot tom = new robot();
        tom.setName("Tom");
        tom.setColor("Red");
        tom.setWeight(30);
        tom.introduce();
        robot jerry = new robot();
        jerry.setName("Jerry");
        jerry.setColor("Blue");
        jerry.setWeight(40);
        jerry.introduce();

    }

}