package e1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a None = new a("None", 0);
    public static final a Cancelled = new a("Cancelled", 1);
    public static final a Redirected = new a("Redirected", 2);
    public static final a RedirectCancelled = new a("RedirectCancelled", 3);

    private static final /* synthetic */ a[] $values() {
        return new a[]{None, Cancelled, Redirected, RedirectCancelled};
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
