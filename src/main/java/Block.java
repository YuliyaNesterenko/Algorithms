public class Block {
    private int width;
    private int length;
    private int height;

    public Block(int[] ints) {
        width = ints[0];
        length = ints[1];
        height = ints[2];
    }
    public int getWidth(){
        return width;
    }
    public int getLength(){
        return length;
    }
    public int getHeight(){
        return height;
    }
    public int getVolume(){
        int voiume = getWidth() * getHeight() * getLength();
        return voiume;
    }
    public int getSurfaceArea(){
        int surfaseArea = 2 * (getLength() * getWidth() + getLength() * getHeight() + getWidth() * getHeight());
        return surfaseArea;
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 6};
        Block b = new Block(arr);
        System.out.println(b.getSurfaceArea());
    }
}
