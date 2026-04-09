package ni;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ni.r, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC6986r {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ EnumC6986r[] $VALUES;
    public static final EnumC6986r STABLE = new EnumC6986r("STABLE", 0);
    public static final EnumC6986r UNSTABLE = new EnumC6986r("UNSTABLE", 1);

    private static final /* synthetic */ EnumC6986r[] $values() {
        return new EnumC6986r[]{STABLE, UNSTABLE};
    }

    static {
        EnumC6986r[] enumC6986rArr$values = $values();
        $VALUES = enumC6986rArr$values;
        $ENTRIES = AbstractC5827b.a(enumC6986rArr$values);
    }

    private EnumC6986r(String str, int i10) {
    }

    public static EnumC6986r valueOf(String str) {
        return (EnumC6986r) Enum.valueOf(EnumC6986r.class, str);
    }

    public static EnumC6986r[] values() {
        return (EnumC6986r[]) $VALUES.clone();
    }
}
