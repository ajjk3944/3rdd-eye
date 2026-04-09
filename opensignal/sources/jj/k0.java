package jj;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class k0 {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ k0[] $VALUES;
    private final o0 triggerType;
    public static final k0 SCREEN_ON = new k0("SCREEN_ON", 0, o0.SCREEN_ON);
    public static final k0 SCREEN_OFF = new k0("SCREEN_OFF", 1, o0.SCREEN_OFF);

    private static final /* synthetic */ k0[] $values() {
        return new k0[]{SCREEN_ON, SCREEN_OFF};
    }

    static {
        k0[] k0VarArr$values = $values();
        $VALUES = k0VarArr$values;
        $ENTRIES = a.a.j(k0VarArr$values);
    }

    private k0(String str, int i10, o0 o0Var) {
        this.triggerType = o0Var;
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static k0 valueOf(String str) {
        return (k0) Enum.valueOf(k0.class, str);
    }

    public static k0[] values() {
        return (k0[]) $VALUES.clone();
    }

    public final o0 getTriggerType() {
        return this.triggerType;
    }
}
