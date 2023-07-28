
/**
 * Write a description of class JPanelMonedas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
/**
 * Panel donde se selecciona la denominación de una moneda para agregarla a la alcancía
 */

public class JPanelMonedas extends JPanel implements ActionListener, ItemListener
{
    
    
    //-----------------------------------------------------------------
    // Constantes
    //-----------------------------------------------------------------

    private static final String AGREGAR = "agregar";

    //-----------------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------------

    /**
     * Es una referencia a la clase principal de la interfaz
     */
    private JFAlcancia ventanaPrincipal;

    //-----------------------------------------------------------------
    // Atributos de la Interfaz
    //-----------------------------------------------------------------

    /**
     * Es la opción para seleccionar monedas de 20
     */
    private JRadioButton radio1000;

    /**
     * Es la opción para seleccionar monedas de 50
     */
    private JRadioButton radio50;

    /**
     * Es la opción para seleccionar monedas de 100
     */
    private JRadioButton radio100;

    /**
     * Es la opción para seleccionar monedas de 200
     */
    private JRadioButton radio200;

    /**
     * Es la opción para seleccionar monedas de 500
     */
    private JRadioButton radio500;

    /**
     * Es el grupo de botones que asegura que solamente se selecciona una moneda a la vez
     */
    private ButtonGroup grupoBotones;

    /**
     * Es el botón para agregar una moneda a la alcancía
     */
    private JButton botonAgregar;

    //-----------------------------------------------------------------
    // Constructores
    //-----------------------------------------------------------------

    /**
     * Construye un nuevo panel <br>
     * <b>post: </b>Se construyó el panel y se inicializaron sus componentes
     * @param ia Es una referencia a la clase principal de la interfaz. ia != null
     */
    public JPanelMonedas( JFAlcancia alc )
    {
        ventanaPrincipal = alc;

        //Inicializa los componentes del panel
        grupoBotones = new ButtonGroup( );

        
        radio50 = new JRadioButton( "0", new ImageIcon( "./Imagenesmonedas/m50.jpg" ) );
        grupoBotones.add( radio50 );
        radio50.setVerticalTextPosition( SwingConstants.BOTTOM );
        radio50.setHorizontalTextPosition( SwingConstants.CENTER );
        radio50.addItemListener( this );
        radio50.setBorder( null );
        add( radio50 );

        radio100 = new JRadioButton( "0", new ImageIcon( "./Imagenesmonedas/m100.jpg" ) );
        grupoBotones.add( radio100 );
        radio100.setVerticalTextPosition( SwingConstants.BOTTOM );
        radio100.setHorizontalTextPosition( SwingConstants.CENTER );
        radio100.addItemListener( this );
        radio100.setBorder( null );
        add( radio100 );

        radio200 = new JRadioButton( "0", new ImageIcon( "./Imagenesmonedas/m200.jpg" ) );
        grupoBotones.add( radio200 );
        radio200.setVerticalTextPosition( SwingConstants.BOTTOM );
        radio200.setHorizontalTextPosition( SwingConstants.CENTER );
        radio200.addItemListener( this );
        radio200.setBorder( null );
        add( radio200 );

        radio500 = new JRadioButton( "0", new ImageIcon( "./Imagenesmonedas/m500.jpg" ) );
        grupoBotones.add( radio500 );
        radio500.setVerticalTextPosition( SwingConstants.BOTTOM );
        radio500.setHorizontalTextPosition( SwingConstants.CENTER );
        radio500.addItemListener( this );
        radio500.setBorder( null );
        add( radio500 );
        
        radio1000 = new JRadioButton( "0", new ImageIcon( "./Imagenesmonedas/m1000.jpg" ) );
        grupoBotones.add( radio1000 );
        radio1000.setVerticalTextPosition( SwingConstants.BOTTOM );
        radio1000.setHorizontalTextPosition( SwingConstants.CENTER );
        radio1000.addItemListener( this );
        radio1000.setBorder( null );
        add( radio1000 );


        radio1000.setSelected( true );

        botonAgregar = new JButton( "Agregar Moneda" );
        botonAgregar.setActionCommand( AGREGAR );
        botonAgregar.addActionListener( this );
        add( botonAgregar );

        setBorder( new TitledBorder( "Monedas" ) );
    }

    //-----------------------------------------------------------------
    // Métodos
    //-----------------------------------------------------------------

    /**
     * Cambia la cantidad de monedas que hay de una cierta cantidad
     * @param denominacion La denominación de la moneda
     * @param cantidad La cantidad de esas monedas que hay
     */
    public void cambiarCantidad( int denominacion, int cantidad )
    {
        if( denominacion == 1000 )
        {
            radio1000.setText( "" + cantidad );
        }
        else if( denominacion == 50 )
        {
            radio50.setText( "" + cantidad );
        }
        else if( denominacion == 100 )
        {
            radio100.setText( "" + cantidad );
        }
        else if( denominacion == 200 )
        {
            radio200.setText( "" + cantidad );
        }
        else if( denominacion == 500 )
        {
            radio500.setText( "" + cantidad );
        }
    }

    /**
     * Se ejecuta cuando se hace click sobre un botón
     * @param evento Es el evento del click sobre el botón
     */
    public void actionPerformed( ActionEvent evento )
    {
        String comando = evento.getActionCommand( );

        if( AGREGAR.equals( comando ) )
        {
            int cantidad = 0;
            if( radio1000.isSelected( ) )
            {
                cantidad = 1000;
            }
            else if( radio50.isSelected( ) )
            {
                cantidad = 50;
            }
            else if( radio100.isSelected( ) )
            {
                cantidad = 100;
            }
            else if( radio200.isSelected( ) )
            {
                cantidad = 200;
            }
            else if( radio500.isSelected( ) )
            {
                cantidad = 500;
            }

            ventanaPrincipal.agregarMoneda( cantidad );
        }
    }

    /**
     * Este método se llama cuando se selecciona alguno de los botones que indican las denominaciones. <br>
     * El método se encarga de dibujar un borde alrededor de la denominación seleccionada.
     * @param evento Es el evento de la selección de una denominación
     */
    public void itemStateChanged( ItemEvent evento )
    {
        JRadioButton boton = ( JRadioButton )evento.getItem( );

        if( evento.getStateChange( ) == ItemEvent.SELECTED )
        {
            boton.setBorder( new BevelBorder( BevelBorder.LOWERED, Color.BLACK, Color.GRAY, Color.LIGHT_GRAY, Color.GRAY ) );
            boton.setBorderPainted( true );
        }
        else
        {
            boton.setBorder( null );
        }
        validate( );
    }

    
     }
