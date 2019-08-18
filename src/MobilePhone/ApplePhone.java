package MobilePhone;

public class ApplePhone extends SmartPhone {
    private String model;

    public void touchScreen(){
        System.out.println("Apple Cell phone uses 4th generation touch screen ");
    }

    public void setOperatingSystem(){
        os = "iOS";
        System.out.println("Welcome to " + os);
    }

    public String getModel() {return model;}
    public void setModel(String model) {this.model = model;}

    public void aboutPhone(){
        System.out.println("This is Apple smart phone");
        System.out.println("it's model name: " + model);
    }
}
