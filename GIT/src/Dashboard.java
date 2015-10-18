package main;



import net.miginfocom.swing.MigLayout;

import java.awt.*;

import javax.swing.*;

public class Dashboard extends JFrame {
	
	public Dashboard(String title) {
	super(title);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    initializeDockingComponents();
    if(title.startsWith("MiG")){
        add(buildMiGDashboard());
    } else if(title.startsWith("Flow")) {
        add(buildMiGFlowLayout());
    } else {
        add(buildStandardDashboard());
        }
        pack();
        
	}
        private JPanel buildMiGDashboard() {
            JPanel panel = new JPanel();
            JPanel sundaypanel = new JPanel();
            JPanel mondaypanel = new JPanel();
      	panel.setLayout(new MigLayout());
              buildMiGForm(panel);
        panel.setLayout(new MigLayout());
        	 buildMigForm(sundaypanel);
        panel.setLayout(new MigLayout());
        	buildMigForm(mondaypanel);

              
              sundaypanel = new JPanel();
              sundaypanel.setBackground(Color.red);
              sundaypanel.setBounds(0, 0, 0, 0);
              mondaypanel = new JPanel();
              mondaypanel.setBackground(Color.white);
              mondaypanel.add(sundaypanel);
              mondaypanel.setBounds(100, 100, 100, 100);
			
              setSize(100, 100);
              setLocation(0, 0);
              setResizable(true);
              setVisible(true);
              
             return panel;

          }
        
        
        
        
        
          private void buildMigForm(JPanel sundaypanel) {
			// TODO Auto-generated method stub
			
		}
		private void buildMiGForm(JPanel panel) {
              
          }

          private JPanel buildStandardDashboard() {
              JPanel panel = new JPanel();
      	panel.setLayout(new GridBagLayout());
              buildGridBagForm(panel);

              JPanel outerPanel = new JPanel();
              outerPanel.setLayout(new BorderLayout());               
              outerPanel.add(panel, BorderLayout.CENTER);
              return outerPanel;                         
	 

	

          }

	private void buildGridBagForm(JPanel panel) {
			// TODO Auto-generated method stub
			
		}
	private Component buildMiGFlowLayout() {
		// TODO Auto-generated method stub
		return null;
	}

	private void initializeDockingComponents() {
		// TODO Auto-generated method stub
		
		}
	
	    public static void main(String[] args) {
	        javax.swing.SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	            	Dashboard migFrame = new Dashboard("Calendar");
	                migFrame.setVisible(true);
	            		}
	            	});
        		}
}