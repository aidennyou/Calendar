
import net.miginfocom.swing.MigLayout;

import java.awt.*;

import javax.swing.*;

public class Layout extends JFrame {

	JLabel mondaywidget;
	
	public Layout(String title) {
		super(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		initializeDockingComponents();

		
		add(buildMiGDashboard());
		
//		if(title.startsWith("MiG")){
//			add(buildMiGDashboard());
//		} else if(title.startsWith("Flow")) {
//			add(buildMiGFlowLayout());
//		} else {
//			add(buildStandardDashboard());
//		}
		pack();

	}
	private JPanel buildMiGDashboard() {
		JPanel panel = new JPanel();
//		JPanel sundaypanel = new JPanel();
		JPanel mondaypanel = new JPanel();
		mondaypanel.add(mondaywidget);  
		mondaywidget.setPreferredSize(new Dimension(80, 200)); 
		panel.setLayout(new MigLayout());
		
		mondaypanel.add(mondaywidget, "0,0,0");
		 
		buildMiGForm(panel);
		
		
		
//		panel.setLayout(new MigLayout());
//		buildMigForm(sundaypanel);
		panel.setLayout(new MigLayout());
		buildMigForm(mondaypanel);


//		sundaypanel = new JPanel();
//		sundaypanel.setBackground(Color.red);
//		sundaypanel.setBounds(0, 0, 0, 0);
		mondaypanel = new JPanel();
		mondaypanel.setBackground(Color.white);
		mondaypanel.add(mondaywidget);
		mondaypanel.setBounds(100, 100, 100, 100);
	

		setSize(100, 100);
		setLocation(0, 0);
		setResizable(true);
		setVisible(true);

		return panel;

	}


	private void buildMigForm(JPanel panel) {
		// TODO Auto-generated method stub

	}
	private void buildMiGForm(JPanel panel) {

	}

	private JPanel buildStandardDashboard() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridBagLayout());
		buildGridBagForm(panel);

		JPanel outerPanel = new JPanel();
        outerPanel.setLayout(new BorderLayout());               //We have to use a different layout manager
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
	        Font labelFont = new Font("Arial",Font.BOLD, 14);

	        mondaywidget = new JLabel("Monday", SwingConstants.CENTER);
	        setUpLabel(mondaywidget, new Color(209,234,249), Color.BLACK, labelFont);
	        
	 }
	 private void setUpLabel(JLabel label, Color bg, Color fg, Font f) {
	        label.setOpaque(true);
	        label.setBackground(bg);
	        label.setForeground(fg);
	        label.setFont(f);    
	    }
	

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Layout migFrame = new Layout("Calendar");
				migFrame.setVisible(true);
			}
		});
	}
}