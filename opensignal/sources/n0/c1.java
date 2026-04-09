package n0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c1 {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ c1[] $VALUES;
    public static final c1 Invalid = new c1("Invalid", 0);
    public static final c1 Cancelled = new c1("Cancelled", 1);
    public static final c1 InitialPending = new c1("InitialPending", 2);
    public static final c1 RecomposePending = new c1("RecomposePending", 3);
    public static final c1 Recomposing = new c1("Recomposing", 4);
    public static final c1 ApplyPending = new c1("ApplyPending", 5);
    public static final c1 Applied = new c1("Applied", 6);

    private static final /* synthetic */ c1[] $values() {
        return new c1[]{Invalid, Cancelled, InitialPending, RecomposePending, Recomposing, ApplyPending, Applied};
    }

    static {
        c1[] c1VarArr$values = $values();
        $VALUES = c1VarArr$values;
        $ENTRIES = a.a.j(c1VarArr$values);
    }

    private c1(String str, int i10) {
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static c1 valueOf(String str) {
        return (c1) Enum.valueOf(c1.class, str);
    }

    public static c1[] values() {
        return (c1[]) $VALUES.clone();
    }
}
