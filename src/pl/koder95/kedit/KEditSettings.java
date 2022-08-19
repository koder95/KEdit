package pl.koder95.kedit;

import com.hexidec.ekit.EkitCore;

import javax.swing.text.StyledDocument;
import java.net.URL;

import static com.hexidec.ekit.EkitCore.TOOLBAR_DEFAULT_MULTI;

public class KEditSettings {

    public static final KEditSettings DEFAULT = new Builder(true).build();

    public final URL urlStyleSheet;
    public final StyledDocument sdocSource;
    public final String sDocument;
    public final String sStyleSheet;
    public final String sRawDocument;
    public final String sLanguage;
    public final String sCountry;
    public final String toolbarSeq;
    public final boolean isParentApplet;
    public final boolean includeToolBar;
    public final boolean showViewSource;
    public final boolean showMenuIcons;
    public final boolean exclusiveEdit;
    public final boolean base64;
    public final boolean debugMode;
    public final boolean useSpellChecker;
    public final boolean multiBar;
    public final boolean preserveUnknownTags;
    public final boolean enterIsBreak;

    private KEditSettings(boolean isParentApplet, String sDocument, String sStyleSheet, String sRawDocument, StyledDocument sdocSource, URL urlStyleSheet, boolean includeToolBar, boolean showViewSource, boolean showMenuIcons, boolean exclusiveEdit, String sLanguage, String sCountry, boolean base64, boolean debugMode, boolean useSpellChecker, boolean multiBar, String toolbarSeq, boolean preserveUnknownTags, boolean enterIsBreak) {
        this.isParentApplet = isParentApplet;
        this.sDocument = sDocument;
        this.sStyleSheet = sStyleSheet;
        this.sRawDocument = sRawDocument;
        this.sdocSource = sdocSource;
        this.urlStyleSheet = urlStyleSheet;
        this.includeToolBar = includeToolBar;
        this.showViewSource = showViewSource;
        this.showMenuIcons = showMenuIcons;
        this.exclusiveEdit = exclusiveEdit;
        this.sLanguage = sLanguage;
        this.sCountry = sCountry;
        this.base64 = base64;
        this.debugMode = debugMode;
        this.useSpellChecker = useSpellChecker;
        this.multiBar = multiBar;
        this.toolbarSeq = toolbarSeq;
        this.preserveUnknownTags = preserveUnknownTags;
        this.enterIsBreak = enterIsBreak;
    }

    public String toString(boolean longBooleans) {
        StringBuilder builder = new StringBuilder("KEditSettings{");
        if (longBooleans) {
            builder.append("isParentApplet=").append(isParentApplet).append(',');
        } else if (isParentApplet) {
            builder.append("isParentApplet").append(',');
        }
        builder.append(" sDocument='").append(sDocument).append('\'')
                .append(", sStyleSheet='").append(sStyleSheet).append('\'')
                .append(", sRawDocument='").append(sRawDocument).append('\'')
                .append(", sdocSource=").append(sdocSource)
                .append(", urlStyleSheet=").append(urlStyleSheet);
        if (longBooleans) {
            builder.append(", includeToolBar=").append(includeToolBar)
                    .append(", showViewSource=").append(showViewSource)
                    .append(", showMenuIcons=").append(showMenuIcons)
                    .append(", exclusiveEdit=").append(exclusiveEdit).append(',');
        } else {
            if (includeToolBar) builder.append(", includeToolBar");
            if (showViewSource) builder.append(", showViewSource");
            if (showMenuIcons) builder.append(", showMenuIcons");
            if (exclusiveEdit) builder.append(", exclusiveEdit");
            builder.append(',');
        }
        builder.append(" sLanguage='").append(sLanguage).append('\'')
                .append(", sCountry='").append(sCountry).append('\'');
        if (longBooleans) {
            builder.append(", base64=").append(base64)
                    .append(", debugMode=").append(debugMode)
                    .append(", useSpellChecker=").append(useSpellChecker)
                    .append(", multiBar=").append(multiBar).append(',');
        } else {
            if (base64) builder.append(", base64");
            if (debugMode) builder.append(", debugMode");
            if (useSpellChecker) builder.append(", useSpellChecker");
            if (multiBar) builder.append(", multiBar");
            builder.append(',');
        }
        builder.append(" toolbarSeq='").append(toolbarSeq).append('\'');
        builder.append(", preserveUnknownTags=").append(preserveUnknownTags)
                .append(", enterIsBreak=").append(enterIsBreak);
        return builder.append('}').toString();
    }

    @Override
    public String toString() {
        return toString(false);
    }

    public static class Builder {

        private URL urlStyleSheet;
        private StyledDocument sdocSource;

        public Builder urlStyleSheet(URL url) {
            urlStyleSheet = url;
            return this;
        }

        public Builder sdocSource(StyledDocument doc) {
            sdocSource = doc;
            return this;
        }

        private String sDocument;
        private String sStyleSheet;
        private String sRawDocument;
        private String sLanguage;
        private String sCountry;
        private String toolbarSeq;

        public Builder sDocument(String sDoc) {
            sDocument = sDoc;
            return this;
        }

        public Builder sStyleSheet(String sSheet) {
            sStyleSheet = sSheet;
            return this;
        }

        public Builder sRawDocument(String sDoc) {
            sRawDocument = sDoc;
            return this;
        }

        public Builder sLocale(String sCountry, String sLanguage) {
            this.sCountry = sCountry;
            this.sLanguage = sLanguage;
            return this;
        }

        public Builder toolbarSeq(String seq) {
            this.toolbarSeq = seq;
            return this;
        }

        private boolean isParentApplet;
        private boolean includeToolBar;
        private boolean showViewSource;
        private boolean showMenuIcons;
        private boolean exclusiveEdit;
        private boolean base64;
        private boolean debugMode;
        private boolean useSpellChecker;
        private boolean multiBar;
        private boolean preserveUnknownTags;
        private boolean enterIsBreak;

        public Builder isParentApplet(boolean b) {
            isParentApplet = b;
            return this;
        }

        public Builder includeToolBar(boolean b) {
            includeToolBar = b;
            return this;
        }

        public Builder showViewSource(boolean b) {
            showViewSource = b;
            return this;
        }

        public Builder showMenuIcons(boolean b) {
            showMenuIcons = b;
            return this;
        }

        public Builder exclusiveEdit(boolean b) {
            exclusiveEdit = b;
            return this;
        }

        public Builder base64(boolean b) {
            base64 = b;
            return this;
        }

        public Builder debugMode(boolean b) {
            debugMode = b;
            return this;
        }

        public Builder useSpellChecker(boolean b) {
            useSpellChecker = b;
            return this;
        }

        public Builder multiBar(boolean b) {
            multiBar = b;
            return this;
        }

        public Builder preserveUnknownTags(boolean b) {
            preserveUnknownTags = b;
            return this;
        }

        public Builder enterIsBreak(boolean b) {
            enterIsBreak = b;
            return this;
        }

        public Builder(KEditSettings settings) {
            this.isParentApplet = settings.isParentApplet;
            this.sDocument = settings.sDocument;
            this.sStyleSheet = settings.sStyleSheet;
            this.sRawDocument = settings.sRawDocument;
            this.sdocSource = settings.sdocSource;
            this.urlStyleSheet = settings.urlStyleSheet;
            this.includeToolBar = settings.includeToolBar;
            this.showViewSource = settings.showViewSource;
            this.showMenuIcons = settings.showMenuIcons;
            this.exclusiveEdit = settings.exclusiveEdit;
            this.sLanguage = settings.sLanguage;
            this.sCountry = settings.sCountry;
            this.base64 = settings.base64;
            this.debugMode = settings.debugMode;
            this.useSpellChecker = settings.useSpellChecker;
            this.multiBar = settings.multiBar;
            this.toolbarSeq = settings.toolbarSeq;
            this.preserveUnknownTags = settings.preserveUnknownTags;
            this.enterIsBreak = settings.enterIsBreak;
        }

        public Builder(boolean preferred) {
            if (preferred) {
                includeToolBar = true;
                showMenuIcons = true;
                multiBar = true;
                enterIsBreak = true;
                toolbarSeq = TOOLBAR_DEFAULT_MULTI;
            }
        }

        public Builder() {
            this(true);
        }

        public KEditSettings build() {
            return new KEditSettings(isParentApplet, sDocument, sStyleSheet, sRawDocument, sdocSource, urlStyleSheet, includeToolBar, showViewSource, showMenuIcons, exclusiveEdit, sLanguage, sCountry, base64, debugMode, useSpellChecker, multiBar, toolbarSeq, preserveUnknownTags, enterIsBreak);
        }
    }
}
