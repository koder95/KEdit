package pl.koder95.kedit;

import javax.swing.*;
import java.util.LinkedList;
import java.util.List;

public class AdvancedContentPane extends ContentPanel {

    private final List<JToolBar> toolBars = new LinkedList<>();

    public List<JToolBar> getJToolBars() {
        return toolBars;
    }
}
