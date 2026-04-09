package com.ui.wifiman.ui.teleport;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class z {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ z[] $VALUES;
    public static final z LOADING = new z("LOADING", 0);
    public static final z ONLINE = new z("ONLINE", 1);
    public static final z OFFLINE = new z("OFFLINE", 2);
    public static final z UNSTABLE = new z("UNSTABLE", 3);

    private static final /* synthetic */ z[] $values() {
        return new z[]{LOADING, ONLINE, OFFLINE, UNSTABLE};
    }

    static {
        z[] zVarArr$values = $values();
        $VALUES = zVarArr$values;
        $ENTRIES = AbstractC5827b.a(zVarArr$values);
    }

    private z(String str, int i10) {
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) $VALUES.clone();
    }
}
