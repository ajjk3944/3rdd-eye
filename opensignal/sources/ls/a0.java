package ls;

/* loaded from: classes.dex */
public enum a0 implements rs.q {
    FINAL(0, 0),
    OPEN(1, 1),
    ABSTRACT(2, 2),
    SEALED(3, 3);

    private static rs.r internalValueMap = new et.d();
    private final int value;

    a0(int i10, int i11) {
        this.value = i11;
    }

    @Override // rs.q
    public final int getNumber() {
        return this.value;
    }

    public static a0 valueOf(int i10) {
        if (i10 == 0) {
            return FINAL;
        }
        if (i10 == 1) {
            return OPEN;
        }
        if (i10 == 2) {
            return ABSTRACT;
        }
        if (i10 != 3) {
            return null;
        }
        return SEALED;
    }
}
