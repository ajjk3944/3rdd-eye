package ls;

/* loaded from: classes.dex */
public enum v implements rs.q {
    TRUE(0, 0),
    FALSE(1, 1),
    NULL(2, 2);

    private static rs.r internalValueMap = new df.c();
    private final int value;

    v(int i10, int i11) {
        this.value = i11;
    }

    @Override // rs.q
    public final int getNumber() {
        return this.value;
    }

    public static v valueOf(int i10) {
        if (i10 == 0) {
            return TRUE;
        }
        if (i10 == 1) {
            return FALSE;
        }
        if (i10 != 2) {
            return null;
        }
        return NULL;
    }
}
