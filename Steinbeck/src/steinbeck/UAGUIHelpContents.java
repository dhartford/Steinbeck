/*
 * UAGUIHelpContents.java
 *
 * Created on May 23, 2005, 11:26 AM
 */

package steinbeck;

/**
 *
 * @author  Administrator
 */
public class UAGUIHelpContents extends javax.swing.JFrame {
    
    /** Creates new form UAGUIHelpContents */
    public UAGUIHelpContents() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        getContentPane().setLayout(new java.awt.BorderLayout(5, 5));

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Help Contents For Steinbeck");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14));
        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.add(jButton1);

        getContentPane().add(jPanel1, java.awt.BorderLayout.SOUTH);

        jTextArea1.setEditable(false);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 12));
        jTextArea1.setLineWrap(true);
        jTextArea1.setText(" 1. HELP CONTENT FOR STEINBECK\n\n 1.1 Introduction\n\n  First of all, Steinbeck utilizes SSH for the underlying connection between client and server (box in which a script will be run). It uses jsch-0.1.20.jar, which is an open source pure java implementation of SSH2. For more information, see http://www.jcraft.com/jsch/.\n\n  Second of all, Steinbeck can be used to run any (see section 1.6.2) script on a (linux)unix box with SSH server while checking on-going progress and grabbing the end result at client side. Should progress checking and end result grabbing wanted to be performed automatically, scripts be better changed accordingly. (See section 1.2.1)\n \n 1.2 Configuration\n\n  There is one thing that is important when configuring Steinbeck.\n\n  1.2.1 Script Adjustments for Progress Checkings and End Result Grabbing\n\n    If you want Steinbeck to show the on going progress of your remotely running scripts on remote machines, then you have to make your script to create a \"progress.txt\" file, which should include a progress score between 0 and 100. Normally, your script should create this file as the first thing in the current directory (i.e. \"touch progress.txt\"). Then once in a while, after reasonable calculations, your script should update the internals of this file with a number.\n    An example script may look like this;\n\n    sleep 5\n    echo 10 > progress.txt\n    sleep 5\n    echo 20 > progress.txt\n    sleep 5\n    echo 30 > progress.txt\n    sleep 10\n    echo 90 > progress.txt\n    sleep 5\n    ls -al\n    echo 100 > progress.txt\n\n    As you can note from the end of the file, any results should be written into results.txt before progress becomes 100. No worries tough, when grabbed, this results.txt will be renamed as {REMOTE_IP}+results.txt on the local box in your working directory. Anything that goes to stdout will be populated by Steinbeck, but not stderr!\n\n  1.2.2 Managing scripts\n\n    Under the Manage menu item, you can choose Scripts sub-item in order to add, remove any scripts that you wanted to execute remotely. That is to say, from this menu, you will choose the script files and these files will be added to the Steinbeck database (a simple xml file). Under the hood, files you have chosen will be copied to the Steinbeck's directory with a current date. Description for the selected script will be grabbed from the second line of the script file (if exists).\n\n 1.3 Scan\n\n  After you handle Configuration part, then in order to add|edit|remove any sessions you have to use Scan menu item. This should be straightforward. But one important thing to note is this, when you add or edit a session, (and pressing Done button), a connection test will take place to remote box. Any errors (authentication, connection) can be tackled here. \n\n 1.4 Run\n\n  You can start running scripts by using Run menu item, or by using the Start button. This will open another window having progress bars updating (if you have configured scripts!). You can stop running sessions or when they are all done, a pop-up message will appear (Again this is possible if your scripts are configured properly). See (section 1.2.1)\n\n 1.5 Key\n\n  For a session, {IP+Username+Port+RemotePath+LocalPath} tuple is a key. So, as long as this tuple is unique, you can run a session and get response (results.txt that is).\n\n 1.6 Troubleshooting\n\n  1.6.1 Be sure that the items below are applied to SSH server configuration file (/etc/ssh/sshd_config);\n\n  1.6.1.1 PasswordAuthentication Yes\n  1.6.1.2 PermitRootLogin Yes (if you are connecting as \"root\")\n\n  by Bedirhan, 07/26/2006");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setAlignmentX(1.0F);
        jTextArea1.setAlignmentY(1.0F);
        jTextArea1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(255, 255, 255)));
        jTextArea1.setCaretPosition(1);
        jTextArea1.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1044)/2, (screenSize.height-589)/2, 1044, 589);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // this.setVisible(false);
        this.dispose();

    }//GEN-LAST:event_formWindowClosing

    /** close */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
    
}
