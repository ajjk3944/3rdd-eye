package d5;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.Metadata;
import androidx.media3.common.a1;
import androidx.media3.exoplayer.analytics.AnalyticsCollector;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import o5.b1;
import o5.h1;

/* loaded from: classes.dex */
public final class e0 implements Handler.Callback, o5.w, androidx.media3.exoplayer.trackselection.a0, q0 {
    public final r5.d B;
    public final a5.z D;
    public final HandlerThread E;
    public final Looper F;
    public final androidx.media3.common.z0 G;
    public final androidx.media3.common.y0 H;
    public final long I;
    public final com.google.android.exoplayer2.l J;
    public final ArrayList K;
    public final a5.b L;
    public final s M;
    public final com.google.android.exoplayer2.s0 N;
    public final o0 O;
    public final com.google.android.exoplayer2.j P;
    public final long Q;
    public x0 R;
    public p0 S;
    public com.google.android.exoplayer2.c0 T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public int Z;

    /* renamed from: a, reason: collision with root package name */
    public final u0[] f6966a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f6967a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f6968b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f6969c0;

    /* renamed from: d, reason: collision with root package name */
    public final Set f6970d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f6971d0;

    /* renamed from: e0, reason: collision with root package name */
    public int f6972e0;

    /* renamed from: f0, reason: collision with root package name */
    public d0 f6973f0;

    /* renamed from: g, reason: collision with root package name */
    public final v0[] f6974g;

    /* renamed from: g0, reason: collision with root package name */
    public long f6975g0;

    /* renamed from: h0, reason: collision with root package name */
    public int f6976h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f6977i0;

    /* renamed from: j0, reason: collision with root package name */
    public f f6978j0;

    /* renamed from: k0, reason: collision with root package name */
    public final long f6979k0;

    /* renamed from: l0, reason: collision with root package name */
    public long f6980l0 = -9223372036854775807L;

    /* renamed from: r, reason: collision with root package name */
    public final androidx.media3.exoplayer.trackselection.b0 f6981r;

    /* renamed from: x, reason: collision with root package name */
    public final androidx.media3.exoplayer.trackselection.c0 f6982x;

    /* renamed from: y, reason: collision with root package name */
    public final e f6983y;

    public e0(u0[] u0VarArr, androidx.media3.exoplayer.trackselection.b0 b0Var, androidx.media3.exoplayer.trackselection.c0 c0Var, e eVar, r5.d dVar, int i10, boolean z10, AnalyticsCollector analyticsCollector, x0 x0Var, com.google.android.exoplayer2.j jVar, long j, boolean z11, Looper looper, a5.x xVar, s sVar, e5.o0 o0Var) {
        this.M = sVar;
        this.f6966a = u0VarArr;
        this.f6981r = b0Var;
        this.f6982x = c0Var;
        this.f6983y = eVar;
        this.B = dVar;
        this.Z = i10;
        this.f6967a0 = z10;
        this.R = x0Var;
        this.P = jVar;
        this.Q = j;
        this.f6979k0 = j;
        this.V = z11;
        this.L = xVar;
        this.I = eVar.f6963g;
        p0 p0VarH = p0.h(c0Var);
        this.S = p0VarH;
        this.T = new com.google.android.exoplayer2.c0(1, p0VarH);
        this.f6974g = new v0[u0VarArr.length];
        for (int i11 = 0; i11 < u0VarArr.length; i11++) {
            b bVar = (b) u0VarArr[i11];
            bVar.f6928r = i11;
            bVar.f6929x = o0Var;
            v0[] v0VarArr = this.f6974g;
            bVar.getClass();
            v0VarArr[i11] = bVar;
        }
        this.J = new com.google.android.exoplayer2.l(this, xVar);
        this.K = new ArrayList();
        this.f6970d = Collections.newSetFromMap(new IdentityHashMap());
        this.G = new androidx.media3.common.z0();
        this.H = new androidx.media3.common.y0();
        b0Var.init(this, dVar);
        this.f6977i0 = true;
        a5.z zVarA = xVar.a(looper, null);
        this.N = new com.google.android.exoplayer2.s0(analyticsCollector, zVarA);
        this.O = new o0(this, analyticsCollector, zVarA, o0Var);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.E = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.F = looper2;
        this.D = xVar.a(looper2, this);
    }

    public static Pair F(a1 a1Var, d0 d0Var, boolean z10, int i10, boolean z11, androidx.media3.common.z0 z0Var, androidx.media3.common.y0 y0Var) {
        Object objG;
        a1 a1Var2 = d0Var.f6954a;
        if (a1Var.p()) {
            return null;
        }
        a1 a1Var3 = a1Var2.p() ? a1Var : a1Var2;
        try {
            Pair pairI = a1Var3.i(z0Var, y0Var, d0Var.f6955b, d0Var.f6956c);
            if (!a1Var.equals(a1Var3)) {
                if (a1Var.b(pairI.first) == -1) {
                    if (!z10 || (objG = G(z0Var, y0Var, i10, z11, pairI.first, a1Var3, a1Var)) == null) {
                        return null;
                    }
                    return a1Var.i(z0Var, y0Var, a1Var.g(objG, y0Var).f1829g, -9223372036854775807L);
                }
                if (a1Var3.g(pairI.first, y0Var).f1832y && a1Var3.m(y0Var.f1829g, z0Var, 0L).K == a1Var3.b(pairI.first)) {
                    return a1Var.i(z0Var, y0Var, a1Var.g(pairI.first, y0Var).f1829g, d0Var.f6956c);
                }
            }
            return pairI;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static Object G(androidx.media3.common.z0 z0Var, androidx.media3.common.y0 y0Var, int i10, boolean z10, Object obj, a1 a1Var, a1 a1Var2) {
        int iB = a1Var.b(obj);
        int iH = a1Var.h();
        int i11 = 0;
        int iD = iB;
        int iB2 = -1;
        while (i11 < iH && iB2 == -1) {
            androidx.media3.common.z0 z0Var2 = z0Var;
            androidx.media3.common.y0 y0Var2 = y0Var;
            int i12 = i10;
            boolean z11 = z10;
            a1 a1Var3 = a1Var;
            iD = a1Var3.d(iD, y0Var2, z0Var2, i12, z11);
            if (iD == -1) {
                break;
            }
            iB2 = a1Var2.b(a1Var3.l(iD));
            i11++;
            a1Var = a1Var3;
            y0Var = y0Var2;
            z0Var = z0Var2;
            i10 = i12;
            z10 = z11;
        }
        if (iB2 == -1) {
            return null;
        }
        return a1Var2.l(iB2);
    }

    public static void M(u0 u0Var, long j) {
        ((b) u0Var).G = true;
        if (u0Var instanceof q5.b) {
            q5.b bVar = (q5.b) u0Var;
            a5.a.i(bVar.G);
            bVar.W = j;
        }
    }

    public static boolean q(u0 u0Var) {
        return ((b) u0Var).f6930y != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [int] */
    /* JADX WARN: Type inference failed for: r8v8 */
    public final void A() throws f {
        int i10;
        boolean z10;
        float f10 = this.J.getPlaybackParameters().f1725a;
        com.google.android.exoplayer2.s0 s0Var = this.N;
        com.google.android.exoplayer2.q0 q0Var = (com.google.android.exoplayer2.q0) s0Var.f4441l;
        com.google.android.exoplayer2.q0 q0Var2 = (com.google.android.exoplayer2.q0) s0Var.f4442m;
        boolean z11 = true;
        for (com.google.android.exoplayer2.q0 q0Var3 = q0Var; q0Var3 != null && q0Var3.f4403d; q0Var3 = (com.google.android.exoplayer2.q0) q0Var3.f4411n) {
            androidx.media3.exoplayer.trackselection.c0 c0VarH = q0Var3.h(f10, this.S.f7057a);
            androidx.media3.exoplayer.trackselection.c0 c0Var = (androidx.media3.exoplayer.trackselection.c0) q0Var3.f4413p;
            androidx.media3.exoplayer.trackselection.v[] vVarArr = c0VarH.f1879c;
            boolean z12 = false;
            if (c0Var != null && c0Var.f1879c.length == vVarArr.length) {
                for (int i11 = 0; i11 < vVarArr.length; i11++) {
                    if (c0VarH.a(c0Var, i11)) {
                    }
                }
                if (q0Var3 == q0Var2) {
                    z11 = false;
                }
            }
            if (z11) {
                com.google.android.exoplayer2.s0 s0Var2 = this.N;
                com.google.android.exoplayer2.q0 q0Var4 = (com.google.android.exoplayer2.q0) s0Var2.f4441l;
                boolean zT = s0Var2.t(q0Var4);
                boolean[] zArr = new boolean[this.f6966a.length];
                long jA = q0Var4.a(c0VarH, this.S.f7072r, zT, zArr);
                p0 p0Var = this.S;
                if (p0Var.f7061e == 4 || jA == p0Var.f7072r) {
                    z10 = false;
                } else {
                    z10 = false;
                    z12 = true;
                }
                p0 p0Var2 = this.S;
                boolean z13 = z10;
                i10 = 4;
                this.S = o(p0Var2.f7058b, jA, p0Var2.f7059c, p0Var2.f7060d, z12, 5);
                if (z12) {
                    D(jA);
                }
                boolean[] zArr2 = new boolean[this.f6966a.length];
                ?? r82 = z13;
                while (true) {
                    u0[] u0VarArr = this.f6966a;
                    if (r82 >= u0VarArr.length) {
                        break;
                    }
                    u0 u0Var = u0VarArr[r82];
                    boolean zQ = q(u0Var);
                    zArr2[r82] = zQ;
                    o5.x0 x0Var = ((o5.x0[]) q0Var4.f4408i)[r82];
                    if (zQ) {
                        b bVar = (b) u0Var;
                        if (x0Var != bVar.B) {
                            b(u0Var);
                        } else if (zArr[r82]) {
                            long j = this.f6975g0;
                            bVar.G = z13;
                            bVar.F = j;
                            bVar.o(j, z13);
                        }
                    }
                    r82++;
                }
                d(zArr2);
            } else {
                i10 = 4;
                this.N.t(q0Var3);
                if (q0Var3.f4403d) {
                    q0Var3.a(c0VarH, Math.max(((g0) q0Var3.j).f6989b, this.f6975g0 - q0Var3.f4407h), false, new boolean[((v0[]) q0Var3.k).length]);
                }
            }
            k(true);
            if (this.S.f7061e != i10) {
                t();
                e0();
                this.D.e(2);
                return;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c5 A[PHI: r4 r5 r7
  0x00c5: PHI (r4v4 o5.z) = (r4v3 o5.z), (r4v11 o5.z) binds: [B:35:0x009a, B:37:0x00bf] A[DONT_GENERATE, DONT_INLINE]
  0x00c5: PHI (r5v2 long) = (r5v1 long), (r5v8 long) binds: [B:35:0x009a, B:37:0x00bf] A[DONT_GENERATE, DONT_INLINE]
  0x00c5: PHI (r7v3 long) = (r7v2 long), (r7v8 long) binds: [B:35:0x009a, B:37:0x00bf] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B(boolean r29, boolean r30, boolean r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.e0.B(boolean, boolean, boolean, boolean):void");
    }

    public final void C() {
        com.google.android.exoplayer2.q0 q0Var = (com.google.android.exoplayer2.q0) this.N.f4441l;
        this.W = q0Var != null && ((g0) q0Var.j).f6995h && this.V;
    }

    public final void D(long j) {
        com.google.android.exoplayer2.s0 s0Var = this.N;
        com.google.android.exoplayer2.q0 q0Var = (com.google.android.exoplayer2.q0) s0Var.f4441l;
        long j7 = j + (q0Var == null ? 1000000000000L : q0Var.f4407h);
        this.f6975g0 = j7;
        ((y0) this.J.f4225r).c(j7);
        for (u0 u0Var : this.f6966a) {
            if (q(u0Var)) {
                long j10 = this.f6975g0;
                b bVar = (b) u0Var;
                bVar.G = false;
                bVar.F = j10;
                bVar.o(j10, false);
            }
        }
        for (com.google.android.exoplayer2.q0 q0Var2 = (com.google.android.exoplayer2.q0) s0Var.f4441l; q0Var2 != null; q0Var2 = (com.google.android.exoplayer2.q0) q0Var2.f4411n) {
            for (androidx.media3.exoplayer.trackselection.v vVar : ((androidx.media3.exoplayer.trackselection.c0) q0Var2.f4413p).f1879c) {
                if (vVar != null) {
                    vVar.o();
                }
            }
        }
    }

    public final void E(a1 a1Var, a1 a1Var2) {
        if (a1Var.p() && a1Var2.p()) {
            return;
        }
        ArrayList arrayList = this.K;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            w.g.p(arrayList.get(size));
            throw null;
        }
    }

    public final void H(boolean z10) throws f {
        o5.z zVar = ((g0) ((com.google.android.exoplayer2.q0) this.N.f4441l).j).f6988a;
        long J = J(zVar, this.S.f7072r, true, false);
        if (J != this.S.f7072r) {
            p0 p0Var = this.S;
            this.S = o(zVar, J, p0Var.f7059c, p0Var.f7060d, z10, 5);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:36|(10:(11:110|38|101|39|(1:47)(1:45)|48|(1:55)|56|57|58|59)(1:64)|99|82|83|108|84|85|86|58|59)|106|65|(1:67)(1:68)|69|(1:71)(1:73)|72|74|75|(1:77)(1:78)|79|104|80|81) */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0165, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0167, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0168, code lost:
    
        r5 = r15;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a1 A[Catch: all -> 0x00a4, TryCatch #2 {all -> 0x00a4, blocks: (B:22:0x0097, B:24:0x00a1, B:31:0x00ad, B:33:0x00b3, B:34:0x00b6, B:36:0x00be, B:41:0x00d0, B:45:0x00d8), top: B:103:0x0097 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, o5.x] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void I(d5.d0 r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.e0.I(d5.d0):void");
    }

    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, o5.x] */
    public final long J(o5.z zVar, long j, boolean z10, boolean z11) throws f {
        b0();
        this.X = false;
        if (z11 || this.S.f7061e == 3) {
            W(2);
        }
        com.google.android.exoplayer2.s0 s0Var = this.N;
        com.google.android.exoplayer2.q0 q0Var = (com.google.android.exoplayer2.q0) s0Var.f4441l;
        com.google.android.exoplayer2.q0 q0Var2 = q0Var;
        while (q0Var2 != null && !zVar.equals(((g0) q0Var2.j).f6988a)) {
            q0Var2 = (com.google.android.exoplayer2.q0) q0Var2.f4411n;
        }
        if (z10 || q0Var != q0Var2 || (q0Var2 != null && q0Var2.f4407h + j < 0)) {
            u0[] u0VarArr = this.f6966a;
            for (u0 u0Var : u0VarArr) {
                b(u0Var);
            }
            if (q0Var2 != null) {
                while (((com.google.android.exoplayer2.q0) s0Var.f4441l) != q0Var2) {
                    s0Var.b();
                }
                s0Var.t(q0Var2);
                q0Var2.f4407h = 1000000000000L;
                d(new boolean[u0VarArr.length]);
            }
        }
        if (q0Var2 != null) {
            ?? r92 = q0Var2.f4401b;
            s0Var.t(q0Var2);
            if (!q0Var2.f4403d) {
                q0Var2.j = ((g0) q0Var2.j).b(j);
            } else if (q0Var2.f4404e) {
                j = r92.f(j);
                r92.g(j - this.I);
            }
            D(j);
            t();
        } else {
            s0Var.c();
            D(j);
        }
        k(false);
        this.D.e(2);
        return j;
    }

    public final void K(s0 s0Var) {
        a5.z zVar = this.D;
        if (s0Var.f7083f != this.F) {
            zVar.b(15, s0Var).b();
            return;
        }
        synchronized (s0Var) {
        }
        try {
            s0Var.f7078a.e(s0Var.f7081d, s0Var.f7082e);
            s0Var.b(true);
            int i10 = this.S.f7061e;
            if (i10 == 3 || i10 == 2) {
                zVar.e(2);
            }
        } catch (Throwable th2) {
            s0Var.b(true);
            throw th2;
        }
    }

    public final void L(s0 s0Var) {
        Looper looper = s0Var.f7083f;
        if (looper.getThread().isAlive()) {
            ((a5.x) this.L).a(looper, null).d(new androidx.lifecycle.f0(this, 9, s0Var));
        } else {
            a5.a.B("TAG", "Trying to send message on a dead thread.");
            s0Var.b(false);
        }
    }

    public final void N(boolean z10, AtomicBoolean atomicBoolean) {
        if (this.f6968b0 != z10) {
            this.f6968b0 = z10;
            if (!z10) {
                for (u0 u0Var : this.f6966a) {
                    if (!q(u0Var) && this.f6970d.remove(u0Var)) {
                        ((b) u0Var).v();
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
        this.T.a(1);
        int i10 = b0Var.f6933c;
        b1 b1Var = b0Var.f6932b;
        ArrayList arrayList = b0Var.f6931a;
        if (i10 != -1) {
            this.f6973f0 = new d0(new t0(arrayList, b1Var), b0Var.f6933c, b0Var.f6934d);
        }
        o0 o0Var = this.O;
        ArrayList arrayList2 = (ArrayList) o0Var.f7046c;
        o0Var.i(0, arrayList2.size());
        l(o0Var.a(arrayList2.size(), arrayList, b1Var), false);
    }

    public final void P(boolean z10) {
        if (z10 == this.f6971d0) {
            return;
        }
        this.f6971d0 = z10;
        if (z10 || !this.S.f7069o) {
            return;
        }
        this.D.e(2);
    }

    public final void Q(boolean z10) throws f {
        this.V = z10;
        C();
        if (this.W) {
            com.google.android.exoplayer2.s0 s0Var = this.N;
            if (((com.google.android.exoplayer2.q0) s0Var.f4442m) != ((com.google.android.exoplayer2.q0) s0Var.f4441l)) {
                H(true);
                k(false);
            }
        }
    }

    public final void R(int i10, int i11, boolean z10, boolean z11) {
        this.T.a(z11 ? 1 : 0);
        com.google.android.exoplayer2.c0 c0Var = this.T;
        c0Var.f4077b = true;
        c0Var.f4081f = true;
        c0Var.f4082g = i11;
        this.S = this.S.c(i10, z10);
        this.X = false;
        for (com.google.android.exoplayer2.q0 q0Var = (com.google.android.exoplayer2.q0) this.N.f4441l; q0Var != null; q0Var = (com.google.android.exoplayer2.q0) q0Var.f4411n) {
            for (androidx.media3.exoplayer.trackselection.v vVar : ((androidx.media3.exoplayer.trackselection.c0) q0Var.f4413p).f1879c) {
                if (vVar != null) {
                    vVar.l(z10);
                }
            }
        }
        if (!X()) {
            b0();
            e0();
            return;
        }
        int i12 = this.S.f7061e;
        a5.z zVar = this.D;
        if (i12 == 3) {
            Z();
            zVar.e(2);
        } else if (i12 == 2) {
            zVar.e(2);
        }
    }

    public final void S(androidx.media3.common.n0 n0Var) {
        this.D.f173a.removeMessages(16);
        com.google.android.exoplayer2.l lVar = this.J;
        lVar.setPlaybackParameters(n0Var);
        androidx.media3.common.n0 playbackParameters = lVar.getPlaybackParameters();
        n(playbackParameters, playbackParameters.f1725a, true, true);
    }

    public final void T(int i10) throws f {
        this.Z = i10;
        a1 a1Var = this.S.f7057a;
        com.google.android.exoplayer2.s0 s0Var = this.N;
        s0Var.f4434c = i10;
        if (!s0Var.y(a1Var)) {
            H(true);
        }
        k(false);
    }

    public final void U(boolean z10) throws f {
        this.f6967a0 = z10;
        a1 a1Var = this.S.f7057a;
        com.google.android.exoplayer2.s0 s0Var = this.N;
        s0Var.f4435d = z10;
        if (!s0Var.y(a1Var)) {
            H(true);
        }
        k(false);
    }

    public final void V(b1 b1Var) throws Throwable {
        this.T.a(1);
        o0 o0Var = this.O;
        int size = ((ArrayList) o0Var.f7046c).size();
        o5.a1 a1Var = (o5.a1) b1Var;
        if (a1Var.f18892b.length != size) {
            b1Var = new o5.a1(new Random(a1Var.f18891a.nextLong())).a(0, size);
        }
        o0Var.k = b1Var;
        l(o0Var.c(), false);
    }

    public final void W(int i10) {
        p0 p0Var = this.S;
        if (p0Var.f7061e != i10) {
            if (i10 != 2) {
                this.f6980l0 = -9223372036854775807L;
            }
            this.S = p0Var.f(i10);
        }
    }

    public final boolean X() {
        p0 p0Var = this.S;
        return p0Var.f7066l && p0Var.f7067m == 0;
    }

    public final boolean Y(a1 a1Var, o5.z zVar) {
        if (zVar.a() || a1Var.p()) {
            return false;
        }
        int i10 = a1Var.g(zVar.f1689a, this.H).f1829g;
        androidx.media3.common.z0 z0Var = this.G;
        a1Var.n(i10, z0Var);
        return z0Var.a() && z0Var.E && z0Var.f1847y != -9223372036854775807L;
    }

    public final void Z() {
        this.X = false;
        com.google.android.exoplayer2.l lVar = this.J;
        lVar.f4224g = true;
        ((y0) lVar.f4225r).d();
        for (u0 u0Var : this.f6966a) {
            if (q(u0Var)) {
                b bVar = (b) u0Var;
                a5.a.i(bVar.f6930y == 1);
                bVar.f6930y = 2;
                bVar.q();
            }
        }
    }

    public final void a(b0 b0Var, int i10) throws Throwable {
        this.T.a(1);
        o0 o0Var = this.O;
        if (i10 == -1) {
            i10 = ((ArrayList) o0Var.f7046c).size();
        }
        l(o0Var.a(i10, b0Var.f6931a, b0Var.f6932b), false);
    }

    public final void a0(boolean z10, boolean z11) {
        B(z10 || !this.f6968b0, false, true, false);
        this.T.a(z11 ? 1 : 0);
        this.f6983y.b(true);
        W(1);
    }

    public final void b(u0 u0Var) {
        if (q(u0Var)) {
            com.google.android.exoplayer2.l lVar = this.J;
            if (u0Var == ((u0) lVar.f4227y)) {
                lVar.B = null;
                lVar.f4227y = null;
                lVar.f4223d = true;
            }
            b bVar = (b) u0Var;
            int i10 = bVar.f6930y;
            if (i10 == 2) {
                a5.a.i(i10 == 2);
                bVar.f6930y = 1;
                bVar.r();
            }
            b bVar2 = (b) u0Var;
            a5.a.i(bVar2.f6930y == 1);
            bVar2.f6926d.c();
            bVar2.f6930y = 0;
            bVar2.B = null;
            bVar2.D = null;
            bVar2.G = false;
            bVar2.m();
            this.f6972e0--;
        }
    }

    public final void b0() {
        b bVar;
        int i10;
        com.google.android.exoplayer2.l lVar = this.J;
        lVar.f4224g = false;
        y0 y0Var = (y0) lVar.f4225r;
        if (y0Var.f7108r) {
            y0Var.c(y0Var.a());
            y0Var.f7108r = false;
        }
        for (u0 u0Var : this.f6966a) {
            if (q(u0Var) && (i10 = (bVar = (b) u0Var).f6930y) == 2) {
                a5.a.i(i10 == 2);
                bVar.f6930y = 1;
                bVar.r();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0680  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017c A[EDGE_INSN: B:473:0x017c->B:61:0x017c BREAK  A[LOOP:7: B:71:0x0198->B:88:0x01d4], EDGE_INSN: B:474:0x017c->B:61:0x017c BREAK  A[LOOP:7: B:71:0x0198->B:88:0x01d4], EDGE_INSN: B:475:0x017c->B:61:0x017c BREAK  A[LOOP:7: B:71:0x0198->B:88:0x01d4], EDGE_INSN: B:476:0x017c->B:61:0x017c BREAK  A[LOOP:7: B:71:0x0198->B:88:0x01d4]] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0182  */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26, types: [int] */
    /* JADX WARN: Type inference failed for: r10v35 */
    /* JADX WARN: Type inference failed for: r2v45, types: [java.lang.Object, o5.x] */
    /* JADX WARN: Type inference failed for: r2v67, types: [java.lang.Object, o5.x] */
    /* JADX WARN: Type inference failed for: r2v93, types: [java.lang.Object, o5.z0] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, o5.x] */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33, types: [int] */
    /* JADX WARN: Type inference failed for: r4v77 */
    /* JADX WARN: Type inference failed for: r5v27, types: [java.lang.Object, o5.x] */
    /* JADX WARN: Type inference failed for: r6v22, types: [java.lang.Object, o5.z0] */
    /* JADX WARN: Type inference failed for: r7v41, types: [java.lang.Object, o5.z0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() throws d5.f {
        /*
            Method dump skipped, instructions count: 1895
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.e0.c():void");
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, o5.z0] */
    public final void c0() {
        com.google.android.exoplayer2.q0 q0Var = (com.google.android.exoplayer2.q0) this.N.f4443n;
        boolean z10 = this.Y || (q0Var != null && q0Var.f4401b.isLoading());
        p0 p0Var = this.S;
        if (z10 != p0Var.f7063g) {
            this.S = new p0(p0Var.f7057a, p0Var.f7058b, p0Var.f7059c, p0Var.f7060d, p0Var.f7061e, p0Var.f7062f, z10, p0Var.f7064h, p0Var.f7065i, p0Var.j, p0Var.k, p0Var.f7066l, p0Var.f7067m, p0Var.f7068n, p0Var.f7070p, p0Var.f7071q, p0Var.f7072r, p0Var.f7069o);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(boolean[] r27) throws d5.f {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.e0.d(boolean[]):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void d0(androidx.media3.exoplayer.trackselection.c0 c0Var) {
        androidx.media3.exoplayer.trackselection.v[] vVarArr = c0Var.f1879c;
        e eVar = this.f6983y;
        int iMax = eVar.f6962f;
        if (iMax == -1) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                u0[] u0VarArr = this.f6966a;
                int i12 = 13107200;
                if (i10 < u0VarArr.length) {
                    if (vVarArr[i10] != null) {
                        switch (((b) u0VarArr[i10]).f6925a) {
                            case 0:
                                i12 = 144310272;
                                i11 += i12;
                                break;
                            case 1:
                                i11 += i12;
                                break;
                            case 2:
                                i12 = 131072000;
                                i11 += i12;
                                break;
                            case 3:
                            case 4:
                            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                                i12 = 131072;
                                i11 += i12;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                    }
                    i10++;
                } else {
                    iMax = Math.max(13107200, i11);
                }
            }
        }
        eVar.f6964h = iMax;
        eVar.f6957a.a(iMax);
    }

    public final long e(a1 a1Var, Object obj, long j) {
        androidx.media3.common.y0 y0Var = this.H;
        int i10 = a1Var.g(obj, y0Var).f1829g;
        androidx.media3.common.z0 z0Var = this.G;
        a1Var.n(i10, z0Var);
        if (z0Var.f1847y != -9223372036854775807L && z0Var.a() && z0Var.E) {
            return a5.d0.G(a5.d0.u(z0Var.B) - z0Var.f1847y) - (j + y0Var.f1831x);
        }
        return -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8  */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.lang.Object, o5.x] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e0() {
        /*
            Method dump skipped, instructions count: 701
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.e0.e0():void");
    }

    public final long f() {
        com.google.android.exoplayer2.q0 q0Var = (com.google.android.exoplayer2.q0) this.N.f4442m;
        if (q0Var == null) {
            return 0L;
        }
        long jMax = q0Var.f4407h;
        if (!q0Var.f4403d) {
            return jMax;
        }
        int i10 = 0;
        while (true) {
            u0[] u0VarArr = this.f6966a;
            if (i10 >= u0VarArr.length) {
                return jMax;
            }
            if (q(u0VarArr[i10])) {
                b bVar = (b) u0VarArr[i10];
                if (bVar.B != ((o5.x0[]) q0Var.f4408i)[i10]) {
                    continue;
                } else {
                    long j = bVar.F;
                    if (j == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    jMax = Math.max(j, jMax);
                }
            }
            i10++;
        }
    }

    public final void f0(a1 a1Var, o5.z zVar, a1 a1Var2, o5.z zVar2, long j, boolean z10) {
        boolean zY = Y(a1Var, zVar);
        Object obj = zVar.f1689a;
        if (!zY) {
            androidx.media3.common.n0 n0Var = zVar.a() ? androidx.media3.common.n0.f1724r : this.S.f7068n;
            com.google.android.exoplayer2.l lVar = this.J;
            if (lVar.getPlaybackParameters().equals(n0Var)) {
                return;
            }
            this.D.f173a.removeMessages(16);
            lVar.setPlaybackParameters(n0Var);
            n(this.S.f7068n, n0Var.f1725a, false, false);
            return;
        }
        androidx.media3.common.y0 y0Var = this.H;
        int i10 = a1Var.g(obj, y0Var).f1829g;
        androidx.media3.common.z0 z0Var = this.G;
        a1Var.n(i10, z0Var);
        androidx.media3.common.z zVar3 = z0Var.G;
        int i11 = a5.d0.f105a;
        com.google.android.exoplayer2.j jVar = this.P;
        jVar.getClass();
        jVar.f4174d = a5.d0.G(zVar3.f1834a);
        jVar.f4177g = a5.d0.G(zVar3.f1835d);
        jVar.f4178h = a5.d0.G(zVar3.f1836g);
        float f10 = zVar3.f1837r;
        if (f10 == -3.4028235E38f) {
            f10 = 0.97f;
        }
        jVar.k = f10;
        float f11 = zVar3.f1838x;
        if (f11 == -3.4028235E38f) {
            f11 = 1.03f;
        }
        jVar.j = f11;
        if (f10 == 1.0f && f11 == 1.0f) {
            jVar.f4174d = -9223372036854775807L;
        }
        jVar.a();
        if (j != -9223372036854775807L) {
            jVar.f4175e = e(a1Var, obj, j);
            jVar.a();
            return;
        }
        if (!a5.d0.a(!a1Var2.p() ? a1Var2.m(a1Var2.g(zVar2.f1689a, y0Var).f1829g, z0Var, 0L).f1842a : null, z0Var.f1842a) || z10) {
            jVar.f4175e = -9223372036854775807L;
            jVar.a();
        }
    }

    public final Pair g(a1 a1Var) {
        if (a1Var.p()) {
            return Pair.create(p0.f7056s, 0L);
        }
        Pair pairI = a1Var.i(this.G, this.H, a1Var.a(this.f6967a0), -9223372036854775807L);
        o5.z zVarX = this.N.x(a1Var, pairI.first, 0L);
        long jLongValue = ((Long) pairI.second).longValue();
        if (zVarX.a()) {
            Object obj = zVarX.f1689a;
            androidx.media3.common.y0 y0Var = this.H;
            a1Var.g(obj, y0Var);
            jLongValue = zVarX.f1691c == y0Var.f(zVarX.f1690b) ? y0Var.B.f1567d : 0L;
        }
        return Pair.create(zVarX, Long.valueOf(jLongValue));
    }

    public final synchronized void g0(ne.n nVar, long j) {
        ((a5.x) this.L).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j;
        boolean z10 = false;
        while (!((Boolean) nVar.get()).booleanValue() && j > 0) {
            try {
                this.L.getClass();
                wait(j);
            } catch (InterruptedException unused) {
                z10 = true;
            }
            ((a5.x) this.L).getClass();
            j = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, o5.z0] */
    public final void h(o5.x xVar) {
        com.google.android.exoplayer2.q0 q0Var = (com.google.android.exoplayer2.q0) this.N.f4443n;
        if (q0Var == null || q0Var.f4401b != xVar) {
            return;
        }
        long j = this.f6975g0;
        if (q0Var != null) {
            a5.a.i(((com.google.android.exoplayer2.q0) q0Var.f4411n) == null);
            if (q0Var.f4403d) {
                q0Var.f4401b.o(j - q0Var.f4407h);
            }
        }
        t();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        com.google.android.exoplayer2.q0 q0Var;
        int i10;
        try {
            switch (message.what) {
                case 0:
                    x();
                    break;
                case 1:
                    R(message.arg2, 1, message.arg1 != 0, true);
                    break;
                case 2:
                    c();
                    break;
                case 3:
                    I((d0) message.obj);
                    break;
                case 4:
                    S((androidx.media3.common.n0) message.obj);
                    break;
                case g4.j.STRING_FIELD_NUMBER /* 5 */:
                    this.R = (x0) message.obj;
                    break;
                case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                    a0(false, true);
                    break;
                case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                    y();
                    return true;
                case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                    m((o5.x) message.obj);
                    break;
                case 9:
                    h((o5.x) message.obj);
                    break;
                case 10:
                    A();
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
                    s0 s0Var = (s0) message.obj;
                    s0Var.getClass();
                    K(s0Var);
                    break;
                case 15:
                    L((s0) message.obj);
                    break;
                case 16:
                    androidx.media3.common.n0 n0Var = (androidx.media3.common.n0) message.obj;
                    n(n0Var, n0Var.f1725a, true, false);
                    break;
                case 17:
                    O((b0) message.obj);
                    break;
                case 18:
                    a((b0) message.obj, message.arg1);
                    break;
                case 19:
                    w((c0) message.obj);
                    break;
                case 20:
                    z(message.arg1, message.arg2, (b1) message.obj);
                    break;
                case 21:
                    V((b1) message.obj);
                    break;
                case 22:
                    v();
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
        } catch (androidx.media3.common.k0 e4) {
            boolean z10 = e4.f1714a;
            int i11 = e4.f1715d;
            if (i11 == 1) {
                i10 = z10 ? 3001 : 3003;
            } else {
                if (i11 == 4) {
                    i10 = z10 ? 3002 : 3004;
                }
                i(e4, i);
            }
            i = i10;
            i(e4, i);
        } catch (b5.i e10) {
            i(e10, e10.f2435a);
        } catch (f e11) {
            e = e11;
            if (e.f6984g == 1 && (q0Var = (com.google.android.exoplayer2.q0) this.N.f4442m) != null) {
                e = e.a(((g0) q0Var.j).f6988a);
            }
            if (e.E && this.f6978j0 == null) {
                a5.a.C("ExoPlayerImplInternal", "Recoverable renderer error", e);
                this.f6978j0 = e;
                a5.z zVar = this.D;
                a5.y yVarB = zVar.b(25, e);
                Handler handler = zVar.f173a;
                Message message2 = yVarB.f171a;
                message2.getClass();
                handler.sendMessageAtFrontOfQueue(message2);
                yVarB.a();
            } else {
                f fVar = this.f6978j0;
                if (fVar != null) {
                    fVar.addSuppressed(e);
                    e = this.f6978j0;
                }
                a5.a.n("ExoPlayerImplInternal", "Playback error", e);
                a0(true, false);
                this.S = this.S.d(e);
            }
        } catch (i5.d e12) {
            i(e12, e12.f11239a);
        } catch (o5.b e13) {
            i(e13, 1002);
        } catch (IOException e14) {
            i(e14, 2000);
        } catch (RuntimeException e15) {
            f fVar2 = new f(2, e15, ((e15 instanceof IllegalStateException) || (e15 instanceof IllegalArgumentException)) ? 1004 : 1000);
            a5.a.n("ExoPlayerImplInternal", "Playback error", fVar2);
            a0(true, false);
            this.S = this.S.d(fVar2);
        }
        u();
        return true;
    }

    public final void i(IOException iOException, int i10) {
        f fVar = new f(0, iOException, i10);
        com.google.android.exoplayer2.q0 q0Var = (com.google.android.exoplayer2.q0) this.N.f4441l;
        if (q0Var != null) {
            fVar = fVar.a(((g0) q0Var.j).f6988a);
        }
        a5.a.n("ExoPlayerImplInternal", "Playback error", fVar);
        a0(false, false);
        this.S = this.S.d(fVar);
    }

    @Override // o5.w
    public final void j(o5.x xVar) {
        this.D.b(8, xVar).b();
    }

    public final void k(boolean z10) {
        com.google.android.exoplayer2.q0 q0Var = (com.google.android.exoplayer2.q0) this.N.f4443n;
        o5.z zVar = q0Var == null ? this.S.f7058b : ((g0) q0Var.j).f6988a;
        boolean zEquals = this.S.k.equals(zVar);
        if (!zEquals) {
            this.S = this.S.a(zVar);
        }
        p0 p0Var = this.S;
        p0Var.f7070p = q0Var == null ? p0Var.f7072r : q0Var.e();
        p0 p0Var2 = this.S;
        long j = p0Var2.f7070p;
        com.google.android.exoplayer2.q0 q0Var2 = (com.google.android.exoplayer2.q0) this.N.f4443n;
        p0Var2.f7071q = q0Var2 != null ? Math.max(0L, j - (this.f6975g0 - q0Var2.f4407h)) : 0L;
        if ((!zEquals || z10) && q0Var != null && q0Var.f4403d) {
            d0((androidx.media3.exoplayer.trackselection.c0) q0Var.f4413p);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0217 A[PHI: r4
  0x0217: PHI (r4v31 long) = (r4v30 long), (r4v32 long) binds: [B:101:0x020d, B:104:0x0215] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0208  */
    /* JADX WARN: Type inference failed for: r18v11 */
    /* JADX WARN: Type inference failed for: r18v12 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r22v10 */
    /* JADX WARN: Type inference failed for: r22v15 */
    /* JADX WARN: Type inference failed for: r22v17 */
    /* JADX WARN: Type inference failed for: r22v18 */
    /* JADX WARN: Type inference failed for: r22v19 */
    /* JADX WARN: Type inference failed for: r22v20 */
    /* JADX WARN: Type inference failed for: r22v23, types: [long] */
    /* JADX WARN: Type inference failed for: r22v26 */
    /* JADX WARN: Type inference failed for: r22v28 */
    /* JADX WARN: Type inference failed for: r22v36 */
    /* JADX WARN: Type inference failed for: r22v37 */
    /* JADX WARN: Type inference failed for: r22v8 */
    /* JADX WARN: Type inference failed for: r22v9 */
    /* JADX WARN: Type inference failed for: r2v45, types: [com.google.android.exoplayer2.s0] */
    /* JADX WARN: Type inference failed for: r33v0, types: [d5.e0] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v31, types: [androidx.media3.common.a1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(androidx.media3.common.a1 r34, boolean r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1036
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.e0.l(androidx.media3.common.a1, boolean):void");
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, o5.x] */
    public final void m(o5.x xVar) throws f {
        com.google.android.exoplayer2.s0 s0Var = this.N;
        com.google.android.exoplayer2.q0 q0Var = (com.google.android.exoplayer2.q0) s0Var.f4443n;
        if (q0Var == null || q0Var.f4401b != xVar) {
            return;
        }
        float f10 = this.J.getPlaybackParameters().f1725a;
        a1 a1Var = this.S.f7057a;
        q0Var.f4403d = true;
        q0Var.f4412o = q0Var.f4401b.l();
        androidx.media3.exoplayer.trackselection.c0 c0VarH = q0Var.h(f10, a1Var);
        g0 g0Var = (g0) q0Var.j;
        long jMax = g0Var.f6989b;
        long j = g0Var.f6992e;
        if (j != -9223372036854775807L && jMax >= j) {
            jMax = Math.max(0L, j - 1);
        }
        long jA = q0Var.a(c0VarH, jMax, false, new boolean[((v0[]) q0Var.k).length]);
        long j7 = q0Var.f4407h;
        g0 g0Var2 = (g0) q0Var.j;
        q0Var.f4407h = (g0Var2.f6989b - jA) + j7;
        q0Var.j = g0Var2.b(jA);
        d0((androidx.media3.exoplayer.trackselection.c0) q0Var.f4413p);
        if (q0Var == ((com.google.android.exoplayer2.q0) s0Var.f4441l)) {
            D(((g0) q0Var.j).f6989b);
            d(new boolean[this.f6966a.length]);
            p0 p0Var = this.S;
            o5.z zVar = p0Var.f7058b;
            long j10 = ((g0) q0Var.j).f6989b;
            this.S = o(zVar, j10, p0Var.f7059c, j10, false, 5);
        }
        t();
    }

    public final void n(androidx.media3.common.n0 n0Var, float f10, boolean z10, boolean z11) {
        int i10;
        if (z10) {
            if (z11) {
                this.T.a(1);
            }
            this.S = this.S.e(n0Var);
        }
        float f11 = n0Var.f1725a;
        Object obj = this.N.f4441l;
        while (true) {
            com.google.android.exoplayer2.q0 q0Var = (com.google.android.exoplayer2.q0) obj;
            i10 = 0;
            if (q0Var == null) {
                break;
            }
            androidx.media3.exoplayer.trackselection.v[] vVarArr = ((androidx.media3.exoplayer.trackselection.c0) q0Var.f4413p).f1879c;
            int length = vVarArr.length;
            while (i10 < length) {
                androidx.media3.exoplayer.trackselection.v vVar = vVarArr[i10];
                if (vVar != null) {
                    vVar.f(f11);
                }
                i10++;
            }
            obj = q0Var.f4411n;
        }
        u0[] u0VarArr = this.f6966a;
        int length2 = u0VarArr.length;
        while (i10 < length2) {
            u0 u0Var = u0VarArr[i10];
            if (u0Var != null) {
                u0Var.g(f10, n0Var.f1725a);
            }
            i10++;
        }
    }

    public final p0 o(o5.z zVar, long j, long j7, long j10, boolean z10, int i10) {
        oe.u0 u0VarD;
        this.f6977i0 = (!this.f6977i0 && j == this.S.f7072r && zVar.equals(this.S.f7058b)) ? false : true;
        C();
        p0 p0Var = this.S;
        h1 h1Var = p0Var.f7064h;
        androidx.media3.exoplayer.trackselection.c0 c0Var = p0Var.f7065i;
        List list = p0Var.j;
        if (this.O.f7044a) {
            com.google.android.exoplayer2.q0 q0Var = (com.google.android.exoplayer2.q0) this.N.f4441l;
            h1Var = q0Var == null ? h1.f18956r : (h1) q0Var.f4412o;
            c0Var = q0Var == null ? this.f6982x : (androidx.media3.exoplayer.trackselection.c0) q0Var.f4413p;
            androidx.media3.exoplayer.trackselection.v[] vVarArr = c0Var.f1879c;
            oe.e0 e0Var = new oe.e0();
            boolean z11 = false;
            for (androidx.media3.exoplayer.trackselection.v vVar : vVarArr) {
                if (vVar != null) {
                    Metadata metadata = vVar.getFormat(0).F;
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
                g0 g0Var = (g0) q0Var.j;
                if (g0Var.f6990c != j7) {
                    q0Var.j = g0Var.a(j7);
                }
            }
        } else if (!zVar.equals(p0Var.f7058b)) {
            h1Var = h1.f18956r;
            c0Var = this.f6982x;
            list = oe.u0.f19383x;
        }
        h1 h1Var2 = h1Var;
        androidx.media3.exoplayer.trackselection.c0 c0Var2 = c0Var;
        List list2 = list;
        if (z10) {
            com.google.android.exoplayer2.c0 c0Var3 = this.T;
            if (!c0Var3.f4079d || c0Var3.f4080e == 5) {
                c0Var3.f4077b = true;
                c0Var3.f4079d = true;
                c0Var3.f4080e = i10;
            } else {
                a5.a.e(i10 == 5);
            }
        }
        p0 p0Var2 = this.S;
        long j11 = p0Var2.f7070p;
        com.google.android.exoplayer2.q0 q0Var2 = (com.google.android.exoplayer2.q0) this.N.f4443n;
        return p0Var2.b(zVar, j, j7, j10, q0Var2 == null ? 0L : Math.max(0L, j11 - (this.f6975g0 - q0Var2.f4407h)), h1Var2, c0Var2, list2);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, o5.z0] */
    public final boolean p() {
        com.google.android.exoplayer2.q0 q0Var = (com.google.android.exoplayer2.q0) this.N.f4443n;
        if (q0Var == null) {
            return false;
        }
        return (!q0Var.f4403d ? 0L : q0Var.f4401b.d()) != Long.MIN_VALUE;
    }

    @Override // o5.y0
    public final void r(o5.z0 z0Var) {
        this.D.b(9, (o5.x) z0Var).b();
    }

    public final boolean s() {
        com.google.android.exoplayer2.q0 q0Var = (com.google.android.exoplayer2.q0) this.N.f4441l;
        long j = ((g0) q0Var.j).f6992e;
        if (q0Var.f4403d) {
            return j == -9223372036854775807L || this.S.f7072r < j || !X();
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, o5.x] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, o5.z0] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, o5.z0] */
    public final void t() {
        boolean zC;
        if (p()) {
            com.google.android.exoplayer2.q0 q0Var = (com.google.android.exoplayer2.q0) this.N.f4443n;
            long jD = !q0Var.f4403d ? 0L : q0Var.f4401b.d();
            com.google.android.exoplayer2.q0 q0Var2 = (com.google.android.exoplayer2.q0) this.N.f4443n;
            long jMax = q0Var2 == null ? 0L : Math.max(0L, jD - (this.f6975g0 - q0Var2.f4407h));
            Object obj = this.N.f4441l;
            zC = this.f6983y.c(jMax, this.J.getPlaybackParameters().f1725a);
            if (!zC && jMax < 500000 && this.I > 0) {
                ((com.google.android.exoplayer2.q0) this.N.f4441l).f4401b.g(this.S.f7072r);
                zC = this.f6983y.c(jMax, this.J.getPlaybackParameters().f1725a);
            }
        } else {
            zC = false;
        }
        this.Y = zC;
        if (zC) {
            com.google.android.exoplayer2.q0 q0Var3 = (com.google.android.exoplayer2.q0) this.N.f4443n;
            long j = this.f6975g0;
            a5.a.i(((com.google.android.exoplayer2.q0) q0Var3.f4411n) == null);
            q0Var3.f4401b.i(j - q0Var3.f4407h);
        }
        c0();
    }

    public final void u() {
        com.google.android.exoplayer2.c0 c0Var = this.T;
        p0 p0Var = this.S;
        boolean z10 = c0Var.f4077b | (((p0) c0Var.f4083h) != p0Var);
        c0Var.f4077b = z10;
        c0Var.f4083h = p0Var;
        if (z10) {
            z zVar = this.M.f7077d;
            zVar.F.d(new a5.o(zVar, 11, c0Var));
            this.T = new com.google.android.exoplayer2.c0(1, this.S);
        }
    }

    public final void v() throws Throwable {
        l(this.O.c(), true);
    }

    public final void w(c0 c0Var) throws Throwable {
        a1 a1VarC;
        this.T.a(1);
        int i10 = c0Var.f6945a;
        int i11 = c0Var.f6946b;
        int i12 = c0Var.f6947c;
        b1 b1Var = c0Var.f6948d;
        o0 o0Var = this.O;
        ArrayList arrayList = (ArrayList) o0Var.f7046c;
        a5.a.e(i10 >= 0 && i10 <= i11 && i11 <= arrayList.size() && i12 >= 0);
        o0Var.k = b1Var;
        if (i10 == i11 || i10 == i12) {
            a1VarC = o0Var.c();
        } else {
            int iMin = Math.min(i10, i12);
            int iMax = Math.max(((i11 - i10) + i12) - 1, i11 - 1);
            int iO = ((n0) arrayList.get(iMin)).f7039d;
            a5.d0.F(arrayList, i10, i11, i12);
            while (iMin <= iMax) {
                n0 n0Var = (n0) arrayList.get(iMin);
                n0Var.f7039d = iO;
                iO += n0Var.f7036a.f19066h.f19002d.o();
                iMin++;
            }
            a1VarC = o0Var.c();
        }
        l(a1VarC, false);
    }

    public final void x() {
        this.T.a(1);
        B(false, false, false, true);
        this.f6983y.b(false);
        W(this.S.f7057a.p() ? 4 : 2);
        b5.b0 b0VarA = this.B.a();
        o0 o0Var = this.O;
        ArrayList arrayList = (ArrayList) o0Var.f7046c;
        a5.a.i(!o0Var.f7044a);
        o0Var.f7053l = b0VarA;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            n0 n0Var = (n0) arrayList.get(i10);
            o0Var.g(n0Var);
            ((HashSet) o0Var.f7051h).add(n0Var);
        }
        o0Var.f7044a = true;
        this.D.e(2);
    }

    public final void y() {
        B(true, false, true, false);
        this.f6983y.b(true);
        W(1);
        HandlerThread handlerThread = this.E;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        synchronized (this) {
            this.U = true;
            notifyAll();
        }
    }

    public final void z(int i10, int i11, b1 b1Var) throws Throwable {
        this.T.a(1);
        o0 o0Var = this.O;
        o0Var.getClass();
        a5.a.e(i10 >= 0 && i10 <= i11 && i11 <= ((ArrayList) o0Var.f7046c).size());
        o0Var.k = b1Var;
        o0Var.i(i10, i11);
        l(o0Var.c(), false);
    }
}
