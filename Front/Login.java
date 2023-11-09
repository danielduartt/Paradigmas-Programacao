import Back.Gerenciador;
import Back.Professor;

public class Login {

    
    public static void main(String[] args) {

        Gerenciador gerenciador = new Gerenciador();

        Credenciais credenciais = new Credenciais();
        PaginaLogin paginaLogin = new PaginaLogin(credenciais.getLoginInfo() , gerenciador);
    }

}
