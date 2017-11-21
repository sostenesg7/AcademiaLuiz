package ProjetoPOO.negocios.interfaces;

import ProjetoPOO.negocios.exceptions.AvaliacaoInexistenteException;
import ProjetoPOO.negocios.exceptions.AvaliacaoExistenteException;
import ProjetoPOO.entidades.Avaliacao;
import java.util.List;

public interface InterfaceAvaliacao {

    public void adicionarAvaliacao(Avaliacao avaliacao) throws AvaliacaoExistenteException;

    public void atualizarAvaliacao(Avaliacao avaliacao) throws AvaliacaoInexistenteException;

    public void removerAvaliacao(long idAvaliacao) throws AvaliacaoInexistenteException;

    public List<Avaliacao> listarAvaliacao();

    public Avaliacao buscarIdAvaliacao(long idAvaliacao) throws AvaliacaoInexistenteException;

}
