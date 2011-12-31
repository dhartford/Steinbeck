/*
 * UAGUIFileChooser.java
 *
 * Created on May 16, 2005, 3:26 PM
 */

package steinbeck;

import javax.swing.*;
import java.io.File;

/**
 *
 * @author  Administrator
 */
public class UAGUIFileChooser extends javax.swing.JFrame {
    
    /** Creates new form UAGUIFileChooser */
    protected UAGUIFileChooser() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() {//GEN-BEGIN:initComponents
        jFileChooser1 = new javax.swing.JFileChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Open a Working Directory");
        jFileChooser1.setCurrentDirectory(null);
        jFileChooser1.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);
        getContentPane().add(jFileChooser1, java.awt.BorderLayout.CENTER);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-600)/2, (screenSize.height-400)/2, 600, 400);
    }//GEN-END:initComponents
    
    
    
    protected File getFile(){
        // make configurations (title, FILES_ONLY, etc.)
        this.setTitle("Choose a Script File");
        jFileChooser1.setFileSelectionMode(javax.swing.JFileChooser.FILES_ONLY);

        int returnValue = jFileChooser1.showOpenDialog(this);
        if (returnValue == JFileChooser.APPROVE_OPTION) {            
            return jFileChooser1.getSelectedFile();
        }        

        return null;
    }
    
    protected String getDirectory(){
        // make configurations (title, FILES_ONLY, etc.)
        this.setTitle("Open a Working Directory");
        jFileChooser1.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);
        
        int returnValue = jFileChooser1.showOpenDialog(this);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            return jFileChooser1.getSelectedFile().getAbsolutePath();
        }        
        return null;
    }
    
    /**
     * @param args the command line arguments
     */
    /*
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UAGUIFileChooser().setVisible(true);
            }
        });
    }
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser jFileChooser1;
    // End of variables declaration//GEN-END:variables
    
}