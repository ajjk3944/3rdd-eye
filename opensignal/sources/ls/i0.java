package ls;

/* loaded from: classes.dex */
public enum i0 implements rs.q {
    CLASS(0, 0),
    PACKAGE(1, 1),
    LOCAL(2, 2);

    private static rs.r internalValueMap = new io.sentry.hints.i(16);
    private final int value;

    i0(int i10, int i11) {
        this.value = i11;
    }

    @Override // rs.q
    public final int getNumber() {
        return this.value;
    }

    public static i0 valueOf(int i10) {
        if (i10 == 0) {
            return CLASS;
        }
        if (i10 == 1) {
            return PACKAGE;
        }
        if (i10 != 2) {
            return null;
        }
        return LOCAL;
    }
}
