package z8;

/* loaded from: classes.dex */
public enum w {
    SIMULTANEOUSLY,
    INDIVIDUALLY;

    public static w forId(int i10) {
        if (i10 == 1) {
            return SIMULTANEOUSLY;
        }
        if (i10 == 2) {
            return INDIVIDUALLY;
        }
        throw new IllegalArgumentException(h0.b.h(i10, "Unknown trim path type "));
    }
}
