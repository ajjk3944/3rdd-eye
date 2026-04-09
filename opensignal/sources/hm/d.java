package hm;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d ALL_TIME;
    public static final c Companion;
    public static final d PAST_MONTH;
    public static final d PAST_WEEK;
    public static final d SAME_DAY;
    public static final d YESTERDAY;
    private static final d defaultTimeFilter;

    private static final /* synthetic */ d[] $values() {
        return new d[]{SAME_DAY, YESTERDAY, PAST_WEEK, PAST_MONTH, ALL_TIME};
    }

    static {
        d dVar = new d("SAME_DAY", 0);
        SAME_DAY = dVar;
        YESTERDAY = new d("YESTERDAY", 1);
        PAST_WEEK = new d("PAST_WEEK", 2);
        PAST_MONTH = new d("PAST_MONTH", 3);
        ALL_TIME = new d("ALL_TIME", 4);
        d[] dVarArr$values = $values();
        $VALUES = dVarArr$values;
        $ENTRIES = a.a.j(dVarArr$values);
        Companion = new c();
        defaultTimeFilter = dVar;
    }

    private d(String str, int i10) {
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
