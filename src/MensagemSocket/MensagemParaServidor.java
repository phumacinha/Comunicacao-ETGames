/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MensagemSocket;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pedro
 */
public class MensagemParaServidor extends MensagemSocket {
    private List destinatarios;
    
    public MensagemParaServidor (Acao acao) {
        super(null, acao);
        destinatarios = new ArrayList<>();
    }
    
    public MensagemParaServidor (Acao acao, Object parametros) {
        super(null, acao, parametros);
        destinatarios = new ArrayList<>();
    }
    
    public MensagemParaServidor (Object remetente, Acao acao) {
        super(remetente, acao);
        destinatarios = new ArrayList<>();
    }
    
    public MensagemParaServidor (Object remetente, Acao acao, ArrayList<Object> destinatarios, MensagemParaCliente mensagem) {
        super(null, acao, mensagem);
        this.destinatarios = destinatarios;        
    }
    
    public List getDestinatarios () {
        return destinatarios;
    }
    
    public void setDestinatarios (ArrayList<Object> destinatarios) {
        this.destinatarios = destinatarios;
    }
    
    public void insereDestinatario (Object destinatario) {
        destinatarios.add(destinatario);
    }
    
    public final void setMensagemParaCliente(MensagemParaCliente mensagem) {
        setParametro(mensagem);
    }
    
    public final MensagemParaCliente getMensagemParaCliente() {
        return (getParametro() instanceof MensagemParaCliente) ? (MensagemParaCliente) getParametro() : null;
    }
}
