package com.ui.wifiman.ui.signal;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.ui.wifiman.ui.signal.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC5231d {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ EnumC5231d[] $VALUES;
    public static final EnumC5231d SIGNAL = new EnumC5231d("SIGNAL", 0);
    public static final EnumC5231d FLOORPLAN = new EnumC5231d("FLOORPLAN", 1);

    private static final /* synthetic */ EnumC5231d[] $values() {
        return new EnumC5231d[]{SIGNAL, FLOORPLAN};
    }

    static {
        EnumC5231d[] enumC5231dArr$values = $values();
        $VALUES = enumC5231dArr$values;
        $ENTRIES = AbstractC5827b.a(enumC5231dArr$values);
    }

    private EnumC5231d(String str, int i10) {
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static EnumC5231d valueOf(String str) {
        return (EnumC5231d) Enum.valueOf(EnumC5231d.class, str);
    }

    public static EnumC5231d[] values() {
        return (EnumC5231d[]) $VALUES.clone();
    }
}
