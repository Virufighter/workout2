import java.util.Scanner;

class Tile{
    int edge;
    int area;
    Tile(int edge){
        this.edge=edge;
        this.area=edge*edge;
    }
    int t_area(){
        return area;
    }
}
class Floor{
    int length;
    int width;
    Floor(int l,int b){
        this.length=l;
        this.width=b;
    }
    void totalTiles(Tile t){
        int tileArea=t.t_area();
        int floorArea=length*width;
        int noOfTiles=floorArea/tileArea;
        System.out.println("Number of tiles required is"+noOfTiles);
    }
}
class TileClass{
    public static void main(String[] a){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of Tile: ");
        Tile t=new Tile(sc.nextInt());
        System.out.println("Enter the length and width of Floor: ");
        Floor f=new Floor(sc.nextInt(), sc.nextInt());
        f.totalTiles(t);
    }
}