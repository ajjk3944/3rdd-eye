package com.google.android.gms.internal.ads;

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
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class mn1 {

    /* renamed from: b, reason: collision with root package name */
    public static final mn1 f13966b;

    /* renamed from: c, reason: collision with root package name */
    public static final mn1 f13967c;

    /* renamed from: d, reason: collision with root package name */
    public static final mn1[] f13968d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ mn1[] f13969e;

    /* renamed from: a, reason: collision with root package name */
    public final int f13970a;

    /* JADX INFO: Fake field, exist only in values array */
    mn1 EF0;

    static {
        co1 co1Var = co1.f10189e;
        mn1 mn1Var = new mn1("DOUBLE", 0, 0, 1, co1Var);
        co1 co1Var2 = co1.f10188d;
        mn1 mn1Var2 = new mn1("FLOAT", 1, 1, 1, co1Var2);
        co1 co1Var3 = co1.f10187c;
        mn1 mn1Var3 = new mn1("INT64", 2, 2, 1, co1Var3);
        mn1 mn1Var4 = new mn1("UINT64", 3, 3, 1, co1Var3);
        co1 co1Var4 = co1.f10186b;
        mn1 mn1Var5 = new mn1("INT32", 4, 4, 1, co1Var4);
        mn1 mn1Var6 = new mn1("FIXED64", 5, 5, 1, co1Var3);
        mn1 mn1Var7 = new mn1("FIXED32", 6, 6, 1, co1Var4);
        co1 co1Var5 = co1.f10190f;
        mn1 mn1Var8 = new mn1("BOOL", 7, 7, 1, co1Var5);
        co1 co1Var6 = co1.g;
        mn1 mn1Var9 = new mn1("STRING", 8, 8, 1, co1Var6);
        co1 co1Var7 = co1.j;
        mn1 mn1Var10 = new mn1("MESSAGE", 9, 9, 1, co1Var7);
        co1 co1Var8 = co1.f10191h;
        mn1 mn1Var11 = new mn1("BYTES", 10, 10, 1, co1Var8);
        mn1 mn1Var12 = new mn1("UINT32", 11, 11, 1, co1Var4);
        co1 co1Var9 = co1.f10192i;
        mn1 mn1Var13 = new mn1("ENUM", 12, 12, 1, co1Var9);
        mn1 mn1Var14 = new mn1("SFIXED32", 13, 13, 1, co1Var4);
        mn1 mn1Var15 = new mn1("SFIXED64", 14, 14, 1, co1Var3);
        mn1 mn1Var16 = new mn1("SINT32", 15, 15, 1, co1Var4);
        mn1 mn1Var17 = new mn1("SINT64", 16, 16, 1, co1Var3);
        mn1 mn1Var18 = new mn1("GROUP", 17, 17, 1, co1Var7);
        mn1 mn1Var19 = new mn1("DOUBLE_LIST", 18, 18, 2, co1Var);
        mn1 mn1Var20 = new mn1("FLOAT_LIST", 19, 19, 2, co1Var2);
        mn1 mn1Var21 = new mn1("INT64_LIST", 20, 20, 2, co1Var3);
        mn1 mn1Var22 = new mn1("UINT64_LIST", 21, 21, 2, co1Var3);
        mn1 mn1Var23 = new mn1("INT32_LIST", 22, 22, 2, co1Var4);
        mn1 mn1Var24 = new mn1("FIXED64_LIST", 23, 23, 2, co1Var3);
        mn1 mn1Var25 = new mn1("FIXED32_LIST", 24, 24, 2, co1Var4);
        mn1 mn1Var26 = new mn1("BOOL_LIST", 25, 25, 2, co1Var5);
        mn1 mn1Var27 = new mn1("STRING_LIST", 26, 26, 2, co1Var6);
        mn1 mn1Var28 = new mn1("MESSAGE_LIST", 27, 27, 2, co1Var7);
        mn1 mn1Var29 = new mn1("BYTES_LIST", 28, 28, 2, co1Var8);
        mn1 mn1Var30 = new mn1("UINT32_LIST", 29, 29, 2, co1Var4);
        mn1 mn1Var31 = new mn1("ENUM_LIST", 30, 30, 2, co1Var9);
        mn1 mn1Var32 = new mn1("SFIXED32_LIST", 31, 31, 2, co1Var4);
        mn1 mn1Var33 = new mn1("SFIXED64_LIST", 32, 32, 2, co1Var3);
        mn1 mn1Var34 = new mn1("SINT32_LIST", 33, 33, 2, co1Var4);
        mn1 mn1Var35 = new mn1("SINT64_LIST", 34, 34, 2, co1Var3);
        mn1 mn1Var36 = new mn1("DOUBLE_LIST_PACKED", 35, 35, 3, co1Var);
        f13966b = mn1Var36;
        mn1 mn1Var37 = new mn1("FLOAT_LIST_PACKED", 36, 36, 3, co1Var2);
        mn1 mn1Var38 = new mn1("INT64_LIST_PACKED", 37, 37, 3, co1Var3);
        mn1 mn1Var39 = new mn1("UINT64_LIST_PACKED", 38, 38, 3, co1Var3);
        mn1 mn1Var40 = new mn1("INT32_LIST_PACKED", 39, 39, 3, co1Var4);
        mn1 mn1Var41 = new mn1("FIXED64_LIST_PACKED", 40, 40, 3, co1Var3);
        mn1 mn1Var42 = new mn1("FIXED32_LIST_PACKED", 41, 41, 3, co1Var4);
        mn1 mn1Var43 = new mn1("BOOL_LIST_PACKED", 42, 42, 3, co1Var5);
        mn1 mn1Var44 = new mn1("UINT32_LIST_PACKED", 43, 43, 3, co1Var4);
        mn1 mn1Var45 = new mn1("ENUM_LIST_PACKED", 44, 44, 3, co1Var9);
        mn1 mn1Var46 = new mn1("SFIXED32_LIST_PACKED", 45, 45, 3, co1Var4);
        mn1 mn1Var47 = new mn1("SFIXED64_LIST_PACKED", 46, 46, 3, co1Var3);
        mn1 mn1Var48 = new mn1("SINT32_LIST_PACKED", 47, 47, 3, co1Var4);
        mn1 mn1Var49 = new mn1("SINT64_LIST_PACKED", 48, 48, 3, co1Var3);
        f13967c = mn1Var49;
        f13969e = new mn1[]{mn1Var, mn1Var2, mn1Var3, mn1Var4, mn1Var5, mn1Var6, mn1Var7, mn1Var8, mn1Var9, mn1Var10, mn1Var11, mn1Var12, mn1Var13, mn1Var14, mn1Var15, mn1Var16, mn1Var17, mn1Var18, mn1Var19, mn1Var20, mn1Var21, mn1Var22, mn1Var23, mn1Var24, mn1Var25, mn1Var26, mn1Var27, mn1Var28, mn1Var29, mn1Var30, mn1Var31, mn1Var32, mn1Var33, mn1Var34, mn1Var35, mn1Var36, mn1Var37, mn1Var38, mn1Var39, mn1Var40, mn1Var41, mn1Var42, mn1Var43, mn1Var44, mn1Var45, mn1Var46, mn1Var47, mn1Var48, mn1Var49, new mn1("GROUP_LIST", 49, 49, 2, co1Var7), new mn1("MAP", 50, 50, 4, co1.f10185a)};
        mn1[] mn1VarArrValues = values();
        f13968d = new mn1[mn1VarArrValues.length];
        for (mn1 mn1Var50 : mn1VarArrValues) {
            f13968d[mn1Var50.f13970a] = mn1Var50;
        }
    }

    public mn1(String str, int i4, int i10, int i11, co1 co1Var) {
        this.f13970a = i10;
        int i12 = i11 - 1;
        if (i12 == 1 || i12 == 3) {
            co1Var.getClass();
        }
        if (i11 == 1) {
            co1 co1Var2 = co1.f10185a;
            co1Var.ordinal();
        }
    }

    public static mn1[] values() {
        return (mn1[]) f13969e.clone();
    }
}
