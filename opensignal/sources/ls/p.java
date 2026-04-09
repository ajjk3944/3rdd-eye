package ls;

/* loaded from: classes.dex */
public enum p implements rs.q {
    RETURNS_CONSTANT(0, 0),
    CALLS(1, 1),
    RETURNS_NOT_NULL(2, 2);

    private static rs.r internalValueMap = new sm.m();
    private final int value;

    p(int i10, int i11) {
        this.value = i11;
    }

    @Override // rs.q
    public final int getNumber() {
        return this.value;
    }

    public static p valueOf(int i10) {
        if (i10 == 0) {
            return RETURNS_CONSTANT;
        }
        if (i10 == 1) {
            return CALLS;
        }
        if (i10 != 2) {
            return null;
        }
        return RETURNS_NOT_NULL;
    }
}
