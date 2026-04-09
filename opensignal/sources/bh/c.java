package bh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final b Companion;
    public static final c NO_INTERNET_CONNECTION = new c("NO_INTERNET_CONNECTION", 0, 0);
    public static final c POSSIBLE_INTERNET_ISSUES = new c("POSSIBLE_INTERNET_ISSUES", 1, 1);

    /* renamed from: id, reason: collision with root package name */
    private final int f2750id;

    private static final /* synthetic */ c[] $values() {
        return new c[]{NO_INTERNET_CONNECTION, POSSIBLE_INTERNET_ISSUES};
    }

    static {
        c[] cVarArr$values = $values();
        $VALUES = cVarArr$values;
        $ENTRIES = a.a.j(cVarArr$values);
        Companion = new b();
    }

    private c(String str, int i10, int i11) {
        this.f2750id = i11;
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public final int getId() {
        return this.f2750id;
    }
}
