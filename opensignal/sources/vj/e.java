package vj;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e READY = new e("READY", 0);
    public static final e STARTED = new e("STARTED", 1);
    public static final e STOPPED = new e("STOPPED", 2);
    public static final e FINISHED = new e("FINISHED", 3);
    public static final e ERROR = new e("ERROR", 4);

    private static final /* synthetic */ e[] $values() {
        return new e[]{READY, STARTED, STOPPED, FINISHED, ERROR};
    }

    static {
        e[] eVarArr$values = $values();
        $VALUES = eVarArr$values;
        $ENTRIES = a.a.j(eVarArr$values);
    }

    private e(String str, int i10) {
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
