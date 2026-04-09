package tn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class l {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l IS_EXACTLY = new l("IS_EXACTLY", 0);
    public static final l INCLUDES_ALL = new l("INCLUDES_ALL", 1);
    public static final l INCLUDES_ANY = new l("INCLUDES_ANY", 2);
    public static final l DOES_NOT_INCLUDE_ANY = new l("DOES_NOT_INCLUDE_ANY", 3);
    public static final l HAS_ANY_VALUE = new l("HAS_ANY_VALUE", 4);

    private static final /* synthetic */ l[] $values() {
        return new l[]{IS_EXACTLY, INCLUDES_ALL, INCLUDES_ANY, DOES_NOT_INCLUDE_ANY, HAS_ANY_VALUE};
    }

    static {
        l[] lVarArr$values = $values();
        $VALUES = lVarArr$values;
        $ENTRIES = a.a.j(lVarArr$values);
    }

    private l(String str, int i10) {
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }
}
