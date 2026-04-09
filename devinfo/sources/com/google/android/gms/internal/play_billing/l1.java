package com.google.android.gms.internal.play_billing;

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
public final class l1 {

    /* renamed from: b, reason: collision with root package name */
    public static final l1 f20182b;

    /* renamed from: c, reason: collision with root package name */
    public static final l1 f20183c;

    /* renamed from: d, reason: collision with root package name */
    public static final l1[] f20184d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ l1[] f20185e;

    /* renamed from: a, reason: collision with root package name */
    public final int f20186a;

    /* JADX INFO: Fake field, exist only in values array */
    l1 EF0;

    static {
        x1 x1Var = x1.f20253e;
        l1 l1Var = new l1("DOUBLE", 0, 0, 1, x1Var);
        x1 x1Var2 = x1.f20252d;
        l1 l1Var2 = new l1("FLOAT", 1, 1, 1, x1Var2);
        x1 x1Var3 = x1.f20251c;
        l1 l1Var3 = new l1("INT64", 2, 2, 1, x1Var3);
        l1 l1Var4 = new l1("UINT64", 3, 3, 1, x1Var3);
        x1 x1Var4 = x1.f20250b;
        l1 l1Var5 = new l1("INT32", 4, 4, 1, x1Var4);
        l1 l1Var6 = new l1("FIXED64", 5, 5, 1, x1Var3);
        l1 l1Var7 = new l1("FIXED32", 6, 6, 1, x1Var4);
        x1 x1Var5 = x1.f20254f;
        l1 l1Var8 = new l1("BOOL", 7, 7, 1, x1Var5);
        x1 x1Var6 = x1.g;
        l1 l1Var9 = new l1("STRING", 8, 8, 1, x1Var6);
        x1 x1Var7 = x1.j;
        l1 l1Var10 = new l1("MESSAGE", 9, 9, 1, x1Var7);
        x1 x1Var8 = x1.f20255h;
        l1 l1Var11 = new l1("BYTES", 10, 10, 1, x1Var8);
        l1 l1Var12 = new l1("UINT32", 11, 11, 1, x1Var4);
        x1 x1Var9 = x1.f20256i;
        l1 l1Var13 = new l1("ENUM", 12, 12, 1, x1Var9);
        l1 l1Var14 = new l1("SFIXED32", 13, 13, 1, x1Var4);
        l1 l1Var15 = new l1("SFIXED64", 14, 14, 1, x1Var3);
        l1 l1Var16 = new l1("SINT32", 15, 15, 1, x1Var4);
        l1 l1Var17 = new l1("SINT64", 16, 16, 1, x1Var3);
        l1 l1Var18 = new l1("GROUP", 17, 17, 1, x1Var7);
        l1 l1Var19 = new l1("DOUBLE_LIST", 18, 18, 2, x1Var);
        l1 l1Var20 = new l1("FLOAT_LIST", 19, 19, 2, x1Var2);
        l1 l1Var21 = new l1("INT64_LIST", 20, 20, 2, x1Var3);
        l1 l1Var22 = new l1("UINT64_LIST", 21, 21, 2, x1Var3);
        l1 l1Var23 = new l1("INT32_LIST", 22, 22, 2, x1Var4);
        l1 l1Var24 = new l1("FIXED64_LIST", 23, 23, 2, x1Var3);
        l1 l1Var25 = new l1("FIXED32_LIST", 24, 24, 2, x1Var4);
        l1 l1Var26 = new l1("BOOL_LIST", 25, 25, 2, x1Var5);
        l1 l1Var27 = new l1("STRING_LIST", 26, 26, 2, x1Var6);
        l1 l1Var28 = new l1("MESSAGE_LIST", 27, 27, 2, x1Var7);
        l1 l1Var29 = new l1("BYTES_LIST", 28, 28, 2, x1Var8);
        l1 l1Var30 = new l1("UINT32_LIST", 29, 29, 2, x1Var4);
        l1 l1Var31 = new l1("ENUM_LIST", 30, 30, 2, x1Var9);
        l1 l1Var32 = new l1("SFIXED32_LIST", 31, 31, 2, x1Var4);
        l1 l1Var33 = new l1("SFIXED64_LIST", 32, 32, 2, x1Var3);
        l1 l1Var34 = new l1("SINT32_LIST", 33, 33, 2, x1Var4);
        l1 l1Var35 = new l1("SINT64_LIST", 34, 34, 2, x1Var3);
        l1 l1Var36 = new l1("DOUBLE_LIST_PACKED", 35, 35, 3, x1Var);
        f20182b = l1Var36;
        l1 l1Var37 = new l1("FLOAT_LIST_PACKED", 36, 36, 3, x1Var2);
        l1 l1Var38 = new l1("INT64_LIST_PACKED", 37, 37, 3, x1Var3);
        l1 l1Var39 = new l1("UINT64_LIST_PACKED", 38, 38, 3, x1Var3);
        l1 l1Var40 = new l1("INT32_LIST_PACKED", 39, 39, 3, x1Var4);
        l1 l1Var41 = new l1("FIXED64_LIST_PACKED", 40, 40, 3, x1Var3);
        l1 l1Var42 = new l1("FIXED32_LIST_PACKED", 41, 41, 3, x1Var4);
        l1 l1Var43 = new l1("BOOL_LIST_PACKED", 42, 42, 3, x1Var5);
        l1 l1Var44 = new l1("UINT32_LIST_PACKED", 43, 43, 3, x1Var4);
        l1 l1Var45 = new l1("ENUM_LIST_PACKED", 44, 44, 3, x1Var9);
        l1 l1Var46 = new l1("SFIXED32_LIST_PACKED", 45, 45, 3, x1Var4);
        l1 l1Var47 = new l1("SFIXED64_LIST_PACKED", 46, 46, 3, x1Var3);
        l1 l1Var48 = new l1("SINT32_LIST_PACKED", 47, 47, 3, x1Var4);
        l1 l1Var49 = new l1("SINT64_LIST_PACKED", 48, 48, 3, x1Var3);
        f20183c = l1Var49;
        f20185e = new l1[]{l1Var, l1Var2, l1Var3, l1Var4, l1Var5, l1Var6, l1Var7, l1Var8, l1Var9, l1Var10, l1Var11, l1Var12, l1Var13, l1Var14, l1Var15, l1Var16, l1Var17, l1Var18, l1Var19, l1Var20, l1Var21, l1Var22, l1Var23, l1Var24, l1Var25, l1Var26, l1Var27, l1Var28, l1Var29, l1Var30, l1Var31, l1Var32, l1Var33, l1Var34, l1Var35, l1Var36, l1Var37, l1Var38, l1Var39, l1Var40, l1Var41, l1Var42, l1Var43, l1Var44, l1Var45, l1Var46, l1Var47, l1Var48, l1Var49, new l1("GROUP_LIST", 49, 49, 2, x1Var7), new l1("MAP", 50, 50, 4, x1.f20249a)};
        l1[] l1VarArrValues = values();
        f20184d = new l1[l1VarArrValues.length];
        for (l1 l1Var50 : l1VarArrValues) {
            f20184d[l1Var50.f20186a] = l1Var50;
        }
    }

    public l1(String str, int i4, int i10, int i11, x1 x1Var) {
        this.f20186a = i10;
        int i12 = i11 - 1;
        if (i12 == 1 || i12 == 3) {
            x1Var.getClass();
        }
        if (i11 == 1) {
            x1 x1Var2 = x1.f20249a;
            x1Var.ordinal();
        }
    }

    public static l1[] values() {
        return (l1[]) f20185e.clone();
    }
}
