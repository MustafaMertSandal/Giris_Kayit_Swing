import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.mindrot.jbcrypt.BCrypt;

public class Kayit extends javax.swing.JFrame {

    String imagePath = null;
    VeriTabani db = new VeriTabani();

    public Kayit() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getRootPane().setDefaultButton(register);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        plus = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        addPhoto = new javax.swing.JButton();
        deletePhoto = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        nickName = new javax.swing.JTextField();
        mail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        photo = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        register = new javax.swing.JButton();
        signIn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Register");
        setBackground(new java.awt.Color(214, 217, 223));
        setMinimumSize(new java.awt.Dimension(500, 550));
        setPreferredSize(new java.awt.Dimension(500, 550));

        jPanel1.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.borderColor"));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 550));

        plus.setEditable(false);
        plus.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.borderColor"));
        plus.setText("+");
        plus.setAutoscrolls(false);
        plus.setBorder(null);
        plus.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        name.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.borderColor"));
        name.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        name.setBorder(null);
        name.setOpaque(true);

        addPhoto.setBackground(new java.awt.Color(225, 225, 225));
        addPhoto.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        addPhoto.setText("Add Photo");
        addPhoto.setAutoscrolls(true);
        addPhoto.setContentAreaFilled(false);
        addPhoto.setFocusPainted(false);
        addPhoto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addPhoto.setMargin(new java.awt.Insets(2, 3, 3, 3));
        addPhoto.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        addPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPhotoActionPerformed(evt);
            }
        });

        deletePhoto.setBackground(new java.awt.Color(225, 225, 225));
        deletePhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/trash.png"))); // NOI18N
        deletePhoto.setContentAreaFilled(false);
        deletePhoto.setFocusPainted(false);
        deletePhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePhotoActionPerformed(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(255, 0, 51));
        jLabel10.setText("*");

        jLabel11.setForeground(new java.awt.Color(255, 0, 51));
        jLabel11.setText("*");

        jLabel12.setForeground(new java.awt.Color(255, 0, 51));
        jLabel12.setText("*");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        nickName.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.borderColor"));
        nickName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        nickName.setBorder(null);

        mail.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.borderColor"));
        mail.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        mail.setBorder(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Name:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Nickname:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("E-mail:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Password:");
        jLabel4.setFocusable(false);
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Phone:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Photo:");

        photo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel9.setForeground(new java.awt.Color(255, 0, 51));
        jLabel9.setText("*");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        phone.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.borderColor"));
        phone.setText("90 ");
        phone.setAutoscrolls(false);
        phone.setBorder(null);
        phone.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                phoneKeyTyped(evt);
            }
        });

        password.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.borderColor"));
        password.setBorder(null);

        register.setBackground(new java.awt.Color(225, 225, 225));
        register.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        register.setText("Register");
        register.setAutoscrolls(true);
        register.setContentAreaFilled(false);
        register.setFocusPainted(false);
        register.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        register.setMargin(new java.awt.Insets(2, 3, 3, 3));
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });

        signIn.setBackground(new java.awt.Color(225, 225, 225));
        signIn.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        signIn.setText("Sign In");
        signIn.setAutoscrolls(true);
        signIn.setContentAreaFilled(false);
        signIn.setFocusPainted(false);
        signIn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        signIn.setMargin(new java.awt.Insets(2, 3, 3, 3));
        signIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(register, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(signIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jSeparator5)
                                        .addComponent(jSeparator2)
                                        .addComponent(jSeparator3)
                                        .addComponent(jSeparator4)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabel6)
                                                                        .addComponent(jLabel5)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(jLabel11)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(jLabel3))
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(jLabel10)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(jLabel2)))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                        .addComponent(jLabel9)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(jLabel1)))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel4)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(photo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(addPhoto)
                                                                        .addComponent(deletePhoto))
                                                                .addGap(0, 178, Short.MAX_VALUE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(plus, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(phone))
                                                        .addComponent(password)
                                                        .addComponent(mail)
                                                        .addComponent(nickName)
                                                        .addComponent(name)))
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel1)
                                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(2, 2, 2)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(nickName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel10))
                                .addGap(3, 3, 3)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel11))
                                .addGap(2, 2, 2)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(plus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(photo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(addPhoto)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(deletePhoto)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(register)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(signIn)
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>

    private void phoneKeyTyped(java.awt.event.KeyEvent evt) {
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }

    private ImageIcon ResizeImageIcon(String imagePath, byte[] image){
        ImageIcon imageI = null;
        if(imagePath != null){
            imageI = new ImageIcon(imagePath);
        }
        else{
            imageI = new ImageIcon(image);
        }

        Image photoI = imageI.getImage();
        photoI = photoI.getScaledInstance(photo.getWidth(), photo.getHeight(), Image.SCALE_SMOOTH);
        return new ImageIcon(photoI);
    }

    private void addPhotoActionPerformed(java.awt.event.ActionEvent evt) {
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File("user.home"));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.images", "jpg","png");
        file.addChoosableFileFilter(filter);
        int result = file.showSaveDialog(null);

        if(result == JFileChooser.APPROVE_OPTION){
            File selectedImage = file.getSelectedFile();
            String imagePath = selectedImage.getAbsolutePath();
            photo.setIcon(ResizeImageIcon(imagePath, null));
            this.imagePath = imagePath;
        }
        else{
            JOptionPane.showMessageDialog(null, "File is not selected.", "File Error!",2);
        }
    }

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {
        String nameS = name.getText().trim();
        String nickNameS = nickName.getText().trim();
        String mailS = mail.getText().trim();
        String passwordHash = BCrypt.hashpw(String.valueOf(password.getPassword()).trim(), BCrypt.gensalt());
        String phoneS = phone.getText().trim().replace(" ", "");

        if(nameS.equals("") || nickNameS.equals("") || mailS.equals("") || String.valueOf(password.getPassword()).trim().equals("")){
            JOptionPane.showMessageDialog(null, "Necessary (*) fields cannot be left blank.", "Blank Error!",2);
        }
        else if(phoneS.length() != 12 && phoneS.length() > 2){
            JOptionPane.showMessageDialog(null, "Phone number is wrong. It should be 12 digit (with 90).", "Phone Number Error!",2);
        }
        else if(db.getMemberWithNickName(nickNameS) != null){
            JOptionPane.showMessageDialog(null, "Nickname is already taken.", "Nickname Error!",2);
        }
        else if(db.getMemberWithMail(mailS) != null){
            JOptionPane.showMessageDialog(null, "E-mail address is being used.", "E-mail Error!",2);
        }
        else{
            Member member;
            byte[] photoByte = null;
            if(this.imagePath != null){
                File imageFile = new File(this.imagePath);
                InputStream imageInputStream;
                try {
                    imageInputStream = new FileInputStream(imageFile);
                    photoByte = new byte[(int) imageFile.length()];
                    imageInputStream.read(photoByte);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Kayit.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Kayit.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            member = new Member(nameS,nickNameS, mailS, passwordHash, phoneS, photoByte);
            db.addMember(member);
            JOptionPane.showMessageDialog(null, "Successfully Registered.");
            Giris g = new Giris();
            setVisible(false);
            g.setVisible(true);
        }
    }

    private void signInActionPerformed(java.awt.event.ActionEvent evt) {
        Giris g = new Giris();
        setVisible(false);
        g.setVisible(true);
    }

    private void deletePhotoActionPerformed(java.awt.event.ActionEvent evt) {
        this.imagePath = null;
        photo.setIcon(null);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Kayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kayit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton addPhoto;
    private javax.swing.JButton deletePhoto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField mail;
    private javax.swing.JTextField name;
    private javax.swing.JTextField nickName;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField phone;
    private javax.swing.JLabel photo;
    private javax.swing.JTextField plus;
    private javax.swing.JButton register;
    private javax.swing.JButton signIn;
    // End of variables declaration
}
