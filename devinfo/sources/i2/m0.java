package i2;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.internal.ads.be1;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class m0 extends g2.s0 implements g2.l0, w0 {

    /* renamed from: f, reason: collision with root package name */
    public j0 f25709f;
    public mk.c g;

    /* renamed from: h, reason: collision with root package name */
    public q1 f25710h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f25711i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f25712k;

    /* renamed from: l, reason: collision with root package name */
    public final g2.g0 f25713l = new g2.g0(0, this);

    /* renamed from: m, reason: collision with root package name */
    public be1 f25714m;

    /* renamed from: n, reason: collision with root package name */
    public x.e0 f25715n;

    public static void l0(d1 d1Var) {
        f0 f0Var;
        d1 d1Var2 = d1Var.f25611p;
        e0 e0Var = d1Var.f25610o;
        if (!nk.k.a(d1Var2 != null ? d1Var2.f25610o : null, e0Var)) {
            e0Var.H.f25687p.f25802x.f();
            return;
        }
        a aVarJ = e0Var.H.f25687p.j();
        if (aVarJ == null || (f0Var = ((u0) aVarJ).f25802x) == null) {
            return;
        }
        f0Var.f();
    }

    @Override // d3.c
    public final float C(int i4) {
        return i4 / a();
    }

    @Override // d3.c
    public final float D(float f10) {
        return f10 / a();
    }

    @Override // g2.q
    public boolean H() {
        return false;
    }

    @Override // d3.c
    public final float I(float f10) {
        return a() * f10;
    }

    @Override // g2.l0
    public final g2.k0 N(int i4, int i10, Map map, mk.c cVar, mk.c cVar2) {
        if ((i4 & (-16777216)) != 0 || ((-16777216) & i10) != 0) {
            f2.a.b("Size(" + i4 + " x " + i10 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new l0(i4, i10, map, cVar, cVar2, this);
    }

    @Override // g2.l0
    public final g2.k0 O(int i4, int i10, Map map, mk.c cVar) {
        return N(i4, i10, map, null, cVar);
    }

    @Override // d3.c
    public final /* synthetic */ int Q(float f10) {
        return d.h.i(this, f10);
    }

    @Override // d3.c
    public final /* synthetic */ long T(long j) {
        return d.h.m(j, this);
    }

    @Override // d3.c
    public final /* synthetic */ float W(long j) {
        return d.h.l(j, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Y(i2.e0 r32, g2.n r33) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.m0.Y(i2.e0, g2.n):void");
    }

    public abstract int Z(g2.a aVar);

    /* JADX WARN: Multi-variable type inference failed */
    public final void a0(q1 q1Var, long j, long j8) {
        boolean z3;
        char c9;
        long j9;
        long j10;
        long j11;
        e0 e0Var;
        boolean z10;
        int i4;
        char c10;
        long j12;
        o1 snapshotObserver;
        x.e0 e0Var2 = this.f25715n;
        be1 be1Var = this.f25714m;
        if (be1Var == null) {
            be1Var = new be1();
            this.f25714m = be1Var;
        }
        be1 be1Var2 = be1Var;
        m1 m1Var = g0().f25639o;
        if (m1Var != null && (snapshotObserver = ((j2.r) m1Var).getSnapshotObserver()) != null) {
            snapshotObserver.f25732a.b(q1Var, d.f25599c, new k0(this, j, j8, q1Var));
        }
        boolean zH = H();
        x.f0 f0Var = (x.f0) be1Var2.f9661e;
        x.f0 f0Var2 = (x.f0) be1Var2.f9662f;
        int i10 = be1Var2.f9657a;
        for (int i11 = 0; i11 < i10; i11++) {
            byte b10 = ((byte[]) be1Var2.f9660d)[i11];
            if (b10 == 3) {
                g2.n nVar = ((g2.n[]) be1Var2.f9658b)[i11];
                nk.k.b(nVar);
                f0Var2.j(nVar);
            } else if (b10 != 0 && e0Var2 != null) {
                g2.n nVar2 = ((g2.n[]) be1Var2.f9658b)[i11];
                nk.k.b(nVar2);
                x.f0 f0Var3 = (x.f0) e0Var2.k(nVar2);
                if (f0Var3 != null) {
                    f0Var.k(f0Var3);
                }
            }
        }
        int i12 = be1Var2.f9657a;
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            byte[] bArr = (byte[]) be1Var2.f9660d;
            if (bArr[i14] == 2) {
                i13++;
            } else if (i13 > 0) {
                g2.n[] nVarArr = (g2.n[]) be1Var2.f9658b;
                nVarArr[i14 - i13] = nVarArr[i14];
            }
            bArr[i14] = 2;
        }
        int i15 = be1Var2.f9657a;
        for (int i16 = i15 - i13; i16 < i15; i16++) {
            ((g2.n[]) be1Var2.f9658b)[i16] = null;
        }
        be1Var2.f9657a -= i13;
        m0 m0VarI0 = i0();
        Object[] objArr = f0Var2.f36883b;
        long[] jArr = f0Var2.f36882a;
        int length = jArr.length - 2;
        char c11 = 7;
        long j13 = -9187201950435737472L;
        int i17 = 8;
        if (length >= 0) {
            j10 = 128;
            int i18 = 0;
            while (true) {
                long j14 = jArr[i18];
                j11 = 255;
                if ((((~j14) << c11) & j14 & j13) != j13) {
                    int i19 = 8 - ((~(i18 - length)) >>> 31);
                    int i20 = 0;
                    while (i20 < i19) {
                        if ((j14 & 255) < 128) {
                            c10 = c11;
                            g2.n nVar3 = (g2.n) objArr[(i18 << 3) + i20];
                            j12 = j13;
                            m0 m0Var = m0VarI0 == null ? this : m0VarI0;
                            i4 = i17;
                            m0 m0Var2 = m0Var;
                            while (true) {
                                be1 be1Var3 = m0Var2.f25714m;
                                if (be1Var3 != null) {
                                    z10 = zH;
                                    if (!zj.m.K(nVar3, (g2.n[]) be1Var3.f9658b)) {
                                        break;
                                        break;
                                    }
                                    break;
                                }
                                z10 = zH;
                                m0 m0VarI02 = m0Var2.i0();
                                if (m0VarI02 == null) {
                                    break;
                                }
                                m0Var2 = m0VarI02;
                                zH = z10;
                            }
                            x.e0 e0Var3 = m0Var2.f25715n;
                            x.f0 f0Var4 = e0Var3 != null ? (x.f0) e0Var3.k(nVar3) : null;
                            if (f0Var4 != null) {
                                m0Var.m0(f0Var4);
                            }
                        } else {
                            z10 = zH;
                            i4 = i17;
                            c10 = c11;
                            j12 = j13;
                        }
                        j14 >>= i4;
                        i20++;
                        c11 = c10;
                        j13 = j12;
                        i17 = i4;
                        zH = z10;
                    }
                    z3 = zH;
                    c9 = c11;
                    j9 = j13;
                    if (i19 != i17) {
                        break;
                    }
                } else {
                    z3 = zH;
                    c9 = c11;
                    j9 = j13;
                }
                if (i18 == length) {
                    break;
                }
                i18++;
                c11 = c9;
                j13 = j9;
                zH = z3;
                i17 = 8;
            }
        } else {
            z3 = zH;
            c9 = 7;
            j9 = -9187201950435737472L;
            j10 = 128;
            j11 = 255;
        }
        f0Var2.b();
        Object[] objArr2 = f0Var.f36883b;
        long[] jArr2 = f0Var.f36882a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i21 = 0;
            while (true) {
                long j15 = jArr2[i21];
                if ((((~j15) << c9) & j15 & j9) != j9) {
                    int i22 = 8 - ((~(i21 - length2)) >>> 31);
                    for (int i23 = 0; i23 < i22; i23++) {
                        if ((j15 & j11) < j10 && (e0Var = (e0) ((a2) objArr2[(i21 << 3) + i23]).get()) != null) {
                            if (z3) {
                                e0Var.S(false);
                            } else {
                                e0Var.U(false);
                            }
                        }
                        j15 >>= 8;
                    }
                    if (i22 != 8) {
                        break;
                    }
                }
                if (i21 == length2) {
                    break;
                } else {
                    i21++;
                }
            }
        }
        f0Var.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b0(g2.k0 r15) {
        /*
            r14 = this;
            x.e0 r0 = r14.f25715n
            boolean r1 = r14.f25712k
            if (r1 == 0) goto L9
        L6:
            r1 = r14
            goto Lbe
        L9:
            mk.c r1 = r15.d()
            r2 = 0
            if (r1 != 0) goto L5a
            if (r0 == 0) goto L6
            java.lang.Object[] r15 = r0.f36875c
            long[] r1 = r0.f36873a
            int r3 = r1.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L56
            r4 = r2
        L1c:
            r5 = r1[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L51
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r2
        L36:
            if (r9 >= r7) goto L4f
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L4b
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r15[r10]
            x.f0 r10 = (x.f0) r10
            r14.m0(r10)
        L4b:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L36
        L4f:
            if (r7 != r8) goto L56
        L51:
            if (r4 == r3) goto L56
            int r4 = r4 + 1
            goto L1c
        L56:
            r0.a()
            return
        L5a:
            mk.c r0 = r14.g
            r3 = 1
            if (r0 == r1) goto L61
            r0 = r3
            goto L62
        L61:
            r0 = r2
        L62:
            r4 = 0
            if (r0 != 0) goto L9b
            i2.j0 r1 = r14.k0()
            boolean r1 = r1.f25692a
            if (r1 == 0) goto L9b
            g2.v r0 = r14.e0()
            long r4 = r0.u(r4)
            long r4 = ii.a.D(r4)
            long r0 = r0.m()
            i2.j0 r6 = r14.k0()
            long r6 = r6.f25693b
            boolean r6 = d3.i.a(r4, r6)
            if (r6 == 0) goto L96
            i2.j0 r6 = r14.k0()
            long r6 = r6.f25694c
            boolean r6 = d3.k.a(r0, r6)
            if (r6 != 0) goto L97
        L96:
            r2 = r3
        L97:
            r3 = r4
            r5 = r0
            r0 = r2
            goto La2
        L9b:
            r1 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            r5 = r4
            r3 = r1
        La2:
            if (r0 == 0) goto L6
            i2.q1 r0 = r14.f25710h
            if (r0 == 0) goto Lad
            r0.f25760a = r15
        Laa:
            r1 = r14
            r2 = r0
            goto Lb5
        Lad:
            i2.q1 r0 = new i2.q1
            r0.<init>(r15, r14)
            r14.f25710h = r0
            goto Laa
        Lb5:
            r1.a0(r2, r3, r5)
            mk.c r15 = r15.d()
            r1.g = r15
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.m0.b0(g2.k0):void");
    }

    public final int c0(g2.a aVar) {
        int iZ;
        if (f0() && (iZ = Z(aVar)) != Integer.MIN_VALUE) {
            return iZ + ((int) (aVar instanceof g2.f1 ? this.f24412e >> 32 : this.f24412e & 4294967295L));
        }
        return LinearLayoutManager.INVALID_OFFSET;
    }

    public abstract m0 d0();

    public abstract g2.v e0();

    public abstract boolean f0();

    public abstract e0 g0();

    public abstract g2.k0 h0();

    public abstract m0 i0();

    public abstract long j0();

    public final j0 k0() {
        j0 j0Var = this.f25709f;
        if (j0Var != null) {
            return j0Var;
        }
        j0 j0Var2 = new j0(this);
        this.f25709f = j0Var2;
        return j0Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m0(x.f0 f0Var) {
        e0 e0Var;
        Object[] objArr = f0Var.f36883b;
        long[] jArr = f0Var.f36882a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i4 = 0;
        while (true) {
            long j = jArr[i4];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i4 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j) < 128 && (e0Var = (e0) ((a2) objArr[(i4 << 3) + i11]).get()) != null) {
                        if (H()) {
                            e0Var.S(false);
                        } else {
                            e0Var.U(false);
                        }
                    }
                    j >>= 8;
                }
                if (i10 != 8) {
                    return;
                }
            }
            if (i4 == length) {
                return;
            } else {
                i4++;
            }
        }
    }

    public abstract void n0();

    @Override // d3.c
    public final /* synthetic */ float o(long j) {
        return d.h.k(j, this);
    }

    @Override // d3.c
    public final long x(float f10) {
        return d.h.n(this, D(f10));
    }

    @Override // i2.w0
    public final void z(boolean z3) {
        m0 m0VarI0 = i0();
        e0 e0VarG0 = m0VarI0 != null ? m0VarI0.g0() : null;
        if (nk.k.a(e0VarG0, g0())) {
            this.f25711i = z3;
            return;
        }
        if ((e0VarG0 != null ? e0VarG0.H.f25677d : null) != a0.f25569c) {
            if ((e0VarG0 != null ? e0VarG0.H.f25677d : null) != a0.f25570d) {
                return;
            }
        }
        this.f25711i = z3;
    }
}
