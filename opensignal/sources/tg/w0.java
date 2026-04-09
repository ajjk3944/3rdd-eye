package tg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class w0 {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ w0[] $VALUES;
    public static final w0 GENERAL = new w0("GENERAL", 0);
    public static final w0 FALLBACK = new w0("FALLBACK", 1);

    private static final /* synthetic */ w0[] $values() {
        return new w0[]{GENERAL, FALLBACK};
    }

    static {
        w0[] w0VarArr$values = $values();
        $VALUES = w0VarArr$values;
        $ENTRIES = a.a.j(w0VarArr$values);
    }

    private w0(String str, int i10) {
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static w0 valueOf(String str) {
        return (w0) Enum.valueOf(w0.class, str);
    }

    public static w0[] values() {
        return (w0[]) $VALUES.clone();
    }
}
