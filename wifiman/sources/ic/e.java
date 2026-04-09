package ic;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class e {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e ALL = new e("ALL", 0);
    public static final e GHZ_2 = new e("GHZ_2", 1);
    public static final e GHZ_5 = new e("GHZ_5", 2);
    public static final e GHZ_6 = new e("GHZ_6", 3);

    private static final /* synthetic */ e[] $values() {
        return new e[]{ALL, GHZ_2, GHZ_5, GHZ_6};
    }

    static {
        e[] eVarArr$values = $values();
        $VALUES = eVarArr$values;
        $ENTRIES = AbstractC5827b.a(eVarArr$values);
    }

    private e(String str, int i10) {
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
