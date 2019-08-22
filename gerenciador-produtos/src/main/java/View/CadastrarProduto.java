package View;

import Controller.ProdutoController;
import java.util.ArrayList;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mikael
 */
public class CadastrarProduto extends javax.swing.JFrame {
    /**
     * Creates new form cadastrarProduto
     */
    int numero;
    
    public CadastrarProduto() {
        initComponents();
        
        
        this.setLocationRelativeTo(null);
        DesabilitarFormulario();
    }
    
    public void LoadTable(){
        
        //Peço ao controller resgatar os clientes do banco de dados
        ArrayList<String[]> linhasProdutos = ProdutoController.getProdutos();
        
        DefaultTableModel tmProdutos = new DefaultTableModel();
        tmProdutos.addColumn("codigoProduto");
        tmProdutos.addColumn("descricaoProduto");
        tmProdutos.addColumn("quantidadeProduto");
        tmProdutos.addColumn("valorUni");
        tmProdutos.addColumn("categoriaProduto");
        
        for(String[] c:linhasProdutos)
        {
            tmProdutos.addRow(c);
        }
    }
    
    public void DesabilitarFormulario(){
    txtCodigoCadProduto.setEditable(false);
    txtCodigoCadProduto.setEnabled(false);
    
    }
    
    public void LimparFormulario()
    {
        txtCodigoCadProduto.setText("");
        txtDescricaoProduto.setText("");
        txtQuantidade.setText("");
        txtNomeProduto.setText("");
        txtValorCompra.setText("");
        txtValorVenda.setText("");
        
        cboCategoriaProduto.setSelectedIndex(0);
    }
    
    private boolean ValidarFormulario() {
    
    /*if(this.txtCodigoCadProduto.getText().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(this,"Defina um codigo para o produto!");
            return false;
        }     */
    if(this.txtNomeProduto.getText().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(this,"Defina um nome para o produto!");
            return false;
        }
    
    if(this.txtDescricaoProduto.getText().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(this,"Defina um descrição para o produto!");
            return false;
        }    
        
    
    if(this.txtQuantidade.getText().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(this,"Defina uma quantidade para o produto!");
            return false;
        }   
        
    
     if(this.txtValorCompra.getText().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(this,"Defina um valor de compra para o produto!");
            return false;
        }      
     if(this.txtValorVenda.getText().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(this,"Defina um valor de venda para o produto!");
            return false;
        } 
    
    return true;
    
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCadastrarProduto = new javax.swing.JPanel();
        btnSalvarProduto = new javax.swing.JButton();
        btnLimparProduto = new javax.swing.JButton();
        pnlCadastrarPr = new javax.swing.JPanel();
        lblCodigoCadProduto = new javax.swing.JLabel();
        lblValorUnitario = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();
        txtCodigoCadProduto = new javax.swing.JTextField();
        cboCategoriaProduto = new javax.swing.JComboBox<String>();
        lblQuantidade = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        lblDescricao = new javax.swing.JLabel();
        txtDescricaoProduto = new javax.swing.JTextField();
        txtValorCompra = new javax.swing.JFormattedTextField();
        lblCodigoCadProduto1 = new javax.swing.JLabel();
        txtNomeProduto = new javax.swing.JTextField();
        lblValorUnitario1 = new javax.swing.JLabel();
        txtValorVenda = new javax.swing.JFormattedTextField();
        chkDisponivel = new javax.swing.JCheckBox();
        btnCancelarProduto1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastrar Produto");

        btnSalvarProduto.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnSalvarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/save.png"))); // NOI18N
        btnSalvarProduto.setText("Salvar");
        btnSalvarProduto.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnSalvarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarProdutoActionPerformed(evt);
            }
        });

        btnLimparProduto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnLimparProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/limpar(1).png"))); // NOI18N
        btnLimparProduto.setText("Limpar");
        btnLimparProduto.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnLimparProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparProdutoActionPerformed(evt);
            }
        });

        pnlCadastrarPr.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastrar Produto", 0, 0, new java.awt.Font("Arial", 1, 14))); // NOI18N

        lblCodigoCadProduto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblCodigoCadProduto.setText("Código:");

        lblValorUnitario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblValorUnitario.setText("Valor de compra");

        lblCategoria.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblCategoria.setText("Categoria:");

        txtCodigoCadProduto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtCodigoCadProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoCadProdutoActionPerformed(evt);
            }
        });

        cboCategoriaProduto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cboCategoriaProduto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Escolha uma categoria", "Meninas", "Meninos", "Colecionáveis", "Eletrônicos", "Pelúcias", "Tabuleiro", " ", " ", " " }));
        cboCategoriaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCategoriaProdutoActionPerformed(evt);
            }
        });

        lblQuantidade.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblQuantidade.setText("Quantidade:");

        txtQuantidade.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantidadeActionPerformed(evt);
            }
        });

        lblDescricao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblDescricao.setText("Descrição:");

        txtDescricaoProduto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtDescricaoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoProdutoActionPerformed(evt);
            }
        });

        txtValorCompra.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        txtValorCompra.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtValorCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorCompraActionPerformed(evt);
            }
        });

        lblCodigoCadProduto1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblCodigoCadProduto1.setText("Nome:");

        txtNomeProduto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtNomeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeProdutoActionPerformed(evt);
            }
        });

        lblValorUnitario1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblValorUnitario1.setText("Valor de venda");

        txtValorVenda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        txtValorVenda.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtValorVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorVendaActionPerformed(evt);
            }
        });

        chkDisponivel.setText("Disponivel");
        chkDisponivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkDisponivelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCadastrarPrLayout = new javax.swing.GroupLayout(pnlCadastrarPr);
        pnlCadastrarPr.setLayout(pnlCadastrarPrLayout);
        pnlCadastrarPrLayout.setHorizontalGroup(
            pnlCadastrarPrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastrarPrLayout.createSequentialGroup()
                .addGroup(pnlCadastrarPrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCadastrarPrLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(pnlCadastrarPrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDescricao, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCodigoCadProduto, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlCadastrarPrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDescricaoProduto)
                            .addGroup(pnlCadastrarPrLayout.createSequentialGroup()
                                .addComponent(txtCodigoCadProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(pnlCadastrarPrLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lblCodigoCadProduto1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlCadastrarPrLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlCadastrarPrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCadastrarPrLayout.createSequentialGroup()
                                .addComponent(lblQuantidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlCadastrarPrLayout.createSequentialGroup()
                                .addComponent(lblValorUnitario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(53, 53, 53)
                        .addGroup(pnlCadastrarPrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCadastrarPrLayout.createSequentialGroup()
                                .addComponent(lblCategoria)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboCategoriaProduto, 0, 268, Short.MAX_VALUE))
                            .addGroup(pnlCadastrarPrLayout.createSequentialGroup()
                                .addComponent(lblValorUnitario1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(chkDisponivel)
                                .addGap(25, 25, 25)))))
                .addContainerGap())
        );
        pnlCadastrarPrLayout.setVerticalGroup(
            pnlCadastrarPrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastrarPrLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCadastrarPrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoCadProduto)
                    .addComponent(txtCodigoCadProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCadastrarPrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoCadProduto1)
                    .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCadastrarPrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescricao)
                    .addComponent(txtDescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCadastrarPrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQuantidade)
                    .addGroup(pnlCadastrarPrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCategoria)
                        .addComponent(cboCategoriaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(pnlCadastrarPrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValorUnitario)
                    .addComponent(txtValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlCadastrarPrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblValorUnitario1)
                        .addComponent(txtValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(chkDisponivel)))
                .addContainerGap())
        );

        lblValorUnitario1.getAccessibleContext().setAccessibleName("Valor de venda");

        btnCancelarProduto1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnCancelarProduto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/sair.png"))); // NOI18N
        btnCancelarProduto1.setText("Cancelar");
        btnCancelarProduto1.setHideActionText(true);
        btnCancelarProduto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarProduto1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCadastrarProdutoLayout = new javax.swing.GroupLayout(pnlCadastrarProduto);
        pnlCadastrarProduto.setLayout(pnlCadastrarProdutoLayout);
        pnlCadastrarProdutoLayout.setHorizontalGroup(
            pnlCadastrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastrarProdutoLayout.createSequentialGroup()
                .addGroup(pnlCadastrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCadastrarProdutoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlCadastrarPr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlCadastrarProdutoLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnSalvarProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 366, Short.MAX_VALUE)
                        .addComponent(btnLimparProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelarProduto1)))
                .addContainerGap())
        );
        pnlCadastrarProdutoLayout.setVerticalGroup(
            pnlCadastrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastrarProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlCadastrarPr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(pnlCadastrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLimparProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalvarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(btnCancelarProduto1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnlCadastrarProdutoLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnLimparProduto, btnSalvarProduto});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlCadastrarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlCadastrarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDescricaoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescricaoProdutoActionPerformed

    private void btnSalvarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarProdutoActionPerformed
            if(txtCodigoCadProduto.getText().equals("")){
            if(ValidarFormulario())
            {
                if(ProdutoController.Salvar(
                        txtNomeProduto.getText()
                        ,txtDescricaoProduto.getText()
                        , Double.parseDouble(txtValorCompra.getText().replace(",", "."))
                        , Double.parseDouble(txtValorVenda.getText().replace(",", "."))
                        , Integer.parseInt(txtQuantidade.getText())
                        , chkDisponivel.isSelected()
                        //,cboCategoriaProduto.getSelectedItem().toString()
                    )
                )
                {
                    JOptionPane.showMessageDialog(null,"Produto cadastrado com sucesso!");
                    YesNoOption("Deseja salvar mais produtos?");
                    if(numero == 0){
                    CadastrarProduto form2 = new CadastrarProduto();
                    form2.setVisible(true);
                    }else{
                    AtualizarExcluirProduto form2 = new AtualizarExcluirProduto();  
                    form2.setVisible(true);
                    }
                    
           dispose();
                }else{
                    JOptionPane.showMessageDialog(null,"Falha ao cadastrar produto!");
                    LimparFormulario();
                }
            }
        }
        
        else{
            if(ProdutoController.Atualizar(
                        Integer.parseInt(txtCodigoCadProduto.getText())
                        ,txtNomeProduto.getText()
                        ,txtDescricaoProduto.getText()
                        , Double.parseDouble(txtValorCompra.getText().replace(",", "."))
                        , Double.parseDouble(txtValorVenda.getText().replace(",", "."))
                        , Integer.parseInt(txtQuantidade.getText())
                        , chkDisponivel.isSelected()
                    )
                )
        {
            JOptionPane.showMessageDialog(this,"Produto atualizado com sucesso!");
            AtualizarExcluirProduto form2 = new AtualizarExcluirProduto();  
            form2.setVisible(true);  
            dispose();
        }else{
            JOptionPane.showMessageDialog(this,"Falha ao atualizar produto!");
        } 
        }
    }//GEN-LAST:event_btnSalvarProdutoActionPerformed

    private void txtValorCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorCompraActionPerformed
      
    }//GEN-LAST:event_txtValorCompraActionPerformed

    private void txtQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantidadeActionPerformed

    private void btnLimparProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparProdutoActionPerformed
        LimparFormulario();
    }//GEN-LAST:event_btnLimparProdutoActionPerformed

    private void btnCancelarProduto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarProduto1ActionPerformed
        // TODO add your handling code here:
         AtualizarExcluirProduto form2 = new AtualizarExcluirProduto();  
        form2.setVisible(true);  
        dispose();
    }//GEN-LAST:event_btnCancelarProduto1ActionPerformed

    private void txtCodigoCadProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoCadProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoCadProdutoActionPerformed

    private void cboCategoriaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCategoriaProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboCategoriaProdutoActionPerformed

    private void txtNomeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeProdutoActionPerformed

    private void txtValorVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorVendaActionPerformed

    private void chkDisponivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkDisponivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkDisponivelActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarProduto1;
    private javax.swing.JButton btnLimparProduto;
    private javax.swing.JButton btnSalvarProduto;
    private javax.swing.JComboBox<String> cboCategoriaProduto;
    private javax.swing.JCheckBox chkDisponivel;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblCodigoCadProduto;
    private javax.swing.JLabel lblCodigoCadProduto1;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JLabel lblValorUnitario;
    private javax.swing.JLabel lblValorUnitario1;
    private javax.swing.JPanel pnlCadastrarPr;
    private javax.swing.JPanel pnlCadastrarProduto;
    private javax.swing.JTextField txtCodigoCadProduto;
    private javax.swing.JTextField txtDescricaoProduto;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JFormattedTextField txtValorCompra;
    private javax.swing.JFormattedTextField txtValorVenda;
    // End of variables declaration//GEN-END:variables
  
    
  public void receberValores(String codigo, String descricao,String quantidade,String valorCompra,String valorVenda, String disponivel){
        txtCodigoCadProduto.setText(String.valueOf(codigo));
        txtDescricaoProduto.setText(String.valueOf(descricao));
        txtQuantidade.setText(String.valueOf(quantidade));
        txtValorCompra.setText(String.valueOf(valorCompra));
        txtValorVenda.setText(String.valueOf(valorVenda));
        chkDisponivel.setSelected((disponivel.equals("true")));
        
    }
 
 public int YesNoOption(String MensagemSalvarMaisUm){
        int numero1 = JOptionPane.showConfirmDialog(null,MensagemSalvarMaisUm,"Inserir mais Produtos?",JOptionPane.YES_NO_OPTION);
        return numero1;
    }



}
