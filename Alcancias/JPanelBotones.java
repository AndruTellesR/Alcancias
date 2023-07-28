
/**
 * Write a description of class JPanelBotones here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
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


public class JPanelBotones extends JPanel implements ActionListener
{
    //constantes
    
    private static final String ROMPER = "romper";

    private static final String NUEVA = "nueva";
    
    
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
     * Es el botón usado para romper la alcancía
     */
    private JButton botonRomper;

    /**
     * Es el botón usado para crear una nueva alcancía
     */
    private JButton botonNueva;

    
    public JPanelBotones( JFAlcancia alc)
    {
         ventanaPrincipal= alc;
        
        
         setLayout( new BorderLayout( ) );

        //Inicializa los componentes del panel
        JPanel panelInternoRomper = new JPanel( );
        botonRomper = new JButton( new ImageIcon( "./Imagenesmonedas/martillo.jpg" ) );
        botonRomper.setActionCommand( ROMPER );
        botonRomper.setMargin( new Insets( 1, 1, 1, 1 ) );
        botonRomper.addActionListener( this );
        panelInternoRomper.add( botonRomper );
        panelInternoRomper.setBorder( new TitledBorder( "Romper Alcancía" ) );
        add( panelInternoRomper, BorderLayout.CENTER );

        JPanel panelInternoBotones = new JPanel( );

        botonNueva = new JButton( "Nueva Alcancía" );
        botonNueva.setActionCommand( NUEVA );
        botonNueva.addActionListener( this );
        panelInternoBotones.add( botonNueva );


        
    }

    // Métodos
    //-----------------------------------------------------------------

    /**
     * Ejecuta la acción según el botón sobre el que se haya hecho click
     * @param evento Es el evento de click sobre un botón. evento != null
     */
    public void actionPerformed( ActionEvent evento )
    {
        String comando = evento.getActionCommand( );

        if( NUEVA.equals( comando ) )
        {
            ventanaPrincipal.nuevaAlcancia( );
        }
        else if( ROMPER.equals( comando ) )
        {
            ventanaPrincipal.romperAlcancia( );
        }
        
    }

}

