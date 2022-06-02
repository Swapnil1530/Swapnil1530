import java.applet.*;

import java.awt.*;

import java.awt.event.*;

/*
<applet code="Pra_19.class" width=400 height=300>

</applet>

*/

public class Pra_19 extends Applet implements ActionListener

{
 
Button ok,cancle,help;
   
          TextField txt1;

    
    public void init()
       
 {
//             Button ok,cancle,help;
 
 //           TextField txt1;
    
          ok=new Button("OK");
   
     cancle=new Button("CANCLE");
    
     help=new Button("HELP");
       
   txt1=new TextField(20);

        
  add(new Label("Press Any Button"));
  
       add(ok);
       
 add(cancle);
      
  add(help);
       
  add(txt1);
 
ok.addActionListener(this);

cancle.addActionListener(this);

help.addActionListener(this);

    
    }
    
public void actionPerformed(ActionEvent e)
  
      {
                
String str=e.getActionCommand();
 
               setForeground(Color.BLACK);
 
               if(str.equals("OK"))
     
           {
                        
txt1.setBackground(Color.RED);
       
                 showStatus("OK Pressed");
     
           }

else if(str.equals("CANCLE"))
 
       {
  
               
 txt1.setBackground(Color.YELLOW);

	showStatus("CANCLE Pressed");

  
      }
        
else
       
 { 
            
    
                txt1.setBackground(Color.GREEN);


showStatus("HELP PRESSED");

   
     }
        
}
     
   public void paint(Graphics g)
    
    {

 

        }

} 


