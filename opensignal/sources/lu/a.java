package lu;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a NONE = new a("NONE", 0);
    public static final a ALL_JSON_OBJECTS = new a("ALL_JSON_OBJECTS", 1);
    public static final a POLYMORPHIC = new a("POLYMORPHIC", 2);

    private static final /* synthetic */ a[] $values() {
        return new a[]{NONE, ALL_JSON_OBJECTS, POLYMORPHIC};
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
