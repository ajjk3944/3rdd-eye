package com.monetization.ads.mediation.base.prefetch;

import com.monetization.ads.mediation.base.prefetch.model.MediatedPrefetchAdapterData;

/* loaded from: classes2.dex */
public interface MediatedAdapterPrefetchListener {
    void onPrefetchFailed(Integer num, String str);

    void onPrefetched(MediatedPrefetchAdapterData mediatedPrefetchAdapterData);
}
