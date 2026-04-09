package lt;

/* loaded from: classes.dex */
public enum i {
    IN("in"),
    OUT("out"),
    INV("");

    private final String presentation;

    i(String str) {
        this.presentation = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.presentation;
    }
}
