public class ProductApp {
    public static void main(String[] args) {
        Product p = new Product();
        p.setCode("381043jgsh38");
        p.setDescription("a cheap car");
        p.setPrice(5000);

        System.out.println(p.toString());

        Book b = new Book();
        b.setCode("813u4hf84t");
        b.setAuthor("Homer");
        b.setPrice(9.99);
        b.setDescription("The Iliad");
        System.out.println(b.toString());

        Software s = new Software();
        s.setCode("randcodetest");
        s.setDescription("Smart application");
        s.setPrice(1000.49);
        s.setOs("Windows");
        s.setProgrammer("Bill");
        System.out.println(s.toString());

        System.out.println("You created " + Product.getCount() + " products!");


    }
}
