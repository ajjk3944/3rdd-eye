package aj;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: aj.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC3867a {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ EnumC3867a[] $VALUES;
    public static final EnumC3867a NONE = new EnumC3867a("NONE", 0);
    public static final EnumC3867a ALL_JSON_OBJECTS = new EnumC3867a("ALL_JSON_OBJECTS", 1);
    public static final EnumC3867a POLYMORPHIC = new EnumC3867a("POLYMORPHIC", 2);

    private static final /* synthetic */ EnumC3867a[] $values() {
        return new EnumC3867a[]{NONE, ALL_JSON_OBJECTS, POLYMORPHIC};
    }

    static {
        EnumC3867a[] enumC3867aArr$values = $values();
        $VALUES = enumC3867aArr$values;
        $ENTRIES = AbstractC5827b.a(enumC3867aArr$values);
    }

    private EnumC3867a(String str, int i10) {
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static EnumC3867a valueOf(String str) {
        return (EnumC3867a) Enum.valueOf(EnumC3867a.class, str);
    }

    public static EnumC3867a[] values() {
        return (EnumC3867a[]) $VALUES.clone();
    }
}
