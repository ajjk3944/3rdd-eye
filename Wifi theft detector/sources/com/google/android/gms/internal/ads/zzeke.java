package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures;
import androidx.privacysandbox.ads.adservices.topics.b;
import com.google.android.gms.ads.MobileAds;

/* loaded from: classes2.dex */
public final class zzeke {
    private final Context zza;

    public zzeke(Context context) {
        this.zza = context;
    }

    public final com.google.common.util.concurrent.a zza(boolean z10) {
        try {
            androidx.privacysandbox.ads.adservices.topics.b bVarA = new b.a().b(MobileAds.ERROR_DOMAIN).c(z10).a();
            TopicsManagerFutures topicsManagerFuturesA = TopicsManagerFutures.a(this.zza);
            return topicsManagerFuturesA != null ? topicsManagerFuturesA.b(bVarA) : zzgzo.zzc(new IllegalStateException());
        } catch (Exception e10) {
            return zzgzo.zzc(e10);
        }
    }
}
