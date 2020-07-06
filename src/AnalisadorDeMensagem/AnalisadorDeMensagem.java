/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalisadorDeMensagem;

import MensagemSocket.MensagemParaServidor;

/**
 *
 * @author pedro
 */
public interface AnalisadorDeMensagem {
    public void trataMensagem(MensagemParaServidor mensagem);
}
