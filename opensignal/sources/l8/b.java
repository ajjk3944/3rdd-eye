package l8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    private final boolean readEnabled;
    private final boolean writeEnabled;
    public static final b ENABLED = new b("ENABLED", 0, true, true);
    public static final b READ_ONLY = new b("READ_ONLY", 1, true, false);
    public static final b WRITE_ONLY = new b("WRITE_ONLY", 2, false, true);
    public static final b DISABLED = new b("DISABLED", 3, false, false);

    private static final /* synthetic */ b[] $values() {
        return new b[]{ENABLED, READ_ONLY, WRITE_ONLY, DISABLED};
    }

    static {
        b[] bVarArr$values = $values();
        $VALUES = bVarArr$values;
        $ENTRIES = a.a.j(bVarArr$values);
    }

    private b(String str, int i10, boolean z10, boolean z11) {
        this.readEnabled = z10;
        this.writeEnabled = z11;
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

    public final boolean getReadEnabled() {
        return this.readEnabled;
    }

    public final boolean getWriteEnabled() {
        return this.writeEnabled;
    }
}
