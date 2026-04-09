package ii;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final b Companion;
    private final int version;
    public static final c V2 = new c("V2", 0, 2);
    public static final c V3 = new c("V3", 1, 3);
    public static final c V4 = new c("V4", 2, 4);
    public static final c V5 = new c("V5", 3, 5);
    public static final c V6 = new c("V6", 4, 6);
    public static final c V7 = new c("V7", 5, 7);
    public static final c V8 = new c("V8", 6, 8);
    public static final c V9 = new c("V9", 7, 9);
    public static final c V10 = new c("V10", 8, 10);
    public static final c V11 = new c("V11", 9, 11);
    public static final c V12 = new c("V12", 10, 12);
    public static final c V13 = new c("V13", 11, 13);
    public static final c V14 = new c("V14", 12, 14);
    public static final c V15 = new c("V15", 13, 15);
    public static final c V16 = new c("V16", 14, 16);
    public static final c V17 = new c("V17", 15, 17);
    public static final c V18 = new c("V18", 16, 18);
    public static final c V19 = new c("V19", 17, 19);
    public static final c V20 = new c("V20", 18, 20);
    public static final c V21 = new c("V21", 19, 21);
    public static final c V22 = new c("V22", 20, 22);
    public static final c V23 = new c("V23", 21, 23);
    public static final c V24 = new c("V24", 22, 24);
    public static final c V25 = new c("V25", 23, 25);
    public static final c V26 = new c("V26", 24, 26);
    public static final c V27 = new c("V27", 25, 27);
    public static final c V28 = new c("V28", 26, 28);

    private static final /* synthetic */ c[] $values() {
        return new c[]{V2, V3, V4, V5, V6, V7, V8, V9, V10, V11, V12, V13, V14, V15, V16, V17, V18, V19, V20, V21, V22, V23, V24, V25, V26, V27, V28};
    }

    static {
        c[] cVarArr$values = $values();
        $VALUES = cVarArr$values;
        $ENTRIES = a.a.j(cVarArr$values);
        Companion = new b();
    }

    private c(String str, int i10, int i11) {
        this.version = i11;
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public final int getVersion() {
        return this.version;
    }
}
