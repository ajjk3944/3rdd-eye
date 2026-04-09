package com.ui.wifiman.model.speedtest.result;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class a {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a INTERNET = new a("INTERNET", 0);
    public static final a INTERNET_ISP = new a("INTERNET_ISP", 1);
    public static final a LOCAL_SERVER = new a("LOCAL_SERVER", 2);
    public static final a WIFIMAN_APP = new a("WIFIMAN_APP", 3);

    private static final /* synthetic */ a[] $values() {
        return new a[]{INTERNET, INTERNET_ISP, LOCAL_SERVER, WIFIMAN_APP};
    }

    static {
        a[] aVarArr$values = $values();
        $VALUES = aVarArr$values;
        $ENTRIES = AbstractC5827b.a(aVarArr$values);
    }

    private a(String str, int i10) {
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
