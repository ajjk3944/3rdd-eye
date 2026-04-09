package fn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c CANCEL = new c("CANCEL", 0);
    public static final c CLOSE = new c("CLOSE", 1);
    public static final c FIX = new c("FIX", 2);
    public static final c RUN_AGAIN = new c("RUN_AGAIN", 3);

    private static final /* synthetic */ c[] $values() {
        return new c[]{CANCEL, CLOSE, FIX, RUN_AGAIN};
    }

    static {
        c[] cVarArr$values = $values();
        $VALUES = cVarArr$values;
        $ENTRIES = a.a.j(cVarArr$values);
    }

    private c(String str, int i10) {
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
}
