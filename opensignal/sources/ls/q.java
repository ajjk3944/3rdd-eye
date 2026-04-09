package ls;

/* loaded from: classes.dex */
public enum q implements rs.q {
    AT_MOST_ONCE(0, 0),
    EXACTLY_ONCE(1, 1),
    AT_LEAST_ONCE(2, 2);

    private static rs.r internalValueMap = new cg.e();
    private final int value;

    q(int i10, int i11) {
        this.value = i11;
    }

    @Override // rs.q
    public final int getNumber() {
        return this.value;
    }

    public static q valueOf(int i10) {
        if (i10 == 0) {
            return AT_MOST_ONCE;
        }
        if (i10 == 1) {
            return EXACTLY_ONCE;
        }
        if (i10 != 2) {
            return null;
        }
        return AT_LEAST_ONCE;
    }
}
