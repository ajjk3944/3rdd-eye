package bj;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class M {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ M[] $VALUES;
    public final char begin;
    public final char end;
    public static final M OBJ = new M("OBJ", 0, '{', '}');
    public static final M LIST = new M("LIST", 1, '[', ']');
    public static final M MAP = new M("MAP", 2, '{', '}');
    public static final M POLY_OBJ = new M("POLY_OBJ", 3, '[', ']');

    private static final /* synthetic */ M[] $values() {
        return new M[]{OBJ, LIST, MAP, POLY_OBJ};
    }

    static {
        M[] mArr$values = $values();
        $VALUES = mArr$values;
        $ENTRIES = AbstractC5827b.a(mArr$values);
    }

    private M(String str, int i10, char c10, char c11) {
        this.begin = c10;
        this.end = c11;
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static M valueOf(String str) {
        return (M) Enum.valueOf(M.class, str);
    }

    public static M[] values() {
        return (M[]) $VALUES.clone();
    }
}
