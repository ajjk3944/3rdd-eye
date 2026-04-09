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
public final class l54 {
    public static final l54 g;
    public static final l54 h;
    public static final l54[] i;
    public static final /* synthetic */ l54[] j;
    public final int f;

    /* JADX INFO: Fake field, exist only in values array */
    l54 EF0;

    static {
        c64 c64Var = c64.j;
        l54 l54Var = new l54("DOUBLE", 0, 0, 1, c64Var);
        c64 c64Var2 = c64.i;
        l54 l54Var2 = new l54("FLOAT", 1, 1, 1, c64Var2);
        c64 c64Var3 = c64.h;
        l54 l54Var3 = new l54("INT64", 2, 2, 1, c64Var3);
        l54 l54Var4 = new l54("UINT64", 3, 3, 1, c64Var3);
        c64 c64Var4 = c64.g;
        l54 l54Var5 = new l54("INT32", 4, 4, 1, c64Var4);
        l54 l54Var6 = new l54("FIXED64", 5, 5, 1, c64Var3);
        l54 l54Var7 = new l54("FIXED32", 6, 6, 1, c64Var4);
        c64 c64Var5 = c64.k;
        l54 l54Var8 = new l54("BOOL", 7, 7, 1, c64Var5);
        c64 c64Var6 = c64.l;
        l54 l54Var9 = new l54("STRING", 8, 8, 1, c64Var6);
        c64 c64Var7 = c64.o;
        l54 l54Var10 = new l54("MESSAGE", 9, 9, 1, c64Var7);
        c64 c64Var8 = c64.m;
        l54 l54Var11 = new l54("BYTES", 10, 10, 1, c64Var8);
        l54 l54Var12 = new l54("UINT32", 11, 11, 1, c64Var4);
        c64 c64Var9 = c64.n;
        l54 l54Var13 = new l54("ENUM", 12, 12, 1, c64Var9);
        l54 l54Var14 = new l54("SFIXED32", 13, 13, 1, c64Var4);
        l54 l54Var15 = new l54("SFIXED64", 14, 14, 1, c64Var3);
        l54 l54Var16 = new l54("SINT32", 15, 15, 1, c64Var4);
        l54 l54Var17 = new l54("SINT64", 16, 16, 1, c64Var3);
        l54 l54Var18 = new l54("GROUP", 17, 17, 1, c64Var7);
        l54 l54Var19 = new l54("DOUBLE_LIST", 18, 18, 2, c64Var);
        l54 l54Var20 = new l54("FLOAT_LIST", 19, 19, 2, c64Var2);
        l54 l54Var21 = new l54("INT64_LIST", 20, 20, 2, c64Var3);
        l54 l54Var22 = new l54("UINT64_LIST", 21, 21, 2, c64Var3);
        l54 l54Var23 = new l54("INT32_LIST", 22, 22, 2, c64Var4);
        l54 l54Var24 = new l54("FIXED64_LIST", 23, 23, 2, c64Var3);
        l54 l54Var25 = new l54("FIXED32_LIST", 24, 24, 2, c64Var4);
        l54 l54Var26 = new l54("BOOL_LIST", 25, 25, 2, c64Var5);
        l54 l54Var27 = new l54("STRING_LIST", 26, 26, 2, c64Var6);
        l54 l54Var28 = new l54("MESSAGE_LIST", 27, 27, 2, c64Var7);
        l54 l54Var29 = new l54("BYTES_LIST", 28, 28, 2, c64Var8);
        l54 l54Var30 = new l54("UINT32_LIST", 29, 29, 2, c64Var4);
        l54 l54Var31 = new l54("ENUM_LIST", 30, 30, 2, c64Var9);
        l54 l54Var32 = new l54("SFIXED32_LIST", 31, 31, 2, c64Var4);
        l54 l54Var33 = new l54("SFIXED64_LIST", 32, 32, 2, c64Var3);
        l54 l54Var34 = new l54("SINT32_LIST", 33, 33, 2, c64Var4);
        l54 l54Var35 = new l54("SINT64_LIST", 34, 34, 2, c64Var3);
        l54 l54Var36 = new l54("DOUBLE_LIST_PACKED", 35, 35, 3, c64Var);
        g = l54Var36;
        l54 l54Var37 = new l54("FLOAT_LIST_PACKED", 36, 36, 3, c64Var2);
        l54 l54Var38 = new l54("INT64_LIST_PACKED", 37, 37, 3, c64Var3);
        l54 l54Var39 = new l54("UINT64_LIST_PACKED", 38, 38, 3, c64Var3);
        l54 l54Var40 = new l54("INT32_LIST_PACKED", 39, 39, 3, c64Var4);
        l54 l54Var41 = new l54("FIXED64_LIST_PACKED", 40, 40, 3, c64Var3);
        l54 l54Var42 = new l54("FIXED32_LIST_PACKED", 41, 41, 3, c64Var4);
        l54 l54Var43 = new l54("BOOL_LIST_PACKED", 42, 42, 3, c64Var5);
        l54 l54Var44 = new l54("UINT32_LIST_PACKED", 43, 43, 3, c64Var4);
        l54 l54Var45 = new l54("ENUM_LIST_PACKED", 44, 44, 3, c64Var9);
        l54 l54Var46 = new l54("SFIXED32_LIST_PACKED", 45, 45, 3, c64Var4);
        l54 l54Var47 = new l54("SFIXED64_LIST_PACKED", 46, 46, 3, c64Var3);
        l54 l54Var48 = new l54("SINT32_LIST_PACKED", 47, 47, 3, c64Var4);
        l54 l54Var49 = new l54("SINT64_LIST_PACKED", 48, 48, 3, c64Var3);
        h = l54Var49;
        j = new l54[]{l54Var, l54Var2, l54Var3, l54Var4, l54Var5, l54Var6, l54Var7, l54Var8, l54Var9, l54Var10, l54Var11, l54Var12, l54Var13, l54Var14, l54Var15, l54Var16, l54Var17, l54Var18, l54Var19, l54Var20, l54Var21, l54Var22, l54Var23, l54Var24, l54Var25, l54Var26, l54Var27, l54Var28, l54Var29, l54Var30, l54Var31, l54Var32, l54Var33, l54Var34, l54Var35, l54Var36, l54Var37, l54Var38, l54Var39, l54Var40, l54Var41, l54Var42, l54Var43, l54Var44, l54Var45, l54Var46, l54Var47, l54Var48, l54Var49, new l54("GROUP_LIST", 49, 49, 2, c64Var7), new l54("MAP", 50, 50, 4, c64.f)};
        l54[] l54VarArrValues = values();
        i = new l54[l54VarArrValues.length];
        for (l54 l54Var50 : l54VarArrValues) {
            i[l54Var50.f] = l54Var50;
        }
    }

    public l54(String str, int i2, int i3, int i4, c64 c64Var) {
        this.f = i3;
        int i5 = i4 - 1;
        if (i5 == 1 || i5 == 3) {
            c64Var.getClass();
        }
        if (i4 == 1) {
            c64 c64Var2 = c64.f;
            c64Var.ordinal();
        }
    }

    public static l54[] values() {
        return (l54[]) j.clone();
    }
}
