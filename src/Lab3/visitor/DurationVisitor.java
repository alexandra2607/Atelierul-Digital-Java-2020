package Lab3.visitor;

public class DurationVisitor implements Visitor {
    private int totalDuration = 0;

    @Override
    public void visit(Book book) {
        totalDuration += book.getNumberOfPages() * 5;
    }

    public void visit (Video video) {
        totalDuration += video.getTime() + video.getTime()/30 *5;
    }

    public void visit(Audio audio) {
        totalDuration += audio.getTime() + audio.numberOfSongs * 0.3;
    }

    public String toString() {
        return "The visited elemnts have a total duration of " + totalDuration + " min";
    }
}
