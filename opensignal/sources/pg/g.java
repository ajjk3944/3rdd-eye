package pg;

/* loaded from: classes.dex */
public enum g {
    BASE("BASE"),
    REALTIME("REALTIME");

    private final String value;

    g(String str) {
        this.value = str;
    }

    public String getValue() {
        return this.value;
    }
}
