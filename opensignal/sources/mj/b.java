package mj;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final a Companion;
    private final int value;
    public static final b BACKGROUND = new b("BACKGROUND", 0, 0);
    public static final b FOREGROUND = new b("FOREGROUND", 1, 1);
    public static final b ALL = new b("ALL", 2, 2);

    private static final /* synthetic */ b[] $values() {
        return new b[]{BACKGROUND, FOREGROUND, ALL};
    }

    static {
        b[] bVarArr$values = $values();
        $VALUES = bVarArr$values;
        $ENTRIES = a.a.j(bVarArr$values);
        Companion = new a();
    }

    private b(String str, int i10, int i11) {
        this.value = i11;
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

    public final int getValue() {
        return this.value;
    }
}
