package fc;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: fc.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC5804a {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ EnumC5804a[] $VALUES;
    public static final EnumC5804a NAME = new EnumC5804a("NAME", 0);
    public static final EnumC5804a SIGNAL = new EnumC5804a("SIGNAL", 1);
    public static final EnumC5804a MAC = new EnumC5804a("MAC", 2);

    private static final /* synthetic */ EnumC5804a[] $values() {
        return new EnumC5804a[]{NAME, SIGNAL, MAC};
    }

    static {
        EnumC5804a[] enumC5804aArr$values = $values();
        $VALUES = enumC5804aArr$values;
        $ENTRIES = AbstractC5827b.a(enumC5804aArr$values);
    }

    private EnumC5804a(String str, int i10) {
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static EnumC5804a valueOf(String str) {
        return (EnumC5804a) Enum.valueOf(EnumC5804a.class, str);
    }

    public static EnumC5804a[] values() {
        return (EnumC5804a[]) $VALUES.clone();
    }
}
