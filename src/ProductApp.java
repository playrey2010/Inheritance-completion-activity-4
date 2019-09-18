public class ProductApp {
    public static void main(String[] args) {
        // instantiate Products
        Product p = new Product();
        p.setCode("381043jgsh38");
        p.setDescription("a cheap car");
        p.setPrice(5000);
        //creating a new product with same values for its members to test the overriden equals()
        Product p1 = new Product();
        p1.setCode("381043jgsh38");
        p1.setDescription("a cheap car");
        p1.setPrice(5000);

        System.out.println("The overriden equals() method uses the overriden toString() to compare both objects. ");
        System.out.println("p.toString() yields: \n" + p.toString());
        System.out.println("p1.toString() yields: \n" + p1.toString());
        // trying the overriden equals method for Product class
        System.out.println("Comparing p to p1: " + p.equals(p1));

        // Instantiate books
        Book b = new Book();
        b.setCode("813u4hf84t");
        b.setAuthor("Homer");
        b.setPrice(9.99);
        b.setDescription("The Iliad");

        Book b1 = new Book();
        b1.setCode("813u4hf84t");
        b1.setAuthor("Homer");
        b1.setPrice(9.99);
        b1.setDescription("The Odyssey");

        Book b2 = new Book();
        b2.setCode("813u4hf84t");
        b2.setAuthor("Homer");
        b2.setPrice(9.99);
        b2.setDescription("The Iliad");
        System.out.println("b.toString() yields: \n" + b.toString() + "\n");
        System.out.println("b1.toString() yields: \n" + b1.toString()+ "\n");
        System.out.println("b2.toString() yields: \n" + b2.toString()+ "\n");
        // trying the overriden equals method for book class
        System.out.println("Comparing b to b1: " + b.equals(b1));
        System.out.println("Comparing b to b2: " + b.equals(b2));

        // Instantiate softwares
        Software s = new Software();
        s.setCode("randcodetest");
        s.setDescription("Smart application");
        s.setPrice(1000.49);
        s.setOs("Windows");
        s.setProgrammer("Bill");

        Software s1 = new Software();
        s1.setCode("randcodetest");
        s1.setDescription("Dumb application");
        s1.setPrice(1000.49);
        s1.setOs("Windows");
        s1.setProgrammer("Jeff");
        System.out.println("s.toString() yields: \n" + s.toString());
        System.out.println("s1.toString() yields: \n" + s1.toString());
        System.out.println("Comparing s to s1: " + s.equals(s1));

        // using the static method
        System.out.println("You created " + Product.getCount() + " products!");


//        System.out.println(b.toString());
//        System.out.println(b2.toString());

    }
}
