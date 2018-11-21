import java.awt.*;

public class TheWindowIPrint {
    String colour;
    int size;
    String material;

    // Treść zadania pierwszego nie była dla mnie zbyt jasna, więc pomyślałam, że chodzi może o metodę "toString" :)

    public TheWindowIPrint(String colour, int size, String material) {
        this.colour = colour;
        this.size = size;
        this.material = material;
    }

    public String getColour() {
        return colour;
    }

    public int getSize() {
        return size;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return "TheWindowIPrint{" +
                "colour='" + colour + '\'' +
                ", size=" + size +
                ", material='" + material + '\'' +
                '}';
    }

    public static void main(String args[]) {
        TheWindowIPrint window = new TheWindowIPrint("pink", 5, "metal");
        System.out.print(window);
    }
}
