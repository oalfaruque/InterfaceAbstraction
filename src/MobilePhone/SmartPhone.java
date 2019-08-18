package MobilePhone;

public abstract  class SmartPhone implements MobilePhone{
    public void call(String phoneNumber){
        System.out.println("Dialing " + phoneNumber);
    }
    public void text(String phoneNumber, String message){
        System.out.println(message + " sent to: " + phoneNumber);
    }
    public String os;
    public abstract void touchScreen();
    public abstract void setOperatingSystem();
    public void browsing(){
        System.out.println("This phone is able to browse internet");

    }
}
