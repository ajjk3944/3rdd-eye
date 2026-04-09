package N7;

import A7.b;
import D7.a;
import N7.C1169f9;
import N7.C9;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivSelect.kt */
/* renamed from: N7.d9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1139d9 implements InterfaceC5868a, S2 {

    /* renamed from: A, reason: collision with root package name */
    public final List<a> f8077A;

    /* renamed from: B, reason: collision with root package name */
    public final C1362t4 f8078B;

    /* renamed from: C, reason: collision with root package name */
    public final A7.b<String> f8079C;

    /* renamed from: D, reason: collision with root package name */
    public final A7.b<Long> f8080D;

    /* renamed from: E, reason: collision with root package name */
    public final List<C1175g0> f8081E;

    /* renamed from: F, reason: collision with root package name */
    public final A7.b<Integer> f8082F;

    /* renamed from: G, reason: collision with root package name */
    public final List<C1439yb> f8083G;

    /* renamed from: H, reason: collision with root package name */
    public final Qb f8084H;

    /* renamed from: I, reason: collision with root package name */
    public final AbstractC1178g3 f8085I;

    /* renamed from: J, reason: collision with root package name */
    public final F2 f8086J;

    /* renamed from: K, reason: collision with root package name */
    public final F2 f8087K;

    /* renamed from: L, reason: collision with root package name */
    public final List<Ub> f8088L;

    /* renamed from: M, reason: collision with root package name */
    public final String f8089M;

    /* renamed from: N, reason: collision with root package name */
    public final List<Vb> f8090N;

    /* renamed from: O, reason: collision with root package name */
    public final List<AbstractC1142dc> f8091O;

    /* renamed from: P, reason: collision with root package name */
    public final A7.b<EnumC1356sc> f8092P;

    /* renamed from: Q, reason: collision with root package name */
    public final C1370tc f8093Q;

    /* renamed from: R, reason: collision with root package name */
    public final List<C1370tc> f8094R;

    /* renamed from: S, reason: collision with root package name */
    public final C9 f8095S;

    /* renamed from: T, reason: collision with root package name */
    public Integer f8096T;

    /* renamed from: a, reason: collision with root package name */
    public final C1130d0 f8097a;

    /* renamed from: b, reason: collision with root package name */
    public final A7.b<EnumC1305p2> f8098b;

    /* renamed from: c, reason: collision with root package name */
    public final A7.b<EnumC1319q2> f8099c;

    /* renamed from: d, reason: collision with root package name */
    public final A7.b<Double> f8100d;

    /* renamed from: e, reason: collision with root package name */
    public final List<AbstractC1402w2> f8101e;

    /* renamed from: f, reason: collision with root package name */
    public final List<N2> f8102f;

    /* renamed from: g, reason: collision with root package name */
    public final X2 f8103g;

    /* renamed from: h, reason: collision with root package name */
    public final A7.b<Long> f8104h;
    public final List<C1179g4> i;

    /* renamed from: j, reason: collision with root package name */
    public final List<C1418x4> f8105j;

    /* renamed from: k, reason: collision with root package name */
    public final Z4 f8106k;

    /* renamed from: l, reason: collision with root package name */
    public final A7.b<String> f8107l;

    /* renamed from: m, reason: collision with root package name */
    public final A7.b<Long> f8108m;

    /* renamed from: n, reason: collision with root package name */
    public final A7.b<H9> f8109n;

    /* renamed from: o, reason: collision with root package name */
    public final A7.b<JSONObject> f8110o;

    /* renamed from: p, reason: collision with root package name */
    public final A7.b<EnumC1195h5> f8111p;

    /* renamed from: q, reason: collision with root package name */
    public final A7.b<Long> f8112q;

    /* renamed from: r, reason: collision with root package name */
    public final List<C1210i5> f8113r;

    /* renamed from: s, reason: collision with root package name */
    public final C9 f8114s;

    /* renamed from: t, reason: collision with root package name */
    public final A7.b<Integer> f8115t;

    /* renamed from: u, reason: collision with root package name */
    public final A7.b<String> f8116u;

    /* renamed from: v, reason: collision with root package name */
    public final String f8117v;

    /* renamed from: w, reason: collision with root package name */
    public final L6 f8118w;

    /* renamed from: x, reason: collision with root package name */
    public final A7.b<Double> f8119x;

    /* renamed from: y, reason: collision with root package name */
    public final A7.b<Long> f8120y;

    /* renamed from: z, reason: collision with root package name */
    public final C1362t4 f8121z;

    /* compiled from: DivSelect.kt */
    /* renamed from: N7.d9$a */
    public static final class a implements InterfaceC5868a {

        /* renamed from: a, reason: collision with root package name */
        public final A7.b<String> f8122a;

        /* renamed from: b, reason: collision with root package name */
        public final A7.b<String> f8123b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f8124c;

        public a(A7.b<String> bVar, A7.b<String> bVar2) {
            this.f8122a = bVar;
            this.f8123b = bVar2;
        }

        @Override // z7.InterfaceC5868a
        public final JSONObject i() {
            C1184g9 c1184g9 = (C1184g9) D7.a.f1071b.f6412A6.getValue();
            a.C0011a context = D7.a.f1070a;
            c1184g9.getClass();
            kotlin.jvm.internal.l.f(context, "context");
            JSONObject jSONObject = new JSONObject();
            l7.b.d(context, jSONObject, "text", this.f8122a);
            l7.b.d(context, jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, this.f8123b);
            return jSONObject;
        }
    }

    static {
        b.a.a(Double.valueOf(1.0d));
        b.a.a(12L);
        b.a.a(H9.SP);
        b.a.a(EnumC1195h5.REGULAR);
        new C9.c(new C1412wc(null, null, null));
        b.a.a(1929379840);
        b.a.a(Double.valueOf(0.0d));
        b.a.a(-16777216);
        b.a.a(EnumC1356sc.VISIBLE);
        new C9.b(new V6(null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1139d9(C1130d0 c1130d0, A7.b<EnumC1305p2> bVar, A7.b<EnumC1319q2> bVar2, A7.b<Double> alpha, List<? extends AbstractC1402w2> list, List<? extends N2> list2, X2 x22, A7.b<Long> bVar3, List<C1179g4> list3, List<C1418x4> list4, Z4 z42, A7.b<String> bVar4, A7.b<Long> fontSize, A7.b<H9> fontSizeUnit, A7.b<JSONObject> bVar5, A7.b<EnumC1195h5> fontWeight, A7.b<Long> bVar6, List<C1210i5> list5, C9 c92, A7.b<Integer> hintColor, A7.b<String> bVar7, String str, L6 l62, A7.b<Double> letterSpacing, A7.b<Long> bVar8, C1362t4 c1362t4, List<a> list6, C1362t4 c1362t42, A7.b<String> bVar9, A7.b<Long> bVar10, List<C1175g0> list7, A7.b<Integer> textColor, List<C1439yb> list8, Qb qb, AbstractC1178g3 abstractC1178g3, F2 f22, F2 f23, List<? extends Ub> list9, String str2, List<Vb> list10, List<? extends AbstractC1142dc> list11, A7.b<EnumC1356sc> visibility, C1370tc c1370tc, List<C1370tc> list12, C9 c93) {
        kotlin.jvm.internal.l.f(alpha, "alpha");
        kotlin.jvm.internal.l.f(fontSize, "fontSize");
        kotlin.jvm.internal.l.f(fontSizeUnit, "fontSizeUnit");
        kotlin.jvm.internal.l.f(fontWeight, "fontWeight");
        kotlin.jvm.internal.l.f(hintColor, "hintColor");
        kotlin.jvm.internal.l.f(letterSpacing, "letterSpacing");
        kotlin.jvm.internal.l.f(textColor, "textColor");
        kotlin.jvm.internal.l.f(visibility, "visibility");
        this.f8097a = c1130d0;
        this.f8098b = bVar;
        this.f8099c = bVar2;
        this.f8100d = alpha;
        this.f8101e = list;
        this.f8102f = list2;
        this.f8103g = x22;
        this.f8104h = bVar3;
        this.i = list3;
        this.f8105j = list4;
        this.f8106k = z42;
        this.f8107l = bVar4;
        this.f8108m = fontSize;
        this.f8109n = fontSizeUnit;
        this.f8110o = bVar5;
        this.f8111p = fontWeight;
        this.f8112q = bVar6;
        this.f8113r = list5;
        this.f8114s = c92;
        this.f8115t = hintColor;
        this.f8116u = bVar7;
        this.f8117v = str;
        this.f8118w = l62;
        this.f8119x = letterSpacing;
        this.f8120y = bVar8;
        this.f8121z = c1362t4;
        this.f8077A = list6;
        this.f8078B = c1362t42;
        this.f8079C = bVar9;
        this.f8080D = bVar10;
        this.f8081E = list7;
        this.f8082F = textColor;
        this.f8083G = list8;
        this.f8084H = qb;
        this.f8085I = abstractC1178g3;
        this.f8086J = f22;
        this.f8087K = f23;
        this.f8088L = list9;
        this.f8089M = str2;
        this.f8090N = list10;
        this.f8091O = list11;
        this.f8092P = visibility;
        this.f8093Q = c1370tc;
        this.f8094R = list12;
        this.f8095S = c93;
    }

    public static C1139d9 a(C1139d9 c1139d9, String str) {
        C1130d0 c1130d0 = c1139d9.f8097a;
        A7.b<EnumC1305p2> bVar = c1139d9.f8098b;
        A7.b<EnumC1319q2> bVar2 = c1139d9.f8099c;
        A7.b<Double> alpha = c1139d9.f8100d;
        List<AbstractC1402w2> list = c1139d9.f8101e;
        List<N2> list2 = c1139d9.f8102f;
        X2 x22 = c1139d9.f8103g;
        A7.b<Long> bVar3 = c1139d9.f8104h;
        List<C1179g4> list3 = c1139d9.i;
        List<C1418x4> list4 = c1139d9.f8105j;
        Z4 z42 = c1139d9.f8106k;
        A7.b<String> bVar4 = c1139d9.f8107l;
        A7.b<Long> fontSize = c1139d9.f8108m;
        A7.b<H9> fontSizeUnit = c1139d9.f8109n;
        A7.b<JSONObject> bVar5 = c1139d9.f8110o;
        A7.b<EnumC1195h5> fontWeight = c1139d9.f8111p;
        A7.b<Long> bVar6 = c1139d9.f8112q;
        List<C1210i5> list5 = c1139d9.f8113r;
        C9 c92 = c1139d9.f8114s;
        A7.b<Integer> hintColor = c1139d9.f8115t;
        A7.b<String> bVar7 = c1139d9.f8116u;
        L6 l62 = c1139d9.f8118w;
        A7.b<Double> letterSpacing = c1139d9.f8119x;
        A7.b<Long> bVar8 = c1139d9.f8120y;
        C1362t4 c1362t4 = c1139d9.f8121z;
        List<a> list6 = c1139d9.f8077A;
        C1362t4 c1362t42 = c1139d9.f8078B;
        A7.b<String> bVar9 = c1139d9.f8079C;
        A7.b<Long> bVar10 = c1139d9.f8080D;
        List<C1175g0> list7 = c1139d9.f8081E;
        A7.b<Integer> textColor = c1139d9.f8082F;
        List<C1439yb> list8 = c1139d9.f8083G;
        Qb qb = c1139d9.f8084H;
        AbstractC1178g3 abstractC1178g3 = c1139d9.f8085I;
        F2 f22 = c1139d9.f8086J;
        F2 f23 = c1139d9.f8087K;
        List<Ub> list9 = c1139d9.f8088L;
        String str2 = c1139d9.f8089M;
        List<Vb> list10 = c1139d9.f8090N;
        List<AbstractC1142dc> list11 = c1139d9.f8091O;
        A7.b<EnumC1356sc> visibility = c1139d9.f8092P;
        C1370tc c1370tc = c1139d9.f8093Q;
        List<C1370tc> list12 = c1139d9.f8094R;
        C9 c93 = c1139d9.f8095S;
        c1139d9.getClass();
        kotlin.jvm.internal.l.f(alpha, "alpha");
        kotlin.jvm.internal.l.f(fontSize, "fontSize");
        kotlin.jvm.internal.l.f(fontSizeUnit, "fontSizeUnit");
        kotlin.jvm.internal.l.f(fontWeight, "fontWeight");
        kotlin.jvm.internal.l.f(hintColor, "hintColor");
        kotlin.jvm.internal.l.f(letterSpacing, "letterSpacing");
        kotlin.jvm.internal.l.f(textColor, "textColor");
        kotlin.jvm.internal.l.f(visibility, "visibility");
        return new C1139d9(c1130d0, bVar, bVar2, alpha, list, list2, x22, bVar3, list3, list4, z42, bVar4, fontSize, fontSizeUnit, bVar5, fontWeight, bVar6, list5, c92, hintColor, bVar7, str, l62, letterSpacing, bVar8, c1362t4, list6, c1362t42, bVar9, bVar10, list7, textColor, list8, qb, abstractC1178g3, f22, f23, list9, str2, list10, list11, visibility, c1370tc, list12, c93);
    }

    @Override // N7.S2
    public final Z4 A() {
        return this.f8106k;
    }

    @Override // N7.S2
    public final F2 B() {
        return this.f8087K;
    }

    @Override // N7.S2
    public final AbstractC1178g3 C() {
        return this.f8085I;
    }

    /* JADX WARN: Removed duplicated region for block: B:260:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x03c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean D(N7.C1139d9 r11, A7.d r12, A7.d r13) {
        /*
            Method dump skipped, instructions count: 1611
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N7.C1139d9.D(N7.d9, A7.d, A7.d):boolean");
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
        int iIntValue;
        Integer num = this.f8096T;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.x.a(C1139d9.class).hashCode();
        int iJ2 = 0;
        C1130d0 c1130d0 = this.f8097a;
        int iB9 = iHashCode + (c1130d0 != null ? c1130d0.b() : 0);
        A7.b<EnumC1305p2> bVar = this.f8098b;
        int iHashCode2 = iB9 + (bVar != null ? bVar.hashCode() : 0);
        A7.b<EnumC1319q2> bVar2 = this.f8099c;
        int iHashCode3 = this.f8100d.hashCode() + iHashCode2 + (bVar2 != null ? bVar2.hashCode() : 0);
        List<AbstractC1402w2> list = this.f8101e;
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
        List<N2> list2 = this.f8102f;
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
        X2 x22 = this.f8103g;
        int iB10 = i10 + (x22 != null ? x22.b() : 0);
        A7.b<Long> bVar3 = this.f8104h;
        int iHashCode4 = iB10 + (bVar3 != null ? bVar3.hashCode() : 0);
        List<C1179g4> list3 = this.i;
        if (list3 != null) {
            Iterator<T> it3 = list3.iterator();
            iJ = 0;
            while (it3.hasNext()) {
                iJ += ((C1179g4) it3.next()).j();
            }
        } else {
            iJ = 0;
        }
        int i11 = iHashCode4 + iJ;
        List<C1418x4> list4 = this.f8105j;
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
        Z4 z42 = this.f8106k;
        int iB11 = i12 + (z42 != null ? z42.b() : 0);
        A7.b<String> bVar4 = this.f8107l;
        int iHashCode5 = this.f8109n.hashCode() + this.f8108m.hashCode() + iB11 + (bVar4 != null ? bVar4.hashCode() : 0);
        A7.b<JSONObject> bVar5 = this.f8110o;
        int iHashCode6 = this.f8111p.hashCode() + iHashCode5 + (bVar5 != null ? bVar5.hashCode() : 0);
        A7.b<Long> bVar6 = this.f8112q;
        int iHashCode7 = iHashCode6 + (bVar6 != null ? bVar6.hashCode() : 0);
        List<C1210i5> list5 = this.f8113r;
        if (list5 != null) {
            Iterator<T> it5 = list5.iterator();
            iB4 = 0;
            while (it5.hasNext()) {
                iB4 += ((C1210i5) it5.next()).b();
            }
        } else {
            iB4 = 0;
        }
        int iHashCode8 = this.f8115t.hashCode() + this.f8114s.b() + iHashCode7 + iB4;
        A7.b<String> bVar7 = this.f8116u;
        int iHashCode9 = iHashCode8 + (bVar7 != null ? bVar7.hashCode() : 0);
        String str = this.f8117v;
        int iHashCode10 = iHashCode9 + (str != null ? str.hashCode() : 0);
        L6 l62 = this.f8118w;
        int iHashCode11 = this.f8119x.hashCode() + iHashCode10 + (l62 != null ? l62.b() : 0);
        A7.b<Long> bVar8 = this.f8120y;
        int iHashCode12 = iHashCode11 + (bVar8 != null ? bVar8.hashCode() : 0);
        C1362t4 c1362t4 = this.f8121z;
        int iB12 = iHashCode12 + (c1362t4 != null ? c1362t4.b() : 0);
        int i13 = 0;
        for (a aVar : this.f8077A) {
            Integer num2 = aVar.f8124c;
            if (num2 != null) {
                iIntValue = num2.intValue();
            } else {
                int iHashCode13 = kotlin.jvm.internal.x.a(a.class).hashCode();
                A7.b<String> bVar9 = aVar.f8122a;
                int iHashCode14 = iHashCode13 + (bVar9 != null ? bVar9.hashCode() : 0) + aVar.f8123b.hashCode();
                aVar.f8124c = Integer.valueOf(iHashCode14);
                iIntValue = iHashCode14;
            }
            i13 += iIntValue;
        }
        int i14 = iB12 + i13;
        C1362t4 c1362t42 = this.f8078B;
        int iB13 = i14 + (c1362t42 != null ? c1362t42.b() : 0);
        A7.b<String> bVar10 = this.f8079C;
        int iHashCode15 = iB13 + (bVar10 != null ? bVar10.hashCode() : 0);
        A7.b<Long> bVar11 = this.f8080D;
        int iHashCode16 = iHashCode15 + (bVar11 != null ? bVar11.hashCode() : 0);
        List<C1175g0> list6 = this.f8081E;
        if (list6 != null) {
            Iterator<T> it6 = list6.iterator();
            iB5 = 0;
            while (it6.hasNext()) {
                iB5 += ((C1175g0) it6.next()).b();
            }
        } else {
            iB5 = 0;
        }
        int iHashCode17 = this.f8082F.hashCode() + iHashCode16 + iB5;
        List<C1439yb> list7 = this.f8083G;
        if (list7 != null) {
            Iterator<T> it7 = list7.iterator();
            iB6 = 0;
            while (it7.hasNext()) {
                iB6 += ((C1439yb) it7.next()).b();
            }
        } else {
            iB6 = 0;
        }
        int i15 = iHashCode17 + iB6;
        Qb qb = this.f8084H;
        int iB14 = i15 + (qb != null ? qb.b() : 0);
        AbstractC1178g3 abstractC1178g3 = this.f8085I;
        int iB15 = iB14 + (abstractC1178g3 != null ? abstractC1178g3.b() : 0);
        F2 f22 = this.f8086J;
        int iB16 = iB15 + (f22 != null ? f22.b() : 0);
        F2 f23 = this.f8087K;
        int iB17 = iB16 + (f23 != null ? f23.b() : 0);
        List<Ub> list8 = this.f8088L;
        int iHashCode18 = this.f8089M.hashCode() + iB17 + (list8 != null ? list8.hashCode() : 0);
        List<Vb> list9 = this.f8090N;
        if (list9 != null) {
            Iterator<T> it8 = list9.iterator();
            iB7 = 0;
            while (it8.hasNext()) {
                iB7 += ((Vb) it8.next()).b();
            }
        } else {
            iB7 = 0;
        }
        int i16 = iHashCode18 + iB7;
        List<AbstractC1142dc> list10 = this.f8091O;
        if (list10 != null) {
            Iterator<T> it9 = list10.iterator();
            iB8 = 0;
            while (it9.hasNext()) {
                iB8 += ((AbstractC1142dc) it9.next()).b();
            }
        } else {
            iB8 = 0;
        }
        int iHashCode19 = this.f8092P.hashCode() + i16 + iB8;
        C1370tc c1370tc = this.f8093Q;
        int iJ3 = iHashCode19 + (c1370tc != null ? c1370tc.j() : 0);
        List<C1370tc> list11 = this.f8094R;
        if (list11 != null) {
            Iterator<T> it10 = list11.iterator();
            while (it10.hasNext()) {
                iJ2 += ((C1370tc) it10.next()).j();
            }
        }
        int iB18 = this.f8095S.b() + iJ3 + iJ2;
        this.f8096T = Integer.valueOf(iB18);
        return iB18;
    }

    @Override // N7.S2
    public final List<N2> b() {
        return this.f8102f;
    }

    @Override // N7.S2
    public final List<C1179g4> c() {
        return this.i;
    }

    @Override // N7.S2
    public final Qb d() {
        return this.f8084H;
    }

    @Override // N7.S2
    public final List<C1370tc> e() {
        return this.f8094R;
    }

    @Override // N7.S2
    public final C1130d0 f() {
        return this.f8097a;
    }

    @Override // N7.S2
    public final A7.b<Long> g() {
        return this.f8104h;
    }

    @Override // N7.S2
    public final List<C1418x4> getExtensions() {
        return this.f8105j;
    }

    @Override // N7.S2
    public final C9 getHeight() {
        return this.f8114s;
    }

    @Override // N7.S2
    public final String getId() {
        return this.f8117v;
    }

    @Override // N7.S2
    public final A7.b<EnumC1356sc> getVisibility() {
        return this.f8092P;
    }

    @Override // N7.S2
    public final C9 getWidth() {
        return this.f8095S;
    }

    @Override // N7.S2
    public final List<AbstractC1142dc> h() {
        return this.f8091O;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((C1169f9.f) D7.a.f1071b.f6943x6.getValue()).b(D7.a.f1070a, this);
    }

    @Override // N7.S2
    public final C1362t4 j() {
        return this.f8121z;
    }

    @Override // N7.S2
    public final A7.b<Long> k() {
        return this.f8080D;
    }

    @Override // N7.S2
    public final C1362t4 l() {
        return this.f8078B;
    }

    @Override // N7.S2
    public final List<Ub> m() {
        return this.f8088L;
    }

    @Override // N7.S2
    public final List<C1175g0> n() {
        return this.f8081E;
    }

    @Override // N7.S2
    public final A7.b<EnumC1305p2> o() {
        return this.f8098b;
    }

    @Override // N7.S2
    public final L6 p() {
        return this.f8118w;
    }

    @Override // N7.S2
    public final A7.b<String> q() {
        return this.f8079C;
    }

    @Override // N7.S2
    public final List<Vb> r() {
        return this.f8090N;
    }

    @Override // N7.S2
    public final List<C1439yb> s() {
        return this.f8083G;
    }

    @Override // N7.S2
    public final C1370tc t() {
        return this.f8093Q;
    }

    @Override // N7.S2
    public final List<C1210i5> u() {
        return this.f8113r;
    }

    @Override // N7.S2
    public final A7.b<EnumC1319q2> v() {
        return this.f8099c;
    }

    @Override // N7.S2
    public final F2 w() {
        return this.f8086J;
    }

    @Override // N7.S2
    public final List<AbstractC1402w2> x() {
        return this.f8101e;
    }

    @Override // N7.S2
    public final A7.b<Double> y() {
        return this.f8100d;
    }

    @Override // N7.S2
    public final X2 z() {
        return this.f8103g;
    }
}
