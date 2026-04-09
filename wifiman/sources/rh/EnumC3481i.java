package Rh;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Rh.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC3481i {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ EnumC3481i[] $VALUES;
    public static final EnumC3481i READ_ONLY = new EnumC3481i("READ_ONLY", 0);
    public static final EnumC3481i MUTABLE = new EnumC3481i("MUTABLE", 1);

    private static final /* synthetic */ EnumC3481i[] $values() {
        return new EnumC3481i[]{READ_ONLY, MUTABLE};
    }

    static {
        EnumC3481i[] enumC3481iArr$values = $values();
        $VALUES = enumC3481iArr$values;
        $ENTRIES = AbstractC5827b.a(enumC3481iArr$values);
    }

    private EnumC3481i(String str, int i10) {
    }

    public static EnumC3481i valueOf(String str) {
        return (EnumC3481i) Enum.valueOf(EnumC3481i.class, str);
    }

    public static EnumC3481i[] values() {
        return (EnumC3481i[]) $VALUES.clone();
    }
}
