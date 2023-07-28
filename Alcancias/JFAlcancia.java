
/**
 * Write a description of class JFAlcancia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import javax.swing.*;
import java.awt.*;

public class JFAlcancia extends JFrame 
{
    
   //-----------------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------------

    /**
     * Es la alcancía que se está usando en el momento
     */
    private JFAlcancia ventanaPrincipal;
    
    //-----------------------------------------------------------------
    // Atributos de la Interfaz
    //-----------------------------------------------------------------

    /**
     * Es el panel donde se muestra el estado actual de la alcancía
     */
    private JPanelAlcancia panelAlcancia;

    /**
     * Es el panel con los botones que controlan la aplicación
     */
    private JPanelBotones panelBotones;

    /**
     * Es el panel donde se seleccionan y agregan las monedas
     */
    private JPanelMonedas panelMonedas;
   
    

    
    Alcancia alcancia;
    
     /**
     * Construye la interfaz de la aplicación y la inicializa con una alcancía vacía <br>
     * <b>post: </b> alcancia != null
     */
    public JFAlcancia()
    {
        
        //Crea la alcancía inicial
        alcancia= new Alcancia( );
        alcancia.inicializar( );

        //Crea y organiza los componentes de la interfaz
        panelAlcancia = new JPanelAlcancia( );
        getContentPane( ).add( panelAlcancia, BorderLayout.CENTER );

        panelBotones = new JPanelBotones( this );
        getContentPane( ).add( panelBotones, BorderLayout.EAST );

        panelMonedas = new JPanelMonedas( this );
        getContentPane( ).add( panelMonedas, BorderLayout.NORTH );

        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        setTitle( "Alcancía" );
        setSize( 700, 500 );
        
        
        
    }

    
    //-----------------------------------------------------------------
    // Métodos
    //-----------------------------------------------------------------

    /**
     * Agrega una moneda a la alcancía siempre y cuando no esté rota <br>
     * <b>post: </b>Se agregó la cantidad indicada a la alcancía o se presentó un mensaje de error si estaba rota
     * @param cantidad cantidad que se va a agregar a la alcancía
     */
    public void agregarMoneda( int cantidad )
    {
        if( alcancia.estaRota( ) == 0 )
        {
           if( cantidad == 50 )
            {
                alcancia.agregarMoneda50( );
                panelMonedas.cambiarCantidad( 50, alcancia.darNumeroMonedas50( ) );
            }
            else if( cantidad == 100 )
            {
                alcancia.agregarMoneda100( );
                panelMonedas.cambiarCantidad( 100, alcancia.darNumeroMonedas100( ) );
            }
            else if( cantidad == 200 )
            {
                alcancia.agregarMoneda200( );
                panelMonedas.cambiarCantidad( 200, alcancia.darNumeroMonedas200( ) );
            }
            else if( cantidad == 500 )
            {
                alcancia.agregarMoneda500( );
                panelMonedas.cambiarCantidad( 500, alcancia.darNumeroMonedas500( ) );
            }
            
            else if( cantidad == 1000 )
            {
                alcancia.agregarMoneda1000( );
                panelMonedas.cambiarCantidad( 1000, alcancia.darNumeroMonedas1000( ) );
            }
            else 

            panelAlcancia.cambiarMensaje( "Se agregaron " + cantidad + " pesos a la alcancía.\nEn la alcancía hay " + alcancia.darTotalDinero( ) + " pesos" );
        }
        else
            JOptionPane.showMessageDialog( this, "No se puede agregar monedas a una alcancía rota", "Error", JOptionPane.ERROR_MESSAGE );
    }

    /**
     * Crea una nueva alcancía <br>
     * <b>post: </b>La alcancía es nueva y está vacía
     */
    public void nuevaAlcancia( )
    {
        alcancia = new Alcancia( );
        alcancia.inicializar( );

        panelAlcancia.cambiarEstadoAlcancia( false );
        panelAlcancia.cambiarMensaje( "Alcancía Vacía" );

        
        panelMonedas.cambiarCantidad( 50, alcancia.darNumeroMonedas50( ) );
        panelMonedas.cambiarCantidad( 100, alcancia.darNumeroMonedas100( ) );
        panelMonedas.cambiarCantidad( 200, alcancia.darNumeroMonedas200( ) );
        panelMonedas.cambiarCantidad( 500, alcancia.darNumeroMonedas500( ) );
        panelMonedas.cambiarCantidad( 1000, alcancia.darNumeroMonedas1000( ) );
    }

    /**
     * Rompe la alcancía y actualiza la información mostrada <br>
     * <b>post: </b>La alcancía está rota y se mostró su contenido
     */
    public void romperAlcancia( )
    {
        String mensaje = alcancia.darEstadoAlcancia( );
        alcancia.romperAlcancia( );

        panelAlcancia.cambiarEstadoAlcancia( true );
        panelAlcancia.cambiarMensaje( mensaje );
    }

    
    //-----------------------------------------------------------------
    // Ejecución
    //-----------------------------------------------------------------

    /**
     * Ejecuta la aplicación
     * @param args parámetros de la ejecución
     */
    public static void main( String[] args )
    {
        JFAlcancia alc = new JFAlcancia( );
        alc.setVisible( true );
    }
    
}
