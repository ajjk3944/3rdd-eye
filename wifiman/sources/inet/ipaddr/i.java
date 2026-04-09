package inet.ipaddr;

import bg.AbstractC4108a;
import bg.f;
import inet.ipaddr.g;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;

/* loaded from: classes4.dex */
public abstract class i extends c {

    /* renamed from: b, reason: collision with root package name */
    private final g[] f49485b;

    /* renamed from: c, reason: collision with root package name */
    private final g[] f49486c;

    /* renamed from: d, reason: collision with root package name */
    private final g[] f49487d;

    /* renamed from: e, reason: collision with root package name */
    private final g[] f49488e;

    /* renamed from: f, reason: collision with root package name */
    private final int[] f49489f;

    /* renamed from: g, reason: collision with root package name */
    private final int[] f49490g;

    /* renamed from: h, reason: collision with root package name */
    private transient g f49491h;

    /* renamed from: i, reason: collision with root package name */
    private a f49492i;

    public static abstract class a extends AbstractC4108a {

        /* renamed from: a, reason: collision with root package name */
        private i f49493a;

        protected a(i iVar) {
            this.f49493a = iVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // inet.ipaddr.format.validate.f
        /* renamed from: C0, reason: merged with bridge method [inline-methods] */
        public k s(int i10, int i11, Integer num, CharSequence charSequence, int i12, int i13, boolean z10, boolean z11, int i14, int i15, int i16) {
            k kVar = (k) c(i10, i11, num);
            kVar.S2(charSequence, z10, z11, i14, i15, i16, i12, i13);
            kVar.U2(charSequence, z11, i14, i16, i12, i13);
            return kVar;
        }

        public abstract g E(j jVar);

        protected j E0(byte[] bArr, int i10, Integer num) {
            return (j) C(bArr, i10, num, false);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // inet.ipaddr.format.validate.f
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        public g h(j jVar, Zf.f fVar) {
            g gVarE = E(jVar);
            gVarE.J(fVar);
            return gVarE;
        }

        /* renamed from: G0 */
        protected abstract j t(k[] kVarArr);

        protected abstract g J(j jVar, CharSequence charSequence);

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // inet.ipaddr.format.validate.f
        /* renamed from: K, reason: merged with bridge method [inline-methods] */
        public g j(j jVar, CharSequence charSequence, Zf.f fVar) {
            g gVarJ = J(jVar, charSequence);
            gVarJ.J(fVar);
            return gVarJ;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // inet.ipaddr.format.validate.f
        /* renamed from: K0, reason: merged with bridge method [inline-methods] */
        public k v(int i10, Integer num, CharSequence charSequence, int i11, boolean z10, int i12, int i13) {
            k kVar = (k) g(i10, num);
            kVar.R2(charSequence, z10, i12, i13, i11);
            kVar.T2(charSequence, z10, i12, i13, i11);
            return kVar;
        }

        protected abstract int M0();

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // inet.ipaddr.format.validate.f
        /* renamed from: P, reason: merged with bridge method [inline-methods] */
        public g m(byte[] bArr, CharSequence charSequence) {
            return J(E0(bArr, M0(), null), charSequence);
        }

        protected g S(k[] kVarArr) {
            return E(t(kVarArr));
        }

        protected g T(k[] kVarArr, Integer num) {
            return E(p(kVarArr, num));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // bg.AbstractC4108a
        /* renamed from: b0, reason: merged with bridge method [inline-methods] */
        public g B(k[] kVarArr, Integer num, boolean z10) {
            return E(r(kVarArr, num, z10));
        }

        protected abstract j d0(j jVar, k[] kVarArr);

        public i e() {
            return this.f49493a;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // inet.ipaddr.format.validate.f
        /* renamed from: f0, reason: merged with bridge method [inline-methods] */
        public j p(k[] kVarArr, Integer num) {
            return r(kVarArr, num, false);
        }

        /* renamed from: q0 */
        protected abstract j r(k[] kVarArr, Integer num, boolean z10);
    }

    protected i(Class cls) {
        g.a aVarN0 = n0();
        g[] gVarArr = (g[]) Array.newInstance((Class<?>) cls, g.U0(aVarN0) + 1);
        this.f49485b = gVarArr;
        this.f49486c = (g[]) gVarArr.clone();
        this.f49487d = (g[]) gVarArr.clone();
        this.f49488e = (g[]) gVarArr.clone();
        this.f49492i = j();
        int iU2 = k.u2(aVarN0);
        int i10 = ~((-1) << iU2);
        int[] iArr = new int[iU2 + 1];
        this.f49489f = iArr;
        this.f49490g = (int[]) iArr.clone();
        for (int i11 = 0; i11 <= iU2; i11++) {
            int i12 = (i10 << (iU2 - i11)) & i10;
            this.f49489f[i11] = i12;
            this.f49490g[i11] = (~i12) & i10;
        }
    }

    private void F(j jVar, boolean z10, boolean z11, boolean z12, int i10, int i11, int i12, int i13, int i14) {
        f.c cVar;
        f.c cVar2;
        BigInteger bigInteger;
        Integer num;
        Integer num2;
        BigInteger bigIntegerPow;
        int iB2;
        int iP1 = 0;
        boolean z13 = !z10 ? i11 < i13 : i10 - i11 < i13;
        f.c cVarH1 = j.H1();
        if (z13) {
            if (z10) {
                iP1 = j.p1(i11, i14, i13) + 1;
                iB2 = i12 - iP1;
            } else {
                iB2 = j.b2(i11, i14, i13);
            }
            f.c cVarI1 = j.I1(iP1, iB2);
            if (!z10 || !z11 || d().prefixedSubnetsAreExplicit()) {
                cVarH1 = cVarI1;
            }
            cVar2 = cVarI1;
            cVar = cVarH1;
        } else {
            cVar = cVarH1;
            cVar2 = cVar;
        }
        Integer numH = h(i11);
        if (!z10 || !z11) {
            Integer numH2 = h(i10);
            bigInteger = BigInteger.ONE;
            num = null;
            num2 = numH2;
        } else {
            if (!d().prefixedSubnetsAreExplicit() && (!d().zeroHostsAreSubnets() || z12)) {
                bigIntegerPow = BigInteger.valueOf(2L).pow(i10 - i11);
                num = numH;
                num2 = num;
                jVar.j2(numH, z10, num, num2, num2, bigIntegerPow, cVar, cVar2);
            }
            Integer numH3 = h(i10);
            bigInteger = BigInteger.ONE;
            num2 = numH3;
            num = numH;
        }
        bigIntegerPow = bigInteger;
        jVar.j2(numH, z10, num, num2, num2, bigIntegerPow, cVar, cVar2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Integer h(int i10) {
        return j.s(i10);
    }

    private g o(int i10, g[] gVarArr, boolean z10, boolean z11, boolean z12) {
        int i11;
        int i12;
        int i13;
        int i14;
        g gVar;
        int i15;
        g gVarS;
        g gVarS2;
        g gVarS3;
        k kVar;
        g gVar2;
        g.a aVarN0 = n0();
        int iU0 = g.U0(aVarN0);
        if (i10 < 0 || i10 > iU0) {
            throw new PrefixLenException(i10, aVarN0);
        }
        g gVar3 = gVarArr[i10];
        if (gVar3 == null) {
            if (z10) {
                i12 = iU0;
                i11 = 0;
            } else {
                i11 = iU0;
                i12 = 0;
            }
            g gVar4 = gVarArr[i12];
            g gVar5 = gVarArr[i11];
            if (gVar4 == null || gVar5 == null) {
                synchronized (gVarArr) {
                    try {
                        int iC1 = g.c1(aVarN0);
                        int iV0 = g.V0(aVarN0);
                        int iX0 = g.X0(aVarN0);
                        g gVar6 = gVarArr[i12];
                        if (gVar6 == null) {
                            a aVarM = m();
                            k[] kVarArr = (k[]) aVarM.d(iC1);
                            int iZ0 = g.Z0(aVarN0);
                            if (z10 && z11) {
                                Arrays.fill(kVarArr, 0, kVarArr.length - 1, (k) aVarM.g(iZ0, j.r1(iV0, iU0)));
                                kVarArr[kVarArr.length - 1] = (k) aVarM.g(iZ0, j.r1(iV0, iV0));
                                gVarS2 = aVarM.T(kVarArr, h(iU0));
                            } else {
                                Arrays.fill(kVarArr, (k) aVarM.a(iZ0));
                                gVarS2 = aVarM.S(kVarArr);
                            }
                            gVar = gVarS2;
                            i13 = iV0;
                            i14 = iC1;
                            F(gVar.v(), z10, z11, z12, iU0, i12, iC1, iV0, iX0);
                            gVarArr[i12] = gVar;
                        } else {
                            i13 = iV0;
                            i14 = iC1;
                            gVar = gVar6;
                        }
                        g gVar7 = gVarArr[i11];
                        if (gVar7 == null) {
                            a aVarM2 = m();
                            k[] kVarArr2 = (k[]) aVarM2.d(i14);
                            if (z10 && z11) {
                                i15 = i13;
                                Arrays.fill(kVarArr2, (k) aVarM2.g(0, j.r1(i15, 0)));
                                gVarS = aVarM2.T(kVarArr2, h(0));
                                if (d().zeroHostsAreSubnets() && !z12) {
                                    gVarS = gVarS.Y0();
                                }
                            } else {
                                i15 = i13;
                                Arrays.fill(kVarArr2, (k) aVarM2.a(0));
                                gVarS = aVarM2.S(kVarArr2);
                            }
                            g gVar8 = gVarS;
                            F(gVar8.v(), z10, z11, z12, iU0, i11, i14, i15, iX0);
                            gVarArr[i11] = gVar8;
                            gVar5 = gVar8;
                        } else {
                            gVar5 = gVar7;
                        }
                    } finally {
                    }
                }
                gVar4 = gVar;
            }
            synchronized (gVarArr) {
                try {
                    g gVar9 = gVarArr[i10];
                    if (gVar9 == null) {
                        BiFunction biFunctionE = E();
                        int iC12 = g.c1(aVarN0);
                        int iV02 = g.V0(aVarN0);
                        int iX02 = g.X0(aVarN0);
                        int i16 = 0;
                        k kVar2 = (k) biFunctionE.apply(gVar4, 0);
                        k kVar3 = (k) biFunctionE.apply(gVar5, 0);
                        a aVarM3 = m();
                        ArrayList arrayList = new ArrayList(iC12);
                        int i17 = i10;
                        int i18 = 0;
                        while (i17 > 0) {
                            if (i17 <= iV02) {
                                int i19 = ((i17 - 1) % iV02) + 1;
                                int i20 = i16;
                                while (true) {
                                    if (i20 >= iC12) {
                                        kVar = null;
                                        break;
                                    }
                                    if (i19 != i10 && (gVar2 = gVarArr[i19]) != null) {
                                        kVar = (k) biFunctionE.apply(gVar2, Integer.valueOf(i20));
                                        break;
                                    }
                                    i20++;
                                    i19 += iV02;
                                }
                                if (kVar == null) {
                                    int iC = C(i17);
                                    kVar = z10 ? z11 ? (k) aVarM3.g(iC, j.r1(iV02, i17)) : (k) aVarM3.a(iC) : (k) aVarM3.a(B(i17));
                                }
                                arrayList.add(kVar);
                            } else {
                                arrayList.add(z10 ? kVar2 : kVar3);
                            }
                            i18++;
                            i17 -= iV02;
                            i16 = 0;
                        }
                        while (i18 < iC12) {
                            arrayList.add(z10 ? kVar3 : kVar2);
                            i18++;
                        }
                        k[] kVarArr3 = (k[]) aVarM3.d(arrayList.size());
                        arrayList.toArray(kVarArr3);
                        if (z10 && z11) {
                            gVarS3 = aVarM3.T(kVarArr3, h(i10));
                            if (d().zeroHostsAreSubnets() && !z12) {
                                gVarS3 = gVarS3.Y0();
                            }
                        } else {
                            gVarS3 = aVarM3.S(kVarArr3);
                        }
                        g gVar10 = gVarS3;
                        F(gVar10.v(), z10, z11, z12, iU0, i10, iC12, iV02, iX02);
                        gVarArr[i10] = gVar10;
                        gVar3 = gVar10;
                    } else {
                        gVar3 = gVar9;
                    }
                } finally {
                }
            }
        }
        return gVar3;
    }

    public static String v(int i10) {
        StringBuilder sb2 = new StringBuilder(inet.ipaddr.format.validate.b.f49355a + 1);
        sb2.append('/');
        sb2.append(i10);
        return sb2.toString();
    }

    public int B(int i10) {
        return this.f49490g[i10];
    }

    public int C(int i10) {
        return this.f49489f[i10];
    }

    protected abstract BiFunction E();

    protected abstract a j();

    protected abstract g l();

    public a m() {
        return this.f49492i;
    }

    public g n() {
        if (this.f49491h == null) {
            synchronized (this) {
                try {
                    if (this.f49491h == null) {
                        this.f49491h = l();
                    }
                } finally {
                }
            }
        }
        return this.f49491h;
    }

    public abstract g.a n0();

    public g p(int i10) {
        return o(i10, this.f49487d, true, true, true);
    }

    public g r(int i10) {
        return s(i10, true);
    }

    public g s(int i10, boolean z10) {
        return o(i10, z10 ? this.f49485b : this.f49486c, true, z10, false);
    }

    public j t(int i10) {
        return (j) y().apply(s(i10, true));
    }

    protected abstract Function y();
}
