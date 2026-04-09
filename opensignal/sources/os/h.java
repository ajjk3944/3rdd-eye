package os;

import rs.q;
import rs.r;

/* loaded from: classes.dex */
public enum h implements q {
    NONE(0, 0),
    INTERNAL_TO_CLASS_ID(1, 1),
    DESC_TO_CLASS_ID(2, 2);

    private static r internalValueMap = new ee.f(20);
    private final int value;

    h(int i10, int i11) {
        this.value = i11;
    }

    @Override // rs.q
    public final int getNumber() {
        return this.value;
    }

    public static h valueOf(int i10) {
        if (i10 == 0) {
            return NONE;
        }
        if (i10 == 1) {
            return INTERNAL_TO_CLASS_ID;
        }
        if (i10 != 2) {
            return null;
        }
        return DESC_TO_CLASS_ID;
    }
}
