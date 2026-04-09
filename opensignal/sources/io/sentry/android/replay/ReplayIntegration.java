package io.sentry.android.replay;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import androidx.lifecycle.f0;
import com.google.android.gms.internal.measurement.e5;
import h7.r1;
import io.sentry.a6;
import io.sentry.b5;
import io.sentry.b6;
import io.sentry.e1;
import io.sentry.i3;
import io.sentry.j2;
import io.sentry.j3;
import io.sentry.n0;
import io.sentry.o0;
import io.sentry.q1;
import io.sentry.v3;
import io.sentry.x5;
import io.sentry.z4;
import java.io.Closeable;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0003:\u0002\u0007\b¨\u0006\t"}, d2 = {"Lio/sentry/android/replay/ReplayIntegration;", "Lio/sentry/q1;", "Ljava/io/Closeable;", "", "Lio/sentry/j3;", "Lio/sentry/o0;", "Lio/sentry/transport/o;", "io/sentry/android/replay/l", "io/sentry/j0", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ReplayIntegration implements q1, Closeable, j3, o0, io.sentry.transport.o {
    public static final /* synthetic */ int M = 0;
    public final lq.q B;
    public final lq.q D;
    public final lq.q E;
    public final AtomicBoolean F;
    public final AtomicBoolean G;
    public io.sentry.android.replay.capture.m H;
    public i3 I;
    public final r1 J;
    public final io.sentry.util.a K;
    public final n L;

    /* renamed from: a, reason: collision with root package name */
    public final Context f11827a;

    /* renamed from: d, reason: collision with root package name */
    public final io.sentry.transport.d f11828d;

    /* renamed from: g, reason: collision with root package name */
    public x5 f11829g;

    /* renamed from: r, reason: collision with root package name */
    public v3 f11830r;

    /* renamed from: x, reason: collision with root package name */
    public a0 f11831x;

    /* renamed from: y, reason: collision with root package name */
    public io.sentry.android.replay.gestures.b f11832y;

    static {
        z4.d().b("maven:io.sentry:sentry-android-replay", "8.25.0");
    }

    public ReplayIntegration(Context context) {
        io.sentry.transport.d dVar = io.sentry.transport.d.f12759a;
        Context applicationContext = context.getApplicationContext();
        this.f11827a = applicationContext != null ? applicationContext : context;
        this.f11828d = dVar;
        this.B = kc.f.F(a.f11834r);
        this.D = kc.f.F(a.f11835x);
        this.E = kc.f.F(new ht.g(4, this));
        this.F = new AtomicBoolean(false);
        this.G = new AtomicBoolean(false);
        this.I = j2.f12377g;
        this.J = new r1(9, (byte) 0);
        this.K = new io.sentry.util.a();
        n nVar = new n();
        nVar.f11941a = o.INITIAL;
        this.L = nVar;
    }

    @Override // io.sentry.j3
    /* renamed from: G, reason: from getter */
    public final i3 getI() {
        return this.I;
    }

    public final void L(String str) {
        File[] fileArrListFiles;
        x5 x5Var = this.f11829g;
        if (x5Var == null) {
            br.l.l("options");
            throw null;
        }
        String cacheDirPath = x5Var.getCacheDirPath();
        if (cacheDirPath == null || (fileArrListFiles = new File(cacheDirPath).listFiles()) == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            String name = file.getName();
            br.l.b(name);
            if (tt.s.n0(name, "replay_", false)) {
                String string = i().toString();
                br.l.d(string, "toString(...)");
                if (!tt.l.q0(name, string, false) && (tt.l.D0(str) || !tt.l.q0(name, str, false))) {
                    e5.r(file);
                }
            }
        }
    }

    public final boolean R() {
        return this.L.f11941a.compareTo(o.STARTED) >= 0 && this.L.f11941a.compareTo(o.STOPPED) < 0;
    }

    public final void V(Bitmap bitmap) {
        v3 v3Var;
        v3 v3Var2;
        io.sentry.transport.p pVarD;
        io.sentry.transport.p pVarD2;
        br.l.e(bitmap, "bitmap");
        br.w wVar = new br.w();
        v3 v3Var3 = this.f11830r;
        if (v3Var3 != null) {
            v3Var3.r(new io.sentry.android.fragment.c(wVar, 1));
        }
        io.sentry.android.replay.capture.m mVar = this.H;
        if (mVar != null) {
            mVar.f(new b1.d(bitmap, 1, wVar));
        }
        if (this.H instanceof io.sentry.android.replay.capture.p) {
            x5 x5Var = this.f11829g;
            if (x5Var == null) {
                br.l.l("options");
                throw null;
            }
            if (x5Var.getConnectionStatusProvider().N() == n0.DISCONNECTED || !(((v3Var = this.f11830r) == null || (pVarD2 = v3Var.d()) == null || !pVarD2.f(io.sentry.m.All)) && ((v3Var2 = this.f11830r) == null || (pVarD = v3Var2.d()) == null || !pVarD.f(io.sentry.m.Replay)))) {
                Z();
            }
        }
    }

    public final void Y(int i10, int i11) {
        a0 a0Var;
        x xVar;
        s sVar;
        if (this.F.get() && R()) {
            x5 x5Var = this.f11829g;
            if (x5Var == null) {
                br.l.l("options");
                throw null;
            }
            if (x5Var.getSessionReplay().j) {
                Context context = this.f11827a;
                x5 x5Var2 = this.f11829g;
                if (x5Var2 == null) {
                    br.l.l("options");
                    throw null;
                }
                b6 sessionReplay = x5Var2.getSessionReplay();
                br.l.d(sessionReplay, "getSessionReplay(...)");
                br.l.e(context, "context");
                float f10 = i11;
                float f11 = f10 / context.getResources().getDisplayMetrics().density;
                a6 a6Var = sessionReplay.f12078e;
                int iF = dr.a.F(f11 * a6Var.sizeScale);
                int i12 = iF % 16;
                int iMax = i12 <= 8 ? Math.max(16, iF - i12) : iF + (16 - i12);
                float f12 = i10;
                int iF2 = dr.a.F((f12 / context.getResources().getDisplayMetrics().density) * a6Var.sizeScale);
                int i13 = iF2 % 16;
                int iMax2 = i13 <= 8 ? Math.max(16, iF2 - i13) : iF2 + (16 - i13);
                t tVar = new t(iMax2, iMax, iMax2 / f12, iMax / f10, sessionReplay.f12079f, a6Var.bitRate);
                if (this.F.get() && R()) {
                    io.sentry.android.replay.capture.m mVar = this.H;
                    if (mVar != null) {
                        mVar.b(tVar);
                    }
                    a0 a0Var2 = this.f11831x;
                    if (a0Var2 != null && a0Var2.f11843y.get()) {
                        if (a0Var2.H == null) {
                            io.sentry.q qVarA = a0Var2.F.a();
                            try {
                                if (a0Var2.H == null) {
                                    a0Var2.H = new x(a0Var2.f11838a, a0Var2.f11841r);
                                }
                                vc.e.e(qVarA, null);
                            } catch (Throwable th2) {
                                try {
                                    throw th2;
                                } catch (Throwable th3) {
                                    vc.e.e(qVarA, th2);
                                    throw th3;
                                }
                            }
                        }
                        x xVar2 = a0Var2.H;
                        if (xVar2 != null) {
                            xVar2.f12036x = tVar;
                        }
                        x xVar3 = a0Var2.H;
                        if (xVar3 != null) {
                            xVar3.f12035r = new s(a0Var2.f11838a, a0Var2.f11839d, tVar, a0Var2);
                        }
                        WeakReference weakReference = (WeakReference) mq.o.A0(a0Var2.B);
                        View view = weakReference != null ? (View) weakReference.get() : null;
                        if (view != null && (xVar = a0Var2.H) != null && (sVar = (s) xVar.f12035r) != null) {
                            sVar.a(view);
                        }
                        r1 r1Var = a0Var2.f11841r;
                        x xVar4 = a0Var2.H;
                        Handler handler = (Handler) r1Var.f10199d;
                        if (xVar4 != null) {
                            handler.removeCallbacks(xVar4);
                        }
                        r1 r1Var2 = a0Var2.f11841r;
                        x xVar5 = a0Var2.H;
                        if (!(xVar5 == null ? false : ((Handler) r1Var2.f10199d).postDelayed(xVar5, 100L))) {
                            a0Var2.f11838a.getLogger().m(b5.WARNING, "Failed to post the capture runnable, main looper is shutting down.", new Object[0]);
                        }
                    }
                    if (this.L.f11941a != o.PAUSED || (a0Var = this.f11831x) == null) {
                        return;
                    }
                    a0Var.i();
                }
            }
        }
    }

    public final void Z() throws InterruptedException {
        n nVar = this.L;
        io.sentry.q qVarA = this.K.a();
        try {
            if (this.F.get()) {
                o oVar = o.PAUSED;
                if (nVar.a(oVar)) {
                    a0 a0Var = this.f11831x;
                    if (a0Var != null) {
                        a0Var.i();
                    }
                    io.sentry.android.replay.capture.m mVar = this.H;
                    if (mVar != null) {
                        mVar.pause();
                    }
                    nVar.f11941a = oVar;
                    vc.e.e(qVarA, null);
                    return;
                }
            }
            vc.e.e(qVarA, null);
        } finally {
        }
    }

    @Override // io.sentry.j3
    public final void b(Boolean bool) {
        if (this.F.get() && R()) {
            io.sentry.protocol.t tVar = io.sentry.protocol.t.f12636d;
            io.sentry.android.replay.capture.m mVar = this.H;
            if (tVar.equals(mVar != null ? ((io.sentry.android.replay.capture.c) mVar).h() : null)) {
                x5 x5Var = this.f11829g;
                if (x5Var != null) {
                    x5Var.getLogger().m(b5.DEBUG, "Replay id is not set, not capturing for event", new Object[0]);
                    return;
                } else {
                    br.l.l("options");
                    throw null;
                }
            }
            io.sentry.android.replay.capture.m mVar2 = this.H;
            if (mVar2 != null) {
                mVar2.e(bool.equals(Boolean.TRUE), new as.d(22, this));
            }
            io.sentry.android.replay.capture.m mVar3 = this.H;
            this.H = mVar3 != null ? mVar3.c() : null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        io.sentry.transport.p pVarD;
        n nVar = this.L;
        io.sentry.q qVarA = this.K.a();
        try {
            if (this.F.get()) {
                o oVar = o.CLOSED;
                if (nVar.a(oVar)) {
                    x5 x5Var = this.f11829g;
                    if (x5Var == null) {
                        br.l.l("options");
                        throw null;
                    }
                    x5Var.getConnectionStatusProvider().a0(this);
                    v3 v3Var = this.f11830r;
                    if (v3Var != null && (pVarD = v3Var.d()) != null) {
                        ((CopyOnWriteArrayList) pVarD.f12779x).remove(this);
                    }
                    stop();
                    a0 a0Var = this.f11831x;
                    if (a0Var != null) {
                        a0Var.close();
                    }
                    this.f11831x = null;
                    ((q) this.D.getValue()).close();
                    ((io.sentry.android.replay.util.b) this.E.getValue()).shutdown();
                    nVar.f11941a = oVar;
                    vc.e.e(qVarA, null);
                    return;
                }
            }
            vc.e.e(qVarA, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                vc.e.e(qVarA, th2);
                throw th3;
            }
        }
    }

    @Override // io.sentry.o0
    public final void f(n0 n0Var) throws InterruptedException {
        br.l.e(n0Var, "status");
        if (this.H instanceof io.sentry.android.replay.capture.p) {
            if (n0Var == n0.DISCONNECTED) {
                Z();
            } else {
                f0();
            }
        }
    }

    public final void f0() throws InterruptedException {
        v3 v3Var;
        v3 v3Var2;
        io.sentry.transport.p pVarD;
        io.sentry.transport.p pVarD2;
        n nVar = this.L;
        io.sentry.q qVarA = this.K.a();
        try {
            if (this.F.get()) {
                o oVar = o.RESUMED;
                if (nVar.a(oVar)) {
                    if (!this.G.get()) {
                        x5 x5Var = this.f11829g;
                        if (x5Var == null) {
                            br.l.l("options");
                            throw null;
                        }
                        if (x5Var.getConnectionStatusProvider().N() != n0.DISCONNECTED && (((v3Var = this.f11830r) == null || (pVarD2 = v3Var.d()) == null || !pVarD2.f(io.sentry.m.All)) && ((v3Var2 = this.f11830r) == null || (pVarD = v3Var2.d()) == null || !pVarD.f(io.sentry.m.Replay)))) {
                            nVar.f11941a = oVar;
                            io.sentry.android.replay.capture.m mVar = this.H;
                            if (mVar != null) {
                                ((io.sentry.android.replay.capture.c) mVar).m(dr.a.q());
                            }
                            a0 a0Var = this.f11831x;
                            if (a0Var != null) {
                                a0Var.w();
                            }
                            vc.e.e(qVarA, null);
                            return;
                        }
                    }
                    vc.e.e(qVarA, null);
                    return;
                }
            }
            vc.e.e(qVarA, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                vc.e.e(qVarA, th2);
                throw th3;
            }
        }
    }

    @Override // io.sentry.j3
    public final void h() throws InterruptedException {
        this.G.set(false);
        f0();
    }

    @Override // io.sentry.j3
    public final io.sentry.protocol.t i() {
        io.sentry.protocol.t tVarH;
        io.sentry.android.replay.capture.m mVar = this.H;
        if (mVar != null && (tVarH = ((io.sentry.android.replay.capture.c) mVar).h()) != null) {
            return tVarH;
        }
        io.sentry.protocol.t tVar = io.sentry.protocol.t.f12636d;
        br.l.d(tVar, "EMPTY_ID");
        return tVar;
    }

    @Override // io.sentry.j3
    public final void pause() throws InterruptedException {
        this.G.set(true);
        Z();
    }

    @Override // io.sentry.transport.o
    public final void q(io.sentry.transport.p pVar) throws InterruptedException {
        if (this.H instanceof io.sentry.android.replay.capture.p) {
            if (pVar.f(io.sentry.m.All) || pVar.f(io.sentry.m.Replay)) {
                Z();
            } else {
                f0();
            }
        }
    }

    @Override // io.sentry.j3
    public final void stop() throws InterruptedException {
        n nVar = this.L;
        io.sentry.q qVarA = this.K.a();
        try {
            if (this.F.get()) {
                o oVar = o.STOPPED;
                if (nVar.a(oVar)) {
                    if (this.f11831x instanceof f) {
                        io.sentry.android.core.b0 b0Var = ((q) this.D.getValue()).f11945g;
                        a0 a0Var = this.f11831x;
                        br.l.c(a0Var, "null cannot be cast to non-null type io.sentry.android.replay.OnRootViewsChangedListener");
                        b0Var.remove(a0Var);
                    }
                    ((q) this.D.getValue()).f11945g.remove(this.f11832y);
                    a0 a0Var2 = this.f11831x;
                    if (a0Var2 != null) {
                        a0Var2.q();
                    }
                    a0 a0Var3 = this.f11831x;
                    if (a0Var3 != null) {
                        a0Var3.y();
                    }
                    io.sentry.android.replay.gestures.b bVar = this.f11832y;
                    if (bVar != null) {
                        bVar.a();
                    }
                    io.sentry.android.replay.capture.m mVar = this.H;
                    if (mVar != null) {
                        mVar.stop();
                    }
                    this.H = null;
                    nVar.f11941a = oVar;
                    vc.e.e(qVarA, null);
                    return;
                }
            }
            vc.e.e(qVarA, null);
        } finally {
        }
    }

    @Override // io.sentry.q1
    public final void w(x5 x5Var) {
        Double d6;
        this.f11829g = x5Var;
        if (Build.VERSION.SDK_INT < 26) {
            x5Var.getLogger().m(b5.INFO, "Session replay is only supported on API 26 and above", new Object[0]);
            return;
        }
        Double d10 = x5Var.getSessionReplay().f12074a;
        if ((d10 == null || d10.doubleValue() <= 0.0d) && ((d6 = x5Var.getSessionReplay().f12075b) == null || d6.doubleValue() <= 0.0d)) {
            x5Var.getLogger().m(b5.INFO, "Session replay is disabled, no sample rate specified", new Object[0]);
            return;
        }
        v3 v3Var = v3.f12830a;
        this.f11830r = v3Var;
        this.f11831x = new a0(x5Var, this, this, this.J, (io.sentry.android.replay.util.b) this.E.getValue());
        this.f11832y = new io.sentry.android.replay.gestures.b(x5Var, this);
        this.F.set(true);
        x5Var.getConnectionStatusProvider().Q(this);
        io.sentry.transport.p pVarD = v3Var.d();
        if (pVarD != null) {
            ((CopyOnWriteArrayList) pVarD.f12779x).add(this);
        }
        ic.a.b("Replay");
        x5 x5Var2 = this.f11829g;
        if (x5Var2 == null) {
            br.l.l("options");
            throw null;
        }
        e1 executorService = x5Var2.getExecutorService();
        br.l.d(executorService, "getExecutorService(...)");
        x5 x5Var3 = this.f11829g;
        if (x5Var3 == null) {
            br.l.l("options");
            throw null;
        }
        try {
            executorService.submit(new a5.o(new f0(24, this), 28, x5Var3));
        } catch (Throwable th2) {
            x5Var3.getLogger().g(b5.ERROR, "Failed to submit task ReplayIntegration.finalize_previous_replay to executor", th2);
        }
    }

    @Override // io.sentry.j3
    public final void y() throws InterruptedException {
        io.sentry.android.replay.capture.m gVar;
        n nVar = this.L;
        io.sentry.q qVarA = this.K.a();
        try {
            if (!this.F.get()) {
                vc.e.e(qVarA, null);
                return;
            }
            o oVar = o.STARTED;
            if (!nVar.a(oVar)) {
                x5 x5Var = this.f11829g;
                if (x5Var == null) {
                    br.l.l("options");
                    throw null;
                }
                x5Var.getLogger().m(b5.DEBUG, "Session replay is already being recorded, not starting a new one", new Object[0]);
                vc.e.e(qVarA, null);
                return;
            }
            io.sentry.util.h hVar = (io.sentry.util.h) this.B.getValue();
            x5 x5Var2 = this.f11829g;
            if (x5Var2 == null) {
                br.l.l("options");
                throw null;
            }
            Double d6 = x5Var2.getSessionReplay().f12074a;
            br.l.e(hVar, "<this>");
            boolean z10 = d6 != null && d6.doubleValue() >= hVar.c();
            if (!z10) {
                x5 x5Var3 = this.f11829g;
                if (x5Var3 == null) {
                    br.l.l("options");
                    throw null;
                }
                Double d10 = x5Var3.getSessionReplay().f12075b;
                if (!(d10 != null && d10.doubleValue() > 0.0d)) {
                    x5 x5Var4 = this.f11829g;
                    if (x5Var4 == null) {
                        br.l.l("options");
                        throw null;
                    }
                    x5Var4.getLogger().m(b5.INFO, "Session replay is not started, full session was not sampled and onErrorSampleRate is not specified", new Object[0]);
                    vc.e.e(qVarA, null);
                    return;
                }
            }
            nVar.f11941a = oVar;
            if (z10) {
                x5 x5Var5 = this.f11829g;
                if (x5Var5 == null) {
                    br.l.l("options");
                    throw null;
                }
                gVar = new io.sentry.android.replay.capture.p(x5Var5, this.f11830r, this.f11828d, (io.sentry.android.replay.util.b) this.E.getValue());
            } else {
                x5 x5Var6 = this.f11829g;
                if (x5Var6 == null) {
                    br.l.l("options");
                    throw null;
                }
                gVar = new io.sentry.android.replay.capture.g(x5Var6, this.f11830r, this.f11828d, (io.sentry.util.h) this.B.getValue(), (io.sentry.android.replay.util.b) this.E.getValue());
            }
            this.H = gVar;
            a0 a0Var = this.f11831x;
            if (a0Var != null) {
                a0Var.f11843y.getAndSet(true);
            }
            io.sentry.android.replay.capture.m mVar = this.H;
            if (mVar != null) {
                mVar.d(0, new io.sentry.protocol.t(), null);
            }
            if (this.f11831x instanceof f) {
                io.sentry.android.core.b0 b0Var = ((q) this.D.getValue()).f11945g;
                a0 a0Var2 = this.f11831x;
                br.l.c(a0Var2, "null cannot be cast to non-null type io.sentry.android.replay.OnRootViewsChangedListener");
                b0Var.add(a0Var2);
            }
            ((q) this.D.getValue()).f11945g.add(this.f11832y);
            vc.e.e(qVarA, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                vc.e.e(qVarA, th2);
                throw th3;
            }
        }
    }
}
