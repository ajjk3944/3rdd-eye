package com.monetization.ads.mediation.banner;

import android.content.Context;
import com.monetization.ads.mediation.banner.MediatedBannerAdapter;
import com.yandex.mobile.ads.impl.mx0;
import java.util.Map;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class b implements mx0<MediatedBannerAdapter, MediatedBannerAdapter.MediatedBannerAdapterListener> {
    @Override // com.yandex.mobile.ads.impl.mx0
    public final void a(com.monetization.ads.mediation.base.a aVar) {
        MediatedBannerAdapter mediatedAdapter = (MediatedBannerAdapter) aVar;
        l.f(mediatedAdapter, "mediatedAdapter");
        mediatedAdapter.onInvalidate();
    }

    @Override // com.yandex.mobile.ads.impl.mx0
    public final void a(Context context, com.monetization.ads.mediation.base.a aVar, Object obj, Map localExtras, Map serverExtras) {
        MediatedBannerAdapter mediatedAdapter = (MediatedBannerAdapter) aVar;
        MediatedBannerAdapter.MediatedBannerAdapterListener mediatedAdapterListener = (MediatedBannerAdapter.MediatedBannerAdapterListener) obj;
        l.f(context, "context");
        l.f(mediatedAdapter, "mediatedAdapter");
        l.f(mediatedAdapterListener, "mediatedAdapterListener");
        l.f(localExtras, "localExtras");
        l.f(serverExtras, "serverExtras");
        mediatedAdapter.loadBanner(context, mediatedAdapterListener, localExtras, serverExtras);
    }
}
