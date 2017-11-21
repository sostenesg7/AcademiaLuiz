package ProjetoPOO.negocios;

import ProjetoPOO.negocios.interfaces.InterfaceAvaliacao;
import ProjetoPOO.negocios.interfaces.InterfaceAluno;
import ProjetoPOO.negocios.interfaces.InterfaceFachada;
import ProjetoPOO.negocios.interfaces.InterfaceTreino;
import ProjetoPOO.negocios.interfaces.InterfaceFuncionario;
import ProjetoPOO.negocios.interfaces.InterfaceExercicio;
import ProjetoPOO.negocios.exceptions.AvaliacaoInexistenteException;
import ProjetoPOO.negocios.exceptions.FuncionarioInexistenteException;
import ProjetoPOO.negocios.exceptions.ExercicioExistenteException;
import ProjetoPOO.negocios.exceptions.TreinoExistenteException;
import ProjetoPOO.negocios.exceptions.TreinoInexistenteException;
import ProjetoPOO.negocios.exceptions.FuncionarioExistenteException;
import ProjetoPOO.negocios.exceptions.AlunoInexistenteException;
import ProjetoPOO.negocios.exceptions.AvaliacaoExistenteException;
import ProjetoPOO.negocios.exceptions.ExercicioInexistenteException;
import ProjetoPOO.negocios.exceptions.AlunoExistenteException;
import ProjetoPOO.entidades.Aluno;
import ProjetoPOO.entidades.Avaliacao;
import ProjetoPOO.entidades.Exercicio;
import ProjetoPOO.entidades.Funcionario;
import ProjetoPOO.entidades.Treino;
import ProjetoPOO.listar.ListarAluno;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FachadaImplementacao implements InterfaceFachada {

    @Autowired
    private InterfaceAluno alunos;
    @Autowired
    private InterfaceAvaliacao avaliacoes;
    @Autowired
    private InterfaceFuncionario funcionarios;
    @Autowired
    private InterfaceTreino treinos;
    @Autowired
    private InterfaceExercicio exercicios;
    
    @Override
    public void adicionarAluno(Aluno aluno) throws AlunoExistenteException {
        this.alunos.adicionarAluno(aluno);
    }

    @Override
    public void atualizarAluno(Aluno aluno) throws AlunoInexistenteException {
        this.alunos.atualizarAluno(aluno);
    }

    @Override
    public void removerAluno(long numMatricula) throws AlunoInexistenteException {
        this.alunos.removerAluno(numMatricula);
    }

    @Override
    public List<ListarAluno> listarAlunos() {
        return this.alunos.listarAlunos();
    }

    @Override
    public Aluno buscarIdAluno(long numMatricula) throws AlunoInexistenteException {

        return this.alunos.buscarIdAluno(numMatricula);
    }

    @Override
    public void adicionarAvaliacao(Avaliacao avaliacao) throws AvaliacaoExistenteException {
        this.avaliacoes.adicionarAvaliacao(avaliacao);
    }

    @Override
    public void atualizarAvaliacao(Avaliacao avaliacao) throws AvaliacaoInexistenteException {
        this.avaliacoes.atualizarAvaliacao(avaliacao);
    }

    @Override
    public void removerAvaliacao(long idAvaliacao) throws AvaliacaoInexistenteException {
        this.avaliacoes.removerAvaliacao(idAvaliacao);
    }

    @Override
    public List<Avaliacao> listarAvaliacao() {
        return this.avaliacoes.listarAvaliacao();
    }

    @Override
    public Avaliacao buscarIdAvaliacao(long idAvaliacao) throws AvaliacaoInexistenteException {
        return this.avaliacoes.buscarIdAvaliacao(idAvaliacao);
    }

    @Override
    public void adicionarFuncionario(Funcionario funcionario) throws FuncionarioExistenteException {
        this.funcionarios.adicionarFuncionario(funcionario);
    }

    @Override
    public void atualizarFuncionario(Funcionario funcionario) throws FuncionarioInexistenteException {
        this.funcionarios.atualizarFuncionario(funcionario);
    }

    @Override
    public void removerFuncionario(long numContrato) throws FuncionarioInexistenteException {
        this.funcionarios.removerFuncionario(numContrato);
    }

    @Override
    public List<Funcionario> listarFuncionario() {
        return this.funcionarios.listarFuncionario();
    }

    @Override
    public Funcionario buscarNumContratoFuncionario(long numContrato) throws FuncionarioInexistenteException {
        return this.funcionarios.buscarNumContratoFuncionario(numContrato);
    }

    @Override
    public void adicionarTreino(Treino treino) throws TreinoExistenteException {
        this.treinos.adicionarTreino(treino);
    }

    @Override
    public void atualizarTreino(Treino treino) throws TreinoInexistenteException {
        this.treinos.atualizarTreino(treino);
    }

    @Override
    public void removerTreino(long idTreino) throws TreinoInexistenteException {
        this.treinos.removerTreino(idTreino);
    }

    @Override
    public List<Treino> listarTreino() {
        return this.treinos.listarTreino();
    }

    @Override
    public Treino buscarTreinoId(long idTreino) throws TreinoInexistenteException {
        return this.treinos.buscarTreinoId(idTreino);
    }

    @Override
    public void adicionarExercicio(Exercicio exercicio) throws ExercicioExistenteException {
        this.exercicios.adicionarExercicio(exercicio);
    }

    @Override
    public void atualizarExercicio(Exercicio exercicio) throws ExercicioInexistenteException {
        this.exercicios.atualizarExercicio(exercicio);
    }

    @Override
    public void removerExercicio(long idExercicio) throws ExercicioInexistenteException {
        this.exercicios.removerExercicio(idExercicio);
    }

    @Override
    public List<Exercicio> listarExercicio() {
        return this.exercicios.listarExercicio();
    }

    @Override
    public Exercicio buscarExercicioId(long idExercicio) throws ExercicioInexistenteException {
        return this.exercicios.buscarExercicioId(idExercicio);
    }

    
}
