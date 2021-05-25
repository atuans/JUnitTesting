package geom;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;


public class InfoPanel extends JPanel
        implements ComponentListener {

    private JTextArea textArea;
    private JScrollPane textScroller;

    public InfoPanel() {

    	this.textArea = new JTextArea();
        this.textArea.setEditable(false);

        textScroller = new JScrollPane(this.textArea);
        textScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        TitledBorder titleBorder = BorderFactory.createTitledBorder("Message: ");
        titleBorder.setTitleColor(Color.blue);
        titleBorder.setTitleJustification(TitledBorder.CENTER);
        Border textBorder = BorderFactory.createCompoundBorder(
                titleBorder,
                BorderFactory.createEmptyBorder(3, 3, 3, 3)
        );

        Border scollerBorder = BorderFactory.createCompoundBorder(
                textBorder,
                textScroller.getBorder() 
        );
        textScroller.setBorder(scollerBorder); 

        this.setLayout(new BorderLayout());
        this.add(textScroller, BorderLayout.CENTER);

        this.addComponentListener(this);
    }

    public void clear() {
        this.textArea.setText("");
    }

    public void println(String message) {
        this.textArea.append("\n" + message);
        this.textArea.setCaretPosition(this.textArea.getDocument().getLength());
    }

    @Override
    public void componentResized(ComponentEvent e) {
        Dimension size = this.getSize();
        this.textArea.setSize(size);
        this.textScroller.setSize(size);
    }

    @Override
    public void componentMoved(ComponentEvent e) {
    }

    @Override
    public void componentShown(ComponentEvent e) {
    }

    @Override
    public void componentHidden(ComponentEvent e) {
    }
}
