package x1;

import androidx.compose.ui.node.Owner;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class m0 extends v1.v implements a1, t2.c {

    /* renamed from: g, reason: collision with root package name */
    public j0 f24883g;

    /* renamed from: h, reason: collision with root package name */
    public ar.k f24884h;

    /* renamed from: i, reason: collision with root package name */
    public p1 f24885i;
    public boolean j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public final v1.o f24886l = new v1.o(0, this);

    /* renamed from: m, reason: collision with root package name */
    public h7.b f24887m;

    /* renamed from: n, reason: collision with root package name */
    public u.a0 f24888n;

    public static void e0(f1 f1Var) {
        g0 g0Var;
        f1 f1Var2 = f1Var.f24822p;
        f0 f0Var = f1Var.f24821o;
        if (!br.l.a(f1Var2 != null ? f1Var2.f24821o : null, f0Var)) {
            f0Var.r().f24859p.f24974w.f();
            return;
        }
        a aVarE = f0Var.r().f24859p.e();
        if (aVarE == null || (g0Var = ((y0) aVarE).f24974w) == null) {
            return;
        }
        g0Var.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void R(x1.f0 r32, v1.j r33) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.m0.R(x1.f0, v1.j):void");
    }

    public abstract int S(v1.h hVar);

    /* JADX WARN: Multi-variable type inference failed */
    public final void T(p1 p1Var, long j, long j7) {
        boolean z10;
        char c4;
        long j10;
        long j11;
        long j12;
        f0 f0Var;
        boolean z11;
        int i10;
        char c10;
        long j13;
        n1 snapshotObserver;
        u.a0 a0Var = this.f24888n;
        h7.b bVar = this.f24887m;
        if (bVar == null) {
            bVar = new h7.b();
            this.f24887m = bVar;
        }
        h7.b bVar2 = bVar;
        Owner owner = Z().f24808n;
        if (owner != null && (snapshotObserver = owner.getSnapshotObserver()) != null) {
            snapshotObserver.a(p1Var, d.f24779r, new k0(this, j, j7, p1Var));
        }
        boolean zF0 = f0();
        u.b0 b0Var = (u.b0) bVar2.f10003e;
        u.b0 b0Var2 = (u.b0) bVar2.f10004f;
        int i11 = bVar2.f9999a;
        for (int i12 = 0; i12 < i11; i12++) {
            byte b2 = ((byte[]) bVar2.f10002d)[i12];
            if (b2 == 3) {
                v1.j jVar = ((v1.j[]) bVar2.f10000b)[i12];
                br.l.b(jVar);
                b0Var2.i(jVar);
            } else if (b2 != 0 && a0Var != null) {
                v1.j jVar2 = ((v1.j[]) bVar2.f10000b)[i12];
                br.l.b(jVar2);
                u.b0 b0Var3 = (u.b0) a0Var.j(jVar2);
                if (b0Var3 != null) {
                    b0Var.j(b0Var3);
                }
            }
        }
        int i13 = bVar2.f9999a;
        int i14 = 0;
        for (int i15 = 0; i15 < i13; i15++) {
            byte[] bArr = (byte[]) bVar2.f10002d;
            if (bArr[i15] == 2) {
                i14++;
            } else if (i14 > 0) {
                v1.j[] jVarArr = (v1.j[]) bVar2.f10000b;
                jVarArr[i15 - i14] = jVarArr[i15];
            }
            bArr[i15] = 2;
        }
        int i16 = bVar2.f9999a;
        for (int i17 = i16 - i14; i17 < i16; i17++) {
            ((v1.j[]) bVar2.f10000b)[i17] = null;
        }
        bVar2.f9999a -= i14;
        m0 m0VarB0 = b0();
        Object[] objArr = b0Var2.f23045b;
        long[] jArr = b0Var2.f23044a;
        int length = jArr.length - 2;
        char c11 = 7;
        long j14 = -9187201950435737472L;
        int i18 = 8;
        if (length >= 0) {
            j11 = 128;
            int i19 = 0;
            while (true) {
                long j15 = jArr[i19];
                j12 = 255;
                if ((((~j15) << c11) & j15 & j14) != j14) {
                    int i20 = 8 - ((~(i19 - length)) >>> 31);
                    int i21 = 0;
                    while (i21 < i20) {
                        if ((j15 & 255) < 128) {
                            c10 = c11;
                            v1.j jVar3 = (v1.j) objArr[(i19 << 3) + i21];
                            j13 = j14;
                            m0 m0Var = m0VarB0 == null ? this : m0VarB0;
                            i10 = i18;
                            m0 m0Var2 = m0Var;
                            while (true) {
                                h7.b bVar3 = m0Var2.f24887m;
                                if (bVar3 != null) {
                                    z11 = zF0;
                                    if (!mq.l.Z(jVar3, (v1.j[]) bVar3.f10000b)) {
                                        break;
                                        break;
                                    }
                                    break;
                                }
                                z11 = zF0;
                                m0 m0VarB02 = m0Var2.b0();
                                if (m0VarB02 == null) {
                                    break;
                                }
                                m0Var2 = m0VarB02;
                                zF0 = z11;
                            }
                            u.a0 a0Var2 = m0Var2.f24888n;
                            u.b0 b0Var4 = a0Var2 != null ? (u.b0) a0Var2.j(jVar3) : null;
                            if (b0Var4 != null) {
                                m0Var.i0(b0Var4);
                            }
                        } else {
                            z11 = zF0;
                            i10 = i18;
                            c10 = c11;
                            j13 = j14;
                        }
                        j15 >>= i10;
                        i21++;
                        c11 = c10;
                        j14 = j13;
                        i18 = i10;
                        zF0 = z11;
                    }
                    z10 = zF0;
                    c4 = c11;
                    j10 = j14;
                    if (i20 != i18) {
                        break;
                    }
                } else {
                    z10 = zF0;
                    c4 = c11;
                    j10 = j14;
                }
                if (i19 == length) {
                    break;
                }
                i19++;
                c11 = c4;
                j14 = j10;
                zF0 = z10;
                i18 = 8;
            }
        } else {
            z10 = zF0;
            c4 = 7;
            j10 = -9187201950435737472L;
            j11 = 128;
            j12 = 255;
        }
        b0Var2.b();
        Object[] objArr2 = b0Var.f23045b;
        long[] jArr2 = b0Var.f23044a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i22 = 0;
            while (true) {
                long j16 = jArr2[i22];
                if ((((~j16) << c4) & j16 & j10) != j10) {
                    int i23 = 8 - ((~(i22 - length2)) >>> 31);
                    for (int i24 = 0; i24 < i23; i24++) {
                        if ((j16 & j12) < j11 && (f0Var = (f0) ((z1) objArr2[(i22 << 3) + i24]).get()) != null) {
                            if (z10) {
                                f0Var.k0(false);
                            } else {
                                f0Var.m0(false);
                            }
                        }
                        j16 >>= 8;
                    }
                    if (i23 != 8) {
                        break;
                    }
                }
                if (i22 == length2) {
                    break;
                } else {
                    i22++;
                }
            }
        }
        b0Var.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void U(x1.l0 r15) {
        /*
            r14 = this;
            u.a0 r0 = r14.f24888n
            boolean r1 = r14.k
            if (r1 == 0) goto L9
        L6:
            r1 = r14
            goto Lbe
        L9:
            ar.k r1 = r15.c()
            r2 = 0
            if (r1 != 0) goto L5a
            if (r0 == 0) goto L6
            java.lang.Object[] r15 = r0.f23039c
            long[] r1 = r0.f23037a
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
            u.b0 r10 = (u.b0) r10
            r14.i0(r10)
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
            ar.k r0 = r14.f24884h
            r3 = 1
            if (r0 == r1) goto L61
            r0 = r3
            goto L62
        L61:
            r0 = r2
        L62:
            r4 = 0
            if (r0 != 0) goto L9b
            x1.j0 r1 = r14.d0()
            boolean r1 = r1.f24864b
            if (r1 == 0) goto L9b
            v1.m r0 = r14.X()
            long r4 = r0.q(r4)
            long r4 = ic.a.I(r4)
            long r0 = r0.h()
            x1.j0 r6 = r14.d0()
            long r6 = r6.f24865c
            boolean r6 = i3.g.l(r4, r6)
            if (r6 == 0) goto L96
            x1.j0 r6 = r14.d0()
            long r6 = r6.f24866d
            boolean r6 = ir.f0.t(r0, r6)
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
            x1.p1 r0 = r14.f24885i
            if (r0 == 0) goto Lad
            r0.f24911b = r15
        Laa:
            r1 = r14
            r2 = r0
            goto Lb5
        Lad:
            x1.p1 r0 = new x1.p1
            r0.<init>(r15, r14)
            r14.f24885i = r0
            goto Laa
        Lb5:
            r1.T(r2, r3, r5)
            ar.k r15 = r15.c()
            r1.f24884h = r15
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.m0.U(x1.l0):void");
    }

    public final int V(v1.h hVar) {
        int iS;
        if (Y() && (iS = S(hVar)) != Integer.MIN_VALUE) {
            return iS + ((int) (this.f23813f & 4294967295L));
        }
        return Integer.MIN_VALUE;
    }

    public abstract m0 W();

    public abstract v1.m X();

    public abstract boolean Y();

    public abstract f0 Z();

    public abstract l0 a0();

    public abstract m0 b0();

    @Override // x1.a1
    public final void c() {
        m0 m0VarB0 = b0();
        f0 f0VarZ = m0VarB0 != null ? m0VarB0.Z() : null;
        if (br.l.a(f0VarZ, Z())) {
            return;
        }
        if ((f0VarZ != null ? f0VarZ.t() : null) != b0.LayingOut) {
            if (f0VarZ != null) {
                f0VarZ.t();
            }
            b0 b0Var = b0.Measuring;
        }
    }

    public abstract long c0();

    public final j0 d0() {
        j0 j0Var = this.f24883g;
        if (j0Var != null) {
            return j0Var;
        }
        j0 j0Var2 = new j0(this);
        this.f24883g = j0Var2;
        return j0Var2;
    }

    public boolean f0() {
        return false;
    }

    public l0 g0(int i10, int i11, Map map, ar.k kVar) {
        return h0(i10, i11, map, null, kVar);
    }

    public abstract t2.i getLayoutDirection();

    public final l0 h0(int i10, int i11, Map map, ar.k kVar, ar.k kVar2) {
        if ((i10 & (-16777216)) != 0 || ((-16777216) & i11) != 0) {
            u1.a.b("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new l0(i10, i11, map, kVar, kVar2, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i0(u.b0 b0Var) {
        f0 f0Var;
        Object[] objArr = b0Var.f23045b;
        long[] jArr = b0Var.f23044a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j = jArr[i10];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j) < 128 && (f0Var = (f0) ((z1) objArr[(i10 << 3) + i12]).get()) != null) {
                        if (f0()) {
                            f0Var.k0(false);
                        } else {
                            f0Var.m0(false);
                        }
                    }
                    j >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public abstract void j0();
}
