import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginCadastroTela extends JFrame implements ActionListener {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton cadastrarButton;

    public LoginCadastroTela() {
        setTitle("Tela de Login e Cadastro");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(300, 200);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2, 10, 10));

        JLabel usernameLabel = new JLabel("Usuário:");
        panel.add(usernameLabel);

        usernameField = new JTextField();
        panel.add(usernameField);

        JLabel passwordLabel = new JLabel("Senha:");
        panel.add(passwordLabel);

        passwordField = new JPasswordField();
        panel.add(passwordField);

        loginButton = new JButton("Login");
        loginButton.addActionListener(this);
        panel.add(loginButton);

        cadastrarButton = new JButton("Cadastrar");
        cadastrarButton.addActionListener(this);
        panel.add(cadastrarButton);

        add(panel);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            // Lógica para verificar o login

            // Exemplo simples de verificação de login
            if (username.equals("usuario") && password.equals("senha")) {
                JOptionPane.showMessageDialog(this, "Login bem-sucedido!");
            } else {
                JOptionPane.showMessageDialog(this, "Usuário ou senha inválidos!");
            }
        } else if (e.getSource() == cadastrarButton) {
            JOptionPane.showMessageDialog(this, "Funcionalidade de cadastro em desenvolvimento.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                LoginCadastroTela tela = new LoginCadastroTela();
                tela.setVisible(true);
            }
        });
    }
}
