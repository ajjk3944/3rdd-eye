package g1;

import java.util.ArrayList;
import java.util.HashMap;
import u0.j1;
import x.m0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class c extends g {

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f24207n = new int[0];

    /* renamed from: e, reason: collision with root package name */
    public final mk.c f24208e;

    /* renamed from: f, reason: collision with root package name */
    public final mk.c f24209f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public x.f0 f24210h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f24211i;
    public k j;

    /* renamed from: k, reason: collision with root package name */
    public int[] f24212k;

    /* renamed from: l, reason: collision with root package name */
    public int f24213l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f24214m;

    public c(long j, k kVar, mk.c cVar, mk.c cVar2) {
        super(j, kVar);
        this.f24208e = cVar;
        this.f24209f = cVar2;
        this.j = k.f24250e;
        this.f24212k = f24207n;
        this.f24213l = 1;
    }

    public final void A(long j) {
        synchronized (m.f24260c) {
            this.j = this.j.g(j);
        }
    }

    public final void B(k kVar) {
        synchronized (m.f24260c) {
            this.j = this.j.f(kVar);
        }
    }

    public void C(x.f0 f0Var) {
        this.f24210h = f0Var;
    }

    public c D(mk.c cVar, mk.c cVar2) throws Throwable {
        long j;
        long j8;
        k kVarD;
        if (this.f24240c) {
            j1.a("Cannot use a disposed snapshot");
        }
        if (this.f24214m && this.f24241d < 0) {
            j1.b("Unsupported operation on a disposed or applied snapshot");
        }
        A(g());
        Object obj = m.f24260c;
        synchronized (obj) {
            try {
                j = m.f24262e;
                j8 = 1;
                m.f24262e = j + j8;
                m.f24261d = m.f24261d.g(j);
                kVarD = d();
                r(kVarD.g(j));
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                d dVar = new d(j, m.d(kVarD, g() + j8, j), m.k(cVar, e(), true), m.l(cVar2, i()), this);
                if (this.f24214m || this.f24240c) {
                    return dVar;
                }
                long jG = g();
                synchronized (obj) {
                    long j9 = m.f24262e;
                    m.f24262e = j9 + j8;
                    s(j9);
                    m.f24261d = m.f24261d.g(g());
                }
                r(m.d(d(), jG + j8, g()));
                return dVar;
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        }
    }

    @Override // g1.g
    public final void b() {
        m.f24261d = m.f24261d.c(g()).a(this.j);
    }

    @Override // g1.g
    public void c() {
        if (this.f24240c) {
            return;
        }
        this.f24240c = true;
        synchronized (m.f24260c) {
            o();
        }
        l();
    }

    @Override // g1.g
    public boolean f() {
        return false;
    }

    @Override // g1.g
    public int h() {
        return this.g;
    }

    @Override // g1.g
    public mk.c i() {
        return this.f24209f;
    }

    @Override // g1.g
    public void k() {
        this.f24213l++;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    @Override // g1.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l() {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.f24213l
            if (r1 <= 0) goto L7
            goto Lc
        L7:
            java.lang.String r1 = "no pending nested snapshots"
            u0.j1.a(r1)
        Lc:
            int r1 = r0.f24213l
            int r1 = r1 + (-1)
            r0.f24213l = r1
            if (r1 != 0) goto L94
            boolean r1 = r0.f24214m
            if (r1 != 0) goto L94
            x.f0 r1 = r0.x()
            if (r1 == 0) goto L91
            boolean r2 = r0.f24214m
            if (r2 == 0) goto L27
            java.lang.String r2 = "Unsupported operation on a snapshot that has been applied"
            u0.j1.b(r2)
        L27:
            r2 = 0
            r0.C(r2)
            long r2 = r0.g()
            java.lang.Object[] r4 = r1.f36883b
            long[] r1 = r1.f36882a
            int r5 = r1.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L91
            r7 = 0
        L39:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L8c
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L53:
            if (r12 >= r10) goto L8a
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L86
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r4[r13]
            g1.x r13 = (g1.x) r13
            g1.z r13 = r13.a()
        L69:
            if (r13 == 0) goto L86
            long r14 = r13.f24299a
            int r16 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r16 == 0) goto L7d
            g1.k r6 = r0.j
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            boolean r6 = zj.n.Z(r6, r14)
            if (r6 == 0) goto L83
        L7d:
            b7.w r6 = g1.m.f24258a
            r14 = 0
            r13.f24299a = r14
        L83:
            g1.z r13 = r13.f24300b
            goto L69
        L86:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L53
        L8a:
            if (r10 != r11) goto L91
        L8c:
            if (r7 == r5) goto L91
            int r7 = r7 + 1
            goto L39
        L91:
            r0.a()
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.c.l():void");
    }

    @Override // g1.g
    public void m() {
        if (this.f24214m || this.f24240c) {
            return;
        }
        v();
    }

    @Override // g1.g
    public void n(x xVar) {
        x.f0 f0VarX = x();
        if (f0VarX == null) {
            x.f0 f0Var = m0.f36916a;
            f0VarX = new x.f0();
            C(f0VarX);
        }
        f0VarX.a(xVar);
    }

    @Override // g1.g
    public final void p() {
        int length = this.f24212k.length;
        for (int i4 = 0; i4 < length; i4++) {
            m.v(this.f24212k[i4]);
        }
        o();
    }

    @Override // g1.g
    public void t(int i4) {
        this.g = i4;
    }

    @Override // g1.g
    public g u(mk.c cVar) throws Throwable {
        long j;
        long j8;
        if (this.f24240c) {
            j1.a("Cannot use a disposed snapshot");
        }
        if (this.f24214m && this.f24241d < 0) {
            j1.b("Unsupported operation on a disposed or applied snapshot");
        }
        long jG = g();
        A(g());
        Object obj = m.f24260c;
        synchronized (obj) {
            try {
                j = m.f24262e;
                j8 = 1;
                m.f24262e = j + j8;
                m.f24261d = m.f24261d.g(j);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                e eVar = new e(j, m.d(d(), jG + j8, j), m.k(cVar, e(), true), this);
                if (this.f24214m || this.f24240c) {
                    return eVar;
                }
                long jG2 = g();
                synchronized (obj) {
                    long j9 = m.f24262e;
                    m.f24262e = j9 + j8;
                    s(j9);
                    m.f24261d = m.f24261d.g(g());
                }
                r(m.d(d(), jG2 + j8, g()));
                return eVar;
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        }
    }

    public final void v() {
        long j;
        A(g());
        if (this.f24214m || this.f24240c) {
            return;
        }
        long jG = g();
        synchronized (m.f24260c) {
            long j8 = m.f24262e;
            j = 1;
            m.f24262e = j8 + j;
            s(j8);
            m.f24261d = m.f24261d.g(g());
        }
        r(m.d(d(), jG + j, g()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public g1.r w() {
        /*
            Method dump skipped, instructions count: 363
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.c.w():g1.r");
    }

    public x.f0 x() {
        return this.f24210h;
    }

    @Override // g1.g
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public mk.c e() {
        return this.f24208e;
    }

    public final r z(long j, x.f0 f0Var, HashMap map, k kVar) {
        ArrayList arrayList;
        ArrayList arrayListJ0;
        ArrayList arrayList2;
        k kVar2;
        Object[] objArr;
        long[] jArr;
        k kVar3;
        Object[] objArr2;
        long[] jArr2;
        int i4;
        long j8;
        ArrayList arrayList3;
        z zVarC;
        k kVarF = d().g(g()).f(this.j);
        Object[] objArr3 = f0Var.f36883b;
        long[] jArr3 = f0Var.f36882a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i10 = 0;
            arrayList2 = null;
            arrayListJ0 = null;
            while (true) {
                long j9 = jArr3[i10];
                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j9 & 255) < 128) {
                            objArr2 = objArr3;
                            x xVar = (x) objArr3[(i10 << 3) + i12];
                            jArr2 = jArr3;
                            z zVarA = xVar.a();
                            i4 = i12;
                            ArrayList arrayList4 = arrayList2;
                            z zVarT = m.t(zVarA, j, kVar);
                            if (zVarT == null) {
                                kVar3 = kVarF;
                                arrayList3 = arrayListJ0;
                                j8 = j9;
                            } else {
                                arrayList3 = arrayListJ0;
                                j8 = j9;
                                z zVarT2 = m.t(zVarA, g(), kVarF);
                                if (zVarT2 == null) {
                                    kVar3 = kVarF;
                                } else {
                                    kVar3 = kVarF;
                                    if (zVarT2.f24299a != 1 && !zVarT.equals(zVarT2)) {
                                        z zVarT3 = m.t(zVarA, g(), d());
                                        if (zVarT3 == null) {
                                            m.s();
                                            throw null;
                                        }
                                        if (map == null || (zVarC = (z) map.get(zVarT)) == null) {
                                            zVarC = xVar.c(zVarT2, zVarT, zVarT3);
                                        }
                                        if (zVarC == null) {
                                            return new h(this);
                                        }
                                        if (!zVarC.equals(zVarT3)) {
                                            if (zVarC.equals(zVarT)) {
                                                ArrayList arrayList5 = arrayList4 == null ? new ArrayList() : arrayList4;
                                                arrayList5.add(new yj.i(xVar, zVarT.b(g())));
                                                arrayListJ0 = arrayList3 == null ? new ArrayList() : arrayList3;
                                                arrayListJ0.add(xVar);
                                                arrayList2 = arrayList5;
                                            } else {
                                                arrayList2 = arrayList4 == null ? new ArrayList() : arrayList4;
                                                arrayList2.add(!zVarC.equals(zVarT2) ? new yj.i(xVar, zVarC) : new yj.i(xVar, zVarT2.b(g())));
                                            }
                                        }
                                        arrayListJ0 = arrayList3;
                                    }
                                }
                            }
                            arrayList2 = arrayList4;
                            arrayListJ0 = arrayList3;
                        } else {
                            kVar3 = kVarF;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i4 = i12;
                            j8 = j9;
                        }
                        j9 = j8 >> 8;
                        i12 = i4 + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        kVarF = kVar3;
                    }
                    kVar2 = kVarF;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i11 != 8) {
                        break;
                    }
                } else {
                    kVar2 = kVarF;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i10 == length) {
                    arrayList = arrayList2;
                    break;
                }
                i10++;
                jArr3 = jArr;
                objArr3 = objArr;
                kVarF = kVar2;
            }
        } else {
            arrayList = null;
            arrayListJ0 = null;
        }
        arrayList2 = arrayList;
        if (arrayList2 != null) {
            v();
            int size = arrayList2.size();
            for (int i13 = 0; i13 < size; i13++) {
                yj.i iVar = (yj.i) arrayList2.get(i13);
                x xVar2 = (x) iVar.f37638a;
                z zVar = (z) iVar.f37639b;
                zVar.f24299a = j;
                synchronized (m.f24260c) {
                    zVar.f24300b = xVar2.a();
                    xVar2.d(zVar);
                }
            }
        }
        if (arrayListJ0 != null) {
            int size2 = arrayListJ0.size();
            for (int i14 = 0; i14 < size2; i14++) {
                f0Var.l((x) arrayListJ0.get(i14));
            }
            ArrayList arrayList6 = this.f24211i;
            if (arrayList6 != null) {
                arrayListJ0 = zj.n.j0(arrayList6, arrayListJ0);
            }
            this.f24211i = arrayListJ0;
        }
        return i.f24243c;
    }
}
