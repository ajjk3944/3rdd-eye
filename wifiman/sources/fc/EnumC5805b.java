package fc;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: fc.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC5805b {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ EnumC5805b[] $VALUES;
    public static final EnumC5805b IP = new EnumC5805b("IP", 0);
    public static final EnumC5805b NAME = new EnumC5805b("NAME", 1);

    private static final /* synthetic */ EnumC5805b[] $values() {
        return new EnumC5805b[]{IP, NAME};
    }

    static {
        EnumC5805b[] enumC5805bArr$values = $values();
        $VALUES = enumC5805bArr$values;
        $ENTRIES = AbstractC5827b.a(enumC5805bArr$values);
    }

    private EnumC5805b(String str, int i10) {
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static EnumC5805b valueOf(String str) {
        return (EnumC5805b) Enum.valueOf(EnumC5805b.class, str);
    }

    public static EnumC5805b[] values() {
        return (EnumC5805b[]) $VALUES.clone();
    }
}
