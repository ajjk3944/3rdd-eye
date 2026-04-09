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
/* loaded from: classes.dex */
public final class ZL {

    /* renamed from: c, reason: collision with root package name */
    public static final ZL f12823c;

    /* renamed from: d, reason: collision with root package name */
    public static final ZL f12824d;

    /* renamed from: e, reason: collision with root package name */
    public static final ZL f12825e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ ZL[] f12826f;

    /* renamed from: a, reason: collision with root package name */
    public final EnumC0879aM f12827a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12828b;

    /* JADX INFO: Fake field, exist only in values array */
    ZL EF0;

    /* JADX INFO: Fake field, exist only in values array */
    ZL EF1;

    /* JADX INFO: Fake field, exist only in values array */
    ZL EF2;

    static {
        ZL zl = new ZL("DOUBLE", 0, EnumC0879aM.f13108d, 1);
        ZL zl2 = new ZL("FLOAT", 1, EnumC0879aM.f13107c, 5);
        EnumC0879aM enumC0879aM = EnumC0879aM.f13106b;
        ZL zl3 = new ZL("INT64", 2, enumC0879aM, 0);
        ZL zl4 = new ZL("UINT64", 3, enumC0879aM, 0);
        EnumC0879aM enumC0879aM2 = EnumC0879aM.f13105a;
        ZL zl5 = new ZL("INT32", 4, enumC0879aM2, 0);
        ZL zl6 = new ZL("FIXED64", 5, enumC0879aM, 1);
        ZL zl7 = new ZL("FIXED32", 6, enumC0879aM2, 5);
        ZL zl8 = new ZL("BOOL", 7, EnumC0879aM.f13109e, 0);
        ZL zl9 = new ZL("STRING", 8, EnumC0879aM.f13110f, 2);
        f12823c = zl9;
        EnumC0879aM enumC0879aM3 = EnumC0879aM.i;
        ZL zl10 = new ZL("GROUP", 9, enumC0879aM3, 3);
        f12824d = zl10;
        ZL zl11 = new ZL("MESSAGE", 10, enumC0879aM3, 2);
        f12825e = zl11;
        f12826f = new ZL[]{zl, zl2, zl3, zl4, zl5, zl6, zl7, zl8, zl9, zl10, zl11, new ZL("BYTES", 11, EnumC0879aM.f13111g, 2), new ZL("UINT32", 12, enumC0879aM2, 0), new ZL("ENUM", 13, EnumC0879aM.f13112h, 0), new ZL("SFIXED32", 14, enumC0879aM2, 5), new ZL("SFIXED64", 15, enumC0879aM, 1), new ZL("SINT32", 16, enumC0879aM2, 0), new ZL("SINT64", 17, enumC0879aM, 0)};
    }

    public ZL(String str, int i, EnumC0879aM enumC0879aM, int i3) {
        this.f12827a = enumC0879aM;
        this.f12828b = i3;
    }

    public static ZL[] values() {
        return (ZL[]) f12826f.clone();
    }
}
