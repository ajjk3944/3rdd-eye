package g1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c0 {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ c0[] $VALUES;
    public static final c0 CounterClockwise = new c0("CounterClockwise", 0);
    public static final c0 Clockwise = new c0("Clockwise", 1);

    private static final /* synthetic */ c0[] $values() {
        return new c0[]{CounterClockwise, Clockwise};
    }

    static {
        c0[] c0VarArr$values = $values();
        $VALUES = c0VarArr$values;
        $ENTRIES = a.a.j(c0VarArr$values);
    }

    private c0(String str, int i10) {
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) $VALUES.clone();
    }
}
