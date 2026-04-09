package f7;

/* loaded from: classes.dex */
public enum c {
    DEX_FILES(0),
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    AGGREGATION_COUNT(4);

    private final long mValue;

    c(long j) {
        this.mValue = j;
    }

    public static c fromValue(long j) {
        c[] cVarArrValues = values();
        for (int i10 = 0; i10 < cVarArrValues.length; i10++) {
            if (cVarArrValues[i10].getValue() == j) {
                return cVarArrValues[i10];
            }
        }
        throw new IllegalArgumentException(c7.a.m(j, "Unsupported FileSection Type "));
    }

    public long getValue() {
        return this.mValue;
    }
}
