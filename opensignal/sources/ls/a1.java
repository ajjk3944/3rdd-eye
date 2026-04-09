package ls;

/* loaded from: classes.dex */
public enum a1 implements rs.q {
    WARNING(0, 0),
    ERROR(1, 1),
    HIDDEN(2, 2);

    private static rs.r internalValueMap = new cg.e();
    private final int value;

    a1(int i10, int i11) {
        this.value = i11;
    }

    @Override // rs.q
    public final int getNumber() {
        return this.value;
    }

    public static a1 valueOf(int i10) {
        if (i10 == 0) {
            return WARNING;
        }
        if (i10 == 1) {
            return ERROR;
        }
        if (i10 != 2) {
            return null;
        }
        return HIDDEN;
    }
}
