package com.monetization.ads.mediation.appopenad;

import android.content.Context;
import com.monetization.ads.mediation.appopenad.MediatedAppOpenAdAdapter;
import com.yandex.mobile.ads.impl.mx0;
import java.util.Map;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class c implements mx0<MediatedAppOpenAdAdapter, MediatedAppOpenAdAdapter.MediatedAppOpenAdAdapterListener> {

    /* renamed from: a, reason: collision with root package name */
    private MediatedAppOpenAdAdapter f23678a;

    @Override // com.yandex.mobile.ads.impl.mx0
    public final void a(com.monetization.ads.mediation.base.a aVar) {
        MediatedAppOpenAdAdapter mediatedAdapter = (MediatedAppOpenAdAdapter) aVar;
        l.f(mediatedAdapter, "mediatedAdapter");
        mediatedAdapter.onInvalidate();
    }

    @Override // com.yandex.mobile.ads.impl.mx0
    public final void a(Context context, com.monetization.ads.mediation.base.a aVar, Object obj, Map localExtras, Map serverExtras) {
        MediatedAppOpenAdAdapter mediatedAdapter = (MediatedAppOpenAdAdapter) aVar;
        MediatedAppOpenAdAdapter.MediatedAppOpenAdAdapterListener mediatedAdapterListener = (MediatedAppOpenAdAdapter.MediatedAppOpenAdAdapterListener) obj;
        l.f(context, "context");
        l.f(mediatedAdapter, "mediatedAdapter");
        l.f(mediatedAdapterListener, "mediatedAdapterListener");
        l.f(localExtras, "localExtras");
        l.f(serverExtras, "serverExtras");
        this.f23678a = mediatedAdapter;
        mediatedAdapter.loadAppOpenAd(context, mediatedAdapterListener, localExtras, serverExtras);
    }

    public final MediatedAppOpenAdAdapter a() {
        return this.f23678a;
    }
}
