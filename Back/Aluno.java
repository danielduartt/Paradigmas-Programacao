package Back;
public class Aluno extends Pessoa {
    private int matricula;
    private String ctt_emergencia;

    //Construtor
    public Aluno(int matricula, String ctt_emergencia, String nome, String telefone, String data_nascimento){
        super(nome, telefone, data_nascimento);
        this.matricula = matricula;
        this.ctt_emergencia = ctt_emergencia;
    }

    //Matricula
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    //Ctt_emergencia
    public String getCtt_emergencia() {
        return ctt_emergencia;
    }

    public void setCtt_emergencia(String ctt_emergencia) {
        this.ctt_emergencia = ctt_emergencia;
    }


}
