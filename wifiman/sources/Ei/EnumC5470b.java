package ei;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ei.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC5470b {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ EnumC5470b[] $VALUES;
    public static final EnumC5470b WARNING = new EnumC5470b("WARNING", 0);
    public static final EnumC5470b ERROR = new EnumC5470b("ERROR", 1);
    public static final EnumC5470b HIDDEN = new EnumC5470b("HIDDEN", 2);

    private static final /* synthetic */ EnumC5470b[] $values() {
        return new EnumC5470b[]{WARNING, ERROR, HIDDEN};
    }

    static {
        EnumC5470b[] enumC5470bArr$values = $values();
        $VALUES = enumC5470bArr$values;
        $ENTRIES = AbstractC5827b.a(enumC5470bArr$values);
    }

    private EnumC5470b(String str, int i10) {
    }

    public static EnumC5470b valueOf(String str) {
        return (EnumC5470b) Enum.valueOf(EnumC5470b.class, str);
    }

    public static EnumC5470b[] values() {
        return (EnumC5470b[]) $VALUES.clone();
    }
}
