package cj;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;

    /* renamed from: id, reason: collision with root package name */
    private final int f3981id;
    public static final e INITIALISE_SDK = new e("INITIALISE_SDK", 0, 1);
    public static final e SCHEDULE_TASK = new e("SCHEDULE_TASK", 1, 2);
    public static final e START_MONITORING = new e("START_MONITORING", 2, 3);
    public static final e STOP_MONITORING = new e("STOP_MONITORING", 3, 4);
    public static final e INITIALISE_TASKS = new e("INITIALISE_TASKS", 4, 5);
    public static final e RESCHEDULE_TASKS = new e("RESCHEDULE_TASKS", 5, 6);
    public static final e SET_CONSENT = new e("SET_CONSENT", 6, 7);
    public static final e SET_APP_VISIBLE = new e("SET_APP_VISIBLE", 7, 10);
    public static final e POKE_SDK_AFTER_UPGRADE = new e("POKE_SDK_AFTER_UPGRADE", 8, 11);
    public static final e SDK_TASK_CONFIG = new e("SDK_TASK_CONFIG", 9, 12);
    public static final e STOP_TASK = new e("STOP_TASK", 10, 13);
    public static final e GET_RUNNING_TASKS = new e("GET_RUNNING_TASKS", 11, 14);
    public static final e SET_REGISTRATION_KEY = new e("SET_REGISTRATION_KEY", 12, 15);

    private static final /* synthetic */ e[] $values() {
        return new e[]{INITIALISE_SDK, SCHEDULE_TASK, START_MONITORING, STOP_MONITORING, INITIALISE_TASKS, RESCHEDULE_TASKS, SET_CONSENT, SET_APP_VISIBLE, POKE_SDK_AFTER_UPGRADE, SDK_TASK_CONFIG, STOP_TASK, GET_RUNNING_TASKS, SET_REGISTRATION_KEY};
    }

    static {
        e[] eVarArr$values = $values();
        $VALUES = eVarArr$values;
        $ENTRIES = a.a.j(eVarArr$values);
    }

    private e(String str, int i10, int i11) {
        this.f3981id = i11;
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

    public final int getId() {
        return this.f3981id;
    }
}
