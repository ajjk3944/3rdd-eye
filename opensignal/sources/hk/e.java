package hk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e EXECUTE_IMMEDIATELY = new e("EXECUTE_IMMEDIATELY", 0);
    public static final e EXECUTE_IMMEDIATELY_IGNORE_DELAY = new e("EXECUTE_IMMEDIATELY_IGNORE_DELAY", 1);
    public static final e EXECUTE_LATER = new e("EXECUTE_LATER", 2);
    public static final e WAITING_FOR_TRIGGERS = new e("WAITING_FOR_TRIGGERS", 3);
    public static final e SCHEDULE = new e("SCHEDULE", 4);
    public static final e DO_NOTHING = new e("DO_NOTHING", 5);
    public static final e DO_NOT_HAVE_CONSENT = new e("DO_NOT_HAVE_CONSENT", 6);

    private static final /* synthetic */ e[] $values() {
        return new e[]{EXECUTE_IMMEDIATELY, EXECUTE_IMMEDIATELY_IGNORE_DELAY, EXECUTE_LATER, WAITING_FOR_TRIGGERS, SCHEDULE, DO_NOTHING, DO_NOT_HAVE_CONSENT};
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
