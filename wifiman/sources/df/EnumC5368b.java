package df;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: df.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC5368b {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ EnumC5368b[] $VALUES;
    public static final EnumC5368b PHONE_CALL = new EnumC5368b("PHONE_CALL", 0);
    public static final EnumC5368b EMAIL = new EnumC5368b("EMAIL", 1);
    public static final EnumC5368b WEBSITE = new EnumC5368b("WEBSITE", 2);

    private static final /* synthetic */ EnumC5368b[] $values() {
        return new EnumC5368b[]{PHONE_CALL, EMAIL, WEBSITE};
    }

    static {
        EnumC5368b[] enumC5368bArr$values = $values();
        $VALUES = enumC5368bArr$values;
        $ENTRIES = AbstractC5827b.a(enumC5368bArr$values);
    }

    private EnumC5368b(String str, int i10) {
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static EnumC5368b valueOf(String str) {
        return (EnumC5368b) Enum.valueOf(EnumC5368b.class, str);
    }

    public static EnumC5368b[] values() {
        return (EnumC5368b[]) $VALUES.clone();
    }
}
