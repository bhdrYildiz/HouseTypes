package Entity;

public class Home {
    private double price;
    private int square;
    private int rooms;
    private int numberOfHalls;
    public Home(double price,int square,int rooms,int numberOfHalls){
        this.price = price;
        this.square = square;
        this.rooms = rooms;
        this.numberOfHalls = numberOfHalls;
    }

    public Home(Villa villa) {
        
    }

    public Home(House house) {
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getSquare() {
        return square;
    }
    public void setSquare(int square) {
        this.square = square;
    }
    public int getRooms() {
        return rooms;
    }
    public void setRooms(int rooms) {
        this.rooms = rooms;
    }
    public int getNumberOfHalls() {
        return numberOfHalls;
    }
    public void setNumberOfHalls(int numberOfHalls) {
        this.numberOfHalls = numberOfHalls;
    }
}
