package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.mediation.rewarded.MediatedRewardedAdapter;
import com.monetization.ads.mediation.rewarded.MediatedRewardedAdapterListener;
import java.util.Map;

/* loaded from: classes3.dex */
public final class py0 implements mx0<MediatedRewardedAdapter, MediatedRewardedAdapterListener> {

    /* renamed from: a, reason: collision with root package name */
    private MediatedRewardedAdapter f31949a;

    public final MediatedRewardedAdapter a() {
        return this.f31949a;
    }

    @Override // com.yandex.mobile.ads.impl.mx0
    public final void a(com.monetization.ads.mediation.base.a aVar) {
        MediatedRewardedAdapter mediatedAdapter = (MediatedRewardedAdapter) aVar;
        kotlin.jvm.internal.l.f(mediatedAdapter, "mediatedAdapter");
        mediatedAdapter.onInvalidate();
    }

    @Override // com.yandex.mobile.ads.impl.mx0
    public final void a(Context context, com.monetization.ads.mediation.base.a aVar, Object obj, Map localExtras, Map serverExtras) {
        MediatedRewardedAdapter mediatedAdapter = (MediatedRewardedAdapter) aVar;
        MediatedRewardedAdapterListener mediatedAdapterListener = (MediatedRewardedAdapterListener) obj;
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(mediatedAdapter, "mediatedAdapter");
        kotlin.jvm.internal.l.f(mediatedAdapterListener, "mediatedAdapterListener");
        kotlin.jvm.internal.l.f(localExtras, "localExtras");
        kotlin.jvm.internal.l.f(serverExtras, "serverExtras");
        this.f31949a = mediatedAdapter;
        mediatedAdapter.loadRewardedAd(context, mediatedAdapterListener, localExtras, serverExtras);
    }
}
