package ls;

/* loaded from: classes.dex */
public enum n0 implements rs.q {
    IN(0, 0),
    OUT(1, 1),
    INV(2, 2),
    STAR(3, 3);

    private static rs.r internalValueMap = new sm.f(16);
    private final int value;

    n0(int i10, int i11) {
        this.value = i11;
    }

    @Override // rs.q
    public final int getNumber() {
        return this.value;
    }

    public static n0 valueOf(int i10) {
        if (i10 == 0) {
            return IN;
        }
        if (i10 == 1) {
            return OUT;
        }
        if (i10 == 2) {
            return INV;
        }
        if (i10 != 3) {
            return null;
        }
        return STAR;
    }
}
