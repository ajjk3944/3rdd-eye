package x0;

import java.util.ArrayList;
import java.util.HashMap;
import n0.g1;
import u.b0;
import u.h0;

/* loaded from: classes.dex */
public class b extends f {

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f24683n = new int[0];

    /* renamed from: e, reason: collision with root package name */
    public final ar.k f24684e;

    /* renamed from: f, reason: collision with root package name */
    public final ar.k f24685f;

    /* renamed from: g, reason: collision with root package name */
    public int f24686g;

    /* renamed from: h, reason: collision with root package name */
    public b0 f24687h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f24688i;
    public j j;
    public int[] k;

    /* renamed from: l, reason: collision with root package name */
    public int f24689l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f24690m;

    public b(long j, j jVar, ar.k kVar, ar.k kVar2) {
        super(j, jVar);
        this.f24684e = kVar;
        this.f24685f = kVar2;
        this.j = j.f24707x;
        this.k = f24683n;
        this.f24689l = 1;
    }

    public final void A(long j) {
        synchronized (l.f24717c) {
            this.j = this.j.e(j);
        }
    }

    public void B(b0 b0Var) {
        this.f24687h = b0Var;
    }

    public b C(ar.k kVar, ar.k kVar2) throws Throwable {
        long j;
        long j7;
        j jVarD;
        if (this.f24699c) {
            g1.a("Cannot use a disposed snapshot");
        }
        if (this.f24690m && this.f24700d < 0) {
            g1.b("Unsupported operation on a disposed or applied snapshot");
        }
        A(g());
        Object obj = l.f24717c;
        synchronized (obj) {
            try {
                j = l.f24719e;
                j7 = 1;
                l.f24719e = j + j7;
                l.f24718d = l.f24718d.e(j);
                jVarD = d();
                r(jVarD.e(j));
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                c cVar = new c(j, l.e(jVarD, g() + j7, j), l.l(kVar, e(), true), l.b(kVar2, i()), this);
                if (this.f24690m || this.f24699c) {
                    return cVar;
                }
                long jG = g();
                synchronized (obj) {
                    long j10 = l.f24719e;
                    l.f24719e = j10 + j7;
                    s(j10);
                    l.f24718d = l.f24718d.e(g());
                }
                r(l.e(d(), jG + j7, g()));
                return cVar;
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        }
    }

    @Override // x0.f
    public final void b() {
        l.f24718d = l.f24718d.b(g()).a(this.j);
    }

    @Override // x0.f
    public void c() {
        if (this.f24699c) {
            return;
        }
        this.f24699c = true;
        synchronized (l.f24717c) {
            o();
        }
        l();
    }

    @Override // x0.f
    public boolean f() {
        return false;
    }

    @Override // x0.f
    public int h() {
        return this.f24686g;
    }

    @Override // x0.f
    public ar.k i() {
        return this.f24685f;
    }

    @Override // x0.f
    public void k() {
        this.f24689l++;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    @Override // x0.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l() {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.f24689l
            if (r1 <= 0) goto L7
            goto Lc
        L7:
            java.lang.String r1 = "no pending nested snapshots"
            n0.g1.a(r1)
        Lc:
            int r1 = r0.f24689l
            int r1 = r1 + (-1)
            r0.f24689l = r1
            if (r1 != 0) goto L94
            boolean r1 = r0.f24690m
            if (r1 != 0) goto L94
            u.b0 r1 = r0.x()
            if (r1 == 0) goto L91
            boolean r2 = r0.f24690m
            if (r2 == 0) goto L27
            java.lang.String r2 = "Unsupported operation on a snapshot that has been applied"
            n0.g1.b(r2)
        L27:
            r2 = 0
            r0.B(r2)
            long r2 = r0.g()
            java.lang.Object[] r4 = r1.f23045b
            long[] r1 = r1.f23044a
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
            x0.t r13 = (x0.t) r13
            x0.v r13 = r13.e()
        L69:
            if (r13 == 0) goto L86
            long r14 = r13.f24751a
            int r16 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r16 == 0) goto L7d
            x0.j r6 = r0.j
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            boolean r6 = mq.o.k0(r6, r14)
            if (r6 == 0) goto L83
        L7d:
            lu.u r6 = x0.l.f24715a
            r14 = 0
            r13.f24751a = r14
        L83:
            x0.v r13 = r13.f24752b
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
        throw new UnsupportedOperationException("Method not decompiled: x0.b.l():void");
    }

    @Override // x0.f
    public void m() {
        if (this.f24690m || this.f24699c) {
            return;
        }
        v();
    }

    @Override // x0.f
    public void n(t tVar) {
        b0 b0VarX = x();
        if (b0VarX == null) {
            int i10 = h0.f23073a;
            b0VarX = new b0();
            B(b0VarX);
        }
        b0VarX.a(tVar);
    }

    @Override // x0.f
    public final void p() {
        int length = this.k.length;
        for (int i10 = 0; i10 < length; i10++) {
            l.u(this.k[i10]);
        }
        o();
    }

    @Override // x0.f
    public void t(int i10) {
        this.f24686g = i10;
    }

    @Override // x0.f
    public f u(ar.k kVar) throws Throwable {
        long j;
        long j7;
        if (this.f24699c) {
            g1.a("Cannot use a disposed snapshot");
        }
        if (this.f24690m && this.f24700d < 0) {
            g1.b("Unsupported operation on a disposed or applied snapshot");
        }
        long jG = g();
        A(g());
        Object obj = l.f24717c;
        synchronized (obj) {
            try {
                j = l.f24719e;
                j7 = 1;
                l.f24719e = j + j7;
                l.f24718d = l.f24718d.e(j);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                d dVar = new d(j, l.e(d(), jG + j7, j), l.l(kVar, e(), true), this);
                if (this.f24690m || this.f24699c) {
                    return dVar;
                }
                long jG2 = g();
                synchronized (obj) {
                    long j10 = l.f24719e;
                    l.f24719e = j10 + j7;
                    s(j10);
                    l.f24718d = l.f24718d.e(g());
                }
                r(l.e(d(), jG2 + j7, g()));
                return dVar;
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        }
    }

    public final void v() {
        long j;
        A(g());
        if (this.f24690m || this.f24699c) {
            return;
        }
        long jG = g();
        synchronized (l.f24717c) {
            long j7 = l.f24719e;
            j = 1;
            l.f24719e = j7 + j;
            s(j7);
            l.f24718d = l.f24718d.e(g());
        }
        r(l.e(d(), jG + j, g()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public x0.p w() {
        /*
            Method dump skipped, instructions count: 363
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.b.w():x0.p");
    }

    public b0 x() {
        return this.f24687h;
    }

    @Override // x0.f
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public ar.k e() {
        return this.f24684e;
    }

    public final p z(long j, b0 b0Var, HashMap map, j jVar) {
        ArrayList arrayList;
        ArrayList arrayListE0;
        ArrayList arrayList2;
        j jVar2;
        Object[] objArr;
        long[] jArr;
        j jVar3;
        Object[] objArr2;
        long[] jArr2;
        int i10;
        long j7;
        ArrayList arrayList3;
        v vVarJ;
        j jVarD = d().e(g()).d(this.j);
        Object[] objArr3 = b0Var.f23045b;
        long[] jArr3 = b0Var.f23044a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i11 = 0;
            arrayList2 = null;
            arrayListE0 = null;
            while (true) {
                long j10 = jArr3[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    int i13 = 0;
                    while (i13 < i12) {
                        if ((j10 & 255) < 128) {
                            objArr2 = objArr3;
                            t tVar = (t) objArr3[(i11 << 3) + i13];
                            jArr2 = jArr3;
                            v vVarE = tVar.e();
                            i10 = i13;
                            ArrayList arrayList4 = arrayList2;
                            v vVarS = l.s(vVarE, j, jVar);
                            if (vVarS == null) {
                                jVar3 = jVarD;
                                arrayList3 = arrayListE0;
                                j7 = j10;
                            } else {
                                arrayList3 = arrayListE0;
                                j7 = j10;
                                v vVarS2 = l.s(vVarE, g(), jVarD);
                                if (vVarS2 == null) {
                                    jVar3 = jVarD;
                                } else {
                                    jVar3 = jVarD;
                                    if (vVarS2.f24751a != 1 && !vVarS.equals(vVarS2)) {
                                        v vVarS3 = l.s(vVarE, g(), d());
                                        if (vVarS3 == null) {
                                            l.r();
                                            throw null;
                                        }
                                        if (map == null || (vVarJ = (v) map.get(vVarS)) == null) {
                                            vVarJ = tVar.j(vVarS2, vVarS, vVarS3);
                                        }
                                        if (vVarJ == null) {
                                            return new g(this);
                                        }
                                        if (!vVarJ.equals(vVarS3)) {
                                            if (vVarJ.equals(vVarS)) {
                                                ArrayList arrayList5 = arrayList4 == null ? new ArrayList() : arrayList4;
                                                arrayList5.add(new lq.l(tVar, vVarS.b(g())));
                                                arrayListE0 = arrayList3 == null ? new ArrayList() : arrayList3;
                                                arrayListE0.add(tVar);
                                                arrayList2 = arrayList5;
                                            } else {
                                                arrayList2 = arrayList4 == null ? new ArrayList() : arrayList4;
                                                arrayList2.add(!vVarJ.equals(vVarS2) ? new lq.l(tVar, vVarJ) : new lq.l(tVar, vVarS2.b(g())));
                                            }
                                        }
                                        arrayListE0 = arrayList3;
                                    }
                                }
                            }
                            arrayList2 = arrayList4;
                            arrayListE0 = arrayList3;
                        } else {
                            jVar3 = jVarD;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i10 = i13;
                            j7 = j10;
                        }
                        j10 = j7 >> 8;
                        i13 = i10 + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        jVarD = jVar3;
                    }
                    jVar2 = jVarD;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i12 != 8) {
                        break;
                    }
                } else {
                    jVar2 = jVarD;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i11 == length) {
                    arrayList = arrayList2;
                    break;
                }
                i11++;
                jArr3 = jArr;
                objArr3 = objArr;
                jVarD = jVar2;
            }
        } else {
            arrayList = null;
            arrayListE0 = null;
        }
        arrayList2 = arrayList;
        if (arrayList2 != null) {
            v();
            int size = arrayList2.size();
            for (int i14 = 0; i14 < size; i14++) {
                lq.l lVar = (lq.l) arrayList2.get(i14);
                t tVar2 = (t) lVar.f15571a;
                v vVar = (v) lVar.f15572d;
                vVar.f24751a = j;
                synchronized (l.f24717c) {
                    vVar.f24752b = tVar2.e();
                    tVar2.d(vVar);
                }
            }
        }
        if (arrayListE0 != null) {
            int size2 = arrayListE0.size();
            for (int i15 = 0; i15 < size2; i15++) {
                b0Var.k((t) arrayListE0.get(i15));
            }
            ArrayList arrayList6 = this.f24688i;
            if (arrayList6 != null) {
                arrayListE0 = mq.o.E0(arrayList6, arrayListE0);
            }
            this.f24688i = arrayListE0;
        }
        return h.f24702b;
    }
}
