import java.awt.Dimension;
import java.awt.Toolkit;

public class main {
    public static void main(String[] args) {
        // Obter a referência para o Toolkit padrão do sistema
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        // Obter a dimensão da tela
        Dimension screenSize = toolkit.getScreenSize();

        // Obter a largura e altura da resolução da tela
        int screenWidth = (int) screenSize.getWidth();
        int screenHeight = (int) screenSize.getHeight();

        // Exibir a resolução da tela
        System.out.println("Resolução da tela: " + screenWidth + "x" + screenHeight);
    }
}