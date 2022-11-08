class OneBHK{
     double  hall_area;
     double room_area,price;
    OneBHK(){
        hall_area=0;
        room_area=0;
        price=0;

    }
    OneBHK(double room_area,double hall_area,double price){
        this.room_area=room_area;
        this.hall_area=hall_area;
        this.price=price;
    }
    void show(){
        System.out.println("room area is "+room_area+"\n"+"hall area is "+hall_area+"\n"+"price is "+price);
    }
}
class TwoBHK extends OneBHK{
    double room2area;
    TwoBHK(){
        super();

        room2area=0;
    }
    TwoBHK(double room_area,double hall_area,double price,double room2area){
        super(room_area,hall_area,price);
        this.room2area=room2area;

    }
    void show(){
        super.show();
        System.out.println("room 2 area is"+room2area);
    }

}
class FlatDetails{
    public static void main(String[] a){
        TwoBHK t1=new TwoBHK(5,5,500,15);
        TwoBHK t2=new TwoBHK(10,10,1000,18);
        TwoBHK t3=new TwoBHK(15,15,1500,20);
        t1.show();
        t2.show();
        t3.show();
        double p=t1.price+ t2.price+ t3.price;
        System.out.println("total amount of 3 flats are"+p);
    }
}
