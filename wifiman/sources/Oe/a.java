package Oe;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class a {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a PERMISSION_LOCATION = new a("PERMISSION_LOCATION", 0);
    public static final a PERMISSION_CELLULAR = new a("PERMISSION_CELLULAR", 1);
    public static final a LOCATION_ACCESS = new a("LOCATION_ACCESS", 2);
    public static final a NO_WIFIMAN_API = new a("NO_WIFIMAN_API", 3);

    private static final /* synthetic */ a[] $values() {
        return new a[]{PERMISSION_LOCATION, PERMISSION_CELLULAR, LOCATION_ACCESS, NO_WIFIMAN_API};
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
