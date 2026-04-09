package zf;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: zf.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC8738a {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ EnumC8738a[] $VALUES;
    public static final EnumC8738a AP = new EnumC8738a("AP", 0);
    public static final EnumC8738a INTERFERE = new EnumC8738a("INTERFERE", 1);

    private static final /* synthetic */ EnumC8738a[] $values() {
        return new EnumC8738a[]{AP, INTERFERE};
    }

    static {
        EnumC8738a[] enumC8738aArr$values = $values();
        $VALUES = enumC8738aArr$values;
        $ENTRIES = AbstractC5827b.a(enumC8738aArr$values);
    }

    private EnumC8738a(String str, int i10) {
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static EnumC8738a valueOf(String str) {
        return (EnumC8738a) Enum.valueOf(EnumC8738a.class, str);
    }

    public static EnumC8738a[] values() {
        return (EnumC8738a[]) $VALUES.clone();
    }
}
