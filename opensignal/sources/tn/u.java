package tn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class u {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ u[] $VALUES;
    public static final u ANSWER_CONTAINS = new u("ANSWER_CONTAINS", 0);
    public static final u ANSWER_DOES_NOT_CONTAIN = new u("ANSWER_DOES_NOT_CONTAIN", 1);
    public static final u QUESTION_IS_ANSWERED = new u("QUESTION_IS_ANSWERED", 2);
    public static final u QUESTION_IS_NOT_ANSWERED = new u("QUESTION_IS_NOT_ANSWERED", 3);
    public static final u HAS_ANY_VALUE = new u("HAS_ANY_VALUE", 4);

    private static final /* synthetic */ u[] $values() {
        return new u[]{ANSWER_CONTAINS, ANSWER_DOES_NOT_CONTAIN, QUESTION_IS_ANSWERED, QUESTION_IS_NOT_ANSWERED, HAS_ANY_VALUE};
    }

    static {
        u[] uVarArr$values = $values();
        $VALUES = uVarArr$values;
        $ENTRIES = a.a.j(uVarArr$values);
    }

    private u(String str, int i10) {
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) $VALUES.clone();
    }
}
