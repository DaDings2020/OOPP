/* 	Program : 			PersonalInformation . java
 	Authors : 			Domenic Heidemann, Philipp Riefer
 	Date 	: 			13.1.2021
 	Last time changed:	14.1.2021
 */

package GUI;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


@SuppressWarnings("serial")
public class PersonalInformation extends JFrame implements ActionListener, ListSelectionListener {
	
	
	
	//attributes
	
	// JRadioButtons for salutation
	private String selsal;    // SELected SALutation
	private JRadioButton ms;
	private JRadioButton mr;
	private JRadioButton none;
	
	// JCombobox for titles
	private String seltitle;     // SELected TITLE
	private JComboBox<String> titlebox;
	private String[] title= {"kein", "Dr.", "Prof. Dr."};
	
	// JTextField for the name
	private String enteredText;
	private JTextField name=null;
	
	// Birth Date
	// JComboBox for days 
	private JComboBox<Integer> daybox;
	private Integer[] days= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
	
	// JComboBox for months
	private JComboBox<Integer> monthbox;
	private Integer[] months= {1,2,3,4,5,6,7,8,9,10,11,12};
	
	// JList for years
	private JList<Integer> yearlist;
	private Integer[] years; 
	
	private SimpleDateFormat format;	// needed for the printed birthdate
	
	// JButton 
	private JButton ok;
	
	
	
	
	
	//constructor
	public PersonalInformation() {
		
		// creating the GUI
		super("Persönliche Informationen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cont = getContentPane();
		cont.setLayout(new GridLayout(0,2,15,15));
		
		
		//Salutation with JRadioButtons
		ms= new JRadioButton("Frau");
		mr= new JRadioButton("Herr");
		none= new JRadioButton("keine", true);
		ms.addActionListener(this);
		mr.addActionListener(this);
		none.addActionListener(this);
		
		ButtonGroup salutation = new ButtonGroup();
		salutation.add(ms);
		salutation.add(mr);
		salutation.add(none);
		
		JPanel buttonpanel = new JPanel();
		buttonpanel.add(ms);
		buttonpanel.add(mr);
		buttonpanel.add(none);
		
		//Title with JComboBox
		titlebox = new JComboBox<String>(title);
		titlebox.addActionListener(this);
		
		//Name via JTextField
		name = new JTextField(50);
		name.addActionListener(this);
		
		//Date of Birth 
		// day and month via JComboBoxes
		daybox = new JComboBox<Integer>(days);
		monthbox = new JComboBox<Integer>(months);
		daybox.addActionListener(this);
		monthbox.addActionListener(this);
		
		JPanel daypanel= new JPanel();
		daypanel.add(new JLabel("Tag"));
		daypanel.add(daybox);
		
		JPanel monthpanel= new JPanel();
		monthpanel.add(new JLabel("Monat"));
		monthpanel.add(monthbox);
		
		//Year via JList with Years from 1910 to 2021
		years=new Integer[112];				// initializing and filling the year-array
		for (int i=0; i<=111; i++) {
			years[i]=i+1910;
		}
		yearlist= new JList<Integer>(years);
		yearlist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		yearlist.setSelectedIndex(0);
		yearlist.setVisibleRowCount(4);
		yearlist.setSelectionBackground(Color.blue);
		yearlist.setSelectionForeground(Color.white);
		yearlist.addListSelectionListener(this);
		
		JPanel yearpanel= new JPanel();
		
		yearpanel.add(new JLabel("Jahr"));
		yearpanel.add(new JScrollPane(yearlist));
		
		format= new SimpleDateFormat("EEEE, dd. MMMM yyyy");		// creating a format for using the gregorian calendar in the printed birthdate
		
		
		
		//OK-Button via JButton that makes the program give out the information and then close itself
		//example: Herr Dr. Anton Klöbner, geboren am Sonntag, 29. Februar 1948
		ok= new JButton("Bestätigen");
		ok.addActionListener(this);
		
		// creating the rows of the GUI
		cont.add(new JLabel("Anrede:"));	// first row
		cont.add(buttonpanel);
		
		cont.add(new JLabel("Titel:"));		// second row
		cont.add(titlebox);
		
		cont.add(new JLabel("Geburtstag:"));	// third row
		cont.add(daypanel);
		
		cont.add(new JLabel(""));				// fourth row
		cont.add(monthpanel);
		
		cont.add(new JLabel(""));				// fifth row
		cont.add(yearpanel);
		
		cont.add(new JLabel("Name:"));			// sixth row
		cont.add(name);
		
		cont.add(ok);						// last row
		
		
		
		setLocation(700,200);
		setSize(350,700);
		setResizable(false);
		setVisible(true);
	}
	
	
	
	
	
	// methods
	
	// main simply creates a new GUI
	public static void main(String[] args) {
		new PersonalInformation();
	}
	

	
	// method reacting to pushed GUI-elements
	@Override
	public void actionPerformed(ActionEvent ae) {
		
		// textfield 
		// saves the written information
		if (ae.getSource()==name) {
			enteredText=name.getText();
		}
		
		
		// ok-button
		if (ae.getSource()==ok) {
			
			// returns a warning message if the text field is empty
			if (name.getText().isEmpty()==true) {
				System.out.println("Name fehlt :P");
				return;
			}
			
			// returns a warning message if the date doesn't exist
			if (	(days[daybox.getSelectedIndex()]==(29))  &  ((months[monthbox.getSelectedIndex()])==(2))  & (yearlist.getSelectedValue()%4 == 0)){	
				// ignores the 29th Feb. of leap years
			}
			else if ((days[daybox.getSelectedIndex()]==(29))  &  ((months[monthbox.getSelectedIndex()])==(2))||		// 29th Feb.
					((days[daybox.getSelectedIndex()]==(30))  &  ((months[monthbox.getSelectedIndex()])==2))||		// 30th Feb.
					((days[daybox.getSelectedIndex()]==(31))  &  ((months[monthbox.getSelectedIndex()])==2))||		// 31th Feb.
					((days[daybox.getSelectedIndex()]==(31))  &  ((months[monthbox.getSelectedIndex()])==4))||		// 31th Apr.
					((days[daybox.getSelectedIndex()]==(31))  &  ((months[monthbox.getSelectedIndex()])==6))||		// 31th Jun.
					((days[daybox.getSelectedIndex()]==(31))  &  ((months[monthbox.getSelectedIndex()])==9))||		// 31th Sep.
					((days[daybox.getSelectedIndex()]==(31))  &  ((months[monthbox.getSelectedIndex()])==11)))		// 31th Nov.
			{
				System.out.println("Illegales Datum :P");
				return;
			}
			
							
			
			//get salutation
			if (mr.isSelected()) {	// "Herr"
				selsal="Herr ";
			} else if (ms.isSelected()) {	// "Frau"
				selsal="Frau ";
			} else if (none.isSelected()) {		// "keine"
				selsal="";
			} else {
				selsal="(Error in the salutation) ";	// Error, shouldn't occur
			}
			
			//get title
			switch(titlebox.getSelectedIndex()) {
			case 0:
				seltitle="";		// none
				break;
			case 1:
				seltitle="Dr. ";		// "Dr."
				break;
			case 2:
				seltitle="Prof. Dr. ";		// "Prof. Dr."
				break;
			default:
				seltitle="(Error in the title) ";	// Error, shouldn't occur
				break;
			}
			
			//get name
			enteredText=name.getText();
			
			//get birthday
			GregorianCalendar bday= new GregorianCalendar();
			bday.set(yearlist.getSelectedValue(), (months[monthbox.getSelectedIndex()])-1, days[daybox.getSelectedIndex()]);	// get the selected date
			String simbday=format.format(bday.getTime());	// push the selected date into a predefined format
			
			
			System.out.println(""+selsal+seltitle+enteredText+", geboren am "+simbday);		// print the gathered information
			System.exit(0);				// exit the program
		}
	}


	@Override
	public void valueChanged(ListSelectionEvent lse) {
		// not needed as of now
	}

}
