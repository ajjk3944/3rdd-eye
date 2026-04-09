package h8;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: h8.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC5958c {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ EnumC5958c[] $VALUES;
    public static final EnumC5958c PAUSED = new EnumC5958c("PAUSED", 0);
    public static final EnumC5958c STOPPED = new EnumC5958c("STOPPED", 1);
    public static final EnumC5958c VIEW_DESTROYED = new EnumC5958c("VIEW_DESTROYED", 2);
    public static final EnumC5958c DESTROYED = new EnumC5958c("DESTROYED", 3);

    private static final /* synthetic */ EnumC5958c[] $values() {
        return new EnumC5958c[]{PAUSED, STOPPED, VIEW_DESTROYED, DESTROYED};
    }

    static {
        EnumC5958c[] enumC5958cArr$values = $values();
        $VALUES = enumC5958cArr$values;
        $ENTRIES = AbstractC5827b.a(enumC5958cArr$values);
    }

    private EnumC5958c(String str, int i10) {
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static EnumC5958c valueOf(String str) {
        return (EnumC5958c) Enum.valueOf(EnumC5958c.class, str);
    }

    public static EnumC5958c[] values() {
        return (EnumC5958c[]) $VALUES.clone();
    }
}
