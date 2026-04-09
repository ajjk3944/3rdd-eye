package du;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c CPU_ACQUIRED = new c("CPU_ACQUIRED", 0);
    public static final c BLOCKING = new c("BLOCKING", 1);
    public static final c PARKING = new c("PARKING", 2);
    public static final c DORMANT = new c("DORMANT", 3);
    public static final c TERMINATED = new c("TERMINATED", 4);

    private static final /* synthetic */ c[] $values() {
        return new c[]{CPU_ACQUIRED, BLOCKING, PARKING, DORMANT, TERMINATED};
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
