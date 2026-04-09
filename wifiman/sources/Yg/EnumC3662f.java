package Yg;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Yg.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC3662f {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ EnumC3662f[] $VALUES;
    public static final EnumC3662f WARNING = new EnumC3662f("WARNING", 0);
    public static final EnumC3662f ERROR = new EnumC3662f("ERROR", 1);
    public static final EnumC3662f HIDDEN = new EnumC3662f("HIDDEN", 2);

    private static final /* synthetic */ EnumC3662f[] $values() {
        return new EnumC3662f[]{WARNING, ERROR, HIDDEN};
    }

    static {
        EnumC3662f[] enumC3662fArr$values = $values();
        $VALUES = enumC3662fArr$values;
        $ENTRIES = AbstractC5827b.a(enumC3662fArr$values);
    }

    private EnumC3662f(String str, int i10) {
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static EnumC3662f valueOf(String str) {
        return (EnumC3662f) Enum.valueOf(EnumC3662f.class, str);
    }

    public static EnumC3662f[] values() {
        return (EnumC3662f[]) $VALUES.clone();
    }
}
