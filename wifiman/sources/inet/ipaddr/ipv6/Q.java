package inet.ipaddr.ipv6;

import ag.AbstractC3844b;
import ag.AbstractC3846d;
import ag.InterfaceC3848f;
import bg.AbstractC4108a;
import bg.AbstractC4109b;
import bg.d;
import bg.f;
import cg.InterfaceC4259c;
import dg.InterfaceC5372b;
import dg.InterfaceC5375e;
import inet.ipaddr.AddressPositionException;
import inet.ipaddr.AddressValueException;
import inet.ipaddr.InconsistentPrefixException;
import inet.ipaddr.PrefixLenException;
import inet.ipaddr.c;
import inet.ipaddr.g;
import inet.ipaddr.ipv4.C6180b;
import inet.ipaddr.ipv4.C6183e;
import inet.ipaddr.ipv4.I;
import inet.ipaddr.ipv6.C6208e;
import inet.ipaddr.j;
import java.math.BigInteger;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToLongFunction;
import org.snmp4j.smi.Counter32;

/* loaded from: classes4.dex */
public class Q extends inet.ipaddr.j implements Iterable {

    /* renamed from: y, reason: collision with root package name */
    private static C6208e.a[] f49609y = new C6208e.a[8];

    /* renamed from: z, reason: collision with root package name */
    private static final BigInteger[] f49610z;

    /* renamed from: r, reason: collision with root package name */
    private transient f f49611r;

    /* renamed from: s, reason: collision with root package name */
    private transient d.g f49612s;

    /* renamed from: t, reason: collision with root package name */
    transient inet.ipaddr.ipv4.I f49613t;

    /* renamed from: u, reason: collision with root package name */
    transient i f49614u;

    /* renamed from: v, reason: collision with root package name */
    public final int f49615v;

    /* renamed from: w, reason: collision with root package name */
    private transient f.c f49616w;

    /* renamed from: x, reason: collision with root package name */
    private transient f.c f49617x;

    class a extends C6208e.a {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f49618d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C6208e c6208e, C6208e.a.C1862a c1862a, int i10) {
            super(c6208e, c1862a);
            this.f49618d = i10;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // inet.ipaddr.ipv6.C6208e.a, bg.AbstractC4108a, inet.ipaddr.format.validate.f
        /* renamed from: Z0 */
        public Q r(V[] vArr, Integer num, boolean z10) {
            return new Q(vArr, this.f49618d, false, num, z10);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // inet.ipaddr.ipv6.C6208e.a, inet.ipaddr.format.validate.f
        /* renamed from: c1 */
        public Q t(V[] vArr) {
            return e().m().d1(vArr, this.f49618d);
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f49620a;

        static {
            int[] iArr = new int[c.b.values().length];
            f49620a = iArr;
            try {
                iArr[c.b.YES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f49620a[c.b.NO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f49620a[c.b.NO_HOST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f49620a[c.b.COVERED_BY_HOST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f49621a;

        /* renamed from: b, reason: collision with root package name */
        public final a f49622b;

        /* renamed from: c, reason: collision with root package name */
        public final b f49623c;

        public enum a {
            HOST_PREFERRED,
            MIXED_PREFERRED,
            ZEROS_OR_HOST,
            ZEROS;

            boolean compressHost() {
                return this != ZEROS;
            }
        }

        public enum b {
            NO,
            NO_HOST,
            COVERED_BY_HOST,
            YES;

            boolean compressMixed(Q q10) {
                int i10 = b.f49620a[ordinal()];
                if (i10 == 2) {
                    return false;
                }
                if (i10 == 3) {
                    return !q10.i();
                }
                if (i10 == 4 && q10.i()) {
                    int i11 = 6 - q10.f49615v;
                    return q10.Z() - Math.max(i11, 0) <= 0 || i11 * q10.m0() >= q10.F0().intValue();
                }
                return true;
            }
        }

        public c(boolean z10, a aVar) {
            this(z10, aVar, b.YES);
        }

        public c(boolean z10, a aVar, b bVar) {
            this.f49621a = z10;
            this.f49622b = aVar;
            this.f49623c = bVar == null ? b.YES : bVar;
        }
    }

    static class d extends Q {

        /* renamed from: A, reason: collision with root package name */
        private final inet.ipaddr.j f49624A;

        d(inet.ipaddr.j jVar, V[] vArr, int i10) {
            super(vArr, i10, false);
            this.f49624A = jVar;
        }

        @Override // inet.ipaddr.ipv6.Q, bg.f
        /* renamed from: G1 */
        public /* bridge */ /* synthetic */ bg.e k(int i10) {
            return super.G1(i10);
        }

        @Override // inet.ipaddr.ipv6.Q, bg.f, ag.AbstractC3846d
        /* renamed from: V0 */
        public /* bridge */ /* synthetic */ AbstractC3844b m1(int i10) {
            return super.G1(i10);
        }

        @Override // inet.ipaddr.ipv6.Q, inet.ipaddr.j
        /* renamed from: a2 */
        public /* bridge */ /* synthetic */ inet.ipaddr.k m1(int i10) {
            return super.G1(i10);
        }

        @Override // inet.ipaddr.ipv6.Q, Zf.b, cg.d
        public /* bridge */ /* synthetic */ inet.ipaddr.c e() {
            return super.e();
        }

        @Override // inet.ipaddr.ipv6.Q, inet.ipaddr.j
        protected /* bridge */ /* synthetic */ inet.ipaddr.k[] e2() {
            return super.e2();
        }

        @Override // inet.ipaddr.ipv6.Q, bg.f, ag.InterfaceC3847e, cg.d
        /* renamed from: k */
        public /* bridge */ /* synthetic */ InterfaceC3848f m1(int i10) {
            return super.G1(i10);
        }

        @Override // inet.ipaddr.ipv6.Q, bg.f, bg.d
        public /* bridge */ /* synthetic */ AbstractC4109b m1(int i10) {
            return super.G1(i10);
        }

        @Override // inet.ipaddr.ipv6.Q, Zf.e
        public /* bridge */ /* synthetic */ Zf.d q(int i10) {
            return super.q(i10);
        }

        @Override // inet.ipaddr.ipv6.Q, java.lang.Iterable
        public /* bridge */ /* synthetic */ Spliterator spliterator() {
            return super.spliterator();
        }

        @Override // bg.f, ag.InterfaceC3847e, cg.d
        public boolean x() {
            return this.f49624A.x();
        }

        @Override // inet.ipaddr.ipv6.Q, bg.f, cg.d
        public /* bridge */ /* synthetic */ inet.ipaddr.i e() {
            return super.e();
        }

        @Override // inet.ipaddr.ipv6.Q, bg.f, ag.InterfaceC3847e, cg.d
        /* renamed from: k */
        public /* bridge */ /* synthetic */ ag.l m1(int i10) {
            return super.G1(i10);
        }

        @Override // inet.ipaddr.ipv6.Q, inet.ipaddr.j, inet.ipaddr.l, Zf.e
        public /* bridge */ /* synthetic */ inet.ipaddr.k q(int i10) {
            return super.q(i10);
        }

        @Override // inet.ipaddr.ipv6.Q, bg.f, cg.d
        /* renamed from: k */
        public /* bridge */ /* synthetic */ InterfaceC4259c m1(int i10) {
            return super.G1(i10);
        }
    }

    static class e extends d.g {

        /* renamed from: e, reason: collision with root package name */
        public Inet6Address f49625e;

        e() {
        }
    }

    static class f extends j.b {

        /* renamed from: l, reason: collision with root package name */
        static final g f49626l;

        /* renamed from: m, reason: collision with root package name */
        static final g f49627m;

        /* renamed from: n, reason: collision with root package name */
        static final g f49628n;

        /* renamed from: o, reason: collision with root package name */
        static final g f49629o;

        /* renamed from: p, reason: collision with root package name */
        static final g f49630p;

        /* renamed from: q, reason: collision with root package name */
        static final g f49631q;

        /* renamed from: r, reason: collision with root package name */
        static final g f49632r;

        /* renamed from: s, reason: collision with root package name */
        static final g f49633s;

        /* renamed from: t, reason: collision with root package name */
        static final g f49634t;

        /* renamed from: u, reason: collision with root package name */
        static final g f49635u;

        /* renamed from: v, reason: collision with root package name */
        static final g f49636v;

        /* renamed from: w, reason: collision with root package name */
        static final g f49637w;

        /* renamed from: x, reason: collision with root package name */
        static final j.c f49638x;

        /* renamed from: y, reason: collision with root package name */
        static final j.c f49639y;

        /* renamed from: j, reason: collision with root package name */
        public String f49640j;

        /* renamed from: k, reason: collision with root package name */
        public String f49641k;

        static {
            c.a aVar = c.a.ZEROS_OR_HOST;
            c cVar = new c(true, aVar);
            c cVar2 = new c(true, c.a.MIXED_PREFERRED);
            c cVar3 = new c(false, aVar);
            c cVar4 = new c(true, c.a.HOST_PREFERRED);
            c.a aVar2 = c.a.ZEROS;
            c cVar5 = new c(true, aVar2);
            c cVar6 = new c(false, aVar2);
            f49626l = new g.a().y(true).w(cVar2).u();
            g.a aVarK = new g.a().k(true);
            j.g.a aVar3 = j.g.a.NETWORK_ONLY;
            f49627m = aVarK.r(new j.g(aVar3, new d.i.b(inet.ipaddr.a.f49277c))).u();
            f49629o = new g.a().w(cVar3).u();
            f49630p = new g.a().o('-').t('s').j(".ipv6-literal.net").r(new j.g(aVar3, new d.i.b(C6205b.f49667s, inet.ipaddr.a.f49279e, null))).u();
            f49631q = new g.a().w(cVar).u();
            f49628n = new g.a().u();
            j.g.a aVar4 = j.g.a.ALL;
            j.g gVar = new j.g(aVar4);
            j.g gVar2 = new j.g(aVar4, new d.i.b(inet.ipaddr.a.f49280f, inet.ipaddr.a.f49281g));
            f49633s = new g.a().r(gVar).w(cVar6).u();
            f49632r = new g.a().r(gVar).u();
            f49634t = new g.a().r(gVar2).u();
            f49635u = new g.a().r(gVar).w(cVar5).u();
            f49636v = new g.a().w(cVar4).u();
            f49637w = new g.a().m(true).j(".ip6.arpa").C(true).k(true).o('.').u();
            f49638x = new j.c.a(85).k(true).s(new d.i.b(inet.ipaddr.a.f49278d)).t((char) 167).u();
            f49639y = new j.c.a(2).o(':').n("0b").k(true).u();
        }

        f() {
        }
    }

    public static class g extends j.c {

        /* renamed from: n, reason: collision with root package name */
        public final j.c f49642n;

        /* renamed from: o, reason: collision with root package name */
        public final c f49643o;

        public static class a extends j.c.a {

            /* renamed from: n, reason: collision with root package name */
            private boolean f49644n;

            /* renamed from: o, reason: collision with root package name */
            private j.c f49645o;

            /* renamed from: p, reason: collision with root package name */
            private c f49646p;

            public a() {
                super(16, ':');
            }

            @Override // inet.ipaddr.j.c.a
            /* renamed from: A, reason: merged with bridge method [inline-methods] */
            public a n(String str) {
                return (a) super.n(str);
            }

            @Override // inet.ipaddr.j.c.a
            /* renamed from: B, reason: merged with bridge method [inline-methods] */
            public a o(Character ch2) {
                return (a) super.o(ch2);
            }

            public a C(boolean z10) {
                return (a) super.p(z10);
            }

            @Override // inet.ipaddr.j.c.a
            /* renamed from: D, reason: merged with bridge method [inline-methods] */
            public a r(j.g gVar) {
                return (a) super.r(gVar);
            }

            @Override // inet.ipaddr.j.c.a
            /* renamed from: E, reason: merged with bridge method [inline-methods] */
            public a t(char c10) {
                return (a) super.t(c10);
            }

            @Override // inet.ipaddr.j.c.a
            /* renamed from: F, reason: merged with bridge method [inline-methods] */
            public g u() {
                return new g(this.f33321c, this.f33320b, this.f49752l, this.f33319a, this.f33322d, this.f49644n, this.f49645o, this.f49646p, this.f33323e, this.f49753m, this.f33324f, this.f49751k, this.f33325g, this.f33326h, this.f33327i);
            }

            @Override // inet.ipaddr.j.c.a
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public a j(String str) {
                return (a) super.j(str);
            }

            public a w(c cVar) {
                this.f49646p = cVar;
                return this;
            }

            @Override // inet.ipaddr.j.c.a
            /* renamed from: x, reason: merged with bridge method [inline-methods] */
            public a k(boolean z10) {
                return (a) super.k(z10);
            }

            public a y(boolean z10) {
                this.f49644n = z10;
                return this;
            }

            @Override // inet.ipaddr.j.c.a
            /* renamed from: z, reason: merged with bridge method [inline-methods] */
            public a m(boolean z10) {
                return (a) super.m(z10);
            }
        }

        g(int i10, boolean z10, j.g.a aVar, d.i.b bVar, String str, boolean z11, j.c cVar, c cVar2, Character ch2, char c10, String str2, String str3, boolean z12, boolean z13, boolean z14) {
            super(i10, z10, aVar, bVar, str, ch2, c10, str2, str3, z12, z13, z14);
            this.f49643o = cVar2;
            if (z11) {
                this.f49642n = cVar == null ? new I.d.a().k(z10).q(aVar).s(bVar).u() : cVar;
            } else {
                this.f49642n = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public h b(Q q10) {
            h hVar = new h();
            if (this.f49643o != null) {
                int[] iArrT3 = q10.t3(this.f49643o, d());
                if (iArrT3 != null) {
                    boolean z10 = false;
                    int i10 = iArrT3[0];
                    int i11 = iArrT3[1];
                    hVar.f49647p = i10;
                    hVar.f49648q = i10 + i11;
                    if (this.f49643o.f49622b.compressHost() && q10.i() && hVar.f49648q > inet.ipaddr.j.b2(q10.F0().intValue(), 2, 16)) {
                        z10 = true;
                    }
                    hVar.f49649r = z10;
                }
            }
            hVar.u(this.f33310c);
            hVar.g0(this.f49749l);
            hVar.O(this.f33309b);
            hVar.L(this.f33313f);
            hVar.f0(this.f49748k);
            hVar.G(this.f33314g);
            hVar.I(this.f33315h);
            hVar.M(this.f33316i);
            hVar.P(this.f49750m);
            hVar.N(this.f33317j);
            hVar.H(this.f33311d);
            hVar.K(this.f33312e);
            return hVar;
        }

        boolean c() {
            return this.f49643o == null;
        }

        boolean d() {
            return this.f49642n != null;
        }
    }

    static class h extends AbstractC3846d.c {

        /* renamed from: p, reason: collision with root package name */
        int f49647p;

        /* renamed from: q, reason: collision with root package name */
        int f49648q;

        /* renamed from: r, reason: collision with root package name */
        boolean f49649r;

        h() {
            this(-1, 0);
        }

        @Override // ag.AbstractC3846d.c, ag.AbstractC3846d.b
        /* renamed from: h0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public StringBuilder l(StringBuilder sb2, Q q10, CharSequence charSequence) {
            W(q(o(m(sb2), q10), charSequence));
            if (!F() && (!e0() || this.f49649r)) {
                U(sb2, q10);
            }
            return sb2;
        }

        @Override // ag.AbstractC3846d.b
        /* renamed from: i0, reason: merged with bridge method [inline-methods] */
        public StringBuilder o(StringBuilder sb2, Q q10) {
            int i10;
            int iH = q10.H();
            if (iH <= 0) {
                return sb2;
            }
            int i11 = iH - 1;
            Character chA = A();
            boolean zF = F();
            int i12 = 0;
            while (true) {
                int i13 = zF ? i11 - i12 : i12;
                int i14 = this.f49647p;
                if (i13 < i14 || i13 >= (i10 = this.f49648q)) {
                    n(i13, sb2, q10);
                    i12++;
                    if (i12 > i11) {
                        break;
                    }
                    if (chA != null) {
                        sb2.append(chA);
                    }
                } else {
                    if (zF) {
                        i14 = i10 - 1;
                    }
                    if (i13 == i14 && chA != null) {
                        sb2.append(chA);
                        if (i12 == 0) {
                            sb2.append(chA);
                        }
                    }
                    i12++;
                    if (i12 > i11) {
                        break;
                    }
                }
            }
            return sb2;
        }

        @Override // ag.AbstractC3846d.c
        /* renamed from: j0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public h clone() {
            return (h) super.clone();
        }

        @Override // ag.AbstractC3846d.b
        /* renamed from: k0, reason: merged with bridge method [inline-methods] */
        public int z(Q q10) {
            int iH = q10.H();
            int i10 = 0;
            if (iH == 0) {
                return 0;
            }
            Character chA = A();
            int iV = 0;
            while (true) {
                int i11 = this.f49647p;
                if (i10 < i11 || i10 >= this.f49648q) {
                    iV += n(i10, null, q10);
                    i10++;
                    if (i10 >= iH) {
                        break;
                    }
                    if (chA != null) {
                        iV++;
                    }
                } else {
                    if (i10 == i11 && chA != null) {
                        iV = i10 == 0 ? iV + 2 : iV + 1;
                    }
                    i10++;
                    if (i10 >= iH) {
                        break;
                    }
                }
            }
            return iV;
        }

        @Override // ag.AbstractC3846d.c
        /* renamed from: l0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public int c0(Q q10) {
            int iZ = z(q10);
            if (!F() && (!e0() || this.f49649r)) {
                iZ += AbstractC3846d.c.a0(q10);
            }
            return iZ + Z() + x();
        }

        h(int i10, int i11) {
            this(false, i10, i11, false, ':', '%');
        }

        private h(boolean z10, int i10, int i11, boolean z11, char c10, char c11) {
            super(16, Character.valueOf(c10), z11, c11);
            u(z10);
            this.f49647p = i10;
            this.f49648q = i10 + i11;
        }
    }

    public static class i extends bg.f {

        /* renamed from: m, reason: collision with root package name */
        private final Q f49650m;

        /* renamed from: n, reason: collision with root package name */
        private final inet.ipaddr.ipv4.I f49651n;

        /* renamed from: o, reason: collision with root package name */
        private String f49652o;

        /* synthetic */ i(Q q10, inet.ipaddr.ipv4.I i10, a aVar) {
            this(q10, i10);
        }

        private static bg.e[] O1(Q q10, inet.ipaddr.ipv4.I i10) {
            int iZ = q10.Z();
            int iZ2 = i10.Z();
            if (((iZ2 + 1) >> 1) + iZ + q10.f49615v > 8) {
                throw new AddressValueException(q10, i10);
            }
            inet.ipaddr.k[] kVarArr = new inet.ipaddr.k[iZ + iZ2];
            q10.d2(0, iZ, kVarArr, 0);
            i10.d2(0, iZ2, kVarArr, iZ);
            return kVarArr;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return this.f49650m.equals(iVar.f49650m) && this.f49651n.equals(iVar.f49651n);
        }

        @Override // ag.InterfaceC3847e, ag.InterfaceC3849g
        public int f() {
            return this.f49650m.f() + this.f49651n.f();
        }

        public String toString() {
            if (this.f49652o == null) {
                g gVar = f.f49626l;
                this.f49652o = new j(gVar.b(this.f49650m), gVar.f49642n).k(this);
            }
            return this.f49652o;
        }

        @Override // ag.InterfaceC3849g
        public int v0() {
            return this.f49650m.v0() + this.f49651n.v0();
        }

        @Override // bg.f, ag.InterfaceC3847e, cg.d
        public boolean x() {
            if (F0() == null) {
                return false;
            }
            if (e().d().allPrefixedAddressesAreSubnets()) {
                return true;
            }
            return this.f49650m.i() ? this.f49650m.x() && this.f49651n.w() : this.f49651n.x();
        }

        private i(Q q10, inet.ipaddr.ipv4.I i10) {
            super(O1(q10, i10), q10.e());
            if (q10.i()) {
                if (!i10.i() || i10.F0().intValue() != 0) {
                    throw new InconsistentPrefixException(q10, i10, i10.F0());
                }
                this.f26217c = q10.F0();
            } else if (i10.i()) {
                this.f26217c = bg.d.s(i10.F0().intValue() + q10.f());
            } else {
                this.f26217c = AbstractC3846d.f26211g;
            }
            this.f49651n = i10;
            this.f49650m = q10;
        }
    }

    static class j implements InterfaceC5375e, Cloneable {

        /* renamed from: a, reason: collision with root package name */
        private AbstractC3846d.c f49653a;

        /* renamed from: b, reason: collision with root package name */
        private h f49654b;

        j(h hVar, j.c cVar) {
            this.f49653a = inet.ipaddr.j.B2(cVar);
            this.f49654b = hVar;
        }

        public StringBuilder b(StringBuilder sb2, i iVar, CharSequence charSequence) {
            this.f49654b.m(sb2);
            this.f49654b.o(sb2, iVar.f49650m);
            if (this.f49654b.f49648q < iVar.f49650m.Z()) {
                sb2.append(this.f49654b.d0());
            }
            this.f49653a.o(sb2, iVar.f49651n);
            this.f49654b.q(sb2, charSequence);
            this.f49654b.W(sb2);
            c(sb2, iVar);
            return sb2;
        }

        public void c(StringBuilder sb2, i iVar) {
            if (i(iVar.f49650m) || h(iVar.f49651n)) {
                this.f49654b.U(sb2, iVar);
            }
        }

        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public j clone() {
            try {
                j jVar = (j) super.clone();
                jVar.f49654b = this.f49654b.X();
                jVar.f49653a = this.f49653a.clone();
                return jVar;
            } catch (CloneNotSupportedException unused) {
                return null;
            }
        }

        protected int e(i iVar) {
            if (i(iVar.f49650m) || h(iVar.f49651n)) {
                return AbstractC3846d.c.a0(iVar);
            }
            return 0;
        }

        public int f(i iVar, CharSequence charSequence) {
            int iZ = this.f49654b.z(iVar.f49650m) + this.f49653a.z(iVar.f49651n);
            if (this.f49654b.f49648q < iVar.f49650m.Z()) {
                iZ++;
            }
            return iZ + e(iVar) + this.f49654b.E(charSequence) + this.f49654b.Z() + this.f49654b.x();
        }

        protected boolean h(inet.ipaddr.ipv4.I i10) {
            return i10.i() && !this.f49653a.e0();
        }

        protected boolean i(Q q10) {
            return q10.i() && (!this.f49654b.e0() || this.f49654b.f49649r);
        }

        public String k(i iVar) {
            return l(iVar, null);
        }

        public String l(i iVar, CharSequence charSequence) {
            int iF = f(iVar, charSequence);
            StringBuilder sb2 = new StringBuilder(iF);
            b(sb2, iVar, charSequence);
            AbstractC3846d.b.r(iF, sb2);
            return sb2.toString();
        }
    }

    static {
        BigInteger bigInteger = BigInteger.ZERO;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(65535L);
        BigInteger bigIntegerValueOf2 = BigInteger.valueOf(Counter32.MAX_COUNTER32_VALUE);
        BigInteger bigIntegerValueOf3 = BigInteger.valueOf(281474976710655L);
        BigInteger bigIntegerShiftLeft = BigInteger.valueOf(1L).shiftLeft(64);
        BigInteger bigInteger2 = BigInteger.ONE;
        f49610z = new BigInteger[]{bigInteger, bigIntegerValueOf, bigIntegerValueOf2, bigIntegerValueOf3, bigIntegerShiftLeft.subtract(bigInteger2), BigInteger.valueOf(1L).shiftLeft(80).subtract(bigInteger2), BigInteger.valueOf(1L).shiftLeft(96).subtract(bigInteger2), BigInteger.valueOf(1L).shiftLeft(112).subtract(bigInteger2), BigInteger.valueOf(1L).shiftLeft(128).subtract(bigInteger2)};
    }

    protected Q(V[] vArr, int i10, boolean z10, Integer num, boolean z11) {
        this(vArr, i10, z10, num == null);
        if (num != null) {
            if (num.intValue() < 0) {
                throw new PrefixLenException(num.intValue());
            }
            int length = vArr.length << 4;
            if (num.intValue() > length) {
                if (num.intValue() > 128) {
                    throw new PrefixLenException(num.intValue());
                }
                num = Integer.valueOf(length);
            }
            if (vArr.length > 0) {
                Integer num2 = this.f26217c;
                if (num2 != AbstractC3846d.f26211g && num2.intValue() < num.intValue()) {
                    num = this.f26217c;
                }
                C6208e c6208eE = e();
                bg.d.D1(c6208eE, num.intValue(), e2(), m0(), e0(), c6208eE.m(), (z11 || !inet.ipaddr.j.l2(vArr, num, c6208eE, false)) ? new BiFunction() { // from class: inet.ipaddr.ipv6.P
                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj, Object obj2) {
                        return ((V) obj).o3((Integer) obj2);
                    }
                } : new BiFunction() { // from class: inet.ipaddr.ipv6.O
                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj, Object obj2) {
                        return ((V) obj).l3((Integer) obj2);
                    }
                });
            }
            this.f26217c = num;
        }
    }

    private c.a D3() {
        return e().m();
    }

    private Iterator N3(Predicate predicate) {
        boolean zAllPrefixedAddressesAreSubnets = e().d().allPrefixedAddressesAreSubnets();
        boolean z10 = (A0() || (zAllPrefixedAddressesAreSubnets && i())) ? false : true;
        return bg.d.v1(z10, (!z10 || (predicate != null && predicate.test(e2()))) ? null : this, r3(), z10 ? null : t4(predicate), zAllPrefixedAddressesAreSubnets ? null : A());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int O3(C6205b c6205b, int i10) {
        return c6205b.q(i10).Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ int Q3(int i10) {
        return q(i10).C2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ V R3(boolean z10, int i10) {
        return z10 ? q(i10).b3() : q(i10).g3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ int S3(int i10, int i11, int i12) {
        if (i12 != i10) {
            return q(i12).C2();
        }
        V vQ = q(i12);
        int iF = vQ.f() - inet.ipaddr.j.q1(m0(), i11, i12).intValue();
        return ((vQ.w0() >>> iF) - (vQ.Q() >>> iF)) + 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ V[] T3() {
        return y3().e2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Iterator U3(boolean z10, int i10) {
        return q(i10).h3(!z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int V3(Q q10, int i10) {
        return q10.q(i10).Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ V[] W3() {
        return y3().E3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Iterator X3(boolean z10, int i10) {
        return q(i10).h3(!z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Iterator Z3(final int i10, boolean z10, boolean z11, Q q10) {
        return q10.N3(new Predicate() { // from class: inet.ipaddr.ipv6.I
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return this.f49602a.Y3(i10, (V[]) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ long a4(int i10, int i11, Q q10) {
        return bg.d.y1(q10, i10) - q10.x2(i11, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ BigInteger b4(int i10, int i11, Q q10) {
        return q10.getCount().subtract(q10.J3(i10, i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Iterator c4(boolean z10, boolean z11, Q q10) {
        return q10.iterator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ long d4(int i10, Q q10) {
        return bg.d.y1(q10, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Q e4(C6208e.a aVar, Integer num, V[] vArr) {
        return (Q) bg.d.k1(vArr, aVar, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean f4(final C6208e.a aVar, final Integer num, int i10, int i11, AbstractC3846d.e eVar) {
        return bg.d.E1(eVar, new Function() { // from class: inet.ipaddr.ipv6.F
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Q.e4(aVar, num, (V[]) obj);
            }
        }, aVar, ((Q) eVar.a()).e2(), i10, i11, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean g4(Q q10) {
        return q10.getCount().compareTo(AbstractC3846d.f26213i) <= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Iterator i4(final int i10, boolean z10, boolean z11, C6205b c6205b) {
        return c6205b.v().M3(c6205b, c6205b.A1(), new Predicate() { // from class: inet.ipaddr.ipv6.H
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return this.f49600a.h4(i10, (V[]) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ long j4(int i10, int i11, C6205b c6205b) {
        return bg.d.y1(c6205b.v(), i10) - c6205b.v().x2(i11, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ BigInteger k4(int i10, int i11, C6205b c6205b) {
        return c6205b.v().getCount().subtract(c6205b.v().J3(i10, i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Iterator l4(boolean z10, boolean z11, C6205b c6205b) {
        return c6205b.iterator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ long m4(int i10, C6205b c6205b) {
        return bg.d.y1(c6205b.v(), i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C6205b n4(C6208e.a aVar, Integer num, V[] vArr) {
        return (C6205b) bg.d.j1(vArr, aVar, num);
    }

    public static Q o3(C6208e.a aVar, V[] vArr, C6180b c6180b) {
        inet.ipaddr.ipv4.I iF1 = c6180b.b1();
        V[] vArrD = aVar.d(vArr.length + 2);
        vArrD[0] = vArr[0];
        vArrD[1] = vArr[1];
        vArrD[2] = vArr[2];
        vArrD[3] = vArr[3];
        vArrD[4] = vArr[4];
        vArrD[5] = vArr[5];
        vArrD[6] = iF1.q(0).h3(aVar, iF1.q(1));
        vArrD[7] = iF1.q(2).h3(aVar, iF1.q(3));
        Q qT = aVar.t(vArrD);
        qT.f49613t = iF1;
        return qT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean o4(final C6208e.a aVar, final Integer num, int i10, int i11, AbstractC3846d.e eVar) {
        return bg.d.E1(eVar, new Function() { // from class: inet.ipaddr.ipv6.C
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Q.n4(aVar, num, (V[]) obj);
            }
        }, aVar, ((C6205b) eVar.a()).v().e2(), i10, i11, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean p4(C6205b c6205b) {
        return c6205b.getCount().compareTo(AbstractC3846d.f26213i) <= 0;
    }

    private Predicate q3() {
        if (!i()) {
            return null;
        }
        final int iIntValue = F0().intValue();
        return new Predicate() { // from class: inet.ipaddr.ipv6.G
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return this.f49598a.P3(iIntValue, (V[]) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ V q4(Integer num, int i10) {
        return q(i10).m3(num, true);
    }

    private C6208e.a r3() {
        return s3(this.f49615v);
    }

    protected static Integer s(int i10) {
        return inet.ipaddr.j.s(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] t3(c cVar, boolean z10) {
        if (cVar == null) {
            return null;
        }
        c.a aVar = cVar.f49622b;
        f.c cVarJ1 = aVar.compressHost() ? J1() : K1();
        int iZ = Z();
        int i10 = 0;
        boolean z11 = z10 && cVar.f49623c.compressMixed(this);
        boolean z12 = aVar == c.a.HOST_PREFERRED;
        boolean z13 = z10 && aVar == c.a.MIXED_PREFERRED;
        int i11 = -1;
        for (int iB = cVarJ1.b() - 1; iB >= 0; iB--) {
            f.a aVarA = cVarJ1.a(iB);
            int i12 = aVarA.f33336a;
            int iMin = aVarA.f33337b;
            if (z10) {
                int i13 = 6 - this.f49615v;
                if (!z11 || i12 > i13 || i12 + iMin < iZ) {
                    iMin = Math.min(iMin, i13 - i12);
                }
            }
            if (iMin > 0 && iMin >= i10 && (cVar.f49621a || iMin > 1)) {
                i10 = iMin;
                i11 = i12;
            }
            if ((z12 && i() && (i12 + iMin) * m0() > F0().intValue()) || (z13 && i12 + iMin >= iZ)) {
                break;
            }
        }
        if (i11 >= 0) {
            return new int[]{i11, i10};
        }
        return null;
    }

    private Iterator t4(Predicate predicate) {
        final boolean zAllPrefixedAddressesAreSubnets = e().d().allPrefixedAddressesAreSubnets();
        return bg.d.B1(Z(), D3(), A0() ? null : new Supplier() { // from class: inet.ipaddr.ipv6.u
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.f49728a.W3();
            }
        }, new IntFunction() { // from class: inet.ipaddr.ipv6.v
            @Override // java.util.function.IntFunction
            public final Object apply(int i10) {
                return this.f49729a.X3(zAllPrefixedAddressesAreSubnets, i10);
            }
        }, predicate);
    }

    private static BigInteger u3(IntUnaryOperator intUnaryOperator, int i10) {
        if (i10 >= 0) {
            return bg.d.i1(intUnaryOperator, i10, 2, 140737488355327L);
        }
        throw new IllegalArgumentException();
    }

    private String y4(j jVar, CharSequence charSequence) {
        return jVar.l(A3(), charSequence);
    }

    public i A3() {
        if (this.f49614u == null) {
            synchronized (this) {
                try {
                    if (this.f49614u == null) {
                        this.f49614u = new i(n3(), w3(), null);
                    }
                } finally {
                }
            }
        }
        return this.f49614u;
    }

    public String A4(g gVar, CharSequence charSequence) {
        h hVarB;
        if (gVar.c()) {
            InterfaceC5375e interfaceC5375e = (InterfaceC5375e) AbstractC3846d.K0(gVar);
            if (interfaceC5375e == null) {
                hVarB = gVar.b(this);
                if (gVar.d()) {
                    j jVar = new j(hVarB, gVar.f49642n);
                    AbstractC3846d.f1(gVar, jVar);
                    return y4(jVar, charSequence);
                }
                AbstractC3846d.f1(gVar, hVarB);
            } else {
                if (interfaceC5375e instanceof j) {
                    return y4((j) interfaceC5375e, charSequence);
                }
                hVarB = (h) interfaceC5375e;
            }
        } else {
            hVarB = gVar.b(this);
            if (gVar.d() && hVarB.f49648q <= 6 - this.f49615v) {
                return y4(new j(hVarB, gVar.f49642n), charSequence);
            }
        }
        return hVarB.R(this, charSequence);
    }

    @Override // bg.f, cg.d
    /* renamed from: B3, reason: merged with bridge method [inline-methods] */
    public C6208e e() {
        return inet.ipaddr.a.s();
    }

    public Q B4() {
        Integer numF0 = F0();
        return (numF0 == null || e().d().allPrefixedAddressesAreSubnets()) ? this : C4(numF0.intValue());
    }

    @Override // inet.ipaddr.j, inet.ipaddr.l, Zf.e
    /* renamed from: C3, reason: merged with bridge method [inline-methods] */
    public V q(int i10) {
        return (V) super.q(i10);
    }

    public Q C4(int i10) {
        return (Q) inet.ipaddr.j.F2(this, i10, r3(), new j.e() { // from class: inet.ipaddr.ipv6.E
            @Override // inet.ipaddr.j.e
            public final Object a(Object obj, int i11) {
                return this.f49595a.q4((Integer) obj, i11);
            }
        });
    }

    public Q D4() {
        return s4(false);
    }

    public V[] E3() {
        return (V[]) X0().clone();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // inet.ipaddr.j
    /* renamed from: F3, reason: merged with bridge method [inline-methods] */
    public V[] e2() {
        return (V[]) super.X0();
    }

    protected Q G3() {
        return (Q) bg.d.t1(this);
    }

    protected f H3() {
        return this.f49611r;
    }

    public Q I3() {
        return z3(false, false);
    }

    @Override // bg.f
    public f.c J1() {
        if (this.f49617x == null) {
            this.f49617x = super.J1();
        }
        return this.f49617x;
    }

    protected BigInteger J3(final int i10, int i11) {
        if (!i2(i10)) {
            return BigInteger.ZERO;
        }
        if (!A0()) {
            return BigInteger.ONE;
        }
        final int iP1 = inet.ipaddr.j.p1(i10, e0(), m0());
        return u3(new IntUnaryOperator() { // from class: inet.ipaddr.ipv6.D
            @Override // java.util.function.IntUnaryOperator
            public final int applyAsInt(int i12) {
                return this.f49592a.S3(iP1, i10, i12);
            }
        }, iP1 + 1);
    }

    @Override // bg.f
    public f.c K1() {
        if (this.f49616w == null) {
            this.f49616w = super.K1();
        }
        return this.f49616w;
    }

    protected boolean K3() {
        if (this.f49611r != null) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f49611r != null) {
                    return false;
                }
                this.f49611r = new f();
                return true;
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: L3, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public boolean h4(V[] vArr, int i10) {
        return super.o2(vArr, i10);
    }

    protected Iterator M3(C6205b c6205b, AbstractC4108a abstractC4108a, Predicate predicate) {
        Iterator itB1;
        final boolean zAllPrefixedAddressesAreSubnets = e().d().allPrefixedAddressesAreSubnets();
        boolean z10 = (A0() || (zAllPrefixedAddressesAreSubnets && i())) ? false : true;
        if (!z10 || (predicate != null && predicate.test(e2()))) {
            c6205b = null;
        }
        if (z10) {
            itB1 = null;
        } else {
            itB1 = bg.d.B1(Z(), abstractC4108a, A0() ? null : new Supplier() { // from class: inet.ipaddr.ipv6.x
                @Override // java.util.function.Supplier
                public final Object get() {
                    return this.f49731a.T3();
                }
            }, new IntFunction() { // from class: inet.ipaddr.ipv6.y
                @Override // java.util.function.IntFunction
                public final Object apply(int i10) {
                    return this.f49732a.U3(zAllPrefixedAddressesAreSubnets, i10);
                }
            }, predicate);
        }
        return bg.d.w1(z10, c6205b, abstractC4108a, itB1, zAllPrefixedAddressesAreSubnets ? null : A());
    }

    @Override // inet.ipaddr.l
    public String V() {
        String str;
        if (!K3() && (str = H3().f49746b) != null) {
            return str;
        }
        f fVarH3 = H3();
        String strZ4 = z4(f.f49632r);
        fVarH3.f49746b = strZ4;
        return strZ4;
    }

    @Override // inet.ipaddr.l
    public String X() {
        String str;
        if (!K3() && (str = H3().f49641k) != null) {
            return str;
        }
        f fVarH3 = H3();
        String strZ4 = z4(f.f49633s);
        fVarH3.f49641k = strZ4;
        return strZ4;
    }

    @Override // Zf.e
    public String Y() {
        String str;
        if (!K3() && (str = this.f49611r.f33308a) != null) {
            return str;
        }
        f fVar = this.f49611r;
        String strZ4 = z4(f.f49629o);
        fVar.f33308a = strZ4;
        return strZ4;
    }

    @Override // inet.ipaddr.j
    protected BigInteger Z1(int i10) {
        return !A0() ? BigInteger.ONE : u3(new IntUnaryOperator() { // from class: inet.ipaddr.ipv6.g
            @Override // java.util.function.IntUnaryOperator
            public final int applyAsInt(int i11) {
                return this.f49694a.Q3(i11);
            }
        }, i10);
    }

    @Override // Zf.b
    public String a0() {
        String str;
        if (!K3() && (str = H3().f49640j) != null) {
            return str;
        }
        f fVarH3 = H3();
        String strZ4 = z4(f.f49628n);
        fVarH3.f49640j = strZ4;
        return strZ4;
    }

    @Override // bg.d, ag.AbstractC3846d
    protected byte[] b0(boolean z10) {
        byte[] bArr = new byte[v0()];
        int iZ = Z();
        for (int i10 = 0; i10 < iZ; i10++) {
            V vQ = q(i10);
            int i11 = i10 << 1;
            int iQ = z10 ? vQ.Q() : vQ.w0();
            bArr[i11] = (byte) (iQ >>> 8);
            bArr[i11 + 1] = (byte) iQ;
        }
        return bArr;
    }

    @Override // ag.AbstractC3846d, ag.InterfaceC3849g
    public boolean c0() {
        f.c cVarK1 = K1();
        return cVarK1.b() == 1 && cVarK1.a(0).f33337b == Z();
    }

    @Override // bg.f, bg.d, ag.AbstractC3846d
    protected boolean c1(AbstractC3846d abstractC3846d) {
        return (abstractC3846d instanceof Q) && super.c1(abstractC3846d);
    }

    @Override // Zf.e
    public int e0() {
        return 2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Q)) {
            return false;
        }
        Q q10 = (Q) obj;
        return this.f49615v == q10.f49615v && q10.c1(this);
    }

    @Override // inet.ipaddr.j, ag.InterfaceC3847e, ag.InterfaceC3849g
    public int f() {
        return Z() << 4;
    }

    @Override // ag.AbstractC3846d
    protected void g1(InetAddress inetAddress) {
        super.g1(inetAddress);
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return N3(null);
    }

    @Override // inet.ipaddr.j
    protected void j2(Integer num, boolean z10, Integer num2, Integer num3, Integer num4, BigInteger bigInteger, f.c cVar, f.c cVar2) {
        super.j2(num, z10, num2, num3, num4, bigInteger, cVar, cVar2);
        this.f49616w = cVar;
        this.f49617x = cVar2;
    }

    @Override // Zf.e
    public int m0() {
        return 16;
    }

    void m3(Q q10, Q q11) {
        d.g gVar = this.f49612s;
        if (q10 == null && q11 == null) {
            return;
        }
        if (gVar == null || ((q10 != null && gVar.f33304a == null) || (q11 != null && gVar.f33306c == null))) {
            synchronized (this) {
                try {
                    d.g gVar2 = this.f49612s;
                    if (gVar2 == null) {
                        d.g gVar3 = new d.g();
                        this.f49612s = gVar3;
                        gVar3.f33304a = q10;
                        gVar3.f33306c = q11;
                    } else {
                        if (gVar2.f33304a == null) {
                            gVar2.f33304a = q10;
                        }
                        if (gVar2.f33306c == null) {
                            gVar2.f33306c = q11;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // inet.ipaddr.l
    public g.a n0() {
        return g.a.IPV6;
    }

    public Q n3() {
        int iZ = Z() - Math.max(6 - this.f49615v, 0);
        if (iZ <= 0) {
            return this;
        }
        int iMax = Math.max(0, Z() - iZ);
        C6208e.a aVarM = e().m();
        V[] vArrD = aVarM.d(iMax);
        d2(0, iMax, vArrD, 0);
        return aVarM.Y0(this, vArrD, this.f49615v);
    }

    Q p3(boolean z10) {
        int iIntValue = F0().intValue();
        C6208e c6208eE = e();
        final C6205b c6205b = (C6205b) c6208eE.r(iIntValue);
        return (Q) inet.ipaddr.j.f2(this, c6208eE.d().allPrefixedAddressesAreSubnets() ? null : s(iIntValue), r3(), !z10, new C6211h(this), new IntUnaryOperator() { // from class: inet.ipaddr.ipv6.i
            @Override // java.util.function.IntUnaryOperator
            public final int applyAsInt(int i10) {
                return Q.O3(c6205b, i10);
            }
        }, true);
    }

    @Override // inet.ipaddr.j, ag.AbstractC3846d
    protected byte[] q0() {
        return super.q0();
    }

    @Override // inet.ipaddr.l
    public String r0() {
        String str;
        if (!K3() && (str = H3().f49747c) != null) {
            return str;
        }
        f fVarH3 = H3();
        String strZ4 = z4(f.f49627m);
        fVarH3.f49747c = strZ4;
        return strZ4;
    }

    public Q r4(final Q q10, boolean z10) {
        V1(q10);
        return (Q) inet.ipaddr.j.f2(this, z10 ? A() : null, r3(), true, new C6211h(this), new IntUnaryOperator() { // from class: inet.ipaddr.ipv6.A
            @Override // java.util.function.IntUnaryOperator
            public final int applyAsInt(int i10) {
                return Q.V3(this.f49587a, i10);
            }
        }, false);
    }

    protected C6208e.a s3(int i10) {
        C6208e.a aVarM = e().m();
        boolean zEquals = i10 < 8;
        C6208e.a aVar = zEquals ? f49609y[i10] : null;
        if (aVar != null && (zEquals || aVar.e().equals(e()))) {
            return aVar;
        }
        a aVar2 = new a(e(), aVarM.f49681b, i10);
        aVar2.f49682c = aVarM.f49682c;
        if (zEquals) {
            f49609y[i10] = aVar2;
        }
        return aVar2;
    }

    public Q s4(boolean z10) {
        return (Q) inet.ipaddr.j.y2(this, z10, r3(), new j.e() { // from class: inet.ipaddr.ipv6.z
            @Override // inet.ipaddr.j.e
            public final Object a(Object obj, int i10) {
                return ((Q) obj).q(i10);
            }
        });
    }

    public Iterator u4() {
        return t4(q3());
    }

    @Override // ag.InterfaceC3849g
    public int v0() {
        return Z() << 1;
    }

    @Override // bg.f, bg.d
    /* renamed from: v3, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public V m1(int i10) {
        return (V) super.m1(i10);
    }

    @Override // java.lang.Iterable
    /* renamed from: v4, reason: merged with bridge method [inline-methods] */
    public InterfaceC5372b spliterator() {
        return x4(false);
    }

    public inet.ipaddr.ipv4.I w3() {
        inet.ipaddr.ipv4.M[] mArrD;
        if (this.f49613t == null) {
            synchronized (this) {
                try {
                    if (this.f49613t == null) {
                        int iZ = Z() - Math.max(6 - this.f49615v, 0);
                        int iZ2 = Z();
                        int i10 = iZ2 - 1;
                        C6183e.a aVarA = x3().a();
                        if (iZ == 0) {
                            mArrD = aVarA.d(0);
                        } else if (iZ == 1) {
                            mArrD = aVarA.d(e0());
                            q(i10).e3(mArrD, 0, aVarA);
                        } else {
                            mArrD = aVarA.d(e0() << 1);
                            V vQ = q(i10);
                            q(iZ2 - 2).e3(mArrD, 0, aVarA);
                            vQ.e3(mArrD, e0(), aVarA);
                        }
                        this.f49613t = (inet.ipaddr.ipv4.I) inet.ipaddr.j.W1(aVarA, mArrD, this);
                    }
                } finally {
                }
            }
        }
        return this.f49613t;
    }

    protected InterfaceC5372b w4(C6205b c6205b, final C6208e.a aVar, boolean z10) {
        C6205b c6205bH2;
        final Integer num;
        AbstractC3846d.InterfaceC1014d interfaceC1014d;
        ToLongFunction toLongFunction;
        Function function;
        final int iZ = Z();
        Integer numF0 = F0();
        if (e().d().allPrefixedAddressesAreSubnets()) {
            num = null;
            c6205bH2 = c6205b.t1();
        } else {
            c6205bH2 = c6205b;
            num = numF0;
        }
        if (z10 && h2()) {
            final int iIntValue = numF0.intValue();
            interfaceC1014d = new AbstractC3846d.InterfaceC1014d() { // from class: inet.ipaddr.ipv6.j
                @Override // ag.AbstractC3846d.InterfaceC1014d
                public final Iterator a(boolean z11, boolean z12, Object obj) {
                    return this.f49699a.i4(iIntValue, z11, z12, (C6205b) obj);
                }
            };
            toLongFunction = new ToLongFunction() { // from class: inet.ipaddr.ipv6.k
                @Override // java.util.function.ToLongFunction
                public final long applyAsLong(Object obj) {
                    return Q.j4(iZ, iIntValue, (C6205b) obj);
                }
            };
            function = new Function() { // from class: inet.ipaddr.ipv6.l
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Q.k4(iIntValue, iZ, (C6205b) obj);
                }
            };
        } else {
            interfaceC1014d = new AbstractC3846d.InterfaceC1014d() { // from class: inet.ipaddr.ipv6.m
                @Override // ag.AbstractC3846d.InterfaceC1014d
                public final Iterator a(boolean z11, boolean z12, Object obj) {
                    return Q.l4(z11, z12, (C6205b) obj);
                }
            };
            toLongFunction = new ToLongFunction() { // from class: inet.ipaddr.ipv6.n
                @Override // java.util.function.ToLongFunction
                public final long applyAsLong(Object obj) {
                    return Q.m4(iZ, (C6205b) obj);
                }
            };
            function = new Function() { // from class: inet.ipaddr.ipv6.o
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((C6205b) obj).getCount();
                }
            };
        }
        final int i10 = iZ - 1;
        return AbstractC3846d.T(c6205bH2, new Predicate() { // from class: inet.ipaddr.ipv6.p
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return Q.o4(aVar, num, i10, iZ, (AbstractC3846d.e) obj);
            }
        }, interfaceC1014d, function, new Predicate() { // from class: inet.ipaddr.ipv6.r
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return Q.p4((C6205b) obj);
            }
        }, toLongFunction);
    }

    @Override // inet.ipaddr.j, Zf.c
    public boolean x0(Zf.c cVar) {
        return (cVar instanceof Q) && this.f49615v == ((Q) cVar).f49615v && super.x0(cVar);
    }

    public C6183e x3() {
        return inet.ipaddr.a.j();
    }

    protected InterfaceC5372b x4(boolean z10) {
        Q qD4;
        final Integer num;
        AbstractC3846d.InterfaceC1014d interfaceC1014d;
        ToLongFunction toLongFunction;
        Function function;
        final int iZ = Z();
        Integer numF0 = F0();
        final C6208e.a aVarR3 = r3();
        if (e().d().allPrefixedAddressesAreSubnets()) {
            num = null;
            qD4 = D4();
        } else {
            qD4 = this;
            num = numF0;
        }
        if (z10 && h2()) {
            final int iIntValue = numF0.intValue();
            interfaceC1014d = new AbstractC3846d.InterfaceC1014d() { // from class: inet.ipaddr.ipv6.f
                @Override // ag.AbstractC3846d.InterfaceC1014d
                public final Iterator a(boolean z11, boolean z12, Object obj) {
                    return this.f49692a.Z3(iIntValue, z11, z12, (Q) obj);
                }
            };
            toLongFunction = new ToLongFunction() { // from class: inet.ipaddr.ipv6.q
                @Override // java.util.function.ToLongFunction
                public final long applyAsLong(Object obj) {
                    return Q.a4(iZ, iIntValue, (Q) obj);
                }
            };
            function = new Function() { // from class: inet.ipaddr.ipv6.B
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Q.b4(iIntValue, iZ, (Q) obj);
                }
            };
        } else {
            interfaceC1014d = new AbstractC3846d.InterfaceC1014d() { // from class: inet.ipaddr.ipv6.J
                @Override // ag.AbstractC3846d.InterfaceC1014d
                public final Iterator a(boolean z11, boolean z12, Object obj) {
                    return Q.c4(z11, z12, (Q) obj);
                }
            };
            toLongFunction = new ToLongFunction() { // from class: inet.ipaddr.ipv6.K
                @Override // java.util.function.ToLongFunction
                public final long applyAsLong(Object obj) {
                    return Q.d4(iZ, (Q) obj);
                }
            };
            function = new Function() { // from class: inet.ipaddr.ipv6.L
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((Q) obj).getCount();
                }
            };
        }
        final int i10 = iZ - 1;
        return AbstractC3846d.T(qD4, new Predicate() { // from class: inet.ipaddr.ipv6.M
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return Q.f4(aVarR3, num, i10, iZ, (AbstractC3846d.e) obj);
            }
        }, interfaceC1014d, function, new Predicate() { // from class: inet.ipaddr.ipv6.N
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return Q.g4((Q) obj);
            }
        }, toLongFunction);
    }

    public Q y3() {
        return z3(true, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0027 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    inet.ipaddr.ipv6.Q z3(final boolean r12, boolean r13) {
        /*
            r11 = this;
            inet.ipaddr.ipv6.Q r0 = r11.G3()
            if (r0 != 0) goto L89
            bg.d$g r1 = r11.f49612s
            if (r1 == 0) goto L26
            if (r12 == 0) goto L20
            if (r13 == 0) goto L19
            Zf.e r0 = r1.f33305b
            inet.ipaddr.ipv6.Q r0 = (inet.ipaddr.ipv6.Q) r0
            if (r0 != 0) goto L93
            boolean r1 = r1.f33307d
            if (r1 != 0) goto L93
            goto L26
        L19:
            Zf.e r0 = r1.f33304a
            inet.ipaddr.ipv6.Q r0 = (inet.ipaddr.ipv6.Q) r0
            if (r0 != 0) goto L93
            goto L26
        L20:
            Zf.e r0 = r1.f33306c
            inet.ipaddr.ipv6.Q r0 = (inet.ipaddr.ipv6.Q) r0
            if (r0 != 0) goto L93
        L26:
            monitor-enter(r11)
            bg.d$g r1 = r11.f49612s     // Catch: java.lang.Throwable -> L3a
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L2f
            r4 = r3
            goto L30
        L2f:
            r4 = r2
        L30:
            if (r4 == 0) goto L3c
            bg.d$g r1 = new bg.d$g     // Catch: java.lang.Throwable -> L3a
            r1.<init>()     // Catch: java.lang.Throwable -> L3a
            r11.f49612s = r1     // Catch: java.lang.Throwable -> L3a
            goto L5b
        L3a:
            r12 = move-exception
            goto L87
        L3c:
            if (r12 == 0) goto L54
            if (r13 == 0) goto L4d
            Zf.e r0 = r1.f33305b     // Catch: java.lang.Throwable -> L3a
            inet.ipaddr.ipv6.Q r0 = (inet.ipaddr.ipv6.Q) r0     // Catch: java.lang.Throwable -> L3a
            if (r0 != 0) goto L4b
            boolean r4 = r1.f33307d     // Catch: java.lang.Throwable -> L3a
            if (r4 != 0) goto L4b
        L4a:
            r2 = r3
        L4b:
            r4 = r2
            goto L5b
        L4d:
            Zf.e r0 = r1.f33304a     // Catch: java.lang.Throwable -> L3a
            inet.ipaddr.ipv6.Q r0 = (inet.ipaddr.ipv6.Q) r0     // Catch: java.lang.Throwable -> L3a
            if (r0 != 0) goto L4b
            goto L4a
        L54:
            Zf.e r0 = r1.f33306c     // Catch: java.lang.Throwable -> L3a
            inet.ipaddr.ipv6.Q r0 = (inet.ipaddr.ipv6.Q) r0     // Catch: java.lang.Throwable -> L3a
            if (r0 != 0) goto L4b
            goto L4a
        L5b:
            if (r4 == 0) goto L85
            inet.ipaddr.ipv6.e$a r6 = r11.r3()     // Catch: java.lang.Throwable -> L3a
            inet.ipaddr.ipv6.s r7 = new inet.ipaddr.ipv6.s     // Catch: java.lang.Throwable -> L3a
            r7.<init>()     // Catch: java.lang.Throwable -> L3a
            inet.ipaddr.ipv6.t r8 = new inet.ipaddr.ipv6.t     // Catch: java.lang.Throwable -> L3a
            r8.<init>()     // Catch: java.lang.Throwable -> L3a
            r5 = r11
            r9 = r12
            r10 = r13
            inet.ipaddr.j r0 = inet.ipaddr.j.X1(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L3a
            inet.ipaddr.ipv6.Q r0 = (inet.ipaddr.ipv6.Q) r0     // Catch: java.lang.Throwable -> L3a
            if (r0 != 0) goto L79
            r1.f33307d = r3     // Catch: java.lang.Throwable -> L3a
            goto L85
        L79:
            if (r12 == 0) goto L83
            if (r13 == 0) goto L80
            r1.f33305b = r0     // Catch: java.lang.Throwable -> L3a
            goto L85
        L80:
            r1.f33304a = r0     // Catch: java.lang.Throwable -> L3a
            goto L85
        L83:
            r1.f33306c = r0     // Catch: java.lang.Throwable -> L3a
        L85:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L3a
            goto L93
        L87:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L3a
            throw r12
        L89:
            if (r13 == 0) goto L93
            boolean r12 = r11.h2()
            if (r12 == 0) goto L93
            r12 = 0
            return r12
        L93:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: inet.ipaddr.ipv6.Q.z3(boolean, boolean):inet.ipaddr.ipv6.Q");
    }

    public String z4(g gVar) {
        return A4(gVar, null);
    }

    protected Q(V[] vArr, int i10, boolean z10) {
        this(vArr, i10, z10, true);
    }

    Q(V[] vArr, int i10, boolean z10, boolean z11) {
        super(vArr, z10, true);
        if (z11 && i()) {
            bg.d.A1(F0().intValue(), e2(), 16, 2, new Function() { // from class: inet.ipaddr.ipv6.w
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((V) obj).n3();
                }
            });
        }
        this.f49615v = i10;
        if (i10 >= 0) {
            if (vArr.length + i10 > 8) {
                throw new AddressValueException(i10 + vArr.length);
            }
            return;
        }
        throw new AddressPositionException(i10);
    }

    protected Q(byte[] bArr, int i10, Integer num, boolean z10, boolean z11) {
        this(bArr, 0, bArr.length, i10, num, z10, z11);
    }

    protected Q(byte[] bArr, int i10, int i11, int i12, Integer num, boolean z10, boolean z11) {
        Integer numValueOf;
        super(new V[i12 >= 0 ? i12 : (Math.max(0, i11 - i10) + 1) >> 1], false, false);
        V[] vArrE2 = e2();
        C6208e c6208eE = e();
        bg.d.F1(vArrE2, bArr, i10, i11, e0(), m0(), c6208eE, num);
        boolean z12 = bArr.length == (vArrE2.length << 1);
        if (num != null) {
            if (num.intValue() >= 0) {
                int length = vArrE2.length << 4;
                if (num.intValue() <= length) {
                    numValueOf = num;
                } else if (num.intValue() <= 128) {
                    numValueOf = Integer.valueOf(length);
                } else {
                    throw new PrefixLenException(num.intValue());
                }
                if (vArrE2.length > 0) {
                    if (c6208eE.d().zeroHostsAreSubnets() && !z11) {
                        if (inet.ipaddr.j.l2(vArrE2, numValueOf, c6208eE, false)) {
                            bg.d.D1(c6208eE, numValueOf.intValue(), vArrE2, m0(), e0(), c6208eE.m(), new BiFunction() { // from class: inet.ipaddr.ipv6.O
                                @Override // java.util.function.BiFunction
                                public final Object apply(Object obj, Object obj2) {
                                    return ((V) obj).l3((Integer) obj2);
                                }
                            });
                        } else if (z12 && numValueOf.intValue() >= f()) {
                            e1(z10 ? (byte[]) bArr.clone() : bArr);
                        }
                    } else if ((z12 && c6208eE.d().prefixedSubnetsAreExplicit()) || numValueOf.intValue() >= f()) {
                        e1(z10 ? (byte[]) bArr.clone() : bArr);
                    }
                } else if (z12) {
                    e1(bArr);
                }
                this.f26217c = numValueOf;
            } else {
                throw new PrefixLenException(num.intValue());
            }
        } else {
            this.f26217c = AbstractC3846d.f26211g;
            if (z12) {
                e1(z10 ? (byte[]) bArr.clone() : bArr);
            }
        }
        this.f49615v = 0;
    }
}
