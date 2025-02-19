public class Punto<E> {
    private E x;
    private E y;

    public Punto(E x, E y) {
        this.x = x;
        this.y = y;
    }

    public E getX() {
        return x;
    }

    public E getY() {
        return y;
    }

    public void setX(E x) {
        this.x = x;
    }

    public void setY(E y) {
        this.y = y;
    }

    public static void main(String[] args) {
        Punto<Integer> punto = new Punto<Integer>(4, 5);
        Punto<Double> punto2 = new Punto<Double>(2.5, 2.75);
        System.out.println("x = " + punto.getX() + "," + punto.getY());
        System.out.println("x = " + punto2.getX() + "," + punto2.getY());
    }
}
