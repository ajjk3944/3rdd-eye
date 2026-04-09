package cg;

/* loaded from: classes.dex */
public enum g {
    NONE(0),
    SDK(1),
    GLOBAL(2),
    COMBINED(3);

    private final int code;

    g(int i10) {
        this.code = i10;
    }

    public int getCode() {
        return this.code;
    }
}
