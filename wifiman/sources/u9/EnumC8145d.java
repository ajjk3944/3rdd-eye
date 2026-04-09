package u9;

import Zg.AbstractC3689v;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: u9.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC8145d {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ EnumC8145d[] $VALUES;
    public static final EnumC8145d MFA = new EnumC8145d("MFA", 0, new C8144c(AbstractC3689v.o(new C8143b(1), new C8143b(1), new C8143b(1), new C8143b(1), new C8143b(1), new C8143b(1)), ""));
    public static final EnumC8145d RECOVERY = new EnumC8145d("RECOVERY", 1, new C8144c(AbstractC3689v.o(new C8143b(6), new C8143b(6)), "-"));
    private final C8144c params;

    private static final /* synthetic */ EnumC8145d[] $values() {
        return new EnumC8145d[]{MFA, RECOVERY};
    }

    static {
        EnumC8145d[] enumC8145dArr$values = $values();
        $VALUES = enumC8145dArr$values;
        $ENTRIES = AbstractC5827b.a(enumC8145dArr$values);
    }

    private EnumC8145d(String str, int i10, C8144c c8144c) {
        this.params = c8144c;
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static EnumC8145d valueOf(String str) {
        return (EnumC8145d) Enum.valueOf(EnumC8145d.class, str);
    }

    public static EnumC8145d[] values() {
        return (EnumC8145d[]) $VALUES.clone();
    }

    public final C8144c getParams() {
        return this.params;
    }
}
