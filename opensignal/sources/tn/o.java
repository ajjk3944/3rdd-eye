package tn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class o {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;
    public static final o IS = new o("IS", 0);
    public static final o IS_NOT = new o("IS_NOT", 1);
    public static final o IS_BETWEEN = new o("IS_BETWEEN", 2);
    public static final o HAS_ANY_VALUE = new o("HAS_ANY_VALUE", 3);

    private static final /* synthetic */ o[] $values() {
        return new o[]{IS, IS_NOT, IS_BETWEEN, HAS_ANY_VALUE};
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
