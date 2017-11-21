package ProjetoPOO.negocios.interfaces;

import ProjetoPOO.negocios.exceptions.FuncionarioInexistenteException;
import ProjetoPOO.negocios.exceptions.FuncionarioExistenteException;
import ProjetoPOO.entidades.Funcionario;
import java.util.List;

public interface InterfaceFuncionario {

    public void adicionarFuncionario(Funcionario funcionario) throws FuncionarioExistenteException;

    public void atualizarFuncionario(Funcionario funcionario) throws FuncionarioInexistenteException;

    public void removerFuncionario(long numContrato) throws FuncionarioInexistenteException;

    public List<Funcionario> listarFuncionario();

    public Funcionario buscarNumContratoFuncionario(long numContrato) throws FuncionarioInexistenteException;
}
