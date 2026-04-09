package x1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class x1 {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ x1[] $VALUES;
    public static final x1 ContinueTraversal = new x1("ContinueTraversal", 0);
    public static final x1 SkipSubtreeAndContinueTraversal = new x1("SkipSubtreeAndContinueTraversal", 1);
    public static final x1 CancelTraversal = new x1("CancelTraversal", 2);

    private static final /* synthetic */ x1[] $values() {
        return new x1[]{ContinueTraversal, SkipSubtreeAndContinueTraversal, CancelTraversal};
    }

    static {
        x1[] x1VarArr$values = $values();
        $VALUES = x1VarArr$values;
        $ENTRIES = a.a.j(x1VarArr$values);
    }

    private x1(String str, int i10) {
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static x1 valueOf(String str) {
        return (x1) Enum.valueOf(x1.class, str);
    }

    public static x1[] values() {
        return (x1[]) $VALUES.clone();
    }
}
