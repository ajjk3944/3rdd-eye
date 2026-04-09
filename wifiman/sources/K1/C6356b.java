package k1;

import c1.C4188d;
import j1.d;
import j1.e;
import java.util.ArrayList;

/* renamed from: k1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6356b {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f51017a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private a f51018b = new a();

    /* renamed from: c, reason: collision with root package name */
    private j1.f f51019c;

    /* renamed from: k1.b$a */
    public static class a {

        /* renamed from: k, reason: collision with root package name */
        public static int f51020k = 0;

        /* renamed from: l, reason: collision with root package name */
        public static int f51021l = 1;

        /* renamed from: m, reason: collision with root package name */
        public static int f51022m = 2;

        /* renamed from: a, reason: collision with root package name */
        public e.b f51023a;

        /* renamed from: b, reason: collision with root package name */
        public e.b f51024b;

        /* renamed from: c, reason: collision with root package name */
        public int f51025c;

        /* renamed from: d, reason: collision with root package name */
        public int f51026d;

        /* renamed from: e, reason: collision with root package name */
        public int f51027e;

        /* renamed from: f, reason: collision with root package name */
        public int f51028f;

        /* renamed from: g, reason: collision with root package name */
        public int f51029g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f51030h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f51031i;

        /* renamed from: j, reason: collision with root package name */
        public int f51032j;
    }

    /* renamed from: k1.b$b, reason: collision with other inner class name */
    public interface InterfaceC1888b {
        void a();

        void b(j1.e eVar, a aVar);
    }

    public C6356b(j1.f fVar) {
        this.f51019c = fVar;
    }

    private boolean a(InterfaceC1888b interfaceC1888b, j1.e eVar, int i10) {
        this.f51018b.f51023a = eVar.x();
        this.f51018b.f51024b = eVar.M();
        this.f51018b.f51025c = eVar.O();
        this.f51018b.f51026d = eVar.u();
        a aVar = this.f51018b;
        aVar.f51031i = false;
        aVar.f51032j = i10;
        e.b bVar = aVar.f51023a;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        boolean z10 = bVar == bVar2;
        boolean z11 = aVar.f51024b == bVar2;
        boolean z12 = z10 && eVar.f49897c0 > 0.0f;
        boolean z13 = z11 && eVar.f49897c0 > 0.0f;
        if (z12 && eVar.f49940y[0] == 4) {
            aVar.f51023a = e.b.FIXED;
        }
        if (z13 && eVar.f49940y[1] == 4) {
            aVar.f51024b = e.b.FIXED;
        }
        interfaceC1888b.b(eVar, aVar);
        eVar.U0(this.f51018b.f51027e);
        eVar.z0(this.f51018b.f51028f);
        eVar.y0(this.f51018b.f51030h);
        eVar.o0(this.f51018b.f51029g);
        a aVar2 = this.f51018b;
        aVar2.f51032j = a.f51020k;
        return aVar2.f51031i;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0097 A[PHI: r10
  0x0097: PHI (r10v2 boolean) = (r10v1 boolean), (r10v1 boolean), (r10v1 boolean), (r10v4 boolean), (r10v4 boolean) binds: [B:32:0x0061, B:34:0x0067, B:36:0x006b, B:54:0x0094, B:52:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00a0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b(j1.f r13) {
        /*
            r12 = this;
            java.util.ArrayList r0 = r13.f50043K0
            int r0 = r0.size()
            r1 = 64
            boolean r1 = r13.B1(r1)
            k1.b$b r2 = r13.t1()
            r3 = 0
            r4 = r3
        L12:
            if (r4 >= r0) goto La4
            java.util.ArrayList r5 = r13.f50043K0
            java.lang.Object r5 = r5.get(r4)
            j1.e r5 = (j1.e) r5
            boolean r6 = r5 instanceof j1.h
            if (r6 == 0) goto L22
            goto La0
        L22:
            boolean r6 = r5 instanceof j1.C6241a
            if (r6 == 0) goto L28
            goto La0
        L28:
            boolean r6 = r5.c0()
            if (r6 == 0) goto L30
            goto La0
        L30:
            if (r1 == 0) goto L47
            k1.l r6 = r5.f49900e
            if (r6 == 0) goto L47
            k1.n r7 = r5.f49902f
            if (r7 == 0) goto L47
            k1.g r6 = r6.f51091e
            boolean r6 = r6.f51053j
            if (r6 == 0) goto L47
            k1.g r6 = r7.f51091e
            boolean r6 = r6.f51053j
            if (r6 == 0) goto L47
            goto La0
        L47:
            j1.e$b r6 = r5.r(r3)
            r7 = 1
            j1.e$b r8 = r5.r(r7)
            j1.e$b r9 = j1.e.b.MATCH_CONSTRAINT
            if (r6 != r9) goto L60
            int r10 = r5.f49936w
            if (r10 == r7) goto L60
            if (r8 != r9) goto L60
            int r10 = r5.f49938x
            if (r10 == r7) goto L60
            r10 = r7
            goto L61
        L60:
            r10 = r3
        L61:
            if (r10 != 0) goto L97
            boolean r11 = r13.B1(r7)
            if (r11 == 0) goto L97
            boolean r11 = r5 instanceof j1.l
            if (r11 != 0) goto L97
            if (r6 != r9) goto L7c
            int r11 = r5.f49936w
            if (r11 != 0) goto L7c
            if (r8 == r9) goto L7c
            boolean r11 = r5.a0()
            if (r11 != 0) goto L7c
            r10 = r7
        L7c:
            if (r8 != r9) goto L8b
            int r11 = r5.f49938x
            if (r11 != 0) goto L8b
            if (r6 == r9) goto L8b
            boolean r11 = r5.a0()
            if (r11 != 0) goto L8b
            r10 = r7
        L8b:
            if (r6 == r9) goto L8f
            if (r8 != r9) goto L97
        L8f:
            float r6 = r5.f49897c0
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L97
            goto L98
        L97:
            r7 = r10
        L98:
            if (r7 == 0) goto L9b
            goto La0
        L9b:
            int r6 = k1.C6356b.a.f51020k
            r12.a(r2, r5, r6)
        La0:
            int r4 = r4 + 1
            goto L12
        La4:
            r2.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.C6356b.b(j1.f):void");
    }

    private void c(j1.f fVar, String str, int i10, int i11, int i12) {
        fVar.getClass();
        int iD = fVar.D();
        int iC = fVar.C();
        fVar.L0(0);
        fVar.K0(0);
        fVar.U0(i11);
        fVar.z0(i12);
        fVar.L0(iD);
        fVar.K0(iC);
        this.f51019c.F1(i10);
        this.f51019c.d1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v5, types: [int] */
    public long d(j1.f fVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        boolean z10;
        boolean zS1;
        int i19;
        j1.f fVar2;
        int i20;
        boolean z11;
        boolean z12;
        int i21;
        int i22;
        boolean z13;
        int i23;
        C6356b c6356b = this;
        InterfaceC1888b interfaceC1888bT1 = fVar.t1();
        int size = fVar.f50043K0.size();
        int iO = fVar.O();
        int iU = fVar.u();
        boolean zB = j1.k.b(i10, 128);
        int i24 = 1;
        boolean z14 = zB || j1.k.b(i10, 64);
        if (z14) {
            for (int i25 = 0; i25 < size; i25++) {
                j1.e eVar = (j1.e) fVar.f50043K0.get(i25);
                e.b bVarX = eVar.x();
                e.b bVar = e.b.MATCH_CONSTRAINT;
                boolean z15 = (bVarX == bVar) && (eVar.M() == bVar) && eVar.s() > 0.0f;
                if ((eVar.a0() && z15) || ((eVar.b0() && z15) || (eVar instanceof j1.l) || eVar.a0() || eVar.b0())) {
                    z14 = false;
                    break;
                }
            }
        }
        if (z14) {
            boolean z16 = C4188d.f33664s;
        }
        boolean z17 = z14 & ((i13 == 1073741824 && i15 == 1073741824) || zB);
        int i26 = 2;
        if (z17) {
            int iMin = Math.min(fVar.B(), i14);
            int iMin2 = Math.min(fVar.A(), i16);
            if (i13 == 1073741824 && fVar.O() != iMin) {
                fVar.U0(iMin);
                fVar.x1();
            }
            if (i15 == 1073741824 && fVar.u() != iMin2) {
                fVar.z0(iMin2);
                fVar.x1();
            }
            if (i13 == 1073741824 && i15 == 1073741824) {
                zS1 = fVar.q1(zB);
                i19 = 2;
                z10 = false;
            } else {
                boolean zR1 = fVar.r1(zB);
                z10 = false;
                if (i13 == 1073741824) {
                    zR1 &= fVar.s1(zB, 0);
                    i19 = 1;
                } else {
                    i19 = 0;
                }
                if (i15 == 1073741824) {
                    zS1 = fVar.s1(zB, 1) & zR1;
                    i19++;
                } else {
                    zS1 = zR1;
                }
            }
            if (zS1) {
                fVar.Y0(i13 == 1073741824 ? true : z10, i15 == 1073741824 ? true : z10);
            }
        } else {
            z10 = false;
            zS1 = false;
            i19 = 0;
        }
        if (zS1 && i19 == 2) {
            return 0L;
        }
        int iU1 = fVar.u1();
        if (size > 0) {
            b(fVar);
        }
        e(fVar);
        int size2 = c6356b.f51017a.size();
        if (size > 0) {
            c(fVar, "First pass", 0, iO, iU);
        }
        if (size2 > 0) {
            e.b bVarX2 = fVar.x();
            e.b bVar2 = e.b.WRAP_CONTENT;
            boolean z18 = bVarX2 == bVar2 ? true : z10;
            boolean z19 = fVar.M() == bVar2 ? true : z10;
            int iMax = Math.max(fVar.O(), c6356b.f51019c.D());
            int iMax2 = Math.max(fVar.u(), c6356b.f51019c.C());
            boolean z20 = z10;
            boolean zN1 = z20;
            ?? r15 = z20;
            while (r15 < size2) {
                j1.e eVar2 = (j1.e) c6356b.f51017a.get(r15);
                if (eVar2 instanceof j1.l) {
                    int iO2 = eVar2.O();
                    int iU2 = eVar2.u();
                    boolean zA = zN1 | c6356b.a(interfaceC1888bT1, eVar2, a.f51021l);
                    int iO3 = eVar2.O();
                    i22 = iU1;
                    int iU3 = eVar2.u();
                    if (iO3 != iO2) {
                        eVar2.U0(iO3);
                        if (z18 && eVar2.H() > iMax) {
                            iMax = Math.max(iMax, eVar2.H() + eVar2.l(d.a.RIGHT).f());
                        }
                        z13 = true;
                    } else {
                        z13 = zA;
                    }
                    if (iU3 != iU2) {
                        eVar2.z0(iU3);
                        if (z19 && eVar2.o() > iMax2) {
                            iMax2 = Math.max(iMax2, eVar2.o() + eVar2.l(d.a.BOTTOM).f());
                        }
                        z13 = true;
                    }
                    zN1 = z13 | ((j1.l) eVar2).n1();
                    i23 = 1;
                } else {
                    i22 = iU1;
                    i23 = i24;
                }
                iU1 = i22;
                i24 = i23;
                i26 = 2;
                r15 += i23;
            }
            int i27 = iU1;
            int i28 = i26;
            int i29 = 0;
            while (i29 < i28) {
                int i30 = 0;
                while (i30 < size2) {
                    j1.e eVar3 = (j1.e) c6356b.f51017a.get(i30);
                    if (((eVar3 instanceof j1.i) && !(eVar3 instanceof j1.l)) || (eVar3 instanceof j1.h) || eVar3.N() == 8 || ((z17 && eVar3.f49900e.f51091e.f51053j && eVar3.f49902f.f51091e.f51053j) || (eVar3 instanceof j1.l))) {
                        z11 = z17;
                    } else {
                        int iO4 = eVar3.O();
                        int iU4 = eVar3.u();
                        int iM = eVar3.m();
                        int i31 = a.f51021l;
                        z11 = z17;
                        if (i29 == 1) {
                            i31 = a.f51022m;
                        }
                        boolean zA2 = zN1 | c6356b.a(interfaceC1888bT1, eVar3, i31);
                        int iO5 = eVar3.O();
                        int iU5 = eVar3.u();
                        if (iO5 != iO4) {
                            eVar3.U0(iO5);
                            if (z18 && eVar3.H() > iMax) {
                                iMax = Math.max(iMax, eVar3.H() + eVar3.l(d.a.RIGHT).f());
                            }
                            z12 = true;
                        } else {
                            z12 = zA2;
                        }
                        if (iU5 != iU4) {
                            eVar3.z0(iU5);
                            if (z19 && eVar3.o() > iMax2) {
                                iMax2 = Math.max(iMax2, eVar3.o() + eVar3.l(d.a.BOTTOM).f());
                            }
                            z12 = true;
                        }
                        if (!eVar3.R() || iM == eVar3.m()) {
                            zN1 = z12;
                        } else {
                            i21 = 1;
                            zN1 = true;
                            i30 += i21;
                            c6356b = this;
                            z17 = z11;
                        }
                    }
                    i21 = 1;
                    i30 += i21;
                    c6356b = this;
                    z17 = z11;
                }
                boolean z21 = z17;
                if (!zN1) {
                    break;
                }
                i29++;
                c(fVar, "intermediate pass", i29, iO, iU);
                i28 = 2;
                zN1 = false;
                c6356b = this;
                z17 = z21;
            }
            fVar2 = fVar;
            i20 = i27;
        } else {
            fVar2 = fVar;
            i20 = iU1;
        }
        fVar2.E1(i20);
        return 0L;
    }

    public void e(j1.f fVar) {
        this.f51017a.clear();
        int size = fVar.f50043K0.size();
        for (int i10 = 0; i10 < size; i10++) {
            j1.e eVar = (j1.e) fVar.f50043K0.get(i10);
            e.b bVarX = eVar.x();
            e.b bVar = e.b.MATCH_CONSTRAINT;
            if (bVarX == bVar || eVar.M() == bVar) {
                this.f51017a.add(eVar);
            }
        }
        fVar.x1();
    }
}
