
/**
 * Write a description of class JPanelAlcancia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import javax.swing.*;
import java.awt.*;
import javax.swing.border.TitledBorder;


public class JPanelAlcancia extends JPanel
{
   
    //-----------------------------------------------------------------
    // Atributos de la Interfaz
    //-----------------------------------------------------------------

    /**
     * Es la etiqueta donde se dibuja la alcancía
     */
    private JLabel etiquetaAlcancia;

    /**
     * Es el área donde se muestran los mensajes sobre la alcancía
     */
    private JTextArea txtMensaje;

    //-----------------------------------------------------------------
    // Constructores
    //-----------------------------------------------------------------

    public JPanelAlcancia()
    {
       setLayout( new BorderLayout( ) );

        etiquetaAlcancia = new JLabel( new ImageIcon( "./Imagenesmonedas/alcancia.jpg" ) );
        add( etiquetaAlcancia, BorderLayout.CENTER );

        txtMensaje = new JTextArea( 3, 40 );
        Font fuente = new Font( "Tahoma", Font.PLAIN, 12 );
        txtMensaje.setFont( fuente );
        txtMensaje.setText( "Alcancía Vacía" );
        txtMensaje.setWrapStyleWord( true );
        txtMensaje.setLineWrap( true );
        txtMensaje.setBackground( getBackground( ) );
        txtMensaje.setEditable( false );
        add( txtMensaje, BorderLayout.SOUTH );

        setBorder( new TitledBorder( "Alcancía" ) );
    }
        //-----------------------------------------------------------------
    // Métodos
    //-----------------------------------------------------------------
        /**
     * Cambia el mensaje mostrado <br>
     * <b>post: </b>Se cambió el mensaje
     * @param mensaje El mensaje que se quiere mostrar. mensaje!=null
     */
    
    public void cambiarMensaje( String mensaje )
    {
        txtMensaje.setText( mensaje );
        validate( );
    }

     /**
     * Cambia el dibujo de la alcancía según el estado actual <br>
     * <b>post: </b>El dibujo refleja el estado actual de la alcancía
     * @param rota Indica si actualmente la alcancía está rota o no
     */
    public void cambiarEstadoAlcancia( boolean rota )
    {
        if( rota )
        {
            etiquetaAlcancia.setIcon( new ImageIcon( "./Imagenesmonedas/alcanciarota.jpg" ) );
        }
        else
        {
            etiquetaAlcancia.setIcon( new ImageIcon( "./Imagenesmonedas/alcancia.jpg" ) );
        }
        validate( );
    }
    }





