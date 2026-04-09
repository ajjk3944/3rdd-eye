package r1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f Initial = new f("Initial", 0);
    public static final f Main = new f("Main", 1);
    public static final f Final = new f("Final", 2);

    private static final /* synthetic */ f[] $values() {
        return new f[]{Initial, Main, Final};
    }

    static {
        f[] fVarArr$values = $values();
        $VALUES = fVarArr$values;
        $ENTRIES = a.a.j(fVarArr$values);
    }

    private f(String str, int i10) {
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
