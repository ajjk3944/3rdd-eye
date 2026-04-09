package com.applovin.adview;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.m;
import com.applovin.impl.n2;
import com.applovin.impl.w1;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class AppLovinFullscreenAdViewObserver implements m {

    /* renamed from: a, reason: collision with root package name */
    private final Lifecycle f5322a;

    /* renamed from: b, reason: collision with root package name */
    private n2 f5323b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f5324c = new AtomicBoolean(true);

    /* renamed from: d, reason: collision with root package name */
    private w1 f5325d;

    public AppLovinFullscreenAdViewObserver(Lifecycle lifecycle, n2 n2Var) {
        this.f5322a = lifecycle;
        this.f5323b = n2Var;
        lifecycle.a(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        this.f5322a.d(this);
        n2 n2Var = this.f5323b;
        if (n2Var != null) {
            n2Var.a();
            this.f5323b = null;
        }
        w1 w1Var = this.f5325d;
        if (w1Var != null) {
            w1Var.a("lifecycle_on_destroy");
            this.f5325d.r();
            this.f5325d = null;
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        w1 w1Var = this.f5325d;
        if (w1Var != null) {
            w1Var.s();
            this.f5325d.v();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        w1 w1Var;
        if (this.f5324c.getAndSet(false) || (w1Var = this.f5325d) == null) {
            return;
        }
        w1Var.t();
        this.f5325d.b(0L);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
        w1 w1Var = this.f5325d;
        if (w1Var != null) {
            w1Var.u();
        }
    }

    public void setPresenter(w1 w1Var) {
        this.f5325d = w1Var;
    }
}
