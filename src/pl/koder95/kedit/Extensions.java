package pl.koder95.kedit;

public enum Extensions {

    HTM(new String[] { "html", "htm", "shtml" }),
    CSS(new String[] { "css" }),
    IMG(new String[] { "gif", "jpg", "jpeg", "png" }),
    RTF(new String[] { "rtf" }),
    B64(new String[] { "b64" }),
    SER(new String[] { "ser" });

    private final String[] values;

    Extensions(String[] values) {
        this.values = values;
    }

    public String[] getValues() {
        return values;
    }
}
