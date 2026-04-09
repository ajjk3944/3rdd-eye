package ya;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.n1;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.y0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public final class l0 implements t, ca.m, pb.g0, pb.k0, q0 {

    /* renamed from: h0, reason: collision with root package name */
    public static final Map f26092h0;

    /* renamed from: i0, reason: collision with root package name */
    public static final Format f26093i0;
    public final o0 B;
    public final pb.b D;
    public final long E;
    public final qm.c G;
    public final h0 I;
    public final h0 J;
    public s L;
    public IcyHeaders M;
    public boolean P;
    public boolean Q;
    public boolean R;
    public js.e S;
    public ca.u T;
    public boolean V;
    public boolean X;
    public boolean Y;
    public int Z;

    /* renamed from: a, reason: collision with root package name */
    public final Uri f26094a;

    /* renamed from: b0, reason: collision with root package name */
    public long f26096b0;

    /* renamed from: d, reason: collision with root package name */
    public final pb.n f26098d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f26099d0;

    /* renamed from: e0, reason: collision with root package name */
    public int f26100e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f26101f0;

    /* renamed from: g, reason: collision with root package name */
    public final ba.h f26102g;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f26103g0;

    /* renamed from: r, reason: collision with root package name */
    public final pb.f0 f26104r;

    /* renamed from: x, reason: collision with root package name */
    public final a0 f26105x;

    /* renamed from: y, reason: collision with root package name */
    public final ba.d f26106y;
    public final pb.n0 F = new pb.n0("ProgressiveMediaPeriod");
    public final a5.d H = new a5.d(4);
    public final Handler K = qb.v.l(null);
    public k0[] O = new k0[0];
    public r0[] N = new r0[0];

    /* renamed from: c0, reason: collision with root package name */
    public long f26097c0 = -9223372036854775807L;

    /* renamed from: a0, reason: collision with root package name */
    public long f26095a0 = -1;
    public long U = -9223372036854775807L;
    public int W = 1;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        f26092h0 = Collections.unmodifiableMap(map);
        com.google.android.exoplayer2.g0 g0Var = new com.google.android.exoplayer2.g0();
        g0Var.f4142a = "icy";
        g0Var.k = "application/x-icy";
        f26093i0 = new Format(g0Var);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [ya.h0] */
    /* JADX WARN: Type inference failed for: r1v5, types: [ya.h0] */
    public l0(Uri uri, pb.n nVar, qm.c cVar, ba.h hVar, ba.d dVar, pb.f0 f0Var, a0 a0Var, o0 o0Var, pb.b bVar, int i10) {
        this.f26094a = uri;
        this.f26098d = nVar;
        this.f26102g = hVar;
        this.f26106y = dVar;
        this.f26104r = f0Var;
        this.f26105x = a0Var;
        this.B = o0Var;
        this.D = bVar;
        this.E = i10;
        this.G = cVar;
        final int i11 = 0;
        this.I = new Runnable(this) { // from class: ya.h0

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ l0 f26073d;

            {
                this.f26073d = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.f26073d.w();
                        break;
                    default:
                        l0 l0Var = this.f26073d;
                        if (!l0Var.f26103g0) {
                            s sVar = l0Var.L;
                            sVar.getClass();
                            sVar.c(l0Var);
                            break;
                        }
                        break;
                }
            }
        };
        final int i12 = 1;
        this.J = new Runnable(this) { // from class: ya.h0

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ l0 f26073d;

            {
                this.f26073d = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        this.f26073d.w();
                        break;
                    default:
                        l0 l0Var = this.f26073d;
                        if (!l0Var.f26103g0) {
                            s sVar = l0Var.L;
                            sVar.getClass();
                            sVar.c(l0Var);
                            break;
                        }
                        break;
                }
            }
        };
    }

    public final r0 A(k0 k0Var) {
        int length = this.N.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (k0Var.equals(this.O[i10])) {
                return this.N[i10];
            }
        }
        Looper looper = this.K.getLooper();
        looper.getClass();
        ba.h hVar = this.f26102g;
        hVar.getClass();
        ba.d dVar = this.f26106y;
        dVar.getClass();
        r0 r0Var = new r0(this.D, looper, hVar, dVar);
        r0Var.f26159g = this;
        int i11 = length + 1;
        k0[] k0VarArr = (k0[]) Arrays.copyOf(this.O, i11);
        k0VarArr[length] = k0Var;
        int i12 = qb.v.f20828a;
        this.O = k0VarArr;
        r0[] r0VarArr = (r0[]) Arrays.copyOf(this.N, i11);
        r0VarArr[length] = r0Var;
        this.N = r0VarArr;
        return r0Var;
    }

    public final void B() {
        i0 i0Var = new i0(this, this.f26094a, this.f26098d, this.G, this, this.H);
        if (this.Q) {
            qb.b.j(v());
            long j = this.U;
            if (j != -9223372036854775807L && this.f26097c0 > j) {
                this.f26101f0 = true;
                this.f26097c0 = -9223372036854775807L;
                return;
            }
            ca.u uVar = this.T;
            uVar.getClass();
            long j7 = uVar.d(this.f26097c0).f3508a.f3512b;
            long j10 = this.f26097c0;
            i0Var.f26081y.f3485a = j7;
            i0Var.E = j10;
            i0Var.D = true;
            i0Var.I = false;
            for (r0 r0Var : this.N) {
                r0Var.f26171u = this.f26097c0;
            }
            this.f26097c0 = -9223372036854775807L;
        }
        this.f26100e0 = h();
        this.f26105x.k(new m(i0Var.F, this.F.f(i0Var, this, ((sm.m) this.f26104r).q(this.W))), 1, -1, null, 0, null, i0Var.E, this.U);
    }

    public final boolean C() {
        return this.Y || v();
    }

    @Override // pb.g0
    public final void K(pb.j0 j0Var, long j, long j7) {
        ca.u uVar;
        i0 i0Var = (i0) j0Var;
        if (this.U == -9223372036854775807L && (uVar = this.T) != null) {
            boolean zB = uVar.b();
            long jT = t();
            long j10 = jT == Long.MIN_VALUE ? 0L : jT + 10000;
            this.U = j10;
            this.B.b(j10, zB, this.V);
        }
        pb.t0 t0Var = i0Var.f26077d;
        na.c cVar = i0Var.F;
        Uri uri = t0Var.f20432g;
        m mVar = new m(cVar, j, j7, t0Var.f20431d);
        this.f26104r.getClass();
        this.f26105x.f(mVar, 1, -1, null, 0, null, i0Var.E, this.U);
        if (this.f26095a0 == -1) {
            this.f26095a0 = i0Var.G;
        }
        this.f26101f0 = true;
        s sVar = this.L;
        sVar.getClass();
        sVar.c(this);
    }

    @Override // ya.q0
    public final void a() {
        this.K.post(this.I);
    }

    public final void b() {
        qb.b.j(this.Q);
        this.S.getClass();
        this.T.getClass();
    }

    @Override // pb.k0
    public final void c() {
        for (r0 r0Var : this.N) {
            r0Var.x(true);
            b9.e eVar = r0Var.f26161i;
            if (eVar != null) {
                eVar.D(r0Var.f26157e);
                r0Var.f26161i = null;
                r0Var.f26160h = null;
            }
        }
        qm.c cVar = this.G;
        ca.k kVar = (ca.k) cVar.f20919g;
        if (kVar != null) {
            kVar.release();
            cVar.f20919g = null;
        }
        cVar.f20920r = null;
    }

    @Override // ya.u0
    public final long d() {
        if (this.Z == 0) {
            return Long.MIN_VALUE;
        }
        return m();
    }

    @Override // ya.t
    public final void e() throws IOException {
        int iQ = ((sm.m) this.f26104r).q(this.W);
        pb.n0 n0Var = this.F;
        IOException iOException = n0Var.f20395g;
        if (iOException != null) {
            throw iOException;
        }
        pb.i0 i0Var = n0Var.f20394d;
        if (i0Var != null) {
            if (iQ == Integer.MIN_VALUE) {
                iQ = i0Var.f20379d;
            }
            IOException iOException2 = i0Var.f20381r;
            if (iOException2 != null && i0Var.f20382x > iQ) {
                throw iOException2;
            }
        }
        if (this.f26101f0 && !this.Q) {
            throw y0.a(null, "Loading finished before preparation is complete.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
    @Override // ya.t
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
            ca.u r1 = r5.T
            boolean r1 = r1.b()
            if (r1 == 0) goto L12
            goto L14
        L12:
            r6 = 0
        L14:
            r1 = 0
            r5.Y = r1
            r5.f26096b0 = r6
            boolean r2 = r5.v()
            if (r2 == 0) goto L22
            r5.f26097c0 = r6
            return r6
        L22:
            int r2 = r5.W
            r3 = 7
            if (r2 == r3) goto L43
            ya.r0[] r2 = r5.N
            int r2 = r2.length
            r3 = r1
        L2b:
            if (r3 >= r2) goto L73
            ya.r0[] r4 = r5.N
            r4 = r4[r3]
            boolean r4 = r4.y(r6, r1)
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
            r5.f26099d0 = r1
            r5.f26097c0 = r6
            r5.f26101f0 = r1
            pb.n0 r0 = r5.F
            boolean r2 = r0.d()
            if (r2 == 0) goto L62
            ya.r0[] r2 = r5.N
            int r3 = r2.length
        L54:
            if (r1 >= r3) goto L5e
            r4 = r2[r1]
            r4.h()
            int r1 = r1 + 1
            goto L54
        L5e:
            r0.b()
            return r6
        L62:
            r2 = 0
            r0.f20395g = r2
            ya.r0[] r0 = r5.N
            int r2 = r0.length
            r3 = r1
        L69:
            if (r3 >= r2) goto L73
            r4 = r0[r3]
            r4.x(r1)
            int r3 = r3 + 1
            goto L69
        L73:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ya.l0.f(long):long");
    }

    @Override // ya.t
    public final void g(long j) throws Throwable {
        b();
        if (v()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.S.f13800x;
        int length = this.N.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.N[i10].g(j, zArr[i10]);
        }
    }

    public final int h() {
        int i10 = 0;
        for (r0 r0Var : this.N) {
            i10 += r0Var.f26168r + r0Var.f26167q;
        }
        return i10;
    }

    @Override // ya.u0
    public final boolean i(long j) {
        if (this.f26101f0) {
            return false;
        }
        pb.n0 n0Var = this.F;
        if (n0Var.c() || this.f26099d0) {
            return false;
        }
        if (this.Q && this.Z == 0) {
            return false;
        }
        boolean zD = this.H.d();
        if (n0Var.d()) {
            return zD;
        }
        B();
        return true;
    }

    @Override // ya.u0
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

    @Override // ca.m
    public final void j() {
        this.P = true;
        this.K.post(this.I);
    }

    @Override // ya.t
    public final long k() {
        if (!this.Y) {
            return -9223372036854775807L;
        }
        if (!this.f26101f0 && h() <= this.f26100e0) {
            return -9223372036854775807L;
        }
        this.Y = false;
        return this.f26096b0;
    }

    @Override // ya.t
    public final TrackGroupArray l() {
        b();
        return (TrackGroupArray) this.S.f13798g;
    }

    @Override // ya.u0
    public final long m() {
        long jT;
        boolean z10;
        long j;
        b();
        boolean[] zArr = (boolean[]) this.S.f13799r;
        if (this.f26101f0) {
            return Long.MIN_VALUE;
        }
        if (v()) {
            return this.f26097c0;
        }
        if (this.R) {
            int length = this.N.length;
            jT = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                if (zArr[i10]) {
                    r0 r0Var = this.N[i10];
                    synchronized (r0Var) {
                        z10 = r0Var.f26174x;
                    }
                    if (z10) {
                        continue;
                    } else {
                        r0 r0Var2 = this.N[i10];
                        synchronized (r0Var2) {
                            j = r0Var2.f26173w;
                        }
                        jT = Math.min(jT, j);
                    }
                }
            }
        } else {
            jT = Long.MAX_VALUE;
        }
        if (jT == Long.MAX_VALUE) {
            jT = t();
        }
        return jT == Long.MIN_VALUE ? this.f26096b0 : jT;
    }

    @Override // ca.m
    public final ca.x n(int i10, int i11) {
        return A(new k0(i10, false));
    }

    @Override // ya.t
    public final long p(long j, n1 n1Var) {
        b();
        if (!this.T.b()) {
            return 0L;
        }
        ca.t tVarD = this.T.d(j);
        return n1Var.a(j, tVarD.f3508a.f3511a, tVarD.f3509b.f3511a);
    }

    @Override // pb.g0
    public final pb.h0 q(pb.j0 j0Var, long j, long j7, IOException iOException, int i10) {
        pb.h0 h0Var;
        ca.u uVar;
        i0 i0Var = (i0) j0Var;
        if (this.f26095a0 == -1) {
            this.f26095a0 = i0Var.G;
        }
        pb.t0 t0Var = i0Var.f26077d;
        na.c cVar = i0Var.F;
        Uri uri = t0Var.f20432g;
        m mVar = new m(cVar, j, j7, t0Var.f20431d);
        UUID uuid = com.google.android.exoplayer2.h.f4166a;
        pb.f0 f0Var = this.f26104r;
        ((sm.m) f0Var).getClass();
        long jMin = ((iOException instanceof y0) || (iOException instanceof FileNotFoundException) || (iOException instanceof pb.y) || (iOException instanceof pb.m0)) ? -9223372036854775807L : Math.min((i10 - 1) * 1000, 5000);
        if (jMin == -9223372036854775807L) {
            h0Var = pb.n0.f20392y;
        } else {
            int iH = h();
            int i11 = iH > this.f26100e0 ? 1 : 0;
            if (this.f26095a0 != -1 || ((uVar = this.T) != null && uVar.e() != -9223372036854775807L)) {
                this.f26100e0 = iH;
            } else if (!this.Q || C()) {
                this.Y = this.Q;
                this.f26096b0 = 0L;
                this.f26100e0 = 0;
                for (r0 r0Var : this.N) {
                    r0Var.x(false);
                }
                i0Var.f26081y.f3485a = 0L;
                i0Var.E = 0L;
                i0Var.D = true;
                i0Var.I = false;
            } else {
                this.f26099d0 = true;
                h0Var = pb.n0.f20391x;
            }
            h0Var = new pb.h0(i11, jMin);
        }
        pb.h0 h0Var2 = h0Var;
        boolean zA = h0Var2.a();
        this.f26105x.h(mVar, 1, -1, null, 0, null, i0Var.E, this.U, iOException, !zA);
        if (!zA) {
            f0Var.getClass();
        }
        return h0Var2;
    }

    @Override // ca.m
    public final void r(ca.u uVar) {
        this.K.post(new s9.c(this, 6, uVar));
    }

    @Override // ya.t
    public final long s(ob.f[] fVarArr, boolean[] zArr, s0[] s0VarArr, boolean[] zArr2, long j) {
        ob.f fVar;
        b();
        js.e eVar = this.S;
        TrackGroupArray trackGroupArray = (TrackGroupArray) eVar.f13798g;
        boolean[] zArr3 = (boolean[]) eVar.f13800x;
        int i10 = this.Z;
        int i11 = 0;
        for (int i12 = 0; i12 < fVarArr.length; i12++) {
            s0 s0Var = s0VarArr[i12];
            if (s0Var != null && (fVarArr[i12] == null || !zArr[i12])) {
                int i13 = ((j0) s0Var).f26082a;
                qb.b.j(zArr3[i13]);
                this.Z--;
                zArr3[i13] = false;
                s0VarArr[i12] = null;
            }
        }
        boolean z10 = !this.X ? j == 0 : i10 != 0;
        for (int i14 = 0; i14 < fVarArr.length; i14++) {
            if (s0VarArr[i14] == null && (fVar = fVarArr[i14]) != null) {
                ob.c cVar = (ob.c) fVar;
                int[] iArr = cVar.f19230c;
                qb.b.j(iArr.length == 1);
                qb.b.j(iArr[0] == 0);
                int iD = trackGroupArray.d(cVar.f19228a);
                qb.b.j(!zArr3[iD]);
                this.Z++;
                zArr3[iD] = true;
                s0VarArr[i14] = new j0(this, iD);
                zArr2[i14] = true;
                if (!z10) {
                    r0 r0Var = this.N[iD];
                    z10 = (r0Var.y(j, true) || r0Var.n() == 0) ? false : true;
                }
            }
        }
        if (this.Z == 0) {
            this.f26099d0 = false;
            this.Y = false;
            pb.n0 n0Var = this.F;
            if (n0Var.d()) {
                r0[] r0VarArr = this.N;
                int length = r0VarArr.length;
                while (i11 < length) {
                    r0VarArr[i11].h();
                    i11++;
                }
                n0Var.b();
            } else {
                for (r0 r0Var2 : this.N) {
                    r0Var2.x(false);
                }
            }
        } else if (z10) {
            j = f(j);
            while (i11 < s0VarArr.length) {
                if (s0VarArr[i11] != null) {
                    zArr2[i11] = true;
                }
                i11++;
            }
        }
        this.X = true;
        return j;
    }

    public final long t() {
        long j;
        long jMax = Long.MIN_VALUE;
        for (r0 r0Var : this.N) {
            synchronized (r0Var) {
                j = r0Var.f26173w;
            }
            jMax = Math.max(jMax, j);
        }
        return jMax;
    }

    @Override // ya.t
    public final void u(s sVar, long j) {
        this.L = sVar;
        this.H.d();
        B();
    }

    public final boolean v() {
        return this.f26097c0 != -9223372036854775807L;
    }

    public final void w() {
        Metadata metadata;
        if (this.f26103g0 || this.Q || !this.P || this.T == null) {
            return;
        }
        for (r0 r0Var : this.N) {
            if (r0Var.q() == null) {
                return;
            }
        }
        a5.d dVar = this.H;
        synchronized (dVar) {
            dVar.f104d = false;
        }
        int length = this.N.length;
        TrackGroup[] trackGroupArr = new TrackGroup[length];
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            Format formatQ = this.N[i10].q();
            formatQ.getClass();
            String str = formatQ.H;
            boolean zH = qb.m.h(str);
            boolean z10 = zH || qb.m.j(str);
            zArr[i10] = z10;
            this.R = z10 | this.R;
            IcyHeaders icyHeaders = this.M;
            if (icyHeaders != null) {
                int i11 = icyHeaders.f4258a;
                if (zH || this.O[i10].f26086b) {
                    Metadata metadata2 = formatQ.F;
                    if (metadata2 == null) {
                        metadata = new Metadata(icyHeaders);
                    } else {
                        Metadata.Entry[] entryArr = metadata2.f4241a;
                        int i12 = qb.v.f20828a;
                        Object[] objArrCopyOf = Arrays.copyOf(entryArr, entryArr.length + 1);
                        System.arraycopy(new Metadata.Entry[]{icyHeaders}, 0, objArrCopyOf, entryArr.length, 1);
                        metadata = new Metadata((Metadata.Entry[]) objArrCopyOf);
                    }
                    com.google.android.exoplayer2.g0 g0VarD = formatQ.d();
                    g0VarD.f4150i = metadata;
                    formatQ = new Format(g0VarD);
                }
                if (zH && formatQ.f4027y == -1 && formatQ.B == -1 && i11 != -1) {
                    com.google.android.exoplayer2.g0 g0VarD2 = formatQ.d();
                    g0VarD2.f4147f = i11;
                    formatQ = new Format(g0VarD2);
                }
            }
            Class clsB = this.f26102g.b(formatQ);
            com.google.android.exoplayer2.g0 g0VarD3 = formatQ.d();
            g0VarD3.D = clsB;
            trackGroupArr[i10] = new TrackGroup(new Format(g0VarD3));
        }
        this.S = new js.e(new TrackGroupArray(trackGroupArr), zArr);
        this.Q = true;
        s sVar = this.L;
        sVar.getClass();
        sVar.b(this);
    }

    @Override // pb.g0
    public final void x(pb.j0 j0Var, long j, long j7, boolean z10) {
        i0 i0Var = (i0) j0Var;
        pb.t0 t0Var = i0Var.f26077d;
        na.c cVar = i0Var.F;
        Uri uri = t0Var.f20432g;
        m mVar = new m(cVar, j, j7, t0Var.f20431d);
        this.f26104r.getClass();
        this.f26105x.d(mVar, 1, -1, null, 0, null, i0Var.E, this.U);
        if (z10) {
            return;
        }
        if (this.f26095a0 == -1) {
            this.f26095a0 = i0Var.G;
        }
        for (r0 r0Var : this.N) {
            r0Var.x(false);
        }
        if (this.Z > 0) {
            s sVar = this.L;
            sVar.getClass();
            sVar.c(this);
        }
    }

    public final void y(int i10) {
        b();
        js.e eVar = this.S;
        boolean[] zArr = (boolean[]) eVar.f13797d;
        if (zArr[i10]) {
            return;
        }
        Format format = ((TrackGroupArray) eVar.f13798g).f4458d[i10].f4454d[0];
        this.f26105x.b(qb.m.g(format.H), format, 0, null, this.f26096b0);
        zArr[i10] = true;
    }

    public final void z(int i10) {
        b();
        boolean[] zArr = (boolean[]) this.S.f13799r;
        if (this.f26099d0 && zArr[i10] && !this.N[i10].r(false)) {
            this.f26097c0 = 0L;
            this.f26099d0 = false;
            this.Y = true;
            this.f26096b0 = 0L;
            this.f26100e0 = 0;
            for (r0 r0Var : this.N) {
                r0Var.x(false);
            }
            s sVar = this.L;
            sVar.getClass();
            sVar.c(this);
        }
    }

    @Override // ya.u0
    public final void o(long j) {
    }
}
