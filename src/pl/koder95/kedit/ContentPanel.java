package pl.koder95.kedit;

import javax.swing.*;
import java.util.Map;
import java.util.Vector;

/**
 * Extracted from {@link com.hexidec.ekit.EkitCore}.
 */
public class ContentPanel extends JPanel {

    private JFrame owner;
    private final JMenuBar menuBar;

    public ContentPanel() {
        menuBar = new JMenuBar();
    }

    /**
     * Convenience method for obtaining the application as a Frame
     */
    public JFrame getOwner() {
        return owner;
    }

    /**
     * Convenience method for obtaining the pre-generated menu bar
     */
    public JMenuBar getJMenuBar() {
        return menuBar;
    }

    /**
     * Convenience method for obtaining a custom menu bar
     */
    public JMenuBar getCustomJMenuBar(Map<String, JMenu> menuMap, Vector<String> selectedKeys) {
        menuBar.removeAll();
        selectedKeys.stream().map(String::toLowerCase).filter(menuMap::containsKey)
                .forEach(k -> menuBar.add(menuMap.get(k)));
        return menuBar;
    }

    protected void updateTitle(String title) {
        owner.setTitle(title);
    }

    public JFrame buildJFrame() {
        JFrame frame = new JFrame();
        install(frame);
        frame.pack();
        frame.setLocationRelativeTo(null);
        return frame;
    }

    public void uninstall() {
        if (owner != null) {
            owner.setContentPane(null);
            owner.setJMenuBar(null);
            owner = null;
        }
    }

    public void install(JFrame frame) {
        uninstall();
        owner = frame;
        owner.setContentPane(this);
        owner.setJMenuBar(menuBar);
    }

}
