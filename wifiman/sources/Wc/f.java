package wc;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class f {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f BLE = new f("BLE", 0);
    public static final f BLE_AND_CLASSIC = new f("BLE_AND_CLASSIC", 1);

    private static final /* synthetic */ f[] $values() {
        return new f[]{BLE, BLE_AND_CLASSIC};
    }

    static {
        f[] fVarArr$values = $values();
        $VALUES = fVarArr$values;
        $ENTRIES = AbstractC5827b.a(fVarArr$values);
    }

    private f(String str, int i10) {
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
