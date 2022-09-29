package labs.CompII.lab4;

public class Problem2 {
    public static void main(String[] args) {
        
    }
}

class RoomPeople {
    private int numberInRoom;
    private static int totalNumber;

    public void addOneToRoom() { numberInRoom++; totalNumber++; }
    public void removeOneFromRoom() {
        if(numberInRoom < 1 || totalNumber < 1) { return; } // can't go below 0 (might want to throw something here)
        numberInRoom--; totalNumber--;
    }
    public int getNumber() { return this.numberInRoom; }
    public static int getTotal() { return totalNumber; }
}