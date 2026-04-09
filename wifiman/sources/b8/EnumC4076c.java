package b8;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: b8.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC4076c {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ EnumC4076c[] $VALUES;
    public static final EnumC4076c DISCONNECTED = new EnumC4076c("DISCONNECTED", 0);
    public static final EnumC4076c MOBILE = new EnumC4076c("MOBILE", 1);
    public static final EnumC4076c WIFI = new EnumC4076c("WIFI", 2);
    public static final EnumC4076c ETHERNET = new EnumC4076c("ETHERNET", 3);
    public static final EnumC4076c UNKNOWN = new EnumC4076c("UNKNOWN", 4);

    private static final /* synthetic */ EnumC4076c[] $values() {
        return new EnumC4076c[]{DISCONNECTED, MOBILE, WIFI, ETHERNET, UNKNOWN};
    }

    static {
        EnumC4076c[] enumC4076cArr$values = $values();
        $VALUES = enumC4076cArr$values;
        $ENTRIES = AbstractC5827b.a(enumC4076cArr$values);
    }

    private EnumC4076c(String str, int i10) {
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static EnumC4076c valueOf(String str) {
        return (EnumC4076c) Enum.valueOf(EnumC4076c.class, str);
    }

    public static EnumC4076c[] values() {
        return (EnumC4076c[]) $VALUES.clone();
    }
}
