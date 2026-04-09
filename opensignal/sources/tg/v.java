package tg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class v implements zf.e {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ v[] $VALUES;
    private final int number;
    public static final v LOG_ENVIRONMENT_UNKNOWN = new v("LOG_ENVIRONMENT_UNKNOWN", 0, 0);
    public static final v LOG_ENVIRONMENT_AUTOPUSH = new v("LOG_ENVIRONMENT_AUTOPUSH", 1, 1);
    public static final v LOG_ENVIRONMENT_STAGING = new v("LOG_ENVIRONMENT_STAGING", 2, 2);
    public static final v LOG_ENVIRONMENT_PROD = new v("LOG_ENVIRONMENT_PROD", 3, 3);

    private static final /* synthetic */ v[] $values() {
        return new v[]{LOG_ENVIRONMENT_UNKNOWN, LOG_ENVIRONMENT_AUTOPUSH, LOG_ENVIRONMENT_STAGING, LOG_ENVIRONMENT_PROD};
    }

    static {
        v[] vVarArr$values = $values();
        $VALUES = vVarArr$values;
        $ENTRIES = a.a.j(vVarArr$values);
    }

    private v(String str, int i10, int i11) {
        this.number = i11;
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) $VALUES.clone();
    }

    @Override // zf.e
    public int getNumber() {
        return this.number;
    }
}
