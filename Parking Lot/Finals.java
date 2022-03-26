import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.lang.*;
class floors                                                //ENCAPSULATION
{
    void truck(int i)
    {
        if(i<=5)
        {
            System.out.println("Can accommodate more trucks: "+(5-i));
            System.out.println("Floor number : 0");
        }
        else if(i>5)
        {
            System.out.println("No vacancies for trucks");
        }
    }
    void minitrucks(int i)
    {
        if(i<6)
        {
            System.out.println("Can accommodate more minitrucks: "+(5-i));
            System.out.println("Floor number : 1");
        }
        else if(i>=6&&i<7)
        {
            System.out.println("Can accommodate more minitrucks: "+(6-i));
            System.out.println("Floor number : 2");
        }

        else if(i>=7)
        {
            System.out.println("No more vacancies for minitrucks");
        }
    }
    void cars(int i)
    {
        if(i<4)
        {
            System.out.println("Can accommodate more cars: "+(3-i));
            System.out.println("Floor number : 1");
        }
        else if(i>=4&&i<10)
        {
            System.out.println("Can accommodate more cars: "+(9-i));
            System.out.println("Floor number : 2");
        }
        else if(i>=10&&i<16)
        {
            System.out.println("Can accommodate more cars: "+(15-i));
            System.out.println("Floor number : 3");
        }
        else if(i>=16&&i<22)
        {
            System.out.println("Can accommodate more cars: "+(21-i));
            System.out.println("Floor number : 4");
        }
        else if(i>=22)
        {
            System.out.println("No more vacancies for cars");
        }

    }
    void electricars(int i)
    {
        if(i==1)
        {
            System.out.println("Can accommodate more Electric cars: "+(1-i));
            System.out.println("Floor number : 1");
        }
        else if(i>=2&&i<5)
        {
            System.out.println("Can accommodate more Electric cars: "+(4-i));
            System.out.println("Floor number : 2");
        }
        else if(i>=5&&i<8)
        {
            System.out.println("Can accommodate more Electric cars: "+(7-i));
            System.out.println("Floor number : 3");
        }
        else if(i>=8&&i<11)
        {
            System.out.println("Can accommodate more Electric cars: "+(10-i));
            System.out.println("Floor number : 4");
        }
        else if(i>=11)
        {
            System.out.println("No more vacancies for Electric cars");
        }
    }
    void twowheelers(int i)
    {
        if(i<6)
        {
            System.out.println("Can accommodate more Two-wheelers: "+(5-i));
            System.out.println("Floor number : 1");
        }
        else if(i>=6&&i<14)
        {
            System.out.println("Can accommodate more Two-wheelers: "+(13-i));
            System.out.println("Floor number : 2");
        }
        else if(i>=14&&i<24)
        {
            System.out.println("Can accommodate more Two-wheelers: "+(23-i));
            System.out.println("Floor number : 3");
        }
        else if(i>=24&&i<34)
        {
            System.out.println("Can accommodate more Two-wheelers: "+(33-i));
            System.out.println("Floor number : 4");
        }
        else if(i>=34)
        {
            System.out.println("No more vacancies for Two-wheelers");
        }
    }
    void Handicapped(int i)
    {
        if(i<=5)
        {
            System.out.println("Can accommodate more Handicapped: "+(5-i));
            System.out.println("Floor number : 0");
        }
        else if(i>5)
        {
            System.out.println("No vacancies for Handicapped");
        }
    }
    void ElectricScooter(int i)
    {
        if(i<3)
        {
            System.out.println("Can accommodate more ElectricScooter : "+(2-i));
            System.out.println("Floor number : 1");
        }
        else if(i>=3&&i<5)
        {
            System.out.println("Can accommodate more ElectricScooter: "+(4-i));
            System.out.println("Floor number : 2");
        }
        else if(i>=5&&i<7)
        {
            System.out.println("Can accommodate more ElectricScooter: "+(6-i));
            System.out.println("Floor number : 3");
        }
        else if(i>=7&&i<9)
        {
            System.out.println("Can accommodate more ElectricScooter: "+(8-i));
            System.out.println("Floor number : 4");
        }
        else if(i>=9)
        {
            System.out.println("No more vacancies for ElectricScooter");
        }
    }
}

class Vehicle                                                   //POLYMORPHISM
{
    public void Payment(long H,long M)
    {
        System.out.println("Payment Price");
    }
}
class Truck extends Vehicle
{
    public void Payment(long H,long M)
    {
        System.out.println("Payment have to be paid: "+(H*80+ M*(8/6)));
    } //Method Overriding
}
class MT extends Vehicle
{

    public void Payment(long H, long M)
    {
        System.out.println("Payment have to be paid: "+(H*40+M*(4/6)));
    }
}
class Cars extends Vehicle
{
    public void Payment(long H,long M)
    {
        System.out.println("Payment have to be paid: "+(H*40+M*(4/6)));
    }
}
class ElectricCars extends Vehicle
{
    public void Payment(long H,long M)
    {
        System.out.println("Payment have to be paid: "+(H*60+M));
    }
}
class TwoWheelers extends Vehicle
{
    public void Payment(long H,long M)
    {
        System.out.println("Payment have to be paid: "+(H*20+M*(2/6)));
    }
}
class Handicapped extends Vehicle
{
    public void Payment(long H,long M)
    {
        System.out.println("Payment have to be paid: "+(H*10+M*(1/6)));
    }
}
class ElectricScooters extends Vehicle
{
    public void Payment(long H,long M)
    {
        System.out.println("Payment have to be paid: "+(H*30+M*(1/2)));
    }
}

class details{                                            //Nested Class
    static class enterdetails
    {


        enterdetails(String name,String number,String carnum, String vehicleType)
        {
            System.out.println("         The Entry Ticket");
            System.out.println("Customer name: "+name);
            System.out.println("Phone Number: "+number);
            System.out.println("Vehicle Number: "+carnum);
            System.out.println("Vehicle Type: "+ vehicleType);
        }

    }
    static class exitdetails
    {


        exitdetails(String name,String number,String carnum, String vehicleTypess)
        {
            System.out.println("          The Exit Receipt");
            System.out.println("Customer Name :"+name);
            System.out.println("Phone Number: "+number);
            System.out.println("Vehicle Number: "+carnum);
            System.out.println("Vehicle Type: "+vehicleTypess);

        }


    }
}
class Payment                                     //Method Overloading
{
    Payment(double i)
    {
        System.out.println("payment is successful");
    }
    Payment(String a,String b,double j)
    {
        System.out.println("payment is successful");
    }
}

public class Finals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean o = false;
        ArrayList<String> T = new ArrayList<String>();            //ARRAY LIST TO STORE VEHICLE NUMBER AND ITS DETAILS
        ArrayList<LocalTime> K1 = new ArrayList<>();
        ArrayList<String> M = new ArrayList<>();
        ArrayList<LocalTime> K2 = new ArrayList<>();
        ArrayList<String> C = new ArrayList<>();
        ArrayList<LocalTime> K3 = new ArrayList<>();
        ArrayList<String> EC = new ArrayList<>();
        ArrayList<LocalTime> K4 = new ArrayList<>();
        ArrayList<String> TW = new ArrayList<>();
        ArrayList<LocalTime> K5 = new ArrayList<>();
        ArrayList<String> HC = new ArrayList<>();
        ArrayList<LocalTime> K6 = new ArrayList<>();
        ArrayList<String> ES = new ArrayList<>();
        ArrayList<LocalTime> K7 = new ArrayList<>();
        int TN = 0;
        while (TN <= 88) {
            System.out.println();
            System.out.println();
            System.out.println("1:Enter a vehicle");
            System.out.println("2:Vehicle exits the Parking lot");
            System.out.println("3:Payment through cash");
            System.out.println("4:Payment through card");

            int n = sc.nextInt();
            if (o == false) {
                if (n == 3) {
                    System.out.println("Enter amount");
                    double i = sc.nextDouble();
                    Payment p = new Payment(i);
                    o = true;
                }
            }
            if (n == 4) {
                System.out.println("Enter Card Holder Name");
                String r = sc.next();
                System.out.println("Enter Card Number");
                String h = sc.next();
                System.out.println("Enter amount");
                double j = sc.nextDouble();
                Payment p = new Payment(r, h, j);
                o = true;
            }

            if (n == 1) {
                String RemoveEnter = sc.nextLine();
                System.out.println("Enter Name");
                String a = sc.nextLine();
                System.out.println("Enter Phone Number");
                String b = sc.next();
                System.out.println("Enter Vehicle Number");
                String c = sc.next();
                String vehicletype;
                System.out.println("Enter Vehicle Type");
                vehicletype = sc.next();
                floors f = new floors();
                System.out.println("************************************");
                details.enterdetails d = new details.enterdetails(a, b, c, vehicletype);
                System.out.println("Time Of Entry is: " + java.time.LocalTime.now());
                System.out.println("************************************");
                TN++;

                if (vehicletype.equals("Truck")) {
                    if (T.size() <= 5) {
                        T.add(c);
                        f.truck((T.size()));
                        K1.add(java.time.LocalTime.now());
                        System.out.println("Entered Through Gate 1");
                    } else {
                        System.out.println("No vacancies for trucks");
                    }
                } else if (vehicletype.equals("MiniTruck")) {
                    if (M.size() <= 6) {
                        M.add(c);
                        K2.add(java.time.LocalTime.now());
                        f.minitrucks(M.size());
                        System.out.println("Entered Through Gate 1");
                    } else {
                        System.out.println("No vacancies for minitrucks");
                    }
                } else if (vehicletype.equals("Cars")) {
                    if (C.size() <= 21) {
                        C.add(c);
                        K3.add(java.time.LocalTime.now());
                        f.cars(C.size());
                        System.out.println("Entered Through Gate 2");
                    } else {
                        System.out.println("No vacancies for cars");
                    }
                } else if (vehicletype.equals("ELectricCars")) {
                    if (EC.size() <= 10) {
                        EC.add(c);
                        f.electricars(EC.size());
                        K4.add(java.time.LocalTime.now());
                        System.out.println("Entered Through Gate 2");
                    } else {
                        System.out.println("No vacancies for electric cars");
                    }

                } else if (vehicletype.equals("TwoWheeler")) {
                    if (TW.size() <= 33) {
                        TW.add(c);
                        f.twowheelers(TW.size());
                        K5.add(java.time.LocalTime.now());
                        System.out.println("Entered Through Gate 2");
                    } else {
                        System.out.println("No vacancies for Two-wheelers");
                    }
                } else if (vehicletype.equals("Handicapped")) {
                    if (HC.size() <= 5) {
                        HC.add(c);
                        f.Handicapped(HC.size());
                        K6.add(java.time.LocalTime.now());
                        System.out.println("Entered Through Gate 2");
                    } else {
                        System.out.println("No vacancies for handicapped vehicles");
                    }
                } else if (vehicletype.equals("Electricscooter")) {
                    if (ES.size() <= 8) {
                        ES.add(c);
                        K7.add(java.time.LocalTime.now());
                        f.ElectricScooter(ES.size());
                        System.out.println("Entered Through Gate 2");
                    }
                    else
                    {
                        System.out.println("No vacancies for electric-scooters");
                    }
                }
            }
            else if (n == 2) {
                String RemovesEnter = sc.nextLine();
                System.out.println("Enter Name");
                String e = sc.nextLine();
                System.out.println("Enter Phone Number");
                String f = sc.next();
                System.out.println("Enter Vehicle Number");
                String g = sc.next();
                String vehicleType;
                System.out.println("Enter Vehicle Type");
                vehicleType = sc.next();
                System.out.println("************************************");
                details.exitdetails m = new details.exitdetails(e, f, g, vehicleType);
                System.out.println("Time of Exit is: " + java.time.LocalTime.now());
                LocalTime x = java.time.LocalTime.now();
                TN--;

                if (vehicleType.equals("Truck")) {
                    int j = T.indexOf(g);
                    T.remove(j);
                    LocalTime u = K1.get(j);
                    long hrs = ChronoUnit.HOURS.between(u, x);
                    long min = ChronoUnit.MINUTES.between(u, x) % 60;
                    Truck tr=new Truck();
                    tr.Payment(hrs,min);
                    System.out.println("************************************");
                    System.out.println("Exited through Gate: 3");

                } else if (vehicleType.equals("MiniTruck")) {

                    int j = M.indexOf(g);
                    M.remove(j);
                    LocalTime u = K2.get(j);
                    long hrs = ChronoUnit.HOURS.between(u, x);
                    long min = ChronoUnit.MINUTES.between(u, x) % 60;
                    MT mt=new MT();
                    mt.Payment(hrs,min);
                    System.out.println("************************************");
                    System.out.println("Exited through Gate: 3");
                } else if (vehicleType.equals("Cars")) {

                    int j = C.indexOf(g);
                    C.remove(j);
                    LocalTime u = K3.get(j);
                    long hrs = ChronoUnit.HOURS.between(u, x);
                    long min = ChronoUnit.MINUTES.between(u, x) % 60;
                    Cars cc=new Cars();
                    cc.Payment(hrs,min);
                    System.out.println("************************************");
                    System.out.println("Exited through Gate: 4");
                } else if (vehicleType.equals("ElectricCars")) {

                    int j = EC.indexOf(g);
                    EC.remove(j);
                    LocalTime u = K4.get(j);
                    long hrs = ChronoUnit.HOURS.between(u, x);
                    long min = ChronoUnit.MINUTES.between(u, x) % 60;
                    ElectricCars ec=new ElectricCars();
                    ec.Payment(hrs,min);
                    System.out.println("************************************");
                    System.out.println("Exited through Gate: 4");
                } else if (vehicleType.equals("TwoWheeler")) {

                    int j = TW.indexOf(g);
                    TW.remove(j);
                    LocalTime u = K5.get(j);
                    long hrs = ChronoUnit.HOURS.between(u, x);
                    long min = ChronoUnit.MINUTES.between(u, x) % 60;
                    TwoWheelers tw=new TwoWheelers();
                    tw.Payment(hrs,min);
                    System.out.println("************************************");
                    System.out.println("Exited through Gate: 4");

                } else if (vehicleType.equals("Handicapped")) {

                    int j = HC.indexOf(g);
                    HC.remove(j);
                    LocalTime u = K6.get(j);
                    long hrs = ChronoUnit.HOURS.between(u, x);
                    long min = ChronoUnit.MINUTES.between(u, x) % 60;
                    Handicapped hc=new Handicapped();
                    hc.Payment(hrs,min);
                    System.out.println("************************************");
                    System.out.println("Exited through Gate: 4");
                } else if (vehicleType.equals("Electricscooter")) {

                    int j = ES.indexOf(g);
                    ES.remove(j);
                    LocalTime u = K7.get(j);
                    long hrs = ChronoUnit.HOURS.between(u, x);
                    long min = ChronoUnit.MINUTES.between(u, x) % 60;
                    ElectricScooters es=new ElectricScooters();
                    es.Payment(hrs,min);
                    System.out.println("************************************");
                    System.out.println("Exited through Gate: 4");
                }
            }
        }
        if(TN>88){
            System.out.println("Parking Lot Is Full");
        }
    }
}