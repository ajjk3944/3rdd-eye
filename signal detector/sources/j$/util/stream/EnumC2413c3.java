package j$.util.stream;

import j$.util.AbstractC2383c;
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
/* renamed from: j$.util.stream.c3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC2413c3 {
    public static final EnumC2413c3 DISTINCT;
    public static final EnumC2413c3 ORDERED;
    public static final EnumC2413c3 SHORT_CIRCUIT;
    public static final EnumC2413c3 SIZED;
    public static final EnumC2413c3 SORTED;

    /* renamed from: f, reason: collision with root package name */
    public static final int f21027f;

    /* renamed from: g, reason: collision with root package name */
    public static final int f21028g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f21029h;
    public static final int i;

    /* renamed from: j, reason: collision with root package name */
    public static final int f21030j;

    /* renamed from: k, reason: collision with root package name */
    public static final int f21031k;

    /* renamed from: l, reason: collision with root package name */
    public static final int f21032l;

    /* renamed from: m, reason: collision with root package name */
    public static final int f21033m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f21034n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f21035o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f21036p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f21037q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f21038r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f21039s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f21040t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f21041u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ EnumC2413c3[] f21042v;

    /* renamed from: a, reason: collision with root package name */
    public final Map f21043a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21044b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21045c;

    /* renamed from: d, reason: collision with root package name */
    public final int f21046d;

    /* renamed from: e, reason: collision with root package name */
    public final int f21047e;

    public static EnumC2413c3 valueOf(String str) {
        return (EnumC2413c3) Enum.valueOf(EnumC2413c3.class, str);
    }

    public static EnumC2413c3[] values() {
        return (EnumC2413c3[]) f21042v.clone();
    }

    static {
        EnumC2408b3 enumC2408b3 = EnumC2408b3.SPLITERATOR;
        j$.util.function.g gVarE = e(enumC2408b3);
        EnumC2408b3 enumC2408b32 = EnumC2408b3.STREAM;
        gVarE.a(enumC2408b32);
        EnumC2408b3 enumC2408b33 = EnumC2408b3.OP;
        ((EnumMap) ((Map) gVarE.f20799b)).put((EnumMap) enumC2408b33, (EnumC2408b3) 3);
        EnumC2413c3 enumC2413c3 = new EnumC2413c3("DISTINCT", 0, 0, gVarE);
        DISTINCT = enumC2413c3;
        j$.util.function.g gVarE2 = e(enumC2408b3);
        gVarE2.a(enumC2408b32);
        ((EnumMap) ((Map) gVarE2.f20799b)).put((EnumMap) enumC2408b33, (EnumC2408b3) 3);
        EnumC2413c3 enumC2413c32 = new EnumC2413c3("SORTED", 1, 1, gVarE2);
        SORTED = enumC2413c32;
        j$.util.function.g gVarE3 = e(enumC2408b3);
        gVarE3.a(enumC2408b32);
        ((EnumMap) ((Map) gVarE3.f20799b)).put((EnumMap) enumC2408b33, (EnumC2408b3) 3);
        EnumC2408b3 enumC2408b34 = EnumC2408b3.TERMINAL_OP;
        ((EnumMap) ((Map) gVarE3.f20799b)).put((EnumMap) enumC2408b34, (EnumC2408b3) 2);
        EnumC2408b3 enumC2408b35 = EnumC2408b3.UPSTREAM_TERMINAL_OP;
        ((EnumMap) ((Map) gVarE3.f20799b)).put((EnumMap) enumC2408b35, (EnumC2408b3) 2);
        EnumC2413c3 enumC2413c33 = new EnumC2413c3("ORDERED", 2, 2, gVarE3);
        ORDERED = enumC2413c33;
        j$.util.function.g gVarE4 = e(enumC2408b3);
        gVarE4.a(enumC2408b32);
        ((EnumMap) ((Map) gVarE4.f20799b)).put((EnumMap) enumC2408b33, (EnumC2408b3) 2);
        EnumC2413c3 enumC2413c34 = new EnumC2413c3("SIZED", 3, 3, gVarE4);
        SIZED = enumC2413c34;
        j$.util.function.g gVarE5 = e(enumC2408b33);
        gVarE5.a(enumC2408b34);
        int i3 = 0;
        EnumC2413c3 enumC2413c35 = new EnumC2413c3("SHORT_CIRCUIT", 4, 12, gVarE5);
        SHORT_CIRCUIT = enumC2413c35;
        f21042v = new EnumC2413c3[]{enumC2413c3, enumC2413c32, enumC2413c33, enumC2413c34, enumC2413c35};
        f21027f = b(enumC2408b3);
        f21028g = b(enumC2408b32);
        f21029h = b(enumC2408b33);
        b(enumC2408b34);
        b(enumC2408b35);
        for (EnumC2413c3 enumC2413c36 : values()) {
            i3 |= enumC2413c36.f21047e;
        }
        i = i3;
        int i6 = f21028g;
        f21030j = i6;
        int i7 = i6 << 1;
        f21031k = i7;
        f21032l = i6 | i7;
        EnumC2413c3 enumC2413c37 = DISTINCT;
        f21033m = enumC2413c37.f21045c;
        f21034n = enumC2413c37.f21046d;
        EnumC2413c3 enumC2413c38 = SORTED;
        f21035o = enumC2413c38.f21045c;
        f21036p = enumC2413c38.f21046d;
        EnumC2413c3 enumC2413c39 = ORDERED;
        f21037q = enumC2413c39.f21045c;
        f21038r = enumC2413c39.f21046d;
        EnumC2413c3 enumC2413c310 = SIZED;
        f21039s = enumC2413c310.f21045c;
        f21040t = enumC2413c310.f21046d;
        f21041u = SHORT_CIRCUIT.f21045c;
    }

    public static j$.util.function.g e(EnumC2408b3 enumC2408b3) {
        j$.util.function.g gVar = new j$.util.function.g(new EnumMap(EnumC2408b3.class), 8);
        gVar.a(enumC2408b3);
        return gVar;
    }

    public EnumC2413c3(String str, int i3, int i6, j$.util.function.g gVar) {
        for (EnumC2408b3 enumC2408b3 : EnumC2408b3.values()) {
            AbstractC2383c.q((Map) gVar.f20799b, enumC2408b3, 0);
        }
        this.f21043a = (Map) gVar.f20799b;
        int i7 = i6 * 2;
        this.f21044b = i7;
        this.f21045c = 1 << i7;
        this.f21046d = 2 << i7;
        this.f21047e = 3 << i7;
    }

    public final boolean d(int i3) {
        return (i3 & this.f21047e) == this.f21045c;
    }

    public static int b(EnumC2408b3 enumC2408b3) {
        int iIntValue = 0;
        for (EnumC2413c3 enumC2413c3 : values()) {
            iIntValue |= ((Integer) enumC2413c3.f21043a.get(enumC2408b3)).intValue() << enumC2413c3.f21044b;
        }
        return iIntValue;
    }

    public static int a(int i3, int i6) {
        int i7;
        if (i3 == 0) {
            i7 = i;
        } else {
            i7 = ~(((f21030j & i3) << 1) | i3 | ((f21031k & i3) >> 1));
        }
        return i3 | (i6 & i7);
    }

    public static int c(Spliterator spliterator) {
        int iCharacteristics = spliterator.characteristics();
        int i3 = iCharacteristics & 4;
        int i6 = f21027f;
        return (i3 == 0 || spliterator.getComparator() == null) ? iCharacteristics & i6 : iCharacteristics & i6 & (-5);
    }
}
