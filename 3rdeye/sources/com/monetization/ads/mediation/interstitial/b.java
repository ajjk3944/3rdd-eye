package com.monetization.ads.mediation.interstitial;

import android.content.Context;
import com.monetization.ads.mediation.interstitial.MediatedInterstitialAdapter;
import com.yandex.mobile.ads.impl.mx0;
import java.util.Map;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class b implements mx0<MediatedInterstitialAdapter, MediatedInterstitialAdapter.MediatedInterstitialAdapterListener> {

    /* renamed from: a, reason: collision with root package name */
    private MediatedInterstitialAdapter f23720a;

    @Override // com.yandex.mobile.ads.impl.mx0
    public final void a(com.monetization.ads.mediation.base.a aVar) {
        MediatedInterstitialAdapter mediatedAdapter = (MediatedInterstitialAdapter) aVar;
        l.f(mediatedAdapter, "mediatedAdapter");
        mediatedAdapter.onInvalidate();
    }

    @Override // com.yandex.mobile.ads.impl.mx0
    public final void a(Context context, com.monetization.ads.mediation.base.a aVar, Object obj, Map localExtras, Map serverExtras) {
        MediatedInterstitialAdapter mediatedAdapter = (MediatedInterstitialAdapter) aVar;
        MediatedInterstitialAdapter.MediatedInterstitialAdapterListener mediatedAdapterListener = (MediatedInterstitialAdapter.MediatedInterstitialAdapterListener) obj;
        l.f(context, "context");
        l.f(mediatedAdapter, "mediatedAdapter");
        l.f(mediatedAdapterListener, "mediatedAdapterListener");
        l.f(localExtras, "localExtras");
        l.f(serverExtras, "serverExtras");
        this.f23720a = mediatedAdapter;
        mediatedAdapter.loadInterstitial(context, mediatedAdapterListener, localExtras, serverExtras);
    }

    public final MediatedInterstitialAdapter a() {
        return this.f23720a;
    }
}
