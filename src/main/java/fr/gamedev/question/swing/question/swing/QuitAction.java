package fr.gamedev.question.swing.question.swing;

import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;

import javax.swing.AbstractAction;
import javax.swing.JFrame;

/**
 * Close the provided Frame.
 * @author djer13
 */
public class QuitAction extends AbstractAction {

    /** serialVersionUID */
    private static final long serialVersionUID = -5351798466780811447L;

    /** Frame to send the close window event. **/
    private JFrame frameToClose;

    public QuitAction(String displayMessage, JFrame frameToClose) {
        super(displayMessage);
        this.frameToClose = frameToClose;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frameToClose.dispatchEvent(new WindowEvent(frameToClose, WindowEvent.WINDOW_CLOSING));
    }

}
