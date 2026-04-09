package inet.ipaddr.ipv4;

import ag.AbstractC3844b;
import ag.AbstractC3846d;
import ag.InterfaceC3848f;
import bg.AbstractC4108a;
import bg.AbstractC4109b;
import bg.d;
import cg.InterfaceC4259c;
import dg.InterfaceC5372b;
import inet.ipaddr.AddressValueException;
import inet.ipaddr.PrefixLenException;
import inet.ipaddr.c;
import inet.ipaddr.g;
import inet.ipaddr.ipv4.C6180b;
import inet.ipaddr.ipv4.C6183e;
import inet.ipaddr.j;
import java.math.BigInteger;
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
public class I extends inet.ipaddr.j implements Iterable {

    /* renamed from: u, reason: collision with root package name */
    private static final long[] f49506u = {0, 255, 65535, 16777215, Counter32.MAX_COUNTER32_VALUE};

    /* renamed from: r, reason: collision with root package name */
    transient c f49507r;

    /* renamed from: s, reason: collision with root package name */
    private transient d.g f49508s;

    /* renamed from: t, reason: collision with root package name */
    private transient Integer f49509t;

    static class a extends I {

        /* renamed from: v, reason: collision with root package name */
        private final inet.ipaddr.j f49510v;

        a(inet.ipaddr.j jVar, M[] mArr) {
            super(mArr, false);
            this.f49510v = jVar;
        }

        @Override // inet.ipaddr.ipv4.I, bg.f
        /* renamed from: G1 */
        public /* bridge */ /* synthetic */ bg.e m1(int i10) {
            return super.V0(i10);
        }

        @Override // inet.ipaddr.ipv4.I, bg.f, ag.AbstractC3846d
        /* renamed from: V0 */
        public /* bridge */ /* synthetic */ AbstractC3844b m1(int i10) {
            return super.V0(i10);
        }

        @Override // inet.ipaddr.ipv4.I, inet.ipaddr.j
        /* renamed from: a2 */
        public /* bridge */ /* synthetic */ inet.ipaddr.k m1(int i10) {
            return super.V0(i10);
        }

        @Override // inet.ipaddr.ipv4.I, Zf.b, cg.d
        public /* bridge */ /* synthetic */ inet.ipaddr.c e() {
            return super.e();
        }

        @Override // inet.ipaddr.ipv4.I, inet.ipaddr.j
        protected /* bridge */ /* synthetic */ inet.ipaddr.k[] e2() {
            return super.e2();
        }

        @Override // inet.ipaddr.ipv4.I, bg.f, ag.InterfaceC3847e, cg.d
        public /* bridge */ /* synthetic */ InterfaceC3848f k(int i10) {
            return super.V0(i10);
        }

        @Override // inet.ipaddr.ipv4.I, bg.f, bg.d
        /* renamed from: m1 */
        public /* bridge */ /* synthetic */ AbstractC4109b k(int i10) {
            return super.V0(i10);
        }

        @Override // inet.ipaddr.ipv4.I, Zf.e
        public /* bridge */ /* synthetic */ Zf.d q(int i10) {
            return super.q(i10);
        }

        @Override // inet.ipaddr.ipv4.I, java.lang.Iterable
        public /* bridge */ /* synthetic */ Spliterator spliterator() {
            return super.spliterator();
        }

        @Override // bg.f, ag.InterfaceC3847e, cg.d
        public boolean x() {
            return this.f49510v.x();
        }

        @Override // inet.ipaddr.ipv4.I, bg.f, cg.d
        public /* bridge */ /* synthetic */ inet.ipaddr.i e() {
            return super.e();
        }

        @Override // inet.ipaddr.ipv4.I, bg.f, ag.InterfaceC3847e, cg.d
        public /* bridge */ /* synthetic */ ag.l k(int i10) {
            return super.V0(i10);
        }

        @Override // inet.ipaddr.ipv4.I, inet.ipaddr.j, inet.ipaddr.l, Zf.e
        public /* bridge */ /* synthetic */ inet.ipaddr.k q(int i10) {
            return super.q(i10);
        }

        @Override // inet.ipaddr.ipv4.I, bg.f, cg.d
        public /* bridge */ /* synthetic */ InterfaceC4259c k(int i10) {
            return super.V0(i10);
        }
    }

    static class b extends d.g {
        b() {
        }
    }

    static class c extends j.b {

        /* renamed from: j, reason: collision with root package name */
        static final j.c f49511j;

        /* renamed from: k, reason: collision with root package name */
        static final j.c f49512k;

        /* renamed from: l, reason: collision with root package name */
        static final j.c f49513l;

        /* renamed from: m, reason: collision with root package name */
        static final j.c f49514m;

        /* renamed from: n, reason: collision with root package name */
        static final j.c f49515n;

        /* renamed from: o, reason: collision with root package name */
        static final j.c f49516o;

        /* renamed from: p, reason: collision with root package name */
        static final j.c f49517p;

        /* renamed from: q, reason: collision with root package name */
        static final j.c f49518q;

        static {
            j.g.a aVar = j.g.a.ALL;
            j.g gVar = new j.g(aVar);
            j.g gVar2 = new j.g(aVar, new d.i.b(inet.ipaddr.a.f49280f, inet.ipaddr.a.f49281g));
            f49511j = new d.a().k(true).r(new j.g(j.g.a.NETWORK_ONLY, new d.i.b(inet.ipaddr.a.f49277c))).u();
            f49512k = new d.a().r(gVar).u();
            f49513l = new d.a().r(gVar2).u();
            d.a aVar2 = new d.a();
            C6180b.EnumC1859b enumC1859b = C6180b.EnumC1859b.OCTAL;
            f49514m = aVar2.l(enumC1859b.getRadix()).n(enumC1859b.getSegmentStrPrefix()).u();
            d.a aVar3 = new d.a();
            C6180b.EnumC1859b enumC1859b2 = C6180b.EnumC1859b.HEX;
            f49515n = aVar3.l(enumC1859b2.getRadix()).n(enumC1859b2.getSegmentStrPrefix()).u();
            f49516o = new d.a().u();
            f49517p = new d.a().r(gVar).m(true).j(".in-addr.arpa").u();
            f49518q = new j.c.a(2).o('.').n("0b").u();
        }

        c() {
        }
    }

    public static class d extends j.c {

        public static class a extends j.c.a {
            public a() {
                this(10, '.');
            }

            @Override // inet.ipaddr.j.c.a
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public d u() {
                return new d(this.f33321c, this.f33320b, this.f49752l, this.f33319a, this.f33322d, this.f33323e, this.f33324f, this.f49751k, this.f33325g, this.f33326h, this.f33327i);
            }

            protected a(int i10, char c10) {
                super(i10, c10);
            }
        }

        protected d(int i10, boolean z10, j.g.a aVar, d.i.b bVar, String str, Character ch2, String str2, String str3, boolean z11, boolean z12, boolean z13) {
            super(i10, z10, aVar, bVar, str, ch2, ' ', str2, str3, z11, z12, z13);
        }
    }

    protected I(M[] mArr, boolean z10, Integer num, boolean z11) {
        this(mArr, z10, num == null);
        if (num != null) {
            if (num.intValue() < 0) {
                throw new PrefixLenException(num.intValue());
            }
            int length = mArr.length << 3;
            if (num.intValue() > length) {
                if (num.intValue() > 32) {
                    throw new PrefixLenException(num.intValue());
                }
                num = Integer.valueOf(length);
            }
            if (mArr.length > 0) {
                Integer num2 = this.f26217c;
                if (num2 != AbstractC3846d.f26211g && num2.intValue() < num.intValue()) {
                    num = this.f26217c;
                }
                C6183e c6183eE = e();
                bg.d.D1(c6183eE, num.intValue(), e2(), m0(), e0(), c6183eE.a(), (z11 || !inet.ipaddr.j.l2(mArr, num, c6183eE, false)) ? new BiFunction() { // from class: inet.ipaddr.ipv4.o
                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj, Object obj2) {
                        return ((M) obj).o3((Integer) obj2);
                    }
                } : new BiFunction() { // from class: inet.ipaddr.ipv4.n
                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj, Object obj2) {
                        return ((M) obj).l3((Integer) obj2);
                    }
                });
            }
            this.f26217c = num;
        }
    }

    private Iterator A3(Predicate predicate) {
        boolean zAllPrefixedAddressesAreSubnets = e().d().allPrefixedAddressesAreSubnets();
        boolean z10 = (A0() || (zAllPrefixedAddressesAreSubnets && i())) ? false : true;
        return bg.d.v1(z10, (!z10 || (predicate != null && predicate.test(e2()))) ? null : this, i3(), z10 ? null : b4(predicate), zAllPrefixedAddressesAreSubnets ? null : A());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int B3(C6180b c6180b, int i10) {
        return c6180b.q(i10).Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ M D3(boolean z10, int i10) {
        return z10 ? q(i10).c3() : q(i10).f3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ M[] E3() {
        return m3().e2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Iterator F3(boolean z10, int i10) {
        return q(i10).g3(!z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int G3(I i10, int i11) {
        return i10.q(i11).Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ M[] H3() {
        return m3().t3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Iterator I3(boolean z10, int i10) {
        return q(i10).g3(!z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ long J3(int i10, Integer num, C6180b c6180b) {
        return bg.d.y1(c6180b.b1(), i10) - c6180b.b1().x2(num.intValue(), i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean K3(Integer num, M[] mArr) {
        return C3(mArr, num.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Iterator L3(final Integer num, boolean z10, boolean z11, C6180b c6180b) {
        return c6180b.b1().z3(c6180b, c6180b.y1(), new Predicate() { // from class: inet.ipaddr.ipv4.t
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return this.f49575a.K3(num, (M[]) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ long M3(int i10, C6180b c6180b) {
        return bg.d.y1(c6180b.b1(), i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Iterator N3(boolean z10, boolean z11, C6180b c6180b) {
        return c6180b.iterator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C6180b O3(C6183e.a aVar, Integer num, M[] mArr) {
        return (C6180b) bg.d.j1(mArr, aVar, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean P3(final C6183e.a aVar, final Integer num, int i10, int i11, AbstractC3846d.e eVar) {
        return bg.d.E1(eVar, new Function() { // from class: inet.ipaddr.ipv4.v
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return I.O3(aVar, num, (M[]) obj);
            }
        }, aVar, ((C6180b) eVar.a()).b1().e2(), i10, i11, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ long Q3(int i10, Integer num, I i11) {
        return bg.d.y1(i11, i10) - i11.x2(num.intValue(), i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean R3(Integer num, M[] mArr) {
        return C3(mArr, num.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Iterator S3(final Integer num, boolean z10, boolean z11, I i10) {
        return i10.A3(new Predicate() { // from class: inet.ipaddr.ipv4.x
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return this.f49582a.R3(num, (M[]) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ long T3(int i10, I i11) {
        return bg.d.y1(i11, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Iterator U3(boolean z10, boolean z11, I i10) {
        return i10.iterator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ I V3(C6183e.a aVar, Integer num, M[] mArr) {
        return (I) bg.d.k1(mArr, aVar, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean W3(final C6183e.a aVar, final Integer num, int i10, int i11, AbstractC3846d.e eVar) {
        return bg.d.E1(eVar, new Function() { // from class: inet.ipaddr.ipv4.z
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return I.V3(aVar, num, (M[]) obj);
            }
        }, aVar, ((I) eVar.a()).e2(), i10, i11, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ M X3(Integer num, int i10) {
        return q(i10).m3(num, true);
    }

    private Iterator b4(Predicate predicate) {
        final boolean zAllPrefixedAddressesAreSubnets = e().d().allPrefixedAddressesAreSubnets();
        return bg.d.B1(Z(), s3(), A0() ? null : new Supplier() { // from class: inet.ipaddr.ipv4.D
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.f49498a.H3();
            }
        }, new IntFunction() { // from class: inet.ipaddr.ipv4.E
            @Override // java.util.function.IntFunction
            public final Object apply(int i10) {
                return this.f49499a.I3(zAllPrefixedAddressesAreSubnets, i10);
            }
        }, predicate);
    }

    private int f3(boolean z10) {
        int iZ = Z();
        int iQ = 0;
        if (iZ != 0) {
            M mQ = q(0);
            iQ = z10 ? mQ.Q() : mQ.w0();
            if (iZ != 1) {
                int iM0 = m0();
                for (int i10 = 1; i10 < iZ; i10++) {
                    M mQ2 = q(i10);
                    iQ = (iQ << iM0) | (z10 ? mQ2.Q() : mQ2.w0());
                }
            }
        }
        return iQ;
    }

    private Predicate h3() {
        if (!i()) {
            return null;
        }
        final int iIntValue = F0().intValue();
        return new Predicate() { // from class: inet.ipaddr.ipv4.u
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return this.f49577a.C3(iIntValue, (M[]) obj);
            }
        };
    }

    private C6183e.a i3() {
        return k3();
    }

    private C6183e.a k3() {
        return e().a();
    }

    private int l3(boolean z10) {
        if (!z10) {
            return f3(false);
        }
        Integer num = this.f49509t;
        if (num != null) {
            return num.intValue();
        }
        int iF3 = f3(true);
        this.f49509t = Integer.valueOf(iF3);
        return iF3;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0029 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private inet.ipaddr.ipv4.I o3(final boolean r12, boolean r13) {
        /*
            r11 = this;
            Zf.e r0 = bg.d.t1(r11)
            inet.ipaddr.ipv4.I r0 = (inet.ipaddr.ipv4.I) r0
            if (r0 != 0) goto L8b
            bg.d$g r1 = r11.f49508s
            if (r1 == 0) goto L28
            if (r12 == 0) goto L22
            if (r13 == 0) goto L1b
            Zf.e r0 = r1.f33305b
            inet.ipaddr.ipv4.I r0 = (inet.ipaddr.ipv4.I) r0
            if (r0 != 0) goto L95
            boolean r1 = r1.f33307d
            if (r1 != 0) goto L95
            goto L28
        L1b:
            Zf.e r0 = r1.f33304a
            inet.ipaddr.ipv4.I r0 = (inet.ipaddr.ipv4.I) r0
            if (r0 != 0) goto L95
            goto L28
        L22:
            Zf.e r0 = r1.f33306c
            inet.ipaddr.ipv4.I r0 = (inet.ipaddr.ipv4.I) r0
            if (r0 != 0) goto L95
        L28:
            monitor-enter(r11)
            bg.d$g r1 = r11.f49508s     // Catch: java.lang.Throwable -> L3c
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L31
            r4 = r3
            goto L32
        L31:
            r4 = r2
        L32:
            if (r4 == 0) goto L3e
            bg.d$g r1 = new bg.d$g     // Catch: java.lang.Throwable -> L3c
            r1.<init>()     // Catch: java.lang.Throwable -> L3c
            r11.f49508s = r1     // Catch: java.lang.Throwable -> L3c
            goto L5d
        L3c:
            r12 = move-exception
            goto L89
        L3e:
            if (r12 == 0) goto L56
            if (r13 == 0) goto L4f
            Zf.e r0 = r1.f33305b     // Catch: java.lang.Throwable -> L3c
            inet.ipaddr.ipv4.I r0 = (inet.ipaddr.ipv4.I) r0     // Catch: java.lang.Throwable -> L3c
            if (r0 != 0) goto L4d
            boolean r4 = r1.f33307d     // Catch: java.lang.Throwable -> L3c
            if (r4 != 0) goto L4d
        L4c:
            r2 = r3
        L4d:
            r4 = r2
            goto L5d
        L4f:
            Zf.e r0 = r1.f33304a     // Catch: java.lang.Throwable -> L3c
            inet.ipaddr.ipv4.I r0 = (inet.ipaddr.ipv4.I) r0     // Catch: java.lang.Throwable -> L3c
            if (r0 != 0) goto L4d
            goto L4c
        L56:
            Zf.e r0 = r1.f33306c     // Catch: java.lang.Throwable -> L3c
            inet.ipaddr.ipv4.I r0 = (inet.ipaddr.ipv4.I) r0     // Catch: java.lang.Throwable -> L3c
            if (r0 != 0) goto L4d
            goto L4c
        L5d:
            if (r4 == 0) goto L87
            inet.ipaddr.ipv4.e$a r6 = r11.i3()     // Catch: java.lang.Throwable -> L3c
            inet.ipaddr.ipv4.p r7 = new inet.ipaddr.ipv4.p     // Catch: java.lang.Throwable -> L3c
            r7.<init>()     // Catch: java.lang.Throwable -> L3c
            inet.ipaddr.ipv4.r r8 = new inet.ipaddr.ipv4.r     // Catch: java.lang.Throwable -> L3c
            r8.<init>()     // Catch: java.lang.Throwable -> L3c
            r5 = r11
            r9 = r12
            r10 = r13
            inet.ipaddr.j r0 = inet.ipaddr.j.X1(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L3c
            inet.ipaddr.ipv4.I r0 = (inet.ipaddr.ipv4.I) r0     // Catch: java.lang.Throwable -> L3c
            if (r0 != 0) goto L7b
            r1.f33307d = r3     // Catch: java.lang.Throwable -> L3c
            goto L87
        L7b:
            if (r12 == 0) goto L85
            if (r13 == 0) goto L82
            r1.f33305b = r0     // Catch: java.lang.Throwable -> L3c
            goto L87
        L82:
            r1.f33304a = r0     // Catch: java.lang.Throwable -> L3c
            goto L87
        L85:
            r1.f33306c = r0     // Catch: java.lang.Throwable -> L3c
        L87:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L3c
            goto L95
        L89:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L3c
            throw r12
        L8b:
            if (r13 == 0) goto L95
            boolean r12 = r11.h2()
            if (r12 == 0) goto L95
            r12 = 0
            return r12
        L95:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: inet.ipaddr.ipv4.I.o3(boolean, boolean):inet.ipaddr.ipv4.I");
    }

    protected static Integer s(int i10) {
        return inet.ipaddr.j.s(i10);
    }

    private C6183e.a s3() {
        return k3();
    }

    @Override // inet.ipaddr.l
    public String V() {
        String str;
        if (!w3() && (str = this.f49507r.f49746b) != null) {
            return str;
        }
        c cVar = this.f49507r;
        String strD2 = D2(c.f49512k);
        cVar.f49746b = strD2;
        return strD2;
    }

    @Override // inet.ipaddr.l
    public String X() {
        return V();
    }

    @Override // Zf.e
    public String Y() {
        String str;
        if (!w3() && (str = this.f49507r.f33308a) != null) {
            return str;
        }
        c cVar = this.f49507r;
        String strD2 = D2(c.f49516o);
        cVar.f33308a = strD2;
        return strD2;
    }

    public long Y3() {
        return x3() & Counter32.MAX_COUNTER32_VALUE;
    }

    @Override // inet.ipaddr.j
    protected BigInteger Z1(int i10) {
        return !A0() ? BigInteger.ONE : BigInteger.valueOf(bg.d.y1(this, i10));
    }

    public I Z3(final I i10, boolean z10) {
        V1(i10);
        return (I) inet.ipaddr.j.f2(this, z10 ? A() : null, i3(), true, new C6195q(this), new IntUnaryOperator() { // from class: inet.ipaddr.ipv4.w
            @Override // java.util.function.IntUnaryOperator
            public final int applyAsInt(int i11) {
                return I.G3(this.f49581a, i11);
            }
        }, false);
    }

    @Override // Zf.b
    public String a0() {
        return Y();
    }

    public I a4(boolean z10) {
        return (I) inet.ipaddr.j.y2(this, z10, i3(), new j.e() { // from class: inet.ipaddr.ipv4.s
            @Override // inet.ipaddr.j.e
            public final Object a(Object obj, int i10) {
                return ((I) obj).q(i10);
            }
        });
    }

    @Override // bg.d, ag.AbstractC3846d
    protected byte[] b0(boolean z10) {
        int iZ = Z();
        byte[] bArr = new byte[iZ];
        for (int i10 = 0; i10 < iZ; i10++) {
            M mQ = q(i10);
            bArr[i10] = (byte) (z10 ? mQ.Q() : mQ.w0());
        }
        return bArr;
    }

    @Override // bg.f, bg.d, ag.AbstractC3846d
    protected boolean c1(AbstractC3846d abstractC3846d) {
        return (abstractC3846d instanceof I) && super.c1(abstractC3846d);
    }

    public Iterator c4() {
        return b4(h3());
    }

    void d3(C6180b c6180b, C6180b c6180b2, C6180b c6180b3) {
        if (!(c6180b2 == null && c6180b3 == null) && bg.d.t1(this) == null) {
            q3().e3(c6180b2 != null ? c6180b2.b1() : null, c6180b3 != null ? c6180b3.b1() : null);
            b bVar = c6180b.f49545p;
            if (bVar == null || ((c6180b2 != null && bVar.f33304a == null) || (c6180b3 != null && bVar.f33306c == null))) {
                synchronized (this) {
                    try {
                        b bVar2 = c6180b.f49545p;
                        if (bVar2 == null) {
                            b bVar3 = new b();
                            c6180b.f49545p = bVar3;
                            bVar3.f33304a = c6180b2;
                            bVar3.f33306c = c6180b3;
                        } else {
                            if (bVar2.f33304a == null) {
                                bVar2.f33304a = c6180b2;
                            }
                            if (bVar2.f33306c == null) {
                                bVar2.f33306c = c6180b3;
                            }
                        }
                    } finally {
                    }
                }
            }
        }
    }

    @Override // java.lang.Iterable
    /* renamed from: d4, reason: merged with bridge method [inline-methods] */
    public InterfaceC5372b spliterator() {
        return f4(false);
    }

    @Override // Zf.e
    public int e0() {
        return 1;
    }

    void e3(I i10, I i11) {
        d.g gVar = this.f49508s;
        if (i10 == null && i11 == null) {
            return;
        }
        if (gVar == null || ((i10 != null && gVar.f33304a == null) || (i11 != null && gVar.f33306c == null))) {
            synchronized (this) {
                try {
                    d.g gVar2 = this.f49508s;
                    if (gVar2 == null) {
                        d.g gVar3 = new d.g();
                        this.f49508s = gVar3;
                        gVar3.f33304a = i10;
                        gVar3.f33306c = i11;
                    } else {
                        if (gVar2.f33304a == null) {
                            gVar2.f33304a = i10;
                        }
                        if (gVar2.f33306c == null) {
                            gVar2.f33306c = i11;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    InterfaceC5372b e4(C6180b c6180b, final C6183e.a aVar, boolean z10) {
        C6180b c6180bT1;
        final Integer num;
        ToLongFunction toLongFunction;
        AbstractC3846d.InterfaceC1014d interfaceC1014d;
        final int iZ = Z();
        final Integer numF0 = F0();
        if (e().d().allPrefixedAddressesAreSubnets()) {
            num = null;
            c6180bT1 = c6180b.t1();
        } else {
            c6180bT1 = c6180b;
            num = numF0;
        }
        if (z10 && h2()) {
            toLongFunction = new ToLongFunction() { // from class: inet.ipaddr.ipv4.i
                @Override // java.util.function.ToLongFunction
                public final long applyAsLong(Object obj) {
                    return I.J3(iZ, numF0, (C6180b) obj);
                }
            };
            interfaceC1014d = new AbstractC3846d.InterfaceC1014d() { // from class: inet.ipaddr.ipv4.j
                @Override // ag.AbstractC3846d.InterfaceC1014d
                public final Iterator a(boolean z11, boolean z12, Object obj) {
                    return this.f49564a.L3(numF0, z11, z12, (C6180b) obj);
                }
            };
        } else {
            toLongFunction = new ToLongFunction() { // from class: inet.ipaddr.ipv4.k
                @Override // java.util.function.ToLongFunction
                public final long applyAsLong(Object obj) {
                    return I.M3(iZ, (C6180b) obj);
                }
            };
            interfaceC1014d = new AbstractC3846d.InterfaceC1014d() { // from class: inet.ipaddr.ipv4.l
                @Override // ag.AbstractC3846d.InterfaceC1014d
                public final Iterator a(boolean z11, boolean z12, Object obj) {
                    return I.N3(z11, z12, (C6180b) obj);
                }
            };
        }
        ToLongFunction toLongFunction2 = toLongFunction;
        final int i10 = iZ - 1;
        return AbstractC3846d.T(c6180bT1, new Predicate() { // from class: inet.ipaddr.ipv4.m
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return I.P3(aVar, num, i10, iZ, (AbstractC3846d.e) obj);
            }
        }, interfaceC1014d, null, null, toLongFunction2);
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof I) && ((I) obj).c1(this));
    }

    @Override // inet.ipaddr.j, ag.InterfaceC3847e, ag.InterfaceC3849g
    public int f() {
        return Z() << 3;
    }

    InterfaceC5372b f4(boolean z10) {
        I iI4;
        final Integer num;
        ToLongFunction toLongFunction;
        AbstractC3846d.InterfaceC1014d interfaceC1014d;
        final int iZ = Z();
        final Integer numF0 = F0();
        final C6183e.a aVarI3 = i3();
        if (e().d().allPrefixedAddressesAreSubnets()) {
            num = null;
            iI4 = i4();
        } else {
            iI4 = this;
            num = numF0;
        }
        if (z10 && h2()) {
            toLongFunction = new ToLongFunction() { // from class: inet.ipaddr.ipv4.F
                @Override // java.util.function.ToLongFunction
                public final long applyAsLong(Object obj) {
                    return I.Q3(iZ, numF0, (I) obj);
                }
            };
            interfaceC1014d = new AbstractC3846d.InterfaceC1014d() { // from class: inet.ipaddr.ipv4.G
                @Override // ag.AbstractC3846d.InterfaceC1014d
                public final Iterator a(boolean z11, boolean z12, Object obj) {
                    return this.f49503a.S3(numF0, z11, z12, (I) obj);
                }
            };
        } else {
            toLongFunction = new ToLongFunction() { // from class: inet.ipaddr.ipv4.H
                @Override // java.util.function.ToLongFunction
                public final long applyAsLong(Object obj) {
                    return I.T3(iZ, (I) obj);
                }
            };
            interfaceC1014d = new AbstractC3846d.InterfaceC1014d() { // from class: inet.ipaddr.ipv4.g
                @Override // ag.AbstractC3846d.InterfaceC1014d
                public final Iterator a(boolean z11, boolean z12, Object obj) {
                    return I.U3(z11, z12, (I) obj);
                }
            };
        }
        final int i10 = iZ - 1;
        return AbstractC3846d.T(iI4, new Predicate() { // from class: inet.ipaddr.ipv4.h
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return I.W3(aVarI3, num, i10, iZ, (AbstractC3846d.e) obj);
            }
        }, interfaceC1014d, null, null, toLongFunction);
    }

    @Override // ag.AbstractC3846d
    protected void g1(InetAddress inetAddress) {
        super.g1(inetAddress);
    }

    I g3(boolean z10) {
        int iIntValue = F0().intValue();
        C6183e c6183eE = e();
        final C6180b c6180b = (C6180b) c6183eE.r(iIntValue);
        return (I) inet.ipaddr.j.f2(this, c6183eE.d().allPrefixedAddressesAreSubnets() ? null : s(iIntValue), i3(), !z10, new C6195q(this), new IntUnaryOperator() { // from class: inet.ipaddr.ipv4.A
            @Override // java.util.function.IntUnaryOperator
            public final int applyAsInt(int i10) {
                return I.B3(c6180b, i10);
            }
        }, true);
    }

    public I g4() {
        Integer numF0 = F0();
        return (numF0 == null || e().d().allPrefixedAddressesAreSubnets()) ? this : h4(numF0.intValue());
    }

    public I h4(int i10) {
        return (I) inet.ipaddr.j.F2(this, i10, i3(), new j.e() { // from class: inet.ipaddr.ipv4.y
            @Override // inet.ipaddr.j.e
            public final Object a(Object obj, int i11) {
                return this.f49584a.X3((Integer) obj, i11);
            }
        });
    }

    public I i4() {
        return a4(false);
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return A3(null);
    }

    @Override // bg.f, bg.d
    /* renamed from: j3, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public M k(int i10) {
        return (M) super.m1(i10);
    }

    @Override // Zf.e
    public int m0() {
        return 8;
    }

    public I m3() {
        return o3(true, false);
    }

    @Override // inet.ipaddr.l
    public g.a n0() {
        return g.a.IPV4;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0020 A[PHI: r1
  0x0020: PHI (r1v1 inet.ipaddr.ipv4.b) = (r1v0 inet.ipaddr.ipv4.b), (r1v16 inet.ipaddr.ipv4.b) binds: [B:9:0x000d, B:16:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    inet.ipaddr.ipv4.C6180b n3(inet.ipaddr.ipv4.C6180b r7, boolean r8, boolean r9) {
        /*
            r6 = this;
            inet.ipaddr.ipv4.I r0 = r6.o3(r8, r9)
            if (r0 != r6) goto L7
            return r7
        L7:
            r1 = 0
            if (r0 != 0) goto Lb
            return r1
        Lb:
            inet.ipaddr.ipv4.I$b r2 = r7.f49545p
            if (r2 == 0) goto L20
            if (r8 == 0) goto L1b
            if (r9 == 0) goto L18
            Zf.e r1 = r2.f33305b
        L15:
            inet.ipaddr.ipv4.b r1 = (inet.ipaddr.ipv4.C6180b) r1
            goto L1e
        L18:
            Zf.e r1 = r2.f33304a
            goto L15
        L1b:
            Zf.e r1 = r2.f33306c
            goto L15
        L1e:
            if (r1 != 0) goto L6c
        L20:
            monitor-enter(r6)
            inet.ipaddr.ipv4.I$b r2 = r7.f49545p     // Catch: java.lang.Throwable -> L34
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L29
            r5 = r4
            goto L2a
        L29:
            r5 = r3
        L2a:
            if (r5 == 0) goto L36
            inet.ipaddr.ipv4.I$b r2 = new inet.ipaddr.ipv4.I$b     // Catch: java.lang.Throwable -> L34
            r2.<init>()     // Catch: java.lang.Throwable -> L34
            r7.f49545p = r2     // Catch: java.lang.Throwable -> L34
            goto L54
        L34:
            r7 = move-exception
            goto L6d
        L36:
            if (r8 == 0) goto L4c
            if (r9 == 0) goto L44
            Zf.e r7 = r2.f33305b     // Catch: java.lang.Throwable -> L34
            r1 = r7
            inet.ipaddr.ipv4.b r1 = (inet.ipaddr.ipv4.C6180b) r1     // Catch: java.lang.Throwable -> L34
            if (r1 != 0) goto L42
        L41:
            r3 = r4
        L42:
            r5 = r3
            goto L54
        L44:
            Zf.e r7 = r2.f33304a     // Catch: java.lang.Throwable -> L34
            r1 = r7
            inet.ipaddr.ipv4.b r1 = (inet.ipaddr.ipv4.C6180b) r1     // Catch: java.lang.Throwable -> L34
            if (r1 != 0) goto L42
            goto L41
        L4c:
            Zf.e r7 = r2.f33306c     // Catch: java.lang.Throwable -> L34
            r1 = r7
            inet.ipaddr.ipv4.b r1 = (inet.ipaddr.ipv4.C6180b) r1     // Catch: java.lang.Throwable -> L34
            if (r1 != 0) goto L42
            goto L41
        L54:
            if (r5 == 0) goto L6b
            inet.ipaddr.ipv4.e$a r7 = r6.i3()     // Catch: java.lang.Throwable -> L34
            inet.ipaddr.ipv4.b r7 = r7.E(r0)     // Catch: java.lang.Throwable -> L34
            if (r8 == 0) goto L68
            if (r9 == 0) goto L65
            r2.f33305b = r7     // Catch: java.lang.Throwable -> L34
            goto L6a
        L65:
            r2.f33304a = r7     // Catch: java.lang.Throwable -> L34
            goto L6a
        L68:
            r2.f33306c = r7     // Catch: java.lang.Throwable -> L34
        L6a:
            r1 = r7
        L6b:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L34
        L6c:
            return r1
        L6d:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L34
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: inet.ipaddr.ipv4.I.n3(inet.ipaddr.ipv4.b, boolean, boolean):inet.ipaddr.ipv4.b");
    }

    @Override // bg.f, cg.d
    /* renamed from: p3, reason: merged with bridge method [inline-methods] */
    public C6183e e() {
        return inet.ipaddr.a.j();
    }

    public I q3() {
        return this;
    }

    @Override // inet.ipaddr.l
    public String r0() {
        String str;
        if (!w3() && (str = this.f49507r.f49747c) != null) {
            return str;
        }
        c cVar = this.f49507r;
        String strD2 = D2(c.f49511j);
        cVar.f49747c = strD2;
        return strD2;
    }

    @Override // inet.ipaddr.j, inet.ipaddr.l, Zf.e
    /* renamed from: r3, reason: merged with bridge method [inline-methods] */
    public M q(int i10) {
        return (M) super.q(i10);
    }

    public M[] t3() {
        return (M[]) X0().clone();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // inet.ipaddr.j
    /* renamed from: u3, reason: merged with bridge method [inline-methods] */
    public M[] e2() {
        return (M[]) super.X0();
    }

    @Override // ag.InterfaceC3849g
    public int v0() {
        return Z();
    }

    public I v3() {
        return o3(false, false);
    }

    protected boolean w3() {
        if (this.f49507r != null) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f49507r != null) {
                    return false;
                }
                this.f49507r = new c();
                return true;
            } finally {
            }
        }
    }

    @Override // inet.ipaddr.j, Zf.c
    public boolean x0(Zf.c cVar) {
        return (cVar instanceof I) && super.x0(cVar);
    }

    public int x3() {
        return l3(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: y3, reason: merged with bridge method [inline-methods] */
    public boolean C3(M[] mArr, int i10) {
        return super.o2(mArr, i10);
    }

    Iterator z3(C6180b c6180b, AbstractC4108a abstractC4108a, Predicate predicate) {
        Iterator itB1;
        final boolean zAllPrefixedAddressesAreSubnets = e().d().allPrefixedAddressesAreSubnets();
        boolean z10 = (A0() || (zAllPrefixedAddressesAreSubnets && i())) ? false : true;
        if (z10 && predicate != null && predicate.test(c6180b.b1().e2())) {
            c6180b = null;
        }
        if (z10) {
            itB1 = null;
        } else {
            itB1 = bg.d.B1(Z(), abstractC4108a, A0() ? null : new Supplier() { // from class: inet.ipaddr.ipv4.B
                @Override // java.util.function.Supplier
                public final Object get() {
                    return this.f49495a.E3();
                }
            }, new IntFunction() { // from class: inet.ipaddr.ipv4.C
                @Override // java.util.function.IntFunction
                public final Object apply(int i10) {
                    return this.f49496a.F3(zAllPrefixedAddressesAreSubnets, i10);
                }
            }, predicate);
        }
        return bg.d.w1(z10, c6180b, abstractC4108a, itB1, zAllPrefixedAddressesAreSubnets ? null : A());
    }

    protected I(M[] mArr, boolean z10) {
        this(mArr, z10, true);
    }

    I(M[] mArr, boolean z10, boolean z11) {
        super(mArr, z10, true);
        if (z11 && i()) {
            bg.d.A1(F0().intValue(), e2(), 8, 1, new Function() { // from class: inet.ipaddr.ipv4.f
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((M) obj).n3();
                }
            });
        }
        if (mArr.length > 4) {
            throw new AddressValueException(mArr.length);
        }
    }

    protected I(byte[] bArr, int i10, Integer num, boolean z10, boolean z11) {
        this(bArr, 0, bArr.length, i10, num, z10, z11);
    }

    protected I(byte[] bArr, int i10, int i11, int i12, Integer num, boolean z10, boolean z11) {
        Integer numValueOf;
        super(new M[i12 >= 0 ? i12 : Math.max(0, i11 - i10)], false, false);
        M[] mArrE2 = e2();
        C6183e c6183eE = e();
        bg.d.F1(mArrE2, bArr, i10, i11, e0(), m0(), c6183eE, num);
        boolean z12 = bArr.length == mArrE2.length;
        if (num != null) {
            if (num.intValue() >= 0) {
                int length = mArrE2.length << 3;
                if (num.intValue() <= length) {
                    numValueOf = num;
                } else if (num.intValue() <= 32) {
                    numValueOf = Integer.valueOf(length);
                } else {
                    throw new PrefixLenException(num.intValue());
                }
                if (mArrE2.length > 0) {
                    c.b bVarD = c6183eE.d();
                    if (bVarD.zeroHostsAreSubnets()) {
                        if (inet.ipaddr.j.l2(mArrE2, numValueOf, c6183eE, false) && !z11) {
                            bg.d.D1(c6183eE, numValueOf.intValue(), mArrE2, m0(), e0(), c6183eE.a(), new BiFunction() { // from class: inet.ipaddr.ipv4.n
                                @Override // java.util.function.BiFunction
                                public final Object apply(Object obj, Object obj2) {
                                    return ((M) obj).l3((Integer) obj2);
                                }
                            });
                        } else if (z12 && numValueOf.intValue() >= f()) {
                            e1(z10 ? (byte[]) bArr.clone() : bArr);
                        }
                    } else if (z12 && (bVarD.prefixedSubnetsAreExplicit() || numValueOf.intValue() >= f())) {
                        e1(z10 ? (byte[]) bArr.clone() : bArr);
                    }
                } else if (z12) {
                    e1(bArr);
                }
                this.f26217c = numValueOf;
                return;
            }
            throw new PrefixLenException(num.intValue());
        }
        this.f26217c = AbstractC3846d.f26211g;
        if (z12) {
            e1(z10 ? (byte[]) bArr.clone() : bArr);
        }
    }

    protected I(byte[] bArr, int i10, int i11, int i12, Integer num) {
        this(bArr, i10, i11, i12, num, true, false);
    }
}
