
package Controler.MenuCTRL;
// Clase cotroladora del menu

import Controler.HomeCTRL.HomeCTRL;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Model.MenuDOU.MenuDOU;
import Model.Home.HomeDOU;
import View.MenuGUI;
import java.io.FileNotFoundException;
import View.HomeStudentGUI;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Model.EstudianteModel.EstudianteModel;
import Model.Notificaciones.NotificacionesDOU;
import Model.Notificaciones.NotificacionModel;
import Model.Habitacion.HabitacionDOU;
import  Model.Habitacion.HabitacionModel;



public class MenuCTRL implements ActionListener{
    
    MenuGUI menuGUI = new MenuGUI();
    MenuDOU mdou = new MenuDOU();
    HomeDOU homeDOU = new  HomeDOU();
    

    
    public MenuCTRL(MenuGUI m) throws FileNotFoundException {
        
        // inicilizamos los eventos del la clase MenuGUI
        this.menuGUI = m;
        
        this.menuGUI.btnEntradaSalida.addActionListener(this);

        this.menuGUI.btnRegistrarUsoCocina.addActionListener(this);
        this.menuGUI.btnFinalizarUsoCocina.addActionListener(this);
        this.menuGUI.btnDepositarbotellon.addActionListener(this);
        this.menuGUI.btnSolicitarBotellon.addActionListener(this);
        this.menuGUI.btnVolver.addActionListener(this);

        // Establecemos el estado inicial de los botones según el estado del estudiante
        
        
//        AsingnacionBotellonDOU.getEstadoBotellon();
        NotificacionesDOU.getEstadoNotificacio();
        HabitacionDOU.getEstadoBotellonHabitacion();
        actualizarEstadoBotones();
        
        m.jbNombre.setText(EstudianteModel.getNombre() +" "+ EstudianteModel.getApellido());
        // System.out.println("Estado Botellon " + AsignacionBotellonModel.getEstadoBotellon() );
        
        
    }
    

    // metodo que cambia los botones segun los estado 
    private void actualizarEstadoBotones() throws FileNotFoundException {
        
    String estadoEstudiante = EstudianteModel.getEstado();
    String  estadoNotificacion = NotificacionModel.getEstado_notificaciones();
    String  tipoNotificacion = NotificacionModel.getTipo_noteficacion();
//    String estadoBotellon = AsignacionBotellonModel.getEstadoBotellon();
    String estadoBotellon_h = HabitacionModel.getEstado_botellon_h();
    System.out.println("Estado estudiante: " + estadoEstudiante);
    System.out.println("Estado notificacio: " + tipoNotificacion );
    
//    System.out.println("Estado botellón: " + estadoBotellon);
        

    switch (estadoEstudiante) {
        case "Fuera":// si esta fuera solamente puede realizar la entrada
            configurarBotones(true, false, false, false, false, "Registrar entrada", "");
            break;

        case "Dentro":
            // si tiene una tiene una solicitu pendiente y una notificacion de Solicitar botellon
            if ("en espera".equals( estadoBotellon_h) && "Solicitar botellon".equals(tipoNotificacion) ) {
                configurarBotones(true, true, false, true, false, "Solicitar salida", "En espera de agua");
            } else if ("con botellon".equals(estadoBotellon_h) ){
                configurarBotones(true, true, false, false, true, "Solicitar salida", "");
                System.out.println("entro en el 1");
            }
            else if ("en espera".equals(estadoBotellon_h)) {
                configurarBotones(true, true, false, true, false, "Solicitar salida", "hay una solicitud pendiente");
                System.out.println("entro en el 2");
            } 
            
    
            else if ("en espera".equals(estadoBotellon_h) && "Depositar botellon".equals(tipoNotificacion) ) {
                System.out.println("entro en el 3");
                configurarBotones(true, true, false, true, false, "Solicitar salida", "Entrega el botello vacio");
            }
            else if ("con botellon".equals(estadoBotellon_h)) {
                configurarBotones(true, true, false, false, true, "Solicitar salida", "");
                System.out.println("entro en el 4");
            }else {
                configurarBotones(true, true, false, true, false, "Solicitar salida", "Solicitar botellon");
                System.out.println("entro en el 5");
            }

            break;

        case "En cocina":
            configurarBotones(false, false, true, false, false, "Finalizar uso cocina", "");
            break;

        default:
            System.out.println("Estado inválido.");
            break;
    }
}

private void configurarBotones(
    boolean entradaSalidaVisible, boolean registrarUsoCocinaVisible,
    boolean finalizarUsoCocinaVisible, boolean solicitarBotellonVisible, boolean depositarBotellonVisible,
    String textoEntradaSalida, String textoSolicitarBotellon
) {
    // Configura la visibilidad de los botones
    this.menuGUI.btnEntradaSalida.setVisible(entradaSalidaVisible);
    this.menuGUI.btnEntradaSalida.setText(textoEntradaSalida);

    this.menuGUI.btnRegistrarUsoCocina.setVisible(registrarUsoCocinaVisible);
    this.menuGUI.btnFinalizarUsoCocina.setVisible(finalizarUsoCocinaVisible);

    this.menuGUI.btnSolicitarBotellon.setVisible(solicitarBotellonVisible);
    this.menuGUI.btnSolicitarBotellon.setText(textoSolicitarBotellon);

    this.menuGUI.btnDepositarbotellon.setVisible(depositarBotellonVisible);
}


@Override
public void actionPerformed(ActionEvent e) {
    try {
        Object source = e.getSource();
        System.out.println("--------------------------------------------Action--------------------------------");

        if (source == menuGUI.btnEntradaSalida) {
            System.out.println("entro");
            handleEntradaSalidaAction();
        } else if (source == menuGUI.btnRegistrarUsoCocina) {
            handleRegistrarCocinaAction();
        } else if (source == menuGUI.btnFinalizarUsoCocina) {
            handleFinalizarUsoCocinaAction();
        } else if (source == menuGUI.btnSolicitarBotellon) {
            System.out.println("Entro");
            handleSolicitarBotellonAction();
        } else if (source == menuGUI.btnDepositarbotellon) {
            handleDepositarBotellonAction();
        } else if (source == menuGUI.btnVolver) {
            handleVolverAction();
        }
    } catch (FileNotFoundException ex) {
        Logger.getLogger(MenuCTRL.class.getName()).log(Level.SEVERE, "Error al manejar la acción", ex);
        JOptionPane.showMessageDialog(menuGUI, "Error al realizar la operación: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}


private void handleEntradaSalidaAction() throws FileNotFoundException {
    String buttonText = menuGUI.btnEntradaSalida.getText();

    if ("Registrar entrada".equals(buttonText)) {
        if (mostrarDialogoConfirmacion("¿Deseas registrar la entrada?")) {
            MenuDOU.registrarEntrada();
            cambiarVista();
        }
    } else if ("Solicitar salida".equals(buttonText)) {
        if (mostrarDialogoConfirmacion("¿Deseas registrar la salida?")) {
            MenuDOU.registrarSalida();
            cambiarVista();
        }
    }
}

private void handleRegistrarCocinaAction() throws FileNotFoundException {
    if (mostrarDialogoConfirmacion("¿Deseas solicitar el uso de la cocina?")) {
        MenuDOU.registrarUsoCocina();
        actualizarEstadoBotones();
        HomeStudentGUI hsgui = new HomeStudentGUI();
        HomeCTRL homeCTRL = new HomeCTRL(hsgui);
        menuGUI.setVisible(false);
        menuGUI.dispose();
        hsgui.setVisible(true);
    }
}

private void handleFinalizarUsoCocinaAction() throws FileNotFoundException {
    if (mostrarDialogoConfirmacion("¿Deseas finalizar el uso de la cocina?")) {
        MenuDOU.finalizaUsoCocina();
        actualizarEstadoBotones();
        
        HomeStudentGUI hsgui = new HomeStudentGUI();
        HomeCTRL homeCTRL = new HomeCTRL(hsgui);
        menuGUI.setVisible(false);
        menuGUI.dispose();
        hsgui.setVisible(true);
    }
}

private void handleSolicitarBotellonAction() throws FileNotFoundException {
    String buttonText = menuGUI.btnSolicitarBotellon.getText();
    
    if ("Solicitar botellon".equals(buttonText)) {
        if (mostrarDialogoConfirmacion("¿Deseas solicitar un botellón?")) {
            MenuDOU.SolicitarBotellon();
            actualizarEstadoBotones();
            HomeStudentGUI hsgui = new HomeStudentGUI();
            HomeCTRL homeCTRL = new HomeCTRL(hsgui);
            menuGUI.setVisible(false);
            menuGUI.dispose();
            hsgui.setVisible(true);
        }
    } else if ("En espera de confirmación".equals(buttonText)) {
        JOptionPane.showMessageDialog(menuGUI, "Solicitud en espera. Por favor, espere confirmación.");
    }else if ("Deposite el botellon vacio".equals(buttonText)) {
        JOptionPane.showMessageDialog(menuGUI, "Solicitud en espera. Por favor, Deposite el botellon vacio");
    }
}

private void handleDepositarBotellonAction() throws FileNotFoundException {
    String buttonText = menuGUI.btnSolicitarBotellon.getText();
    if (mostrarDialogoConfirmacion("¿Deseas depositar el botellón?")) {
       
        MenuDOU.DepositarBotellon();
        actualizarEstadoBotones();
         HomeStudentGUI hsgui = new HomeStudentGUI();
        HomeCTRL homeCTRL = new HomeCTRL(hsgui);
        menuGUI.setVisible(false);
        menuGUI.dispose();
        hsgui.setVisible(true);
    }
    else if ("Deposite el botellon vacio".equals(buttonText)) {
        JOptionPane.showMessageDialog(menuGUI, "Solicitud en espera. Por favor, deposite el botellon");
    }
}

private void handleVolverAction() {
    cambiarVista();
}

//Método Reutilizable para Cambiar de Vista:

private void cambiarVista() {
    HomeStudentGUI hsgui = new HomeStudentGUI();
    HomeCTRL homeCTRL = new HomeCTRL(hsgui);
    hsgui.setVisible(true);
    menuGUI.setVisible(false);
    menuGUI.dispose();
}


 // Muestra un cuadro de diálogo de confirmación y retorna `true` si el usuario selecciona "Sí".
 
private boolean mostrarDialogoConfirmacion(String mensaje) {
    int opcion = JOptionPane.showConfirmDialog(
        menuGUI,                           // Componente padre
        mensaje,                           // Mensaje a mostrar
        "Confirmación",                    // Título del cuadro de diálogo
        JOptionPane.YES_NO_OPTION,         // Botones "Sí" y "No"
        JOptionPane.QUESTION_MESSAGE       // Icono de pregunta
    );
    return opcion == JOptionPane.YES_OPTION; // Retorna true si el usuario selecciona "Sí".
}



    
 
//    @Override
//public void actionPerformed(ActionEvent e) {
//    try {
//        Object source = e.getSource();
//        System.out.println("---Aciton---");
//
//        if (source == menuGUI.btnEntradaSalida) {
//            System.out.println("Click en entrada y salida");
//            handleEntradaSalidaAction();
//        } else if (source == menuGUI.btnRegistrarUsoCocina) {
//            System.out.println("Click Registra uso cocina");
//            handleRegistrarCocinaAction();
//        } else if (source == menuGUI.btnFinalizarUsoCocina) {
//            System.out.println("finalizar uso cocina");
//            handleFinalizarUsoCocinaAction();
//        } else if (source == menuGUI.btnDepositarbotellon) {
//            System.out.println("Click depositar");
//            handleDepositarBotellon();
//            
//            
//        } else if (source == menuGUI.btnSolicitarBotellon) {
//            System.out.println("CLick solicitar ");
//            handleSolicitarBotellon();
//        }else if (source == menuGUI.btnVolver) {
//            handleVolverAction();
//        }
//    } catch (FileNotFoundException ex) {
//        Logger.getLogger(MenuCTRL.class.getName()).log(Level.SEVERE, "Error al manejar la acción", ex);
//        JOptionPane.showMessageDialog(menuGUI, "Error al realizar la operación: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
//    }
//}
//
//private void handleEntradaSalidaAction() throws FileNotFoundException {
//    String buttonText = menuGUI.btnEntradaSalida.getText();
//
//    if ("Registrar entrada".equals(buttonText)) {
//         if (mostrarDialogoConfirmacion("¿Deseas registrar la entrada?")) {
//            
//                    MenuDOU.registrarEntrada();
//                    actualizarEstadoBotones();
//                    HomeStudentGUI hsgui = new HomeStudentGUI();
//                    HomeCTRL homeCTRL = new HomeCTRL(hsgui);
//                    menuGUI.setVisible(false);
//                    menuGUI.dispose();
//                    hsgui.setVisible(true);
//                    
//        }
//    } else if ("Registrar salida".equals(buttonText)) {
//        if (mostrarDialogoConfirmacion("¿Deseas registrar la salida?")) {
//            
//                    MenuDOU.registrarSalida();  
//                    actualizarEstadoBotones();
//                    HomeStudentGUI hsgui = new HomeStudentGUI();
//                    HomeCTRL homeCTRL = new HomeCTRL(hsgui);
//                    menuGUI.setVisible(false);
//                    menuGUI.dispose();
//                    hsgui.setVisible(true);
//        }
//    }
//
//   // actualizarEstadoBotones();
//}
//
//    private void handleRegistrarCocinaAction()throws FileNotFoundException {
//        String buttonText = menuGUI.btnRegistrarUsoCocina.getText();
//
//        if ("Solicitar uso cocina".equals(buttonText)) {
//            if (mostrarDialogoConfirmacion("¿Deseas solicitar el uso de la cocina?")) {
//                    MenuDOU.registrarUsoCocina();
//                     actualizarEstadoBotones();
//                    HomeStudentGUI hsgui = new HomeStudentGUI();
//                    HomeCTRL homeCTRL = new HomeCTRL(hsgui);
//                    menuGUI.setVisible(false);
//                    menuGUI.dispose();
//                    hsgui.setVisible(true);
//            }
//        }
//
//       // actualizarEstadoBotones();
//    } 
//    
//    private void handleFinalizarUsoCocinaAction()throws FileNotFoundException {
//        String buttonText = menuGUI.btnFinalizarUsoCocina.getText();
//
//        if ("Finalizar uso cocina".equals(buttonText)) {
//           if (mostrarDialogoConfirmacion("¿Deseas finalizar el uso de la cocina?")) {
//                System.out.println("llamando a finalizar uso cocina");
//                    MenuDOU.finalizaUsoCocina();
//                    actualizarEstadoBotones();
//                    HomeStudentGUI hsgui = new HomeStudentGUI();
//                    HomeCTRL homeCTRL = new HomeCTRL(hsgui);
//                    menuGUI.setVisible(false);
//                    menuGUI.dispose();
//                    hsgui.setVisible(true);
//        }
//        }
//
//       // actualizarEstadoBotones();
//    } 
//    
//    
//    private void handleSolicitarBotellon() throws FileNotFoundException {
//    String buttonText = menuGUI.btnSolicitarBotellon.getText();
//
//    if ("Solicitar botellon".equals(buttonText)) {
//         if (mostrarDialogoConfirmacion("¿Deseas solicitar un botellon?")) {
//            
//                    MenuDOU.SolicitarBotellon();
//                    actualizarEstadoBotones();
//                    HomeStudentGUI hsgui = new HomeStudentGUI();
//                    HomeCTRL homeCTRL = new HomeCTRL(hsgui);
//                    menuGUI.setVisible(false);
//                    menuGUI.dispose();
//                    hsgui.setVisible(true);
//        }
//    }
//
//  
//}
//    private void handleDepositarBotellon() throws FileNotFoundException {
//        String buttonText = menuGUI.btnDepositarbotellon.getText();
//        if ("Depositar botellon".equals(buttonText)) {
//            if (mostrarDialogoConfirmacion("¿Deseas depositar botellon?")) {
//
//                        MenuDOU.DepocitarBotellon();  
//                        actualizarEstadoBotones();
//                        HomeStudentGUI hsgui = new HomeStudentGUI();
//                        HomeCTRL homeCTRL = new HomeCTRL(hsgui);
//                        menuGUI.setVisible(false);
//                        menuGUI.dispose();
//                        hsgui.setVisible(true);
//            }
//        }
//  
//}
//
//    private void handleVolverAction() {
//        HomeStudentGUI hsgui = new HomeStudentGUI();
//        HomeCTRL homeCTRL = new HomeCTRL(hsgui);
//        hsgui.setVisible(true);
//        menuGUI.setVisible(false);
//        menuGUI.dispose();
//    }
//    
//        /**
//     * Método que muestra un diálogo de confirmación y retorna true si el usuario selecciona "Sí".
//     */
//    private boolean mostrarDialogoConfirmacion(String mensaje) {
//        int opcion = JOptionPane.showConfirmDialog(
//            menuGUI,                           // Componente padre
//            mensaje,                           // Mensaje a mostrar
//            "Confirmación",                    // Título del cuadro de diálogo
//            JOptionPane.YES_NO_OPTION,         // Botones "Sí" y "No"
//            JOptionPane.QUESTION_MESSAGE       // Icono de pregunta
//        );
//        return opcion == JOptionPane.YES_OPTION; // Retorna true si el usuario selecciona "Sí"
//    }

}  

