package bb;

import android.content.Context;
import android.os.RemoteException;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class a {
    public abstract pa.r getSDKVersionInfo();

    public abstract pa.r getVersionInfo();

    public abstract void initialize(Context context, b bVar, List<o> list);

    public void loadAppOpenAd(j jVar, e eVar) {
        eVar.i(new pa.a(7, getClass().getSimpleName().concat(" does not support app open ads."), "com.google.android.gms.ads", null));
    }

    public void loadBannerAd(m mVar, e eVar) {
        eVar.i(new pa.a(7, getClass().getSimpleName().concat(" does not support banner ads."), "com.google.android.gms.ads", null));
    }

    public void loadInterstitialAd(r rVar, e eVar) {
        eVar.i(new pa.a(7, getClass().getSimpleName().concat(" does not support interstitial ads."), "com.google.android.gms.ads", null));
    }

    @Deprecated
    public void loadNativeAd(u uVar, e eVar) {
        eVar.i(new pa.a(7, getClass().getSimpleName().concat(" does not support native ads."), "com.google.android.gms.ads", null));
    }

    public void loadNativeAdMapper(u uVar, e eVar) throws RemoteException {
        throw new RemoteException("Method is not found");
    }

    public void loadRewardedAd(y yVar, e eVar) {
        eVar.i(new pa.a(7, getClass().getSimpleName().concat(" does not support rewarded ads."), "com.google.android.gms.ads", null));
    }

    public void loadRewardedInterstitialAd(y yVar, e eVar) {
        eVar.i(new pa.a(7, getClass().getSimpleName().concat(" does not support rewarded interstitial ads."), "com.google.android.gms.ads", null));
    }
}
