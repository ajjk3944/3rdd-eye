package x9;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import bb.e;
import bb.w;
import bb.x;
import bb.y;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdExtendedListener;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import j6.i;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class c implements w, RewardedVideoAdExtendedListener {

    /* renamed from: a, reason: collision with root package name */
    public final e f37017a;

    /* renamed from: b, reason: collision with root package name */
    public RewardedVideoAd f37018b;

    /* renamed from: d, reason: collision with root package name */
    public x f37020d;

    /* renamed from: f, reason: collision with root package name */
    public final i f37022f;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f37019c = new AtomicBoolean();

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f37021e = new AtomicBoolean();

    public c(e eVar, i iVar) {
        this.f37017a = eVar;
        this.f37022f = iVar;
    }

    public AdExperienceType a() {
        return AdExperienceType.AD_EXPERIENCE_TYPE_REWARDED;
    }

    public final void b(y yVar) {
        Context context = yVar.f2112d;
        String str = yVar.f2114f;
        String placementID = FacebookMediationAdapter.getPlacementID(yVar.f2110b);
        if (TextUtils.isEmpty(placementID)) {
            pa.a aVar = new pa.a(101, "Failed to request ad. PlacementID is null or empty.", FacebookMediationAdapter.ERROR_DOMAIN, null);
            Log.e(FacebookMediationAdapter.TAG, "Failed to request ad. PlacementID is null or empty.");
            this.f37017a.i(aVar);
            return;
        }
        FacebookMediationAdapter.setMixedAudience(yVar);
        this.f37022f.getClass();
        this.f37018b = new RewardedVideoAd(context, placementID);
        if (!TextUtils.isEmpty(str)) {
            this.f37018b.setExtraHints(new ExtraHints.Builder().mediationData(str).build());
        }
        RewardedVideoAd rewardedVideoAd = this.f37018b;
        rewardedVideoAd.loadAd(rewardedVideoAd.buildLoadAdConfig().withAdListener(this).withBid(yVar.f2109a).withAdExperience(a()).build());
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(Ad ad2) {
        x xVar = this.f37020d;
        if (xVar != null) {
            xVar.h();
        }
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(Ad ad2) {
        e eVar = this.f37017a;
        if (eVar != null) {
            this.f37020d = (x) eVar.onSuccess(this);
        }
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad2, AdError adError) {
        pa.a adError2 = FacebookMediationAdapter.getAdError(adError);
        if (this.f37019c.get()) {
            Log.w(FacebookMediationAdapter.TAG, adError2.f31512b);
            x xVar = this.f37020d;
            if (xVar != null) {
                xVar.b(adError2);
            }
        } else {
            Log.w(FacebookMediationAdapter.TAG, adError2.f31512b);
            e eVar = this.f37017a;
            if (eVar != null) {
                eVar.i(adError2);
            }
        }
        this.f37018b.destroy();
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(Ad ad2) {
        x xVar = this.f37020d;
        if (xVar != null) {
            xVar.g();
        }
    }

    @Override // com.facebook.ads.RewardedVideoAdExtendedListener
    public final void onRewardedVideoActivityDestroyed() {
        x xVar;
        if (!this.f37021e.getAndSet(true) && (xVar = this.f37020d) != null) {
            xVar.onAdClosed();
        }
        RewardedVideoAd rewardedVideoAd = this.f37018b;
        if (rewardedVideoAd != null) {
            rewardedVideoAd.destroy();
        }
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public final void onRewardedVideoClosed() {
        x xVar;
        if (!this.f37021e.getAndSet(true) && (xVar = this.f37020d) != null) {
            xVar.onAdClosed();
        }
        RewardedVideoAd rewardedVideoAd = this.f37018b;
        if (rewardedVideoAd != null) {
            rewardedVideoAd.destroy();
        }
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public final void onRewardedVideoCompleted() {
        this.f37020d.c();
        this.f37020d.d();
    }

    @Override // bb.w
    public final void showAd(Context context) {
        this.f37019c.set(true);
        if (this.f37018b.show()) {
            x xVar = this.f37020d;
            if (xVar != null) {
                xVar.f();
                this.f37020d.e();
                return;
            }
            return;
        }
        pa.a aVar = new pa.a(110, "Failed to present rewarded ad.", FacebookMediationAdapter.ERROR_DOMAIN, null);
        Log.w(FacebookMediationAdapter.TAG, "Failed to present rewarded ad.");
        x xVar2 = this.f37020d;
        if (xVar2 != null) {
            xVar2.b(aVar);
        }
        this.f37018b.destroy();
    }
}
