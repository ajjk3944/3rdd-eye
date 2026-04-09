package ak;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class l0 {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ l0[] $VALUES;
    public static final k0 Companion;
    public static final l0 SERVER_RESPONSE = new l0("SERVER_RESPONSE", 0, 0);
    public static final l0 UPLOAD_DOWNLOAD = new l0("UPLOAD_DOWNLOAD", 1, 1);
    private final int value;

    private static final /* synthetic */ l0[] $values() {
        return new l0[]{SERVER_RESPONSE, UPLOAD_DOWNLOAD};
    }

    static {
        l0[] l0VarArr$values = $values();
        $VALUES = l0VarArr$values;
        $ENTRIES = a.a.j(l0VarArr$values);
        Companion = new k0();
    }

    private l0(String str, int i10, int i11) {
        this.value = i11;
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static l0 valueOf(String str) {
        return (l0) Enum.valueOf(l0.class, str);
    }

    public static l0[] values() {
        return (l0[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
