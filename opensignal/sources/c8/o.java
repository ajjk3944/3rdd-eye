package c8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class o {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;
    public static final o IGNORE = new o("IGNORE", 0);
    public static final o RESPECT_PERFORMANCE = new o("RESPECT_PERFORMANCE", 1);
    public static final o RESPECT_ALL = new o("RESPECT_ALL", 2);

    private static final /* synthetic */ o[] $values() {
        return new o[]{IGNORE, RESPECT_PERFORMANCE, RESPECT_ALL};
    }

    static {
        o[] oVarArr$values = $values();
        $VALUES = oVarArr$values;
        $ENTRIES = a.a.j(oVarArr$values);
    }

    private o(String str, int i10) {
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) $VALUES.clone();
    }
}
