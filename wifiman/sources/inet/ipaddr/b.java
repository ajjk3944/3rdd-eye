package inet.ipaddr;

import ag.InterfaceC3847e;
import ag.InterfaceC3848f;
import ag.InterfaceC3849g;
import bg.AbstractC4109b;
import inet.ipaddr.ipv4.I;
import inet.ipaddr.ipv4.M;
import inet.ipaddr.ipv4.Y;
import inet.ipaddr.ipv6.C6205b;
import inet.ipaddr.ipv6.Q;
import inet.ipaddr.ipv6.V;
import inet.ipaddr.ipv6.i0;
import java.math.BigInteger;
import java.util.Comparator;
import java.util.Objects;

/* loaded from: classes4.dex */
public abstract class b implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    protected final boolean f49289a;

    public static class a extends b {
        public a(boolean z10) {
            super(z10);
        }

        private static int r(InterfaceC3847e interfaceC3847e, InterfaceC3847e interfaceC3847e2) {
            return interfaceC3847e.l0(interfaceC3847e2);
        }

        /* JADX WARN: Removed duplicated region for block: B:65:0x020f  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0224  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x026d A[LOOP:0: B:18:0x005a->B:74:0x026d, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:76:0x026c A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private int s(ag.InterfaceC3847e r42, ag.InterfaceC3847e r43) {
            /*
                Method dump skipped, instructions count: 652
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: inet.ipaddr.b.a.s(ag.e, ag.e):int");
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            return super.e((InterfaceC3849g) obj, (InterfaceC3849g) obj2);
        }

        @Override // inet.ipaddr.b
        protected int i(Zf.c cVar, Zf.c cVar2) {
            int iF = cVar.f() - cVar2.f();
            if (iF != 0) {
                return iF;
            }
            int iR = r(cVar, cVar2);
            return iR == 0 ? t(cVar, cVar2) : iR;
        }

        @Override // inet.ipaddr.b
        protected int j(InterfaceC3847e interfaceC3847e, InterfaceC3847e interfaceC3847e2) {
            int iF = interfaceC3847e.f() - interfaceC3847e2.f();
            if (iF != 0) {
                return iF;
            }
            int iR = r(interfaceC3847e, interfaceC3847e2);
            return iR == 0 ? s(interfaceC3847e, interfaceC3847e2) : iR;
        }

        @Override // inet.ipaddr.b
        protected int k(int i10, int i11, int i12, int i13) {
            int i14 = (i10 - i11) - (i12 - i13);
            return i14 == 0 ? i11 - i13 : i14;
        }

        @Override // inet.ipaddr.b
        protected int l(long j10, long j11, long j12, long j13) {
            long j14 = j10 - j11;
            long j15 = j12 - j13;
            if (j14 != j15) {
                return j14 > j15 ? 1 : -1;
            }
            if (j11 == j13) {
                return 0;
            }
            return j11 > j13 ? 1 : -1;
        }

        @Override // inet.ipaddr.b
        protected int m(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
            int iCompareTo = bigInteger.subtract(bigInteger2).compareTo(bigInteger3.subtract(bigInteger4));
            return iCompareTo == 0 ? bigInteger2.compareTo(bigInteger4) : iCompareTo;
        }

        protected int t(Zf.c cVar, Zf.c cVar2) {
            int iZ = cVar.Z();
            for (int i10 = 0; i10 < iZ; i10++) {
                Zf.d dVarQ = cVar.q(i10);
                Zf.d dVarQ2 = cVar2.q(i10);
                int iK = k(dVarQ.w0(), dVarQ.Q(), dVarQ2.w0(), dVarQ2.Q());
                if (iK != 0) {
                    return iK;
                }
            }
            return 0;
        }
    }

    /* renamed from: inet.ipaddr.b$b, reason: collision with other inner class name */
    public static class C1856b extends b {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f49290b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f49291c;

        public C1856b(boolean z10, boolean z11) {
            this(true, z11, false);
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            return super.e((InterfaceC3849g) obj, (InterfaceC3849g) obj2);
        }

        @Override // inet.ipaddr.b
        protected int i(Zf.c cVar, Zf.c cVar2) {
            int iQ;
            int iQ2;
            int iV0 = cVar.v0() - cVar2.v0();
            if (iV0 != 0) {
                return iV0;
            }
            boolean z10 = this.f49290b;
            do {
                int iZ = cVar.Z();
                for (int i10 = 0; i10 < iZ; i10++) {
                    Zf.d dVarQ = cVar.q(i10);
                    Zf.d dVarQ2 = cVar2.q(i10);
                    if (z10) {
                        iQ = dVarQ.w0();
                        iQ2 = dVarQ2.w0();
                    } else {
                        iQ = dVarQ.Q();
                        iQ2 = dVarQ2.Q();
                    }
                    int i11 = iQ - iQ2;
                    if (i11 != 0) {
                        return (!this.f49291c || z10 == this.f49290b) ? i11 : -i11;
                    }
                }
                z10 = !z10;
            } while (z10 != this.f49290b);
            return 0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0069, code lost:
        
            r3 = !r3;
         */
        /* JADX WARN: Removed duplicated region for block: B:100:0x01f8 A[LOOP:1: B:22:0x005c->B:100:0x01f8, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:102:0x01ea A[SYNTHETIC] */
        @Override // inet.ipaddr.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        protected int j(ag.InterfaceC3847e r32, ag.InterfaceC3847e r33) {
            /*
                Method dump skipped, instructions count: 519
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: inet.ipaddr.b.C1856b.j(ag.e, ag.e):int");
        }

        @Override // inet.ipaddr.b
        protected int k(int i10, int i11, int i12, int i13) {
            int i14;
            if (this.f49290b) {
                int i15 = i10 - i12;
                if (i15 != 0) {
                    return i15;
                }
                i14 = i11 - i13;
                if (!this.f49291c) {
                    return i14;
                }
            } else {
                int i16 = i11 - i13;
                if (i16 != 0) {
                    return i16;
                }
                i14 = i10 - i12;
                if (!this.f49291c) {
                    return i14;
                }
            }
            return -i14;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0011 A[PHI: r4
  0x0011: PHI (r4v5 long) = (r4v2 long), (r4v8 long) binds: [B:12:0x001b, B:7:0x000f] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // inet.ipaddr.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        protected int l(long r4, long r6, long r8, long r10) {
            /*
                r3 = this;
                boolean r0 = r3.f49290b
                r1 = 0
                if (r0 == 0) goto L13
                long r4 = r4 - r8
                int r8 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                if (r8 != 0) goto L1f
                long r4 = r6 - r10
                boolean r6 = r3.f49291c
                if (r6 == 0) goto L1f
            L11:
                long r4 = -r4
                goto L1f
            L13:
                long r6 = r6 - r10
                int r10 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                if (r10 != 0) goto L1e
                long r4 = r4 - r8
                boolean r6 = r3.f49291c
                if (r6 == 0) goto L1f
                goto L11
            L1e:
                r4 = r6
            L1f:
                int r4 = inet.ipaddr.b.n(r4)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: inet.ipaddr.b.C1856b.l(long, long, long, long):int");
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0012 A[PHI: r2
  0x0012: PHI (r2v6 int) = (r2v2 int), (r2v9 int) binds: [B:12:0x0020, B:7:0x0010] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // inet.ipaddr.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        protected int m(java.math.BigInteger r2, java.math.BigInteger r3, java.math.BigInteger r4, java.math.BigInteger r5) {
            /*
                r1 = this;
                boolean r0 = r1.f49290b
                if (r0 == 0) goto L14
                int r2 = r2.compareTo(r4)
                if (r2 != 0) goto L24
                int r2 = r3.compareTo(r5)
                boolean r3 = r1.f49291c
                if (r3 == 0) goto L24
            L12:
                int r2 = -r2
                goto L24
            L14:
                int r3 = r3.compareTo(r5)
                if (r3 != 0) goto L23
                int r2 = r2.compareTo(r4)
                boolean r3 = r1.f49291c
                if (r3 == 0) goto L24
                goto L12
            L23:
                r2 = r3
            L24:
                long r2 = (long) r2
                int r2 = inet.ipaddr.b.n(r2)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: inet.ipaddr.b.C1856b.m(java.math.BigInteger, java.math.BigInteger, java.math.BigInteger, java.math.BigInteger):int");
        }

        public C1856b(boolean z10, boolean z11, boolean z12) {
            super(z10);
            this.f49290b = z11;
            this.f49291c = z12;
        }
    }

    b(boolean z10) {
        this.f49289a = z10;
    }

    protected static int h(InterfaceC3847e interfaceC3847e, InterfaceC3847e interfaceC3847e2) {
        int iH = interfaceC3847e.H();
        int iH2 = iH - interfaceC3847e2.H();
        if (iH2 == 0) {
            for (int i10 = 0; i10 < iH; i10++) {
                iH2 = interfaceC3847e.m1(i10).f() - interfaceC3847e2.m1(i10).f();
                if (iH2 != 0) {
                    break;
                }
            }
        }
        return iH2;
    }

    static int n(long j10) {
        if (j10 == 0) {
            return 0;
        }
        return j10 > 0 ? 1 : -1;
    }

    private static int o(InterfaceC3848f interfaceC3848f) {
        if (interfaceC3848f instanceof V) {
            return 4;
        }
        return interfaceC3848f instanceof M ? 3 : 0;
    }

    private static int p(InterfaceC3847e interfaceC3847e) {
        if (interfaceC3847e instanceof Q) {
            return 6;
        }
        if (interfaceC3847e instanceof I) {
            return 4;
        }
        if (interfaceC3847e instanceof Q.i) {
            return 5;
        }
        if (interfaceC3847e instanceof bg.f) {
            return -1;
        }
        return interfaceC3847e instanceof bg.d ? -3 : 0;
    }

    private static int q(m mVar) {
        if (mVar instanceof Y) {
            return 1;
        }
        return mVar instanceof i0 ? 2 : 0;
    }

    public int a(Zf.c cVar, Zf.c cVar2) {
        int i10;
        int iP;
        if (cVar == cVar2) {
            return 0;
        }
        return (cVar.getClass().equals(cVar2.getClass()) || (iP = p(cVar) - p(cVar2)) == 0) ? (!(cVar instanceof Q) || (i10 = ((Q) cVar2).f49615v - ((Q) cVar).f49615v) == 0) ? i(cVar, cVar2) : i10 : iP;
    }

    public int b(Zf.d dVar, Zf.d dVar2) {
        int iO;
        if (dVar == dVar2) {
            return 0;
        }
        return (dVar.getClass().equals(dVar2.getClass()) || (iO = o(dVar) - o(dVar2)) == 0) ? k(dVar.w0(), dVar.Q(), dVar2.w0(), dVar2.Q()) : iO;
    }

    public int c(InterfaceC3847e interfaceC3847e, InterfaceC3847e interfaceC3847e2) {
        int iP;
        if (interfaceC3847e instanceof inet.ipaddr.a) {
            if (interfaceC3847e2 instanceof inet.ipaddr.a) {
                return f((inet.ipaddr.a) interfaceC3847e, (inet.ipaddr.a) interfaceC3847e2);
            }
            if (this.f49289a) {
                return -1;
            }
            interfaceC3847e = ((inet.ipaddr.a) interfaceC3847e).v();
        } else if (interfaceC3847e2 instanceof inet.ipaddr.a) {
            if (this.f49289a) {
                return 1;
            }
            interfaceC3847e2 = ((inet.ipaddr.a) interfaceC3847e2).v();
        }
        if ((interfaceC3847e instanceof Zf.c) && (interfaceC3847e2 instanceof Zf.c)) {
            return a((Zf.c) interfaceC3847e, (Zf.c) interfaceC3847e2);
        }
        if (interfaceC3847e == interfaceC3847e2) {
            return 0;
        }
        return (interfaceC3847e.getClass().equals(interfaceC3847e2.getClass()) || (iP = p(interfaceC3847e) - p(interfaceC3847e2)) == 0) ? j(interfaceC3847e, interfaceC3847e2) : iP;
    }

    public int d(InterfaceC3848f interfaceC3848f, InterfaceC3848f interfaceC3848f2) {
        int iF;
        int iO;
        if ((interfaceC3848f instanceof Zf.d) && (interfaceC3848f2 instanceof Zf.d)) {
            return b((Zf.d) interfaceC3848f, (Zf.d) interfaceC3848f2);
        }
        if (interfaceC3848f == interfaceC3848f2) {
            return 0;
        }
        if (!interfaceC3848f.getClass().equals(interfaceC3848f2.getClass()) && (iO = o(interfaceC3848f) - o(interfaceC3848f2)) != 0) {
            return iO;
        }
        if (this.f49289a && (iF = interfaceC3848f.f() - interfaceC3848f2.f()) != 0) {
            return iF;
        }
        if (!(interfaceC3848f instanceof AbstractC4109b) || !(interfaceC3848f2 instanceof AbstractC4109b)) {
            return m(interfaceC3848f.R(), interfaceC3848f.getValue(), interfaceC3848f2.R(), interfaceC3848f2.getValue());
        }
        AbstractC4109b abstractC4109b = (AbstractC4109b) interfaceC3848f;
        AbstractC4109b abstractC4109b2 = (AbstractC4109b) interfaceC3848f2;
        return l(abstractC4109b.a2(), abstractC4109b.W1(), abstractC4109b2.a2(), abstractC4109b2.W1());
    }

    public int e(InterfaceC3849g interfaceC3849g, InterfaceC3849g interfaceC3849g2) {
        int iF;
        if (interfaceC3849g instanceof InterfaceC3847e) {
            if (interfaceC3849g2 instanceof InterfaceC3847e) {
                return c((InterfaceC3847e) interfaceC3849g, (InterfaceC3847e) interfaceC3849g2);
            }
            if (this.f49289a) {
                return 1;
            }
            if (interfaceC3849g.A0()) {
                InterfaceC3847e interfaceC3847e = (InterfaceC3847e) interfaceC3849g;
                if (interfaceC3847e.H() > 0) {
                    return 1;
                }
                interfaceC3849g = interfaceC3847e.m1(0);
            }
        }
        boolean z10 = interfaceC3849g instanceof InterfaceC3848f;
        if (z10) {
            if (interfaceC3849g2 instanceof InterfaceC3848f) {
                return d((InterfaceC3848f) interfaceC3849g, (InterfaceC3848f) interfaceC3849g2);
            }
            if (this.f49289a) {
                return -1;
            }
        } else if (interfaceC3849g instanceof m) {
            if (interfaceC3849g2 instanceof m) {
                return g((m) interfaceC3849g, (m) interfaceC3849g2);
            }
            if (this.f49289a) {
                return interfaceC3849g2 instanceof InterfaceC3847e ? -1 : 1;
            }
        }
        boolean z11 = this.f49289a;
        if (z11) {
            if (interfaceC3849g2 instanceof InterfaceC3847e) {
                return -1;
            }
            if (interfaceC3849g2 instanceof InterfaceC3848f) {
                return 1;
            }
            if (interfaceC3849g2 instanceof m) {
                return -1;
            }
        }
        if (interfaceC3849g == interfaceC3849g2) {
            return 0;
        }
        if (z11 && (iF = interfaceC3849g.f() - interfaceC3849g2.f()) != 0) {
            return iF;
        }
        if (interfaceC3849g2 instanceof InterfaceC3847e) {
            InterfaceC3847e interfaceC3847e2 = (InterfaceC3847e) interfaceC3849g2;
            if (interfaceC3849g2.A0() && interfaceC3847e2.H() > 0) {
                return 1;
            }
            if (z10) {
                return d((InterfaceC3848f) interfaceC3849g, interfaceC3847e2.m1(0));
            }
            interfaceC3849g2 = interfaceC3847e2.m1(0);
        }
        return m(interfaceC3849g.R(), interfaceC3849g.getValue(), interfaceC3849g2.R(), interfaceC3849g2.getValue());
    }

    public int f(inet.ipaddr.a aVar, inet.ipaddr.a aVar2) {
        if (aVar == aVar2) {
            return 0;
        }
        int iA = a(aVar.v(), aVar2.v());
        return (iA == 0 && (aVar instanceof C6205b)) ? Objects.compare(((C6205b) aVar).M1(), ((C6205b) aVar2).M1(), Comparator.nullsFirst(new Comparator() { // from class: Zf.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((String) obj).compareTo((String) obj2);
            }
        })) : iA;
    }

    public int g(m mVar, m mVar2) {
        int iQ;
        if (mVar == mVar2) {
            return 0;
        }
        if (!mVar.getClass().equals(mVar2.getClass()) && (iQ = q(mVar) - q(mVar2)) != 0) {
            return iQ;
        }
        if (!(mVar instanceof Y) || !(mVar2 instanceof Y)) {
            return m(mVar.R(), mVar.getValue(), mVar2.R(), mVar2.getValue());
        }
        Y y10 = (Y) mVar;
        Y y11 = (Y) mVar2;
        return l(y10.K0().K1(), y10.q0().K1(), y11.K0().K1(), y11.q0().K1());
    }

    protected abstract int i(Zf.c cVar, Zf.c cVar2);

    protected abstract int j(InterfaceC3847e interfaceC3847e, InterfaceC3847e interfaceC3847e2);

    protected abstract int k(int i10, int i11, int i12, int i13);

    protected abstract int l(long j10, long j11, long j12, long j13);

    protected abstract int m(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4);
}
