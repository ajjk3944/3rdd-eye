package N7;

import A7.b;
import N7.AbstractC1339r9;
import N7.C9;
import N7.H5;
import N7.M5;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivIndicator.kt */
/* loaded from: classes.dex */
public final class G5 implements InterfaceC5868a, S2 {

    /* renamed from: T, reason: collision with root package name */
    public static final b.C0000b f5266T = b.a.a(16768096);

    /* renamed from: U, reason: collision with root package name */
    public static final b.C0000b f5267U = b.a.a(Double.valueOf(1.3d));

    /* renamed from: V, reason: collision with root package name */
    public static final b.C0000b f5268V = b.a.a(Double.valueOf(1.0d));

    /* renamed from: W, reason: collision with root package name */
    public static final b.C0000b f5269W = b.a.a(a.SCALE);

    /* renamed from: X, reason: collision with root package name */
    public static final C9.c f5270X = new C9.c(new C1412wc(null, null, null));

    /* renamed from: Y, reason: collision with root package name */
    public static final b.C0000b f5271Y = b.a.a(865180853);

    /* renamed from: Z, reason: collision with root package name */
    public static final b.C0000b f5272Z = b.a.a(Double.valueOf(0.5d));

    /* renamed from: a0, reason: collision with root package name */
    public static final AbstractC1339r9.b f5273a0 = new AbstractC1339r9.b(new W8(0));

    /* renamed from: b0, reason: collision with root package name */
    public static final W4 f5274b0 = new W4(b.a.a(15L));

    /* renamed from: c0, reason: collision with root package name */
    public static final b.C0000b f5275c0 = b.a.a(EnumC1356sc.VISIBLE);

    /* renamed from: d0, reason: collision with root package name */
    public static final C9.b f5276d0 = new C9.b(new V6(null));

    /* renamed from: A, reason: collision with root package name */
    public final String f5277A;

    /* renamed from: B, reason: collision with root package name */
    public final A7.b<String> f5278B;

    /* renamed from: C, reason: collision with root package name */
    public final A7.b<Long> f5279C;

    /* renamed from: D, reason: collision with root package name */
    public final List<C1175g0> f5280D;

    /* renamed from: E, reason: collision with root package name */
    public final AbstractC1339r9 f5281E;

    /* renamed from: F, reason: collision with root package name */
    public final W4 f5282F;

    /* renamed from: G, reason: collision with root package name */
    public final List<C1439yb> f5283G;

    /* renamed from: H, reason: collision with root package name */
    public final Qb f5284H;

    /* renamed from: I, reason: collision with root package name */
    public final AbstractC1178g3 f5285I;

    /* renamed from: J, reason: collision with root package name */
    public final F2 f5286J;

    /* renamed from: K, reason: collision with root package name */
    public final F2 f5287K;

    /* renamed from: L, reason: collision with root package name */
    public final List<Ub> f5288L;

    /* renamed from: M, reason: collision with root package name */
    public final List<Vb> f5289M;

    /* renamed from: N, reason: collision with root package name */
    public final List<AbstractC1142dc> f5290N;

    /* renamed from: O, reason: collision with root package name */
    public final A7.b<EnumC1356sc> f5291O;

    /* renamed from: P, reason: collision with root package name */
    public final C1370tc f5292P;

    /* renamed from: Q, reason: collision with root package name */
    public final List<C1370tc> f5293Q;

    /* renamed from: R, reason: collision with root package name */
    public final C9 f5294R;

    /* renamed from: S, reason: collision with root package name */
    public Integer f5295S;

    /* renamed from: a, reason: collision with root package name */
    public final C1130d0 f5296a;

    /* renamed from: b, reason: collision with root package name */
    public final A7.b<Integer> f5297b;

    /* renamed from: c, reason: collision with root package name */
    public final A7.b<Double> f5298c;

    /* renamed from: d, reason: collision with root package name */
    public final W8 f5299d;

    /* renamed from: e, reason: collision with root package name */
    public final A7.b<EnumC1305p2> f5300e;

    /* renamed from: f, reason: collision with root package name */
    public final A7.b<EnumC1319q2> f5301f;

    /* renamed from: g, reason: collision with root package name */
    public final A7.b<Double> f5302g;

    /* renamed from: h, reason: collision with root package name */
    public final A7.b<a> f5303h;
    public final List<AbstractC1402w2> i;

    /* renamed from: j, reason: collision with root package name */
    public final List<N2> f5304j;

    /* renamed from: k, reason: collision with root package name */
    public final X2 f5305k;

    /* renamed from: l, reason: collision with root package name */
    public final A7.b<Long> f5306l;

    /* renamed from: m, reason: collision with root package name */
    public final List<C1179g4> f5307m;

    /* renamed from: n, reason: collision with root package name */
    public final List<C1418x4> f5308n;

    /* renamed from: o, reason: collision with root package name */
    public final Z4 f5309o;

    /* renamed from: p, reason: collision with root package name */
    public final List<C1210i5> f5310p;

    /* renamed from: q, reason: collision with root package name */
    public final C9 f5311q;

    /* renamed from: r, reason: collision with root package name */
    public final String f5312r;

    /* renamed from: s, reason: collision with root package name */
    public final A7.b<Integer> f5313s;

    /* renamed from: t, reason: collision with root package name */
    public final W8 f5314t;

    /* renamed from: u, reason: collision with root package name */
    public final W8 f5315u;

    /* renamed from: v, reason: collision with root package name */
    public final H5 f5316v;

    /* renamed from: w, reason: collision with root package name */
    public final L6 f5317w;

    /* renamed from: x, reason: collision with root package name */
    public final C1362t4 f5318x;

    /* renamed from: y, reason: collision with root package name */
    public final A7.b<Double> f5319y;

    /* renamed from: z, reason: collision with root package name */
    public final C1362t4 f5320z;

    /* compiled from: DivIndicator.kt */
    public enum a {
        SCALE("scale"),
        WORM("worm"),
        SLIDER("slider");

        private final String value;
        public static final c Converter = new c();
        public static final p9.l<a, String> TO_STRING = b.f5322g;
        public static final p9.l<String, a> FROM_STRING = C0082a.f5321g;

        /* compiled from: DivIndicator.kt */
        /* renamed from: N7.G5$a$a, reason: collision with other inner class name */
        public static final class C0082a extends kotlin.jvm.internal.m implements p9.l<String, a> {

            /* renamed from: g, reason: collision with root package name */
            public static final C0082a f5321g = new C0082a(1);

            @Override // p9.l
            public final a invoke(String str) {
                String value = str;
                kotlin.jvm.internal.l.f(value, "value");
                a.Converter.getClass();
                a aVar = a.SCALE;
                if (value.equals(aVar.value)) {
                    return aVar;
                }
                a aVar2 = a.WORM;
                if (value.equals(aVar2.value)) {
                    return aVar2;
                }
                a aVar3 = a.SLIDER;
                if (value.equals(aVar3.value)) {
                    return aVar3;
                }
                return null;
            }
        }

        /* compiled from: DivIndicator.kt */
        public static final class b extends kotlin.jvm.internal.m implements p9.l<a, String> {

            /* renamed from: g, reason: collision with root package name */
            public static final b f5322g = new b(1);

            @Override // p9.l
            public final String invoke(a aVar) {
                a value = aVar;
                kotlin.jvm.internal.l.f(value, "value");
                a.Converter.getClass();
                return value.value;
            }
        }

        /* compiled from: DivIndicator.kt */
        public static final class c {
        }

        a(String str) {
            this.value = str;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public G5(C1130d0 c1130d0, A7.b<Integer> activeItemColor, A7.b<Double> activeItemSize, W8 w82, A7.b<EnumC1305p2> bVar, A7.b<EnumC1319q2> bVar2, A7.b<Double> alpha, A7.b<a> animation, List<? extends AbstractC1402w2> list, List<? extends N2> list2, X2 x22, A7.b<Long> bVar3, List<C1179g4> list3, List<C1418x4> list4, Z4 z42, List<C1210i5> list5, C9 height, String str, A7.b<Integer> inactiveItemColor, W8 w83, W8 w84, H5 h52, L6 l62, C1362t4 c1362t4, A7.b<Double> minimumItemSize, C1362t4 c1362t42, String str2, A7.b<String> bVar4, A7.b<Long> bVar5, List<C1175g0> list6, AbstractC1339r9 shape, W4 spaceBetweenCenters, List<C1439yb> list7, Qb qb, AbstractC1178g3 abstractC1178g3, F2 f22, F2 f23, List<? extends Ub> list8, List<Vb> list9, List<? extends AbstractC1142dc> list10, A7.b<EnumC1356sc> visibility, C1370tc c1370tc, List<C1370tc> list11, C9 width) {
        kotlin.jvm.internal.l.f(activeItemColor, "activeItemColor");
        kotlin.jvm.internal.l.f(activeItemSize, "activeItemSize");
        kotlin.jvm.internal.l.f(alpha, "alpha");
        kotlin.jvm.internal.l.f(animation, "animation");
        kotlin.jvm.internal.l.f(height, "height");
        kotlin.jvm.internal.l.f(inactiveItemColor, "inactiveItemColor");
        kotlin.jvm.internal.l.f(minimumItemSize, "minimumItemSize");
        kotlin.jvm.internal.l.f(shape, "shape");
        kotlin.jvm.internal.l.f(spaceBetweenCenters, "spaceBetweenCenters");
        kotlin.jvm.internal.l.f(visibility, "visibility");
        kotlin.jvm.internal.l.f(width, "width");
        this.f5296a = c1130d0;
        this.f5297b = activeItemColor;
        this.f5298c = activeItemSize;
        this.f5299d = w82;
        this.f5300e = bVar;
        this.f5301f = bVar2;
        this.f5302g = alpha;
        this.f5303h = animation;
        this.i = list;
        this.f5304j = list2;
        this.f5305k = x22;
        this.f5306l = bVar3;
        this.f5307m = list3;
        this.f5308n = list4;
        this.f5309o = z42;
        this.f5310p = list5;
        this.f5311q = height;
        this.f5312r = str;
        this.f5313s = inactiveItemColor;
        this.f5314t = w83;
        this.f5315u = w84;
        this.f5316v = h52;
        this.f5317w = l62;
        this.f5318x = c1362t4;
        this.f5319y = minimumItemSize;
        this.f5320z = c1362t42;
        this.f5277A = str2;
        this.f5278B = bVar4;
        this.f5279C = bVar5;
        this.f5280D = list6;
        this.f5281E = shape;
        this.f5282F = spaceBetweenCenters;
        this.f5283G = list7;
        this.f5284H = qb;
        this.f5285I = abstractC1178g3;
        this.f5286J = f22;
        this.f5287K = f23;
        this.f5288L = list8;
        this.f5289M = list9;
        this.f5290N = list10;
        this.f5291O = visibility;
        this.f5292P = c1370tc;
        this.f5293Q = list11;
        this.f5294R = width;
    }

    @Override // N7.S2
    public final Z4 A() {
        return this.f5309o;
    }

    @Override // N7.S2
    public final F2 B() {
        return this.f5287K;
    }

    @Override // N7.S2
    public final AbstractC1178g3 C() {
        return this.f5285I;
    }

    public final int D() {
        int iB;
        int iB2;
        int iJ;
        int iB3;
        int iB4;
        int iIntValue;
        int iB5;
        int iB6;
        int iB7;
        int iB8;
        int iHashCode;
        int iIntValue2;
        Integer num = this.f5295S;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode2 = kotlin.jvm.internal.x.a(G5.class).hashCode();
        int iJ2 = 0;
        C1130d0 c1130d0 = this.f5296a;
        int iHashCode3 = this.f5298c.hashCode() + this.f5297b.hashCode() + iHashCode2 + (c1130d0 != null ? c1130d0.b() : 0);
        W8 w82 = this.f5299d;
        int iB9 = iHashCode3 + (w82 != null ? w82.b() : 0);
        A7.b<EnumC1305p2> bVar = this.f5300e;
        int iHashCode4 = iB9 + (bVar != null ? bVar.hashCode() : 0);
        A7.b<EnumC1319q2> bVar2 = this.f5301f;
        int iHashCode5 = this.f5303h.hashCode() + this.f5302g.hashCode() + iHashCode4 + (bVar2 != null ? bVar2.hashCode() : 0);
        List<AbstractC1402w2> list = this.i;
        if (list != null) {
            Iterator<T> it = list.iterator();
            iB = 0;
            while (it.hasNext()) {
                iB += ((AbstractC1402w2) it.next()).b();
            }
        } else {
            iB = 0;
        }
        int i = iHashCode5 + iB;
        List<N2> list2 = this.f5304j;
        if (list2 != null) {
            Iterator<T> it2 = list2.iterator();
            iB2 = 0;
            while (it2.hasNext()) {
                iB2 += ((N2) it2.next()).b();
            }
        } else {
            iB2 = 0;
        }
        int i10 = i + iB2;
        X2 x22 = this.f5305k;
        int iB10 = i10 + (x22 != null ? x22.b() : 0);
        A7.b<Long> bVar3 = this.f5306l;
        int iHashCode6 = iB10 + (bVar3 != null ? bVar3.hashCode() : 0);
        List<C1179g4> list3 = this.f5307m;
        if (list3 != null) {
            Iterator<T> it3 = list3.iterator();
            iJ = 0;
            while (it3.hasNext()) {
                iJ += ((C1179g4) it3.next()).j();
            }
        } else {
            iJ = 0;
        }
        int i11 = iHashCode6 + iJ;
        List<C1418x4> list4 = this.f5308n;
        if (list4 != null) {
            Iterator<T> it4 = list4.iterator();
            iB3 = 0;
            while (it4.hasNext()) {
                iB3 += ((C1418x4) it4.next()).b();
            }
        } else {
            iB3 = 0;
        }
        int i12 = i11 + iB3;
        Z4 z42 = this.f5309o;
        int iB11 = i12 + (z42 != null ? z42.b() : 0);
        List<C1210i5> list5 = this.f5310p;
        if (list5 != null) {
            Iterator<T> it5 = list5.iterator();
            iB4 = 0;
            while (it5.hasNext()) {
                iB4 += ((C1210i5) it5.next()).b();
            }
        } else {
            iB4 = 0;
        }
        int iB12 = this.f5311q.b() + iB11 + iB4;
        String str = this.f5312r;
        int iHashCode7 = this.f5313s.hashCode() + iB12 + (str != null ? str.hashCode() : 0);
        W8 w83 = this.f5314t;
        int iB13 = iHashCode7 + (w83 != null ? w83.b() : 0);
        W8 w84 = this.f5315u;
        int iB14 = iB13 + (w84 != null ? w84.b() : 0);
        H5 h52 = this.f5316v;
        if (h52 != null) {
            Integer num2 = h52.f5390a;
            if (num2 != null) {
                iIntValue = num2.intValue();
            } else {
                int iHashCode8 = kotlin.jvm.internal.x.a(h52.getClass()).hashCode();
                if (h52 instanceof H5.a) {
                    C1089a4 c1089a4 = ((H5.a) h52).f5391b;
                    Integer num3 = c1089a4.f7895b;
                    if (num3 != null) {
                        iIntValue2 = num3.intValue();
                        int i13 = iHashCode8 + iIntValue2;
                        h52.f5390a = Integer.valueOf(i13);
                        iIntValue = i13;
                    } else {
                        iHashCode = kotlin.jvm.internal.x.a(C1089a4.class).hashCode() + c1089a4.f7894a.b();
                        c1089a4.f7895b = Integer.valueOf(iHashCode);
                        iIntValue2 = iHashCode;
                        int i132 = iHashCode8 + iIntValue2;
                        h52.f5390a = Integer.valueOf(i132);
                        iIntValue = i132;
                    }
                } else {
                    if (!(h52 instanceof H5.b)) {
                        throw new b9.j();
                    }
                    C1140da c1140da = ((H5.b) h52).f5392b;
                    Integer num4 = c1140da.f8129c;
                    if (num4 != null) {
                        iIntValue2 = num4.intValue();
                        int i1322 = iHashCode8 + iIntValue2;
                        h52.f5390a = Integer.valueOf(i1322);
                        iIntValue = i1322;
                    } else {
                        iHashCode = c1140da.f8128b.hashCode() + c1140da.f8127a.b() + kotlin.jvm.internal.x.a(C1140da.class).hashCode();
                        c1140da.f8129c = Integer.valueOf(iHashCode);
                        iIntValue2 = iHashCode;
                        int i13222 = iHashCode8 + iIntValue2;
                        h52.f5390a = Integer.valueOf(i13222);
                        iIntValue = i13222;
                    }
                }
            }
        } else {
            iIntValue = 0;
        }
        int i14 = iB14 + iIntValue;
        L6 l62 = this.f5317w;
        int iB15 = i14 + (l62 != null ? l62.b() : 0);
        C1362t4 c1362t4 = this.f5318x;
        int iHashCode9 = this.f5319y.hashCode() + iB15 + (c1362t4 != null ? c1362t4.b() : 0);
        C1362t4 c1362t42 = this.f5320z;
        int iB16 = iHashCode9 + (c1362t42 != null ? c1362t42.b() : 0);
        String str2 = this.f5277A;
        int iHashCode10 = iB16 + (str2 != null ? str2.hashCode() : 0);
        A7.b<String> bVar4 = this.f5278B;
        int iHashCode11 = iHashCode10 + (bVar4 != null ? bVar4.hashCode() : 0);
        A7.b<Long> bVar5 = this.f5279C;
        int iHashCode12 = iHashCode11 + (bVar5 != null ? bVar5.hashCode() : 0);
        List<C1175g0> list6 = this.f5280D;
        if (list6 != null) {
            Iterator<T> it6 = list6.iterator();
            iB5 = 0;
            while (it6.hasNext()) {
                iB5 += ((C1175g0) it6.next()).b();
            }
        } else {
            iB5 = 0;
        }
        int iB17 = this.f5282F.b() + this.f5281E.b() + iHashCode12 + iB5;
        List<C1439yb> list7 = this.f5283G;
        if (list7 != null) {
            Iterator<T> it7 = list7.iterator();
            iB6 = 0;
            while (it7.hasNext()) {
                iB6 += ((C1439yb) it7.next()).b();
            }
        } else {
            iB6 = 0;
        }
        int i15 = iB17 + iB6;
        Qb qb = this.f5284H;
        int iB18 = i15 + (qb != null ? qb.b() : 0);
        AbstractC1178g3 abstractC1178g3 = this.f5285I;
        int iB19 = iB18 + (abstractC1178g3 != null ? abstractC1178g3.b() : 0);
        F2 f22 = this.f5286J;
        int iB20 = iB19 + (f22 != null ? f22.b() : 0);
        F2 f23 = this.f5287K;
        int iB21 = iB20 + (f23 != null ? f23.b() : 0);
        List<Ub> list8 = this.f5288L;
        int iHashCode13 = iB21 + (list8 != null ? list8.hashCode() : 0);
        List<Vb> list9 = this.f5289M;
        if (list9 != null) {
            Iterator<T> it8 = list9.iterator();
            iB7 = 0;
            while (it8.hasNext()) {
                iB7 += ((Vb) it8.next()).b();
            }
        } else {
            iB7 = 0;
        }
        int i16 = iHashCode13 + iB7;
        List<AbstractC1142dc> list10 = this.f5290N;
        if (list10 != null) {
            Iterator<T> it9 = list10.iterator();
            iB8 = 0;
            while (it9.hasNext()) {
                iB8 += ((AbstractC1142dc) it9.next()).b();
            }
        } else {
            iB8 = 0;
        }
        int iHashCode14 = this.f5291O.hashCode() + i16 + iB8;
        C1370tc c1370tc = this.f5292P;
        int iJ3 = iHashCode14 + (c1370tc != null ? c1370tc.j() : 0);
        List<C1370tc> list11 = this.f5293Q;
        if (list11 != null) {
            Iterator<T> it10 = list11.iterator();
            while (it10.hasNext()) {
                iJ2 += ((C1370tc) it10.next()).j();
            }
        }
        int iB22 = this.f5294R.b() + iJ3 + iJ2;
        this.f5295S = Integer.valueOf(iB22);
        return iB22;
    }

    /* JADX WARN: Removed duplicated region for block: B:252:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x035b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(N7.G5 r9, A7.d r10, A7.d r11) {
        /*
            Method dump skipped, instructions count: 1575
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N7.G5.a(N7.G5, A7.d, A7.d):boolean");
    }

    @Override // N7.S2
    public final List<N2> b() {
        return this.f5304j;
    }

    @Override // N7.S2
    public final List<C1179g4> c() {
        return this.f5307m;
    }

    @Override // N7.S2
    public final Qb d() {
        return this.f5284H;
    }

    @Override // N7.S2
    public final List<C1370tc> e() {
        return this.f5293Q;
    }

    @Override // N7.S2
    public final C1130d0 f() {
        return this.f5296a;
    }

    @Override // N7.S2
    public final A7.b<Long> g() {
        return this.f5306l;
    }

    @Override // N7.S2
    public final List<C1418x4> getExtensions() {
        return this.f5308n;
    }

    @Override // N7.S2
    public final C9 getHeight() {
        return this.f5311q;
    }

    @Override // N7.S2
    public final String getId() {
        return this.f5312r;
    }

    @Override // N7.S2
    public final A7.b<EnumC1356sc> getVisibility() {
        return this.f5291O;
    }

    @Override // N7.S2
    public final C9 getWidth() {
        return this.f5294R;
    }

    @Override // N7.S2
    public final List<AbstractC1142dc> h() {
        return this.f5290N;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((M5.e) D7.a.f1071b.f6686a4.getValue()).b(D7.a.f1070a, this);
    }

    @Override // N7.S2
    public final C1362t4 j() {
        return this.f5318x;
    }

    @Override // N7.S2
    public final A7.b<Long> k() {
        return this.f5279C;
    }

    @Override // N7.S2
    public final C1362t4 l() {
        return this.f5320z;
    }

    @Override // N7.S2
    public final List<Ub> m() {
        return this.f5288L;
    }

    @Override // N7.S2
    public final List<C1175g0> n() {
        return this.f5280D;
    }

    @Override // N7.S2
    public final A7.b<EnumC1305p2> o() {
        return this.f5300e;
    }

    @Override // N7.S2
    public final L6 p() {
        return this.f5317w;
    }

    @Override // N7.S2
    public final A7.b<String> q() {
        return this.f5278B;
    }

    @Override // N7.S2
    public final List<Vb> r() {
        return this.f5289M;
    }

    @Override // N7.S2
    public final List<C1439yb> s() {
        return this.f5283G;
    }

    @Override // N7.S2
    public final C1370tc t() {
        return this.f5292P;
    }

    @Override // N7.S2
    public final List<C1210i5> u() {
        return this.f5310p;
    }

    @Override // N7.S2
    public final A7.b<EnumC1319q2> v() {
        return this.f5301f;
    }

    @Override // N7.S2
    public final F2 w() {
        return this.f5286J;
    }

    @Override // N7.S2
    public final List<AbstractC1402w2> x() {
        return this.i;
    }

    @Override // N7.S2
    public final A7.b<Double> y() {
        return this.f5302g;
    }

    @Override // N7.S2
    public final X2 z() {
        return this.f5305k;
    }

    public G5() {
        this(null, f5266T, f5267U, null, null, null, f5268V, f5269W, null, null, null, null, null, null, null, null, f5270X, null, f5271Y, null, null, null, null, null, f5272Z, null, null, null, null, null, f5273a0, f5274b0, null, null, null, null, null, null, null, null, f5275c0, null, null, f5276d0);
    }
}
