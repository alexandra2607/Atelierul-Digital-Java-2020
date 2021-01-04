package Lab3.visitor;

public class NameVisitor implements Visitor{
    private String name = "";
    public void visit(Book book) {
        name += book.getName() + " book, ";
    }

    @Override
    public void visit(Video video) {
        name += video.getName() + " video, ";
    }

    @Override
    public void visit(Audio audio) {
        name += audio.getName() + " audio, ";
    }

    public String getName() {
        return name;
    }
}
