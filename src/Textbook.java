public class Textbook extends Book{
    private int editionNumber;

    public Textbook(String title, double price, int editionNumber) {
        super(title, price);

        this.editionNumber = editionNumber;
    }

    public int getEditionNumber() {
        return editionNumber;
    }

    @Override
    public String getBookInfo() {
        return super.getBookInfo() + "-" + editionNumber;
    }

    public boolean canSubstituteFor(Textbook other){
        if (super.getTitle().equals(other.getTitle())){
            return editionNumber >= other.getEditionNumber();
        }
        return false;
    }
}
