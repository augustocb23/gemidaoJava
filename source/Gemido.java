import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Gemido extends JDialog implements Runnable {
	private JPanel contentPane;
	private JButton buttonOK;

	public Gemido() {
		setContentPane(contentPane);
		setModal(true);
		getRootPane().setDefaultButton(buttonOK);

		buttonOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onOK();
			}
		});
	}

	private void onOK() {
		dispose();
	}

	public void run() {
		Random random = new Random();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

		Gemido dialog = new Gemido();
		dialog.pack();
		dialog.setLocation(random.nextInt(screenSize.height), random.nextInt(screenSize.width));
		dialog.setVisible(true);
	}
}
