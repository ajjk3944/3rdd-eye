package jj;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class t0 {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ t0[] $VALUES;
    public static final t0 WIFI_SCAN_AVAILABLE = new t0("WIFI_SCAN_AVAILABLE", 0, o0.WIFI_SCAN);
    private final o0 triggerType;

    private static final /* synthetic */ t0[] $values() {
        return new t0[]{WIFI_SCAN_AVAILABLE};
    }

    static {
        t0[] t0VarArr$values = $values();
        $VALUES = t0VarArr$values;
        $ENTRIES = a.a.j(t0VarArr$values);
    }

    private t0(String str, int i10, o0 o0Var) {
        this.triggerType = o0Var;
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static t0 valueOf(String str) {
        return (t0) Enum.valueOf(t0.class, str);
    }

    public static t0[] values() {
        return (t0[]) $VALUES.clone();
    }

    public final o0 getTriggerType() {
        return this.triggerType;
    }
}
