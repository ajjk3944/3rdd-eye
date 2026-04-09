package ir;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class l {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l INSTANCE = new l("INSTANCE", 0);
    public static final l CONTEXT = new l("CONTEXT", 1);
    public static final l EXTENSION_RECEIVER = new l("EXTENSION_RECEIVER", 2);
    public static final l VALUE = new l("VALUE", 3);

    private static final /* synthetic */ l[] $values() {
        return new l[]{INSTANCE, CONTEXT, EXTENSION_RECEIVER, VALUE};
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
