package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class j74 {
    public static final j74 h;
    public static final j74 i;
    public static final j74 j;
    public static final /* synthetic */ j74[] k;
    public final k74 f;
    public final int g;

    /* JADX INFO: Fake field, exist only in values array */
    j74 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    j74 EF2;

    /* JADX INFO: Fake field, exist only in values array */
    j74 EF0;

    static {
        j74 j74Var = new j74("DOUBLE", 0, k74.i, 1);
        j74 j74Var2 = new j74("FLOAT", 1, k74.h, 5);
        k74 k74Var = k74.g;
        j74 j74Var3 = new j74("INT64", 2, k74Var, 0);
        j74 j74Var4 = new j74("UINT64", 3, k74Var, 0);
        k74 k74Var2 = k74.f;
        j74 j74Var5 = new j74("INT32", 4, k74Var2, 0);
        j74 j74Var6 = new j74("FIXED64", 5, k74Var, 1);
        j74 j74Var7 = new j74("FIXED32", 6, k74Var2, 5);
        j74 j74Var8 = new j74("BOOL", 7, k74.j, 0);
        j74 j74Var9 = new j74("STRING", 8, k74.k, 2);
        h = j74Var9;
        k74 k74Var3 = k74.n;
        j74 j74Var10 = new j74("GROUP", 9, k74Var3, 3);
        i = j74Var10;
        j74 j74Var11 = new j74("MESSAGE", 10, k74Var3, 2);
        j = j74Var11;
        k = new j74[]{j74Var, j74Var2, j74Var3, j74Var4, j74Var5, j74Var6, j74Var7, j74Var8, j74Var9, j74Var10, j74Var11, new j74("BYTES", 11, k74.l, 2), new j74("UINT32", 12, k74Var2, 0), new j74("ENUM", 13, k74.m, 0), new j74("SFIXED32", 14, k74Var2, 5), new j74("SFIXED64", 15, k74Var, 1), new j74("SINT32", 16, k74Var2, 0), new j74("SINT64", 17, k74Var, 0)};
    }

    public j74(String str, int i2, k74 k74Var, int i3) {
        this.f = k74Var;
        this.g = i3;
    }

    public static j74[] values() {
        return (j74[]) k.clone();
    }
}
