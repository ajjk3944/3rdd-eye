package com.monetization.ads.mediation.appopenad;

import android.app.Activity;
import android.content.Context;
import b9.C1992A;
import b9.m;
import b9.n;
import c9.C2077A;
import com.monetization.ads.mediation.appopenad.MediatedAppOpenAdAdapter;
import com.yandex.mobile.ads.impl.a8;
import com.yandex.mobile.ads.impl.ex0;
import com.yandex.mobile.ads.impl.fp0;
import com.yandex.mobile.ads.impl.fx0;
import com.yandex.mobile.ads.impl.td0;
import com.yandex.mobile.ads.impl.ux0;
import com.yandex.mobile.ads.impl.wc0;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class b<T extends td0<T>> implements wc0<T> {

    /* renamed from: a, reason: collision with root package name */
    private final fx0<MediatedAppOpenAdAdapter, MediatedAppOpenAdAdapter.MediatedAppOpenAdAdapterListener> f23674a;

    /* renamed from: b, reason: collision with root package name */
    private final c f23675b;

    /* renamed from: c, reason: collision with root package name */
    private final a<T> f23676c;

    /* renamed from: d, reason: collision with root package name */
    private final ux0 f23677d;

    public b(fx0<MediatedAppOpenAdAdapter, MediatedAppOpenAdAdapter.MediatedAppOpenAdAdapterListener> mediatedAdController, c mediatedAppOpenAdLoader, a<T> mediatedAppOpenAdAdapterListener, ux0 mediatedAdapterReporter) {
        l.f(mediatedAdController, "mediatedAdController");
        l.f(mediatedAppOpenAdLoader, "mediatedAppOpenAdLoader");
        l.f(mediatedAppOpenAdAdapterListener, "mediatedAppOpenAdAdapterListener");
        l.f(mediatedAdapterReporter, "mediatedAdapterReporter");
        this.f23674a = mediatedAdController;
        this.f23675b = mediatedAppOpenAdLoader;
        this.f23676c = mediatedAppOpenAdAdapterListener;
        this.f23677d = mediatedAdapterReporter;
    }

    @Override // com.yandex.mobile.ads.impl.wc0
    public final void a(Context context, a8<String> adResponse) {
        l.f(context, "context");
        l.f(adResponse, "adResponse");
        this.f23674a.a(context, (Context) this.f23676c);
    }

    @Override // com.yandex.mobile.ads.impl.wc0
    public final String getAdInfo() {
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.wc0
    public final Object a(T contentController, Activity activity) {
        Object objA;
        ex0<T> ex0VarA;
        l.f(contentController, "contentController");
        l.f(activity, "activity");
        try {
            MediatedAppOpenAdAdapter mediatedAppOpenAdAdapterA = this.f23675b.a();
            if (mediatedAppOpenAdAdapterA != null) {
                this.f23676c.a(contentController);
                mediatedAppOpenAdAdapterA.showAppOpenAd(activity);
            }
            objA = C1992A.f18074a;
        } catch (Throwable th) {
            objA = n.a(th);
        }
        Throwable thA = m.a(objA);
        if (thA != null && (ex0VarA = this.f23674a.a()) != 0) {
            Context applicationContext = activity.getApplicationContext();
            l.e(applicationContext, "getApplicationContext(...)");
            fp0.c(new Object[0]);
            this.f23677d.a(applicationContext, ex0VarA.c(), C2077A.m(new b9.l("reason", C2077A.m(new b9.l("exception_in_adapter", thA.toString())))), ex0VarA.a().b().getNetworkName());
        }
        return objA;
    }

    @Override // com.yandex.mobile.ads.impl.wc0
    public final void a(Context context) {
        l.f(context, "context");
        this.f23674a.a(context);
    }
}
