package w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class s {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ s[] $VALUES;
    public static final s Default = new s("Default", 0);
    public static final s UserInput = new s("UserInput", 1);
    public static final s PreventUserInput = new s("PreventUserInput", 2);

    private static final /* synthetic */ s[] $values() {
        return new s[]{Default, UserInput, PreventUserInput};
    }

    static {
        s[] sVarArr$values = $values();
        $VALUES = sVarArr$values;
        $ENTRIES = a.a.j(sVarArr$values);
    }

    private s(String str, int i10) {
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) $VALUES.clone();
    }
}
