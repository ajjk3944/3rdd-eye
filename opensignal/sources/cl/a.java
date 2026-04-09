package cl;

import qk.i;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a FIRST = new a("FIRST", 0, i.network_rank_page1);
    public static final a SECOND = new a("SECOND", 1, i.network_rank_page2);
    private final int layoutResId;

    private static final /* synthetic */ a[] $values() {
        return new a[]{FIRST, SECOND};
    }

    static {
        a[] aVarArr$values = $values();
        $VALUES = aVarArr$values;
        $ENTRIES = a.a.j(aVarArr$values);
    }

    private a(String str, int i10, int i11) {
        this.layoutResId = i11;
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final int getLayoutResId() {
        return this.layoutResId;
    }
}
