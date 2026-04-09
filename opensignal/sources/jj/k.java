package jj;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class k {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    private final o0 triggerType;
    public static final k OK = new k("OK", 0, o0.BATTERY_OK);
    public static final k LOW = new k("LOW", 1, o0.BATTERY_LOW);

    private static final /* synthetic */ k[] $values() {
        return new k[]{OK, LOW};
    }

    static {
        k[] kVarArr$values = $values();
        $VALUES = kVarArr$values;
        $ENTRIES = a.a.j(kVarArr$values);
    }

    private k(String str, int i10, o0 o0Var) {
        this.triggerType = o0Var;
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }

    public final o0 getTriggerType() {
        return this.triggerType;
    }
}
