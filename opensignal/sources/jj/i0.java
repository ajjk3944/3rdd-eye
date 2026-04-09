package jj;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class i0 {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ i0[] $VALUES;
    public static final i0 CONNECTED = new i0("CONNECTED", 0, o0.POWER_CONNECTED);
    public static final i0 DISCONNECTED = new i0("DISCONNECTED", 1, o0.POWER_DISCONNECTED);
    private final o0 triggerType;

    private static final /* synthetic */ i0[] $values() {
        return new i0[]{CONNECTED, DISCONNECTED};
    }

    static {
        i0[] i0VarArr$values = $values();
        $VALUES = i0VarArr$values;
        $ENTRIES = a.a.j(i0VarArr$values);
    }

    private i0(String str, int i10, o0 o0Var) {
        this.triggerType = o0Var;
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static i0 valueOf(String str) {
        return (i0) Enum.valueOf(i0.class, str);
    }

    public static i0[] values() {
        return (i0[]) $VALUES.clone();
    }

    public final o0 getTriggerType() {
        return this.triggerType;
    }
}
