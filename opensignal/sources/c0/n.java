package c0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class n {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ n[] $VALUES;
    public static final n Vertical = new n("Vertical", 0);
    public static final n Horizontal = new n("Horizontal", 1);
    public static final n Both = new n("Both", 2);

    private static final /* synthetic */ n[] $values() {
        return new n[]{Vertical, Horizontal, Both};
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
}
