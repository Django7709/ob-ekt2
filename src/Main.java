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
