package com.google.android.gms.internal.measurement;

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
public final class u6 {

    /* renamed from: c, reason: collision with root package name */
    public static final u6 f19952c;

    /* renamed from: d, reason: collision with root package name */
    public static final u6 f19953d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ u6[] f19954e;

    /* renamed from: a, reason: collision with root package name */
    public final v6 f19955a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19956b;

    /* JADX INFO: Fake field, exist only in values array */
    u6 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    u6 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    u6 EF2;

    static {
        u6 u6Var = new u6("DOUBLE", 0, v6.f19974d, 1);
        u6 u6Var2 = new u6("FLOAT", 1, v6.f19973c, 5);
        v6 v6Var = v6.f19972b;
        u6 u6Var3 = new u6("INT64", 2, v6Var, 0);
        u6 u6Var4 = new u6("UINT64", 3, v6Var, 0);
        v6 v6Var2 = v6.f19971a;
        u6 u6Var5 = new u6("INT32", 4, v6Var2, 0);
        u6 u6Var6 = new u6("FIXED64", 5, v6Var, 1);
        u6 u6Var7 = new u6("FIXED32", 6, v6Var2, 5);
        u6 u6Var8 = new u6("BOOL", 7, v6.f19975e, 0);
        u6 u6Var9 = new u6("STRING", 8, v6.f19976f, 2);
        f19952c = u6Var9;
        v6 v6Var3 = v6.f19978i;
        u6 u6Var10 = new u6("GROUP", 9, v6Var3, 3);
        f19953d = u6Var10;
        f19954e = new u6[]{u6Var, u6Var2, u6Var3, u6Var4, u6Var5, u6Var6, u6Var7, u6Var8, u6Var9, u6Var10, new u6("MESSAGE", 10, v6Var3, 2), new u6("BYTES", 11, v6.g, 2), new u6("UINT32", 12, v6Var2, 0), new u6("ENUM", 13, v6.f19977h, 0), new u6("SFIXED32", 14, v6Var2, 5), new u6("SFIXED64", 15, v6Var, 1), new u6("SINT32", 16, v6Var2, 0), new u6("SINT64", 17, v6Var, 0)};
    }

    public u6(String str, int i4, v6 v6Var, int i10) {
        this.f19955a = v6Var;
        this.f19956b = i10;
    }

    public static u6[] values() {
        return (u6[]) f19954e.clone();
    }
}
