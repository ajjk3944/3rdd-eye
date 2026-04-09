package F9;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: F9.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC2847k {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ EnumC2847k[] $VALUES;
    public static final EnumC2847k START = new EnumC2847k("START", 0);
    public static final EnumC2847k END = new EnumC2847k("END", 1);

    private static final /* synthetic */ EnumC2847k[] $values() {
        return new EnumC2847k[]{START, END};
    }

    static {
        EnumC2847k[] enumC2847kArr$values = $values();
        $VALUES = enumC2847kArr$values;
        $ENTRIES = AbstractC5827b.a(enumC2847kArr$values);
    }

    private EnumC2847k(String str, int i10) {
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static EnumC2847k valueOf(String str) {
        return (EnumC2847k) Enum.valueOf(EnumC2847k.class, str);
    }

    public static EnumC2847k[] values() {
        return (EnumC2847k[]) $VALUES.clone();
    }
}
