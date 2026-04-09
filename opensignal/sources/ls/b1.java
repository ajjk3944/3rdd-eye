package ls;

/* loaded from: classes.dex */
public enum b1 implements rs.q {
    LANGUAGE_VERSION(0, 0),
    COMPILER_VERSION(1, 1),
    API_VERSION(2, 2);

    private static rs.r internalValueMap = new df.c();
    private final int value;

    b1(int i10, int i11) {
        this.value = i11;
    }

    @Override // rs.q
    public final int getNumber() {
        return this.value;
    }

    public static b1 valueOf(int i10) {
        if (i10 == 0) {
            return LANGUAGE_VERSION;
        }
        if (i10 == 1) {
            return COMPILER_VERSION;
        }
        if (i10 != 2) {
            return null;
        }
        return API_VERSION;
    }
}
