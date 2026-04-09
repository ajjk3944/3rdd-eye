package ff;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ff.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC5820a {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ EnumC5820a[] $VALUES;
    public static final EnumC5820a DOWN = new EnumC5820a("DOWN", 0);
    public static final EnumC5820a UP = new EnumC5820a("UP", 1);

    private static final /* synthetic */ EnumC5820a[] $values() {
        return new EnumC5820a[]{DOWN, UP};
    }

    static {
        EnumC5820a[] enumC5820aArr$values = $values();
        $VALUES = enumC5820aArr$values;
        $ENTRIES = AbstractC5827b.a(enumC5820aArr$values);
    }

    private EnumC5820a(String str, int i10) {
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static EnumC5820a valueOf(String str) {
        return (EnumC5820a) Enum.valueOf(EnumC5820a.class, str);
    }

    public static EnumC5820a[] values() {
        return (EnumC5820a[]) $VALUES.clone();
    }
}
