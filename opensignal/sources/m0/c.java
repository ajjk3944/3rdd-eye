package m0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c CornerExtraExtraLarge = new c("CornerExtraExtraLarge", 0);
    public static final c CornerExtraLarge = new c("CornerExtraLarge", 1);
    public static final c CornerExtraLargeIncreased = new c("CornerExtraLargeIncreased", 2);
    public static final c CornerExtraLargeTop = new c("CornerExtraLargeTop", 3);
    public static final c CornerExtraSmall = new c("CornerExtraSmall", 4);
    public static final c CornerExtraSmallTop = new c("CornerExtraSmallTop", 5);
    public static final c CornerFull = new c("CornerFull", 6);
    public static final c CornerLarge = new c("CornerLarge", 7);
    public static final c CornerLargeEnd = new c("CornerLargeEnd", 8);
    public static final c CornerLargeIncreased = new c("CornerLargeIncreased", 9);
    public static final c CornerLargeStart = new c("CornerLargeStart", 10);
    public static final c CornerLargeTop = new c("CornerLargeTop", 11);
    public static final c CornerMedium = new c("CornerMedium", 12);
    public static final c CornerNone = new c("CornerNone", 13);
    public static final c CornerSmall = new c("CornerSmall", 14);

    private static final /* synthetic */ c[] $values() {
        return new c[]{CornerExtraExtraLarge, CornerExtraLarge, CornerExtraLargeIncreased, CornerExtraLargeTop, CornerExtraSmall, CornerExtraSmallTop, CornerFull, CornerLarge, CornerLargeEnd, CornerLargeIncreased, CornerLargeStart, CornerLargeTop, CornerMedium, CornerNone, CornerSmall};
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
