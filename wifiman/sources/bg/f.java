package bg;

import ag.AbstractC3846d;
import ag.InterfaceC3847e;
import ag.k;
import inet.ipaddr.InconsistentPrefixException;
import inet.ipaddr.i;
import java.util.Arrays;

/* loaded from: classes4.dex */
public abstract class f extends d implements k {

    /* renamed from: l, reason: collision with root package name */
    protected static final b f33334l;

    /* renamed from: k, reason: collision with root package name */
    private final i f33335k;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f33336a;

        /* renamed from: b, reason: collision with root package name */
        public final int f33337b;

        a(int i10, int i11) {
            this.f33336a = i10;
            this.f33337b = i11;
        }

        public String toString() {
            return "[" + this.f33336a + ',' + (this.f33336a + this.f33337b) + ']';
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        final a[] f33344a;

        c(a[] aVarArr) {
            aVarArr.getClass();
            this.f33344a = aVarArr;
        }

        public a a(int i10) {
            return this.f33344a[i10];
        }

        public int b() {
            return this.f33344a.length;
        }

        public String toString() {
            return Arrays.asList(this.f33344a).toString();
        }
    }

    static {
        b bVar = new b();
        f33334l = bVar;
        if (b.f33338e) {
            bVar.d(-1);
        }
    }

    public f(e[] eVarArr, i iVar) {
        e eVar;
        Integer numG;
        super(eVarArr);
        if (iVar == null) {
            throw new NullPointerException(AbstractC3846d.Y0("ipaddress.error.nullNetwork"));
        }
        this.f33335k = iVar;
        int i10 = 0;
        int iF = 0;
        while (i10 < eVarArr.length) {
            e eVar2 = eVarArr[i10];
            Integer numG2 = eVar2.g();
            if (numG2 != null) {
                this.f26217c = d.s(iF + numG2.intValue());
                do {
                    i10++;
                    if (i10 >= eVarArr.length) {
                        return;
                    }
                    eVar = eVarArr[i10];
                    numG = eVar.g();
                    if (numG == null) {
                        break;
                    }
                } while (numG.intValue() == 0);
                throw new InconsistentPrefixException(eVarArr[i10 - 1], eVar, numG);
            }
            iF += eVar2.f();
            i10++;
        }
        this.f26217c = AbstractC3846d.f26211g;
    }

    protected static c H1() {
        return b.f33339f;
    }

    protected static c I1(int i10, int i11) {
        return f33334l.a(i10, -1, i11).b();
    }

    @Override // ag.AbstractC3846d, ag.InterfaceC3847e
    public Integer A() {
        return F0();
    }

    @Override // ag.InterfaceC3849g
    public boolean B0(int i10) {
        return AbstractC3846d.C(this, i10);
    }

    @Override // ag.k
    public Integer F0() {
        Integer num = this.f26217c;
        if (num != null) {
            if (num.intValue() == AbstractC3846d.f26211g.intValue()) {
                return null;
            }
            return num;
        }
        Integer numV = AbstractC3846d.v(this);
        if (numV != null) {
            this.f26217c = numV;
            return numV;
        }
        this.f26217c = AbstractC3846d.f26211g;
        return null;
    }

    @Override // bg.d
    /* renamed from: G1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public e m1(int i10) {
        return (e) super.m1(i10);
    }

    public c J1() {
        return i() ? L1(true) : K1();
    }

    public c K1() {
        return L1(false);
    }

    protected c L1(boolean z10) {
        b bVarA = f33334l;
        int iH = H();
        boolean z11 = z10 & (!e().d().prefixedSubnetsAreExplicit() && x());
        int i10 = -1;
        int i11 = -1;
        int i12 = 0;
        for (int i13 = 0; i13 < iH; i13++) {
            e eVarK = k(i13);
            if (eVarK.c0() || (z11 && eVarK.i() && eVarK.q2(0L, eVarK.g().intValue()))) {
                i12++;
                if (i12 == 1) {
                    i10 = i13;
                }
                if (i13 == iH - 1) {
                    bVarA = bVarA.a(i10, i11, i12);
                    i11 = i10 + i12;
                }
            } else if (i12 > 0) {
                bVarA = bVarA.a(i10, i11, i12);
                i11 = i12 + i10;
                i12 = 0;
            }
        }
        return bVarA.b();
    }

    @Override // bg.d, ag.AbstractC3846d
    protected boolean c1(AbstractC3846d abstractC3846d) {
        return (abstractC3846d instanceof f) && super.c1(abstractC3846d);
    }

    @Override // cg.d
    public i e() {
        return this.f33335k;
    }

    @Override // ag.InterfaceC3847e
    public int l0(InterfaceC3847e interfaceC3847e) {
        if (!A0()) {
            return interfaceC3847e.A0() ? -1 : 0;
        }
        if (interfaceC3847e.A0()) {
            return (u() && interfaceC3847e.u()) ? (f() - A().intValue()) - (interfaceC3847e.f() - interfaceC3847e.A().intValue()) : getCount().compareTo(interfaceC3847e.getCount());
        }
        return 1;
    }

    @Override // ag.InterfaceC3847e
    public boolean u() {
        Integer numF0 = F0();
        if (numF0 == null) {
            return false;
        }
        return u0(numF0.intValue());
    }

    @Override // ag.InterfaceC3849g
    public boolean u0(int i10) {
        return AbstractC3846d.J(this, i10);
    }

    @Override // ag.InterfaceC3847e, cg.d
    public boolean x() {
        Integer numF0 = F0();
        if (numF0 == null) {
            return false;
        }
        if (e().d().allPrefixedAddressesAreSubnets()) {
            return true;
        }
        return B0(numF0.intValue());
    }

    private static class b {

        /* renamed from: e, reason: collision with root package name */
        static boolean f33338e;

        /* renamed from: f, reason: collision with root package name */
        static final c f33339f = new c(new a[0]);

        /* renamed from: a, reason: collision with root package name */
        b[][] f33340a;

        /* renamed from: b, reason: collision with root package name */
        b f33341b;

        /* renamed from: c, reason: collision with root package name */
        c f33342c;

        /* renamed from: d, reason: collision with root package name */
        a f33343d;

        b() {
            this(null, 8, null);
            this.f33342c = f33339f;
        }

        private void c(a[] aVarArr, int i10) {
            int i11 = i10 - 1;
            aVarArr[i11] = this.f33343d;
            if (i11 > 0) {
                this.f33341b.c(aVarArr, i11);
            }
        }

        public b a(int i10, int i11, int i12) {
            a aVar;
            int i13 = (i10 - i11) - 1;
            int i14 = i12 - 1;
            b bVar = this.f33340a[i13][i14];
            if (bVar == null) {
                synchronized (this) {
                    try {
                        bVar = this.f33340a[i13][i14];
                        if (bVar == null) {
                            int i15 = 8 - (i11 + 1);
                            b bVar2 = f.f33334l;
                            if (this == bVar2) {
                                aVar = new a(i10, i12);
                            } else {
                                b[] bVarArr = bVar2.f33340a[i10];
                                b bVar3 = bVarArr[i14];
                                if (bVar3 == null) {
                                    a aVar2 = new a(i10, i12);
                                    bVarArr[i14] = new b(bVar2, 8, aVar2);
                                    aVar = aVar2;
                                } else {
                                    aVar = bVar3.f33343d;
                                }
                            }
                            b[] bVarArr2 = this.f33340a[i13];
                            b bVar4 = new b(this, i15, aVar);
                            bVarArr2[i14] = bVar4;
                            bVar = bVar4;
                        }
                    } finally {
                    }
                }
            }
            return bVar;
        }

        public c b() {
            c cVar = this.f33342c;
            if (cVar != null) {
                return cVar;
            }
            int i10 = 0;
            for (b bVar = this.f33341b; bVar != null; bVar = bVar.f33341b) {
                i10++;
            }
            a[] aVarArr = new a[i10];
            if (i10 > 0) {
                int i11 = i10 - 1;
                aVarArr[i11] = this.f33343d;
                if (i11 > 0) {
                    this.f33341b.c(aVarArr, i11);
                }
            }
            c cVar2 = new c(aVarArr);
            this.f33342c = cVar2;
            return cVar2;
        }

        void d(int i10) {
            if (this.f33340a == null) {
                return;
            }
            int i11 = 0;
            while (true) {
                b[][] bVarArr = this.f33340a;
                if (i11 >= bVarArr.length) {
                    break;
                }
                b[] bVarArr2 = bVarArr[i11];
                for (int i12 = 0; i12 < bVarArr2.length; i12++) {
                    b bVar = new b(this, 8 - (((i11 + i10) + i12) + 3), i10 == -1 ? new a(i11 + i10 + 1, i12 + 1) : f.f33334l.f33340a[i11 + i10 + 1][i12].f33343d);
                    bVar.b();
                    bVarArr2[i12] = bVar;
                }
                i11++;
            }
            int i13 = 0;
            while (true) {
                b[][] bVarArr3 = this.f33340a;
                if (i13 >= bVarArr3.length) {
                    return;
                }
                for (b bVar2 : bVarArr3[i13]) {
                    a aVar = bVar2.f33343d;
                    bVar2.d(aVar.f33336a + aVar.f33337b);
                }
                i13++;
            }
        }

        private b(b bVar, int i10, a aVar) {
            if (i10 > 0) {
                this.f33340a = new b[i10][];
                for (int i11 = 0; i11 < i10; i11++) {
                    this.f33340a[i11] = new b[i10 - i11];
                }
            }
            this.f33341b = bVar;
            this.f33343d = aVar;
        }
    }

    protected f(e[] eVarArr, boolean z10) {
        super(eVarArr, z10);
        i iVarE = e();
        this.f33335k = iVarE;
        if (iVarE == null) {
            throw new NullPointerException(AbstractC3846d.Y0("ipaddress.error.nullNetwork"));
        }
    }
}
