package etgames.mensagens;

import java.io.Serializable;
import java.util.HashMap;

/**
 *
 * @author pedro
 */
public class MensagemSocket implements Serializable {
    private Acao acao;
    private Object remetente;
    private Object parametro;
    
    public MensagemSocket(Object remetente, Acao acao) {
        inicializarMensagem(remetente, acao, null);
    }
    
    public MensagemSocket(Object remetente, Acao acao, Object parametro) {
        inicializarMensagem(remetente, acao, parametro);
    }
    
    private void inicializarMensagem (Object remetente, Acao acao, Object parametro) {
        this.acao = acao;
        this.remetente = remetente;
        this.parametro = parametro;
    }
    
    public void setRemetente(Object remetente) {
        this.remetente = remetente;
    }
    
    public Acao getAcao() {
        return acao;
    }
    
    public Object getRemetente() {
        return remetente;
    }
    
    public Object getParametro() {
        return parametro;
    }
    
    public Object getParametro(String chave) {
        if (parametro instanceof HashMap) {
            return ((HashMap<String, Object>) parametro).get(chave);
        }
        return null;
    }
    
    public void setParametro(Object parametro) {
        this.parametro = parametro;
    }
    
    public void setParametro(String chave, Object parametro) {
        if (parametro instanceof HashMap || parametro == null) {
            if (parametro == null) parametro = new HashMap<String, Object>();
            
            if (((HashMap<String, Object>) parametro).containsKey("chave"))
                ((HashMap<String, Object>) parametro).replace(chave, parametro);
            else ((HashMap<String, Object>) parametro).put(chave, parametro);
        }
    }
    
    @Override
    public String toString() {
        return "Mensagem do tipo: "+getAcao()+" | "
                + "Remetente: " +remetente +" | "
                + "Param: "+parametro;
    }
}
