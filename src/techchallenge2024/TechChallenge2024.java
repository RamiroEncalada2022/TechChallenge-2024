
package techchallenge2024;

public class TechChallenge2024 {

    public static void main(String[] args) {

        String s1 = "Y¡,xxshnvfmnvnej kuwhitrtwzt zt!sfw fAl tehitwz xiknuzvx qx gjtrzn hhtmqn gj fe gJgtbhtyinkh jw kF,xnl gzf jffm nwtsz xi hqx trx klxxigf flxhnu xi bIqtybl tA.xxn hS jm qhljwno xi nxwbg xxjm kutrtwzt tvtf hxgtbhnq sx ej tytbwtqnrk tutw nvj zixtix tukfinvnmw jw tq xg.th";

        String s2 = "";

        for (int i = s1.length() - 1; i >= 0; i--) {

            s2 = s2 + s1.charAt(i);
        }

        System.out.print("EL TEXTO ORIGINAL ES: ");

        System.out.println("       ");

        System.out.println(s1);

        System.out.println("       ");

        System.out.print("EL TEXTO INVERTIDO ES: ");

        System.out.println("       ");

        System.out.println(s2);

        String abecedario = "abcdefghijklmnñopqrstuvwxyz";

        String s3 = "";

        /*for (int i = 0; i < s2.length(); i++) {
            int k =0;
            if (i % 2 == 0) {
                for (int j = 0; j < abecedario.length(); j++) {
                    
                   
                    if (s2.charAt(i) == abecedario[j]) {
                        if ((j - 7) < 0) {
                            k = j -7 +27;
                        } else {
                            k = j;
                        }
                        s3= s3 + abecedario[k];
                    }
                }

            } else {
                for (int j = 0; j < abecedario.length(); j++) {
                    
                    
                    if (s2.charAt(i) == abecedario[j]) {
                        if ((j + 5) >= abecedario.length()) {
                            k = j + 5 -27;
                      
                        } else {
                            k = j;
                        }
                        s3= s3 + abecedario[k];
                    }
                 
                    }
                }

            }*/

        }

    }


