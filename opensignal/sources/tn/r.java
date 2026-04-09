package tn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class r {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ r[] $VALUES;
    public static final r IS = new r("IS", 0);
    public static final r IS_NOT = new r("IS_NOT", 1);
    public static final r HAS_ANY_VALUE = new r("HAS_ANY_VALUE", 2);

    private static final /* synthetic */ r[] $values() {
        return new r[]{IS, IS_NOT, HAS_ANY_VALUE};
    }

    static {
        r[] rVarArr$values = $values();
        $VALUES = rVarArr$values;
        $ENTRIES = a.a.j(rVarArr$values);
    }

    private r(String str, int i10) {
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) $VALUES.clone();
    }
}
