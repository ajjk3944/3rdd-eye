package hm;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a TWO_G = new a("TWO_G", 0);
    public static final a THREE_G = new a("THREE_G", 1);
    public static final a FOUR_G = new a("FOUR_G", 2);
    public static final a FIVE_G = new a("FIVE_G", 3);
    public static final a OTHER = new a("OTHER", 4);
    public static final a NO_DATA_CONNECTION = new a("NO_DATA_CONNECTION", 5);

    private static final /* synthetic */ a[] $values() {
        return new a[]{TWO_G, THREE_G, FOUR_G, FIVE_G, OTHER, NO_DATA_CONNECTION};
    }

    static {
        a[] aVarArr$values = $values();
        $VALUES = aVarArr$values;
        $ENTRIES = a.a.j(aVarArr$values);
    }

    private a(String str, int i10) {
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
