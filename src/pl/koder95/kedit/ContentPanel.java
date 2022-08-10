package pl.koder95.kedit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Frame;

/**
 * Extracted from {@link com.hexidec.ekit.EkitCore}.
 */
public class ContentPanel extends JPanel {

    private Frame owner;

    public ContentPanel() {
        super();
        owner = new JFrame();
    }

    /**
     * Convenience method for obtaining the application as a Frame
     */
    public Frame getOwner() {
        return owner;
    }

    /**
     * Convenience method for setting the parent Frame
     */
    public void setOwner(Frame owner) {
        this.owner = owner;
    }

    /**
     * Convenience method for deallocating the app resources
     */
    public void dispose() {
        owner.dispose();
        System.exit(0);
    }

    protected void updateTitle(String title) {
        owner.setTitle(title);
    }
}
