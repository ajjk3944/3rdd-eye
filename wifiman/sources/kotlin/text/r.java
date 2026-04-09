package kotlin.text;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class r {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ r[] $VALUES;
    public static final r CANON_EQ;
    public static final r COMMENTS;
    public static final r DOT_MATCHES_ALL;
    public static final r IGNORE_CASE;
    public static final r LITERAL;
    public static final r MULTILINE;
    public static final r UNIX_LINES;
    private final int mask;
    private final int value;

    private static final /* synthetic */ r[] $values() {
        return new r[]{IGNORE_CASE, MULTILINE, LITERAL, UNIX_LINES, COMMENTS, DOT_MATCHES_ALL, CANON_EQ};
    }

    static {
        int i10 = 2;
        IGNORE_CASE = new r("IGNORE_CASE", 0, i10, 0, 2, null);
        int i11 = 2;
        DefaultConstructorMarker defaultConstructorMarker = null;
        int i12 = 0;
        MULTILINE = new r("MULTILINE", 1, 8, i12, i11, defaultConstructorMarker);
        int i13 = 2;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        int i14 = 0;
        LITERAL = new r("LITERAL", i10, 16, i14, i13, defaultConstructorMarker2);
        UNIX_LINES = new r("UNIX_LINES", 3, 1, i12, i11, defaultConstructorMarker);
        COMMENTS = new r("COMMENTS", 4, 4, i14, i13, defaultConstructorMarker2);
        DOT_MATCHES_ALL = new r("DOT_MATCHES_ALL", 5, 32, i12, i11, defaultConstructorMarker);
        CANON_EQ = new r("CANON_EQ", 6, 128, i14, i13, defaultConstructorMarker2);
        r[] rVarArr$values = $values();
        $VALUES = rVarArr$values;
        $ENTRIES = AbstractC5827b.a(rVarArr$values);
    }

    private r(String str, int i10, int i11, int i12) {
        this.value = i11;
        this.mask = i12;
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) $VALUES.clone();
    }

    public int getMask() {
        return this.mask;
    }

    public int getValue() {
        return this.value;
    }

    /* synthetic */ r(String str, int i10, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10, i11, (i13 & 2) != 0 ? i11 : i12);
    }
}
