import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Obtém o idioma padrão do sistema
        Locale defaultLocale = Locale.getDefault();

        // Obtém o nome do idioma em exibição
        String language = defaultLocale.getDisplayLanguage();

        System.out.println("Idioma do sistema: " + language);
    }
}