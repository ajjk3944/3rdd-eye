package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ub0 {

    /* renamed from: a, reason: collision with root package name */
    public final hq0 f17139a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f17140b;

    /* renamed from: c, reason: collision with root package name */
    public final wc0 f17141c;

    /* renamed from: d, reason: collision with root package name */
    public final lc0 f17142d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f17143e;

    /* renamed from: f, reason: collision with root package name */
    public final qd0 f17144f;
    public final ct0 g;

    /* renamed from: h, reason: collision with root package name */
    public final lh0 f17145h;

    /* renamed from: i, reason: collision with root package name */
    public final od0 f17146i;
    public final be0 j;

    public ub0(hq0 hq0Var, Executor executor, wc0 wc0Var, Context context, qd0 qd0Var, ct0 ct0Var, lh0 lh0Var, lc0 lc0Var, od0 od0Var, be0 be0Var) {
        this.f17139a = hq0Var;
        this.f17140b = executor;
        this.f17141c = wc0Var;
        this.f17143e = context;
        this.f17144f = qd0Var;
        this.g = ct0Var;
        this.f17145h = lh0Var;
        this.f17142d = lc0Var;
        this.f17146i = od0Var;
        this.j = be0Var;
    }

    public static final void b(qz qzVar) {
        qzVar.Z("/videoClicked", no.f14365d);
        i00 i00VarX = qzVar.X();
        synchronized (i00VarX.f12084d) {
            i00VarX.f12096r = true;
        }
        qzVar.Z("/getNativeAdViewSignals", no.f14373n);
        qzVar.Z("/getNativeClickMeta", no.f14374o);
    }

    public final void a(qz qzVar, ua.a aVar, uv uvVar) {
        be0 be0Var;
        b(qzVar);
        qzVar.Z("/video", no.g);
        qzVar.Z("/videoMeta", no.f14368h);
        qzVar.Z("/precache", new io(26));
        qzVar.Z("/delayPageLoaded", no.f14370k);
        qzVar.Z("/instrument", no.f14369i);
        qzVar.Z("/log", no.f14364c);
        qzVar.Z("/click", new lo(0, null, null));
        if (this.f17139a.f11942b != null) {
            i00 i00VarX = qzVar.X();
            synchronized (i00VarX.f12084d) {
                i00VarX.f12098t = true;
            }
            qzVar.Z("/open", new uo(true != ((Boolean) va.s.f36163e.f36166c.a(sk.Ve)).booleanValue() ? null : aVar, null, null, null, null, null));
        } else {
            qzVar.X().g(false);
        }
        if (ua.j.C.f35281y.a(qzVar.getContext())) {
            HashMap map = new HashMap();
            if (qzVar.s() != null) {
                map = qzVar.s().f18115w0;
            }
            qzVar.Z("/logScionEvent", new lo(1, qzVar.getContext(), map));
        }
        pk pkVar = sk.Ve;
        va.s sVar = va.s.f36163e;
        if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue()) {
            qzVar.X().f12101w = aVar;
            qzVar.X().f12103y = uvVar;
        }
        if (!((Boolean) sVar.f36166c.a(sk.G8)).booleanValue() || (be0Var = this.j) == null) {
            return;
        }
        qzVar.Z("/onDeviceStorageEvent", new co(3, be0Var));
    }
}
