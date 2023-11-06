public class Login {

    public static void main(String[] args) {
        
        Credenciais credenciais = new Credenciais();

        PaginaLogin paginaLogin = new PaginaLogin(credenciais.getLoginInfo());

    }

}