package com.google.android.gms.internal.consent_sdk;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'c' uses external variables
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
public final class e7 {

    /* renamed from: c, reason: collision with root package name */
    public static final e7 f19336c;

    /* renamed from: d, reason: collision with root package name */
    public static final e7 f19337d;

    /* renamed from: e, reason: collision with root package name */
    public static final e7 f19338e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ e7[] f19339f;

    /* renamed from: a, reason: collision with root package name */
    public final f7 f19340a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19341b;

    /* JADX INFO: Fake field, exist only in values array */
    e7 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    e7 EF1;

    static {
        e7 e7Var = new e7("DOUBLE", 0, f7.f19350d, 1);
        e7 e7Var2 = new e7("FLOAT", 1, f7.f19349c, 5);
        f7 f7Var = f7.f19348b;
        e7 e7Var3 = new e7("INT64", 2, f7Var, 0);
        f19336c = e7Var3;
        e7 e7Var4 = new e7("UINT64", 3, f7Var, 0);
        f7 f7Var2 = f7.f19347a;
        e7 e7Var5 = new e7("INT32", 4, f7Var2, 0);
        e7 e7Var6 = new e7("FIXED64", 5, f7Var, 1);
        e7 e7Var7 = new e7("FIXED32", 6, f7Var2, 5);
        e7 e7Var8 = new e7("BOOL", 7, f7.f19351e, 0);
        e7 e7Var9 = new e7("STRING", 8, f7.f19352f, 2);
        f19337d = e7Var9;
        f7 f7Var3 = f7.f19354i;
        e7 e7Var10 = new e7("GROUP", 9, f7Var3, 3);
        f19338e = e7Var10;
        f19339f = new e7[]{e7Var, e7Var2, e7Var3, e7Var4, e7Var5, e7Var6, e7Var7, e7Var8, e7Var9, e7Var10, new e7("MESSAGE", 10, f7Var3, 2), new e7("BYTES", 11, f7.g, 2), new e7("UINT32", 12, f7Var2, 0), new e7("ENUM", 13, f7.f19353h, 0), new e7("SFIXED32", 14, f7Var2, 5), new e7("SFIXED64", 15, f7Var, 1), new e7("SINT32", 16, f7Var2, 0), new e7("SINT64", 17, f7Var, 0)};
    }

    public e7(String str, int i4, f7 f7Var, int i10) {
        this.f19340a = f7Var;
        this.f19341b = i10;
    }

    public static e7[] values() {
        return (e7[]) f19339f.clone();
    }
}
