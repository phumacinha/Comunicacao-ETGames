/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etgames.mensagens;

/**
 *
 * @author pedro
 */
public class MensagemParaCliente extends MensagemSocket {
    private String mensagem;
    
    public MensagemParaCliente(Acao acao, String mensagem) {
        super(null, acao);
        this.mensagem = mensagem;
    }
    
    public MensagemParaCliente(Acao acao) {
        super(null, acao);
    }
    
    public MensagemParaCliente(Object remetente, Acao acao) {
        super(remetente, acao, null);
    } 
    
    public MensagemParaCliente(Acao acao, Object parametro) {
        super(null, acao, parametro);
    }  
    
    public MensagemParaCliente(Object remetente, Acao acao, Object parametro) {
        super(remetente, acao, parametro);
    }
    
    public String getMensagem() {
        return mensagem;
    }
    
    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
