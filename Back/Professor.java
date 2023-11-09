package Back;
public class Professor extends Pessoa{
    private int id_professor;
    private String endereco;
    private double salario;

    //Construtor
    public Professor(int id_professor, String endereco, double salario,String nome,
                     String telefone, String data_nascimento){

        super(nome,telefone, data_nascimento);
        this.id_professor = id_professor;
        this.endereco = endereco;
        this.salario = salario;
    }

    //Contrutor default




    //Id_professor
    public int getId_professor() {
        return id_professor;
    }

    public void setId_professor(int id_professor) {
        this.id_professor = id_professor;
    }

    //Endereço
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    //Salario
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;}
}
