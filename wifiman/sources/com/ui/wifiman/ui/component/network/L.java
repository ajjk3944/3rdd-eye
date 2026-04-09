package com.ui.wifiman.ui.component.network;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class L {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ L[] $VALUES;
    public static final L REACHABLE = new L("REACHABLE", 0);
    public static final L UNREACHABLE = new L("UNREACHABLE", 1);
    public static final L REACHABLE_WITH_ISSUES = new L("REACHABLE_WITH_ISSUES", 2);
    public static final L CHECKING = new L("CHECKING", 3);

    private static final /* synthetic */ L[] $values() {
        return new L[]{REACHABLE, UNREACHABLE, REACHABLE_WITH_ISSUES, CHECKING};
    }

    static {
        L[] lArr$values = $values();
        $VALUES = lArr$values;
        $ENTRIES = AbstractC5827b.a(lArr$values);
    }

    private L(String str, int i10) {
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static L valueOf(String str) {
        return (L) Enum.valueOf(L.class, str);
    }

    public static L[] values() {
        return (L[]) $VALUES.clone();
    }
}
