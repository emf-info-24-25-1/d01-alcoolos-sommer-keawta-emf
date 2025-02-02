package app;

public class Application {
        public static void main(String[] args) {
                Ami ami01 = new Ami("Maxime", 2);
                Ami ami02 = new Ami("Valentin", 5);
                Ami ami03 = new Ami("Logan", 10);

                ami01.montreAmi();
                ami02.montreAmi();
                ami03.montreAmi();

                ami01.boitUneBiere();
                ami01.boitUneBiere();
                ami01.boitUneBiere();

        }
}
