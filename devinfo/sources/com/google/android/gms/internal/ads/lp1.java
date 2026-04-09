package com.google.android.gms.internal.ads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
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
public final class lp1 {

    /* renamed from: c, reason: collision with root package name */
    public static final lp1 f13574c;

    /* renamed from: d, reason: collision with root package name */
    public static final lp1 f13575d;

    /* renamed from: e, reason: collision with root package name */
    public static final lp1 f13576e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ lp1[] f13577f;

    /* renamed from: a, reason: collision with root package name */
    public final mp1 f13578a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13579b;

    /* JADX INFO: Fake field, exist only in values array */
    lp1 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    lp1 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    lp1 EF2;

    static {
        lp1 lp1Var = new lp1("DOUBLE", 0, mp1.f13988d, 1);
        lp1 lp1Var2 = new lp1("FLOAT", 1, mp1.f13987c, 5);
        mp1 mp1Var = mp1.f13986b;
        lp1 lp1Var3 = new lp1("INT64", 2, mp1Var, 0);
        lp1 lp1Var4 = new lp1("UINT64", 3, mp1Var, 0);
        mp1 mp1Var2 = mp1.f13985a;
        lp1 lp1Var5 = new lp1("INT32", 4, mp1Var2, 0);
        lp1 lp1Var6 = new lp1("FIXED64", 5, mp1Var, 1);
        lp1 lp1Var7 = new lp1("FIXED32", 6, mp1Var2, 5);
        lp1 lp1Var8 = new lp1("BOOL", 7, mp1.f13989e, 0);
        lp1 lp1Var9 = new lp1("STRING", 8, mp1.f13990f, 2);
        f13574c = lp1Var9;
        mp1 mp1Var3 = mp1.f13992i;
        lp1 lp1Var10 = new lp1("GROUP", 9, mp1Var3, 3);
        f13575d = lp1Var10;
        lp1 lp1Var11 = new lp1("MESSAGE", 10, mp1Var3, 2);
        f13576e = lp1Var11;
        f13577f = new lp1[]{lp1Var, lp1Var2, lp1Var3, lp1Var4, lp1Var5, lp1Var6, lp1Var7, lp1Var8, lp1Var9, lp1Var10, lp1Var11, new lp1("BYTES", 11, mp1.g, 2), new lp1("UINT32", 12, mp1Var2, 0), new lp1("ENUM", 13, mp1.f13991h, 0), new lp1("SFIXED32", 14, mp1Var2, 5), new lp1("SFIXED64", 15, mp1Var, 1), new lp1("SINT32", 16, mp1Var2, 0), new lp1("SINT64", 17, mp1Var, 0)};
    }

    public lp1(String str, int i4, mp1 mp1Var, int i10) {
        this.f13578a = mp1Var;
        this.f13579b = i10;
    }

    public static lp1[] values() {
        return (lp1[]) f13577f.clone();
    }
}
