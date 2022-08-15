package pl.koder95.kedit;

import java.io.Serializable;

public enum ActionCommand implements Serializable {

    DOC_NEW("newdoc"),
    DOC_NEW_STYLED("newdocstyled"),
    DOC_OPEN_HTML("openhtml"),
    DOC_OPEN_CSS("opencss"),
    DOC_OPEN_BASE64("openb64"),
    DOC_SAVE("save"),
    DOC_SAVE_AS("saveas"),
    DOC_SAVE_BODY("savebody"),
    DOC_SAVE_RTF("savertf"),
    DOC_SAVE_BASE64("saveb64"),
    DOC_PRINT("print"),
    DOC_SERIALIZE_OUT("serialize"),
    DOC_SERIALIZE_IN("readfromser"),
    EXIT("exit"),
    SEARCH_FIND("find"),
    SEARCH_FIND_AGAIN("findagain"),
    SEARCH_REPLACE("replace"),
    CLIP_CUT("textcut"),
    CLIP_COPY("textcopy"),
    CLIP_PASTE("textpaste"),
    CLIP_PASTE_PLAIN("textpasteplain"),
    TOGGLE_TOOLBAR_SINGLE("toggletoolbarsingle"),
    TOGGLE_TOOLBAR_MAIN("toggletoolbarmain"),
    TOGGLE_TOOLBAR_FORMAT("toggletoolbarformat"),
    TOGGLE_TOOLBAR_STYLES("toggletoolbarstyles"),
    TOGGLE_SOURCE_VIEW("togglesourceview"),
    TABLE_INSERT("inserttable"),
    TABLE_EDIT("edittable"),
    TABLE_CELL_EDIT("editcell"),
    TABLE_ROW_INSERT("inserttablerow"),
    TABLE_ROW_DELETE("deletetablerow"),
    TABLE_COLUMN_INSERT("inserttablecolumn"),
    TABLE_COLUMN_DELETE("deletetablecolumn"),
    INSERT_BREAK("insertbreak"),
    INSERT_NBSP("insertnbsp"),
    INSERT_HR("inserthr"),
    INSERT_IMAGE_LOCAL("insertlocalimage"),
    INSERT_IMAGE_URL("inserturlimage"),
    INSERT_UNICODE_CHAR("insertunicodecharacter"),
    INSERT_UNICODE_MATH("insertunicodemathematic"),
    INSERT_UNICODE_DRAW("insertunicodedrawing"),
    INSERT_UNICODE_DING("insertunicodedingbat"),
    INSERT_UNICODE_SIGS("insertunicodesignifier"),
    INSERT_UNICODE_SPEC("insertunicodespecial"),
    FORM_INSERT("insertform"),
    FORM_TEXTFIELD("inserttextfield"),
    FORM_TEXTAREA("inserttextarea"),
    FORM_CHECKBOX("insertcheckbox"),
    FORM_RADIO("insertradiobutton"),
    FORM_PASSWORD("insertpassword"),
    FORM_BUTTON("insertbutton"),
    FORM_SUBMIT("insertbuttonsubmit"),
    FORM_RESET("insertbuttonreset"),
    ENTER_PARAGRAPH("enterkeyparag"),
    ENTER_BREAK("enterkeybreak"),
    SPELLCHECK("spellcheck"),
    HELP_ABOUT("helpabout"),
    DEBUG_DESCRIBE_DOC("describedoc"),
    DEBUG_DESCRIBE_CSS("describecss"),
    DEBUG_CURRENT_TAGS("whattags");

    private String value;

    public String getValue() {
        return value;
    }

    ActionCommand(String value) {
        this.value = value;
    }
}