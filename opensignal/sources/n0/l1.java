package n0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class l1 {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ l1[] $VALUES;
    public static final l1 ShutDown = new l1("ShutDown", 0);
    public static final l1 ShuttingDown = new l1("ShuttingDown", 1);
    public static final l1 Inactive = new l1("Inactive", 2);
    public static final l1 InactivePendingWork = new l1("InactivePendingWork", 3);
    public static final l1 Idle = new l1("Idle", 4);
    public static final l1 PendingWork = new l1("PendingWork", 5);

    private static final /* synthetic */ l1[] $values() {
        return new l1[]{ShutDown, ShuttingDown, Inactive, InactivePendingWork, Idle, PendingWork};
    }

    static {
        l1[] l1VarArr$values = $values();
        $VALUES = l1VarArr$values;
        $ENTRIES = a.a.j(l1VarArr$values);
    }

    private l1(String str, int i10) {
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static l1 valueOf(String str) {
        return (l1) Enum.valueOf(l1.class, str);
    }

    public static l1[] values() {
        return (l1[]) $VALUES.clone();
    }
}
