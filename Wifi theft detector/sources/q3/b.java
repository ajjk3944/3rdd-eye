package q3;

import android.content.Context;
import com.vungle.ads.AdConfig;
import com.vungle.ads.NativeAd;
import com.vungle.ads.VungleBannerView;
import com.vungle.ads.a0;
import com.vungle.ads.m;
import com.vungle.ads.w;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class b {
    public final AdConfig a() {
        return new AdConfig();
    }

    public final VungleBannerView b(Context context, String placementId, a0 adSize) {
        p.e(context, "context");
        p.e(placementId, "placementId");
        p.e(adSize, "adSize");
        return new VungleBannerView(context, placementId, adSize);
    }

    public final m c(Context context, String placementId, AdConfig adConfig) {
        p.e(context, "context");
        p.e(placementId, "placementId");
        p.e(adConfig, "adConfig");
        return new m(context, placementId, adConfig);
    }

    public final NativeAd d(Context context, String placementId) {
        p.e(context, "context");
        p.e(placementId, "placementId");
        return new NativeAd(context, placementId);
    }

    public final w e(Context context, String placementId, AdConfig adConfig) {
        p.e(context, "context");
        p.e(placementId, "placementId");
        p.e(adConfig, "adConfig");
        return new w(context, placementId, adConfig);
    }
}
