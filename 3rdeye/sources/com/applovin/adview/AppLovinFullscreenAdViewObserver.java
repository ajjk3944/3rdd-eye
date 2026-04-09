package com.applovin.adview;

import androidx.lifecycle.AbstractC1781n;
import androidx.lifecycle.G;
import androidx.lifecycle.InterfaceC1789w;
import com.applovin.impl.h2;
import com.applovin.impl.r1;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class AppLovinFullscreenAdViewObserver implements InterfaceC1789w {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC1781n f18761a;

    /* renamed from: b, reason: collision with root package name */
    private h2 f18762b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f18763c = new AtomicBoolean(true);

    /* renamed from: d, reason: collision with root package name */
    private r1 f18764d;

    public AppLovinFullscreenAdViewObserver(AbstractC1781n abstractC1781n, h2 h2Var) {
        this.f18761a = abstractC1781n;
        this.f18762b = h2Var;
        abstractC1781n.addObserver(this);
    }

    @G(AbstractC1781n.a.ON_DESTROY)
    public void onDestroy() {
        this.f18761a.removeObserver(this);
        h2 h2Var = this.f18762b;
        if (h2Var != null) {
            h2Var.a();
            this.f18762b = null;
        }
        r1 r1Var = this.f18764d;
        if (r1Var != null) {
            r1Var.a("lifecycle_on_destroy");
            this.f18764d.s();
            this.f18764d = null;
        }
    }

    @G(AbstractC1781n.a.ON_PAUSE)
    public void onPause() {
        r1 r1Var = this.f18764d;
        if (r1Var != null) {
            r1Var.t();
            this.f18764d.w();
        }
    }

    @G(AbstractC1781n.a.ON_RESUME)
    public void onResume() {
        r1 r1Var;
        if (this.f18763c.getAndSet(false) || (r1Var = this.f18764d) == null) {
            return;
        }
        r1Var.u();
        this.f18764d.b(0L);
    }

    @G(AbstractC1781n.a.ON_STOP)
    public void onStop() {
        r1 r1Var = this.f18764d;
        if (r1Var != null) {
            r1Var.v();
        }
    }

    public void setPresenter(r1 r1Var) {
        this.f18764d = r1Var;
    }
}
