package ic;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ic.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC6140a {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ EnumC6140a[] $VALUES;
    public static final EnumC6140a NAME = new EnumC6140a("NAME", 0);
    public static final EnumC6140a SIGNAL = new EnumC6140a("SIGNAL", 1);

    private static final /* synthetic */ EnumC6140a[] $values() {
        return new EnumC6140a[]{NAME, SIGNAL};
    }

    static {
        EnumC6140a[] enumC6140aArr$values = $values();
        $VALUES = enumC6140aArr$values;
        $ENTRIES = AbstractC5827b.a(enumC6140aArr$values);
    }

    private EnumC6140a(String str, int i10) {
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static EnumC6140a valueOf(String str) {
        return (EnumC6140a) Enum.valueOf(EnumC6140a.class, str);
    }

    public static EnumC6140a[] values() {
        return (EnumC6140a[]) $VALUES.clone();
    }
}
