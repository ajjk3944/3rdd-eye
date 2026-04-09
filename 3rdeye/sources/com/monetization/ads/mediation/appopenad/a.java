package com.monetization.ads.mediation.appopenad;

import c9.C2100u;
import com.monetization.ads.mediation.appopenad.MediatedAppOpenAdAdapter;
import com.monetization.ads.mediation.base.MediatedAdRequestError;
import com.yandex.mobile.ads.impl.C4128i3;
import com.yandex.mobile.ads.impl.bk0;
import com.yandex.mobile.ads.impl.dd0;
import com.yandex.mobile.ads.impl.fx0;
import com.yandex.mobile.ads.impl.td0;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class a<T extends td0<T>> implements MediatedAppOpenAdAdapter.MediatedAppOpenAdAdapterListener {

    /* renamed from: a, reason: collision with root package name */
    private final fx0<MediatedAppOpenAdAdapter, MediatedAppOpenAdAdapter.MediatedAppOpenAdAdapterListener> f23670a;

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference<dd0<T>> f23671b;

    /* renamed from: c, reason: collision with root package name */
    private WeakReference<td0<T>> f23672c;

    /* renamed from: d, reason: collision with root package name */
    private final bk0 f23673d;

    public a(dd0<T> loadController, fx0<MediatedAppOpenAdAdapter, MediatedAppOpenAdAdapter.MediatedAppOpenAdAdapterListener> mediatedAdController) {
        l.f(loadController, "loadController");
        l.f(mediatedAdController, "mediatedAdController");
        this.f23670a = mediatedAdController;
        this.f23671b = new WeakReference<>(loadController);
        this.f23672c = new WeakReference<>(null);
        this.f23673d = new bk0(mediatedAdController);
    }

    public final void a(td0<T> controller) {
        l.f(controller, "controller");
        this.f23672c = new WeakReference<>(controller);
    }

    @Override // com.monetization.ads.mediation.appopenad.MediatedAppOpenAdAdapter.MediatedAppOpenAdAdapterListener
    public final void onAdImpression() {
        td0<T> td0Var;
        if (this.f23670a.b() || (td0Var = this.f23672c.get()) == null) {
            return;
        }
        this.f23670a.b(td0Var.e(), C2100u.f18582b);
        td0Var.a(this.f23673d.a());
    }

    @Override // com.monetization.ads.mediation.appopenad.MediatedAppOpenAdAdapter.MediatedAppOpenAdAdapterListener
    public final void onAppOpenAdClicked() {
        td0<T> td0Var = this.f23672c.get();
        if (td0Var != null) {
            this.f23670a.a(td0Var.e(), C2100u.f18582b);
        }
    }

    @Override // com.monetization.ads.mediation.appopenad.MediatedAppOpenAdAdapter.MediatedAppOpenAdAdapterListener
    public final void onAppOpenAdDismissed() {
        td0<T> td0Var = this.f23672c.get();
        if (td0Var != null) {
            td0Var.p();
        }
    }

    @Override // com.monetization.ads.mediation.appopenad.MediatedAppOpenAdAdapter.MediatedAppOpenAdAdapterListener
    public final void onAppOpenAdFailedToLoad(MediatedAdRequestError error) {
        l.f(error, "error");
        dd0<T> dd0Var = this.f23671b.get();
        if (dd0Var != null) {
            this.f23670a.b(dd0Var.l(), new C4128i3(error.getCode(), error.getDescription(), error.getDescription(), null), this);
        }
    }

    @Override // com.monetization.ads.mediation.appopenad.MediatedAppOpenAdAdapter.MediatedAppOpenAdAdapterListener
    public final void onAppOpenAdLeftApplication() {
        td0<T> td0Var = this.f23672c.get();
        if (td0Var != null) {
            td0Var.onLeftApplication();
        }
    }

    @Override // com.monetization.ads.mediation.appopenad.MediatedAppOpenAdAdapter.MediatedAppOpenAdAdapterListener
    public final void onAppOpenAdLoaded() {
        dd0<T> dd0Var = this.f23671b.get();
        if (dd0Var != null) {
            this.f23670a.c(dd0Var.l(), C2100u.f18582b);
            dd0Var.u();
        }
    }

    @Override // com.monetization.ads.mediation.appopenad.MediatedAppOpenAdAdapter.MediatedAppOpenAdAdapterListener
    public final void onAppOpenAdShown() {
        td0<T> td0Var;
        td0<T> td0Var2 = this.f23672c.get();
        if (td0Var2 != null) {
            td0Var2.q();
            this.f23670a.c(td0Var2.e());
        }
        if (!this.f23670a.b() || (td0Var = this.f23672c.get()) == null) {
            return;
        }
        this.f23670a.b(td0Var.e(), C2100u.f18582b);
        td0Var.a(this.f23673d.a());
    }
}
