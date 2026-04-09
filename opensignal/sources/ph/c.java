package ph;

import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.SystemClock;
import ch.n;
import com.google.android.exoplayer2.k0;
import com.google.android.exoplayer2.l0;
import com.google.android.exoplayer2.m0;
import com.google.android.exoplayer2.p0;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.opensignal.sdk.common.measurements.videotest.exoplayer.ExoPlayerAnalyticsListener;
import com.opensignal.sdk.common.measurements.videotest.exoplayer.ExoPlayerEventListener216Impl;
import com.opensignal.sdk.common.measurements.videotest.exoplayer.ExoPlayerEventListenerImpl;
import com.opensignal.sdk.common.measurements.videotest.exoplayer.ExoPlayerVideoListener214Impl;
import com.opensignal.sdk.common.measurements.videotest.exoplayer.ExoPlayerVideoListenerImpl;
import h9.r2;
import i.g0;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadFactory;
import mi.d0;
import oe.z0;
import oh.p;
import oh.t;
import org.json.JSONException;
import pb.r;
import pb.u0;
import qb.v;
import sm.m;
import ya.n0;
import ya.o0;
import ya.x;

/* loaded from: classes.dex */
public final class c extends t implements Serializable {
    public final transient Object H0;
    public transient i.c I0;
    public transient g J0;
    public final transient ch.f K0;
    public final p L0;
    public final m M0;
    public final sm.f N0;
    public final io.sentry.hints.i O0;
    public final io.sentry.t P0;
    public final j Q0;

    public c(Context context, q3.a aVar, Looper looper, ch.f fVar, r2 r2Var, p pVar, m mVar, sm.f fVar2, io.sentry.hints.i iVar, df.c cVar, io.sentry.internal.debugmeta.c cVar2, ThreadFactory threadFactory, io.sentry.t tVar, j jVar) {
        super(context, aVar, r2Var, cVar, fVar, cVar2, threadFactory, tVar);
        this.H0 = new Object();
        this.L0 = pVar;
        this.M0 = mVar;
        this.N0 = fVar2;
        this.O0 = iVar;
        this.P0 = tVar;
        this.Q0 = jVar;
        if (looper == null) {
            if (this.f19504o0 == null) {
                M();
            }
            this.f19504o0.getLooper();
        }
        this.K0 = fVar;
    }

    @Override // oh.t
    public final void C() throws JSONException {
        if (this.L.get()) {
            return;
        }
        n.b("VideoTest", "prepareFirstFrameTime() called");
        if (this.F <= 0) {
            this.F = SystemClock.uptimeMillis();
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putBoolean("play_when_ready_value", true);
            G(6, bundle);
            A();
            J();
        } catch (IllegalStateException e4) {
            n.e("ExoPlayerVideoTest", e4);
            d0 d0Var = this.M;
            if (d0Var != null) {
                d0Var.r(e4, null);
            }
            G(10, null);
            w(e4.toString());
            r();
        }
    }

    @Override // oh.t
    public final void E(p pVar) {
        this.A0 = pVar;
        G(9, null);
    }

    @Override // oh.t
    public final void F(g0 g0Var) {
        this.f19518z0 = g0Var;
        G(8, null);
    }

    @Override // oh.t
    public final void H(Message message) {
        synchronized (this.H0) {
            try {
                g gVar = this.J0;
                if (gVar != null) {
                    gVar.sendMessage(message);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // oh.t
    public final void I(nh.l lVar) throws ClassNotFoundException {
        pb.t tVar;
        f fVar;
        f fVar2;
        pb.t tVar2;
        ya.a g0Var;
        if (this.L.get()) {
            return;
        }
        int i10 = b.f20558a[l(lVar).ordinal()];
        io.sentry.hints.i iVar = this.O0;
        if (i10 == 1) {
            iVar.getClass();
            if (p.z() < 2016000) {
                tVar = new pb.t(1);
            } else {
                tVar = new pb.t(0);
                tVar.f20427g = "exoPlayer";
            }
            fVar = new f(new DashMediaSource.Factory(tVar).m8createMediaSource(O(lVar)));
        } else {
            if (i10 != 2) {
                this.L0.getClass();
                int iZ = p.z();
                Context context = this.f19509s0;
                if (iZ < 2017000) {
                    n0 n0Var = new n0(new io.sentry.k(context, v.y(context), (u0) N()), new ca.i());
                    x xVarA = n0Var.a(Uri.parse(lVar.f17619a));
                    if (lVar instanceof nh.a) {
                        xVarA = new ya.g0(xVarA, n0Var.a(Uri.parse(((nh.a) lVar).f17549d)));
                    }
                    fVar2 = new f((ya.a) xVarA);
                } else {
                    io.sentry.k kVar = new io.sentry.k(context, v.y(context), (u0) N());
                    s9.g gVar = new s9.g(8, new ca.i());
                    ba.a aVar = new ba.a();
                    m mVar = new m();
                    com.google.android.exoplayer2.n0 n0VarB = com.google.android.exoplayer2.n0.b(Uri.parse(lVar.f17619a));
                    n0VarB.f4336b.getClass();
                    ya.a o0Var = new o0(n0VarB, kVar, gVar, aVar.a(n0VarB), mVar, 1048576);
                    if (lVar instanceof nh.a) {
                        com.google.android.exoplayer2.n0 n0VarB2 = com.google.android.exoplayer2.n0.b(Uri.parse(((nh.a) lVar).f17549d));
                        n0VarB2.f4336b.getClass();
                        g0Var = new ya.g0(o0Var, new o0(n0VarB2, kVar, gVar, aVar.a(n0VarB2), mVar, 1048576));
                    } else {
                        g0Var = o0Var;
                    }
                    fVar2 = new f(g0Var);
                }
                Bundle bundle = new Bundle();
                bundle.putSerializable("media_source", fVar2);
                G(3, bundle);
            }
            iVar.getClass();
            if (p.z() < 2016000) {
                tVar2 = new pb.t(1);
            } else {
                tVar2 = new pb.t(0);
                tVar2.f20427g = "exoPlayer";
            }
            fVar = new f(new HlsMediaSource.Factory(tVar2).m16createMediaSource(O(lVar)));
        }
        fVar2 = fVar;
        Bundle bundle2 = new Bundle();
        bundle2.putSerializable("media_source", fVar2);
        G(3, bundle2);
    }

    @Override // oh.t
    public final void K() {
        Bundle bundle = new Bundle();
        bundle.putFloat("volume_value", 0.0f);
        G(7, bundle);
    }

    @Override // oh.t
    public final void L() {
        Serializable exoPlayerVideoListener214Impl;
        if (this.L.get()) {
            return;
        }
        Bundle bundle = new Bundle();
        this.N0.getClass();
        bundle.putSerializable("event_listener", p.z() < 2016000 ? new ExoPlayerEventListenerImpl(this) : new ExoPlayerEventListener216Impl(this));
        this.M0.getClass();
        if (p.z() < 2014000) {
            n.b("ExoPlayerVideoListenerFactory", "Using ExoPlayerVideoListenerImpl");
            exoPlayerVideoListener214Impl = new ExoPlayerVideoListenerImpl(this);
        } else {
            n.b("ExoPlayerVideoListenerFactory", "Using ExoPlayerVideoListener216Impl");
            exoPlayerVideoListener214Impl = new ExoPlayerVideoListener214Impl(this);
        }
        bundle.putSerializable("video_listener", exoPlayerVideoListener214Impl);
        dh.f fVar = this.S;
        String str = fVar.f7375e;
        boolean z10 = fVar.f7381m;
        if (str.contains("ADAPTIVE") || z10) {
            bundle.putSerializable("analytics_listener", new ExoPlayerAnalyticsListener(this));
        }
        G(1, bundle);
    }

    public final pb.g N() throws ClassNotFoundException {
        this.L0.getClass();
        int iZ = p.z();
        et.d dVar = qb.a.f20757q;
        r rVar = iZ < 2019000 ? new r(null, z0.B, 2000, dVar, false) : new l5.c(this.f19509s0, 1).n();
        return (this.S.f7375e.contains("ADAPTIVE") && this.f19494f0.B == 3) ? new l(null, new HashMap(), 2000, dVar, false, null) : rVar;
    }

    public final com.google.android.exoplayer2.n0 O(nh.l lVar) {
        long j;
        long j7;
        long j10;
        float f10;
        float f11;
        List list = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        Uri uri = Uri.parse(lVar.f17619a);
        if (this.S.f7375e.contains("LIVE")) {
            ak.a aVar = this.f19494f0;
            long j11 = aVar.N;
            long j12 = aVar.M;
            long j13 = aVar.L;
            float f12 = aVar.Q;
            f10 = aVar.P;
            j7 = j11;
            f11 = f12;
            j10 = j13;
            j = j12;
        } else {
            j = -9223372036854775807L;
            j7 = -9223372036854775807L;
            j10 = -9223372036854775807L;
            f10 = -3.4028235E38f;
            f11 = -3.4028235E38f;
        }
        return new com.google.android.exoplayer2.n0("", new k0(Long.MIN_VALUE), uri != null ? new m0(uri, null, null, null, list, list, null) : null, new l0(j10, j, j7, f10, f11), p0.f4365s);
    }

    @Override // oh.t
    public final Point i(Context context) {
        return v.q(context);
    }

    @Override // oh.t
    public final String k() {
        return "EXO-PLAYER-API";
    }

    @Override // oh.t
    public final void m(nh.l lVar) {
        n.b("ExoPlayerVideoTest", "initialisePlayer() called with: videoResource = [" + lVar + "]");
        if (this.L.get()) {
            return;
        }
        synchronized (this.H0) {
            this.J0 = new g(this.f19509s0, Looper.getMainLooper(), this.f19508r0, this.f19511u0, this.Q0, 0);
            HandlerThread handlerThreadL = this.P0.l("PLAYER-THREAD");
            handlerThreadL.start();
            this.I0 = new i.c(2, handlerThreadL.getLooper(), this);
            this.D0 = new Messenger(this.I0);
        }
        int[] iArr = this.f19493e0;
        Serializable serializable = this.f19494f0;
        Bundle bundle = new Bundle();
        bundle.putIntArray("buffer_array", iArr);
        if (this.S.f7375e.contains("ADAPTIVE")) {
            bundle.putSerializable("adaptive_configuration", serializable);
            if (this.f19494f0.B == 3) {
                oh.e eVarB = oh.e.b(this.f19509s0, this.K0);
                eVarB.f19455a = this.f19508r0;
                bundle.putSerializable("network_type_observer", eVarB);
            }
        }
        bundle.putSerializable("video_resource", lVar);
        G(0, bundle);
    }

    @Override // oh.t
    public final void n() throws JSONException {
        G(10, null);
        t();
        r();
    }

    @Override // oh.t
    public final void o(int i10) throws JSONException {
        G(10, null);
        this.f19489b0 = i10;
        t();
        r();
    }

    @Override // oh.t
    public final boolean p(nh.l lVar) {
        nh.d dVarL = l(lVar);
        Object obj = this.L0.f19481d;
        int i10 = dVarL == null ? -1 : a.f20557a[dVarL.ordinal()];
        if (i10 == 1) {
            return b9.c.l(ej.b.EXOPLAYER_DASH);
        }
        if (i10 != 2) {
            return true;
        }
        return b9.c.l(ej.b.EXOPLAYER_HLS_MEDIA_SOURCE);
    }

    @Override // oh.t
    public final void r() throws JSONException {
        this.C0 = false;
        G(11, null);
        x();
        this.A0 = null;
        this.f19518z0 = null;
        this.B0 = null;
        synchronized (this.H0) {
            this.J0 = null;
            this.D0 = null;
            this.I0 = null;
        }
    }

    @Override // oh.t
    public final void u(oh.b bVar, boolean z10) {
        super.u(bVar, z10);
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_playing", z10);
        G(12, bundle);
    }
}
