abstract class Printer{
    protected String model;
    protected int printedCount;
    protected int availableCount;

    Printer(String a, int b){
        model = a;
        availableCount = b;
    }

    public abstract boolean print();
}

class InkjetPrinter extends Printer {

    InkjetPrinter(String a, int b) {
        super(a, b);
    }

    @Override
    public boolean print() {
        if (availableCount == 0) {
            System.out.println(model + ": " + (printedCount+1) + "매째 인쇄 실패 - 잉크 부족.");
            return false;
        } else if (availableCount >= 1) {
            printedCount++;
            availableCount--;
            return true;
        } else {
            return false;
        }

    }
}

class LaserPrinter extends Printer{

    LaserPrinter(String a, int b){
        super(a, b);
    }

    @Override
    public boolean print() {
        if (availableCount == 0) {
            System.out.println(model + ": " + (printedCount+1) + "매째 인쇄 실패 - 토너 부족.");
            return false;
        } else if (availableCount >= 1) {
            printedCount++;
            availableCount--;
            return true;
        } else {
            return false;
        }

    }


}



public class Homework7 {
    public static void main(String[] args) {
        InkjetPrinter inkjet = new InkjetPrinter("Brother DCP-T730DW", 7500);
        LaserPrinter laser = new LaserPrinter("Canon MFC643Cdw", 1500);
        while (inkjet.print());
        while (laser.print());
    }
}
