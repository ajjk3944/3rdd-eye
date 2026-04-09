package jj;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class n {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ n[] $VALUES;
    public static final m Companion;
    private final o0 triggerType;
    public static final n NR_CELL = new n("NR_CELL", 0, o0.NR_CELL);
    public static final n LTE_CELL = new n("LTE_CELL", 1, o0.LTE_CELL);
    public static final n GSM_CELL = new n("GSM_CELL", 2, o0.GSM_CELL);
    public static final n CDMA_CELL = new n("CDMA_CELL", 3, o0.CDMA_CELL);
    public static final n WCDMA_CELL = new n("WCDMA_CELL", 4, o0.WCDMA_CELL);

    private static final /* synthetic */ n[] $values() {
        return new n[]{NR_CELL, LTE_CELL, GSM_CELL, CDMA_CELL, WCDMA_CELL};
    }

    static {
        n[] nVarArr$values = $values();
        $VALUES = nVarArr$values;
        $ENTRIES = a.a.j(nVarArr$values);
        Companion = new m();
    }

    private n(String str, int i10, o0 o0Var) {
        this.triggerType = o0Var;
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }

    public final o0 getTriggerType() {
        return this.triggerType;
    }
}
