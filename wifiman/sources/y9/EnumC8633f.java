package y9;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: y9.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC8633f {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ EnumC8633f[] $VALUES;
    public static final EnumC8633f DEFAULT = new EnumC8633f("DEFAULT", 0);
    public static final EnumC8633f BOTTOM = new EnumC8633f("BOTTOM", 1);
    public static final EnumC8633f TOP = new EnumC8633f("TOP", 2);

    private static final /* synthetic */ EnumC8633f[] $values() {
        return new EnumC8633f[]{DEFAULT, BOTTOM, TOP};
    }

    static {
        EnumC8633f[] enumC8633fArr$values = $values();
        $VALUES = enumC8633fArr$values;
        $ENTRIES = AbstractC5827b.a(enumC8633fArr$values);
    }

    private EnumC8633f(String str, int i10) {
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static EnumC8633f valueOf(String str) {
        return (EnumC8633f) Enum.valueOf(EnumC8633f.class, str);
    }

    public static EnumC8633f[] values() {
        return (EnumC8633f[]) $VALUES.clone();
    }
}
