package cetvrti;

public class Vektor implements Comparable<Vektor>{
    private int x, y, z;

    public Vektor(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }

    @Override
    public int compareTo(Vektor o) {
        if(this.x == o.x && this.y == o.y && this.z == o.z){
            return 0;
        }
        else {
            return 1;
        }
    }
}
