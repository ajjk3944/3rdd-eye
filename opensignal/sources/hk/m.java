package hk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class m {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;
    public static final l Companion;
    public static final m WAITING_FOR_TRIGGERS = new m("WAITING_FOR_TRIGGERS", 0);
    public static final m READY = new m("READY", 1);
    public static final m STARTED = new m("STARTED", 2);
    public static final m COMPLETED = new m("COMPLETED", 3);
    public static final m STOPPED = new m("STOPPED", 4);
    public static final m UNSCHEDULED = new m("UNSCHEDULED", 5);
    public static final m ERROR = new m("ERROR", 6);

    private static final /* synthetic */ m[] $values() {
        return new m[]{WAITING_FOR_TRIGGERS, READY, STARTED, COMPLETED, STOPPED, UNSCHEDULED, ERROR};
    }

    static {
        m[] mVarArr$values = $values();
        $VALUES = mVarArr$values;
        $ENTRIES = a.a.j(mVarArr$values);
        Companion = new l();
    }

    private m(String str, int i10) {
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) $VALUES.clone();
    }
}
