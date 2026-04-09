package as;

/* loaded from: classes.dex */
public enum f0 {
    IGNORE("ignore"),
    WARN("warn"),
    STRICT("strict");

    public static final e0 Companion = new e0();
    private final String description;

    f0(String str) {
        this.description = str;
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean isIgnore() {
        return this == IGNORE;
    }

    public final boolean isWarning() {
        return this == WARN;
    }
}
