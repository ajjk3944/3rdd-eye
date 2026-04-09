package gm;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b LATENCY_STARTED = new b("LATENCY_STARTED", 0);
    public static final b LATENCY_RUNNING = new b("LATENCY_RUNNING", 1);
    public static final b LATENCY_FINISHED = new b("LATENCY_FINISHED", 2);
    public static final b DOWNLOAD_STARTED = new b("DOWNLOAD_STARTED", 3);
    public static final b DOWNLOAD_RUNNING = new b("DOWNLOAD_RUNNING", 4);
    public static final b DOWNLOAD_FINISHED = new b("DOWNLOAD_FINISHED", 5);
    public static final b UPLOAD_STARTED = new b("UPLOAD_STARTED", 6);
    public static final b UPLOAD_RUNNING = new b("UPLOAD_RUNNING", 7);
    public static final b UPLOAD_FINISHED = new b("UPLOAD_FINISHED", 8);
    public static final b UNMAPPED = new b("UNMAPPED", 9);

    private static final /* synthetic */ b[] $values() {
        return new b[]{LATENCY_STARTED, LATENCY_RUNNING, LATENCY_FINISHED, DOWNLOAD_STARTED, DOWNLOAD_RUNNING, DOWNLOAD_FINISHED, UPLOAD_STARTED, UPLOAD_RUNNING, UPLOAD_FINISHED, UNMAPPED};
    }

    static {
        b[] bVarArr$values = $values();
        $VALUES = bVarArr$values;
        $ENTRIES = a.a.j(bVarArr$values);
    }

    private b(String str, int i10) {
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
