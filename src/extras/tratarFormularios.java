/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras;

import java.awt.Component;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;

/**
 *
 * @author onerb
 */
public class tratarFormularios {
  public static void limparCampos(JFrame form) throws Exception {
       limparCampos(form.getComponents());
   }
   public static void limparCampos(JInternalFrame form) throws Exception {
       limparCampos(form.getContentPane().getComponents());
   } 
   private static void limparCampos(Component[] form) throws Exception {
      for(Component c: form){
          if(c instanceof JTextField){
          JTextField t = (JTextField)c;
          t.setText("");
          }    
          if(c instanceof JComboBox){
          JComboBox t = (JComboBox)c;
          t.setSelectedIndex(0);
          }     
      }
   } 
   public static void habilitarCampos(JInternalFrame form) throws Exception{
       habilitarCampos(form.getContentPane().getComponents());
   }
   private static void habilitarCampos(Component[] form) throws Exception {
      for(Component c: form){
          c.setEnabled(true);     
      }
   } 
   public static boolean validarCampos(JInternalFrame form) throws Exception{
      return validarCampos(form.getContentPane().getComponents());
   }
   private static boolean validarCampos(Component[] form) throws Exception{
       for(Component c: form){
        if(c instanceof JTextField){
          JTextField t = (JTextField)c;
          if(t.getText().length()==0)
              JOptionPane.showMessageDialog(null, t.getToolTipText());
          return false; 
        }       
       }
       return true;
   } 
   public static void desabilitarCampos(JInternalFrame form) throws Exception{
       desabilitarCampos(form.getContentPane().getComponents());
   }
   private static void desabilitarCampos(Component[] form) throws Exception {
      for(Component c: form){
          c.setEnabled(false);     
      }
   } 
//    public static void preenchercampos(JInternalFrame form) throws Exception {
//       preenchercampos(form.getContentPane().getComponents());
//   } 
//    private static void preenchercampos (Component[] form) throws Exception {
//      for(Component c: form){
//          if(c instanceof JTextField){
//          JTextField t = (JTextField)c;
//          t.setText("");
//          }    
//          if(c instanceof JComboBox){
//          JComboBox t = (JComboBox)c;
//          t.setSelectedIndex(0);
//          }     
//      }
//   }
}
