package mediator;

class AuthenticationDialog implements Mediator {
    private String title;
    private Checkbox loginOrRegisterChkBx;
    private Textbox loginUsername;
    private Textbox loginPassword;
    private Textbox registrationUsername;
    private Textbox registrationPassword;
    private Textbox registrationEmail;
    private Button okBtn;
    private Button cancelBtn;


    // Construtor que cria e conecta os componentes
    public AuthenticationDialog() {
        // Cria os componentes, passando 'this' (o próprio AuthenticationDialog)
        // como o Mediator.

        loginOrRegisterChkBx = new Checkbox(this);
        loginUsername = new Textbox(this);
        loginPassword = new Textbox(this);
        registrationUsername = new Textbox(this);
        registrationPassword = new Textbox(this);
        registrationEmail = new Textbox(this);
        okBtn = new Button(this);
        cancelBtn = new Button(this);

        // Você também poderia ter lógica adicional aqui, como adicionar
        // esses componentes a um painel ou janela da interface gráfica.
    }

    @Override
    public void notify(Component sender, String event) {
        if (sender == loginOrRegisterChkBx && event.equals("check")) {
            if (loginOrRegisterChkBx.isChecked()) { // Assumindo isChecked()
                title = "Log in";
                // 1. Mostrar componentes de login (lógica da UI)
                // 2. Esconder componentes de registro (lógica da UI)
            } else {
                title = "Register";
                // 1. Mostrar componentes de registro (lógica da UI)
                // 2. Esconder componentes de login (lógica da UI)
            }
        } else if (sender == okBtn && event.equals("click")) { //usar else if
            // Lógica para quando o botão OK é clicado.
             boolean found = findUser(loginUsername.getText(), loginPassword.getText());

            if (!found) {
                // Mostrar mensagem de erro (lógica da UI)
            } else {
                 // 1. Criar conta de usuário se não encontrado, com dados de registro
                // (lógica para interagir com um banco de dados, etc.)
                // 2. Logar o usuário
                // ...
            }

        }
    }
	
	
	// Método findUser (simulado - lógica real dependeria do seu sistema de autenticação)
	private boolean findUser(String username, String password) {
		//Simular busca
		// Lógica para buscar o usuário no banco de dados ou outro sistema de autenticação
		// Retornar true se encontrado, false caso contrário
        if(username.equals("teste") && password.equals("123")){
            return true;
        }
        else return false;
    }
}
