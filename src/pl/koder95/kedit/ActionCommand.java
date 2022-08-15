package pl.koder95.kedit;

import java.io.Serializable;

public enum ActionCommand implements Serializable {

    CMD_DOC_NEW("newdoc"),
    CMD_DOC_NEW_STYLED("newdocstyled"),
    CMD_DOC_OPEN_HTML("openhtml"),
    CMD_DOC_OPEN_CSS("opencss"),
    CMD_DOC_OPEN_BASE64("openb64"),
    CMD_DOC_SAVE("save"),
    CMD_DOC_SAVE_AS("saveas"),
    CMD_DOC_SAVE_BODY("savebody"),
    CMD_DOC_SAVE_RTF("savertf"),
    CMD_DOC_SAVE_BASE64("saveb64"),
    CMD_DOC_PRINT("print"),
    CMD_DOC_SERIALIZE_OUT("serialize"),
    CMD_DOC_SERIALIZE_IN("readfromser"),
    CMD_EXIT("exit"),
    CMD_SEARCH_FIND("find"),
    CMD_SEARCH_FIND_AGAIN("findagain"),
    CMD_SEARCH_REPLACE("replace"),
    CMD_CLIP_CUT("textcut"),
    CMD_CLIP_COPY("textcopy"),
    CMD_CLIP_PASTE("textpaste"),
    CMD_CLIP_PASTE_PLAIN("textpasteplain"),
    CMD_TOGGLE_TOOLBAR_SINGLE("toggletoolbarsingle"),
    CMD_TOGGLE_TOOLBAR_MAIN("toggletoolbarmain"),
    CMD_TOGGLE_TOOLBAR_FORMAT("toggletoolbarformat"),
    CMD_TOGGLE_TOOLBAR_STYLES("toggletoolbarstyles"),
    CMD_TOGGLE_SOURCE_VIEW("togglesourceview"),
    CMD_TABLE_INSERT("inserttable"),
    CMD_TABLE_EDIT("edittable"),
    CMD_TABLE_CELL_EDIT("editcell"),
    CMD_TABLE_ROW_INSERT("inserttablerow"),
    CMD_TABLE_ROW_DELETE("deletetablerow"),
    CMD_TABLE_COLUMN_INSERT("inserttablecolumn"),
    CMD_TABLE_COLUMN_DELETE("deletetablecolumn"),
    CMD_INSERT_BREAK("insertbreak"),
    CMD_INSERT_NBSP("insertnbsp"),
    CMD_INSERT_HR("inserthr"),
    CMD_INSERT_IMAGE_LOCAL("insertlocalimage"),
    CMD_INSERT_IMAGE_URL("inserturlimage"),
    CMD_INSERT_UNICODE_CHAR("insertunicodecharacter"),
    CMD_INSERT_UNICODE_MATH("insertunicodemathematic"),
    CMD_INSERT_UNICODE_DRAW("insertunicodedrawing"),
    CMD_INSERT_UNICODE_DING("insertunicodedingbat"),
    CMD_INSERT_UNICODE_SIGS("insertunicodesignifier"),
    CMD_INSERT_UNICODE_SPEC("insertunicodespecial"),
    CMD_FORM_INSERT("insertform"),
    CMD_FORM_TEXTFIELD("inserttextfield"),
    CMD_FORM_TEXTAREA("inserttextarea"),
    CMD_FORM_CHECKBOX("insertcheckbox"),
    CMD_FORM_RADIO("insertradiobutton"),
    CMD_FORM_PASSWORD("insertpassword"),
    CMD_FORM_BUTTON("insertbutton"),
    CMD_FORM_SUBMIT("insertbuttonsubmit"),
    CMD_FORM_RESET("insertbuttonreset"),
    CMD_ENTER_PARAGRAPH("enterkeyparag"),
    CMD_ENTER_BREAK("enterkeybreak"),
    CMD_SPELLCHECK("spellcheck"),
    CMD_HELP_ABOUT("helpabout"),
    CMD_DEBUG_DESCRIBE_DOC("describedoc"),
    CMD_DEBUG_DESCRIBE_CSS("describecss"),
    CMD_DEBUG_CURRENT_TAGS("whattags");

    private String value;

    public String getValue() {
        return value;
    }

    ActionCommand(String value) {
        this.value = value;
    }
}