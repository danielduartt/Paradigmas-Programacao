package Back;
public abstract class Pessoa {
    private String nome;
    private String telefone;
    private String data_nascimento;

    //Construtor
    public Pessoa(String nome, String telefone, String data_nascimento){
        this.nome = nome;
        this.telefone = telefone;
        this.data_nascimento = data_nascimento;
    }

    //Nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //Telefone
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    //Data_nascimento
    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }




}
