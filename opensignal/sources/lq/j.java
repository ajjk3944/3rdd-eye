package lq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class j {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j SYNCHRONIZED = new j("SYNCHRONIZED", 0);
    public static final j PUBLICATION = new j("PUBLICATION", 1);
    public static final j NONE = new j("NONE", 2);

    private static final /* synthetic */ j[] $values() {
        return new j[]{SYNCHRONIZED, PUBLICATION, NONE};
    }

    static {
        j[] jVarArr$values = $values();
        $VALUES = jVarArr$values;
        $ENTRIES = a.a.j(jVarArr$values);
    }

    private j(String str, int i10) {
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
}
