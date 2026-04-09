package G5;

/* loaded from: classes2.dex */
public enum j {
    NATIVE("native"),
    JAVASCRIPT("javascript"),
    NONE("none");

    private final String owner;

    j(String str) {
        this.owner = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.owner;
    }
}
