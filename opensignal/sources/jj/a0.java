package jj;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a0 {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ a0[] $VALUES;
    public static final z Companion;
    public static final a0 NETWORK_BLOCKED = new a0("NETWORK_BLOCKED", 0, o0.NETWORK_BLOCKED);
    public static final a0 NETWORK_UNBLOCKED = new a0("NETWORK_UNBLOCKED", 1, o0.NETWORK_UNBLOCKED);
    private final o0 triggerType;

    private static final /* synthetic */ a0[] $values() {
        return new a0[]{NETWORK_BLOCKED, NETWORK_UNBLOCKED};
    }

    static {
        a0[] a0VarArr$values = $values();
        $VALUES = a0VarArr$values;
        $ENTRIES = a.a.j(a0VarArr$values);
        Companion = new z();
    }

    private a0(String str, int i10, o0 o0Var) {
        this.triggerType = o0Var;
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) $VALUES.clone();
    }

    public final o0 getTriggerType() {
        return this.triggerType;
    }
}
