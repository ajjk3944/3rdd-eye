package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdapter;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdapterListener;
import java.util.Map;

/* loaded from: classes3.dex */
public final class hy0 implements mx0<MediatedNativeAdapter, MediatedNativeAdapterListener> {
    @Override // com.yandex.mobile.ads.impl.mx0
    public final void a(com.monetization.ads.mediation.base.a aVar) {
        MediatedNativeAdapter mediatedAdapter = (MediatedNativeAdapter) aVar;
        kotlin.jvm.internal.l.f(mediatedAdapter, "mediatedAdapter");
    }

    @Override // com.yandex.mobile.ads.impl.mx0
    public final void a(Context context, com.monetization.ads.mediation.base.a aVar, Object obj, Map localExtras, Map serverExtras) {
        MediatedNativeAdapter mediatedAdapter = (MediatedNativeAdapter) aVar;
        MediatedNativeAdapterListener mediatedAdapterListener = (MediatedNativeAdapterListener) obj;
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(mediatedAdapter, "mediatedAdapter");
        kotlin.jvm.internal.l.f(mediatedAdapterListener, "mediatedAdapterListener");
        kotlin.jvm.internal.l.f(localExtras, "localExtras");
        kotlin.jvm.internal.l.f(serverExtras, "serverExtras");
        mediatedAdapter.loadAd(context, mediatedAdapterListener, localExtras, serverExtras);
    }
}
