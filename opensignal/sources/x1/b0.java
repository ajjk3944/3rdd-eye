package x1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b0 {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ b0[] $VALUES;
    public static final b0 Measuring = new b0("Measuring", 0);
    public static final b0 LookaheadMeasuring = new b0("LookaheadMeasuring", 1);
    public static final b0 LayingOut = new b0("LayingOut", 2);
    public static final b0 LookaheadLayingOut = new b0("LookaheadLayingOut", 3);
    public static final b0 Idle = new b0("Idle", 4);

    private static final /* synthetic */ b0[] $values() {
        return new b0[]{Measuring, LookaheadMeasuring, LayingOut, LookaheadLayingOut, Idle};
    }

    static {
        b0[] b0VarArr$values = $values();
        $VALUES = b0VarArr$values;
        $ENTRIES = a.a.j(b0VarArr$values);
    }

    private b0(String str, int i10) {
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static b0 valueOf(String str) {
        return (b0) Enum.valueOf(b0.class, str);
    }

    public static b0[] values() {
        return (b0[]) $VALUES.clone();
    }
}
