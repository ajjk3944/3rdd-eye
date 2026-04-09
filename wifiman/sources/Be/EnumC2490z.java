package Be;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Be.z, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC2490z {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ EnumC2490z[] $VALUES;
    public static final EnumC2490z RTL = new EnumC2490z("RTL", 0);
    public static final EnumC2490z LTR = new EnumC2490z("LTR", 1);
    public static final EnumC2490z NOT_STARTED = new EnumC2490z("NOT_STARTED", 2);
    public static final EnumC2490z FINISHED = new EnumC2490z("FINISHED", 3);

    private static final /* synthetic */ EnumC2490z[] $values() {
        return new EnumC2490z[]{RTL, LTR, NOT_STARTED, FINISHED};
    }

    static {
        EnumC2490z[] enumC2490zArr$values = $values();
        $VALUES = enumC2490zArr$values;
        $ENTRIES = AbstractC5827b.a(enumC2490zArr$values);
    }

    private EnumC2490z(String str, int i10) {
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static EnumC2490z valueOf(String str) {
        return (EnumC2490z) Enum.valueOf(EnumC2490z.class, str);
    }

    public static EnumC2490z[] values() {
        return (EnumC2490z[]) $VALUES.clone();
    }
}
