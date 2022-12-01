public class Main {
    public static void main(String[] args) {

        // membuat objek Shape dari class Rectangle
        Shape rect = new Rectangle(100, 200);

        // membuat objek Shape dari class Circle
        Shape circ = new Circle(50);

        // membuat objek Shape dari class Triangle
        Shape tri = new Triangle(0.5, 50, 20);

        /* memanggil method draw */
        System.out.println("======= Drawing Bangun Datar =======");
        rect.draw();
        circ.draw();
        tri.draw();
        System.out.println("====================================");
        System.out.println("=== Menghitung Luas Bangun Datar ===");
        System.out.println("====================================");
        System.out.println("Luas Persegi: " + rect.getAreas());
        System.out.println("Luas Lingkaran: " + circ.getAreas());
        System.out.println("Luas Segitiga :" + tri.getAreas());
        System.out.println("====================================");
    }
}