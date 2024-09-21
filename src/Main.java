import java.util.Objects;

public class Author {
    private String name;
    private String lastName;

    public Author(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
    return this.name;
    }

    public String getLastName() {
        return this.lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(lastName, author.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName);
    }

    @Override
    public String toString() {
        return "Автор книги - " + getName() + " " + getLastName();
    }

}
import java.util.Objects;

public class Book {
    private String nameBooks;
    private int agePublication;
    private Author author;

    public Book(String nameBooks, Author author, int agePublication) {

        this.nameBooks = nameBooks;
        this.agePublication = agePublication;
        this.author = author;
    }

    public int getAgePublication() {
        return this.agePublication;
    }

    public String getNameBook() {
        return this.nameBooks;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setAgePublication(int agePublication) {
        this.agePublication = agePublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return agePublication == book.agePublication && Objects.equals(nameBooks, book.nameBooks) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(agePublication, nameBooks, author);
    }

    @Override
    public String toString() {
        return "Название книги - " + getNameBook() + "\n" + getAuthor() + "\nГод публикации книги - " + getAgePublication();
    }
}

public class Main {
    public static void main(String[] args) {
        printSeparator(); //Вывод разделителя

        Author harperLi = new Author("Harper", "Li");
        Book killAMockingbird = new Book("Kill a mockingbird", harperLi, 1961);
        killAMockingbird.setAgePublication(1960);

        System.out.println("Название книги - " + killAMockingbird.getNameBook() +
                "\nАвтор - " + harperLi.getName() + " " + harperLi.getLastName() +
                "\nГод публикации книги - " + killAMockingbird.getAgePublication());

        printSeparator(); //Вывод разделителя

        Author lewisCarrol = new Author("Lewis", "Carrol");
        Book aliceIsAdventuresInWonderland = new Book("Alice in Wonderland", lewisCarrol, 1865);
        aliceIsAdventuresInWonderland.setAgePublication(1864);

        System.out.println("Название книги - " + aliceIsAdventuresInWonderland.getNameBook() +
                "\nАвтор - " + lewisCarrol.getName() + " " + lewisCarrol.getLastName() +
                "\nГод публикации книги - " + aliceIsAdventuresInWonderland.getAgePublication());

        printSeparator(); //Вывод разделителя

        //Использавание метода toString
        System.out.println(new Book("Над пропастью во ржи", new Author("Джером", "Сэлинджер"), 1951));

        printSeparator(); //Вывод разделителя
        System.out.println(new Book("Мастер и Маргарита", new Author("Михаил", "Булгаков"), 1928));

        printSeparator(); //Вывод разделителя

        //Проверка на равенство
        System.out.println(harperLi.equals(lewisCarrol));
        System.out.println(killAMockingbird.equals(aliceIsAdventuresInWonderland));

        printSeparator(); //Вывод разделителя
    }
    //Создание разделителя
    public static void printSeparator() {
        System.out.println("************************************");
    }
}
