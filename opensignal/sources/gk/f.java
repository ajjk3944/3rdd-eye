package gk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final e Companion;
    public static final f ROLLING_WINDOW = new f("ROLLING_WINDOW", 0);
    public static final f FIXED_WINDOW = new f("FIXED_WINDOW", 1);
    public static final f EVENT_BASED = new f("EVENT_BASED", 2);

    private static final /* synthetic */ f[] $values() {
        return new f[]{ROLLING_WINDOW, FIXED_WINDOW, EVENT_BASED};
    }

    static {
        f[] fVarArr$values = $values();
        $VALUES = fVarArr$values;
        $ENTRIES = a.a.j(fVarArr$values);
        Companion = new e();
    }

    private f(String str, int i10) {
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
