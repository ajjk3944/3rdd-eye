package com.google.android.exoplayer2;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class f0 implements Handler.Callback, ya.s, ob.l, h1 {
    public final qb.t B;
    public final HandlerThread D;
    public final Looper E;
    public final v1 F;
    public final u1 G;
    public final long H;
    public final l I;
    public final ArrayList J;
    public final qb.a K;
    public final t L;
    public final s0 M;
    public final x0 N;
    public final j O;
    public final long P;
    public n1 Q;
    public a1 R;
    public c0 S;
    public boolean T;
    public boolean U = false;
    public boolean V;
    public boolean W;
    public boolean X;
    public int Y;
    public boolean Z;

    /* renamed from: a, reason: collision with root package name */
    public final g[] f4113a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f4114a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f4115b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f4116c0;

    /* renamed from: d, reason: collision with root package name */
    public final l1[] f4117d;

    /* renamed from: d0, reason: collision with root package name */
    public int f4118d0;

    /* renamed from: e0, reason: collision with root package name */
    public e0 f4119e0;

    /* renamed from: f0, reason: collision with root package name */
    public long f4120f0;

    /* renamed from: g, reason: collision with root package name */
    public final ob.m f4121g;

    /* renamed from: g0, reason: collision with root package name */
    public int f4122g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f4123h0;

    /* renamed from: i0, reason: collision with root package name */
    public n f4124i0;

    /* renamed from: r, reason: collision with root package name */
    public final ob.n f4125r;

    /* renamed from: x, reason: collision with root package name */
    public final k f4126x;

    /* renamed from: y, reason: collision with root package name */
    public final pb.g f4127y;

    public f0(g[] gVarArr, ob.m mVar, ob.n nVar, k kVar, pb.g gVar, int i10, boolean z10, AnalyticsCollector analyticsCollector, n1 n1Var, j jVar, long j, Looper looper, et.d dVar, t tVar) {
        this.L = tVar;
        this.f4113a = gVarArr;
        this.f4121g = mVar;
        this.f4125r = nVar;
        this.f4126x = kVar;
        this.f4127y = gVar;
        this.Y = i10;
        this.Z = z10;
        this.Q = n1Var;
        this.O = jVar;
        this.P = j;
        this.K = dVar;
        this.H = kVar.f4210g;
        a1 a1VarH = a1.h(nVar);
        this.R = a1VarH;
        this.S = new c0(0, a1VarH);
        this.f4117d = new l1[gVarArr.length];
        for (int i11 = 0; i11 < gVarArr.length; i11++) {
            g gVar2 = gVarArr[i11];
            gVar2.f4139r = i11;
            this.f4117d[i11] = gVar2;
        }
        this.I = new l(this, dVar);
        this.J = new ArrayList();
        this.F = new v1();
        this.G = new u1();
        mVar.init(this, gVar);
        this.f4123h0 = true;
        Handler handler = new Handler(looper);
        this.M = new s0(handler, analyticsCollector);
        this.N = new x0(this, analyticsCollector, handler);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.D = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.E = looper2;
        this.B = dVar.g(looper2, this);
    }

    public static Pair E(w1 w1Var, e0 e0Var, boolean z10, int i10, boolean z11, v1 v1Var, u1 u1Var) {
        Object objF;
        w1 w1Var2 = e0Var.f4104a;
        if (w1Var.p()) {
            return null;
        }
        w1 w1Var3 = w1Var2.p() ? w1Var : w1Var2;
        try {
            Pair pairI = w1Var3.i(v1Var, u1Var, e0Var.f4105b, e0Var.f4106c);
            if (!w1Var.equals(w1Var3)) {
                if (w1Var.b(pairI.first) == -1) {
                    if (!z10 || (objF = F(v1Var, u1Var, i10, z11, pairI.first, w1Var3, w1Var)) == null) {
                        return null;
                    }
                    return w1Var.i(v1Var, u1Var, w1Var.g(objF, u1Var).f4596c, -9223372036854775807L);
                }
                if (w1Var3.g(pairI.first, u1Var).f4599f && w1Var3.m(u1Var.f4596c, v1Var, 0L).f4752o == w1Var3.b(pairI.first)) {
                    return w1Var.i(v1Var, u1Var, w1Var.g(pairI.first, u1Var).f4596c, e0Var.f4106c);
                }
            }
            return pairI;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static Object F(v1 v1Var, u1 u1Var, int i10, boolean z10, Object obj, w1 w1Var, w1 w1Var2) {
        int iB = w1Var.b(obj);
        int iH = w1Var.h();
        int i11 = 0;
        int iD = iB;
        int iB2 = -1;
        while (i11 < iH && iB2 == -1) {
            v1 v1Var2 = v1Var;
            u1 u1Var2 = u1Var;
            int i12 = i10;
            boolean z11 = z10;
            w1 w1Var3 = w1Var;
            iD = w1Var3.d(iD, u1Var2, v1Var2, i12, z11);
            if (iD == -1) {
                break;
            }
            iB2 = w1Var2.b(w1Var3.l(iD));
            i11++;
            w1Var = w1Var3;
            u1Var = u1Var2;
            v1Var = v1Var2;
            i10 = i12;
            z10 = z11;
        }
        if (iB2 == -1) {
            return null;
        }
        return w1Var2.l(iB2);
    }

    public static void M(g gVar, long j) {
        gVar.F = true;
        if (gVar instanceof eb.l) {
            eb.l lVar = (eb.l) gVar;
            qb.b.j(lVar.F);
            lVar.V = j;
        }
    }

    public static boolean q(g gVar) {
        return gVar.f4140x != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b8 A[PHI: r4 r5 r7
  0x00b8: PHI (r4v4 ya.v) = (r4v3 ya.v), (r4v10 ya.v) binds: [B:34:0x008d, B:36:0x00b2] A[DONT_GENERATE, DONT_INLINE]
  0x00b8: PHI (r5v2 long) = (r5v1 long), (r5v9 long) binds: [B:34:0x008d, B:36:0x00b2] A[DONT_GENERATE, DONT_INLINE]
  0x00b8: PHI (r7v3 long) = (r7v2 long), (r7v6 long) binds: [B:34:0x008d, B:36:0x00b2] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A(boolean r30, boolean r31, boolean r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.f0.A(boolean, boolean, boolean, boolean):void");
    }

    public final void B() {
        q0 q0Var = (q0) this.M.f4441l;
        this.V = q0Var != null && ((r0) q0Var.j).f4428h && this.U;
    }

    public final void C(long j) {
        s0 s0Var = this.M;
        q0 q0Var = (q0) s0Var.f4441l;
        if (q0Var != null) {
            j += q0Var.f4407h;
        }
        this.f4120f0 = j;
        ((d5.y0) this.I.f4225r).c(j);
        for (g gVar : this.f4113a) {
            if (q(gVar)) {
                long j7 = this.f4120f0;
                gVar.F = false;
                gVar.E = j7;
                gVar.m(j7, false);
            }
        }
        for (q0 q0Var2 = (q0) s0Var.f4441l; q0Var2 != null; q0Var2 = (q0) q0Var2.f4411n) {
            for (ob.f fVar : ((ob.n) q0Var2.f4413p).f19272c) {
            }
        }
    }

    public final void D(w1 w1Var, w1 w1Var2) {
        if (w1Var.p() && w1Var2.p()) {
            return;
        }
        ArrayList arrayList = this.J;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            w.g.p(arrayList.get(size));
            throw null;
        }
    }

    public final void G(long j, long j7) {
        qb.t tVar = this.B;
        tVar.f20823a.removeMessages(2);
        tVar.f20823a.sendEmptyMessageAtTime(2, j + j7);
    }

    public final void H(boolean z10) throws n {
        ya.v vVar = ((r0) ((q0) this.M.f4441l).j).f4421a;
        long J = J(vVar, this.R.f4064s, true, false);
        if (J != this.R.f4064s) {
            a1 a1Var = this.R;
            this.R = o(vVar, J, a1Var.f4050c, a1Var.f4051d, z10, 5);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:35|(10:(11:109|37|100|38|(1:46)(1:44)|47|(1:54)|55|56|57|58)(1:63)|98|81|82|107|83|84|85|57|58)|105|64|(1:66)(1:67)|68|(1:70)(1:72)|71|73|74|(1:76)(1:77)|78|103|79|80) */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0165, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0167, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0168, code lost:
    
        r5 = r15;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a0 A[Catch: all -> 0x00a3, TryCatch #2 {all -> 0x00a3, blocks: (B:21:0x0096, B:23:0x00a0, B:30:0x00ac, B:32:0x00b2, B:33:0x00b5, B:35:0x00bd, B:40:0x00cf, B:44:0x00d7), top: B:102:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a9  */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, ya.t] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void I(com.google.android.exoplayer2.e0 r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.f0.I(com.google.android.exoplayer2.e0):void");
    }

    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, ya.t] */
    public final long J(ya.v vVar, long j, boolean z10, boolean z11) throws n {
        b0();
        this.W = false;
        if (z11 || this.R.f4052e == 3) {
            W(2);
        }
        s0 s0Var = this.M;
        q0 q0Var = (q0) s0Var.f4441l;
        q0 q0Var2 = q0Var;
        while (q0Var2 != null && !vVar.equals(((r0) q0Var2.j).f4421a)) {
            q0Var2 = (q0) q0Var2.f4411n;
        }
        if (z10 || q0Var != q0Var2 || (q0Var2 != null && q0Var2.f4407h + j < 0)) {
            g[] gVarArr = this.f4113a;
            for (g gVar : gVarArr) {
                d(gVar);
            }
            if (q0Var2 != null) {
                while (((q0) s0Var.f4441l) != q0Var2) {
                    s0Var.a();
                }
                s0Var.s(q0Var2);
                q0Var2.f4407h = 0L;
                f(new boolean[gVarArr.length]);
            }
        }
        if (q0Var2 != null) {
            ?? r92 = q0Var2.f4401b;
            s0Var.s(q0Var2);
            if (!q0Var2.f4403d) {
                q0Var2.j = ((r0) q0Var2.j).b(j);
            } else if (q0Var2.f4404e) {
                j = r92.f(j);
                r92.g(j - this.H);
            }
            C(j);
            s();
        } else {
            s0Var.c();
            C(j);
        }
        k(false);
        this.B.c(2);
        return j;
    }

    public final void K(j1 j1Var) {
        qb.t tVar = this.B;
        if (j1Var.f4200f != this.E) {
            tVar.a(15, j1Var).b();
            return;
        }
        synchronized (j1Var) {
        }
        try {
            j1Var.f4195a.e(j1Var.f4198d, j1Var.f4199e);
            j1Var.b(true);
            int i10 = this.R.f4052e;
            if (i10 == 3 || i10 == 2) {
                tVar.c(2);
            }
        } catch (Throwable th2) {
            j1Var.b(true);
            throw th2;
        }
    }

    public final void L(j1 j1Var) {
        Looper looper = j1Var.f4200f;
        if (!looper.getThread().isAlive()) {
            io.sentry.android.core.e0.p("TAG", "Trying to send message on a dead thread.");
            j1Var.b(false);
        } else {
            qb.t tVarG = ((et.d) this.K).g(looper, null);
            tVarG.f20823a.post(new androidx.lifecycle.f0(this, 5, j1Var));
        }
    }

    public final void N(boolean z10, AtomicBoolean atomicBoolean) {
        if (this.f4114a0 != z10) {
            this.f4114a0 = z10;
            if (!z10) {
                for (g gVar : this.f4113a) {
                    if (!q(gVar)) {
                        gVar.u();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    public final void O(b0 b0Var) throws Throwable {
        this.S.a(1);
        int i10 = b0Var.f4067c;
        ya.v0 v0Var = b0Var.f4066b;
        ArrayList arrayList = b0Var.f4065a;
        if (i10 != -1) {
            this.f4119e0 = new e0(new k1(arrayList, v0Var), b0Var.f4067c, b0Var.f4068d);
        }
        x0 x0Var = this.N;
        ArrayList arrayList2 = (ArrayList) x0Var.f4778b;
        x0Var.i(0, arrayList2.size());
        l(x0Var.b(arrayList2.size(), arrayList, v0Var), false);
    }

    public final void P(boolean z10) {
        if (z10 == this.f4116c0) {
            return;
        }
        this.f4116c0 = z10;
        a1 a1Var = this.R;
        int i10 = a1Var.f4052e;
        if (z10 || i10 == 4 || i10 == 1) {
            this.R = a1Var.c(z10);
        } else {
            this.B.c(2);
        }
    }

    public final void Q(boolean z10) throws n {
        this.U = z10;
        B();
        if (this.V) {
            s0 s0Var = this.M;
            if (((q0) s0Var.f4442m) != ((q0) s0Var.f4441l)) {
                H(true);
                k(false);
            }
        }
    }

    public final void R(int i10, int i11, boolean z10, boolean z11) {
        this.S.a(z11 ? 1 : 0);
        c0 c0Var = this.S;
        c0Var.f4077b = true;
        c0Var.f4081f = true;
        c0Var.f4082g = i11;
        this.R = this.R.d(i10, z10);
        this.W = false;
        for (q0 q0Var = (q0) this.M.f4441l; q0Var != null; q0Var = (q0) q0Var.f4411n) {
            for (ob.f fVar : ((ob.n) q0Var.f4413p).f19272c) {
            }
        }
        if (!X()) {
            b0();
            f0();
            return;
        }
        int i12 = this.R.f4052e;
        qb.t tVar = this.B;
        if (i12 == 3) {
            Z();
            tVar.c(2);
        } else if (i12 == 2) {
            tVar.c(2);
        }
    }

    public final void S(b1 b1Var) {
        l lVar = this.I;
        lVar.b(b1Var);
        b1 b1VarMo6getPlaybackParameters = lVar.mo6getPlaybackParameters();
        n(b1VarMo6getPlaybackParameters, b1VarMo6getPlaybackParameters.f4070a, true, true);
    }

    public final void T(int i10) throws n {
        this.Y = i10;
        w1 w1Var = this.R.f4048a;
        s0 s0Var = this.M;
        s0Var.f4434c = i10;
        if (!s0Var.z(w1Var)) {
            H(true);
        }
        k(false);
    }

    public final void U(boolean z10) throws n {
        this.Z = z10;
        w1 w1Var = this.R.f4048a;
        s0 s0Var = this.M;
        s0Var.f4435d = z10;
        if (!s0Var.z(w1Var)) {
            H(true);
        }
        k(false);
    }

    public final void V(ya.v0 v0Var) throws Throwable {
        this.S.a(1);
        x0 x0Var = this.N;
        int size = ((ArrayList) x0Var.f4778b).size();
        if (v0Var.f26183b.length != size) {
            v0Var = new ya.v0(new Random(v0Var.f26182a.nextLong())).a(size);
        }
        x0Var.j = v0Var;
        l(x0Var.d(), false);
    }

    public final void W(int i10) {
        a1 a1Var = this.R;
        if (a1Var.f4052e != i10) {
            this.R = a1Var.f(i10);
        }
    }

    public final boolean X() {
        a1 a1Var = this.R;
        return a1Var.f4057l && a1Var.f4058m == 0;
    }

    public final boolean Y(w1 w1Var, ya.v vVar) {
        if (vVar.a() || w1Var.p()) {
            return false;
        }
        int i10 = w1Var.g(vVar.f26177a, this.G).f4596c;
        v1 v1Var = this.F;
        w1Var.n(i10, v1Var);
        return v1Var.a() && v1Var.f4748i && v1Var.f4745f != -9223372036854775807L;
    }

    public final void Z() {
        this.W = false;
        l lVar = this.I;
        lVar.f4224g = true;
        ((d5.y0) lVar.f4225r).d();
        for (g gVar : this.f4113a) {
            if (q(gVar)) {
                qb.b.j(gVar.f4140x == 1);
                gVar.f4140x = 2;
                gVar.o();
            }
        }
    }

    public final void a(b0 b0Var, int i10) throws Throwable {
        this.S.a(1);
        x0 x0Var = this.N;
        if (i10 == -1) {
            i10 = ((ArrayList) x0Var.f4778b).size();
        }
        l(x0Var.b(i10, b0Var.f4065a, b0Var.f4066b), false);
    }

    public final void a0(boolean z10, boolean z11) {
        A(z10 || !this.f4114a0, false, true, false);
        this.S.a(z11 ? 1 : 0);
        this.f4126x.b(true);
        W(1);
    }

    @Override // ya.s
    public final void b(ya.t tVar) {
        this.B.a(8, tVar).b();
    }

    public final void b0() {
        int i10;
        l lVar = this.I;
        lVar.f4224g = false;
        d5.y0 y0Var = (d5.y0) lVar.f4225r;
        if (y0Var.f7108r) {
            y0Var.c(y0Var.a());
            y0Var.f7108r = false;
        }
        for (g gVar : this.f4113a) {
            if (q(gVar) && (i10 = gVar.f4140x) == 2) {
                qb.b.j(i10 == 2);
                gVar.f4140x = 1;
                gVar.p();
            }
        }
    }

    @Override // ya.t0
    public final void c(ya.u0 u0Var) {
        this.B.a(9, (ya.t) u0Var).b();
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, ya.u0] */
    public final void c0() {
        q0 q0Var = (q0) this.M.f4443n;
        boolean z10 = this.X || (q0Var != null && q0Var.f4401b.isLoading());
        a1 a1Var = this.R;
        if (z10 != a1Var.f4054g) {
            this.R = new a1(a1Var.f4048a, a1Var.f4049b, a1Var.f4050c, a1Var.f4051d, a1Var.f4052e, a1Var.f4053f, z10, a1Var.f4055h, a1Var.f4056i, a1Var.j, a1Var.k, a1Var.f4057l, a1Var.f4058m, a1Var.f4059n, a1Var.f4062q, a1Var.f4063r, a1Var.f4064s, a1Var.f4060o, a1Var.f4061p);
        }
    }

    public final void d(g gVar) {
        if (q(gVar)) {
            l lVar = this.I;
            if (gVar == ((g) lVar.f4227y)) {
                lVar.B = null;
                lVar.f4227y = null;
                lVar.f4223d = true;
            }
            int i10 = gVar.f4140x;
            if (i10 == 2) {
                qb.b.j(i10 == 2);
                gVar.f4140x = 1;
                gVar.p();
            }
            qb.b.j(gVar.f4140x == 1);
            gVar.f4137d.c();
            gVar.f4140x = 0;
            gVar.f4141y = null;
            gVar.B = null;
            gVar.F = false;
            gVar.k();
            this.f4118d0--;
        }
    }

    public final void d0(w1 w1Var, ya.v vVar, w1 w1Var2, ya.v vVar2, long j) {
        if (!w1Var.p()) {
            boolean zY = Y(w1Var, vVar);
            Object obj = vVar.f26177a;
            if (zY) {
                u1 u1Var = this.G;
                int i10 = w1Var.g(obj, u1Var).f4596c;
                v1 v1Var = this.F;
                w1Var.n(i10, v1Var);
                l0 l0Var = v1Var.k;
                int i11 = qb.v.f20828a;
                j jVar = this.O;
                jVar.getClass();
                jVar.f4174d = h.c(l0Var.f4228a);
                jVar.f4177g = h.c(l0Var.f4229b);
                jVar.f4178h = h.c(l0Var.f4230c);
                float f10 = l0Var.f4231d;
                if (f10 == -3.4028235E38f) {
                    f10 = 0.97f;
                }
                jVar.k = f10;
                float f11 = l0Var.f4232e;
                if (f11 == -3.4028235E38f) {
                    f11 = 1.03f;
                }
                jVar.j = f11;
                jVar.a();
                if (j != -9223372036854775807L) {
                    jVar.f4175e = g(w1Var, obj, j);
                    jVar.a();
                    return;
                }
                if (qb.v.a(!w1Var2.p() ? w1Var2.m(w1Var2.g(vVar2.f26177a, u1Var).f4596c, v1Var, 0L).f4740a : null, v1Var.f4740a)) {
                    return;
                }
                jVar.f4175e = -9223372036854775807L;
                jVar.a();
                return;
            }
        }
        l lVar = this.I;
        float f12 = lVar.mo6getPlaybackParameters().f4070a;
        b1 b1Var = this.R.f4059n;
        if (f12 != b1Var.f4070a) {
            lVar.b(b1Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0682  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x068b  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x069a  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x031c A[EDGE_INSN: B:444:0x031c->B:186:0x031c BREAK  A[LOOP:4: B:158:0x02b7->B:185:0x0319], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0356 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016d  */
    /* JADX WARN: Type inference failed for: r10v20, types: [java.lang.Object, ya.u0] */
    /* JADX WARN: Type inference failed for: r10v43, types: [java.lang.Object, ya.u0] */
    /* JADX WARN: Type inference failed for: r2v51, types: [java.lang.Object, ya.t] */
    /* JADX WARN: Type inference failed for: r2v83, types: [java.lang.Object, ya.u0] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, ya.t] */
    /* JADX WARN: Type inference failed for: r5v54, types: [java.lang.Object, ya.t] */
    /* JADX WARN: Type inference failed for: r6v27, types: [java.lang.Object, ya.t] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e() throws com.google.android.exoplayer2.n {
        /*
            Method dump skipped, instructions count: 1781
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.f0.e():void");
    }

    public final void e0(ob.n nVar) {
        ob.f[] fVarArr = nVar.f19272c;
        k kVar = this.f4126x;
        int iMax = kVar.f4209f;
        if (iMax == -1) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                g[] gVarArr = this.f4113a;
                int i12 = 13107200;
                if (i10 >= gVarArr.length) {
                    iMax = Math.max(13107200, i11);
                    break;
                }
                if (fVarArr[i10] != null) {
                    int i13 = gVarArr[i10].f4136a;
                    if (i13 == 0) {
                        i12 = 144310272;
                    } else if (i13 != 1) {
                        if (i13 != 2) {
                            i12 = 131072;
                            if (i13 != 3 && i13 != 5 && i13 != 6) {
                                if (i13 != 7) {
                                    throw new IllegalArgumentException();
                                }
                                i12 = 0;
                            }
                        } else {
                            i12 = 131072000;
                        }
                    }
                    i11 += i12;
                }
                i10++;
            }
        }
        kVar.f4211h = iMax;
        kVar.f4204a.b(iMax);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(boolean[] r24) throws com.google.android.exoplayer2.n {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.f0.f(boolean[]):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b4  */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.lang.Object, ya.t] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f0() {
        /*
            Method dump skipped, instructions count: 689
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.f0.f0():void");
    }

    public final long g(w1 w1Var, Object obj, long j) {
        u1 u1Var = this.G;
        int i10 = w1Var.g(obj, u1Var).f4596c;
        v1 v1Var = this.F;
        w1Var.n(i10, v1Var);
        if (v1Var.f4745f != -9223372036854775807L && v1Var.a() && v1Var.f4748i) {
            return h.c(qb.v.s(v1Var.f4746g) - v1Var.f4745f) - (j + u1Var.f4598e);
        }
        return -9223372036854775807L;
    }

    public final synchronized void g0(z zVar, long j) {
        ((et.d) this.K).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j;
        boolean z10 = false;
        while (!((Boolean) zVar.get()).booleanValue() && j > 0) {
            try {
                this.K.getClass();
                wait(j);
            } catch (InterruptedException unused) {
                z10 = true;
            }
            ((et.d) this.K).getClass();
            j = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public final Pair h(w1 w1Var) {
        long j = 0;
        if (w1Var.p()) {
            return Pair.create(a1.f4047t, 0L);
        }
        int iA = w1Var.a(this.Z);
        Pair pairI = w1Var.i(this.F, this.G, iA, -9223372036854775807L);
        ya.v vVarV = this.M.v(w1Var, pairI.first, 0L);
        long jLongValue = ((Long) pairI.second).longValue();
        if (vVarV.a()) {
            Object obj = vVarV.f26177a;
            u1 u1Var = this.G;
            w1Var.g(obj, u1Var);
            if (vVarV.f26179c == u1Var.d(vVarV.f26178b)) {
                u1Var.f4600g.getClass();
            }
        } else {
            j = jLongValue;
        }
        return Pair.create(vVarV, Long.valueOf(j));
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        int i10;
        q0 q0Var;
        try {
            switch (message.what) {
                case 0:
                    w();
                    break;
                case 1:
                    R(message.arg2, 1, message.arg1 != 0, true);
                    break;
                case 2:
                    e();
                    break;
                case 3:
                    I((e0) message.obj);
                    break;
                case 4:
                    S((b1) message.obj);
                    break;
                case g4.j.STRING_FIELD_NUMBER /* 5 */:
                    this.Q = (n1) message.obj;
                    break;
                case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                    a0(false, true);
                    break;
                case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                    x();
                    return true;
                case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                    m((ya.t) message.obj);
                    break;
                case 9:
                    i((ya.t) message.obj);
                    break;
                case 10:
                    z();
                    break;
                case 11:
                    T(message.arg1);
                    break;
                case 12:
                    U(message.arg1 != 0);
                    break;
                case 13:
                    N(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    j1 j1Var = (j1) message.obj;
                    j1Var.getClass();
                    K(j1Var);
                    break;
                case 15:
                    L((j1) message.obj);
                    break;
                case 16:
                    b1 b1Var = (b1) message.obj;
                    n(b1Var, b1Var.f4070a, true, false);
                    break;
                case 17:
                    O((b0) message.obj);
                    break;
                case 18:
                    a((b0) message.obj, message.arg1);
                    break;
                case 19:
                    w.g.p(message.obj);
                    v();
                    throw null;
                case 20:
                    y(message.arg1, message.arg2, (ya.v0) message.obj);
                    break;
                case 21:
                    V((ya.v0) message.obj);
                    break;
                case 22:
                    u();
                    break;
                case 23:
                    Q(message.arg1 != 0);
                    break;
                case 24:
                    P(message.arg1 == 1);
                    break;
                case 25:
                    H(true);
                    break;
                default:
                    return false;
            }
        } catch (ba.b e4) {
            j(e4, e4.f2484a);
        } catch (n e10) {
            e = e10;
            if (e.f4331g == 1 && (q0Var = (q0) this.M.f4442m) != null) {
                e = e.a(((r0) q0Var.j).f4421a);
            }
            if (e.E && this.f4124i0 == null) {
                qb.b.J("ExoPlayerImplInternal", "Recoverable renderer error", e);
                this.f4124i0 = e;
                qb.t tVar = this.B;
                qb.s sVarA = tVar.a(25, e);
                Handler handler = tVar.f20823a;
                Message message2 = sVarA.f20821a;
                message2.getClass();
                handler.sendMessageAtFrontOfQueue(message2);
                sVarA.a();
            } else {
                n nVar = this.f4124i0;
                if (nVar != null) {
                    nVar.addSuppressed(e);
                    e = this.f4124i0;
                }
                qb.b.q("ExoPlayerImplInternal", "Playback error", e);
                a0(true, false);
                this.R = this.R.e(e);
            }
        } catch (y0 e11) {
            boolean z10 = e11.f4791a;
            int i11 = e11.f4792d;
            if (i11 == 1) {
                i10 = z10 ? 3001 : 3003;
            } else {
                if (i11 == 4) {
                    i10 = z10 ? 3002 : 3004;
                }
                j(e11, i);
            }
            i = i10;
            j(e11, i);
        } catch (pb.o e12) {
            j(e12, e12.f20396a);
        } catch (IOException e13) {
            j(e13, 2000);
        } catch (RuntimeException e14) {
            n nVar2 = new n(2, e14, ((e14 instanceof IllegalStateException) || (e14 instanceof IllegalArgumentException)) ? 1004 : 1000);
            qb.b.q("ExoPlayerImplInternal", "Playback error", nVar2);
            a0(true, false);
            this.R = this.R.e(nVar2);
        } catch (ya.b e15) {
            j(e15, 1002);
        }
        t();
        return true;
    }

    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, ya.u0] */
    public final void i(ya.t tVar) {
        q0 q0Var = (q0) this.M.f4443n;
        if (q0Var == null || q0Var.f4401b != tVar) {
            return;
        }
        long j = this.f4120f0;
        if (q0Var != null) {
            qb.b.j(((q0) q0Var.f4411n) == null);
            if (q0Var.f4403d) {
                q0Var.f4401b.o(j - q0Var.f4407h);
            }
        }
        s();
    }

    public final void j(IOException iOException, int i10) {
        n nVar = new n(0, iOException, i10);
        q0 q0Var = (q0) this.M.f4441l;
        if (q0Var != null) {
            nVar = nVar.a(((r0) q0Var.j).f4421a);
        }
        qb.b.q("ExoPlayerImplInternal", "Playback error", nVar);
        a0(false, false);
        this.R = this.R.e(nVar);
    }

    public final void k(boolean z10) {
        q0 q0Var = (q0) this.M.f4443n;
        ya.v vVar = q0Var == null ? this.R.f4049b : ((r0) q0Var.j).f4421a;
        boolean zEquals = this.R.k.equals(vVar);
        if (!zEquals) {
            this.R = this.R.a(vVar);
        }
        a1 a1Var = this.R;
        a1Var.f4062q = q0Var == null ? a1Var.f4064s : q0Var.e();
        a1 a1Var2 = this.R;
        long j = a1Var2.f4062q;
        q0 q0Var2 = (q0) this.M.f4443n;
        a1Var2.f4063r = q0Var2 != null ? Math.max(0L, j - (this.f4120f0 - q0Var2.f4407h)) : 0L;
        if ((!zEquals || z10) && q0Var != null && q0Var.f4403d) {
            e0((ob.n) q0Var.f4413p);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02ef A[Catch: all -> 0x02f5, TRY_ENTER, TryCatch #3 {all -> 0x02f5, blocks: (B:157:0x02ef, B:172:0x031a, B:174:0x0326, B:177:0x032e, B:179:0x033a, B:180:0x0349), top: B:262:0x0272 }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0474  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r19v16, types: [java.lang.Object, ya.v] */
    /* JADX WARN: Type inference failed for: r23v12 */
    /* JADX WARN: Type inference failed for: r23v16 */
    /* JADX WARN: Type inference failed for: r23v21 */
    /* JADX WARN: Type inference failed for: r23v25 */
    /* JADX WARN: Type inference failed for: r23v27 */
    /* JADX WARN: Type inference failed for: r23v9 */
    /* JADX WARN: Type inference failed for: r2v61, types: [com.google.android.exoplayer2.s0] */
    /* JADX WARN: Type inference failed for: r39v0, types: [com.google.android.exoplayer2.f0] */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v64 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v43, types: [com.google.android.exoplayer2.w1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(com.google.android.exoplayer2.w1 r40, boolean r41) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1148
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.f0.l(com.google.android.exoplayer2.w1, boolean):void");
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, ya.t] */
    public final void m(ya.t tVar) throws n {
        s0 s0Var = this.M;
        q0 q0Var = (q0) s0Var.f4443n;
        if (q0Var == null || q0Var.f4401b != tVar) {
            return;
        }
        float f10 = this.I.mo6getPlaybackParameters().f4070a;
        w1 w1Var = this.R.f4048a;
        q0Var.f4403d = true;
        q0Var.f4412o = q0Var.f4401b.l();
        ob.n nVarI = q0Var.i(f10, w1Var);
        r0 r0Var = (r0) q0Var.j;
        long jMax = r0Var.f4422b;
        long j = r0Var.f4425e;
        if (j != -9223372036854775807L && jMax >= j) {
            jMax = Math.max(0L, j - 1);
        }
        long jB = q0Var.b(nVarI, jMax, false, new boolean[((l1[]) q0Var.k).length]);
        long j7 = q0Var.f4407h;
        r0 r0Var2 = (r0) q0Var.j;
        q0Var.f4407h = (r0Var2.f4422b - jB) + j7;
        q0Var.j = r0Var2.b(jB);
        e0((ob.n) q0Var.f4413p);
        if (q0Var == ((q0) s0Var.f4441l)) {
            C(((r0) q0Var.j).f4422b);
            f(new boolean[this.f4113a.length]);
            a1 a1Var = this.R;
            ya.v vVar = a1Var.f4049b;
            long j10 = ((r0) q0Var.j).f4422b;
            this.R = o(vVar, j10, a1Var.f4050c, j10, false, 5);
        }
        s();
    }

    public final void n(b1 b1Var, float f10, boolean z10, boolean z11) {
        b1 b1Var2;
        int i10;
        if (z10) {
            if (z11) {
                this.S.a(1);
            }
            a1 a1Var = this.R;
            a1 a1Var2 = new a1(a1Var.f4048a, a1Var.f4049b, a1Var.f4050c, a1Var.f4051d, a1Var.f4052e, a1Var.f4053f, a1Var.f4054g, a1Var.f4055h, a1Var.f4056i, a1Var.j, a1Var.k, a1Var.f4057l, a1Var.f4058m, b1Var, a1Var.f4062q, a1Var.f4063r, a1Var.f4064s, a1Var.f4060o, a1Var.f4061p);
            b1Var2 = b1Var;
            this.R = a1Var2;
        } else {
            b1Var2 = b1Var;
        }
        float f11 = b1Var2.f4070a;
        Object obj = this.M.f4441l;
        while (true) {
            q0 q0Var = (q0) obj;
            i10 = 0;
            if (q0Var == null) {
                break;
            }
            ob.f[] fVarArr = ((ob.n) q0Var.f4413p).f19272c;
            int length = fVarArr.length;
            while (i10 < length) {
                ob.f fVar = fVarArr[i10];
                if (fVar != null) {
                    fVar.f(f11);
                }
                i10++;
            }
            obj = q0Var.f4411n;
        }
        g[] gVarArr = this.f4113a;
        int length2 = gVarArr.length;
        while (i10 < length2) {
            g gVar = gVarArr[i10];
            if (gVar != null) {
                gVar.v(f10, b1Var2.f4070a);
            }
            i10++;
        }
    }

    public final a1 o(ya.v vVar, long j, long j7, long j10, boolean z10, int i10) {
        oe.u0 u0VarD;
        this.f4123h0 = (!this.f4123h0 && j == this.R.f4064s && vVar.equals(this.R.f4049b)) ? false : true;
        B();
        a1 a1Var = this.R;
        TrackGroupArray trackGroupArray = a1Var.f4055h;
        ob.n nVar = a1Var.f4056i;
        List list = a1Var.j;
        if (this.N.f4777a) {
            q0 q0Var = (q0) this.M.f4441l;
            trackGroupArray = q0Var == null ? TrackGroupArray.f4456r : (TrackGroupArray) q0Var.f4412o;
            nVar = q0Var == null ? this.f4125r : (ob.n) q0Var.f4413p;
            ob.f[] fVarArr = nVar.f19272c;
            oe.e0 e0Var = new oe.e0();
            boolean z11 = false;
            for (ob.f fVar : fVarArr) {
                if (fVar != null) {
                    Metadata metadata = ((ob.c) fVar).f19232e[0].F;
                    if (metadata == null) {
                        e0Var.a(new Metadata(new Metadata.Entry[0]));
                    } else {
                        e0Var.a(metadata);
                        z11 = true;
                    }
                }
            }
            if (z11) {
                u0VarD = e0Var.d();
            } else {
                oe.f0 f0Var = oe.h0.f19336d;
                u0VarD = oe.u0.f19383x;
            }
            list = u0VarD;
            if (q0Var != null) {
                r0 r0Var = (r0) q0Var.j;
                if (r0Var.f4423c != j7) {
                    q0Var.j = r0Var.a(j7);
                }
            }
        } else if (!vVar.equals(a1Var.f4049b)) {
            trackGroupArray = TrackGroupArray.f4456r;
            nVar = this.f4125r;
            oe.f0 f0Var2 = oe.h0.f19336d;
            list = oe.u0.f19383x;
        }
        TrackGroupArray trackGroupArray2 = trackGroupArray;
        ob.n nVar2 = nVar;
        List list2 = list;
        if (z10) {
            c0 c0Var = this.S;
            if (!c0Var.f4079d || c0Var.f4080e == 5) {
                c0Var.f4077b = true;
                c0Var.f4079d = true;
                c0Var.f4080e = i10;
            } else {
                qb.b.g(i10 == 5);
            }
        }
        a1 a1Var2 = this.R;
        long j11 = a1Var2.f4062q;
        q0 q0Var2 = (q0) this.M.f4443n;
        return a1Var2.b(vVar, j, j7, j10, q0Var2 == null ? 0L : Math.max(0L, j11 - (this.f4120f0 - q0Var2.f4407h)), trackGroupArray2, nVar2, list2);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ya.u0] */
    public final boolean p() {
        q0 q0Var = (q0) this.M.f4443n;
        if (q0Var == null) {
            return false;
        }
        return (!q0Var.f4403d ? 0L : q0Var.f4401b.d()) != Long.MIN_VALUE;
    }

    public final boolean r() {
        q0 q0Var = (q0) this.M.f4441l;
        long j = ((r0) q0Var.j).f4425e;
        if (q0Var.f4403d) {
            return j == -9223372036854775807L || this.R.f4064s < j || !X();
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ya.u0] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, ya.u0] */
    public final void s() {
        int i10;
        boolean z10;
        s0 s0Var = this.M;
        if (p()) {
            q0 q0Var = (q0) s0Var.f4443n;
            long jD = !q0Var.f4403d ? 0L : q0Var.f4401b.d();
            q0 q0Var2 = (q0) this.M.f4443n;
            long jMax = q0Var2 != null ? Math.max(0L, jD - (this.f4120f0 - q0Var2.f4407h)) : 0L;
            k kVar = this.f4126x;
            float f10 = this.I.mo6getPlaybackParameters().f4070a;
            long j = kVar.f4206c;
            pb.p pVar = kVar.f4204a;
            synchronized (pVar) {
                i10 = pVar.f20401e * pVar.f20398b;
            }
            boolean z11 = i10 >= kVar.f4211h;
            long jMin = kVar.f4205b;
            if (f10 > 1.0f) {
                jMin = Math.min(qb.v.r(jMin, f10), j);
            }
            if (jMax < Math.max(jMin, 500000L)) {
                kVar.f4212i = !z11;
                if (z11 && jMax < 500000) {
                    io.sentry.android.core.e0.p("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
                }
            } else if (jMax >= j || z11) {
                kVar.f4212i = false;
            }
            z10 = kVar.f4212i;
        } else {
            z10 = false;
        }
        this.X = z10;
        if (z10) {
            q0 q0Var3 = (q0) s0Var.f4443n;
            long j7 = this.f4120f0;
            qb.b.j(((q0) q0Var3.f4411n) == null);
            q0Var3.f4401b.i(j7 - q0Var3.f4407h);
        }
        c0();
    }

    public final void t() {
        c0 c0Var = this.S;
        a1 a1Var = this.R;
        boolean z10 = c0Var.f4077b | (((a1) c0Var.f4083h) != a1Var);
        c0Var.f4077b = z10;
        c0Var.f4083h = a1Var;
        if (z10) {
            y yVar = this.L.f4552d;
            yVar.f4790y.f20823a.post(new a5.o(yVar, 10, c0Var));
            this.S = new c0(0, this.R);
        }
    }

    public final void u() throws Throwable {
        l(this.N.d(), true);
    }

    public final void v() {
        this.S.a(1);
        throw null;
    }

    public final void w() {
        this.S.a(1);
        A(false, false, false, true);
        this.f4126x.b(false);
        W(this.R.f4048a.p() ? 4 : 2);
        pb.u0 u0VarA = this.f4127y.a();
        x0 x0Var = this.N;
        ArrayList arrayList = (ArrayList) x0Var.f4778b;
        qb.b.j(!x0Var.f4777a);
        x0Var.k = u0VarA;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            w0 w0Var = (w0) arrayList.get(i10);
            x0Var.g(w0Var);
            ((HashSet) x0Var.f4785i).add(w0Var);
        }
        x0Var.f4777a = true;
        this.B.c(2);
    }

    public final void x() {
        A(true, false, true, false);
        this.f4126x.b(true);
        W(1);
        this.D.quit();
        synchronized (this) {
            this.T = true;
            notifyAll();
        }
    }

    public final void y(int i10, int i11, ya.v0 v0Var) throws Throwable {
        this.S.a(1);
        x0 x0Var = this.N;
        x0Var.getClass();
        qb.b.g(i10 >= 0 && i10 <= i11 && i11 <= ((ArrayList) x0Var.f4778b).size());
        x0Var.j = v0Var;
        x0Var.i(i10, i11);
        l(x0Var.d(), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [int] */
    /* JADX WARN: Type inference failed for: r8v8 */
    public final void z() throws n {
        int i10;
        boolean z10;
        float f10 = this.I.mo6getPlaybackParameters().f4070a;
        s0 s0Var = this.M;
        q0 q0Var = (q0) s0Var.f4441l;
        q0 q0Var2 = (q0) s0Var.f4442m;
        boolean z11 = true;
        for (q0 q0Var3 = q0Var; q0Var3 != null && q0Var3.f4403d; q0Var3 = (q0) q0Var3.f4411n) {
            ob.n nVarI = q0Var3.i(f10, this.R.f4048a);
            ob.n nVar = (ob.n) q0Var3.f4413p;
            ob.f[] fVarArr = nVarI.f19272c;
            boolean z12 = false;
            if (nVar != null && nVar.f19272c.length == fVarArr.length) {
                for (int i11 = 0; i11 < fVarArr.length; i11++) {
                    if (nVarI.a(nVar, i11)) {
                    }
                }
                if (q0Var3 == q0Var2) {
                    z11 = false;
                }
            }
            if (z11) {
                s0 s0Var2 = this.M;
                q0 q0Var4 = (q0) s0Var2.f4441l;
                boolean zS = s0Var2.s(q0Var4);
                boolean[] zArr = new boolean[this.f4113a.length];
                long jB = q0Var4.b(nVarI, this.R.f4064s, zS, zArr);
                a1 a1Var = this.R;
                if (a1Var.f4052e == 4 || jB == a1Var.f4064s) {
                    z10 = false;
                } else {
                    z10 = false;
                    z12 = true;
                }
                a1 a1Var2 = this.R;
                boolean z13 = z10;
                i10 = 4;
                this.R = o(a1Var2.f4049b, jB, a1Var2.f4050c, a1Var2.f4051d, z12, 5);
                if (z12) {
                    C(jB);
                }
                boolean[] zArr2 = new boolean[this.f4113a.length];
                ?? r82 = z13;
                while (true) {
                    g[] gVarArr = this.f4113a;
                    if (r82 >= gVarArr.length) {
                        break;
                    }
                    g gVar = gVarArr[r82];
                    boolean zQ = q(gVar);
                    zArr2[r82] = zQ;
                    ya.s0 s0Var3 = ((ya.s0[]) q0Var4.f4408i)[r82];
                    if (zQ) {
                        if (s0Var3 != gVar.f4141y) {
                            d(gVar);
                        } else if (zArr[r82]) {
                            long j = this.f4120f0;
                            gVar.F = z13;
                            gVar.E = j;
                            gVar.m(j, z13);
                        }
                    }
                    r82++;
                }
                f(zArr2);
            } else {
                i10 = 4;
                this.M.s(q0Var3);
                if (q0Var3.f4403d) {
                    q0Var3.b(nVarI, Math.max(((r0) q0Var3.j).f4422b, this.f4120f0 - q0Var3.f4407h), false, new boolean[((l1[]) q0Var3.k).length]);
                }
            }
            k(true);
            if (this.R.f4052e != i10) {
                s();
                f0();
                this.B.c(2);
                return;
            }
            return;
        }
    }
}
