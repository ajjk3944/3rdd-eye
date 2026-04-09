package gc;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: gc.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC5894a {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ EnumC5894a[] $VALUES;
    public static final EnumC5894a SIGNAL = new EnumC5894a("SIGNAL", 0);
    public static final EnumC5894a FLOORPLAN = new EnumC5894a("FLOORPLAN", 1);

    private static final /* synthetic */ EnumC5894a[] $values() {
        return new EnumC5894a[]{SIGNAL, FLOORPLAN};
    }

    static {
        EnumC5894a[] enumC5894aArr$values = $values();
        $VALUES = enumC5894aArr$values;
        $ENTRIES = AbstractC5827b.a(enumC5894aArr$values);
    }

    private EnumC5894a(String str, int i10) {
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static EnumC5894a valueOf(String str) {
        return (EnumC5894a) Enum.valueOf(EnumC5894a.class, str);
    }

    public static EnumC5894a[] values() {
        return (EnumC5894a[]) $VALUES.clone();
    }
}
