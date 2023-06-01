
package calcguipractice;

public class Calc {
    private double to_operate;
    private boolean activeSubstrac = false;
    //private final gui aux = new gui();
    
    public Calc(){
        to_operate = 0;
    }

    public boolean isActiveSubstrac() {
        return activeSubstrac;
    }

    public void setActiveSubstrac(boolean activeSubstrac) {
        this.activeSubstrac = activeSubstrac;
    }
    
    public double getTo_operate() {
        return to_operate;
    }
  
    public void setTo_operate(double to_operate) {
        this.to_operate = to_operate;
    }
    
    
    public String getStr(){
        return String.valueOf(to_operate);
    }
    
    public void plus(String str){
        to_operate += Double.parseDouble(str);
    }
    
    public void substrac(String str){
        if (!activeSubstrac && to_operate == 0) to_operate = Double.parseDouble(str);
        else to_operate -= Double.parseDouble(str);
        
        System.out.println(Double.parseDouble(str));
        System.out.println(to_operate);
    }
    
    public void multiply(String str){
        if (to_operate == 0) to_operate = 1;     
        to_operate *= Double.parseDouble(str);
    }
    
    public void divide(String str){
        if (to_operate == 0) to_operate = Double.parseDouble(str);
        else to_operate /= Double.parseDouble(str);
    }
   
    
}
