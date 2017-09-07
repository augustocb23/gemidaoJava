import javax.swing.*;

public class Gemidao {
	public static void main(String[] args) {
		for (int i = 0; i < 150; i++) {
			Gemido gemidao = new Gemido();
			Thread gemido = new Thread(gemidao);
			gemido.start();
		}
		JOptionPane.showMessageDialog(null, "Você caiu no Gemidão do Java", "Parabéns!!!",
				JOptionPane.INFORMATION_MESSAGE
		);
	}
}
