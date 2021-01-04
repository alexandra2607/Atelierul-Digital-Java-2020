package Lab3.visitor;

public class Main {
    public static void main(String[] args) {
        Element e1 = new Book(50, "Book1");
        Element e2 = new Video("Video 1", 120);
        Element e3 = new Audio(180, "Album1", 20);

        Element[] elements = new Element [] {e1, e2, e3};
        Visitor visitor = new DurationVisitor();
        Visitor nameVisitor = new NameVisitor();
        for (Element currElem: elements) {
            currElem.accept(visitor);
            currElem.accept(nameVisitor);
        }
        System.out.println(visitor);
        System.out.println(nameVisitor);


    }
}
