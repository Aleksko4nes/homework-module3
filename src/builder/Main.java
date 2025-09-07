package builder;

public class Main {
    public static void main(String[] args) {
        Book book = new Book.Builder("0-12-345678-9", "Moby-Dick")
                .genre("genre")
                .author("author")
                .published(12312)
                .description("description")
                .build();
        System.out.println(book);
    }
}
