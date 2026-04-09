package am;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    private final int type;
    public static final a START = new a("START", 0, 0);
    public static final a GDPR = new a("GDPR", 1, 1);
    public static final a PAGER = new a("PAGER", 2, 2);

    private static final /* synthetic */ a[] $values() {
        return new a[]{START, GDPR, PAGER};
    }

    static {
        a[] aVarArr$values = $values();
        $VALUES = aVarArr$values;
        $ENTRIES = a.a.j(aVarArr$values);
    }

    private a(String str, int i10, int i11) {
        this.type = i11;
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

    public final int getType() {
        return this.type;
    }
}
