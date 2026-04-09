package tn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d IS_FILLED_IN = new d("IS_FILLED_IN", 0);
    public static final d IS_NOT_FILLED_IN = new d("IS_NOT_FILLED_IN", 1);
    public static final d HAS_ANY_VALUE = new d("HAS_ANY_VALUE", 2);

    private static final /* synthetic */ d[] $values() {
        return new d[]{IS_FILLED_IN, IS_NOT_FILLED_IN, HAS_ANY_VALUE};
    }

    static {
        d[] dVarArr$values = $values();
        $VALUES = dVarArr$values;
        $ENTRIES = a.a.j(dVarArr$values);
    }

    private d(String str, int i10) {
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
