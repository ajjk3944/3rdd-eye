package w9;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: w9.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC8286c {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ EnumC8286c[] $VALUES;
    public static final EnumC8286c DEFAULT = new EnumC8286c("DEFAULT", 0);
    public static final EnumC8286c CLEAR = new EnumC8286c("CLEAR", 1);

    private static final /* synthetic */ EnumC8286c[] $values() {
        return new EnumC8286c[]{DEFAULT, CLEAR};
    }

    static {
        EnumC8286c[] enumC8286cArr$values = $values();
        $VALUES = enumC8286cArr$values;
        $ENTRIES = AbstractC5827b.a(enumC8286cArr$values);
    }

    private EnumC8286c(String str, int i10) {
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static EnumC8286c valueOf(String str) {
        return (EnumC8286c) Enum.valueOf(EnumC8286c.class, str);
    }

    public static EnumC8286c[] values() {
        return (EnumC8286c[]) $VALUES.clone();
    }
}
