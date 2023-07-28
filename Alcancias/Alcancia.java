
/**
 * Write a description of class Alcancia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alcancia
{
    //-----------------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------------

    /**
     * Es el número de monedas de 50 que se han introducido en la alcancía
     */
    private int numeroMonedas50;

    /**
     * Es el número de monedas de 100 que se han introducido en la alcancía
     */
    private int numeroMonedas100;

    /**
     * Es el número de monedas de 200 que se han introducido en la alcancía
     */
    private int numeroMonedas200;

    /**
     * Es el número de monedas de 500 que se han introducido en la alcancía
     */
    private int numeroMonedas500;
    
       /**
     * Es el número de monedas de 1000 que se han introducido en la alcancía
     */
    private int numeroMonedas1000;

    /**
     * Indica si la alcancía ya está rota <br>
     * 0 indica que no está rota <br>
     * 1 indica que si lo está
     */
    private int rota;

    //-----------------------------------------------------------------
    // Constructores
    //-----------------------------------------------------------------

    /**
     * Inicializa los datos de una nueva alcancía <br>
     * <b>post: </b>dinero=0, numeroMonedas20=0,numeroMonedas50=0,numeroMonedas100=0,numeroMonedas200=0,numeroMonedas500=0, rota=0
     */
    public void inicializar( )
    {
        
        numeroMonedas50 = 0;
        numeroMonedas100 = 0;
        numeroMonedas200 = 0;
        numeroMonedas500 = 0;
        numeroMonedas1000 = 0;
        rota = 0;
    }

    //-----------------------------------------------------------------
    // Métodos
    //-----------------------------------------------------------------

  

    /**
     * Agrega una moneda de 50 pesos a la alcancía <br>
     * <b>pre: </b>La alcancía no está rota <br>
     * <b>post: </b>Aumentó la cantidad de monedas de 50 en la alcancía
     */
    public void agregarMoneda50( )
    {
        numeroMonedas50 = numeroMonedas50 + 1;
    }

    /**
     * Agrega una moneda de 100 pesos a la alcancía <br>
     * <b>pre: </b>La alcancía no está rota <br>
     * <b>post: </b>Aumentó la cantidad de monedas de 100 en la alcancía
     */
    public void agregarMoneda100( )
    {
        numeroMonedas100 = numeroMonedas100 + 1;
    }

    /**
     * Agrega una moneda de 200 pesos a la alcancía <br>
     * <b>pre: </b>La alcancía no está rota <br>
     * <b>post: </b>Aumentó la cantidad de monedas de 200 en la alcancía
     */
    public void agregarMoneda200( )
    {
        numeroMonedas200 = numeroMonedas200 + 1;
    }

    /**
     * Agrega una moneda de 500 pesos a la alcancía <br>
     * <b>pre: </b>La alcancía no está rota <br>
     * <b>post: </b>Aumentó la cantidad de monedas de 500 en la alcancía
     */
    public void agregarMoneda500( )
    {
        numeroMonedas500 = numeroMonedas500 + 1;
    }

      /**
     * Agrega una moneda de 1000 pesos a la alcancía <br>
     * <b>pre: </b>La alcancía no está rota <br>
     * <b>post: </b>Aumentó la cantidad de monedas de 20 en la alcancía
     */
    public void agregarMoneda1000( )
    {
        numeroMonedas1000 = numeroMonedas1000 + 1;
    }
    /**
     * Rompe la alcancía <br>
     * <b>pre: </b>La alcancía no está rota <br>
     * <b>post: </b>La alcancía está rota
     */
    public void romperAlcancia( )
    {
        rota = 1;
    }

    /**
     * Informa sobre el contenido de la alcancía <br>
     * <b>pre: </b>La alcancía no está rota
     * @return Retorna una cadena que informa sobre la cantidad de monedas que había en la alcancía y la cantidad de dinero total.
     */
    public String darEstadoAlcancia( )
    {
        int totalDinero = darTotalDinero( );

        return "La alcancía tenía " + numeroMonedas50 + " monedas de 50, " + numeroMonedas100 + " monedas de 100, " + numeroMonedas200 + " monedas de 200   " + numeroMonedas500 + " monedas de 500 y  " + numeroMonedas1000 + " monedas de 1000, " 
                + " que sumaban " + totalDinero + " pesos";
    }

    /**
     * Retorna el total de dinero que hay en la alcancía
     * @return total de dinero
     */
    public int darTotalDinero( )
    {
        return numeroMonedas50 * 50 + numeroMonedas100 * 100 + numeroMonedas200 * 200 + numeroMonedas500 * 500 + numeroMonedas1000 * 1000;
    }

   

    /**
     * Este método retorna el número de monedas de 50 pesos que hay en la alcancía
     * @return numeroMonedas50
     */
    public int darNumeroMonedas50( )
    {
        return numeroMonedas50;
    }

    /**
     * Este método retorna el número de monedas de 100 pesos que hay en la alcancía
     * @return numeroMonedas100
     */
    public int darNumeroMonedas100( )
    {
        return numeroMonedas100;
    }

    /**
     * Este método retorna el número de monedas de 200 pesos que hay en la alcancía
     * @return numeroMonedas200
     */
    public int darNumeroMonedas200( )
    {
        return numeroMonedas200;
    }

    /**
     * Este método retorna el número de monedas de 500 pesos que hay en la alcancía
     * @return numeroMonedas500
     */
    public int darNumeroMonedas500( )
    {
        return numeroMonedas500;
    }

     /**
     * Este método retorna el número de monedas de 1000 pesos que hay en la alcancía
     * @return numeroMonedas1000
     */
    public int darNumeroMonedas1000( )
    {
        return numeroMonedas1000;
    }
    /**
     * Informa si la alcancía está rota
     * @return Retorna 0 si la alcancía no está rota; 1 en caso contrario.
     */
    public int estaRota( )
    {
        return rota;
    }

}
