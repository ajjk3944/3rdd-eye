package t2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class i {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i Ltr = new i("Ltr", 0);
    public static final i Rtl = new i("Rtl", 1);

    private static final /* synthetic */ i[] $values() {
        return new i[]{Ltr, Rtl};
    }

    static {
        i[] iVarArr$values = $values();
        $VALUES = iVarArr$values;
        $ENTRIES = a.a.j(iVarArr$values);
    }

    private i(String str, int i10) {
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }
}
