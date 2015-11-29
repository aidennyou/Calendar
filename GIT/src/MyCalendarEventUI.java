import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JPanel;


public class MyCalendarEventUI extends JFrame {

	JTextField eventtitle;
	JTextField eventdate;
	JTextArea notes;

	public MyCalendarEventUI(String title) {
		super(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		initializeDockingComponents();
		setLayout(new BorderLayout());
		this.setSize(300,200);

		JPanel eventPanel = new JPanel();
		eventPanel.setLayout(new BoxLayout(eventPanel, BoxLayout.Y_AXIS));
		JPanel eventtitlePanel = new JPanel();
		JPanel eventnotesPanel = new JPanel();
		JPanel eventdatePanel = new JPanel();

		FlowLayout fLayout = new FlowLayout();
		fLayout.setAlignment(FlowLayout.RIGHT);
		eventtitlePanel.setLayout(fLayout);
		eventnotesPanel.setLayout(fLayout);

		JLabel eventis = new JLabel (" Event Title");
		JLabel extranotes = new JLabel (" Notes");
		JLabel dateis = new JLabel (" Date");

		eventtitle = new JTextField();
		eventtitle.setPreferredSize(new Dimension (200,20));
		eventdate = new JTextField();
		eventdate.setPreferredSize(new Dimension (200,20));
		notes = new JTextArea();
		notes.setPreferredSize(new Dimension (200,100));

		eventtitlePanel.add(eventis);
		eventtitlePanel.add(eventtitle);
		eventnotesPanel.add(extranotes);
		eventnotesPanel.add(notes);
		eventdatePanel.add(dateis);
		eventdatePanel.add(eventdate);

		eventPanel.add(eventtitlePanel);
		eventPanel.add(eventdatePanel);
		eventPanel.add(eventnotesPanel);
		add(eventPanel);
	}

	private void initializeDockingComponents() {
		// TODO Auto-generated method stub
	}

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				MyCalendarEventUI migFrame = new MyCalendarEventUI("Add Event");
				migFrame.setVisible(true);
			}
		});
	}
}