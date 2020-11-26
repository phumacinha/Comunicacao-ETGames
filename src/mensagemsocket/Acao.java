/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mensagemsocket;

/**
 *
 * @author pedro
 */
public enum Acao {
   // Comandos para o servidor
   BROADCAST,
   BROADCAST_X,
   MENSAGEM_COM_DESTINATARIO,
   PROCURANDO_SALA,
   BROADCAST_SALA, 
   BROADCAST_X_SALA,
   JOGADA,
   ABANDONO,
   
   // Comandos para o jogador
   CONECTADO,
   SALA_ENCONTRADA,
   SET_ID,
   NOVO_TURNO,
   
   JOGADA_INVALIDA
}
