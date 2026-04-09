package yn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b LOCAL = new b("LOCAL", 0);
    public static final b HYBRID = new b("HYBRID", 1);

    private static final /* synthetic */ b[] $values() {
        return new b[]{LOCAL, HYBRID};
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
