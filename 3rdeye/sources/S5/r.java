package S5;

import i9.InterfaceC4463a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PlacementType.kt */
/* loaded from: classes2.dex */
public final class r {
    private static final /* synthetic */ InterfaceC4463a $ENTRIES;
    private static final /* synthetic */ r[] $VALUES;
    public static final r ALIGNMENT = new r("ALIGNMENT", 0);
    public static final r DROPDOWN = new r("DROPDOWN", 1);
    public static final r CENTER = new r("CENTER", 2);

    private static final /* synthetic */ r[] $values() {
        return new r[]{ALIGNMENT, DROPDOWN, CENTER};
    }

    static {
        r[] rVarArr$values = $values();
        $VALUES = rVarArr$values;
        $ENTRIES = com.google.gson.internal.c.l(rVarArr$values);
    }

    private r(String str, int i) {
    }

    public static InterfaceC4463a<r> getEntries() {
        return $ENTRIES;
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) $VALUES.clone();
    }
}
