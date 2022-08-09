package pl.koder95.kedit;

import com.hexidec.ekit.EkitCore;
import com.hexidec.ekit.EkitCoreSpell;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class KEdit extends JPanel {

    private EkitCore ekitCore;

    public KEdit(String sDocument, String sStyleSheet, String sRawDocument, URL urlStyleSheet, boolean includeToolBar, boolean showViewSource, boolean showMenuIcons, boolean editModeExclusive, String sLanguage, String sCountry, boolean base64, boolean debugMode, boolean useSpellChecker, boolean multiBar, boolean enterBreak) {
        if (useSpellChecker) {
            ekitCore = new EkitCoreSpell(false, sDocument, sStyleSheet, sRawDocument, null, urlStyleSheet, includeToolBar, showViewSource, showMenuIcons, editModeExclusive, sLanguage, sCountry, base64, debugMode, true, multiBar, (multiBar ? EkitCore.TOOLBAR_DEFAULT_MULTI : EkitCore.TOOLBAR_DEFAULT_SINGLE), enterBreak);
        } else {
            ekitCore = new EkitCore(false, sDocument, sStyleSheet, sRawDocument, null, urlStyleSheet, includeToolBar, showViewSource, showMenuIcons, editModeExclusive, sLanguage, sCountry, base64, debugMode, false, multiBar, (multiBar ? EkitCore.TOOLBAR_DEFAULT_MULTI : EkitCore.TOOLBAR_DEFAULT_SINGLE), enterBreak);
        }

        /* Add the components to the app */
        if (includeToolBar) {
            if (multiBar) {
                setLayout(new GridBagLayout());
                GridBagConstraints gbc = new GridBagConstraints();
                gbc.fill = GridBagConstraints.HORIZONTAL;
                gbc.anchor = GridBagConstraints.NORTH;
                gbc.gridheight = 1;
                gbc.gridwidth = 1;
                gbc.weightx = 1.0;
                gbc.weighty = 0.0;
                gbc.gridx = 1;

                gbc.gridy = 1;
                add(ekitCore.getToolBarMain(includeToolBar), gbc);

                gbc.gridy = 2;
                add(ekitCore.getToolBarFormat(includeToolBar), gbc);

                gbc.gridy = 3;
                add(ekitCore.getToolBarStyles(includeToolBar), gbc);

                gbc.anchor = GridBagConstraints.SOUTH;
                gbc.fill = GridBagConstraints.BOTH;
                gbc.weighty = 1.0;
                gbc.gridy = 4;
                add(ekitCore, gbc);
            } else {
                setLayout(new BorderLayout());
                add(ekitCore, BorderLayout.CENTER);
                add(ekitCore.getToolBar(includeToolBar), BorderLayout.NORTH);
            }
        } else {
            setLayout(new BorderLayout());
            add(ekitCore, BorderLayout.CENTER);
        }
    }

    public void setOwner(Frame owner) {
        ekitCore.setFrame(owner);
    }

    public Frame getOwner() {
        return ekitCore.getFrame();
    }

    public void install(JFrame frame) {
        frame.setContentPane(this);
        frame.setJMenuBar(ekitCore.getMenuBar());
    }

    public String getAppName() {
        return "KEdit";
    }
}
