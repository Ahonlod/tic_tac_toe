package Head_Class;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Logic_Tic_Tac().setVisible(true);
            }
        });
    }
}
