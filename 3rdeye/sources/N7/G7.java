package N7;

import A7.b;
import N7.AbstractC1393v7;
import N7.C9;
import N7.I7;
import N7.J7;
import com.singular.sdk.internal.Constants;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivPager.kt */
/* loaded from: classes.dex */
public final class G7 implements InterfaceC5868a, S2 {

    /* renamed from: A, reason: collision with root package name */
    public final A7.b<Boolean> f5327A;

    /* renamed from: B, reason: collision with root package name */
    public final A7.b<String> f5328B;

    /* renamed from: C, reason: collision with root package name */
    public final A7.b<Long> f5329C;

    /* renamed from: D, reason: collision with root package name */
    public final A7.b<a> f5330D;

    /* renamed from: E, reason: collision with root package name */
    public final List<C1175g0> f5331E;

    /* renamed from: F, reason: collision with root package name */
    public final List<C1439yb> f5332F;

    /* renamed from: G, reason: collision with root package name */
    public final Qb f5333G;

    /* renamed from: H, reason: collision with root package name */
    public final AbstractC1178g3 f5334H;

    /* renamed from: I, reason: collision with root package name */
    public final F2 f5335I;

    /* renamed from: J, reason: collision with root package name */
    public final F2 f5336J;

    /* renamed from: K, reason: collision with root package name */
    public final List<Ub> f5337K;

    /* renamed from: L, reason: collision with root package name */
    public final List<Vb> f5338L;

    /* renamed from: M, reason: collision with root package name */
    public final List<AbstractC1142dc> f5339M;

    /* renamed from: N, reason: collision with root package name */
    public final A7.b<EnumC1356sc> f5340N;

    /* renamed from: O, reason: collision with root package name */
    public final C1370tc f5341O;

    /* renamed from: P, reason: collision with root package name */
    public final List<C1370tc> f5342P;

    /* renamed from: Q, reason: collision with root package name */
    public final C9 f5343Q;

    /* renamed from: R, reason: collision with root package name */
    public Integer f5344R;

    /* renamed from: S, reason: collision with root package name */
    public Integer f5345S;

    /* renamed from: a, reason: collision with root package name */
    public final C1130d0 f5346a;

    /* renamed from: b, reason: collision with root package name */
    public final A7.b<EnumC1305p2> f5347b;

    /* renamed from: c, reason: collision with root package name */
    public final A7.b<EnumC1319q2> f5348c;

    /* renamed from: d, reason: collision with root package name */
    public final A7.b<Double> f5349d;

    /* renamed from: e, reason: collision with root package name */
    public final List<AbstractC1402w2> f5350e;

    /* renamed from: f, reason: collision with root package name */
    public final List<N2> f5351f;

    /* renamed from: g, reason: collision with root package name */
    public final X2 f5352g;

    /* renamed from: h, reason: collision with root package name */
    public final A7.b<Long> f5353h;
    public final A7.b<a> i;

    /* renamed from: j, reason: collision with root package name */
    public final A7.b<Long> f5354j;

    /* renamed from: k, reason: collision with root package name */
    public final List<C1179g4> f5355k;

    /* renamed from: l, reason: collision with root package name */
    public final List<C1418x4> f5356l;

    /* renamed from: m, reason: collision with root package name */
    public final Z4 f5357m;

    /* renamed from: n, reason: collision with root package name */
    public final List<C1210i5> f5358n;

    /* renamed from: o, reason: collision with root package name */
    public final C9 f5359o;

    /* renamed from: p, reason: collision with root package name */
    public final String f5360p;

    /* renamed from: q, reason: collision with root package name */
    public final A7.b<Boolean> f5361q;

    /* renamed from: r, reason: collision with root package name */
    public final C1333r3 f5362r;

    /* renamed from: s, reason: collision with root package name */
    public final W4 f5363s;

    /* renamed from: t, reason: collision with root package name */
    public final List<Z> f5364t;

    /* renamed from: u, reason: collision with root package name */
    public final J7 f5365u;

    /* renamed from: v, reason: collision with root package name */
    public final L6 f5366v;

    /* renamed from: w, reason: collision with root package name */
    public final C1362t4 f5367w;

    /* renamed from: x, reason: collision with root package name */
    public final A7.b<b> f5368x;

    /* renamed from: y, reason: collision with root package name */
    public final C1362t4 f5369y;

    /* renamed from: z, reason: collision with root package name */
    public final AbstractC1393v7 f5370z;

    /* compiled from: DivPager.kt */
    public enum a {
        START("start"),
        CENTER("center"),
        END("end");

        private final String value;
        public static final c Converter = new c();
        public static final p9.l<a, String> TO_STRING = b.f5372g;
        public static final p9.l<String, a> FROM_STRING = C0083a.f5371g;

        /* compiled from: DivPager.kt */
        /* renamed from: N7.G7$a$a, reason: collision with other inner class name */
        public static final class C0083a extends kotlin.jvm.internal.m implements p9.l<String, a> {

            /* renamed from: g, reason: collision with root package name */
            public static final C0083a f5371g = new C0083a(1);

            @Override // p9.l
            public final a invoke(String str) {
                String value = str;
                kotlin.jvm.internal.l.f(value, "value");
                a.Converter.getClass();
                a aVar = a.START;
                if (value.equals(aVar.value)) {
                    return aVar;
                }
                a aVar2 = a.CENTER;
                if (value.equals(aVar2.value)) {
                    return aVar2;
                }
                a aVar3 = a.END;
                if (value.equals(aVar3.value)) {
                    return aVar3;
                }
                return null;
            }
        }

        /* compiled from: DivPager.kt */
        public static final class b extends kotlin.jvm.internal.m implements p9.l<a, String> {

            /* renamed from: g, reason: collision with root package name */
            public static final b f5372g = new b(1);

            @Override // p9.l
            public final String invoke(a aVar) {
                a value = aVar;
                kotlin.jvm.internal.l.f(value, "value");
                a.Converter.getClass();
                return value.value;
            }
        }

        /* compiled from: DivPager.kt */
        public static final class c {
        }

        a(String str) {
            this.value = str;
        }
    }

    /* compiled from: DivPager.kt */
    public enum b {
        HORIZONTAL("horizontal"),
        VERTICAL("vertical");

        private final String value;
        public static final c Converter = new c();
        public static final p9.l<b, String> TO_STRING = C0084b.f5374g;
        public static final p9.l<String, b> FROM_STRING = a.f5373g;

        /* compiled from: DivPager.kt */
        public static final class a extends kotlin.jvm.internal.m implements p9.l<String, b> {

            /* renamed from: g, reason: collision with root package name */
            public static final a f5373g = new a(1);

            @Override // p9.l
            public final b invoke(String str) {
                String value = str;
                kotlin.jvm.internal.l.f(value, "value");
                b.Converter.getClass();
                b bVar = b.HORIZONTAL;
                if (value.equals(bVar.value)) {
                    return bVar;
                }
                b bVar2 = b.VERTICAL;
                if (value.equals(bVar2.value)) {
                    return bVar2;
                }
                return null;
            }
        }

        /* compiled from: DivPager.kt */
        /* renamed from: N7.G7$b$b, reason: collision with other inner class name */
        public static final class C0084b extends kotlin.jvm.internal.m implements p9.l<b, String> {

            /* renamed from: g, reason: collision with root package name */
            public static final C0084b f5374g = new C0084b(1);

            @Override // p9.l
            public final String invoke(b bVar) {
                b value = bVar;
                kotlin.jvm.internal.l.f(value, "value");
                b.Converter.getClass();
                return value.value;
            }
        }

        /* compiled from: DivPager.kt */
        public static final class c {
        }

        b(String str) {
            this.value = str;
        }
    }

    static {
        b.a.a(Double.valueOf(1.0d));
        b.a.a(a.START);
        b.a.a(0L);
        new C9.c(new C1412wc(null, null, null));
        Boolean bool = Boolean.FALSE;
        b.a.a(bool);
        new W4(b.a.a(0L));
        b.a.a(b.HORIZONTAL);
        b.a.a(bool);
        b.a.a(a.CENTER);
        b.a.a(EnumC1356sc.VISIBLE);
        new C9.b(new V6(null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public G7(C1130d0 c1130d0, A7.b<EnumC1305p2> bVar, A7.b<EnumC1319q2> bVar2, A7.b<Double> alpha, List<? extends AbstractC1402w2> list, List<? extends N2> list2, X2 x22, A7.b<Long> bVar3, A7.b<a> crossAxisAlignment, A7.b<Long> defaultItem, List<C1179g4> list3, List<C1418x4> list4, Z4 z42, List<C1210i5> list5, C9 c92, String str, A7.b<Boolean> infiniteScroll, C1333r3 c1333r3, W4 w42, List<? extends Z> list6, J7 j72, L6 l62, C1362t4 c1362t4, A7.b<b> orientation, C1362t4 c1362t42, AbstractC1393v7 abstractC1393v7, A7.b<Boolean> restrictParentScroll, A7.b<String> bVar4, A7.b<Long> bVar5, A7.b<a> scrollAxisAlignment, List<C1175g0> list7, List<C1439yb> list8, Qb qb, AbstractC1178g3 abstractC1178g3, F2 f22, F2 f23, List<? extends Ub> list9, List<Vb> list10, List<? extends AbstractC1142dc> list11, A7.b<EnumC1356sc> visibility, C1370tc c1370tc, List<C1370tc> list12, C9 c93) {
        kotlin.jvm.internal.l.f(alpha, "alpha");
        kotlin.jvm.internal.l.f(crossAxisAlignment, "crossAxisAlignment");
        kotlin.jvm.internal.l.f(defaultItem, "defaultItem");
        kotlin.jvm.internal.l.f(infiniteScroll, "infiniteScroll");
        kotlin.jvm.internal.l.f(orientation, "orientation");
        kotlin.jvm.internal.l.f(restrictParentScroll, "restrictParentScroll");
        kotlin.jvm.internal.l.f(scrollAxisAlignment, "scrollAxisAlignment");
        kotlin.jvm.internal.l.f(visibility, "visibility");
        this.f5346a = c1130d0;
        this.f5347b = bVar;
        this.f5348c = bVar2;
        this.f5349d = alpha;
        this.f5350e = list;
        this.f5351f = list2;
        this.f5352g = x22;
        this.f5353h = bVar3;
        this.i = crossAxisAlignment;
        this.f5354j = defaultItem;
        this.f5355k = list3;
        this.f5356l = list4;
        this.f5357m = z42;
        this.f5358n = list5;
        this.f5359o = c92;
        this.f5360p = str;
        this.f5361q = infiniteScroll;
        this.f5362r = c1333r3;
        this.f5363s = w42;
        this.f5364t = list6;
        this.f5365u = j72;
        this.f5366v = l62;
        this.f5367w = c1362t4;
        this.f5368x = orientation;
        this.f5369y = c1362t42;
        this.f5370z = abstractC1393v7;
        this.f5327A = restrictParentScroll;
        this.f5328B = bVar4;
        this.f5329C = bVar5;
        this.f5330D = scrollAxisAlignment;
        this.f5331E = list7;
        this.f5332F = list8;
        this.f5333G = qb;
        this.f5334H = abstractC1178g3;
        this.f5335I = f22;
        this.f5336J = f23;
        this.f5337K = list9;
        this.f5338L = list10;
        this.f5339M = list11;
        this.f5340N = visibility;
        this.f5341O = c1370tc;
        this.f5342P = list12;
        this.f5343Q = c93;
    }

    public static G7 a(G7 g72, String str, List list, int i) {
        C1130d0 c1130d0;
        C1130d0 c1130d02 = g72.f5346a;
        A7.b<EnumC1305p2> bVar = g72.f5347b;
        A7.b<EnumC1319q2> bVar2 = g72.f5348c;
        A7.b<Double> alpha = g72.f5349d;
        List<AbstractC1402w2> list2 = g72.f5350e;
        List<N2> list3 = g72.f5351f;
        X2 x22 = g72.f5352g;
        A7.b<Long> bVar3 = g72.f5353h;
        A7.b<a> crossAxisAlignment = g72.i;
        A7.b<Long> defaultItem = g72.f5354j;
        List<C1179g4> list4 = g72.f5355k;
        List<C1418x4> list5 = g72.f5356l;
        Z4 z42 = g72.f5357m;
        List<C1210i5> list6 = g72.f5358n;
        C9 c92 = g72.f5359o;
        if ((i & Constants.QUEUE_ELEMENT_MAX_SIZE) != 0) {
            c1130d0 = c1130d02;
            str = g72.f5360p;
        } else {
            c1130d0 = c1130d02;
        }
        A7.b<Boolean> infiniteScroll = g72.f5361q;
        C1333r3 c1333r3 = g72.f5362r;
        W4 w42 = g72.f5363s;
        J7 j72 = g72.f5365u;
        L6 l62 = g72.f5366v;
        C1362t4 c1362t4 = g72.f5367w;
        A7.b<b> orientation = g72.f5368x;
        C1362t4 c1362t42 = g72.f5369y;
        AbstractC1393v7 abstractC1393v7 = g72.f5370z;
        A7.b<Boolean> restrictParentScroll = g72.f5327A;
        A7.b<String> bVar4 = g72.f5328B;
        A7.b<Long> bVar5 = g72.f5329C;
        A7.b<a> scrollAxisAlignment = g72.f5330D;
        List<C1175g0> list7 = g72.f5331E;
        List<C1439yb> list8 = g72.f5332F;
        Qb qb = g72.f5333G;
        AbstractC1178g3 abstractC1178g3 = g72.f5334H;
        F2 f22 = g72.f5335I;
        F2 f23 = g72.f5336J;
        List<Ub> list9 = g72.f5337K;
        List<Vb> list10 = g72.f5338L;
        List<AbstractC1142dc> list11 = g72.f5339M;
        A7.b<EnumC1356sc> visibility = g72.f5340N;
        C1370tc c1370tc = g72.f5341O;
        List<C1370tc> list12 = g72.f5342P;
        C9 c93 = g72.f5343Q;
        g72.getClass();
        kotlin.jvm.internal.l.f(alpha, "alpha");
        kotlin.jvm.internal.l.f(crossAxisAlignment, "crossAxisAlignment");
        kotlin.jvm.internal.l.f(defaultItem, "defaultItem");
        kotlin.jvm.internal.l.f(infiniteScroll, "infiniteScroll");
        kotlin.jvm.internal.l.f(orientation, "orientation");
        kotlin.jvm.internal.l.f(restrictParentScroll, "restrictParentScroll");
        kotlin.jvm.internal.l.f(scrollAxisAlignment, "scrollAxisAlignment");
        kotlin.jvm.internal.l.f(visibility, "visibility");
        return new G7(c1130d0, bVar, bVar2, alpha, list2, list3, x22, bVar3, crossAxisAlignment, defaultItem, list4, list5, z42, list6, c92, str, infiniteScroll, c1333r3, w42, list, j72, l62, c1362t4, orientation, c1362t42, abstractC1393v7, restrictParentScroll, bVar4, bVar5, scrollAxisAlignment, list7, list8, qb, abstractC1178g3, f22, f23, list9, list10, list11, visibility, c1370tc, list12, c93);
    }

    @Override // N7.S2
    public final Z4 A() {
        return this.f5357m;
    }

    @Override // N7.S2
    public final F2 B() {
        return this.f5336J;
    }

    @Override // N7.S2
    public final AbstractC1178g3 C() {
        return this.f5334H;
    }

    /* JADX WARN: Removed duplicated region for block: B:221:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x04ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean D(N7.G7 r10, A7.d r11, A7.d r12) {
        /*
            Method dump skipped, instructions count: 1909
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N7.G7.D(N7.G7, A7.d, A7.d):boolean");
    }

    public final int E() {
        int iB;
        int iB2;
        int iJ;
        int iB3;
        int iB4;
        int iHashCode;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        int iB5;
        int iB6;
        int iB7;
        int iB8;
        int iHashCode2;
        int iIntValue5;
        Integer num = this.f5344R;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode3 = kotlin.jvm.internal.x.a(G7.class).hashCode();
        int iJ2 = 0;
        C1130d0 c1130d0 = this.f5346a;
        int iB9 = iHashCode3 + (c1130d0 != null ? c1130d0.b() : 0);
        A7.b<EnumC1305p2> bVar = this.f5347b;
        int iHashCode4 = iB9 + (bVar != null ? bVar.hashCode() : 0);
        A7.b<EnumC1319q2> bVar2 = this.f5348c;
        int iHashCode5 = this.f5349d.hashCode() + iHashCode4 + (bVar2 != null ? bVar2.hashCode() : 0);
        List<AbstractC1402w2> list = this.f5350e;
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
        List<N2> list2 = this.f5351f;
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
        X2 x22 = this.f5352g;
        int iB10 = i10 + (x22 != null ? x22.b() : 0);
        A7.b<Long> bVar3 = this.f5353h;
        int iHashCode6 = this.f5354j.hashCode() + this.i.hashCode() + iB10 + (bVar3 != null ? bVar3.hashCode() : 0);
        List<C1179g4> list3 = this.f5355k;
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
        List<C1418x4> list4 = this.f5356l;
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
        Z4 z42 = this.f5357m;
        int iB11 = i12 + (z42 != null ? z42.b() : 0);
        List<C1210i5> list5 = this.f5358n;
        if (list5 != null) {
            Iterator<T> it5 = list5.iterator();
            iB4 = 0;
            while (it5.hasNext()) {
                iB4 += ((C1210i5) it5.next()).b();
            }
        } else {
            iB4 = 0;
        }
        int iB12 = this.f5359o.b() + iB11 + iB4;
        String str = this.f5360p;
        int iHashCode7 = this.f5361q.hashCode() + iB12 + (str != null ? str.hashCode() : 0);
        C1333r3 c1333r3 = this.f5362r;
        int iB13 = this.f5363s.b() + iHashCode7 + (c1333r3 != null ? c1333r3.b() : 0);
        J7 j72 = this.f5365u;
        Integer num2 = j72.f5572a;
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        } else {
            int iHashCode8 = kotlin.jvm.internal.x.a(j72.getClass()).hashCode();
            if (j72 instanceof J7.c) {
                C1324q7 c1324q7 = ((J7.c) j72).f5575b;
                Integer num3 = c1324q7.f8991b;
                if (num3 != null) {
                    iIntValue = num3.intValue();
                    int i13 = iHashCode8 + iIntValue;
                    j72.f5572a = Integer.valueOf(i13);
                    iIntValue2 = i13;
                } else {
                    int iHashCode9 = kotlin.jvm.internal.x.a(C1324q7.class).hashCode();
                    V7 v72 = c1324q7.f8990a;
                    Integer num4 = v72.f7576b;
                    if (num4 != null) {
                        iIntValue3 = num4.intValue();
                    } else {
                        int iHashCode10 = kotlin.jvm.internal.x.a(V7.class).hashCode() + v72.f7575a.hashCode();
                        v72.f7576b = Integer.valueOf(iHashCode10);
                        iIntValue3 = iHashCode10;
                    }
                    iHashCode = iHashCode9 + iIntValue3;
                    c1324q7.f8991b = Integer.valueOf(iHashCode);
                    iIntValue = iHashCode;
                    int i132 = iHashCode8 + iIntValue;
                    j72.f5572a = Integer.valueOf(i132);
                    iIntValue2 = i132;
                }
            } else {
                if (j72 instanceof J7.a) {
                    Y6 y62 = ((J7.a) j72).f5573b;
                    Integer num5 = y62.f7772b;
                    if (num5 != null) {
                        iIntValue = num5.intValue();
                    } else {
                        int iB14 = y62.f7771a.b() + kotlin.jvm.internal.x.a(Y6.class).hashCode();
                        y62.f7772b = Integer.valueOf(iB14);
                        iIntValue = iB14;
                    }
                } else {
                    if (!(j72 instanceof J7.b)) {
                        throw new b9.j();
                    }
                    C1254l7 c1254l7 = ((J7.b) j72).f5574b;
                    Integer num6 = c1254l7.f8732a;
                    if (num6 != null) {
                        iIntValue = num6.intValue();
                    } else {
                        iHashCode = kotlin.jvm.internal.x.a(C1254l7.class).hashCode();
                        c1254l7.f8732a = Integer.valueOf(iHashCode);
                        iIntValue = iHashCode;
                    }
                }
                int i1322 = iHashCode8 + iIntValue;
                j72.f5572a = Integer.valueOf(i1322);
                iIntValue2 = i1322;
            }
        }
        int i14 = iIntValue2 + iB13;
        L6 l62 = this.f5366v;
        int iB15 = i14 + (l62 != null ? l62.b() : 0);
        C1362t4 c1362t4 = this.f5367w;
        int iHashCode11 = this.f5368x.hashCode() + iB15 + (c1362t4 != null ? c1362t4.b() : 0);
        C1362t4 c1362t42 = this.f5369y;
        int iB16 = iHashCode11 + (c1362t42 != null ? c1362t42.b() : 0);
        AbstractC1393v7 abstractC1393v7 = this.f5370z;
        if (abstractC1393v7 != null) {
            Integer num7 = abstractC1393v7.f9624a;
            if (num7 != null) {
                iIntValue4 = num7.intValue();
            } else {
                int iHashCode12 = kotlin.jvm.internal.x.a(abstractC1393v7.getClass()).hashCode();
                if (abstractC1393v7 instanceof AbstractC1393v7.b) {
                    C7 c72 = ((AbstractC1393v7.b) abstractC1393v7).f9626b;
                    Integer num8 = c72.f5040f;
                    if (num8 != null) {
                        iIntValue5 = num8.intValue();
                        int i15 = iHashCode12 + iIntValue5;
                        abstractC1393v7.f9624a = Integer.valueOf(i15);
                        iIntValue4 = i15;
                    } else {
                        iHashCode2 = c72.f5038d.hashCode() + c72.f5037c.hashCode() + c72.f5036b.hashCode() + c72.f5035a.hashCode() + kotlin.jvm.internal.x.a(C7.class).hashCode() + c72.f5039e.hashCode();
                        c72.f5040f = Integer.valueOf(iHashCode2);
                        iIntValue5 = iHashCode2;
                        int i152 = iHashCode12 + iIntValue5;
                        abstractC1393v7.f9624a = Integer.valueOf(i152);
                        iIntValue4 = i152;
                    }
                } else {
                    if (!(abstractC1393v7 instanceof AbstractC1393v7.a)) {
                        throw new b9.j();
                    }
                    C1449z7 c1449z7 = ((AbstractC1393v7.a) abstractC1393v7).f9625b;
                    Integer num9 = c1449z7.f10101g;
                    if (num9 != null) {
                        iIntValue5 = num9.intValue();
                        int i1522 = iHashCode12 + iIntValue5;
                        abstractC1393v7.f9624a = Integer.valueOf(i1522);
                        iIntValue4 = i1522;
                    } else {
                        iHashCode2 = c1449z7.f10100f.hashCode() + c1449z7.f10099e.hashCode() + c1449z7.f10098d.hashCode() + c1449z7.f10097c.hashCode() + c1449z7.f10096b.hashCode() + c1449z7.f10095a.hashCode() + kotlin.jvm.internal.x.a(C1449z7.class).hashCode();
                        c1449z7.f10101g = Integer.valueOf(iHashCode2);
                        iIntValue5 = iHashCode2;
                        int i15222 = iHashCode12 + iIntValue5;
                        abstractC1393v7.f9624a = Integer.valueOf(i15222);
                        iIntValue4 = i15222;
                    }
                }
            }
        } else {
            iIntValue4 = 0;
        }
        int iHashCode13 = this.f5327A.hashCode() + iB16 + iIntValue4;
        A7.b<String> bVar4 = this.f5328B;
        int iHashCode14 = iHashCode13 + (bVar4 != null ? bVar4.hashCode() : 0);
        A7.b<Long> bVar5 = this.f5329C;
        int iHashCode15 = this.f5330D.hashCode() + iHashCode14 + (bVar5 != null ? bVar5.hashCode() : 0);
        List<C1175g0> list6 = this.f5331E;
        if (list6 != null) {
            Iterator<T> it6 = list6.iterator();
            iB5 = 0;
            while (it6.hasNext()) {
                iB5 += ((C1175g0) it6.next()).b();
            }
        } else {
            iB5 = 0;
        }
        int i16 = iHashCode15 + iB5;
        List<C1439yb> list7 = this.f5332F;
        if (list7 != null) {
            Iterator<T> it7 = list7.iterator();
            iB6 = 0;
            while (it7.hasNext()) {
                iB6 += ((C1439yb) it7.next()).b();
            }
        } else {
            iB6 = 0;
        }
        int i17 = i16 + iB6;
        Qb qb = this.f5333G;
        int iB17 = i17 + (qb != null ? qb.b() : 0);
        AbstractC1178g3 abstractC1178g3 = this.f5334H;
        int iB18 = iB17 + (abstractC1178g3 != null ? abstractC1178g3.b() : 0);
        F2 f22 = this.f5335I;
        int iB19 = iB18 + (f22 != null ? f22.b() : 0);
        F2 f23 = this.f5336J;
        int iB20 = iB19 + (f23 != null ? f23.b() : 0);
        List<Ub> list8 = this.f5337K;
        int iHashCode16 = iB20 + (list8 != null ? list8.hashCode() : 0);
        List<Vb> list9 = this.f5338L;
        if (list9 != null) {
            Iterator<T> it8 = list9.iterator();
            iB7 = 0;
            while (it8.hasNext()) {
                iB7 += ((Vb) it8.next()).b();
            }
        } else {
            iB7 = 0;
        }
        int i18 = iHashCode16 + iB7;
        List<AbstractC1142dc> list10 = this.f5339M;
        if (list10 != null) {
            Iterator<T> it9 = list10.iterator();
            iB8 = 0;
            while (it9.hasNext()) {
                iB8 += ((AbstractC1142dc) it9.next()).b();
            }
        } else {
            iB8 = 0;
        }
        int iHashCode17 = this.f5340N.hashCode() + i18 + iB8;
        C1370tc c1370tc = this.f5341O;
        int iJ3 = iHashCode17 + (c1370tc != null ? c1370tc.j() : 0);
        List<C1370tc> list11 = this.f5342P;
        if (list11 != null) {
            Iterator<T> it10 = list11.iterator();
            while (it10.hasNext()) {
                iJ2 += ((C1370tc) it10.next()).j();
            }
        }
        int iB21 = this.f5343Q.b() + iJ3 + iJ2;
        this.f5344R = Integer.valueOf(iB21);
        return iB21;
    }

    @Override // N7.S2
    public final List<N2> b() {
        return this.f5351f;
    }

    @Override // N7.S2
    public final List<C1179g4> c() {
        return this.f5355k;
    }

    @Override // N7.S2
    public final Qb d() {
        return this.f5333G;
    }

    @Override // N7.S2
    public final List<C1370tc> e() {
        return this.f5342P;
    }

    @Override // N7.S2
    public final C1130d0 f() {
        return this.f5346a;
    }

    @Override // N7.S2
    public final A7.b<Long> g() {
        return this.f5353h;
    }

    @Override // N7.S2
    public final List<C1418x4> getExtensions() {
        return this.f5356l;
    }

    @Override // N7.S2
    public final C9 getHeight() {
        return this.f5359o;
    }

    @Override // N7.S2
    public final String getId() {
        return this.f5360p;
    }

    @Override // N7.S2
    public final A7.b<EnumC1356sc> getVisibility() {
        return this.f5340N;
    }

    @Override // N7.S2
    public final C9 getWidth() {
        return this.f5343Q;
    }

    @Override // N7.S2
    public final List<AbstractC1142dc> h() {
        return this.f5339M;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((I7.g) D7.a.f1071b.f6931w5.getValue()).b(D7.a.f1070a, this);
    }

    @Override // N7.S2
    public final C1362t4 j() {
        return this.f5367w;
    }

    @Override // N7.S2
    public final A7.b<Long> k() {
        return this.f5329C;
    }

    @Override // N7.S2
    public final C1362t4 l() {
        return this.f5369y;
    }

    @Override // N7.S2
    public final List<Ub> m() {
        return this.f5337K;
    }

    @Override // N7.S2
    public final List<C1175g0> n() {
        return this.f5331E;
    }

    @Override // N7.S2
    public final A7.b<EnumC1305p2> o() {
        return this.f5347b;
    }

    @Override // N7.S2
    public final L6 p() {
        return this.f5366v;
    }

    @Override // N7.S2
    public final A7.b<String> q() {
        return this.f5328B;
    }

    @Override // N7.S2
    public final List<Vb> r() {
        return this.f5338L;
    }

    @Override // N7.S2
    public final List<C1439yb> s() {
        return this.f5332F;
    }

    @Override // N7.S2
    public final C1370tc t() {
        return this.f5341O;
    }

    @Override // N7.S2
    public final List<C1210i5> u() {
        return this.f5358n;
    }

    @Override // N7.S2
    public final A7.b<EnumC1319q2> v() {
        return this.f5348c;
    }

    @Override // N7.S2
    public final F2 w() {
        return this.f5335I;
    }

    @Override // N7.S2
    public final List<AbstractC1402w2> x() {
        return this.f5350e;
    }

    @Override // N7.S2
    public final A7.b<Double> y() {
        return this.f5349d;
    }

    @Override // N7.S2
    public final X2 z() {
        return this.f5352g;
    }
}
