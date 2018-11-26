import javax.swing.*; 
import java.io.*; 
import java.awt.event.*; 
import javax.swing.plaf.metal.*; 



class editor extends JFrame implements ActionListener { 
	
	
	
	private static final int NUM_CHARS = 15;
	
	JTextArea t; 

	JFrame f; 

	editor() 
	{ 

		f = new JFrame("editor"); 

		try { 

			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel"); 

			MetalLookAndFeel.setCurrentTheme(new OceanTheme()); 
		} 
		catch (Exception e) { 
		} 
 
		t = new JTextArea(); 

		JMenuBar mb = new JMenuBar(); 

		JMenu m1 = new JMenu("Tiedosto"); 

		JMenuItem mi1 = new JMenuItem("Uusi"); 
		JMenuItem mi2 = new JMenuItem("Avaa"); 
		JMenuItem mi3 = new JMenuItem("Tallenna"); 
		JMenuItem mi9 = new JMenuItem("Tulosta"); 

		mi1.addActionListener(this); 
		mi2.addActionListener(this); 
		mi3.addActionListener(this); 
		mi9.addActionListener(this); 
		
		m1.add(mi1); 
		m1.add(mi2); 
		m1.add(mi3); 
		m1.add(mi9); 
		
		JMenu m2 = new JMenu("Muokkaa"); 

		JMenuItem mi4 = new JMenuItem("leikkaa"); 
		JMenuItem mi5 = new JMenuItem("kopioi"); 
		JMenuItem mi6 = new JMenuItem("liitä"); 
		

		mi4.addActionListener(this); 
		mi5.addActionListener(this); 
		mi6.addActionListener(this); 

		m2.add(mi4); 
		m2.add(mi5); 
		m2.add(mi6); 

		JMenuItem m3 = new JMenuItem("sulje"); 

		m3.addActionListener(this); 

		mb.add(m1); 
		mb.add(m2); 
		mb.add(m3); 
		
		
		f.setJMenuBar(mb); 
		f.add(t); 
		f.setSize(500, 500); 
		f.show(); 
	} 
	
	

	public void actionPerformed(ActionEvent e) {
	
		
		String s = e.getActionCommand(); 

		if (s.equals("leikkaa")) { 
			t.cut(); 
		} 
		else if (s.equals("kopioi")) { 
			t.copy(); 
		} 
		else if (s.equals("liitä")) { 
			t.paste(); 
		} 
		else if (s.equals("Tallenna")) { 

			JFileChooser j = new JFileChooser("f:"); 

 
			int r = j.showSaveDialog(null); 

			if (r == JFileChooser.APPROVE_OPTION) { 


				File fi = new File(j.getSelectedFile().getAbsolutePath()); 

				try { 
 
					FileWriter wr = new FileWriter(fi, false); 

					BufferedWriter w = new BufferedWriter(wr); 

					w.write(t.getText()); 

					w.flush(); 
					w.close(); 
				} 
				catch (Exception evt) { 
					JOptionPane.showMessageDialog(f, evt.getMessage()); 
				} 
			} 

			else
				JOptionPane.showMessageDialog(f, "toiminto peruutettu"); 
		} 
		else if (s.equals("Tulosta")) { 
			try { 

				t.print(); 
			} 
			catch (Exception evt) { 
				JOptionPane.showMessageDialog(f, evt.getMessage()); 
			} 
		} 
		else if (s.equals("Avaa")) { 

			JFileChooser j = new JFileChooser("f:"); 

			int r = j.showOpenDialog(null); 

			if (r == JFileChooser.APPROVE_OPTION) { 

				File fi = new File(j.getSelectedFile().getAbsolutePath()); 

				try { 

					String s1 = "", sl = ""; 

					FileReader fr = new FileReader(fi); 

					BufferedReader br = new BufferedReader(fr); 

					sl = br.readLine(); 

					while ((s1 = br.readLine()) != null) { 
						sl = sl + "\n" + s1; 
					} 

					t.setText(sl); 
				} 
				catch (Exception evt) { 
					JOptionPane.showMessageDialog(f, evt.getMessage()); 
				} 
			} 

			else
				JOptionPane.showMessageDialog(f, "toiminto peruutettu"); 
		} 
		else if (s.equals("Uusi")) { 
			t.setText(""); 
		} 
		else if (s.equals("sulje")) { 
			f.setVisible(false); 
		} 
	} 



	public static void main(String args[]) 
	{ 
		editor e = new editor(); 
	} 
} 
