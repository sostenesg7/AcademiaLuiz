package ProjetoPOO.negocios.interfaces;

import ProjetoPOO.negocios.exceptions.TreinoExistenteException;
import ProjetoPOO.negocios.exceptions.TreinoInexistenteException;
import ProjetoPOO.entidades.Treino;
import java.util.List;


public interface InterfaceTreino {
    
    public void adicionarTreino(Treino treino) throws TreinoExistenteException;

    public void atualizarTreino(Treino treino) throws TreinoInexistenteException;

    public void removerTreino(long idTreino) throws TreinoInexistenteException;

    public List<Treino> listarTreino();

    public Treino buscarTreinoId(long idTreino) throws TreinoInexistenteException;
}
