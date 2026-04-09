package com.google.android.gms.internal.ads;

import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class xz0 implements g01 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f18591a;

    /* renamed from: b, reason: collision with root package name */
    public final zc f18592b;

    /* renamed from: c, reason: collision with root package name */
    public final f21 f18593c;

    /* renamed from: d, reason: collision with root package name */
    public final long f18594d;

    public xz0(zc zcVar, Map map, sx0 sx0Var, g21 g21Var) {
        this.f18591a = map;
        this.f18592b = zcVar;
        this.f18593c = g21Var.a(AppLovinMediationAdapter.ERROR_CHILD_USER);
        this.f18594d = sx0Var.N();
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        md mdVar;
        try {
            try {
                this.f18593c.a();
                vd.b bVar = (vd.b) this.f18591a.get("gs");
                if (bVar != null && (mdVar = (md) bVar.get(this.f18594d, TimeUnit.MILLISECONDS)) != null) {
                    zc zcVar = this.f18592b;
                    synchronized (zcVar) {
                        td tdVarA0 = mdVar.A0();
                        zcVar.b();
                        ((md) zcVar.f14755b).o0(tdVarA0);
                        long jX0 = mdVar.x0();
                        zcVar.b();
                        ((md) zcVar.f14755b).X(jX0);
                    }
                }
            } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException e2) {
                this.f18593c.b(e2);
            }
            this.f18593c.c();
            return null;
        } catch (Throwable th2) {
            this.f18593c.c();
            throw th2;
        }
    }
}
