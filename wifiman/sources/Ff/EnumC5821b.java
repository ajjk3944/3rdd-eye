package ff;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ff.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC5821b {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ EnumC5821b[] $VALUES;
    public static final EnumC5821b INTERNAL = new EnumC5821b("INTERNAL", 0);
    public static final EnumC5821b SERVER_UNREACHABLE = new EnumC5821b("SERVER_UNREACHABLE", 1);
    public static final EnumC5821b UNEXPECTED = new EnumC5821b("UNEXPECTED", 2);

    private static final /* synthetic */ EnumC5821b[] $values() {
        return new EnumC5821b[]{INTERNAL, SERVER_UNREACHABLE, UNEXPECTED};
    }

    static {
        EnumC5821b[] enumC5821bArr$values = $values();
        $VALUES = enumC5821bArr$values;
        $ENTRIES = AbstractC5827b.a(enumC5821bArr$values);
    }

    private EnumC5821b(String str, int i10) {
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static EnumC5821b valueOf(String str) {
        return (EnumC5821b) Enum.valueOf(EnumC5821b.class, str);
    }

    public static EnumC5821b[] values() {
        return (EnumC5821b[]) $VALUES.clone();
    }
}
