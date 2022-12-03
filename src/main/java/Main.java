public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        // заполните другие поля
        post.passport = "4444N 4444444444";
        post.lastName = "Иванович";
        post.phone = "+7999-999-99-99";
        post.surname = "Иванов";
        post.subscription = true;
        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 5;
        post.birthday.year = 1999;
        // заполните другие поля даты рождения
    }
}