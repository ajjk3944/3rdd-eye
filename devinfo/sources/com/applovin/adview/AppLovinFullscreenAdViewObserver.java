package com.applovin.adview;

import androidx.lifecycle.n0;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import androidx.lifecycle.z;
import com.applovin.impl.n2;
import com.applovin.impl.w1;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class AppLovinFullscreenAdViewObserver implements z {

    /* renamed from: a, reason: collision with root package name */
    private final t f3535a;

    /* renamed from: b, reason: collision with root package name */
    private n2 f3536b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f3537c = new AtomicBoolean(true);

    /* renamed from: d, reason: collision with root package name */
    private w1 f3538d;

    public AppLovinFullscreenAdViewObserver(t tVar, n2 n2Var) {
        this.f3535a = tVar;
        this.f3536b = n2Var;
        tVar.a(this);
    }

    @n0(r.ON_DESTROY)
    public void onDestroy() {
        this.f3535a.b(this);
        n2 n2Var = this.f3536b;
        if (n2Var != null) {
            n2Var.a();
            this.f3536b = null;
        }
        w1 w1Var = this.f3538d;
        if (w1Var != null) {
            w1Var.a("lifecycle_on_destroy");
            this.f3538d.r();
            this.f3538d = null;
        }
    }

    @n0(r.ON_PAUSE)
    public void onPause() {
        w1 w1Var = this.f3538d;
        if (w1Var != null) {
            w1Var.s();
            this.f3538d.v();
        }
    }

    @n0(r.ON_RESUME)
    public void onResume() {
        w1 w1Var;
        if (this.f3537c.getAndSet(false) || (w1Var = this.f3538d) == null) {
            return;
        }
        w1Var.t();
        this.f3538d.b(0L);
    }

    @n0(r.ON_STOP)
    public void onStop() {
        w1 w1Var = this.f3538d;
        if (w1Var != null) {
            w1Var.u();
        }
    }

    public void setPresenter(w1 w1Var) {
        this.f3538d = w1Var;
    }
}
