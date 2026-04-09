package ir;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class z {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ z[] $VALUES;
    public static final z INVARIANT = new z("INVARIANT", 0);
    public static final z IN = new z("IN", 1);
    public static final z OUT = new z("OUT", 2);

    private static final /* synthetic */ z[] $values() {
        return new z[]{INVARIANT, IN, OUT};
    }

    static {
        z[] zVarArr$values = $values();
        $VALUES = zVarArr$values;
        $ENTRIES = a.a.j(zVarArr$values);
    }

    private z(String str, int i10) {
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) $VALUES.clone();
    }
}
