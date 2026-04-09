package j$.util.stream;

import j$.util.Spliterator;
import java.util.EnumMap;
import java.util.Map;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DISTINCT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
public final class a7 {
    public static final a7 DISTINCT;
    public static final a7 ORDERED;
    public static final a7 SHORT_CIRCUIT;
    public static final a7 SIZED;
    public static final a7 SORTED;

    /* renamed from: f, reason: collision with root package name */
    public static final int f26480f;
    public static final int g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f26481h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f26482i;
    public static final int j;

    /* renamed from: k, reason: collision with root package name */
    public static final int f26483k;

    /* renamed from: l, reason: collision with root package name */
    public static final int f26484l;

    /* renamed from: m, reason: collision with root package name */
    public static final int f26485m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f26486n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f26487o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f26488p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f26489q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f26490r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f26491s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f26492t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f26493u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ a7[] f26494v;

    /* renamed from: a, reason: collision with root package name */
    public final Map f26495a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26496b;

    /* renamed from: c, reason: collision with root package name */
    public final int f26497c;

    /* renamed from: d, reason: collision with root package name */
    public final int f26498d;

    /* renamed from: e, reason: collision with root package name */
    public final int f26499e;

    public static a7 valueOf(String str) {
        return (a7) Enum.valueOf(a7.class, str);
    }

    public static a7[] values() {
        return (a7[]) f26494v.clone();
    }

    static {
        z6 z6Var = z6.SPLITERATOR;
        j$.time.format.r rVarO = o(z6Var);
        z6 z6Var2 = z6.STREAM;
        rVarO.b(z6Var2);
        z6 z6Var3 = z6.OP;
        ((EnumMap) rVarO.f26164a).put((EnumMap) z6Var3, (z6) 3);
        a7 a7Var = new a7("DISTINCT", 0, 0, rVarO);
        DISTINCT = a7Var;
        j$.time.format.r rVarO2 = o(z6Var);
        rVarO2.b(z6Var2);
        ((EnumMap) rVarO2.f26164a).put((EnumMap) z6Var3, (z6) 3);
        a7 a7Var2 = new a7("SORTED", 1, 1, rVarO2);
        SORTED = a7Var2;
        j$.time.format.r rVarO3 = o(z6Var);
        rVarO3.b(z6Var2);
        ((EnumMap) rVarO3.f26164a).put((EnumMap) z6Var3, (z6) 3);
        z6 z6Var4 = z6.TERMINAL_OP;
        ((EnumMap) rVarO3.f26164a).put((EnumMap) z6Var4, (z6) 2);
        z6 z6Var5 = z6.UPSTREAM_TERMINAL_OP;
        ((EnumMap) rVarO3.f26164a).put((EnumMap) z6Var5, (z6) 2);
        a7 a7Var3 = new a7("ORDERED", 2, 2, rVarO3);
        ORDERED = a7Var3;
        j$.time.format.r rVarO4 = o(z6Var);
        rVarO4.b(z6Var2);
        ((EnumMap) rVarO4.f26164a).put((EnumMap) z6Var3, (z6) 2);
        a7 a7Var4 = new a7("SIZED", 3, 3, rVarO4);
        SIZED = a7Var4;
        j$.time.format.r rVarO5 = o(z6Var3);
        rVarO5.b(z6Var4);
        int i4 = 0;
        a7 a7Var5 = new a7("SHORT_CIRCUIT", 4, 12, rVarO5);
        SHORT_CIRCUIT = a7Var5;
        f26494v = new a7[]{a7Var, a7Var2, a7Var3, a7Var4, a7Var5};
        f26480f = j(z6Var);
        g = j(z6Var2);
        f26481h = j(z6Var3);
        j(z6Var4);
        j(z6Var5);
        for (a7 a7Var6 : values()) {
            i4 |= a7Var6.f26499e;
        }
        f26482i = i4;
        int i10 = g;
        j = i10;
        int i11 = i10 << 1;
        f26483k = i11;
        f26484l = i10 | i11;
        a7 a7Var7 = DISTINCT;
        f26485m = a7Var7.f26497c;
        f26486n = a7Var7.f26498d;
        a7 a7Var8 = SORTED;
        f26487o = a7Var8.f26497c;
        f26488p = a7Var8.f26498d;
        a7 a7Var9 = ORDERED;
        f26489q = a7Var9.f26497c;
        f26490r = a7Var9.f26498d;
        a7 a7Var10 = SIZED;
        f26491s = a7Var10.f26497c;
        f26492t = a7Var10.f26498d;
        f26493u = SHORT_CIRCUIT.f26497c;
    }

    public static j$.time.format.r o(z6 z6Var) {
        j$.time.format.r rVar = new j$.time.format.r(1, new EnumMap(z6.class));
        rVar.b(z6Var);
        return rVar;
    }

    public a7(String str, int i4, int i10, j$.time.format.r rVar) {
        for (z6 z6Var : z6.values()) {
            j$.util.c.t(rVar.f26164a, z6Var, 0);
        }
        this.f26495a = rVar.f26164a;
        int i11 = i10 * 2;
        this.f26496b = i11;
        this.f26497c = 1 << i11;
        this.f26498d = 2 << i11;
        this.f26499e = 3 << i11;
    }

    public final boolean l(int i4) {
        return (i4 & this.f26499e) == this.f26497c;
    }

    public static int j(z6 z6Var) {
        int iIntValue = 0;
        for (a7 a7Var : values()) {
            iIntValue |= ((Integer) a7Var.f26495a.get(z6Var)).intValue() << a7Var.f26496b;
        }
        return iIntValue;
    }

    public static int i(int i4, int i10) {
        int i11;
        if (i4 == 0) {
            i11 = f26482i;
        } else {
            i11 = ~(((j & i4) << 1) | i4 | ((f26483k & i4) >> 1));
        }
        return i4 | (i10 & i11);
    }

    public static int k(Spliterator spliterator) {
        int iCharacteristics = spliterator.characteristics();
        int i4 = iCharacteristics & 4;
        int i10 = f26480f;
        return (i4 == 0 || spliterator.getComparator() == null) ? iCharacteristics & i10 : iCharacteristics & i10 & (-5);
    }
}
