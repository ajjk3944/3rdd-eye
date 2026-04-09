package kb;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class o {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;
    public static final o GET = new o("GET", 0);
    public static final o POST = new o("POST", 1);
    public static final o PATCH = new o("PATCH", 2);
    public static final o PUT = new o("PUT", 3);
    public static final o DELETE = new o("DELETE", 4);
    public static final o COMMAND = new o("COMMAND", 5);

    private static final /* synthetic */ o[] $values() {
        return new o[]{GET, POST, PATCH, PUT, DELETE, COMMAND};
    }

    static {
        o[] oVarArr$values = $values();
        $VALUES = oVarArr$values;
        $ENTRIES = AbstractC5827b.a(oVarArr$values);
    }

    private o(String str, int i10) {
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) $VALUES.clone();
    }
}
