package o5;

import android.net.Uri;
import android.os.Handler;
import androidx.media3.common.Metadata;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class p0 implements x, u5.m, r5.i, r5.l, v0 {

    /* renamed from: h0, reason: collision with root package name */
    public static final Map f19010h0;

    /* renamed from: i0, reason: collision with root package name */
    public static final androidx.media3.common.r f19011i0;
    public final s0 B;
    public final r5.b D;
    public final long E;
    public final io.sentry.k G;
    public w L;
    public IcyHeaders M;
    public boolean P;
    public boolean Q;
    public boolean R;
    public js.e S;
    public u5.x T;
    public boolean V;
    public boolean X;
    public boolean Y;
    public int Z;

    /* renamed from: a, reason: collision with root package name */
    public final Uri f19012a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f19013a0;

    /* renamed from: b0, reason: collision with root package name */
    public long f19014b0;

    /* renamed from: d, reason: collision with root package name */
    public final b5.h f19016d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f19017d0;

    /* renamed from: e0, reason: collision with root package name */
    public int f19018e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f19019f0;

    /* renamed from: g, reason: collision with root package name */
    public final i5.j f19020g;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f19021g0;

    /* renamed from: r, reason: collision with root package name */
    public final r5.h f19022r;

    /* renamed from: x, reason: collision with root package name */
    public final e0 f19023x;

    /* renamed from: y, reason: collision with root package name */
    public final i5.f f19024y;
    public final r5.n F = new r5.n("ProgressiveMediaPeriod");
    public final a5.d H = new a5.d(0);
    public final l0 I = new l0(this, 1);
    public final l0 J = new l0(this, 2);
    public final Handler K = a5.d0.k(null);
    public o0[] O = new o0[0];
    public w0[] N = new w0[0];

    /* renamed from: c0, reason: collision with root package name */
    public long f19015c0 = -9223372036854775807L;
    public long U = -9223372036854775807L;
    public int W = 1;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        f19010h0 = Collections.unmodifiableMap(map);
        androidx.media3.common.q qVar = new androidx.media3.common.q();
        qVar.f1734a = "icy";
        qVar.k = "application/x-icy";
        f19011i0 = new androidx.media3.common.r(qVar);
    }

    public p0(Uri uri, b5.h hVar, io.sentry.k kVar, i5.j jVar, i5.f fVar, r5.h hVar2, e0 e0Var, s0 s0Var, r5.b bVar, int i10) {
        this.f19012a = uri;
        this.f19016d = hVar;
        this.f19020g = jVar;
        this.f19024y = fVar;
        this.f19022r = hVar2;
        this.f19023x = e0Var;
        this.B = s0Var;
        this.D = bVar;
        this.E = i10;
        this.G = kVar;
    }

    public final w0 A(o0 o0Var) {
        int length = this.N.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (o0Var.equals(this.O[i10])) {
                return this.N[i10];
            }
        }
        i5.j jVar = this.f19020g;
        jVar.getClass();
        i5.f fVar = this.f19024y;
        fVar.getClass();
        w0 w0Var = new w0(this.D, jVar, fVar);
        w0Var.f19083f = this;
        int i11 = length + 1;
        o0[] o0VarArr = (o0[]) Arrays.copyOf(this.O, i11);
        o0VarArr[length] = o0Var;
        this.O = o0VarArr;
        w0[] w0VarArr = (w0[]) Arrays.copyOf(this.N, i11);
        w0VarArr[length] = w0Var;
        this.N = w0VarArr;
        return w0Var;
    }

    public final void B() {
        m0 m0Var = new m0(this, this.f19012a, this.f19016d, this.G, this, this.H);
        if (this.Q) {
            a5.a.i(w());
            long j = this.U;
            if (j != -9223372036854775807L && this.f19015c0 > j) {
                this.f19019f0 = true;
                this.f19015c0 = -9223372036854775807L;
                return;
            }
            u5.x xVar = this.T;
            xVar.getClass();
            long j7 = xVar.d(this.f19015c0).f23354a.f23358b;
            long j10 = this.f19015c0;
            m0Var.f18999y.f3485a = j7;
            m0Var.E = j10;
            m0Var.D = true;
            m0Var.H = false;
            for (w0 w0Var : this.N) {
                w0Var.f19095t = this.f19015c0;
            }
            this.f19015c0 = -9223372036854775807L;
        }
        this.f19018e0 = h();
        this.f19023x.k(new q(m0Var.F, this.F.f(m0Var, this, ((df.c) this.f19022r).u(this.W))), 1, -1, null, 0, null, m0Var.E, this.U);
    }

    @Override // o5.x
    public final long C(androidx.media3.exoplayer.trackselection.v[] vVarArr, boolean[] zArr, x0[] x0VarArr, boolean[] zArr2, long j) {
        androidx.media3.exoplayer.trackselection.v vVar;
        b();
        js.e eVar = this.S;
        h1 h1Var = (h1) eVar.f13798g;
        boolean[] zArr3 = (boolean[]) eVar.f13800x;
        int i10 = this.Z;
        int i11 = 0;
        for (int i12 = 0; i12 < vVarArr.length; i12++) {
            x0 x0Var = x0VarArr[i12];
            if (x0Var != null && (vVarArr[i12] == null || !zArr[i12])) {
                int i13 = ((n0) x0Var).f19000a;
                a5.a.i(zArr3[i13]);
                this.Z--;
                zArr3[i13] = false;
                x0VarArr[i12] = null;
            }
        }
        boolean z10 = !this.X ? j == 0 : i10 != 0;
        for (int i14 = 0; i14 < vVarArr.length; i14++) {
            if (x0VarArr[i14] == null && (vVar = vVarArr[i14]) != null) {
                a5.a.i(vVar.length() == 1);
                a5.a.i(vVar.getIndexInTrackGroup(0) == 0);
                int iB = h1Var.b(vVar.getTrackGroup());
                a5.a.i(!zArr3[iB]);
                this.Z++;
                zArr3[iB] = true;
                x0VarArr[i14] = new n0(this, iB);
                zArr2[i14] = true;
                if (!z10) {
                    w0 w0Var = this.N[iB];
                    z10 = (w0Var.x(j, true) || w0Var.m() == 0) ? false : true;
                }
            }
        }
        if (this.Z == 0) {
            this.f19017d0 = false;
            this.Y = false;
            r5.n nVar = this.F;
            if (nVar.d()) {
                w0[] w0VarArr = this.N;
                int length = w0VarArr.length;
                while (i11 < length) {
                    w0VarArr[i11].g();
                    i11++;
                }
                nVar.b();
            } else {
                for (w0 w0Var2 : this.N) {
                    w0Var2.w(false);
                }
            }
        } else if (z10) {
            j = f(j);
            while (i11 < x0VarArr.length) {
                if (x0VarArr[i11] != null) {
                    zArr2[i11] = true;
                }
                i11++;
            }
        }
        this.X = true;
        return j;
    }

    public final boolean D() {
        return this.Y || w();
    }

    @Override // o5.v0
    public final void a() {
        this.K.post(this.I);
    }

    public final void b() {
        a5.a.i(this.Q);
        this.S.getClass();
        this.T.getClass();
    }

    @Override // r5.l
    public final void c() {
        for (w0 w0Var : this.N) {
            w0Var.w(true);
            h7.h0 h0Var = w0Var.f19085h;
            if (h0Var != null) {
                h0Var.U(w0Var.f19082e);
                w0Var.f19085h = null;
                w0Var.f19084g = null;
            }
        }
        io.sentry.k kVar = this.G;
        u5.k kVar2 = (u5.k) kVar.f12398g;
        if (kVar2 != null) {
            kVar2.release();
            kVar.f12398g = null;
        }
        kVar.f12399r = null;
    }

    @Override // o5.z0
    public final long d() {
        return m();
    }

    @Override // o5.x
    public final void e() throws IOException {
        int iU = ((df.c) this.f19022r).u(this.W);
        r5.n nVar = this.F;
        IOException iOException = nVar.f21252g;
        if (iOException != null) {
            throw iOException;
        }
        pb.i0 i0Var = nVar.f21251d;
        if (i0Var != null) {
            if (iU == Integer.MIN_VALUE) {
                iU = i0Var.f20379d;
            }
            IOException iOException2 = i0Var.f20381r;
            if (iOException2 != null && i0Var.f20382x > iU) {
                throw iOException2;
            }
        }
        if (this.f19019f0 && !this.Q) {
            throw androidx.media3.common.k0.a(null, "Loading finished before preparation is complete.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
    @Override // o5.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long f(long r6) {
        /*
            r5 = this;
            r5.b()
            js.e r0 = r5.S
            java.lang.Object r0 = r0.f13799r
            boolean[] r0 = (boolean[]) r0
            u5.x r1 = r5.T
            boolean r1 = r1.b()
            if (r1 == 0) goto L12
            goto L14
        L12:
            r6 = 0
        L14:
            r1 = 0
            r5.Y = r1
            r5.f19014b0 = r6
            boolean r2 = r5.w()
            if (r2 == 0) goto L22
            r5.f19015c0 = r6
            return r6
        L22:
            int r2 = r5.W
            r3 = 7
            if (r2 == r3) goto L43
            o5.w0[] r2 = r5.N
            int r2 = r2.length
            r3 = r1
        L2b:
            if (r3 >= r2) goto L73
            o5.w0[] r4 = r5.N
            r4 = r4[r3]
            boolean r4 = r4.x(r6, r1)
            if (r4 != 0) goto L40
            boolean r4 = r0[r3]
            if (r4 != 0) goto L43
            boolean r4 = r5.R
            if (r4 != 0) goto L40
            goto L43
        L40:
            int r3 = r3 + 1
            goto L2b
        L43:
            r5.f19017d0 = r1
            r5.f19015c0 = r6
            r5.f19019f0 = r1
            r5.n r0 = r5.F
            boolean r2 = r0.d()
            if (r2 == 0) goto L62
            o5.w0[] r2 = r5.N
            int r3 = r2.length
        L54:
            if (r1 >= r3) goto L5e
            r4 = r2[r1]
            r4.g()
            int r1 = r1 + 1
            goto L54
        L5e:
            r0.b()
            return r6
        L62:
            r2 = 0
            r0.f21252g = r2
            o5.w0[] r0 = r5.N
            int r2 = r0.length
            r3 = r1
        L69:
            if (r3 >= r2) goto L73
            r4 = r0[r3]
            r4.w(r1)
            int r3 = r3 + 1
            goto L69
        L73:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.p0.f(long):long");
    }

    @Override // o5.x
    public final void g(long j) throws Throwable {
        b();
        if (w()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.S.f13800x;
        int length = this.N.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.N[i10].f(j, zArr[i10]);
        }
    }

    public final int h() {
        int i10 = 0;
        for (w0 w0Var : this.N) {
            i10 += w0Var.f19092q + w0Var.f19091p;
        }
        return i10;
    }

    @Override // o5.z0
    public final boolean i(long j) {
        if (this.f19019f0) {
            return false;
        }
        r5.n nVar = this.F;
        if (nVar.c() || this.f19017d0) {
            return false;
        }
        if (this.Q && this.Z == 0) {
            return false;
        }
        boolean zD = this.H.d();
        if (nVar.d()) {
            return zD;
        }
        B();
        return true;
    }

    @Override // o5.z0
    public final boolean isLoading() {
        boolean z10;
        if (!this.F.d()) {
            return false;
        }
        a5.d dVar = this.H;
        synchronized (dVar) {
            z10 = dVar.f104d;
        }
        return z10;
    }

    @Override // u5.m
    public final void j() {
        this.P = true;
        this.K.post(this.I);
    }

    @Override // o5.x
    public final long k() {
        if (!this.Y) {
            return -9223372036854775807L;
        }
        if (!this.f19019f0 && h() <= this.f19018e0) {
            return -9223372036854775807L;
        }
        this.Y = false;
        return this.f19014b0;
    }

    @Override // o5.x
    public final h1 l() {
        b();
        return (h1) this.S.f13798g;
    }

    @Override // o5.z0
    public final long m() {
        long jV;
        boolean z10;
        long j;
        b();
        if (this.f19019f0 || this.Z == 0) {
            return Long.MIN_VALUE;
        }
        if (w()) {
            return this.f19015c0;
        }
        if (this.R) {
            int length = this.N.length;
            jV = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                js.e eVar = this.S;
                if (((boolean[]) eVar.f13799r)[i10] && ((boolean[]) eVar.f13800x)[i10]) {
                    w0 w0Var = this.N[i10];
                    synchronized (w0Var) {
                        z10 = w0Var.f19098w;
                    }
                    if (z10) {
                        continue;
                    } else {
                        w0 w0Var2 = this.N[i10];
                        synchronized (w0Var2) {
                            j = w0Var2.f19097v;
                        }
                        jV = Math.min(jV, j);
                    }
                }
            }
        } else {
            jV = Long.MAX_VALUE;
        }
        if (jV == Long.MAX_VALUE) {
            jV = v(false);
        }
        return jV == Long.MIN_VALUE ? this.f19014b0 : jV;
    }

    @Override // u5.m
    /* renamed from: n */
    public final u5.a0 mo36n(int i10, int i11) {
        return A(new o0(i10, false));
    }

    @Override // o5.x
    public final long p(long j, d5.x0 x0Var) {
        b();
        if (!this.T.b()) {
            return 0L;
        }
        u5.w wVarD = this.T.d(j);
        return x0Var.a(j, wVarD.f23354a.f23357a, wVarD.f23355b.f23357a);
    }

    @Override // r5.i
    public final r5.j q(r5.k kVar, long j, long j7, IOException iOException, int i10) {
        long jMin;
        r5.j jVar;
        u5.x xVar;
        m0 m0Var = (m0) kVar;
        b5.a0 a0Var = m0Var.f18995d;
        b5.k kVar2 = m0Var.F;
        Uri uri = a0Var.f2421g;
        q qVar = new q(kVar2, j, j7, a0Var.f2420d);
        int i11 = a5.d0.f105a;
        r5.h hVar = this.f19022r;
        ((df.c) hVar).getClass();
        if ((iOException instanceof androidx.media3.common.k0) || (iOException instanceof FileNotFoundException) || (iOException instanceof b5.t) || (iOException instanceof r5.m)) {
            jMin = -9223372036854775807L;
            break;
        }
        int i12 = b5.i.f2434d;
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof b5.i) && ((b5.i) cause).f2435a == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
        }
        jMin = Math.min((i10 - 1) * 1000, 5000);
        if (jMin == -9223372036854775807L) {
            jVar = r5.n.f21249y;
        } else {
            int iH = h();
            int i13 = iH > this.f19018e0 ? 1 : 0;
            if (this.f19013a0 || !((xVar = this.T) == null || xVar.e() == -9223372036854775807L)) {
                this.f19018e0 = iH;
            } else if (!this.Q || D()) {
                this.Y = this.Q;
                this.f19014b0 = 0L;
                this.f19018e0 = 0;
                for (w0 w0Var : this.N) {
                    w0Var.w(false);
                }
                m0Var.f18999y.f3485a = 0L;
                m0Var.E = 0L;
                m0Var.D = true;
                m0Var.H = false;
            } else {
                this.f19017d0 = true;
                jVar = r5.n.f21248x;
            }
            jVar = new r5.j(i13, jMin);
        }
        r5.j jVar2 = jVar;
        boolean zA = jVar2.a();
        this.f19023x.h(qVar, 1, -1, null, 0, null, m0Var.E, this.U, iOException, !zA);
        if (!zA) {
            hVar.getClass();
        }
        return jVar2;
    }

    @Override // r5.i
    public final void r(r5.k kVar, long j, long j7) {
        u5.x xVar;
        m0 m0Var = (m0) kVar;
        if (this.U == -9223372036854775807L && (xVar = this.T) != null) {
            boolean zB = xVar.b();
            long jV = v(true);
            long j10 = jV == Long.MIN_VALUE ? 0L : jV + 10000;
            this.U = j10;
            this.B.b(j10, zB, this.V);
        }
        b5.a0 a0Var = m0Var.f18995d;
        b5.k kVar2 = m0Var.F;
        Uri uri = a0Var.f2421g;
        q qVar = new q(kVar2, j, j7, a0Var.f2420d);
        this.f19022r.getClass();
        this.f19023x.f(qVar, 1, -1, null, 0, null, m0Var.E, this.U);
        this.f19019f0 = true;
        w wVar = this.L;
        wVar.getClass();
        wVar.r(this);
    }

    @Override // r5.i
    public final void s(r5.k kVar, long j, long j7, boolean z10) {
        m0 m0Var = (m0) kVar;
        b5.a0 a0Var = m0Var.f18995d;
        b5.k kVar2 = m0Var.F;
        Uri uri = a0Var.f2421g;
        q qVar = new q(kVar2, j, j7, a0Var.f2420d);
        this.f19022r.getClass();
        this.f19023x.d(qVar, 1, -1, null, 0, null, m0Var.E, this.U);
        if (z10) {
            return;
        }
        for (w0 w0Var : this.N) {
            w0Var.w(false);
        }
        if (this.Z > 0) {
            w wVar = this.L;
            wVar.getClass();
            wVar.r(this);
        }
    }

    @Override // o5.x
    public final void t(w wVar, long j) {
        this.L = wVar;
        this.H.d();
        B();
    }

    @Override // u5.m
    public final void u(u5.x xVar) {
        this.K.post(new io.sentry.cache.e(this, 16, xVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long v(boolean r7) {
        /*
            r6 = this;
            r0 = -9223372036854775808
            r2 = 0
        L3:
            o5.w0[] r3 = r6.N
            int r3 = r3.length
            if (r2 >= r3) goto L29
            if (r7 != 0) goto L17
            js.e r3 = r6.S
            r3.getClass()
            java.lang.Object r3 = r3.f13800x
            boolean[] r3 = (boolean[]) r3
            boolean r3 = r3[r2]
            if (r3 == 0) goto L23
        L17:
            o5.w0[] r3 = r6.N
            r3 = r3[r2]
            monitor-enter(r3)
            long r4 = r3.f19097v     // Catch: java.lang.Throwable -> L26
            monitor-exit(r3)
            long r0 = java.lang.Math.max(r0, r4)
        L23:
            int r2 = r2 + 1
            goto L3
        L26:
            r7 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L26
            throw r7
        L29:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.p0.v(boolean):long");
    }

    public final boolean w() {
        return this.f19015c0 != -9223372036854775807L;
    }

    public final void x() {
        Metadata metadata;
        if (this.f19021g0 || this.Q || !this.P || this.T == null) {
            return;
        }
        for (w0 w0Var : this.N) {
            if (w0Var.p() == null) {
                return;
            }
        }
        this.H.c();
        int length = this.N.length;
        androidx.media3.common.b1[] b1VarArr = new androidx.media3.common.b1[length];
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            androidx.media3.common.r rVarP = this.N[i10].p();
            rVarP.getClass();
            String str = rVarP.H;
            boolean zH = androidx.media3.common.j0.h(str);
            boolean z10 = zH || androidx.media3.common.j0.j(str);
            zArr[i10] = z10;
            this.R = z10 | this.R;
            IcyHeaders icyHeaders = this.M;
            if (icyHeaders != null) {
                int i11 = icyHeaders.f1962a;
                if (zH || this.O[i10].f19004b) {
                    Metadata metadata2 = rVarP.F;
                    if (metadata2 == null) {
                        metadata = new Metadata(icyHeaders);
                    } else {
                        long j = metadata2.f1550d;
                        Metadata.Entry[] entryArr = metadata2.f1549a;
                        int i12 = a5.d0.f105a;
                        Object[] objArrCopyOf = Arrays.copyOf(entryArr, entryArr.length + 1);
                        System.arraycopy(new Metadata.Entry[]{icyHeaders}, 0, objArrCopyOf, entryArr.length, 1);
                        metadata = new Metadata(j, (Metadata.Entry[]) objArrCopyOf);
                    }
                    androidx.media3.common.q qVarA = rVarP.a();
                    qVarA.f1742i = metadata;
                    rVarP = new androidx.media3.common.r(qVarA);
                }
                if (zH && rVarP.f1789y == -1 && rVarP.B == -1 && i11 != -1) {
                    androidx.media3.common.q qVarA2 = rVarP.a();
                    qVarA2.f1739f = i11;
                    rVarP = new androidx.media3.common.r(qVarA2);
                }
            }
            int iC = this.f19020g.c(rVarP);
            androidx.media3.common.q qVarA3 = rVarP.a();
            qVarA3.F = iC;
            b1VarArr[i10] = new androidx.media3.common.b1(Integer.toString(i10), new androidx.media3.common.r(qVarA3));
        }
        this.S = new js.e(new h1(b1VarArr), zArr);
        this.Q = true;
        w wVar = this.L;
        wVar.getClass();
        wVar.j(this);
    }

    public final void y(int i10) {
        b();
        js.e eVar = this.S;
        boolean[] zArr = (boolean[]) eVar.f13797d;
        if (zArr[i10]) {
            return;
        }
        androidx.media3.common.r rVar = ((h1) eVar.f13798g).a(i10).f1575r[0];
        this.f19023x.b(androidx.media3.common.j0.g(rVar.H), rVar, 0, null, this.f19014b0);
        zArr[i10] = true;
    }

    public final void z(int i10) {
        b();
        boolean[] zArr = (boolean[]) this.S.f13799r;
        if (this.f19017d0 && zArr[i10] && !this.N[i10].q(false)) {
            this.f19015c0 = 0L;
            this.f19017d0 = false;
            this.Y = true;
            this.f19014b0 = 0L;
            this.f19018e0 = 0;
            for (w0 w0Var : this.N) {
                w0Var.w(false);
            }
            w wVar = this.L;
            wVar.getClass();
            wVar.r(this);
        }
    }

    @Override // o5.z0
    public final void o(long j) {
    }
}
