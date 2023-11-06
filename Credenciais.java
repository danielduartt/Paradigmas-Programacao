import java.util.HashMap;

public class Credenciais {

    HashMap<String,String> logininfo = new HashMap<String, String>(); // Armazena valores de pares de chaves

    public Credenciais(){
        logininfo.put("admin", "admin");
    }

    protected HashMap getLoginInfo(){
        return logininfo;
    }

}