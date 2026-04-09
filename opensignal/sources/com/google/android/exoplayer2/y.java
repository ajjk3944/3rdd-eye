package com.google.android.exoplayer2;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class y extends androidx.lifecycle.o implements ExoPlayer {
    public final t B;
    public final f0 D;
    public final qb.k E;
    public final CopyOnWriteArraySet F;
    public final u1 G;
    public final ArrayList H;
    public final boolean I;
    public final AnalyticsCollector J;
    public final Looper K;
    public final pb.g L;
    public final long M;
    public final long N;
    public final qb.a O;
    public int P;
    public boolean Q;
    public int R;
    public int S;
    public boolean T;
    public int U;
    public ya.v0 V;
    public c1 W;
    public p0 X;
    public a1 Y;
    public int Z;

    /* renamed from: a0, reason: collision with root package name */
    public long f4786a0;

    /* renamed from: g, reason: collision with root package name */
    public final ob.n f4787g;

    /* renamed from: r, reason: collision with root package name */
    public final c1 f4788r;

    /* renamed from: x, reason: collision with root package name */
    public final ob.m f4789x;

    /* renamed from: y, reason: collision with root package name */
    public final qb.t f4790y;

    public y(g[] gVarArr, DefaultTrackSelector defaultTrackSelector, k kVar, pb.g gVar, AnalyticsCollector analyticsCollector, boolean z10, n1 n1Var, long j, long j7, j jVar, long j10, et.d dVar, Looper looper, SimpleExoPlayer simpleExoPlayer, c1 c1Var) {
        super(5);
        new StringBuilder(c7.a.d(c7.a.d(30, Integer.toHexString(System.identityHashCode(this))), qb.v.f20832e));
        qb.b.j(gVarArr.length > 0);
        defaultTrackSelector.getClass();
        this.f4789x = defaultTrackSelector;
        this.L = gVar;
        this.J = analyticsCollector;
        this.I = z10;
        this.M = j;
        this.N = j7;
        this.K = looper;
        this.O = dVar;
        this.P = 0;
        g1 g1Var = simpleExoPlayer != null ? simpleExoPlayer : this;
        this.E = new qb.k(looper, dVar, new bf.a(2, g1Var));
        this.F = new CopyOnWriteArraySet();
        this.H = new ArrayList();
        this.V = new ya.v0();
        ob.n nVar = new ob.n(new m1[gVarArr.length], new ob.f[gVarArr.length], null);
        this.f4787g = nVar;
        this.G = new u1();
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        int[] iArr = {1, 2, 12, 13, 14, 15, 16, 17, 18, 19};
        int i10 = 0;
        for (int i11 = 10; i10 < i11; i11 = 10) {
            int i12 = iArr[i10];
            qb.b.j(!false);
            sparseBooleanArray.append(i12, true);
            i10++;
        }
        qb.f fVar = c1Var.f4085a;
        for (int i13 = 0; i13 < fVar.f20777a.size(); i13++) {
            int iA = fVar.a(i13);
            qb.b.j(!false);
            sparseBooleanArray.append(iA, true);
        }
        qb.b.j(!false);
        qb.f fVar2 = new qb.f(sparseBooleanArray);
        this.f4788r = new c1(fVar2);
        SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
        for (int i14 = 0; i14 < fVar2.f20777a.size(); i14++) {
            int iA2 = fVar2.a(i14);
            qb.b.j(!false);
            sparseBooleanArray2.append(iA2, true);
        }
        qb.b.j(!false);
        sparseBooleanArray2.append(3, true);
        qb.b.j(!false);
        sparseBooleanArray2.append(9, true);
        qb.b.j(true);
        this.W = new c1(new qb.f(sparseBooleanArray2));
        this.X = p0.f4365s;
        this.Z = -1;
        this.f4790y = dVar.g(looper, null);
        t tVar = new t(this, 0);
        this.B = tVar;
        this.Y = a1.h(nVar);
        if (analyticsCollector != null) {
            analyticsCollector.setPlayer(g1Var, looper);
            L(analyticsCollector);
            gVar.e(new Handler(looper), analyticsCollector);
        }
        this.D = new f0(gVarArr, defaultTrackSelector, nVar, kVar, gVar, this.P, this.Q, analyticsCollector, n1Var, jVar, j10, looper, dVar, tVar);
    }

    public static long w1(a1 a1Var) {
        v1 v1Var = new v1();
        u1 u1Var = new u1();
        a1Var.f4048a.g(a1Var.f4049b.f26177a, u1Var);
        long j = a1Var.f4050c;
        return j == -9223372036854775807L ? a1Var.f4048a.m(u1Var.f4596c, v1Var, 0L).f4750m : u1Var.f4598e + j;
    }

    public static boolean x1(a1 a1Var) {
        return a1Var.f4052e == 3 && a1Var.f4057l && a1Var.f4058m == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A1() {
        /*
            Method dump skipped, instructions count: 425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.y.A1():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0256  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B1(final com.google.android.exoplayer2.a1 r31, final int r32, final int r33, boolean r34, boolean r35, int r36, long r37, int r39) {
        /*
            Method dump skipped, instructions count: 982
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.y.B1(com.google.android.exoplayer2.a1, int, int, boolean, boolean, int, long, int):void");
    }

    @Override // com.google.android.exoplayer2.g1
    public final void H(Player$Listener player$Listener) {
        this.E.c(player$Listener);
    }

    @Override // com.google.android.exoplayer2.g1
    public final void L(d1 d1Var) {
        qb.k kVar = this.E;
        if (kVar.f20788g) {
            return;
        }
        d1Var.getClass();
        kVar.f20785d.add(new qb.j(d1Var));
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void X(ya.x xVar) {
        setMediaSources(Collections.singletonList(xVar));
        prepare();
    }

    @Override // com.google.android.exoplayer2.g1
    public final void clearVideoSurface() {
    }

    @Override // com.google.android.exoplayer2.g1
    public final void clearVideoSurfaceView(SurfaceView surfaceView) {
    }

    @Override // com.google.android.exoplayer2.g1
    public final void clearVideoTextureView(TextureView textureView) {
    }

    @Override // com.google.android.exoplayer2.g1
    public final Looper getApplicationLooper() {
        return this.K;
    }

    @Override // com.google.android.exoplayer2.g1
    public final long getBufferedPosition() {
        if (!isPlayingAd()) {
            return getContentBufferedPosition();
        }
        a1 a1Var = this.Y;
        return a1Var.k.equals(a1Var.f4049b) ? h.d(this.Y.f4062q) : getDuration();
    }

    @Override // com.google.android.exoplayer2.g1
    public final long getContentBufferedPosition() {
        if (this.Y.f4048a.p()) {
            return this.f4786a0;
        }
        a1 a1Var = this.Y;
        long j = 0;
        if (a1Var.k.f26180d != a1Var.f4049b.f26180d) {
            return h.d(a1Var.f4048a.m(getCurrentWindowIndex(), (v1) this.f1504d, 0L).f4751n);
        }
        long j7 = a1Var.f4062q;
        if (this.Y.k.a()) {
            a1 a1Var2 = this.Y;
            a1Var2.f4048a.g(a1Var2.k.f26177a, this.G).c(this.Y.k.f26178b);
        } else {
            j = j7;
        }
        a1 a1Var3 = this.Y;
        w1 w1Var = a1Var3.f4048a;
        Object obj = a1Var3.k.f26177a;
        u1 u1Var = this.G;
        w1Var.g(obj, u1Var);
        return h.d(j + u1Var.f4598e);
    }

    @Override // androidx.media3.common.s0
    public final long getContentPosition() {
        if (!isPlayingAd()) {
            return getCurrentPosition();
        }
        a1 a1Var = this.Y;
        w1 w1Var = a1Var.f4048a;
        Object obj = a1Var.f4049b.f26177a;
        u1 u1Var = this.G;
        w1Var.g(obj, u1Var);
        a1 a1Var2 = this.Y;
        if (a1Var2.f4050c == -9223372036854775807L) {
            return h.d(a1Var2.f4048a.m(getCurrentWindowIndex(), (v1) this.f1504d, 0L).f4750m);
        }
        return h.d(this.Y.f4050c) + h.d(u1Var.f4598e);
    }

    @Override // androidx.media3.common.s0
    public final int getCurrentAdGroupIndex() {
        if (isPlayingAd()) {
            return this.Y.f4049b.f26178b;
        }
        return -1;
    }

    @Override // androidx.media3.common.s0
    public final int getCurrentAdIndexInAdGroup() {
        if (isPlayingAd()) {
            return this.Y.f4049b.f26179c;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.g1
    public final List getCurrentCues() {
        oe.f0 f0Var = oe.h0.f19336d;
        return oe.u0.f19383x;
    }

    @Override // androidx.media3.common.s0
    public final int getCurrentPeriodIndex() {
        if (this.Y.f4048a.p()) {
            return 0;
        }
        a1 a1Var = this.Y;
        return a1Var.f4048a.b(a1Var.f4049b.f26177a);
    }

    @Override // androidx.media3.common.s0
    public final long getCurrentPosition() {
        return h.d(u1(this.Y));
    }

    @Override // com.google.android.exoplayer2.g1
    public final w1 getCurrentTimeline() {
        return this.Y.f4048a;
    }

    @Override // com.google.android.exoplayer2.g1
    public final TrackGroupArray getCurrentTrackGroups() {
        return this.Y.f4055h;
    }

    @Override // com.google.android.exoplayer2.g1
    public final ob.j getCurrentTrackSelections() {
        return new ob.j(this.Y.f4056i.f19272c);
    }

    @Override // androidx.lifecycle.o, com.google.android.exoplayer2.g1
    public final int getCurrentWindowIndex() {
        int i10;
        if (this.Y.f4048a.p()) {
            i10 = this.Z;
        } else {
            a1 a1Var = this.Y;
            i10 = a1Var.f4048a.g(a1Var.f4049b.f26177a, this.G).f4596c;
        }
        if (i10 == -1) {
            return 0;
        }
        return i10;
    }

    @Override // com.google.android.exoplayer2.g1
    public final long getDuration() {
        if (!isPlayingAd()) {
            w1 currentTimeline = getCurrentTimeline();
            if (currentTimeline.p()) {
                return -9223372036854775807L;
            }
            return h.d(currentTimeline.m(getCurrentWindowIndex(), (v1) this.f1504d, 0L).f4751n);
        }
        a1 a1Var = this.Y;
        ya.v vVar = a1Var.f4049b;
        w1 w1Var = a1Var.f4048a;
        Object obj = vVar.f26177a;
        u1 u1Var = this.G;
        w1Var.g(obj, u1Var);
        return h.d(u1Var.a(vVar.f26178b, vVar.f26179c));
    }

    @Override // com.google.android.exoplayer2.g1
    public final p0 getMediaMetadata() {
        return this.X;
    }

    @Override // androidx.media3.common.s0
    public final boolean getPlayWhenReady() {
        return this.Y.f4057l;
    }

    @Override // com.google.android.exoplayer2.g1
    public final b1 getPlaybackParameters() {
        return this.Y.f4059n;
    }

    @Override // androidx.media3.common.s0
    public final int getPlaybackState() {
        return this.Y.f4052e;
    }

    @Override // androidx.media3.common.s0
    public final int getPlaybackSuppressionReason() {
        return this.Y.f4058m;
    }

    @Override // com.google.android.exoplayer2.g1
    public final int getRepeatMode() {
        return this.P;
    }

    @Override // com.google.android.exoplayer2.g1
    public final long getSeekBackIncrement() {
        return this.M;
    }

    @Override // com.google.android.exoplayer2.g1
    public final long getSeekForwardIncrement() {
        return this.N;
    }

    @Override // com.google.android.exoplayer2.g1
    public final boolean getShuffleModeEnabled() {
        return this.Q;
    }

    @Override // androidx.media3.common.s0
    public final long getTotalBufferedDuration() {
        return h.d(this.Y.f4063r);
    }

    @Override // com.google.android.exoplayer2.g1
    public final rb.v getVideoSize() {
        return rb.v.f21523e;
    }

    @Override // androidx.media3.common.s0
    public final boolean isPlayingAd() {
        return this.Y.f4049b.a();
    }

    @Override // com.google.android.exoplayer2.g1
    public final n p0() {
        return this.Y.f4053f;
    }

    @Override // com.google.android.exoplayer2.g1
    public final void prepare() {
        a1 a1Var = this.Y;
        if (a1Var.f4052e != 1) {
            return;
        }
        a1 a1VarE = a1Var.e(null);
        a1 a1VarF = a1VarE.f(a1VarE.f4048a.p() ? 4 : 2);
        this.R++;
        qb.t tVar = this.D.B;
        tVar.getClass();
        qb.s sVarB = qb.t.b();
        sVarB.f20821a = tVar.f20823a.obtainMessage(0);
        sVarB.b();
        B1(a1VarF, 1, 1, false, false, 5, -9223372036854775807L, -1);
    }

    @Override // com.google.android.exoplayer2.g1
    public final c1 r0() {
        return this.W;
    }

    @Override // com.google.android.exoplayer2.g1
    public final void release() {
        boolean z10;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        new StringBuilder(c7.a.d(c7.a.d(c7.a.d(36, hexString), qb.v.f20832e), ExoPlayerLibraryInfo.registeredModules()));
        f0 f0Var = this.D;
        synchronized (f0Var) {
            if (f0Var.T || !f0Var.D.isAlive()) {
                z10 = true;
            } else {
                f0Var.B.c(7);
                f0Var.g0(new z(0, f0Var), f0Var.P);
                z10 = f0Var.T;
            }
        }
        if (!z10) {
            qb.k kVar = this.E;
            kVar.b(11, new ab.c(24));
            kVar.a();
        }
        qb.k kVar2 = this.E;
        CopyOnWriteArraySet copyOnWriteArraySet = kVar2.f20785d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            qb.j jVar = (qb.j) it.next();
            qb.i iVar = kVar2.f20784c;
            jVar.f20781d = true;
            if (jVar.f20780c) {
                iVar.d(jVar.f20778a, jVar.f20779b.c());
            }
        }
        copyOnWriteArraySet.clear();
        kVar2.f20788g = true;
        this.f4790y.f20823a.removeCallbacksAndMessages(null);
        AnalyticsCollector analyticsCollector = this.J;
        if (analyticsCollector != null) {
            this.L.f(analyticsCollector);
        }
        a1 a1VarF = this.Y.f(1);
        this.Y = a1VarF;
        a1 a1VarA = a1VarF.a(a1VarF.f4049b);
        this.Y = a1VarA;
        a1VarA.f4062q = a1VarA.f4064s;
        this.Y.f4063r = 0L;
    }

    @Override // androidx.lifecycle.o, com.google.android.exoplayer2.g1
    public final void seekTo(int i10, long j) {
        w1 w1Var = this.Y.f4048a;
        if (i10 < 0 || (!w1Var.p() && i10 >= w1Var.o())) {
            throw new androidx.media3.common.u();
        }
        this.R++;
        if (!isPlayingAd()) {
            int i11 = this.Y.f4052e != 1 ? 2 : 1;
            int currentWindowIndex = getCurrentWindowIndex();
            a1 a1VarY1 = y1(this.Y.f(i11), w1Var, v1(w1Var, i10, j));
            this.D.B.a(3, new e0(w1Var, i10, h.c(j))).b();
            B1(a1VarY1, 0, 1, true, true, 1, u1(a1VarY1), currentWindowIndex);
            return;
        }
        io.sentry.android.core.e0.p("ExoPlayerImpl", "seekTo ignored because an ad is playing");
        c0 c0Var = new c0(0, this.Y);
        c0Var.a(1);
        y yVar = this.B.f4552d;
        yVar.f4790y.f20823a.post(new a5.o(yVar, 10, c0Var));
    }

    public final void setMediaSources(List list) {
        if (!this.Y.f4048a.p()) {
            a1 a1Var = this.Y;
            int i10 = a1Var.f4048a.g(a1Var.f4049b.f26177a, this.G).f4596c;
        }
        getCurrentPosition();
        this.R++;
        ArrayList arrayList = this.H;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i11 = size - 1; i11 >= 0; i11--) {
                arrayList.remove(i11);
            }
            ya.v0 v0Var = this.V;
            int[] iArr = v0Var.f26183b;
            int[] iArr2 = new int[iArr.length - size];
            int i12 = 0;
            for (int i13 = 0; i13 < iArr.length; i13++) {
                int i14 = iArr[i13];
                if (i14 < 0 || i14 >= size) {
                    int i15 = i13 - i12;
                    if (i14 >= 0) {
                        i14 -= size;
                    }
                    iArr2[i15] = i14;
                } else {
                    i12++;
                }
            }
            this.V = new ya.v0(iArr2, new Random(v0Var.f26182a.nextLong()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i16 = 0; i16 < list.size(); i16++) {
            w0 w0Var = new w0((ya.x) list.get(i16), this.I);
            arrayList2.add(w0Var);
            arrayList.add(i16, new x(w0Var.f4770b, w0Var.f4769a.f26143h));
        }
        ya.v0 v0VarA = this.V.a(arrayList2.size());
        this.V = v0VarA;
        k1 k1Var = new k1(arrayList, v0VarA);
        boolean zP = k1Var.p();
        int i17 = k1Var.f4216d;
        if (!zP && -1 >= i17) {
            throw new androidx.media3.common.u();
        }
        int iA = k1Var.a(this.Q);
        a1 a1VarY1 = y1(this.Y, k1Var, v1(k1Var, iA, -9223372036854775807L));
        int i18 = a1VarY1.f4052e;
        if (iA != -1 && i18 != 1) {
            i18 = (k1Var.p() || iA >= i17) ? 4 : 2;
        }
        a1 a1VarF = a1VarY1.f(i18);
        this.D.B.a(17, new b0(arrayList2, this.V, iA, h.c(-9223372036854775807L))).b();
        B1(a1VarF, 0, 1, false, (this.Y.f4049b.f26177a.equals(a1VarF.f4049b.f26177a) || this.Y.f4048a.p()) ? false : true, 4, u1(a1VarF), -1);
    }

    @Override // com.google.android.exoplayer2.g1
    public final void setPlayWhenReady(boolean z10) {
        z1(0, z10, 1);
    }

    @Override // com.google.android.exoplayer2.g1
    public final void setRepeatMode(int i10) {
        if (this.P != i10) {
            this.P = i10;
            qb.t tVar = this.D.B;
            tVar.getClass();
            qb.s sVarB = qb.t.b();
            sVarB.f20821a = tVar.f20823a.obtainMessage(11, i10, 0);
            sVarB.b();
            u uVar = new u(i10, 0);
            qb.k kVar = this.E;
            kVar.b(9, uVar);
            A1();
            kVar.a();
        }
    }

    @Override // com.google.android.exoplayer2.g1
    public final void setShuffleModeEnabled(boolean z10) {
        if (this.Q != z10) {
            this.Q = z10;
            qb.t tVar = this.D.B;
            tVar.getClass();
            qb.s sVarB = qb.t.b();
            sVarB.f20821a = tVar.f20823a.obtainMessage(12, z10 ? 1 : 0, 0);
            sVarB.b();
            q qVar = new q(0, z10);
            qb.k kVar = this.E;
            kVar.b(10, qVar);
            A1();
            kVar.a();
        }
    }

    @Override // com.google.android.exoplayer2.g1
    public final void setVideoSurfaceView(SurfaceView surfaceView) {
    }

    @Override // com.google.android.exoplayer2.g1
    public final void setVideoTextureView(TextureView textureView) {
    }

    @Override // com.google.android.exoplayer2.g1
    public final void setVolume(float f10) {
    }

    public final j1 t1(i1 i1Var) {
        return new j1(this.D, i1Var, this.Y.f4048a, getCurrentWindowIndex(), this.O, this.D.E);
    }

    public final long u1(a1 a1Var) {
        if (a1Var.f4048a.p()) {
            return h.c(this.f4786a0);
        }
        if (a1Var.f4049b.a()) {
            return a1Var.f4064s;
        }
        w1 w1Var = a1Var.f4048a;
        ya.v vVar = a1Var.f4049b;
        long j = a1Var.f4064s;
        Object obj = vVar.f26177a;
        u1 u1Var = this.G;
        w1Var.g(obj, u1Var);
        return j + u1Var.f4598e;
    }

    public final Pair v1(w1 w1Var, int i10, long j) {
        if (w1Var.p()) {
            this.Z = i10;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.f4786a0 = j;
            return null;
        }
        if (i10 == -1 || i10 >= w1Var.o()) {
            i10 = w1Var.a(this.Q);
            j = h.d(w1Var.m(i10, (v1) this.f1504d, 0L).f4750m);
        }
        return w1Var.i((v1) this.f1504d, this.G, i10, h.c(j));
    }

    public final a1 y1(a1 a1Var, w1 w1Var, Pair pair) {
        List list;
        qb.b.g(w1Var.p() || pair != null);
        w1 w1Var2 = a1Var.f4048a;
        a1 a1VarG = a1Var.g(w1Var);
        if (w1Var.p()) {
            ya.v vVar = a1.f4047t;
            long jC = h.c(this.f4786a0);
            TrackGroupArray trackGroupArray = TrackGroupArray.f4456r;
            ob.n nVar = this.f4787g;
            oe.f0 f0Var = oe.h0.f19336d;
            a1 a1VarA = a1VarG.b(vVar, jC, jC, jC, 0L, trackGroupArray, nVar, oe.u0.f19383x).a(vVar);
            a1VarA.f4062q = a1VarA.f4064s;
            return a1VarA;
        }
        Object obj = a1VarG.f4049b.f26177a;
        int i10 = qb.v.f20828a;
        boolean zEquals = obj.equals(pair.first);
        ya.v vVar2 = !zEquals ? new ya.v(pair.first) : a1VarG.f4049b;
        long jLongValue = ((Long) pair.second).longValue();
        long jC2 = h.c(getContentPosition());
        if (!w1Var2.p()) {
            jC2 -= w1Var2.g(obj, this.G).f4598e;
        }
        if (!zEquals || jLongValue < jC2) {
            ya.v vVar3 = vVar2;
            qb.b.j(!vVar3.a());
            TrackGroupArray trackGroupArray2 = !zEquals ? TrackGroupArray.f4456r : a1VarG.f4055h;
            ob.n nVar2 = !zEquals ? this.f4787g : a1VarG.f4056i;
            if (zEquals) {
                list = a1VarG.j;
            } else {
                oe.f0 f0Var2 = oe.h0.f19336d;
                list = oe.u0.f19383x;
            }
            a1 a1VarA2 = a1VarG.b(vVar3, jLongValue, jLongValue, jLongValue, 0L, trackGroupArray2, nVar2, list).a(vVar3);
            a1VarA2.f4062q = jLongValue;
            return a1VarA2;
        }
        if (jLongValue != jC2) {
            ya.v vVar4 = vVar2;
            qb.b.j(!vVar4.a());
            long jMax = Math.max(0L, a1VarG.f4063r - (jLongValue - jC2));
            long j = a1VarG.f4062q;
            if (a1VarG.k.equals(a1VarG.f4049b)) {
                j = jLongValue + jMax;
            }
            a1 a1VarB = a1VarG.b(vVar4, jLongValue, jLongValue, jLongValue, jMax, a1VarG.f4055h, a1VarG.f4056i, a1VarG.j);
            a1VarB.f4062q = j;
            return a1VarB;
        }
        int iB = w1Var.b(a1VarG.k.f26177a);
        if (iB != -1 && w1Var.f(iB, this.G, false).f4596c == w1Var.g(vVar2.f26177a, this.G).f4596c) {
            return a1VarG;
        }
        w1Var.g(vVar2.f26177a, this.G);
        long jA = vVar2.a() ? this.G.a(vVar2.f26178b, vVar2.f26179c) : this.G.f4597d;
        ya.v vVar5 = vVar2;
        a1 a1VarA3 = a1VarG.b(vVar5, a1VarG.f4064s, a1VarG.f4064s, a1VarG.f4051d, jA - a1VarG.f4064s, a1VarG.f4055h, a1VarG.f4056i, a1VarG.j).a(vVar5);
        a1VarA3.f4062q = jA;
        return a1VarA3;
    }

    public final void z1(int i10, boolean z10, int i11) {
        a1 a1Var = this.Y;
        if (a1Var.f4057l == z10 && a1Var.f4058m == i10) {
            return;
        }
        this.R++;
        a1 a1VarD = a1Var.d(i10, z10);
        qb.t tVar = this.D.B;
        tVar.getClass();
        qb.s sVarB = qb.t.b();
        sVarB.f20821a = tVar.f20823a.obtainMessage(1, z10 ? 1 : 0, i10);
        sVarB.b();
        B1(a1VarD, 0, i11, false, false, 5, -9223372036854775807L, -1);
    }

    @Override // com.google.android.exoplayer2.g1
    public final void getMaxSeekToPreviousPosition() {
    }
}
