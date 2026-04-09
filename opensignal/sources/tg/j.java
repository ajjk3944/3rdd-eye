package tg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class j implements zf.e {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    private final int number;
    public static final j COLLECTION_UNKNOWN = new j("COLLECTION_UNKNOWN", 0, 0);
    public static final j COLLECTION_SDK_NOT_INSTALLED = new j("COLLECTION_SDK_NOT_INSTALLED", 1, 1);
    public static final j COLLECTION_ENABLED = new j("COLLECTION_ENABLED", 2, 2);
    public static final j COLLECTION_DISABLED = new j("COLLECTION_DISABLED", 3, 3);
    public static final j COLLECTION_DISABLED_REMOTE = new j("COLLECTION_DISABLED_REMOTE", 4, 4);
    public static final j COLLECTION_SAMPLED = new j("COLLECTION_SAMPLED", 5, 5);

    private static final /* synthetic */ j[] $values() {
        return new j[]{COLLECTION_UNKNOWN, COLLECTION_SDK_NOT_INSTALLED, COLLECTION_ENABLED, COLLECTION_DISABLED, COLLECTION_DISABLED_REMOTE, COLLECTION_SAMPLED};
    }

    static {
        j[] jVarArr$values = $values();
        $VALUES = jVarArr$values;
        $ENTRIES = a.a.j(jVarArr$values);
    }

    private j(String str, int i10, int i11) {
        this.number = i11;
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }

    @Override // zf.e
    public int getNumber() {
        return this.number;
    }
}
