/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcguipractice;

import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Burga
 */
public class gui extends javax.swing.JFrame {
 
    // numbers es utilizado para mostrar los numeros y los resultados de las operaciones
    // ademas de servir de almacenador para realizar operaciones conjuntas
    private String numbers = new String();
    private boolean checkPoint,activePlus,activeMultiply,activeDivide;//saber si se ha activado alguna operacion
                                                                    //sirve para realizar operaciones conjuntas
    //objeto que contiene los metodos con las operaciones 
    Calc process = new Calc();                                      
    /**
     * Creates new form gui
     */
    public gui() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        showNumberAndResult = new javax.swing.JLabel();
        B_2 = new javax.swing.JButton();
        B_4 = new javax.swing.JButton();
        B_5 = new javax.swing.JButton();
        B_3 = new javax.swing.JButton();
        B_1 = new javax.swing.JButton();
        B_6 = new javax.swing.JButton();
        B_7 = new javax.swing.JButton();
        B_8 = new javax.swing.JButton();
        B_9 = new javax.swing.JButton();
        B_result = new javax.swing.JButton();
        B_plus = new javax.swing.JButton();
        B_substrac = new javax.swing.JButton();
        B_multiply = new javax.swing.JButton();
        B_divide = new javax.swing.JButton();
        B_point = new javax.swing.JButton();
        B_0 = new javax.swing.JButton();
        B_deleteOne = new javax.swing.JButton();
        B_cleanALL = new javax.swing.JButton();
        name = new javax.swing.JLabel();

        jButton5.setText("jButton1");

        jButton7.setText("jButton1");

        jButton15.setText("+");

        jButton16.setText("+");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        showNumberAndResult.setBackground(new java.awt.Color(129, 137, 133));
        showNumberAndResult.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        showNumberAndResult.setForeground(new java.awt.Color(0, 0, 0));
        showNumberAndResult.setHorizontalAlignment(SwingConstants.RIGHT);
        showNumberAndResult.setBorder(new EmptyBorder(10, 10, 10, 10));

        B_2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        B_2.setText("2");
        B_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_2ActionPerformed(evt);
            }
        });

        B_4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        B_4.setText("4");
        B_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_4ActionPerformed(evt);
            }
        });

        B_5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        B_5.setText("5");
        B_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_5ActionPerformed(evt);
            }
        });

        B_3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        B_3.setText("3");
        B_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_3ActionPerformed(evt);
            }
        });

        B_1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        B_1.setText("1");
        B_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_1ActionPerformed(evt);
            }
        });

        B_6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        B_6.setText("6");
        B_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_6ActionPerformed(evt);
            }
        });

        B_7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        B_7.setText("7");
        B_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_7ActionPerformed(evt);
            }
        });

        B_8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        B_8.setText("8");
        B_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_8ActionPerformed(evt);
            }
        });

        B_9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        B_9.setText("9");
        B_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_9ActionPerformed(evt);
            }
        });

        B_result.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        B_result.setText("=");
        B_result.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_resultActionPerformed(evt);
            }
        });

        B_plus.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        B_plus.setText("+");
        B_plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_plusActionPerformed(evt);
            }
        });

        B_substrac.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        B_substrac.setText("-");
        B_substrac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_substracActionPerformed(evt);
            }
        });

        B_multiply.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        B_multiply.setText("x");
        B_multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_multiplyActionPerformed(evt);
            }
        });

        B_divide.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        B_divide.setText("/");
        B_divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_divideActionPerformed(evt);
            }
        });

        B_point.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        B_point.setText(".");
        B_point.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_pointActionPerformed(evt);
            }
        });

        B_0.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        B_0.setText("0");
        B_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_0ActionPerformed(evt);
            }
        });

        B_deleteOne.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        B_deleteOne.setText("←");
        B_deleteOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_deleteOneActionPerformed(evt);
            }
        });

        B_cleanALL.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        B_cleanALL.setText("C");
        B_cleanALL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_cleanALLActionPerformed(evt);
            }
        });

        name.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        name.setText("LA CALCUBURGA 1.0");
        name.setHorizontalAlignment(SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(showNumberAndResult, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(B_4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B_5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B_6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(B_7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(B_0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(B_8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(B_9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(B_point, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(B_result, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(B_deleteOne, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(B_cleanALL, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(B_1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B_2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B_3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(B_plus, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(B_substrac, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(B_multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(B_divide, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(showNumberAndResult, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(B_2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B_3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B_1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(B_4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B_5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B_6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(B_plus, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B_substrac, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B_multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B_divide, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B_7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B_8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B_9, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B_result, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B_point, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B_0, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B_cleanALL, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B_deleteOne, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_2ActionPerformed
        numbers += B_2.getText();
        showNumberAndResult.setText(numbers);
    }//GEN-LAST:event_B_2ActionPerformed

    private void B_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_1ActionPerformed
        numbers += B_1.getText();
        showNumberAndResult.setText(numbers);
    }//GEN-LAST:event_B_1ActionPerformed

    private void B_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_3ActionPerformed
        numbers += B_3.getText();
        showNumberAndResult.setText(numbers);
    }//GEN-LAST:event_B_3ActionPerformed

    private void B_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_4ActionPerformed
        numbers += B_4.getText();
        showNumberAndResult.setText(numbers);
    }//GEN-LAST:event_B_4ActionPerformed

    private void B_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_5ActionPerformed
        numbers += B_5.getText();
        showNumberAndResult.setText(numbers);
    }//GEN-LAST:event_B_5ActionPerformed

    private void B_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_6ActionPerformed
        numbers += B_6.getText();
        showNumberAndResult.setText(numbers);
    }//GEN-LAST:event_B_6ActionPerformed

    private void B_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_7ActionPerformed
        numbers += B_7.getText();
        showNumberAndResult.setText(numbers);
    }//GEN-LAST:event_B_7ActionPerformed

    private void B_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_8ActionPerformed
        numbers += B_8.getText();
        showNumberAndResult.setText(numbers);
    }//GEN-LAST:event_B_8ActionPerformed

    private void B_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_9ActionPerformed
        numbers += B_9.getText();
        showNumberAndResult.setText(numbers);
    }//GEN-LAST:event_B_9ActionPerformed

    private void B_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_0ActionPerformed
        numbers += B_0.getText();
        showNumberAndResult.setText(numbers);
    }//GEN-LAST:event_B_0ActionPerformed

    private void B_resultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_resultActionPerformed
        // se ejecuta si la suma esta activa
        if (activePlus){

            if (numbers.equals("")) numbers = "0";
            
            process.plus(numbers);//realizar operacion
            numbers = process.getStr();
        }
        
        // se ejecuta si la resta esta activa
        if (process.isActiveSubstrac()){

            if (numbers.equals("")) numbers = "0";
           
            process.substrac(numbers);//realizar operacion
            numbers = process.getStr();
        }
        
        if (activeMultiply){
  
            if (numbers.equals("")) numbers = "1";
           
            process.multiply(numbers);//realizar operacion
            numbers = process.getStr();
        }
        
        if (activeDivide){

            if (numbers.equals("")) numbers = "1";
           
            process.divide(numbers);//realizar operacion
            numbers = process.getStr();
        }
        
        showNumberAndResult.setText(numbers);//mostrar en pantalla
        
        //desactivar verificables 
        checkPoint     = false;
        activePlus     = false;
        activeMultiply = false;
        activeDivide = false;
        process.setActiveSubstrac(false);
        numbers = "";
    }//GEN-LAST:event_B_resultActionPerformed

    private void B_pointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_pointActionPerformed
        //deterimar si hay un punto 
        if (!checkPoint){ 
            if ("".equals(numbers))
                numbers += "0";
            
            numbers += B_point.getText();
            checkPoint = true;
        }
        showNumberAndResult.setText(numbers);
    }//GEN-LAST:event_B_pointActionPerformed

    private void B_deleteOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_deleteOneActionPerformed
       String aux = numbers;

       numbers = aux.substring(0, aux.length() - 1);//eliminar el ultimo digito
       showNumberAndResult.setText(numbers);//mostrar en pantalla
       
       if (!numbers.contains(".")) checkPoint = false;//si se borra un digito y se ha borrado el punto se desactiva
                                                         // el check del punto
    }//GEN-LAST:event_B_deleteOneActionPerformed

    private void B_cleanALLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_cleanALLActionPerformed
       /*
        * Borramos y desactivamos todo
        */
        
       numbers = "";
       showNumberAndResult.setText(numbers);
       checkPoint = false;
       activePlus = false;
       activeMultiply = false;
       activeDivide = false;
       process.setActiveSubstrac(false);
       process.setTo_operate(0);
    }//GEN-LAST:event_B_cleanALLActionPerformed

    private void B_plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_plusActionPerformed
        if (numbers.equals("")) numbers = "0";
        
        process.plus(numbers);
        numbers = "";
        activePlus = true;
        showNumberAndResult.setText(numbers);
    }//GEN-LAST:event_B_plusActionPerformed

    private void B_substracActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_substracActionPerformed
        if (numbers.equals("")) numbers = "0";
        
        process.substrac(numbers);
        numbers = "";
        process.setActiveSubstrac(true);
        showNumberAndResult.setText(numbers);
    }//GEN-LAST:event_B_substracActionPerformed

    private void B_multiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_multiplyActionPerformed
        if (numbers.equals("")) numbers = "1";//igual a 1 elemento neutro de la multiplicacion
        
        process.multiply(numbers);
        numbers = "";
        activeMultiply = true;
        showNumberAndResult.setText(numbers);
    }//GEN-LAST:event_B_multiplyActionPerformed

    private void B_divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_divideActionPerformed
        if (numbers.equals("")) numbers = "0";
        
        process.divide(numbers);
        numbers = "";
        activeDivide = true;
        showNumberAndResult.setText(numbers);
    }//GEN-LAST:event_B_divideActionPerformed
    
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
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gui().setVisible(true);
            }
        });
    }

    public String getNumbers() {
        return numbers;
    }


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_0;
    private javax.swing.JButton B_1;
    private javax.swing.JButton B_2;
    private javax.swing.JButton B_3;
    private javax.swing.JButton B_4;
    private javax.swing.JButton B_5;
    private javax.swing.JButton B_6;
    private javax.swing.JButton B_7;
    private javax.swing.JButton B_8;
    private javax.swing.JButton B_9;
    private javax.swing.JButton B_cleanALL;
    private javax.swing.JButton B_deleteOne;
    private javax.swing.JButton B_divide;
    private javax.swing.JButton B_multiply;
    private javax.swing.JButton B_plus;
    private javax.swing.JButton B_point;
    private javax.swing.JButton B_result;
    private javax.swing.JButton B_substrac;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel name;
    private javax.swing.JLabel showNumberAndResult;
    // End of variables declaration//GEN-END:variables
}
