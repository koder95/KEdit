package pl.koder95.kedit;

import java.io.Serializable;

public enum Key implements Serializable {
    MENU_FILE("file"),
    MENU_EDIT("edit"),
    MENU_VIEW("view"),
    MENU_FONT("font"),
    MENU_FORMAT("format"),
    MENU_INSERT("insert"),
    MENU_TABLE("table"),
    MENU_FORMS("forms"),
    MENU_SEARCH("search"),
    MENU_TOOLS("tools"),
    MENU_HELP("help"),
    MENU_DEBUG("debug"),
    
    TOOL_SEP("SP"),
    TOOL_NEW("NW"),
    TOOL_NEWSTYLED("NS"),
    TOOL_OPEN("OP"),
    TOOL_SAVE("SV"),
    TOOL_PRINT("PR"),
    TOOL_CUT("CT"),
    TOOL_COPY("CP"),
    TOOL_PASTE("PS"),
    TOOL_PASTEX("PX"),
    TOOL_UNDO("UN"),
    TOOL_REDO("RE"),
    TOOL_BOLD("BL"),
    TOOL_ITALIC("IT"),
    TOOL_UNDERLINE("UD"),
    TOOL_STRIKE("SK"),
    TOOL_SUPER("SU"),
    TOOL_SUB("SB"),
    TOOL_ULIST("UL"),
    TOOL_OLIST("OL"),
    TOOL_ALIGNL("AL"),
    TOOL_ALIGNC("AC"),
    TOOL_ALIGNR("AR"),
    TOOL_ALIGNJ("AJ"),
    TOOL_UNICODE("UC"),
    TOOL_UNIMATH("UM"),
    TOOL_FIND("FN"),
    TOOL_ANCHOR("LK"),
    TOOL_SOURCE("SR"),
    TOOL_STYLES("ST"),
    TOOL_FONTS("FO"),
    TOOL_INSTABLE("TI"),
    TOOL_EDITTABLE("TE"),
    TOOL_EDITCELL("CE"),
    TOOL_INSERTROW("RI"),
    TOOL_INSERTCOL("CI"),
    TOOL_DELETEROW("RD"),
    TOOL_DELETECOL("CD");
    
    private String value;

    public String getValue() {
        return value;
    }

    Key(String value) {
        this.value = value;
    }
}