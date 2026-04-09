package x1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d0 {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ d0[] $VALUES;
    public static final d0 InMeasureBlock = new d0("InMeasureBlock", 0);
    public static final d0 InLayoutBlock = new d0("InLayoutBlock", 1);
    public static final d0 NotUsed = new d0("NotUsed", 2);

    private static final /* synthetic */ d0[] $values() {
        return new d0[]{InMeasureBlock, InLayoutBlock, NotUsed};
    }

    static {
        d0[] d0VarArr$values = $values();
        $VALUES = d0VarArr$values;
        $ENTRIES = a.a.j(d0VarArr$values);
    }

    private d0(String str, int i10) {
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static d0 valueOf(String str) {
        return (d0) Enum.valueOf(d0.class, str);
    }

    public static d0[] values() {
        return (d0[]) $VALUES.clone();
    }
}
