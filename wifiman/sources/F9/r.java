package F9;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class r {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ r[] $VALUES;
    public static final r DEFAULT = new r("DEFAULT", 0);
    public static final r DEFAULT_WITH_BLUE_ICON = new r("DEFAULT_WITH_BLUE_ICON", 1);
    public static final r BLUE = new r("BLUE", 2);
    public static final r RED = new r("RED", 3);

    private static final /* synthetic */ r[] $values() {
        return new r[]{DEFAULT, DEFAULT_WITH_BLUE_ICON, BLUE, RED};
    }

    static {
        r[] rVarArr$values = $values();
        $VALUES = rVarArr$values;
        $ENTRIES = AbstractC5827b.a(rVarArr$values);
    }

    private r(String str, int i10) {
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) $VALUES.clone();
    }
}
