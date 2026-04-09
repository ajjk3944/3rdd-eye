package Hf;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class a {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a LOCATION_PERMISSION = new a("LOCATION_PERMISSION", 0);
    public static final a BLUETOOTH_PERMISSION = new a("BLUETOOTH_PERMISSION", 1);
    public static final a NOTIFICATION_PERMISSION = new a("NOTIFICATION_PERMISSION", 2);
    public static final a APP_TO_APP_SPEEDTEST = new a("APP_TO_APP_SPEEDTEST", 3);

    private static final /* synthetic */ a[] $values() {
        return new a[]{LOCATION_PERMISSION, BLUETOOTH_PERMISSION, NOTIFICATION_PERMISSION, APP_TO_APP_SPEEDTEST};
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
