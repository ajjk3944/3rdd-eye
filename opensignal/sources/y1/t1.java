package y1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class t1 {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ t1[] $VALUES;
    public static final t1 Shown = new t1("Shown", 0);
    public static final t1 Hidden = new t1("Hidden", 1);

    private static final /* synthetic */ t1[] $values() {
        return new t1[]{Shown, Hidden};
    }

    static {
        t1[] t1VarArr$values = $values();
        $VALUES = t1VarArr$values;
        $ENTRIES = a.a.j(t1VarArr$values);
    }

    private t1(String str, int i10) {
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static t1 valueOf(String str) {
        return (t1) Enum.valueOf(t1.class, str);
    }

    public static t1[] values() {
        return (t1[]) $VALUES.clone();
    }
}
