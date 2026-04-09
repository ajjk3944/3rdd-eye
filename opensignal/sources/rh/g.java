package rh;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.SystemClock;
import androidx.media3.common.c0;
import androidx.media3.common.e0;
import androidx.media3.common.v;
import androidx.media3.common.x;
import androidx.media3.common.y;
import androidx.media3.common.z;
import androidx.media3.exoplayer.dash.DashMediaSource;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import b5.b0;
import ch.n;
import com.opensignal.sdk.common.measurements.videotest.media3.Media3AnalyticsListener;
import com.opensignal.sdk.common.measurements.videotest.media3.Media3EventListenerImpl;
import com.opensignal.sdk.common.measurements.videotest.media3.Media3VideoListenerImpl;
import h9.r2;
import i.g0;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ThreadFactory;
import mi.d0;
import nh.l;
import o5.k0;
import o5.s0;
import oe.f0;
import oe.h0;
import oe.u0;
import oh.p;
import oh.t;
import org.json.JSONException;
import p.l2;
import sm.m;
import u5.i;

/* loaded from: classes.dex */
public final class g extends t implements Serializable {
    public final transient Object H0;
    public transient i.c I0;
    public transient ph.g J0;
    public final transient ch.f K0;
    public final l2 L0;
    public final df.c M0;
    public final cg.e N0;
    public final m O0;
    public final io.sentry.t P0;
    public final ee.f Q0;

    public g(Context context, q3.a aVar, Looper looper, ch.f fVar, r2 r2Var, l2 l2Var, df.c cVar, cg.e eVar, m mVar, df.c cVar2, io.sentry.internal.debugmeta.c cVar3, ThreadFactory threadFactory, io.sentry.t tVar, ee.f fVar2) {
        super(context, aVar, r2Var, cVar2, fVar, cVar3, threadFactory, tVar);
        this.H0 = new Object();
        this.L0 = l2Var;
        this.M0 = cVar;
        this.N0 = eVar;
        this.O0 = mVar;
        this.P0 = tVar;
        this.Q0 = fVar2;
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
            n.e("Media3VideoTest", e4);
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
                ph.g gVar = this.J0;
                if (gVar != null) {
                    gVar.sendMessage(message);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // oh.t
    public final void I(l lVar) {
        c cVar;
        c cVar2;
        String str;
        o5.a k0Var;
        if (this.L.get()) {
            return;
        }
        int i10 = f.f21537a[l(lVar).ordinal()];
        m mVar = this.O0;
        if (i10 == 1) {
            mVar.getClass();
            b5.m mVar2 = new b5.m();
            mVar2.f2460r = "exoPlayer";
            cVar = new c(new DashMediaSource.Factory(mVar2).createMediaSource(N(lVar)));
        } else {
            if (i10 != 2) {
                Context context = this.f19509s0;
                int i11 = a5.d0.f105a;
                try {
                    str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                } catch (PackageManager.NameNotFoundException unused) {
                    str = "?";
                }
                String strJ = w.g.j(c7.a.u("exoPlayer/", str, " (Linux;Android "), Build.VERSION.RELEASE, ") AndroidXMedia3/1.0.2");
                b0 b0VarO = new l5.c(context, 2).o();
                if (this.S.f7375e.contains("ADAPTIVE") && this.f19494f0.B == 3) {
                    b0VarO = new h(null, new HashMap(), 2000, a5.b.f92a, false, null);
                }
                bm.d dVar = new bm.d(context, strJ, b0VarO);
                io.sentry.android.replay.capture.e eVar = new io.sentry.android.replay.capture.e(18, new i());
                i5.c cVar3 = new i5.c();
                df.c cVar4 = new df.c();
                e0 e0VarB = e0.b(Uri.parse(lVar.f17619a));
                e0VarB.f1608d.getClass();
                o5.a s0Var = new s0(e0VarB, dVar, eVar, cVar3.c(e0VarB), cVar4, 1048576);
                if (lVar instanceof nh.a) {
                    e0 e0VarB2 = e0.b(Uri.parse(((nh.a) lVar).f17549d));
                    e0VarB2.f1608d.getClass();
                    k0Var = new k0(s0Var, new s0(e0VarB2, dVar, eVar, cVar3.c(e0VarB2), cVar4, 1048576));
                } else {
                    k0Var = s0Var;
                }
                cVar2 = new c(k0Var);
                Bundle bundle = new Bundle();
                bundle.putSerializable("media_source", cVar2);
                G(3, bundle);
            }
            mVar.getClass();
            b5.m mVar3 = new b5.m();
            mVar3.f2460r = "exoPlayer";
            cVar = new c(new HlsMediaSource.Factory(mVar3).createMediaSource(N(lVar)));
        }
        cVar2 = cVar;
        Bundle bundle2 = new Bundle();
        bundle2.putSerializable("media_source", cVar2);
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
        if (this.L.get()) {
            return;
        }
        Bundle bundle = new Bundle();
        this.N0.getClass();
        bundle.putSerializable("event_listener", new Media3EventListenerImpl(this));
        this.M0.getClass();
        bundle.putSerializable("video_listener", new Media3VideoListenerImpl(this));
        dh.f fVar = this.S;
        String str = fVar.f7375e;
        boolean z10 = fVar.f7381m;
        if (str.contains("ADAPTIVE") || z10) {
            bundle.putSerializable("analytics_listener", new Media3AnalyticsListener(this));
        }
        G(1, bundle);
    }

    public final e0 N(l lVar) {
        v vVar = new v();
        f0 f0Var = h0.f19336d;
        u0 u0Var = u0.f19383x;
        List list = Collections.EMPTY_LIST;
        u0 u0Var2 = u0.f19383x;
        y yVar = new y();
        c0 c0Var = c0.f1577g;
        Uri uri = Uri.parse(lVar.f17619a);
        if (this.S.f7375e.contains("LIVE")) {
            ak.a aVar = this.f19494f0;
            long j = aVar.N;
            yVar = new z(aVar.L, aVar.M, j, aVar.P, aVar.Q).a();
        }
        return new e0("", new x(vVar), uri != null ? new androidx.media3.common.b0(uri, null, null, list, u0Var2) : null, yVar.a(), androidx.media3.common.g0.f1655e0, c0Var);
    }

    @Override // oh.t
    public final Point i(Context context) {
        return a5.d0.p(context);
    }

    @Override // oh.t
    public final String k() {
        return "MEDIA3-PLAYER-API";
    }

    @Override // oh.t
    public final void m(l lVar) {
        if (this.L.get()) {
            return;
        }
        synchronized (this.H0) {
            this.J0 = new ph.g(this.f19509s0, Looper.getMainLooper(), this.f19508r0, this.f19511u0, this.Q0, 1);
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
    public final boolean p(l lVar) {
        nh.d dVarL = l(lVar);
        Object obj = this.L0.f20100d;
        int i10 = dVarL == null ? -1 : d.f21535a[dVarL.ordinal()];
        if (i10 == 1) {
            return b9.c.l(ej.c.MEDIA3_DASH);
        }
        if (i10 != 2) {
            return true;
        }
        return b9.c.l(ej.c.MEDIA3_HLS);
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
