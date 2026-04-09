package fc;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: fc.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC5806c {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ EnumC5806c[] $VALUES;
    public static final EnumC5806c LAN = new EnumC5806c("LAN", 0);
    public static final EnumC5806c BLUETOOTH = new EnumC5806c("BLUETOOTH", 1);

    private static final /* synthetic */ EnumC5806c[] $values() {
        return new EnumC5806c[]{LAN, BLUETOOTH};
    }

    static {
        EnumC5806c[] enumC5806cArr$values = $values();
        $VALUES = enumC5806cArr$values;
        $ENTRIES = AbstractC5827b.a(enumC5806cArr$values);
    }

    private EnumC5806c(String str, int i10) {
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static EnumC5806c valueOf(String str) {
        return (EnumC5806c) Enum.valueOf(EnumC5806c.class, str);
    }

    public static EnumC5806c[] values() {
        return (EnumC5806c[]) $VALUES.clone();
    }
}
