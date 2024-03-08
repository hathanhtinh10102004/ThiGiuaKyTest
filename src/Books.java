import java.awt.print.Book;

public class Books {
    private String title;
    private String author;
    private String publisher;

    public Books(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    public Books() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }

    public String getInfo() {
        return "Tiêu đề: " + title + "\n" +
                "Tác giả: " + author + "\n" +
                "Nhà xuất bản: " + publisher;
    }

    public class FictionBook extends Books {

        private String genre;

        public FictionBook(String title, String author, String publisher, String genre) {
            super(title, author, publisher);
            this.genre = genre;
        }

        public String getGenre() {
            return genre;
        }

        public void setGenre(String genre) {
            this.genre = genre;
        }

        @Override
        public String toString() {
            return "FictionBook{" +
                    "genre='" + genre + '\'' +
                    '}';
        }
    }
}

class FictionBook extends Books {

    private String genre;

    public FictionBook(String title, String author, String publisher, String genre) {
        super(title, author, publisher);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "FictionBook{" +
                "genre='" + genre + '\'' +
                '}';
    }
}

class NonFictionBook extends Books {

    private String subject;

    public NonFictionBook(String title, String author, String publisher, String subject) {
        super(title, author, publisher);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "NonFictionBook{" +
                "subject='" + subject + '\'' +
                '}';
    }
}

class ScienceBook extends NonFictionBook {

    private String scienceField;

    public ScienceBook(String title, String author, String publisher, String subject, String scienceField) {
        super(title, author, publisher, subject);
        this.scienceField = scienceField;
    }

    public String scienceField() {
        return scienceField;
    }

    public void scienceField(String scienceField) {
        this.scienceField = scienceField;
    }

    @Override
    public String toString() {
        return "ScienceBook{" +
                "scienceField='" + scienceField + '\'' +
                '}';
    }
}

class Mains {
    public static void main(String[] args) {
        Books book = new Books("com ao gao tien", "ha thanh tinh", "manh");
        System.out.println(book.getInfo());

        FictionBook fictionBook = new FictionBook("song la chinh mnh", "ha thanh tinh", "manh", "hh");
        System.out.println(fictionBook.getInfo());

        NonFictionBook nonFictionBook = new NonFictionBook("la anh", "ha thanh tinh", "hihi", "hhh");
        System.out.println(nonFictionBook.getInfo());

        ScienceBook scienceBook = new ScienceBook("cach lam vc", "ha thanh tinh", "kaka", "cmvbnm", "gfdxz");
        System.out.println(scienceBook.getInfo());
    }
}
