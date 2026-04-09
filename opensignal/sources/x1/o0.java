package x1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class o0 {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ o0[] $VALUES;
    public static final o0 IsPlacedInLookahead = new o0("IsPlacedInLookahead", 0);
    public static final o0 IsPlacedInApproach = new o0("IsPlacedInApproach", 1);
    public static final o0 IsNotPlaced = new o0("IsNotPlaced", 2);

    private static final /* synthetic */ o0[] $values() {
        return new o0[]{IsPlacedInLookahead, IsPlacedInApproach, IsNotPlaced};
    }

    static {
        o0[] o0VarArr$values = $values();
        $VALUES = o0VarArr$values;
        $ENTRIES = a.a.j(o0VarArr$values);
    }

    private o0(String str, int i10) {
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static o0 valueOf(String str) {
        return (o0) Enum.valueOf(o0.class, str);
    }

    public static o0[] values() {
        return (o0[]) $VALUES.clone();
    }
}
