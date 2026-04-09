package on;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class x {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ x[] $VALUES;
    private final tt.k regex;
    private final String value;
    public static final x VISITOR = new x("VISITOR", 0, "visitor", new tt.k("\\{\\{visitor\\.(\\S+)(?:\\s?\\|\\s?\"([^\"]*)\")?\\}\\}"));
    public static final x ANSWER = new x("ANSWER", 1, "answer", new tt.k("\\{\\{answer:(\\d+)(?:\\s?\\|\\s?\"([^\"]*)\")?\\}\\}"));

    private static final /* synthetic */ x[] $values() {
        return new x[]{VISITOR, ANSWER};
    }

    static {
        x[] xVarArr$values = $values();
        $VALUES = xVarArr$values;
        $ENTRIES = a.a.j(xVarArr$values);
    }

    private x(String str, int i10, String str2, tt.k kVar) {
        this.value = str2;
        this.regex = kVar;
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) $VALUES.clone();
    }

    public final tt.k getRegex() {
        return this.regex;
    }

    public final String getValue() {
        return this.value;
    }
}
