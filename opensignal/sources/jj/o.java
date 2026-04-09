package jj;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class o {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;
    public static final o CONNECTED = new o("CONNECTED", 0, o0.CELLULAR_CONNECTED);
    public static final o DISCONNECTED = new o("DISCONNECTED", 1, o0.CELLULAR_DISCONNECTED);
    private final o0 triggerType;

    private static final /* synthetic */ o[] $values() {
        return new o[]{CONNECTED, DISCONNECTED};
    }

    static {
        o[] oVarArr$values = $values();
        $VALUES = oVarArr$values;
        $ENTRIES = a.a.j(oVarArr$values);
    }

    private o(String str, int i10, o0 o0Var) {
        this.triggerType = o0Var;
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) $VALUES.clone();
    }

    public final o0 getTriggerType() {
        return this.triggerType;
    }
}
