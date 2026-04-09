package N7;

import A7.b;
import N7.C9;
import N7.Y9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivState.kt */
/* loaded from: classes.dex */
public final class X9 implements InterfaceC5868a, S2 {

    /* renamed from: A, reason: collision with root package name */
    public final Qb f7706A;

    /* renamed from: B, reason: collision with root package name */
    public final A7.b<Tb> f7707B;

    /* renamed from: C, reason: collision with root package name */
    public final AbstractC1178g3 f7708C;

    /* renamed from: D, reason: collision with root package name */
    public final F2 f7709D;

    /* renamed from: E, reason: collision with root package name */
    public final F2 f7710E;

    /* renamed from: F, reason: collision with root package name */
    public final List<Ub> f7711F;

    /* renamed from: G, reason: collision with root package name */
    public final List<Vb> f7712G;

    /* renamed from: H, reason: collision with root package name */
    public final List<AbstractC1142dc> f7713H;

    /* renamed from: I, reason: collision with root package name */
    public final A7.b<EnumC1356sc> f7714I;

    /* renamed from: J, reason: collision with root package name */
    public final C1370tc f7715J;

    /* renamed from: K, reason: collision with root package name */
    public final List<C1370tc> f7716K;

    /* renamed from: L, reason: collision with root package name */
    public final C9 f7717L;

    /* renamed from: M, reason: collision with root package name */
    public Integer f7718M;

    /* renamed from: N, reason: collision with root package name */
    public Integer f7719N;

    /* renamed from: a, reason: collision with root package name */
    public final C1130d0 f7720a;

    /* renamed from: b, reason: collision with root package name */
    public final A7.b<EnumC1305p2> f7721b;

    /* renamed from: c, reason: collision with root package name */
    public final A7.b<EnumC1319q2> f7722c;

    /* renamed from: d, reason: collision with root package name */
    public final A7.b<Double> f7723d;

    /* renamed from: e, reason: collision with root package name */
    public final List<AbstractC1402w2> f7724e;

    /* renamed from: f, reason: collision with root package name */
    public final List<N2> f7725f;

    /* renamed from: g, reason: collision with root package name */
    public final X2 f7726g;

    /* renamed from: h, reason: collision with root package name */
    public final A7.b<Boolean> f7727h;
    public final A7.b<Long> i;

    /* renamed from: j, reason: collision with root package name */
    public final A7.b<String> f7728j;

    /* renamed from: k, reason: collision with root package name */
    public final List<C1179g4> f7729k;

    /* renamed from: l, reason: collision with root package name */
    public final String f7730l;

    /* renamed from: m, reason: collision with root package name */
    public final List<C1418x4> f7731m;

    /* renamed from: n, reason: collision with root package name */
    public final Z4 f7732n;

    /* renamed from: o, reason: collision with root package name */
    public final List<C1210i5> f7733o;

    /* renamed from: p, reason: collision with root package name */
    public final C9 f7734p;

    /* renamed from: q, reason: collision with root package name */
    public final String f7735q;

    /* renamed from: r, reason: collision with root package name */
    public final L6 f7736r;

    /* renamed from: s, reason: collision with root package name */
    public final C1362t4 f7737s;

    /* renamed from: t, reason: collision with root package name */
    public final C1362t4 f7738t;

    /* renamed from: u, reason: collision with root package name */
    public final A7.b<String> f7739u;

    /* renamed from: v, reason: collision with root package name */
    public final A7.b<Long> f7740v;

    /* renamed from: w, reason: collision with root package name */
    public final List<C1175g0> f7741w;

    /* renamed from: x, reason: collision with root package name */
    public final String f7742x;

    /* renamed from: y, reason: collision with root package name */
    public final List<a> f7743y;

    /* renamed from: z, reason: collision with root package name */
    public final List<C1439yb> f7744z;

    /* compiled from: DivState.kt */
    public static final class a implements InterfaceC5868a {

        /* renamed from: a, reason: collision with root package name */
        public final C1332r2 f7745a;

        /* renamed from: b, reason: collision with root package name */
        public final C1332r2 f7746b;

        /* renamed from: c, reason: collision with root package name */
        public final Z f7747c;

        /* renamed from: d, reason: collision with root package name */
        public final String f7748d;

        /* renamed from: e, reason: collision with root package name */
        public final List<C1175g0> f7749e;

        /* renamed from: f, reason: collision with root package name */
        public Integer f7750f;

        public a(C1332r2 c1332r2, C1332r2 c1332r22, Z z10, String str, List<C1175g0> list) {
            this.f7745a = c1332r2;
            this.f7746b = c1332r22;
            this.f7747c = z10;
            this.f7748d = str;
            this.f7749e = list;
        }

        @Override // z7.InterfaceC5868a
        public final JSONObject i() {
            return ((Z9) D7.a.f1071b.f6837n7.getValue()).b(D7.a.f1070a, this);
        }
    }

    static {
        b.a.a(Double.valueOf(1.0d));
        b.a.a(Boolean.TRUE);
        new C9.c(new C1412wc(null, null, null));
        b.a.a(Tb.STATE_CHANGE);
        b.a.a(EnumC1356sc.VISIBLE);
        new C9.b(new V6(null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X9(C1130d0 c1130d0, A7.b<EnumC1305p2> bVar, A7.b<EnumC1319q2> bVar2, A7.b<Double> alpha, List<? extends AbstractC1402w2> list, List<? extends N2> list2, X2 x22, A7.b<Boolean> clipToBounds, A7.b<Long> bVar3, A7.b<String> bVar4, List<C1179g4> list3, String str, List<C1418x4> list4, Z4 z42, List<C1210i5> list5, C9 c92, String str2, L6 l62, C1362t4 c1362t4, C1362t4 c1362t42, A7.b<String> bVar5, A7.b<Long> bVar6, List<C1175g0> list6, String str3, List<a> list7, List<C1439yb> list8, Qb qb, A7.b<Tb> transitionAnimationSelector, AbstractC1178g3 abstractC1178g3, F2 f22, F2 f23, List<? extends Ub> list9, List<Vb> list10, List<? extends AbstractC1142dc> list11, A7.b<EnumC1356sc> visibility, C1370tc c1370tc, List<C1370tc> list12, C9 c93) {
        kotlin.jvm.internal.l.f(alpha, "alpha");
        kotlin.jvm.internal.l.f(clipToBounds, "clipToBounds");
        kotlin.jvm.internal.l.f(transitionAnimationSelector, "transitionAnimationSelector");
        kotlin.jvm.internal.l.f(visibility, "visibility");
        this.f7720a = c1130d0;
        this.f7721b = bVar;
        this.f7722c = bVar2;
        this.f7723d = alpha;
        this.f7724e = list;
        this.f7725f = list2;
        this.f7726g = x22;
        this.f7727h = clipToBounds;
        this.i = bVar3;
        this.f7728j = bVar4;
        this.f7729k = list3;
        this.f7730l = str;
        this.f7731m = list4;
        this.f7732n = z42;
        this.f7733o = list5;
        this.f7734p = c92;
        this.f7735q = str2;
        this.f7736r = l62;
        this.f7737s = c1362t4;
        this.f7738t = c1362t42;
        this.f7739u = bVar5;
        this.f7740v = bVar6;
        this.f7741w = list6;
        this.f7742x = str3;
        this.f7743y = list7;
        this.f7744z = list8;
        this.f7706A = qb;
        this.f7707B = transitionAnimationSelector;
        this.f7708C = abstractC1178g3;
        this.f7709D = f22;
        this.f7710E = f23;
        this.f7711F = list9;
        this.f7712G = list10;
        this.f7713H = list11;
        this.f7714I = visibility;
        this.f7715J = c1370tc;
        this.f7716K = list12;
        this.f7717L = c93;
    }

    public static X9 a(X9 x92, String str, String str2, ArrayList arrayList, int i) {
        C9 c92;
        String str3;
        C1130d0 c1130d0 = x92.f7720a;
        A7.b<EnumC1305p2> bVar = x92.f7721b;
        A7.b<EnumC1319q2> bVar2 = x92.f7722c;
        A7.b<Double> alpha = x92.f7723d;
        List<AbstractC1402w2> list = x92.f7724e;
        List<N2> list2 = x92.f7725f;
        X2 x22 = x92.f7726g;
        A7.b<Boolean> clipToBounds = x92.f7727h;
        A7.b<Long> bVar3 = x92.i;
        A7.b<String> bVar4 = x92.f7728j;
        List<C1179g4> list3 = x92.f7729k;
        String str4 = (i & 2048) != 0 ? x92.f7730l : str;
        List<C1418x4> list4 = x92.f7731m;
        String str5 = str4;
        Z4 z42 = x92.f7732n;
        List<C1210i5> list5 = x92.f7733o;
        C9 c93 = x92.f7734p;
        if ((i & 65536) != 0) {
            c92 = c93;
            str3 = x92.f7735q;
        } else {
            c92 = c93;
            str3 = str2;
        }
        L6 l62 = x92.f7736r;
        C1362t4 c1362t4 = x92.f7737s;
        C1362t4 c1362t42 = x92.f7738t;
        A7.b<String> bVar5 = x92.f7739u;
        A7.b<Long> bVar6 = x92.f7740v;
        List<C1175g0> list6 = x92.f7741w;
        String str6 = x92.f7742x;
        List<C1439yb> list7 = x92.f7744z;
        Qb qb = x92.f7706A;
        A7.b<Tb> transitionAnimationSelector = x92.f7707B;
        AbstractC1178g3 abstractC1178g3 = x92.f7708C;
        F2 f22 = x92.f7709D;
        F2 f23 = x92.f7710E;
        List<Ub> list8 = x92.f7711F;
        List<Vb> list9 = x92.f7712G;
        List<AbstractC1142dc> list10 = x92.f7713H;
        A7.b<EnumC1356sc> visibility = x92.f7714I;
        C1370tc c1370tc = x92.f7715J;
        List<C1370tc> list11 = x92.f7716K;
        C9 c94 = x92.f7717L;
        x92.getClass();
        kotlin.jvm.internal.l.f(alpha, "alpha");
        kotlin.jvm.internal.l.f(clipToBounds, "clipToBounds");
        kotlin.jvm.internal.l.f(transitionAnimationSelector, "transitionAnimationSelector");
        kotlin.jvm.internal.l.f(visibility, "visibility");
        return new X9(c1130d0, bVar, bVar2, alpha, list, list2, x22, clipToBounds, bVar3, bVar4, list3, str5, list4, z42, list5, c92, str3, l62, c1362t4, c1362t42, bVar5, bVar6, list6, str6, arrayList, list7, qb, transitionAnimationSelector, abstractC1178g3, f22, f23, list8, list9, list10, visibility, c1370tc, list11, c94);
    }

    @Override // N7.S2
    public final Z4 A() {
        return this.f7732n;
    }

    @Override // N7.S2
    public final F2 B() {
        return this.f7710E;
    }

    @Override // N7.S2
    public final AbstractC1178g3 C() {
        return this.f7708C;
    }

    /* JADX WARN: Removed duplicated region for block: B:262:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x03e6 A[LOOP:11: B:256:0x033e->B:311:0x03e6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:316:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x0334 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean D(N7.X9 r12, A7.d r13, A7.d r14) {
        /*
            Method dump skipped, instructions count: 1488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N7.X9.D(N7.X9, A7.d, A7.d):boolean");
    }

    public final int E() {
        int iB;
        int iB2;
        int iJ;
        int iB3;
        int iB4;
        int iB5;
        int iB6;
        int iB7;
        int iB8;
        Integer num = this.f7718M;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.x.a(X9.class).hashCode();
        int iJ2 = 0;
        C1130d0 c1130d0 = this.f7720a;
        int iB9 = iHashCode + (c1130d0 != null ? c1130d0.b() : 0);
        A7.b<EnumC1305p2> bVar = this.f7721b;
        int iHashCode2 = iB9 + (bVar != null ? bVar.hashCode() : 0);
        A7.b<EnumC1319q2> bVar2 = this.f7722c;
        int iHashCode3 = this.f7723d.hashCode() + iHashCode2 + (bVar2 != null ? bVar2.hashCode() : 0);
        List<AbstractC1402w2> list = this.f7724e;
        if (list != null) {
            Iterator<T> it = list.iterator();
            iB = 0;
            while (it.hasNext()) {
                iB += ((AbstractC1402w2) it.next()).b();
            }
        } else {
            iB = 0;
        }
        int i = iHashCode3 + iB;
        List<N2> list2 = this.f7725f;
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
        X2 x22 = this.f7726g;
        int iHashCode4 = this.f7727h.hashCode() + i10 + (x22 != null ? x22.b() : 0);
        A7.b<Long> bVar3 = this.i;
        int iHashCode5 = iHashCode4 + (bVar3 != null ? bVar3.hashCode() : 0);
        A7.b<String> bVar4 = this.f7728j;
        int iHashCode6 = iHashCode5 + (bVar4 != null ? bVar4.hashCode() : 0);
        List<C1179g4> list3 = this.f7729k;
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
        String str = this.f7730l;
        int iHashCode7 = i11 + (str != null ? str.hashCode() : 0);
        List<C1418x4> list4 = this.f7731m;
        if (list4 != null) {
            Iterator<T> it4 = list4.iterator();
            iB3 = 0;
            while (it4.hasNext()) {
                iB3 += ((C1418x4) it4.next()).b();
            }
        } else {
            iB3 = 0;
        }
        int i12 = iHashCode7 + iB3;
        Z4 z42 = this.f7732n;
        int iB10 = i12 + (z42 != null ? z42.b() : 0);
        List<C1210i5> list5 = this.f7733o;
        if (list5 != null) {
            Iterator<T> it5 = list5.iterator();
            iB4 = 0;
            while (it5.hasNext()) {
                iB4 += ((C1210i5) it5.next()).b();
            }
        } else {
            iB4 = 0;
        }
        int iB11 = this.f7734p.b() + iB10 + iB4;
        String str2 = this.f7735q;
        int iHashCode8 = iB11 + (str2 != null ? str2.hashCode() : 0);
        L6 l62 = this.f7736r;
        int iB12 = iHashCode8 + (l62 != null ? l62.b() : 0);
        C1362t4 c1362t4 = this.f7737s;
        int iB13 = iB12 + (c1362t4 != null ? c1362t4.b() : 0);
        C1362t4 c1362t42 = this.f7738t;
        int iB14 = iB13 + (c1362t42 != null ? c1362t42.b() : 0);
        A7.b<String> bVar5 = this.f7739u;
        int iHashCode9 = iB14 + (bVar5 != null ? bVar5.hashCode() : 0);
        A7.b<Long> bVar6 = this.f7740v;
        int iHashCode10 = iHashCode9 + (bVar6 != null ? bVar6.hashCode() : 0);
        List<C1175g0> list6 = this.f7741w;
        if (list6 != null) {
            Iterator<T> it6 = list6.iterator();
            iB5 = 0;
            while (it6.hasNext()) {
                iB5 += ((C1175g0) it6.next()).b();
            }
        } else {
            iB5 = 0;
        }
        int i13 = iHashCode10 + iB5;
        String str3 = this.f7742x;
        int iHashCode11 = i13 + (str3 != null ? str3.hashCode() : 0);
        List<C1439yb> list7 = this.f7744z;
        if (list7 != null) {
            Iterator<T> it7 = list7.iterator();
            iB6 = 0;
            while (it7.hasNext()) {
                iB6 += ((C1439yb) it7.next()).b();
            }
        } else {
            iB6 = 0;
        }
        int i14 = iHashCode11 + iB6;
        Qb qb = this.f7706A;
        int iHashCode12 = this.f7707B.hashCode() + i14 + (qb != null ? qb.b() : 0);
        AbstractC1178g3 abstractC1178g3 = this.f7708C;
        int iB15 = iHashCode12 + (abstractC1178g3 != null ? abstractC1178g3.b() : 0);
        F2 f22 = this.f7709D;
        int iB16 = iB15 + (f22 != null ? f22.b() : 0);
        F2 f23 = this.f7710E;
        int iB17 = iB16 + (f23 != null ? f23.b() : 0);
        List<Ub> list8 = this.f7711F;
        int iHashCode13 = iB17 + (list8 != null ? list8.hashCode() : 0);
        List<Vb> list9 = this.f7712G;
        if (list9 != null) {
            Iterator<T> it8 = list9.iterator();
            iB7 = 0;
            while (it8.hasNext()) {
                iB7 += ((Vb) it8.next()).b();
            }
        } else {
            iB7 = 0;
        }
        int i15 = iHashCode13 + iB7;
        List<AbstractC1142dc> list10 = this.f7713H;
        if (list10 != null) {
            Iterator<T> it9 = list10.iterator();
            iB8 = 0;
            while (it9.hasNext()) {
                iB8 += ((AbstractC1142dc) it9.next()).b();
            }
        } else {
            iB8 = 0;
        }
        int iHashCode14 = this.f7714I.hashCode() + i15 + iB8;
        C1370tc c1370tc = this.f7715J;
        int iJ3 = iHashCode14 + (c1370tc != null ? c1370tc.j() : 0);
        List<C1370tc> list11 = this.f7716K;
        if (list11 != null) {
            Iterator<T> it10 = list11.iterator();
            while (it10.hasNext()) {
                iJ2 += ((C1370tc) it10.next()).j();
            }
        }
        int iB18 = this.f7717L.b() + iJ3 + iJ2;
        this.f7718M = Integer.valueOf(iB18);
        return iB18;
    }

    @Override // N7.S2
    public final List<N2> b() {
        return this.f7725f;
    }

    @Override // N7.S2
    public final List<C1179g4> c() {
        return this.f7729k;
    }

    @Override // N7.S2
    public final Qb d() {
        return this.f7706A;
    }

    @Override // N7.S2
    public final List<C1370tc> e() {
        return this.f7716K;
    }

    @Override // N7.S2
    public final C1130d0 f() {
        return this.f7720a;
    }

    @Override // N7.S2
    public final A7.b<Long> g() {
        return this.i;
    }

    @Override // N7.S2
    public final List<C1418x4> getExtensions() {
        return this.f7731m;
    }

    @Override // N7.S2
    public final C9 getHeight() {
        return this.f7734p;
    }

    @Override // N7.S2
    public final String getId() {
        return this.f7735q;
    }

    @Override // N7.S2
    public final A7.b<EnumC1356sc> getVisibility() {
        return this.f7714I;
    }

    @Override // N7.S2
    public final C9 getWidth() {
        return this.f7717L;
    }

    @Override // N7.S2
    public final List<AbstractC1142dc> h() {
        return this.f7713H;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((Y9.e) D7.a.f1071b.f6805k7.getValue()).b(D7.a.f1070a, this);
    }

    @Override // N7.S2
    public final C1362t4 j() {
        return this.f7737s;
    }

    @Override // N7.S2
    public final A7.b<Long> k() {
        return this.f7740v;
    }

    @Override // N7.S2
    public final C1362t4 l() {
        return this.f7738t;
    }

    @Override // N7.S2
    public final List<Ub> m() {
        return this.f7711F;
    }

    @Override // N7.S2
    public final List<C1175g0> n() {
        return this.f7741w;
    }

    @Override // N7.S2
    public final A7.b<EnumC1305p2> o() {
        return this.f7721b;
    }

    @Override // N7.S2
    public final L6 p() {
        return this.f7736r;
    }

    @Override // N7.S2
    public final A7.b<String> q() {
        return this.f7739u;
    }

    @Override // N7.S2
    public final List<Vb> r() {
        return this.f7712G;
    }

    @Override // N7.S2
    public final List<C1439yb> s() {
        return this.f7744z;
    }

    @Override // N7.S2
    public final C1370tc t() {
        return this.f7715J;
    }

    @Override // N7.S2
    public final List<C1210i5> u() {
        return this.f7733o;
    }

    @Override // N7.S2
    public final A7.b<EnumC1319q2> v() {
        return this.f7722c;
    }

    @Override // N7.S2
    public final F2 w() {
        return this.f7709D;
    }

    @Override // N7.S2
    public final List<AbstractC1402w2> x() {
        return this.f7724e;
    }

    @Override // N7.S2
    public final A7.b<Double> y() {
        return this.f7723d;
    }

    @Override // N7.S2
    public final X2 z() {
        return this.f7726g;
    }
}
