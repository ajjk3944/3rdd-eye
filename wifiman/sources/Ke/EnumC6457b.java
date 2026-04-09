package ke;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ke.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC6457b {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ EnumC6457b[] $VALUES;
    public static final EnumC6457b EHT = new EnumC6457b("EHT", 0);
    public static final EnumC6457b HE = new EnumC6457b("HE", 1);
    public static final EnumC6457b VHT = new EnumC6457b("VHT", 2);
    public static final EnumC6457b HT = new EnumC6457b("HT", 3);

    private static final /* synthetic */ EnumC6457b[] $values() {
        return new EnumC6457b[]{EHT, HE, VHT, HT};
    }

    static {
        EnumC6457b[] enumC6457bArr$values = $values();
        $VALUES = enumC6457bArr$values;
        $ENTRIES = AbstractC5827b.a(enumC6457bArr$values);
    }

    private EnumC6457b(String str, int i10) {
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static EnumC6457b valueOf(String str) {
        return (EnumC6457b) Enum.valueOf(EnumC6457b.class, str);
    }

    public static EnumC6457b[] values() {
        return (EnumC6457b[]) $VALUES.clone();
    }
}
