package com.example.autodefesa;
import android.widget.TextView;
public class Aulas {
    private String conteudoAula;
    private String texto = "";
    public String nomeNoMenu(int idaula){
        switch (idaula){
            case 1:
                conteudoAula = "Aula introdutória!";
            break;
            case 2:
                conteudoAula = "Tutorial Kung Fu";
            break;
            case 3:
                conteudoAula = "Taekwondo";
             break;
            default:
                conteudoAula = "Aula" + idaula;
                break;
        }
        return conteudoAula;
    }
    public String tituloAula(int idaula){

        switch (idaula){
            case 1:
                conteudoAula = "Aprenda para que AutoDefesaApp serve!";
                break;
            case 2:
                conteudoAula = "Iniciando no Kung Fu!";
                break;
            default:
                conteudoAula = "outras aulas!";
                break;
        }
        return conteudoAula;
    }

    public String conteudoAula(int idaula){
        switch (idaula){
            case 1:
                conteudoAula = Aula1();
                break;
            case 2:
                conteudoAula = Aula2();
                break;
            default:
                conteudoAula = "Conteudo de outras aulas!";
                break;
        }
        return conteudoAula;
    }
    public String Aula1(){
        texto = "\n\n"+
                "Este aplicativo Possui o intuito de ensinar artes marcias, tendo foco maior em Kung Fu e seus estilos choy lay fat e wing chun." +
                "\n" + "\n" +
                "Será apredido técnicas do taekwondo, arte marcial focada em chutes, para que possua uma maior variedade de golpes." + "\n" + "\n" +
                "\n" +" + Dicas :" +
                "\n" + " - Não utilize os ensinamentos para entrar em lutas desnecessárias." +
                "\n" + " - Evite lutas, AutodefesaApp preza por uma sociedade saudável." +
                "\n" + " - Treine todos os Dias, tornar os treinos desse aplicativo um hábito, pois irá fazer com que você tenha uma saude mais estável.";
        return  texto;
    }
    public String Aula2(){
        texto = "\n\n"+
                "O kung fu é uma da primeiras artes marciais, surgiu na china, com intuito de melhor a vida dos monges." +
                "\n" + "\n" +
                "O kung Fu possui diversas bases, inicialmente aprenderá a base do Cavalo/cavaleiro na qual é aplicada a maioria dos golpes." + "\n" + "\n" +
                "\n" +" + Dicas :" +
                "\n" + " - Caso sinta dores do nos joelhos não pratique as tecnicas, consulte um fisioterapeuta antes!." +
                "\n" + " - Quanto mais próximo conseguir agachar melhor será o exercício." +
                "\n" + " - Respire fundo, a meditação pode ser a melhor arma para controlar qualquer sensação, como a dor." +
                "\n" + " - Pense Positivo, pensar que irá conseguir e no resultado que irá obter, este é o melhor estimulante.";;
        return  texto;
    }
}
