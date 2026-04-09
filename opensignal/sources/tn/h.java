package tn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class h {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h IS = new h("IS", 0);
    public static final h IS_NOT = new h("IS_NOT", 1);
    public static final h IS_BETWEEN = new h("IS_BETWEEN", 2);
    public static final h HAS_ANY_VALUE = new h("HAS_ANY_VALUE", 3);

    private static final /* synthetic */ h[] $values() {
        return new h[]{IS, IS_NOT, IS_BETWEEN, HAS_ANY_VALUE};
    }

    static {
        h[] hVarArr$values = $values();
        $VALUES = hVarArr$values;
        $ENTRIES = a.a.j(hVarArr$values);
    }

    private h(String str, int i10) {
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }
}
