package p1;

import java.util.ArrayList;
import o1.AbstractC7055k;
import o1.AbstractC7056l;
import o1.C7048d;
import o1.C7049e;
import o1.C7050f;
import o1.C7052h;
import o1.InterfaceC7053i;

/* renamed from: p1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7206b {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f57448a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private a f57449b = new a();

    /* renamed from: c, reason: collision with root package name */
    private C7050f f57450c;

    /* renamed from: p1.b$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public C7049e.b f57451a;

        /* renamed from: b, reason: collision with root package name */
        public C7049e.b f57452b;

        /* renamed from: c, reason: collision with root package name */
        public int f57453c;

        /* renamed from: d, reason: collision with root package name */
        public int f57454d;

        /* renamed from: e, reason: collision with root package name */
        public int f57455e;

        /* renamed from: f, reason: collision with root package name */
        public int f57456f;

        /* renamed from: g, reason: collision with root package name */
        public int f57457g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f57458h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f57459i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f57460j;
    }

    /* renamed from: p1.b$b, reason: collision with other inner class name */
    public interface InterfaceC2026b {
        void a();

        void b(C7049e c7049e, a aVar);
    }

    public C7206b(C7050f c7050f) {
        this.f57450c = c7050f;
    }

    private boolean a(InterfaceC2026b interfaceC2026b, C7049e c7049e, boolean z10) {
        this.f57449b.f57451a = c7049e.y();
        this.f57449b.f57452b = c7049e.M();
        this.f57449b.f57453c = c7049e.P();
        this.f57449b.f57454d = c7049e.v();
        a aVar = this.f57449b;
        aVar.f57459i = false;
        aVar.f57460j = z10;
        C7049e.b bVar = aVar.f57451a;
        C7049e.b bVar2 = C7049e.b.MATCH_CONSTRAINT;
        boolean z11 = bVar == bVar2;
        boolean z12 = aVar.f57452b == bVar2;
        boolean z13 = z11 && c7049e.f55097Q > 0.0f;
        boolean z14 = z12 && c7049e.f55097Q > 0.0f;
        if (z13 && c7049e.f55133n[0] == 4) {
            aVar.f57451a = C7049e.b.FIXED;
        }
        if (z14 && c7049e.f55133n[1] == 4) {
            aVar.f57452b = C7049e.b.FIXED;
        }
        interfaceC2026b.b(c7049e, aVar);
        c7049e.E0(this.f57449b.f57455e);
        c7049e.h0(this.f57449b.f57456f);
        c7049e.g0(this.f57449b.f57458h);
        c7049e.b0(this.f57449b.f57457g);
        a aVar2 = this.f57449b;
        aVar2.f57460j = false;
        return aVar2.f57459i;
    }

    private void b(C7050f c7050f) {
        int size = c7050f.f55245w0.size();
        InterfaceC2026b interfaceC2026bU0 = c7050f.U0();
        for (int i10 = 0; i10 < size; i10++) {
            C7049e c7049e = (C7049e) c7050f.f55245w0.get(i10);
            if (!(c7049e instanceof C7052h) && (!c7049e.f55115e.f57502e.f57481j || !c7049e.f55117f.f57502e.f57481j)) {
                C7049e.b bVarS = c7049e.s(0);
                C7049e.b bVarS2 = c7049e.s(1);
                C7049e.b bVar = C7049e.b.MATCH_CONSTRAINT;
                if (bVarS != bVar || c7049e.f55129l == 1 || bVarS2 != bVar || c7049e.f55131m == 1) {
                    a(interfaceC2026bU0, c7049e, false);
                }
            }
        }
        interfaceC2026bU0.a();
    }

    private void c(C7050f c7050f, String str, int i10, int i11) {
        int iE = c7050f.E();
        int iD = c7050f.D();
        c7050f.u0(0);
        c7050f.t0(0);
        c7050f.E0(i10);
        c7050f.h0(i11);
        c7050f.u0(iE);
        c7050f.t0(iD);
        this.f57450c.K0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v28 */
    /* JADX WARN: Type inference failed for: r14v29 */
    /* JADX WARN: Type inference failed for: r14v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v47, types: [int] */
    /* JADX WARN: Type inference failed for: r2v49 */
    public long d(C7050f c7050f, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        boolean z10;
        boolean zS0;
        int i19;
        boolean z11;
        boolean z12;
        int i20;
        int i21;
        InterfaceC2026b interfaceC2026b;
        boolean z13;
        int i22;
        int i23;
        boolean z14;
        ?? r22;
        InterfaceC2026b interfaceC2026bU0 = c7050f.U0();
        int size = c7050f.f55245w0.size();
        int iP = c7050f.P();
        int iV = c7050f.v();
        boolean zB = AbstractC7055k.b(i10, 128);
        boolean z15 = true;
        boolean z16 = zB || AbstractC7055k.b(i10, 64);
        if (z16) {
            for (int i24 = 0; i24 < size; i24++) {
                C7049e c7049e = (C7049e) c7050f.f55245w0.get(i24);
                C7049e.b bVarY = c7049e.y();
                C7049e.b bVar = C7049e.b.MATCH_CONSTRAINT;
                boolean z17 = (bVarY == bVar) && (c7049e.M() == bVar) && c7049e.t() > 0.0f;
                if ((c7049e.V() && z17) || ((c7049e.X() && z17) || (c7049e instanceof AbstractC7056l) || c7049e.V() || c7049e.X())) {
                    z16 = false;
                    break;
                }
            }
        }
        if (z16) {
            boolean z18 = n1.d.f54229r;
        }
        int i25 = 2;
        if (z16 && ((i13 == 1073741824 && i15 == 1073741824) || zB)) {
            int iMin = Math.min(c7050f.C(), i14);
            int iMin2 = Math.min(c7050f.B(), i16);
            if (i13 == 1073741824 && c7050f.P() != iMin) {
                c7050f.E0(iMin);
                c7050f.X0();
            }
            if (i15 == 1073741824 && c7050f.v() != iMin2) {
                c7050f.h0(iMin2);
                c7050f.X0();
            }
            if (i13 == 1073741824 && i15 == 1073741824) {
                zS0 = c7050f.R0(zB);
                i19 = 2;
                z10 = false;
            } else {
                zS0 = c7050f.S0(zB);
                z10 = false;
                if (i13 == 1073741824) {
                    zS0 &= c7050f.T0(zB, 0);
                    i19 = 1;
                } else {
                    i19 = 0;
                }
                if (i15 == 1073741824) {
                    zS0 &= c7050f.T0(zB, 1);
                    i19++;
                }
            }
            if (zS0) {
                c7050f.I0(i13 == 1073741824 ? true : z10, i15 == 1073741824 ? true : z10);
            }
        } else {
            z10 = false;
            zS0 = false;
            i19 = 0;
        }
        if (zS0 && i19 == 2) {
            return 0L;
        }
        if (size > 0) {
            b(c7050f);
        }
        int iV0 = c7050f.V0();
        int size2 = this.f57448a.size();
        if (size > 0) {
            c(c7050f, "First pass", iP, iV);
        }
        if (size2 > 0) {
            C7049e.b bVarY2 = c7050f.y();
            C7049e.b bVar2 = C7049e.b.WRAP_CONTENT;
            boolean z19 = bVarY2 == bVar2 ? true : z10;
            boolean z20 = c7050f.M() == bVar2 ? true : z10;
            int iMax = Math.max(c7050f.P(), this.f57450c.E());
            int iMax2 = Math.max(c7050f.v(), this.f57450c.D());
            boolean z21 = z10;
            boolean zV0 = z21;
            ?? r14 = z21;
            while (r14 < size2) {
                C7049e c7049e2 = (C7049e) this.f57448a.get(r14);
                if (c7049e2 instanceof AbstractC7056l) {
                    int iP2 = c7049e2.P();
                    i23 = iV0;
                    int iV2 = c7049e2.v();
                    boolean zA = zV0 | a(interfaceC2026bU0, c7049e2, z15);
                    int iP3 = c7049e2.P();
                    int iV3 = c7049e2.v();
                    if (iP3 != iP2) {
                        c7049e2.E0(iP3);
                        if (z19 && c7049e2.I() > iMax) {
                            iMax = Math.max(iMax, c7049e2.I() + c7049e2.m(C7048d.b.RIGHT).c());
                        }
                        z14 = true;
                    } else {
                        z14 = zA;
                    }
                    if (iV3 != iV2) {
                        c7049e2.h0(iV3);
                        if (z20 && c7049e2.p() > iMax2) {
                            iMax2 = Math.max(iMax2, c7049e2.p() + c7049e2.m(C7048d.b.BOTTOM).c());
                        }
                        z14 = true;
                    }
                    zV0 = z14 | ((AbstractC7056l) c7049e2).V0();
                    r22 = 1;
                } else {
                    i23 = iV0;
                    r22 = z15;
                }
                int i26 = r14 + r22;
                z15 = r22;
                i25 = 2;
                iV0 = i23;
                r14 = i26;
            }
            int i27 = iV0;
            int i28 = 0;
            for (int i29 = i25; i28 < i29; i29 = 2) {
                int i30 = 0;
                while (i30 < size2) {
                    C7049e c7049e3 = (C7049e) this.f57448a.get(i30);
                    if (((c7049e3 instanceof InterfaceC7053i) && !(c7049e3 instanceof AbstractC7056l)) || (c7049e3 instanceof C7052h) || c7049e3.O() == 8 || ((c7049e3.f55115e.f57502e.f57481j && c7049e3.f55117f.f57502e.f57481j) || (c7049e3 instanceof AbstractC7056l))) {
                        i20 = size2;
                        interfaceC2026b = interfaceC2026bU0;
                        i21 = i28;
                    } else {
                        int iP4 = c7049e3.P();
                        int iV4 = c7049e3.v();
                        i20 = size2;
                        int iN = c7049e3.n();
                        i21 = i28;
                        boolean zA2 = zV0 | a(interfaceC2026bU0, c7049e3, true);
                        int iP5 = c7049e3.P();
                        interfaceC2026b = interfaceC2026bU0;
                        int iV5 = c7049e3.v();
                        if (iP5 != iP4) {
                            c7049e3.E0(iP5);
                            if (z19 && c7049e3.I() > iMax) {
                                iMax = Math.max(iMax, c7049e3.I() + c7049e3.m(C7048d.b.RIGHT).c());
                            }
                            z13 = true;
                        } else {
                            z13 = zA2;
                        }
                        if (iV5 != iV4) {
                            c7049e3.h0(iV5);
                            if (z20 && c7049e3.p() > iMax2) {
                                iMax2 = Math.max(iMax2, c7049e3.p() + c7049e3.m(C7048d.b.BOTTOM).c());
                            }
                            z13 = true;
                        }
                        if (!c7049e3.S() || iN == c7049e3.n()) {
                            zV0 = z13;
                        } else {
                            i22 = 1;
                            zV0 = true;
                            i30 += i22;
                            size2 = i20;
                            interfaceC2026bU0 = interfaceC2026b;
                            i28 = i21;
                        }
                    }
                    i22 = 1;
                    i30 += i22;
                    size2 = i20;
                    interfaceC2026bU0 = interfaceC2026b;
                    i28 = i21;
                }
                int i31 = size2;
                InterfaceC2026b interfaceC2026b2 = interfaceC2026bU0;
                int i32 = i28;
                if (zV0) {
                    c(c7050f, "intermediate pass", iP, iV);
                    zV0 = false;
                }
                i28 = i32 + 1;
                size2 = i31;
                interfaceC2026bU0 = interfaceC2026b2;
            }
            if (zV0) {
                c(c7050f, "2nd pass", iP, iV);
                if (c7050f.P() < iMax) {
                    c7050f.E0(iMax);
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c7050f.v() < iMax2) {
                    c7050f.h0(iMax2);
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (z12) {
                    c(c7050f, "3rd pass", iP, iV);
                }
            }
            iV0 = i27;
        }
        c7050f.g1(iV0);
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(o1.C7050f r7) {
        /*
            r6 = this;
            java.util.ArrayList r0 = r6.f57448a
            r0.clear()
            java.util.ArrayList r0 = r7.f55245w0
            int r0 = r0.size()
            r1 = 0
        Lc:
            if (r1 >= r0) goto L3a
            java.util.ArrayList r2 = r7.f55245w0
            java.lang.Object r2 = r2.get(r1)
            o1.e r2 = (o1.C7049e) r2
            o1.e$b r3 = r2.y()
            o1.e$b r4 = o1.C7049e.b.MATCH_CONSTRAINT
            if (r3 == r4) goto L32
            o1.e$b r3 = r2.y()
            o1.e$b r5 = o1.C7049e.b.MATCH_PARENT
            if (r3 == r5) goto L32
            o1.e$b r3 = r2.M()
            if (r3 == r4) goto L32
            o1.e$b r3 = r2.M()
            if (r3 != r5) goto L37
        L32:
            java.util.ArrayList r3 = r6.f57448a
            r3.add(r2)
        L37:
            int r1 = r1 + 1
            goto Lc
        L3a:
            r7.X0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.C7206b.e(o1.f):void");
    }
}
