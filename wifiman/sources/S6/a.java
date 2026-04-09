package S6;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class a {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a MEMORY = new a("MEMORY", 0);
    public static final a DISK = new a("DISK", 1);
    public static final a NETWORK = new a("NETWORK", 2);
    public static final a UNKNOWN = new a("UNKNOWN", 3);

    private static final /* synthetic */ a[] $values() {
        return new a[]{MEMORY, DISK, NETWORK, UNKNOWN};
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
