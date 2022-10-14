public class Addresss {
    String houseno;
    String area;
    String city;
    String pin;

    public Addresss(String houseno,String area,String city,String pin)
    {

        this.houseno=houseno;
        this.area=area;
        this.city=city;
        this.pin=pin;
    
    }
    void displayAddress()
    {
        System.out.println("House No.:" +houseno);
        System.out.println("Area :" +area);
        System.out.println("City :" +city);
        System.out.println("Pin Code :" +pin);
    }
    
}
