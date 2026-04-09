package b1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class g {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g VIEW_APPEAR = new g("VIEW_APPEAR", 0);
    public static final g VIEW_DISAPPEAR = new g("VIEW_DISAPPEAR", 1);

    private static final /* synthetic */ g[] $values() {
        return new g[]{VIEW_APPEAR, VIEW_DISAPPEAR};
    }

    static {
        g[] gVarArr$values = $values();
        $VALUES = gVarArr$values;
        $ENTRIES = a.a.j(gVarArr$values);
    }

    private g(String str, int i10) {
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }
}
