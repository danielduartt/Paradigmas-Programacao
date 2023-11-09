package Back;
import java.util.ArrayList;

public class Gerenciador {
    ArrayList<Aluno> Alunos_Cadastrados;
    ArrayList<Professor> Professores_Cadastrados;
    ArrayList<Turmas> Turmas_Cadastradas;

    public Gerenciador(){
        this.Alunos_Cadastrados = new ArrayList<>();
        this.Professores_Cadastrados = new ArrayList<>();
        this.Turmas_Cadastradas = new ArrayList<>();
    }

    public void AdicionarAluno(Aluno aluno){
        this.Alunos_Cadastrados.add(aluno);
    }
    public void RemoverAluno(int matricula){
        for (int i = 0; i < Alunos_Cadastrados.size(); i++){
            if( matricula == Alunos_Cadastrados.get(i).getMatricula()){
                Alunos_Cadastrados.remove(i);
            }
        }
    }
    public void AlterarDadoAluno(Aluno new_aluno){
        for (Aluno aluno: Alunos_Cadastrados){
            if(aluno.getMatricula() == new_aluno.getMatricula()){

                aluno.setNome(new_aluno.getNome());
                aluno.setCtt_emergencia(new_aluno.getCtt_emergencia());
                aluno.setData_nascimento(new_aluno.getData_nascimento());
                aluno.setTelefone(new_aluno.getTelefone());
                break;
            }
        }
    }

    //Turmas
    public void AdicionarTurma(Turmas turma){
        this.Turmas_Cadastradas.add(turma);
    }
    public void RemoverTurma(int id_turma){
        for (int i = 0; i < Turmas_Cadastradas.size(); i++){
            if( id_turma == Turmas_Cadastradas.get(i).getId_turma()){
                Turmas_Cadastradas.remove(i);
            }
        }
    }
    public void AlterarDadoTurma(Turmas new_turma){
        for (Turmas turma: Turmas_Cadastradas){
            if(turma.getId_turma() == new_turma.getId_turma()){

                turma.setModalidade(new_turma.getModalidade());
                turma.setHorario(new_turma.getHorario());
                turma.setDia_semana(new_turma.getDia_semana());
                turma.setTotal_alunos(new_turma.getTotal_alunos());
                break;
            }
        }
    }

    //Professor
    public void AdicionarProfessor(Professor prof){
        this.Professores_Cadastrados.add(prof);
    }

    public void RemoverProfessor(int id_professor){
        for (int i = 0; i < Professores_Cadastrados.size(); i++){
            if( id_professor == Professores_Cadastrados.get(i).getId_professor()){
                Professores_Cadastrados.remove(i);
            }
        }
    }

    public void AlterarDadoProfessor(Professor new_prof){
        for (Professor prof: Professores_Cadastrados){
            if(prof.getId_professor() == new_prof.getId_professor()){

                prof.setNome(new_prof.getNome());
                prof.setEndereco(new_prof.getEndereco());
                prof.setSalario(new_prof.getSalario());
                prof.setData_nascimento(new_prof.getData_nascimento());
                prof.setTelefone(new_prof.getTelefone());
                break;
            }
        }
    }

    //Buscar Aluno
    public Aluno BuscarAluno(int matricula){
        for (int i = 0; i < Alunos_Cadastrados.size(); i++){
            if(matricula == Alunos_Cadastrados.get(i).getMatricula()){
                return Alunos_Cadastrados.get(i);
            }
        }
        return null;
    }
    //Buscar Professor
    public Professor BuscarProfessor(int id_professor){
        for (int i = 0; i < Professores_Cadastrados.size(); i++){
            if(id_professor == Professores_Cadastrados.get(i).getId_professor()){
                return Professores_Cadastrados.get(i);
            }
        }
        return null;
    }

    public ArrayList<Professor> getProfessoresCadastrados(){
        return this.Professores_Cadastrados;
    }

    public ArrayList<Aluno> getAlunosCadastrados(){
        return this.Alunos_Cadastrados;
    }

    public ArrayList<Turmas> getTurmasCadastradas(){
        return this.Turmas_Cadastradas;
    }



}
