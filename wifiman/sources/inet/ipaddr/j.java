package inet.ipaddr;

import ag.AbstractC3846d;
import ag.InterfaceC3843a;
import ag.InterfaceC3847e;
import bg.AbstractC4108a;
import bg.d;
import bg.f;
import inet.ipaddr.a;
import inet.ipaddr.b;
import inet.ipaddr.c;
import inet.ipaddr.format.validate.r;
import inet.ipaddr.g;
import inet.ipaddr.i;
import inet.ipaddr.m;
import java.math.BigInteger;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import java.util.function.ToLongFunction;

/* loaded from: classes4.dex */
public abstract class j extends bg.f implements l, Zf.c {

    /* renamed from: n, reason: collision with root package name */
    private static final cg.d[] f49734n = new cg.d[0];

    /* renamed from: o, reason: collision with root package name */
    static final Comparator f49735o = new Comparator() { // from class: Zf.g
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return inet.ipaddr.j.w2((inet.ipaddr.l) obj, (inet.ipaddr.l) obj2);
        }
    };

    /* renamed from: p, reason: collision with root package name */
    private static final b.C1856b f49736p = new b.C1856b(true, false, true);

    /* renamed from: q, reason: collision with root package name */
    private static final b.C1856b f49737q = new b.C1856b(true, true, true);

    /* renamed from: m, reason: collision with root package name */
    private transient d f49738m;

    /* JADX INFO: Access modifiers changed from: protected */
    public static class b extends d.h {

        /* renamed from: d, reason: collision with root package name */
        public static final c f49740d;

        /* renamed from: e, reason: collision with root package name */
        public static final c f49741e;

        /* renamed from: f, reason: collision with root package name */
        public static final c f49742f;

        /* renamed from: g, reason: collision with root package name */
        public static final c f49743g;

        /* renamed from: h, reason: collision with root package name */
        public static final c f49744h;

        /* renamed from: i, reason: collision with root package name */
        public static final c f49745i;

        /* renamed from: b, reason: collision with root package name */
        public String f49746b;

        /* renamed from: c, reason: collision with root package name */
        public String f49747c;

        static {
            g gVar = new g(g.a.ALL);
            f49740d = new c.a(16).o(null).k(true).r(gVar).u();
            f49741e = new c.a(16).o(null).k(true).r(gVar).i("0x").u();
            f49742f = new c.a(8).o(null).k(true).r(gVar).u();
            f49743g = new c.a(8).o(null).k(true).r(gVar).i("0").u();
            f49744h = new c.a(2).o(null).k(true).r(gVar).u();
            f49745i = new c.a(10, ' ').u();
        }

        protected b() {
        }
    }

    public static class c extends d.i {

        /* renamed from: k, reason: collision with root package name */
        public final String f49748k;

        /* renamed from: l, reason: collision with root package name */
        public final g.a f49749l;

        /* renamed from: m, reason: collision with root package name */
        public final char f49750m;

        public static class a extends d.i.a {

            /* renamed from: k, reason: collision with root package name */
            protected String f49751k;

            /* renamed from: l, reason: collision with root package name */
            protected g.a f49752l;

            /* renamed from: m, reason: collision with root package name */
            protected char f49753m;

            public a(int i10) {
                this(i10, ' ');
            }

            public a i(String str) {
                return (a) super.a(str);
            }

            public a j(String str) {
                this.f49751k = str;
                return this;
            }

            public a k(boolean z10) {
                return (a) super.b(z10);
            }

            public a l(int i10) {
                return (a) super.c(i10);
            }

            public a m(boolean z10) {
                return (a) super.d(z10);
            }

            public a n(String str) {
                return (a) super.e(str);
            }

            public a o(Character ch2) {
                return (a) super.f(ch2);
            }

            public a p(boolean z10) {
                return (a) super.g(z10);
            }

            public a q(g.a aVar) {
                this.f49752l = aVar;
                return this;
            }

            public a r(g gVar) {
                q(gVar.f49759a);
                return s(gVar.f49760b);
            }

            public a s(d.i.b bVar) {
                return (a) super.h(bVar);
            }

            public a t(char c10) {
                this.f49753m = c10;
                return this;
            }

            public c u() {
                return new c(this.f33321c, this.f33320b, this.f49752l, this.f33319a, this.f33322d, this.f33323e, this.f49753m, this.f33324f, this.f49751k, this.f33325g, this.f33326h, this.f33327i);
            }

            protected a(int i10, char c10) {
                super(i10, c10);
                this.f49751k = "";
                this.f49752l = g.a.NETWORK_ONLY;
                this.f49753m = '%';
            }
        }

        protected c(int i10, boolean z10, g.a aVar, d.i.b bVar, String str, Character ch2, char c10, String str2, String str3, boolean z11, boolean z12, boolean z13) {
            super(i10, z10, bVar, str, ch2, str2, z11, z12, z13);
            this.f49748k = str3;
            this.f49749l = aVar;
            this.f49750m = c10;
        }
    }

    protected static class d {

        /* renamed from: a, reason: collision with root package name */
        private Integer f49754a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f49755b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f49756c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f49757d;

        /* renamed from: e, reason: collision with root package name */
        private Boolean f49758e;

        protected d() {
        }
    }

    public interface e {
        Object a(Object obj, int i10);
    }

    interface f extends AbstractC3846d.InterfaceC1014d {
    }

    public static class g {

        /* renamed from: a, reason: collision with root package name */
        public final a f49759a;

        /* renamed from: b, reason: collision with root package name */
        public final d.i.b f49760b;

        public enum a {
            NETWORK_ONLY,
            ALL
        }

        public g(a aVar) {
            this(aVar, new d.i.b());
        }

        public g(a aVar, d.i.b bVar) {
            this.f49759a = aVar;
            this.f49760b = bVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected j(k[] kVarArr, boolean z10, boolean z11) {
        super(z10 ? (bg.e[]) kVarArr.clone() : kVarArr, false);
        int i10 = 0;
        if (z11) {
            i iVarE = e();
            int iM0 = m0();
            Integer num = null;
            while (i10 < kVarArr.length) {
                k kVar = kVarArr[i10];
                if (!iVarE.g(kVar.e())) {
                    throw new NetworkMismatchException(kVar);
                }
                Integer numA2 = kVar.A2();
                if (num == null) {
                    if (numA2 != null) {
                        this.f26217c = s(bg.d.o1(iM0, numA2.intValue(), i10));
                    }
                } else if (numA2 == null || numA2.intValue() != 0) {
                    throw new InconsistentPrefixException(kVarArr[i10 - 1], kVar, numA2);
                }
                i10++;
                num = numA2;
            }
            if (num == null) {
                this.f26217c = AbstractC3846d.f26211g;
            }
        }
    }

    private Integer A2(Integer num) {
        if (num == null) {
            return this.f49738m.f49754a = AbstractC3846d.f26211g;
        }
        this.f49738m.f49754a = num;
        this.f49738m.f49755b = AbstractC3846d.f26211g;
        return num;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static AbstractC3846d.c B2(c cVar) {
        AbstractC3846d.c cVar2 = (AbstractC3846d.c) AbstractC3846d.K0(cVar);
        if (cVar2 != null) {
            return cVar2;
        }
        AbstractC3846d.c cVar3 = new AbstractC3846d.c(cVar.f33311d, cVar.f33313f, cVar.f33317j);
        cVar3.u(cVar.f33310c);
        cVar3.O(cVar.f33309b);
        cVar3.g0(cVar.f49749l);
        cVar3.K(cVar.f33312e);
        cVar3.f0(cVar.f49748k);
        cVar3.G(cVar.f33314g);
        cVar3.I(cVar.f33315h);
        cVar3.M(cVar.f33316i);
        cVar3.P(cVar.f49750m);
        AbstractC3846d.f1(cVar, cVar3);
        return cVar3;
    }

    public static String E2(c cVar, cg.d dVar) {
        return B2(cVar).Q(dVar);
    }

    protected static j F2(j jVar, int i10, i.a aVar, e eVar) {
        if (i10 < 0 || i10 > jVar.f()) {
            throw new PrefixLenException(jVar, i10);
        }
        if (jVar.k2(i10)) {
            return jVar;
        }
        int iM0 = jVar.m0();
        int iZ = jVar.Z();
        k[] kVarArr = (k[]) aVar.d(iZ);
        for (int i11 = 0; i11 < iZ; i11++) {
            kVarArr[i11] = (k) eVar.a(q1(iM0, i10, i11), i11);
        }
        return aVar.t(kVarArr);
    }

    protected static f.c H1() {
        return bg.f.H1();
    }

    protected static f.c I1(int i10, int i11) {
        return bg.f.I1(i10, i11);
    }

    public static int S1(g.a aVar) {
        return k.u2(aVar);
    }

    public static int T1(g.a aVar) {
        return k.u2(aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0044, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.Integer U1(boolean r9) {
        /*
            r8 = this;
            int r0 = r8.Z()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            r2 = 0
            inet.ipaddr.k r3 = r8.q(r2)
            int r3 = r3.I0()
            if (r9 == 0) goto L15
            r4 = r2
            goto L17
        L15:
            r4 = r3
            r3 = r2
        L17:
            r5 = r2
        L18:
            if (r2 >= r0) goto L47
            inet.ipaddr.k r6 = r8.q(r2)
            int r7 = r6.Q()
            if (r7 == r3) goto L3f
            java.lang.Integer r6 = r6.l2(r9)
            if (r6 != 0) goto L2b
            return r1
        L2b:
            int r6 = r6.intValue()
            int r5 = r5 + r6
        L30:
            int r2 = r2 + 1
            if (r2 >= r0) goto L44
            inet.ipaddr.k r6 = r8.q(r2)
            int r6 = r6.Q()
            if (r6 == r4) goto L30
            return r1
        L3f:
            int r6 = r6.f()
            int r5 = r5 + r6
        L44:
            int r2 = r2 + 1
            goto L18
        L47:
            java.lang.Integer r9 = s(r5)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: inet.ipaddr.j.U1(boolean):java.lang.Integer");
    }

    protected static j W1(i.a aVar, k[] kVarArr, j jVar) {
        return aVar.d0(jVar, kVarArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected static inet.ipaddr.j X1(inet.ipaddr.j r2, inet.ipaddr.i.a r3, java.util.function.Supplier r4, java.util.function.IntFunction r5, boolean r6, boolean r7) {
        /*
            r0 = 1
            r1 = 0
            if (r6 == 0) goto L23
            if (r7 == 0) goto L23
            boolean r6 = r2.h2()
            if (r6 == 0) goto L23
            java.lang.Object r4 = r4.get()
            java.util.Iterator r4 = (java.util.Iterator) r4
            boolean r5 = r4.hasNext()
            if (r5 != 0) goto L1b
            r4 = 0
            r5 = r1
            goto L2b
        L1b:
            java.lang.Object r4 = r4.next()
            inet.ipaddr.k[] r4 = (inet.ipaddr.k[]) r4
            r5 = r4
            goto L2a
        L23:
            Zf.d[] r4 = bg.d.l1(r2, r3, r5)
            r5 = r4
            inet.ipaddr.k[] r5 = (inet.ipaddr.k[]) r5
        L2a:
            r4 = r0
        L2b:
            if (r4 == 0) goto L4d
            inet.ipaddr.i r4 = r2.e()
            inet.ipaddr.c$b r4 = r4.d()
            boolean r4 = r4.allPrefixedAddressesAreSubnets()
            if (r4 != 0) goto L48
            java.lang.Integer r2 = r2.F0()
            if (r2 != 0) goto L42
            goto L48
        L42:
            inet.ipaddr.j r2 = r3.r(r5, r2, r0)
        L46:
            r1 = r2
            goto L4d
        L48:
            inet.ipaddr.j r2 = r3.t(r5)
            goto L46
        L4d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: inet.ipaddr.j.X1(inet.ipaddr.j, inet.ipaddr.i$a, java.util.function.Supplier, java.util.function.IntFunction, boolean, boolean):inet.ipaddr.j");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int b2(int i10, int i11, int i12) {
        return inet.ipaddr.format.validate.g.c(i10, i11, i12);
    }

    protected static j f2(j jVar, Integer num, i.a aVar, boolean z10, IntFunction intFunction, IntUnaryOperator intUnaryOperator, boolean z11) {
        int i10;
        int i11;
        int iA;
        int iC;
        int i12;
        boolean z12;
        int iA2;
        int iC2;
        IntFunction intFunction2 = intFunction;
        IntUnaryOperator intUnaryOperator2 = intUnaryOperator;
        if (num != null && (num.intValue() < 0 || num.intValue() > jVar.f())) {
            throw new PrefixLenException(jVar, num.intValue());
        }
        int iM0 = jVar.m0();
        int iZ = jVar.Z();
        boolean z13 = jVar.e().d().allPrefixedAddressesAreSubnets() && !z11;
        int i13 = 0;
        while (i13 < iZ) {
            Integer numS1 = s1(iM0, num, i13);
            k kVar = (k) intFunction2.apply(i13);
            int iApplyAsInt = intUnaryOperator2.applyAsInt(i13);
            int iQ = kVar.Q();
            int iW0 = kVar.w0();
            if (z10) {
                if (z13 && numS1 != null) {
                    iApplyAsInt |= kVar.y2(numS1.intValue());
                }
                long j10 = iQ;
                i10 = iM0;
                i11 = iZ;
                long j11 = iW0;
                long j12 = iApplyAsInt;
                r.j jVarD2 = k.d2(j10, j11, j12, kVar.X1());
                if (!jVarD2.d()) {
                    throw new IncompatibleAddressException(kVar, "ipaddress.error.maskMismatch");
                }
                iA = (int) jVarD2.a(j10, j12);
                iC = (int) jVarD2.c(j11, j12);
            } else {
                i10 = iM0;
                i11 = iZ;
                iA = iQ & iApplyAsInt;
                iC = iW0 & iApplyAsInt;
            }
            if (kVar.G2(iA, iC, numS1)) {
                k[] kVarArr = (k[]) aVar.d(jVar.Z());
                jVar.d2(0, i13, kVarArr, 0);
                kVarArr[i13] = (k) aVar.c(iA, iC, numS1);
                if (!z13 || numS1 == null) {
                    int i14 = i11;
                    int i15 = i13 + 1;
                    while (true) {
                        if (i15 >= i14) {
                            break;
                        }
                        int i16 = i10;
                        Integer numS12 = s1(i16, num, i15);
                        k kVar2 = (k) intFunction2.apply(i15);
                        int iApplyAsInt2 = intUnaryOperator.applyAsInt(i15);
                        int iQ2 = kVar2.Q();
                        int iW02 = kVar2.w0();
                        if (z10) {
                            if (z13 && numS12 != null) {
                                iApplyAsInt2 |= kVar2.y2(numS12.intValue());
                            }
                            i12 = i14;
                            long j13 = iQ2;
                            long j14 = iW02;
                            z12 = z13;
                            long j15 = iApplyAsInt2;
                            r.j jVarD22 = k.d2(j13, j14, j15, kVar2.X1());
                            if (!jVarD22.d()) {
                                throw new IncompatibleAddressException(kVar2, "ipaddress.error.maskMismatch");
                            }
                            iA2 = (int) jVarD22.a(j13, j15);
                            iC2 = (int) jVarD22.c(j14, j15);
                        } else {
                            i12 = i14;
                            z12 = z13;
                            iA2 = iQ2 & iApplyAsInt2;
                            iC2 = iW02 & iApplyAsInt2;
                        }
                        if (kVar2.G2(iA2, iC2, numS12)) {
                            kVarArr[i15] = (k) aVar.c(iA2, iC2, numS12);
                        } else {
                            kVarArr[i15] = kVar2;
                        }
                        if (!z12 || numS12 == null) {
                            i14 = i12;
                            i15++;
                            intFunction2 = intFunction;
                            i10 = i16;
                            z13 = z12;
                        } else {
                            int i17 = i15 + 1;
                            int i18 = i12;
                            if (i17 < i18) {
                                Arrays.fill(kVarArr, i17, i18, (k) aVar.g(0, s(0)));
                            }
                        }
                    }
                } else {
                    int i19 = i13 + 1;
                    int i20 = i11;
                    if (i19 < i20) {
                        Arrays.fill(kVarArr, i19, i20, (k) aVar.g(0, s(0)));
                    }
                }
                return aVar.r(kVarArr, num, z11);
            }
            i13++;
            intFunction2 = intFunction;
            iZ = i11;
            iM0 = i10;
            z13 = z13;
            intUnaryOperator2 = intUnaryOperator;
        }
        return jVar;
    }

    private boolean g2() {
        if (this.f49738m != null) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f49738m != null) {
                    return false;
                }
                this.f49738m = new d();
                return true;
            } finally {
            }
        }
    }

    protected static boolean l2(final k[] kVarArr, Integer num, i iVar, boolean z10) {
        int length = kVarArr.length;
        if (length == 0) {
            return false;
        }
        k kVar = kVarArr[0];
        return inet.ipaddr.format.validate.g.h(new a.InterfaceC1855a() { // from class: Zf.j
            @Override // inet.ipaddr.a.InterfaceC1855a
            public final int a(int i10) {
                return inet.ipaddr.j.r2(kVarArr, i10);
            }
        }, new a.InterfaceC1855a() { // from class: Zf.k
            @Override // inet.ipaddr.a.InterfaceC1855a
            public final int a(int i10) {
                return inet.ipaddr.j.s2(kVarArr, i10);
            }
        }, length, kVar.v0(), kVar.f(), kVar.I0(), num, iVar.d(), z10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x003c, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected static boolean n2(int r6, inet.ipaddr.k[] r7, int r8, int r9, int r10) {
        /*
            int r0 = r7.length
            r1 = 0
            if (r0 != 0) goto L5
            return r1
        L5:
            if (r6 < r10) goto L8
            return r1
        L8:
            int r10 = r7.length
            int r8 = b2(r6, r8, r9)
            r0 = r8
        Le:
            r2 = 1
            if (r0 >= r10) goto L3e
            java.lang.Integer r3 = q1(r9, r6, r8)
            r4 = r7[r0]
            if (r3 == 0) goto L3c
            int r3 = r3.intValue()
            int r3 = r4.y2(r3)
            boolean r5 = r4.A0()
            if (r5 != 0) goto L3b
            int r4 = r4.Q()
            r3 = r3 & r4
            if (r3 == 0) goto L2f
            goto L3b
        L2f:
            int r0 = r0 + 1
            if (r0 >= r10) goto L3c
            r3 = r7[r0]
            boolean r3 = r3.c0()
            if (r3 != 0) goto L2f
        L3b:
            return r1
        L3c:
            int r0 = r0 + r2
            goto Le
        L3e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: inet.ipaddr.j.n2(int, inet.ipaddr.k[], int, int, int):boolean");
    }

    protected static int p1(int i10, int i11, int i12) {
        return inet.ipaddr.format.validate.g.e(i10, i11, i12);
    }

    static Iterator p2(int i10, c.a aVar, IntFunction intFunction, int i11, int i12, IntFunction intFunction2) {
        return bg.d.C1(i10, aVar, null, intFunction, null, i11, i12, intFunction2);
    }

    protected static Integer q1(int i10, int i11, int i12) {
        return bg.d.q1(i10, i11, i12);
    }

    static Iterator q2(inet.ipaddr.a aVar, AbstractC4108a abstractC4108a, Iterator it) {
        return bg.d.w1(aVar != null, aVar, abstractC4108a, it, null);
    }

    protected static Integer r1(int i10, int i11) {
        return bg.d.r1(i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int r2(k[] kVarArr, int i10) {
        return kVarArr[i10].Q();
    }

    protected static Integer s(int i10) {
        return bg.d.s(i10);
    }

    protected static Integer s1(int i10, Integer num, int i11) {
        return bg.d.s1(i10, num, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int s2(k[] kVarArr, int i10) {
        return kVarArr[i10].w0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ int t2(int i10, int i11, int i12, int i13) {
        if (i13 != i10) {
            return q(i13).C2();
        }
        k kVarQ = q(i13);
        int iF = kVarQ.f() - q1(i11, i12, i13).intValue();
        return ((kVarQ.w0() >>> iF) - (kVarQ.Q() >>> iF)) + 1;
    }

    protected static boolean u1(inet.ipaddr.c cVar, inet.ipaddr.c cVar2) {
        return bg.d.u1(cVar, cVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int u2(e eVar, j jVar, int i10) {
        return ((k) eVar.a(jVar, i10)).Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ k v2(e eVar, j jVar, int i10) {
        return (k) eVar.a(jVar, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int w2(l lVar, l lVar2) {
        Integer numA = lVar.A();
        Integer numA2 = lVar2.A();
        int iCompareTo = numA == numA2 ? 0 : numA == null ? -1 : numA2 == null ? 1 : numA2.compareTo(numA);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (numA == null || numA.intValue() != 0) {
            int iZ = numA == null ? lVar.Z() - 1 : p1(numA.intValue(), lVar.e0(), lVar.m0());
            int iZ2 = numA == null ? lVar.Z() : b2(numA.intValue(), lVar.e0(), lVar.m0());
            for (int i10 = 0; i10 < iZ2; i10++) {
                k kVarQ = lVar.q(i10);
                k kVarQ2 = lVar2.q(i10);
                iCompareTo = (kVarQ.w0() - kVarQ.Q()) - (kVarQ2.w0() - kVarQ2.Q());
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            }
            for (int i11 = 0; i11 <= iZ; i11++) {
                iCompareTo = lVar.q(i11).Q() - lVar2.q(i11).Q();
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            }
        }
        return iCompareTo;
    }

    protected static void y(InterfaceC3847e interfaceC3847e, int i10) {
        AbstractC3846d.y(interfaceC3847e, i10);
    }

    protected static j y2(final j jVar, boolean z10, i.a aVar, final e eVar) {
        if (!jVar.i()) {
            return jVar;
        }
        final j jVarT = aVar.e().t(z10 ? jVar.A().intValue() : jVar.f());
        return f2(jVar, null, aVar, z10, new IntFunction() { // from class: Zf.h
            @Override // java.util.function.IntFunction
            public final Object apply(int i10) {
                return inet.ipaddr.j.v2(eVar, jVar, i10);
            }
        }, new IntUnaryOperator() { // from class: Zf.i
            @Override // java.util.function.IntUnaryOperator
            public final int applyAsInt(int i10) {
                return inet.ipaddr.j.u2(eVar, jVarT, i10);
            }
        }, false);
    }

    private Integer z2(Integer num) {
        if (num == null) {
            return this.f49738m.f49755b = AbstractC3846d.f26211g;
        }
        this.f49738m.f49755b = num;
        this.f49738m.f49754a = AbstractC3846d.f26211g;
        return num;
    }

    @Override // bg.f, ag.InterfaceC3849g
    public boolean B0(int i10) {
        int iH;
        int iM0;
        int iB2;
        y(this, i10);
        boolean zAllPrefixedAddressesAreSubnets = e().d().allPrefixedAddressesAreSubnets();
        if ((!zAllPrefixedAddressesAreSubnets || !i() || F0().intValue() > i10) && (iB2 = b2(i10, e0(), (iM0 = m0()))) < (iH = H())) {
            k kVarA2 = m1(iB2);
            if (!kVarA2.B0(q1(iM0, i10, iB2).intValue())) {
                return false;
            }
            if (zAllPrefixedAddressesAreSubnets && kVarA2.i()) {
                return true;
            }
            for (int i11 = iB2 + 1; i11 < iH; i11++) {
                k kVarA22 = m1(i11);
                if (!kVarA22.w()) {
                    return false;
                }
                if (zAllPrefixedAddressesAreSubnets && kVarA22.i()) {
                    return true;
                }
            }
        }
        return true;
    }

    InetAddress C2(inet.ipaddr.g gVar) {
        InetAddress inetAddress;
        if (!a1() && (inetAddress = this.f26215a.f26254e) != null) {
            return inetAddress;
        }
        AbstractC3846d.g gVar2 = this.f26215a;
        InetAddress inetAddressQ1 = gVar.q1();
        gVar2.f26254e = inetAddressQ1;
        return inetAddressQ1;
    }

    public String D2(c cVar) {
        return E2(cVar, this);
    }

    @Override // ag.AbstractC3846d
    public BigInteger U0() {
        return Z1(Z());
    }

    protected void V1(j jVar) {
        if (jVar.Z() < Z()) {
            throw new SizeMismatchException(this, jVar);
        }
    }

    public Integer Y1(boolean z10) {
        Integer numZ2;
        if (z10) {
            if (g2() || (numZ2 = this.f49738m.f49754a) == null) {
                numZ2 = A2(U1(z10));
            }
        } else if (g2() || (numZ2 = this.f49738m.f49755b) == null) {
            numZ2 = z2(U1(z10));
        }
        if (numZ2.intValue() < 0) {
            return null;
        }
        return numZ2;
    }

    @Override // Zf.e
    public int Z() {
        return H();
    }

    protected abstract BigInteger Z1(int i10);

    /* renamed from: a2 */
    public k m1(int i10) {
        return e2()[i10];
    }

    public String[] c2() {
        return W0();
    }

    public void d2(int i10, int i11, Zf.d[] dVarArr, int i12) {
        System.arraycopy(X0(), i10, dVarArr, i12, i11 - i10);
    }

    protected abstract k[] e2();

    @Override // ag.InterfaceC3847e, ag.InterfaceC3849g
    public abstract int f();

    public boolean h2() {
        Integer numF0 = F0();
        if (numF0 == null || numF0.intValue() >= f()) {
            return false;
        }
        return i2(numF0.intValue());
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x006a, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean i2(int r10) {
        /*
            r9 = this;
            if (r10 < 0) goto L6d
            int r0 = r9.f()
            if (r10 > r0) goto L6d
            inet.ipaddr.i r0 = r9.e()
            inet.ipaddr.c$b r0 = r0.d()
            boolean r0 = r0.allPrefixedAddressesAreSubnets()
            r1 = 1
            if (r0 == 0) goto L28
            boolean r0 = r9.i()
            if (r0 == 0) goto L28
            java.lang.Integer r0 = r9.F0()
            int r0 = r0.intValue()
            if (r0 > r10) goto L28
            return r1
        L28:
            int r0 = r9.m0()
            int r2 = r9.e0()
            int r2 = b2(r10, r2, r0)
            int r3 = r9.Z()
        L38:
            if (r2 >= r3) goto L6c
            inet.ipaddr.k r4 = r9.q(r2)
            java.lang.Integer r5 = q1(r0, r10, r2)
            if (r5 == 0) goto L6a
            int r5 = r5.intValue()
            int r5 = r4.y2(r5)
            long r5 = (long) r5
            long r7 = r4.W1()
            long r4 = r5 & r7
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r5 = 0
            if (r4 == 0) goto L5b
            return r5
        L5b:
            int r2 = r2 + 1
            if (r2 >= r3) goto L6a
            inet.ipaddr.k r4 = r9.q(r2)
            boolean r4 = r4.L()
            if (r4 != 0) goto L5b
            return r5
        L6a:
            int r2 = r2 + r1
            goto L38
        L6c:
            return r1
        L6d:
            inet.ipaddr.PrefixLenException r0 = new inet.ipaddr.PrefixLenException
            r0.<init>(r9, r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: inet.ipaddr.j.i2(int):boolean");
    }

    protected void j2(Integer num, boolean z10, Integer num2, Integer num3, Integer num4, BigInteger bigInteger, f.c cVar, f.c cVar2) {
        if (this.f49738m == null) {
            this.f49738m = new d();
        }
        if (z10) {
            A2(num);
        } else {
            z2(num);
        }
        super.b1(num2, bigInteger);
        this.f49738m.f49756c = num3;
        this.f49738m.f49758e = Boolean.valueOf(Objects.equals(num4, num2));
        this.f49738m.f49757d = num4;
    }

    protected boolean k2(int i10) {
        int iZ = Z();
        if (iZ == 0) {
            return true;
        }
        int iM0 = m0();
        int iB2 = b2(i10, e0(), iM0);
        if (iB2 >= iZ) {
            if (i10 != f()) {
                return true;
            }
            k kVarQ = q(iZ - 1);
            return !kVarQ.J2(kVarQ.f());
        }
        if (q(iB2).J2(q1(iM0, i10, iB2).intValue())) {
            return false;
        }
        if (!e().d().allPrefixedAddressesAreSubnets()) {
            for (int i11 = iB2 + 1; i11 < iZ; i11++) {
                if (!q(i11).w()) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean m2() {
        Integer numF0 = F0();
        if (numF0 == null || numF0.intValue() >= f()) {
            return !A0();
        }
        int iP1 = p1(numF0.intValue(), e0(), m0());
        if (iP1 < 0) {
            return true;
        }
        for (int i10 = 0; i10 < iP1; i10++) {
            if (q(i10).A0()) {
                return false;
            }
        }
        k kVarQ = q(iP1);
        int iQ = kVarQ.Q() ^ kVarQ.w0();
        if (iQ == 0) {
            return true;
        }
        int iF = kVarQ.f();
        return s1(iF, numF0, iP1).intValue() <= Integer.numberOfLeadingZeros(iQ) - (32 - iF);
    }

    protected boolean o2(k[] kVarArr, int i10) {
        return n2(i10, kVarArr, e0(), m0(), f());
    }

    public k q(int i10) {
        return e2()[i10];
    }

    @Override // ag.AbstractC3846d
    protected byte[] q0() {
        return super.q0();
    }

    public String toString() {
        return a0();
    }

    @Override // bg.f, ag.InterfaceC3847e
    public boolean u() {
        if (!g2() && this.f49738m.f49758e != null) {
            return this.f49738m.f49758e.booleanValue();
        }
        boolean zU = super.u();
        this.f49738m.f49758e = Boolean.valueOf(zU);
        if (zU) {
            this.f49738m.f49757d = F0();
        }
        return zU;
    }

    @Override // ag.AbstractC3846d, ag.InterfaceC3849g
    public boolean w() {
        int iH = H();
        if (!e().d().allPrefixedAddressesAreSubnets()) {
            return super.w();
        }
        for (int i10 = 0; i10 < iH; i10++) {
            k kVarQ = q(i10);
            if (!kVarQ.w()) {
                return false;
            }
            if (kVarQ.A2() != null) {
                return true;
            }
        }
        return true;
    }

    public boolean x0(Zf.c cVar) {
        int iZ = Z();
        if (iZ != cVar.Z()) {
            return false;
        }
        for (int iP1 = (i() && e().d().allPrefixedAddressesAreSubnets()) ? p1(F0().intValue(), e0(), m0()) : iZ - 1; iP1 >= 0; iP1--) {
            if (!q(iP1).L0(cVar.q(iP1))) {
                return false;
            }
        }
        return true;
    }

    protected long x2(final int i10, int i11) {
        if (!i2(i10)) {
            return 0L;
        }
        if (!A0()) {
            return 1L;
        }
        final int iM0 = m0();
        final int iP1 = p1(i10, e0(), iM0);
        return bg.d.n1(new IntUnaryOperator() { // from class: Zf.l
            @Override // java.util.function.IntUnaryOperator
            public final int applyAsInt(int i12) {
                return this.f25317a.t2(iP1, iM0, i10, i12);
            }
        }, iP1 + 1);
    }

    static class a extends AbstractC3846d.a implements m.d {

        /* renamed from: t, reason: collision with root package name */
        final Predicate f49739t;

        a(InterfaceC3843a interfaceC3843a, Predicate predicate, f fVar, ToLongFunction toLongFunction) {
            super(interfaceC3843a, null, fVar, null, null, toLongFunction);
            this.f49739t = predicate;
        }

        @Override // ag.AbstractC3846d.a
        protected boolean n() {
            return this.f49739t.test(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ag.AbstractC3846d.a
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public a g(InterfaceC3843a interfaceC3843a, boolean z10, Function function, Predicate predicate, ToLongFunction toLongFunction) {
            return new a(interfaceC3843a, this.f49739t, (f) this.f26225k, z10, function, predicate, toLongFunction);
        }

        a(InterfaceC3843a interfaceC3843a, Predicate predicate, f fVar, Function function, Predicate predicate2, ToLongFunction toLongFunction) {
            super(interfaceC3843a, null, fVar, function, predicate2, toLongFunction);
            this.f49739t = predicate;
        }

        a(InterfaceC3843a interfaceC3843a, Predicate predicate, f fVar, boolean z10, Function function, Predicate predicate2, ToLongFunction toLongFunction) {
            super(interfaceC3843a, null, fVar, z10, false, function, predicate2, toLongFunction);
            this.f49739t = predicate;
        }
    }
}
