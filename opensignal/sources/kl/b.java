package kl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b ALLOW = new b("ALLOW", 0, "allow");
    public static final b DENY = new b("DENY", 1, "deny");
    private final String state;

    private static final /* synthetic */ b[] $values() {
        return new b[]{ALLOW, DENY};
    }

    static {
        b[] bVarArr$values = $values();
        $VALUES = bVarArr$values;
        $ENTRIES = a.a.j(bVarArr$values);
    }

    private b(String str, int i10, String str2) {
        this.state = str2;
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public final String getState() {
        return this.state;
    }
}
