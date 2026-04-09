package Rh;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Rh.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC3483k {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ EnumC3483k[] $VALUES;
    public static final EnumC3483k FORCE_FLEXIBILITY = new EnumC3483k("FORCE_FLEXIBILITY", 0);
    public static final EnumC3483k NULLABLE = new EnumC3483k("NULLABLE", 1);
    public static final EnumC3483k NOT_NULL = new EnumC3483k("NOT_NULL", 2);

    private static final /* synthetic */ EnumC3483k[] $values() {
        return new EnumC3483k[]{FORCE_FLEXIBILITY, NULLABLE, NOT_NULL};
    }

    static {
        EnumC3483k[] enumC3483kArr$values = $values();
        $VALUES = enumC3483kArr$values;
        $ENTRIES = AbstractC5827b.a(enumC3483kArr$values);
    }

    private EnumC3483k(String str, int i10) {
    }

    public static EnumC3483k valueOf(String str) {
        return (EnumC3483k) Enum.valueOf(EnumC3483k.class, str);
    }

    public static EnumC3483k[] values() {
        return (EnumC3483k[]) $VALUES.clone();
    }
}
