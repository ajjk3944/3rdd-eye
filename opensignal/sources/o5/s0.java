package o5;

import android.net.Uri;
import android.os.Looper;

/* loaded from: classes.dex */
public final class s0 extends a {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.media3.common.e0 f19044a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.media3.common.b0 f19045b;

    /* renamed from: c, reason: collision with root package name */
    public final b5.g f19046c;

    /* renamed from: d, reason: collision with root package name */
    public final io.sentry.android.replay.capture.e f19047d;

    /* renamed from: e, reason: collision with root package name */
    public final i5.j f19048e;

    /* renamed from: f, reason: collision with root package name */
    public final r5.h f19049f;

    /* renamed from: g, reason: collision with root package name */
    public final int f19050g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f19051h;

    /* renamed from: i, reason: collision with root package name */
    public long f19052i;
    public boolean j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public b5.b0 f19053l;

    public s0(androidx.media3.common.e0 e0Var, b5.g gVar, io.sentry.android.replay.capture.e eVar, i5.j jVar, df.c cVar, int i10) {
        androidx.media3.common.b0 b0Var = e0Var.f1608d;
        b0Var.getClass();
        this.f19045b = b0Var;
        this.f19044a = e0Var;
        this.f19046c = gVar;
        this.f19047d = eVar;
        this.f19048e = jVar;
        this.f19049f = cVar;
        this.f19050g = i10;
        this.f19051h = true;
        this.f19052i = -9223372036854775807L;
    }

    public final void a() {
        long j = this.f19052i;
        boolean z10 = this.j;
        boolean z11 = this.k;
        androidx.media3.common.e0 e0Var = this.f19044a;
        androidx.media3.common.a1 c1Var = new c1(-9223372036854775807L, -9223372036854775807L, j, j, 0L, 0L, z10, false, false, null, e0Var, z11 ? e0Var.f1609g : null);
        if (this.f19051h) {
            c1Var = new q0(c1Var);
        }
        refreshSourceInfo(c1Var);
    }

    public final void b(long j, boolean z10, boolean z11) {
        if (j == -9223372036854775807L) {
            j = this.f19052i;
        }
        if (!this.f19051h && this.f19052i == j && this.j == z10 && this.k == z11) {
            return;
        }
        this.f19052i = j;
        this.j = z10;
        this.k = z11;
        this.f19051h = false;
        a();
    }

    @Override // o5.b0
    public final x createPeriod(z zVar, r5.b bVar, long j) {
        b5.h hVarA = this.f19046c.a();
        b5.b0 b0Var = this.f19053l;
        if (b0Var != null) {
            hVarA.w(b0Var);
        }
        Uri uri = this.f19045b.f1560a;
        getPlayerId();
        return new p0(uri, hVarA, new io.sentry.k((u5.i) this.f19047d.f11882d), this.f19048e, createDrmEventDispatcher(zVar), this.f19049f, createEventDispatcher(zVar), this, bVar, this.f19050g);
    }

    @Override // o5.b0
    public final androidx.media3.common.e0 getMediaItem() {
        return this.f19044a;
    }

    @Override // o5.a
    public final void prepareSourceInternal(b5.b0 b0Var) {
        this.f19053l = b0Var;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        e5.o0 playerId = getPlayerId();
        i5.j jVar = this.f19048e;
        jVar.a(looperMyLooper, playerId);
        jVar.prepare();
        a();
    }

    @Override // o5.b0
    public final void releasePeriod(x xVar) {
        p0 p0Var = (p0) xVar;
        if (p0Var.Q) {
            for (w0 w0Var : p0Var.N) {
                w0Var.g();
                h7.h0 h0Var = w0Var.f19085h;
                if (h0Var != null) {
                    h0Var.U(w0Var.f19082e);
                    w0Var.f19085h = null;
                    w0Var.f19084g = null;
                }
            }
        }
        p0Var.F.e(p0Var);
        p0Var.K.removeCallbacksAndMessages(null);
        p0Var.L = null;
        p0Var.f19021g0 = true;
    }

    @Override // o5.a
    public final void releaseSourceInternal() {
        this.f19048e.release();
    }

    @Override // o5.b0
    public final void maybeThrowSourceInfoRefreshError() {
    }
}
