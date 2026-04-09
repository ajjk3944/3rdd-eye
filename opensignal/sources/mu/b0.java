package mu;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b0 {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ b0[] $VALUES;
    public final char begin;
    public final char end;
    public static final b0 OBJ = new b0("OBJ", 0, '{', '}');
    public static final b0 LIST = new b0("LIST", 1, '[', ']');
    public static final b0 MAP = new b0("MAP", 2, '{', '}');
    public static final b0 POLY_OBJ = new b0("POLY_OBJ", 3, '[', ']');

    private static final /* synthetic */ b0[] $values() {
        return new b0[]{OBJ, LIST, MAP, POLY_OBJ};
    }

    static {
        b0[] b0VarArr$values = $values();
        $VALUES = b0VarArr$values;
        $ENTRIES = a.a.j(b0VarArr$values);
    }

    private b0(String str, int i10, char c4, char c10) {
        this.begin = c4;
        this.end = c10;
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static b0 valueOf(String str) {
        return (b0) Enum.valueOf(b0.class, str);
    }

    public static b0[] values() {
        return (b0[]) $VALUES.clone();
    }
}
