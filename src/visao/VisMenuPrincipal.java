/*
 * VisMenuPrincipal.java
 *
 * Created on 02/05/2011, 20:24:20
 */
package visao;

import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;

/**
 * Classe VisMenuPrincipal da camada de visao
 * 
 * @version 2.3 beta
 * @author Matheus Souza da Silva
 * @since 02/05/2011
 */
public class VisMenuPrincipal extends javax.swing.JFrame implements InternalFrameListener 
{
    private boolean flagGuiMulta = false, flagGuiEndereco = false, flagGuiCondutor = false;
    private boolean flagGuiAutomovel = false, flagGuiUsuario = false, flagGuiDeletarCondutor = false;
    private boolean flagGuiDeletarEndereco = false, flagGuiManutencaoMulta = false, flagGuiManutencaoAutomovel = false;
   
    /**
    *
    * Método construtor do menu principal
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    */
    public VisMenuPrincipal() 
    {
        initComponents();
        setTitle("Detran 2.3 beta");    
    }//public VisMenuPrincipal() 

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jAreaDeTrabalho = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmCadastro = new javax.swing.JMenu();
        jmiMulta = new javax.swing.JMenuItem();
        jmiAutomovel = new javax.swing.JMenuItem();
        jmiCondutor = new javax.swing.JMenuItem();
        jmiEndereco = new javax.swing.JMenuItem();
        jmiDeletar = new javax.swing.JMenu();
        jmiDeletarCondutor = new javax.swing.JMenuItem();
        jmiDeletarEndereco = new javax.swing.JMenuItem();
        jmManutencao = new javax.swing.JMenu();
        jmiManutencaoMulta = new javax.swing.JMenuItem();
        jmiManutencaoAutomovel = new javax.swing.JMenuItem();
        jmLogin = new javax.swing.JMenu();
        jmiLogarNovamente = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmiSair = new javax.swing.JMenuItem();
        jmMenuUsuarioComum = new javax.swing.JMenu();
        jmMenuAdm = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jmCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/add.png"))); // NOI18N
        jmCadastro.setText("Cadastrar");

        jmiMulta.setText("Multa");
        jmiMulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiMultaActionPerformed(evt);
            }
        });
        jmCadastro.add(jmiMulta);

        jmiAutomovel.setText("Automovel");
        jmiAutomovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAutomovelActionPerformed(evt);
            }
        });
        jmCadastro.add(jmiAutomovel);

        jmiCondutor.setText("Condutor");
        jmiCondutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCondutorActionPerformed(evt);
            }
        });
        jmCadastro.add(jmiCondutor);

        jmiEndereco.setText("Endereco");
        jmiEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEnderecoActionPerformed(evt);
            }
        });
        jmCadastro.add(jmiEndereco);

        jMenuBar1.add(jmCadastro);

        jmiDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/delete.png"))); // NOI18N
        jmiDeletar.setText("Deletar");

        jmiDeletarCondutor.setText("Condutor");
        jmiDeletarCondutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiDeletarCondutorActionPerformed(evt);
            }
        });
        jmiDeletar.add(jmiDeletarCondutor);

        jmiDeletarEndereco.setText("Endereco");
        jmiDeletarEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiDeletarEnderecoActionPerformed(evt);
            }
        });
        jmiDeletar.add(jmiDeletarEndereco);

        jMenuBar1.add(jmiDeletar);

        jmManutencao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/manutensao.png"))); // NOI18N
        jmManutencao.setText("Manutenção");

        jmiManutencaoMulta.setText("Multa");
        jmiManutencaoMulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiManutencaoMultaActionPerformed(evt);
            }
        });
        jmManutencao.add(jmiManutencaoMulta);

        jmiManutencaoAutomovel.setText("Automovel");
        jmiManutencaoAutomovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiManutencaoAutomovelActionPerformed(evt);
            }
        });
        jmManutencao.add(jmiManutencaoAutomovel);

        jMenuBar1.add(jmManutencao);

        jmLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/door_in.png"))); // NOI18N
        jmLogin.setText("Login");

        jmiLogarNovamente.setText("Logar Com Outro Usuario");
        jmiLogarNovamente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiLogarNovamenteActionPerformed(evt);
            }
        });
        jmLogin.add(jmiLogarNovamente);
        jmLogin.add(jSeparator1);

        jmiSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/sair.png"))); // NOI18N
        jmiSair.setText("Sair");
        jmiSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSairActionPerformed(evt);
            }
        });
        jmLogin.add(jmiSair);

        jMenuBar1.add(jmLogin);

        jmMenuUsuarioComum.setText("Menu Usuario Comum");
        jMenuBar1.add(jmMenuUsuarioComum);

        jmMenuAdm.setText("MenuAdministrador");
        jMenuBar1.add(jmMenuAdm);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jAreaDeTrabalho, javax.swing.GroupLayout.DEFAULT_SIZE, 1010, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jAreaDeTrabalho, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
    *
    * Método que instancia a interface de login
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    */
    private void jmiLogarNovamenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiLogarNovamenteActionPerformed
        VisLogin gl = new VisLogin();
        gl.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jmiLogarNovamenteActionPerformed

    /**
    *
    * Método que instancia a interface corresponde ao tipo de usuario logado
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @param opcao Armazena o tipo de usuario 
    */
    public void montaMenu(int opcao) 
    {
        if (opcao == 1) {
            this.menuAdministrador();
        } else if (opcao == 2) {
            this.menuUsuarioComun();
        } else {
            System.exit(0);
        }//if (opcao == 1) {
    }//public void montaMenu(int opcao) 

    /**
    *
    * Método que mostra apenas os menus do usuario adminstrador
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    */
    private void menuAdministrador()
    {
        jmMenuUsuarioComum.setVisible(false);
    }//private void menuAdministrador()

    /**
    *
    * Método que mostra apenas os menus do usuario comum
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    */
    private void menuUsuarioComun()
    {
        jmMenuAdm.setVisible(false);
        jmiDeletar.setVisible(false);
        jmManutencao.setVisible(false);
    }//private void menuUsuarioComun()

    /**
    *
    * Método que instancia a interface da multa
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    */
    private void jmiMultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiMultaActionPerformed
        if (!flagGuiMulta) {
            VisMulta gm = new VisMulta();
            gm.setVisible(true);
            flagGuiMulta = true;
            jAreaDeTrabalho.add(gm);
            gm.addInternalFrameListener(this);
        }//if (!flagGuiMulta) {
    }//GEN-LAST:event_jmiMultaActionPerformed

    /**
    *
    * Método que instancia a interface de manutenção da multa
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    */
    private void jmiManutencaoMultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiManutencaoMultaActionPerformed
        if (!flagGuiManutencaoMulta) {
            VisManutencaoMulta gmm = new VisManutencaoMulta();
            gmm.setVisible(true);
            flagGuiManutencaoMulta = true;
            jAreaDeTrabalho.add(gmm);
            gmm.addInternalFrameListener(this);
        }//if (!flagGuiManutencaoMulta) {
    }//GEN-LAST:event_jmiManutencaoMultaActionPerformed

    /**
    *
    * Método que instancia a interface do automovel
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    */
    private void jmiAutomovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAutomovelActionPerformed
        if (!flagGuiAutomovel) {
            VisAutomovel ga = new VisAutomovel();
            ga.setVisible(true);
            flagGuiAutomovel = true;
            jAreaDeTrabalho.add(ga);
            ga.addInternalFrameListener(this);
        }//if (!flagGuiAutomovel) {
    }//GEN-LAST:event_jmiAutomovelActionPerformed

    /**
    *
    * Método que instancia a interface do condutor
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    */
    private void jmiCondutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCondutorActionPerformed
        if (!flagGuiCondutor) {
            VisCondutor gc = new VisCondutor();
            gc.setVisible(true);
            flagGuiCondutor = true;
            jAreaDeTrabalho.add(gc);
            gc.addInternalFrameListener(this);
        }//if (!flagGuiCondutor) {
    }//GEN-LAST:event_jmiCondutorActionPerformed

    /**
    *
    * Método que fecha a aplicação
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    */
    private void jmiSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jmiSairActionPerformed

    /**
    *
    * Método que instancia a interface do endereco
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    */
    private void jmiEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEnderecoActionPerformed
        if (!flagGuiEndereco) {
            VisEndereco ge = new VisEndereco();
            ge.setVisible(true);
            flagGuiEndereco = true;
            jAreaDeTrabalho.add(ge);
            ge.addInternalFrameListener(this);
        }//if (!flagGuiEndereco) {
    }//GEN-LAST:event_jmiEnderecoActionPerformed

    /**
    *
    * Método que instancia a interface do manutenção do automovel
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    */
    private void jmiManutencaoAutomovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiManutencaoAutomovelActionPerformed
        if (!flagGuiManutencaoAutomovel) {
            VisManutencaoAutomovel gmm = new VisManutencaoAutomovel();
            gmm.setVisible(true);
            flagGuiManutencaoAutomovel = true;
            jAreaDeTrabalho.add(gmm);
            gmm.addInternalFrameListener(this);
        }//if (!flagGuiManutencaoAutomovel) {
    }//GEN-LAST:event_jmiManutencaoAutomovelActionPerformed

    /**
    *
    * Método que instancia a interface do exclusão do condutor
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    */
    private void jmiDeletarCondutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiDeletarCondutorActionPerformed
        if (!flagGuiDeletarCondutor) {
            VisDeletarCondutor gdc = new VisDeletarCondutor();
            gdc.setVisible(true);
            flagGuiDeletarCondutor = true;
            jAreaDeTrabalho.add(gdc);
            gdc.addInternalFrameListener(this);
        }//if (!flagGuiDeletarCondutor) {
    }//GEN-LAST:event_jmiDeletarCondutorActionPerformed

     /**
    *
    * Método que instancia a interface do exclusão do endereco
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    */
    private void jmiDeletarEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiDeletarEnderecoActionPerformed
        if (!flagGuiDeletarEndereco) {
            VisDeletarEndereco gde = new VisDeletarEndereco();
            gde.setVisible(true);
            flagGuiDeletarEndereco = true;
            jAreaDeTrabalho.add(gde);
            gde.addInternalFrameListener(this);
        }//if (!flagGuiDeletarEndereco) {
    }//GEN-LAST:event_jmiDeletarEnderecoActionPerformed
    
    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VisMenuPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jAreaDeTrabalho;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu jmCadastro;
    private javax.swing.JMenu jmLogin;
    private javax.swing.JMenu jmManutencao;
    private javax.swing.JMenu jmMenuAdm;
    private javax.swing.JMenu jmMenuUsuarioComum;
    private javax.swing.JMenuItem jmiAutomovel;
    private javax.swing.JMenuItem jmiCondutor;
    private javax.swing.JMenu jmiDeletar;
    private javax.swing.JMenuItem jmiDeletarCondutor;
    private javax.swing.JMenuItem jmiDeletarEndereco;
    private javax.swing.JMenuItem jmiEndereco;
    private javax.swing.JMenuItem jmiLogarNovamente;
    private javax.swing.JMenuItem jmiManutencaoAutomovel;
    private javax.swing.JMenuItem jmiManutencaoMulta;
    private javax.swing.JMenuItem jmiMulta;
    private javax.swing.JMenuItem jmiSair;
    // End of variables declaration//GEN-END:variables
  public void internalFrameOpened(InternalFrameEvent ife) {
    }
    public void internalFrameClosing(InternalFrameEvent ife) {
    }
    public void internalFrameClosed(InternalFrameEvent ife) {
        if(ife.getInternalFrame() instanceof VisMulta){
            flagGuiMulta = false;
            
            }else if(ife.getInternalFrame() instanceof VisManutencaoMulta){
            flagGuiManutencaoMulta = false;
            
        }else if(ife.getInternalFrame() instanceof VisEndereco){
        flagGuiEndereco = false;
            
            }else if(ife.getInternalFrame() instanceof VisDeletarEndereco){
            flagGuiDeletarEndereco = false;
            
        }else if(ife.getInternalFrame() instanceof VisCondutor){
        flagGuiCondutor = false;
            
            }else if(ife.getInternalFrame() instanceof VisDeletarCondutor){
            flagGuiDeletarCondutor = false;
            
        }else if(ife.getInternalFrame() instanceof VisAutomovel){
        flagGuiAutomovel = false;
            
            }else if(ife.getInternalFrame() instanceof VisManutencaoAutomovel){
            flagGuiManutencaoAutomovel = false;
            
        }
    }

    public void internalFrameIconified(InternalFrameEvent ife) {
    }

    public void internalFrameDeiconified(InternalFrameEvent ife) {
    }

    public void internalFrameActivated(InternalFrameEvent ife) {
    }
    
    public void internalFrameDeactivated(InternalFrameEvent ife) {
    }
}