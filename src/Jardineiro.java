public class Jardineiro {

    public String limparJardim(Object obj){

        Object ferramenta;

        if (obj.getClass() == Pa.class){

            ferramenta = new Pa();

            return ((Pa) ferramenta).iniciar();

        } else if (obj.getClass() == Cultivador.class){

            ferramenta = new Cultivador();

            return ((Cultivador) ferramenta).iniciar();

        } else if (obj.getClass() == Enxada.class){

            ferramenta = new Enxada();

            return ((Enxada) ferramenta).iniciar();

        }

        return "Não iniciou!";
    }

}
