package tg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class m implements zf.e {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;
    public static final m EVENT_TYPE_UNKNOWN = new m("EVENT_TYPE_UNKNOWN", 0, 0);
    public static final m SESSION_START = new m("SESSION_START", 1, 1);
    private final int number;

    private static final /* synthetic */ m[] $values() {
        return new m[]{EVENT_TYPE_UNKNOWN, SESSION_START};
    }

    static {
        m[] mVarArr$values = $values();
        $VALUES = mVarArr$values;
        $ENTRIES = a.a.j(mVarArr$values);
    }

    private m(String str, int i10, int i11) {
        this.number = i11;
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) $VALUES.clone();
    }

    @Override // zf.e
    public int getNumber() {
        return this.number;
    }
}
