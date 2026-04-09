package m8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d EXACT = new d("EXACT", 0);
    public static final d INEXACT = new d("INEXACT", 1);
    public static final d AUTOMATIC = new d("AUTOMATIC", 2);

    private static final /* synthetic */ d[] $values() {
        return new d[]{EXACT, INEXACT, AUTOMATIC};
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
