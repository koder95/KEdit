package pl.koder95.kedit;

import com.hexidec.ekit.EkitCore;
import com.hexidec.ekit.EkitCoreSpell;

import javax.swing.*;
import javax.swing.text.StyledDocument;
import java.awt.*;
import java.net.URL;

public class KEdit extends JPanel {

    private final EkitCore ekitCore;

    public KEdit(boolean isParentApplet, String sDocument, String sStyleSheet, String sRawDocument,
                 StyledDocument sdocSource, URL urlStyleSheet, boolean includeToolBar, boolean showViewSource,
                 boolean showMenuIcons, boolean editModeExclusive, String sLanguage, String sCountry, boolean base64,
                 boolean debugMode, boolean hasSpellChecker, boolean multiBar, String toolbarSeq,
                 boolean keepUnknownTags, boolean enterBreak) {
        if (hasSpellChecker) {
            ekitCore = new EkitCoreSpell(isParentApplet, sDocument, sStyleSheet, sRawDocument, sdocSource, urlStyleSheet, includeToolBar, showViewSource, showMenuIcons, editModeExclusive, sLanguage, sCountry, base64, debugMode, true, multiBar, toolbarSeq, enterBreak);
        } else {
            ekitCore = new EkitCore(isParentApplet, sDocument, sStyleSheet, sRawDocument, sdocSource, urlStyleSheet, includeToolBar, showViewSource, showMenuIcons, editModeExclusive, sLanguage, sCountry, base64, debugMode, false, multiBar, toolbarSeq, keepUnknownTags, enterBreak);
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
                add(ekitCore.getToolBarMain(true), gbc);

                gbc.gridy = 2;
                add(ekitCore.getToolBarFormat(true), gbc);

                gbc.gridy = 3;
                add(ekitCore.getToolBarStyles(true), gbc);

                gbc.anchor = GridBagConstraints.SOUTH;
                gbc.fill = GridBagConstraints.BOTH;
                gbc.weighty = 1.0;
                gbc.gridy = 4;
                add(ekitCore, gbc);
            } else {
                setLayout(new BorderLayout());
                add(ekitCore, BorderLayout.CENTER);
                add(ekitCore.getToolBar(true), BorderLayout.NORTH);
            }
        } else {
            setLayout(new BorderLayout());
            add(ekitCore, BorderLayout.CENTER);
        }
    }

    public KEdit(String sDocument, String sStyleSheet, String sRawDocument, URL urlStyleSheet, boolean includeToolBar, boolean showViewSource, boolean showMenuIcons, boolean editModeExclusive, String sLanguage, String sCountry, boolean base64, boolean debugMode, boolean useSpellChecker, boolean multiBar, boolean enterBreak) {
        this(false, sDocument, sStyleSheet, sRawDocument, null, urlStyleSheet, includeToolBar, showViewSource, showMenuIcons, editModeExclusive, sLanguage, sCountry, base64, debugMode, useSpellChecker, multiBar, (multiBar ? EkitCore.TOOLBAR_DEFAULT_MULTI : EkitCore.TOOLBAR_DEFAULT_SINGLE), false, enterBreak);
    }

    public void setOwner(Frame owner) {
        ekitCore.setOwner(owner);
    }

    public Frame getOwner() {
        return ekitCore.getOwner();
    }

    public void install(JFrame frame) {
        frame.setContentPane(this);
        frame.setJMenuBar(ekitCore.getMenuBar());
    }

    public String getAppName() {
        return "KEdit";
    }
}
