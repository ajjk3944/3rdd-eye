package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class n {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ n[] $VALUES;
    public static final n DESTROYED = new n("DESTROYED", 0);
    public static final n INITIALIZED = new n("INITIALIZED", 1);
    public static final n CREATED = new n("CREATED", 2);
    public static final n STARTED = new n("STARTED", 3);
    public static final n RESUMED = new n("RESUMED", 4);

    private static final /* synthetic */ n[] $values() {
        return new n[]{DESTROYED, INITIALIZED, CREATED, STARTED, RESUMED};
    }

    static {
        n[] nVarArr$values = $values();
        $VALUES = nVarArr$values;
        $ENTRIES = a.a.j(nVarArr$values);
    }

    private n(String str, int i10) {
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }

    public final boolean isAtLeast(n nVar) {
        br.l.e(nVar, "state");
        return compareTo(nVar) >= 0;
    }
}
