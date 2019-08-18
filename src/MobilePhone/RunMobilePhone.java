package MobilePhone;

public class RunMobilePhone {
    public static void main(String[] args) {
//        SamsungPhone s9 = new SamsungPhone();
//        s9.setModel("S9");
//        s9.aboutPhone();
//        s9.browsing();
//        s9.call("718-795-3584");
//        s9.text("718-795-3583"," how are you?");
//        s9.setOperatingSystem();
//        s9.touchScreen();
//        System.out.println("-----------end------------");

        ApplePhone iPhoneX = new ApplePhone();
        iPhoneX.setModel("iPhoneX");
        iPhoneX.aboutPhone();
        iPhoneX.browsing();
        iPhoneX.call("718-795-3584");
        iPhoneX.text("718-795-3583","How are you?");
        iPhoneX.setOperatingSystem();
        iPhoneX.touchScreen();
        System.out.println("-----------------------end--------------------------");

    }
}
