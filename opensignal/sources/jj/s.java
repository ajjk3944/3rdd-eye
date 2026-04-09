package jj;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class s {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ s[] $VALUES;
    public static final s CHANGED = new s("CHANGED", 0, o0.CONNECTION_CHANGED);
    public static final r Companion;
    private final o0 triggerType;

    private static final /* synthetic */ s[] $values() {
        return new s[]{CHANGED};
    }

    static {
        s[] sVarArr$values = $values();
        $VALUES = sVarArr$values;
        $ENTRIES = a.a.j(sVarArr$values);
        Companion = new r();
    }

    private s(String str, int i10, o0 o0Var) {
        this.triggerType = o0Var;
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) $VALUES.clone();
    }

    public final o0 getTriggerType() {
        return this.triggerType;
    }
}
