package cq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class k {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final j Companion;
    public static final k SUCCESS = new k("SUCCESS", 0);
    public static final k FAILURE = new k("FAILURE", 1);

    private static final /* synthetic */ k[] $values() {
        return new k[]{SUCCESS, FAILURE};
    }

    static {
        k[] kVarArr$values = $values();
        $VALUES = kVarArr$values;
        $ENTRIES = a.a.j(kVarArr$values);
        Companion = new j();
    }

    private k(String str, int i10) {
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
