package kl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    private final String state;
    public static final a ALLOW = new a("ALLOW", 0, "allow");
    public static final a ONLY_IN_APP = new a("ONLY_IN_APP", 1, "allow_while_using_the_app");
    public static final a DENY = new a("DENY", 2, "deny");

    private static final /* synthetic */ a[] $values() {
        return new a[]{ALLOW, ONLY_IN_APP, DENY};
    }

    static {
        a[] aVarArr$values = $values();
        $VALUES = aVarArr$values;
        $ENTRIES = a.a.j(aVarArr$values);
    }

    private a(String str, int i10, String str2) {
        this.state = str2;
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final String getState() {
        return this.state;
    }
}
