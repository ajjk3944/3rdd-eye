package xq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b PRESENT = new b("PRESENT", 0);
    public static final b ABSENT = new b("ABSENT", 1);
    public static final b PRESENT_OPTIONAL = new b("PRESENT_OPTIONAL", 2);
    public static final b ABSENT_OPTIONAL = new b("ABSENT_OPTIONAL", 3);

    private static final /* synthetic */ b[] $values() {
        return new b[]{PRESENT, ABSENT, PRESENT_OPTIONAL, ABSENT_OPTIONAL};
    }

    static {
        b[] bVarArr$values = $values();
        $VALUES = bVarArr$values;
        $ENTRIES = a.a.j(bVarArr$values);
    }

    private b(String str, int i10) {
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
