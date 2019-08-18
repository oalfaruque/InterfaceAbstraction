package MobilePhone;

public class SamsungPhone extends SmartPhone {
    private String model;

    public void touchScreen(){
        System.out.println("Samsung Cell phone uses 4th generation touch screen ");
    }

    public void setOperatingSystem(){
        os = "Android Jellybean";
        System.out.println("Welcome to " + os);
    }

    public String getModel() {return model;}
    public void setModel(String model) {this.model = model;}

    public void aboutPhone(){
        System.out.println("This is Samsung smart phone");
        System.out.println("it's model name: " + model);
    }

}
