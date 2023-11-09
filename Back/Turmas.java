package Back;
import java.util.ArrayList;

public class Turmas {


    private Professor prof;
    private int id_turma;
    private String modalidade;
    private String horario;
    private String dia_semana;

    private int total_alunos;


    public Turmas(Professor prof, int id_turma, String modalidade, String horario,
                  String dia_semana, int total_alunos){
        this.prof = prof;
        this.id_turma = id_turma;
        this.modalidade = modalidade;
        this.horario = horario;
        this.dia_semana = dia_semana;
        this.total_alunos = total_alunos;
    }
    //Prof
    public Professor getProf() {
        return prof;
    }

    public void setProf(Professor prof) {
        this.prof = prof;
    }

    //Turma
    public int getId_turma() {
        return id_turma;
    }

    public void setId_turma(int id_turma) {
        this.id_turma = id_turma;
    }

    //Modalidade
    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    //Horario
    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    //Dia_semana
    public String getDia_semana() {
        return dia_semana;
    }

    public void setDia_semana(String dia_semana) {
        this.dia_semana = dia_semana;
    }

    //Total_alunos
    public int getTotal_alunos() {
        return total_alunos;
    }

    public void setTotal_alunos(int total_alunos) {
        this.total_alunos = total_alunos;
    }



}
