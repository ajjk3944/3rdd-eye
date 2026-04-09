package io.sentry.android.replay;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class o {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;
    public static final o INITIAL = new o("INITIAL", 0);
    public static final o STARTED = new o("STARTED", 1);
    public static final o RESUMED = new o("RESUMED", 2);
    public static final o PAUSED = new o("PAUSED", 3);
    public static final o STOPPED = new o("STOPPED", 4);
    public static final o CLOSED = new o("CLOSED", 5);

    private static final /* synthetic */ o[] $values() {
        return new o[]{INITIAL, STARTED, RESUMED, PAUSED, STOPPED, CLOSED};
    }

    static {
        o[] oVarArr$values = $values();
        $VALUES = oVarArr$values;
        $ENTRIES = a.a.j(oVarArr$values);
    }

    private o(String str, int i10) {
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) $VALUES.clone();
    }
}
