package jj;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class s0 {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ s0[] $VALUES;
    private final o0 triggerType;
    public static final s0 ON = new s0("ON", 0, o0.WIFI_ON);
    public static final s0 OFF = new s0("OFF", 1, o0.WIFI_OFF);

    private static final /* synthetic */ s0[] $values() {
        return new s0[]{ON, OFF};
    }

    static {
        s0[] s0VarArr$values = $values();
        $VALUES = s0VarArr$values;
        $ENTRIES = a.a.j(s0VarArr$values);
    }

    private s0(String str, int i10, o0 o0Var) {
        this.triggerType = o0Var;
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static s0 valueOf(String str) {
        return (s0) Enum.valueOf(s0.class, str);
    }

    public static s0[] values() {
        return (s0[]) $VALUES.clone();
    }

    public final o0 getTriggerType() {
        return this.triggerType;
    }
}
