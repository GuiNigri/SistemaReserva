/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.LogController;
import Controller.ReservaController;
import Controller.RotaController;
import Controller.UsuarioController;
import Repository.LogRepository;
import Repository.ReservaRepository;
import Repository.RotaRepository;
import Repository.UsuarioRepository;
import ViewModel.RotaViewModel;
import entity.ReservaModel;
import entity.UsuarioModel;
import exceptions.ReservaExceptions;
import java.util.List;
import java.util.UUID;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sistemareserva.services.LogService;
import sistemareserva.services.ReservaService;
import sistemareserva.services.RotaService;
import sistemareserva.services.UsuarioService;

/**
 *
 * @author Nigri
 */
public class HomeView extends javax.swing.JFrame {

    private ReservaController _reservaController;
    private UsuarioController _usuarioController;
    private RotaController _rotaController;
    private LogController _logController;

    public static boolean Logado = false;
    public static UsuarioModel usuarioLogado;

    /**
     * Creates new form HomeView
     */
    public HomeView() {
        inicializarDependencias();
        initComponents();

        getAllRotas();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableRotas = new javax.swing.JTable();
        btnReservar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnLogs = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuEntrar = new javax.swing.JMenuItem();
        menuCadastrar = new javax.swing.JMenuItem();
        menuMinhasReservas = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableRotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "teste"
            }
        ));
        jScrollPane1.setViewportView(tableRotas);
        if (tableRotas.getColumnModel().getColumnCount() > 0) {
            tableRotas.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        btnReservar.setText("Reservar");
        btnReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ROTAS");

        btnLogs.setText("Logs");
        btnLogs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogsActionPerformed(evt);
            }
        });

        jMenu1.setText("Usuario");
        jMenu1.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu1MenuSelected(evt);
            }
        });
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        menuEntrar.setText("Entrar");
        menuEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEntrarActionPerformed(evt);
            }
        });
        jMenu1.add(menuEntrar);

        menuCadastrar.setText("Cadastrar");
        menuCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarActionPerformed(evt);
            }
        });
        jMenu1.add(menuCadastrar);

        menuMinhasReservas.setText("Minhas Reservas");
        menuMinhasReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMinhasReservasActionPerformed(evt);
            }
        });
        jMenu1.add(menuMinhasReservas);

        menuSair.setText("Sair");
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        jMenu1.add(menuSair);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 771, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnLogs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReservar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnReservar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(btnLogs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservarActionPerformed
        // TODO add your handling code here:
        if (!Logado) {
            JOptionPane.showMessageDialog(null, "Necessario estar logado para reservar uma rota!");
            return;
        }
        
        int row = tableRotas.getSelectedRow();
        if (row >= 0) {

            try {
                UUID id = UUID.fromString(tableRotas.getValueAt(row, 0).toString());
                _reservaController.createReserva(new ReservaModel(id, usuarioLogado.getId()));

                JOptionPane.showMessageDialog(null, "Reservado com sucesso");
            } catch (ReservaExceptions ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Selecione uma rota da lista");
        }
    }//GEN-LAST:event_btnReservarActionPerformed

    private void menuCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarActionPerformed
        // TODO add your handling code here:
        CadastrarView cadastrarView = new CadastrarView();
        cadastrarView.inicializarDependencia(_usuarioController);
        cadastrarView.setVisible(true);
    }//GEN-LAST:event_menuCadastrarActionPerformed

    private void menuMinhasReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMinhasReservasActionPerformed
        // TODO add your handling code here:
        ReservaView reservasForm = new ReservaView();
        reservasForm.getReservas(_reservaController);
        reservasForm.setVisible(true);
    }//GEN-LAST:event_menuMinhasReservasActionPerformed

    private void menuEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEntrarActionPerformed
        LoginView loginView = new LoginView();
        loginView.inicializarDependencias(_usuarioController);
        loginView.setVisible(true);
    }//GEN-LAST:event_menuEntrarActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenu1MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu1MenuSelected
        // TODO add your handling code here:
        if (Logado) {
            menuEntrar.setVisible(false);
            menuCadastrar.setVisible(false);
            menuMinhasReservas.setVisible(true);
            menuSair.setVisible(true);
        } else {
            menuEntrar.setVisible(true);
            menuCadastrar.setVisible(true);
            menuMinhasReservas.setVisible(false);
            menuSair.setVisible(false);
        }
    }//GEN-LAST:event_jMenu1MenuSelected

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        // TODO add your handling code here:
        Logado = false;
    }//GEN-LAST:event_menuSairActionPerformed

    private void btnLogsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogsActionPerformed
        // TODO add your handling code here:
        LogsView logsView = new LogsView();
        logsView.getLogs(_logController);
        logsView.setVisible(true);
    }//GEN-LAST:event_btnLogsActionPerformed

    private void getAllRotas() {
        List<RotaViewModel> rotas = _rotaController.getAll();
        DefaultTableModel tabela = new DefaultTableModel();

        tabela.addColumn("");
        tabela.addColumn("Origem");
        tabela.addColumn("Destino");
        tabela.addColumn("Valor");

        if (!rotas.isEmpty()) {

            for (RotaViewModel model : rotas) {
                tabela.addRow(new Object[]{model.getID(), model.getOrigem(), model.getDestino(), model.getValor()});
            }
        }

        tableRotas.setModel(tabela);
        tableRotas.getColumnModel().getColumn(0).setMaxWidth(0);
        tableRotas.getColumnModel().getColumn(0).setResizable(false);
    }

    private void inicializarDependencias() {
        LogRepository logRepository = new LogRepository();
        LogService logService = new LogService(logRepository);
        _logController = new LogController(logService);
        
        ReservaRepository repository = new ReservaRepository();
        ReservaService service = new ReservaService(repository,logRepository);

        UsuarioRepository usuarioRepository = new UsuarioRepository();
        UsuarioService usuarioService = new UsuarioService(usuarioRepository,logRepository);
        _usuarioController = new UsuarioController(usuarioService);

        RotaRepository rotaRepository = new RotaRepository();
        RotaService rotaService = new RotaService(rotaRepository);
        _rotaController = new RotaController(rotaService);

        _reservaController = new ReservaController(service, rotaService);
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
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogs;
    private javax.swing.JButton btnReservar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem menuCadastrar;
    private javax.swing.JMenuItem menuEntrar;
    private javax.swing.JMenuItem menuMinhasReservas;
    private javax.swing.JMenuItem menuSair;
    private javax.swing.JTable tableRotas;
    // End of variables declaration//GEN-END:variables
}
