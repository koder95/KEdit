package pl.koder95.kedit;

import com.hexidec.ekit.EkitCore;

import javax.swing.text.StyledDocument;
import java.awt.*;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

public class KEdit extends EkitCore {

    /**
     * Master Constructor
     * @param sDocument         [String]  A text or HTML document to load in the editor upon startup.
     * @param sStyleSheet       [String]  A CSS stylesheet to load in the editor upon startup.
     * @param sRawDocument      [String]  A document encoded as a String to load in the editor upon startup.
     * @param sdocSource        [StyledDocument] Optional document specification, using javax.swing.text.StyledDocument.
     * @param urlStyleSheet     [URL]     A URL reference to the CSS style sheet.
     * @param includeToolBar    [boolean] Specifies whether the app should include the toolbar(s).
     * @param showViewSource    [boolean] Specifies whether or not to show the View Source window on startup.
     * @param showMenuIcons     [boolean] Specifies whether or not to show icon pictures in menus.
     * @param editModeExclusive [boolean] Specifies whether or not to use exclusive edit mode (recommended on).
     * @param sLanguage         [String]  The language portion of the Internationalization Locale to run Ekit in.
     * @param sCountry          [String]  The country portion of the Internationalization Locale to run Ekit in.
     * @param base64            [boolean] Specifies whether the raw document is Base64 encoded or not.
     * @param debugMode         [boolean] Specifies whether to show the Debug menu or not.
     * @param hasSpellChecker   [boolean] Specifies whether or not this uses the SpellChecker module
     * @param multiBar          [boolean] Specifies whether to use multiple toolbars or one big toolbar.
     * @param toolbarSeq        [String]  Code string specifying the toolbar buttons to show.
     * @param keepUnknownTags   [boolean] Specifies whether or not the parser should retain unknown tags.
     * @param enterBreak        [boolean] Specifies whether the ENTER key should insert breaks instead of paragraph tags.
     */
    public KEdit(boolean isParentApplet, String sDocument, String sStyleSheet, String sRawDocument,
                 StyledDocument sdocSource, URL urlStyleSheet, boolean includeToolBar, boolean showViewSource,
                 boolean showMenuIcons, boolean editModeExclusive, String sLanguage, String sCountry, boolean base64,
                 boolean debugMode, boolean hasSpellChecker, boolean multiBar, String toolbarSeq,
                 boolean keepUnknownTags, boolean enterBreak) {
        super(isParentApplet, sDocument, sStyleSheet, sRawDocument, sdocSource, urlStyleSheet, includeToolBar,
                showViewSource, showMenuIcons, editModeExclusive, sLanguage, sCountry, base64, debugMode,
                hasSpellChecker, multiBar, toolbarSeq, keepUnknownTags, enterBreak);

        init(includeToolBar, multiBar);
    }

    /**
     * Master Constructor from versions 1.3 and earlier
     * @param sDocument         [String]  A text or HTML document to load in the editor upon startup.
     * @param sStyleSheet       [String]  A CSS stylesheet to load in the editor upon startup.
     * @param sRawDocument      [String]  A document encoded as a String to load in the editor upon startup.
     * @param sdocSource        [StyledDocument] Optional document specification, using javax.swing.text.StyledDocument.
     * @param urlStyleSheet     [URL]     A URL reference to the CSS style sheet.
     * @param includeToolBar    [boolean] Specifies whether the app should include the toolbar(s).
     * @param showViewSource    [boolean] Specifies whether or not to show the View Source window on startup.
     * @param showMenuIcons     [boolean] Specifies whether or not to show icon pictures in menus.
     * @param editModeExclusive [boolean] Specifies whether or not to use exclusive edit mode (recommended on).
     * @param sLanguage         [String]  The language portion of the Internationalization Locale to run Ekit in.
     * @param sCountry          [String]  The country portion of the Internationalization Locale to run Ekit in.
     * @param base64            [boolean] Specifies whether the raw document is Base64 encoded or not.
     * @param debugMode         [boolean] Specifies whether to show the Debug menu or not.
     * @param hasSpellChecker   [boolean] Specifies whether or not this uses the SpellChecker module
     * @param multiBar          [boolean] Specifies whether to use multiple toolbars or one big toolbar.
     * @param toolbarSeq        [String]  Code string specifying the toolbar buttons to show.
     * @param enterBreak        [boolean] Specifies whether the ENTER key should insert breaks instead of paragraph tags.
     */
    public KEdit(boolean isParentApplet, String sDocument, String sStyleSheet, String sRawDocument, StyledDocument sdocSource, URL urlStyleSheet, boolean includeToolBar, boolean showViewSource, boolean showMenuIcons, boolean editModeExclusive, String sLanguage, String sCountry, boolean base64, boolean debugMode, boolean hasSpellChecker, boolean multiBar, String toolbarSeq, boolean enterBreak) {
        super(isParentApplet, sDocument, sStyleSheet, sRawDocument, sdocSource, urlStyleSheet, includeToolBar, showViewSource, showMenuIcons, editModeExclusive, sLanguage, sCountry, base64, debugMode, hasSpellChecker, multiBar, toolbarSeq, enterBreak);

        init(includeToolBar, multiBar);
    }

    /**
     * Master Constructor for Ekit
     * @param sDocument         [String]  A text or HTML document to load in the editor upon startup.
     * @param sStyleSheet       [String]  A CSS stylesheet to load in the editor upon startup.
     * @param sRawDocument      [String]  A document encoded as a String to load in the editor upon startup.
     * @param urlStyleSheet     [URL]     A URL reference to the CSS style sheet.
     * @param includeToolBar    [boolean] Specifies whether the app should include the toolbar(s).
     * @param showViewSource    [boolean] Specifies whether or not to show the View Source window on startup.
     * @param showMenuIcons     [boolean] Specifies whether or not to show icon pictures in menus.
     * @param editModeExclusive [boolean] Specifies whether or not to use exclusive edit mode (recommended on).
     * @param sLanguage         [String]  The language portion of the Internationalization Locale to run Ekit in.
     * @param sCountry          [String]  The country portion of the Internationalization Locale to run Ekit in.
     * @param base64            [boolean] Specifies whether the raw document is Base64 encoded or not.
     * @param debugMode         [boolean] Specifies whether to show the Debug menu or not.
     * @param multiBar          [boolean] Specifies whether to use multiple toolbars or one big toolbar.
     * @param enterBreak        [boolean] Specifies whether the ENTER key should insert breaks instead of paragraph tags.
     */
    public KEdit(String sDocument, String sStyleSheet, String sRawDocument, URL urlStyleSheet, boolean includeToolBar, boolean showViewSource, boolean showMenuIcons, boolean editModeExclusive, String sLanguage, String sCountry, boolean base64, boolean debugMode, boolean useSpellChecker, boolean multiBar, boolean enterBreak) {
        super(false, sDocument, sStyleSheet, sRawDocument, null, urlStyleSheet, includeToolBar, showViewSource, showMenuIcons, editModeExclusive, sLanguage, sCountry, base64, debugMode, false, multiBar, (multiBar ? EkitCore.TOOLBAR_DEFAULT_MULTI : EkitCore.TOOLBAR_DEFAULT_SINGLE), enterBreak);

        init(includeToolBar, multiBar);
    }

    /**
     * Raw/Base64 Document & Style Sheet URL Constructor
     * @param sRawDocument      [String]  A document encoded as a String to load in the editor upon startup.
     * @param includeToolBar    [boolean] Specifies whether the app should include the toolbar(s).
     * @param showViewSource    [boolean] Specifies whether or not to show the View Source window on startup.
     * @param showMenuIcons     [boolean] Specifies whether or not to show icon pictures in menus.
     * @param editModeExclusive [boolean] Specifies whether or not to use exclusive edit mode (recommended on).
     * @param sLanguage         [String]  The language portion of the Internationalization Locale to run Ekit in.
     * @param sCountry          [String]  The country portion of the Internationalization Locale to run Ekit in.
     * @param base64            [boolean] Specifies whether the raw document is Base64 encoded or not.
     * @param hasSpellChecker   [boolean] Specifies whether or not this uses the SpellChecker module
     * @param multiBar          [boolean] Specifies whether to use multiple toolbars or one big toolbar.
     * @param toolbarSeq        [String]  Code string specifying the toolbar buttons to show.
     * @param enterBreak        [boolean] Specifies whether the ENTER key should insert breaks instead of paragraph tags.
     */
    public KEdit(boolean isParentApplet, String sRawDocument, URL urlStyleSheet, boolean includeToolBar, boolean showViewSource, boolean showMenuIcons, boolean editModeExclusive, String sLanguage, String sCountry, boolean base64, boolean hasSpellChecker, boolean multiBar, String toolbarSeq, boolean enterBreak) {
        super(isParentApplet, sRawDocument, urlStyleSheet, includeToolBar, showViewSource, showMenuIcons, editModeExclusive, sLanguage, sCountry, base64, hasSpellChecker, multiBar, toolbarSeq, enterBreak);

        init(includeToolBar, multiBar);
    }

    /**
     * Parent Only Specified Constructor
     */
    public KEdit(boolean isParentApplet) {
        super(isParentApplet);

        init(true, true);
    }
    
    /**
     * Empty Constructor
     */
    public KEdit() {
        super();

        init(true, true);
    }

    private void init(boolean includeToolBar, boolean multiBar) {
        List<Component> olds = Arrays.asList(getComponents());
        removeAll();

        /* Add the components to the app */
        if (includeToolBar) {
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
            if (multiBar) {
                getJToolBars().stream().skip(1).forEach(b -> {
                    add(b, gbc);
                    gbc.gridy++;
                });
            } else {
                add(getJToolBars().get(0), gbc);
            }

            gbc.anchor = GridBagConstraints.SOUTH;
            gbc.fill = GridBagConstraints.BOTH;
            gbc.weighty = 1.0;
            if (!olds.isEmpty()) {
                olds.forEach(o -> {
                    add(o, gbc);
                    gbc.gridy++;
                });
            }
        } else {
            setLayout(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.anchor = GridBagConstraints.SOUTH;
            gbc.fill = GridBagConstraints.BOTH;
            gbc.gridheight = 1;
            gbc.gridwidth = 1;
            gbc.weightx = 1.0;
            gbc.weighty = 1.0;
            gbc.gridx = 1;
            gbc.gridy = 1;

            if (!olds.isEmpty()) {
                olds.forEach(o -> {
                    add(o, gbc);
                    gbc.gridy++;
                });
            }
        }
        System.out.println("Components:");
        System.out.println(Arrays.toString(getComponents()));
    }

    @Override
    public String getAppName() {
        return "KEdit";
    }
}
