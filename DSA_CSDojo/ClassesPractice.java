class Robot {
    private String Name;
    private int Weight;
    private String Color;

    // contructors
    Robot(){}

    Robot(String Name, int Weight, String Color){
        this.Name = Name;
        this.Weight = Weight;
        this.Color = Color;
    }

    /// setters
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
        System.out.println("Hello my name is " + this.Name);
    }

    public static void main(String[] args) {
        Robot tom = new Robot();
        tom.setName("Tom");
        tom.setColor("Red");
        tom.setWeight(30);
        tom.introduce();
        Robot jerry = new Robot();
        jerry.setName("Jerry");
        jerry.setColor("Blue");
        jerry.setWeight(40);
        jerry.introduce();
        Robot julius = new Robot("Julius", 180, "lightskin asl");
        julius.introduce();

    }

}