//6-Um programa para pedir os seguinte dados de um país que participou de uma olimpiada:
//numero de inscriação; quantidade de medalhas de Bronze;quantidade de medalhas de prata;quantidade de medalha de ouro.
//Calcular e informar o total de pontos do refeirdo país,considerando:medalha de bronze=1;
//medalha de prata= 2 pontos; medalha de ouro= 5 pontos
package pgolimpiada;

import javax.swing.JOptionPane;

/**
 *
 * @author Diego Bizerra
 */
public class PgOlimpiada {

    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Informe seu numero de inscrição"));
        int quantbroz = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de medalha de bronze"));
        int quantpra = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de medalha de prata"));
        int quantour = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de medalha de ouro"));
        int total;
        total = (quantbroz + (quantpra * 2) + (quantour * 5));
        JOptionPane.showMessageDialog(null, "Quantidade de pontos foi " + total);

    }

}
