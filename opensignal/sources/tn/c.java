package tn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c QUESTION_IS_ANSWERED = new c("QUESTION_IS_ANSWERED", 0);
    public static final c QUESTION_IS_NOT_ANSWERED = new c("QUESTION_IS_NOT_ANSWERED", 1);
    public static final c HAS_ANY_VALUE = new c("HAS_ANY_VALUE", 2);

    private static final /* synthetic */ c[] $values() {
        return new c[]{QUESTION_IS_ANSWERED, QUESTION_IS_NOT_ANSWERED, HAS_ANY_VALUE};
    }

    static {
        c[] cVarArr$values = $values();
        $VALUES = cVarArr$values;
        $ENTRIES = a.a.j(cVarArr$values);
    }

    private c(String str, int i10) {
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
}
