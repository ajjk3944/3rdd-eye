package ak;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e1 {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ e1[] $VALUES;
    public static final e1 CONNECTED = new e1("CONNECTED", 0);
    public static final e1 DISCONNECTED = new e1("DISCONNECTED", 1);
    public static final e1 UNKNOWN = new e1("UNKNOWN", 2);

    private static final /* synthetic */ e1[] $values() {
        return new e1[]{CONNECTED, DISCONNECTED, UNKNOWN};
    }

    static {
        e1[] e1VarArr$values = $values();
        $VALUES = e1VarArr$values;
        $ENTRIES = a.a.j(e1VarArr$values);
    }

    private e1(String str, int i10) {
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static e1 valueOf(String str) {
        return (e1) Enum.valueOf(e1.class, str);
    }

    public static e1[] values() {
        return (e1[]) $VALUES.clone();
    }
}
