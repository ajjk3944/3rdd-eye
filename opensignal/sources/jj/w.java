package jj;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class w {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ w[] $VALUES;
    private final o0 triggerType;
    public static final w LOCATION_HAS_IMPROVED = new w("LOCATION_HAS_IMPROVED", 0, o0.LOCATION_HAS_IMPROVED);
    public static final w LOCATION_EXPIRED = new w("LOCATION_EXPIRED", 1, o0.LOCATION_EXPIRED);

    private static final /* synthetic */ w[] $values() {
        return new w[]{LOCATION_HAS_IMPROVED, LOCATION_EXPIRED};
    }

    static {
        w[] wVarArr$values = $values();
        $VALUES = wVarArr$values;
        $ENTRIES = a.a.j(wVarArr$values);
    }

    private w(String str, int i10, o0 o0Var) {
        this.triggerType = o0Var;
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) $VALUES.clone();
    }

    public final o0 getTriggerType() {
        return this.triggerType;
    }
}
