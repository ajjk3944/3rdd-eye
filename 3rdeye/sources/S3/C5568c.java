package s3;

import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.vungle.ads.AbstractC4059q;
import com.vungle.ads.InterfaceC4058p;
import com.vungle.ads.j0;
import com.vungle.ads.k0;
import q3.C5490a;

/* compiled from: VungleRtbBannerAd.java */
/* renamed from: s3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5568c implements MediationBannerAd, InterfaceC4058p {

    /* renamed from: b, reason: collision with root package name */
    public final MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> f46025b;

    /* renamed from: c, reason: collision with root package name */
    public MediationBannerAdCallback f46026c;

    /* renamed from: d, reason: collision with root package name */
    public j0 f46027d;

    /* renamed from: e, reason: collision with root package name */
    public RelativeLayout f46028e;

    /* renamed from: f, reason: collision with root package name */
    public final C5490a f46029f;

    public C5568c(MediationBannerAdConfiguration mediationBannerAdConfiguration, MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback, C5490a c5490a) {
        this.f46025b = mediationAdLoadCallback;
        this.f46029f = c5490a;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    public final View getView() {
        return this.f46028e;
    }

    @Override // com.vungle.ads.InterfaceC4058p, com.vungle.ads.r
    public final void onAdClicked(AbstractC4059q abstractC4059q) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f46026c;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdClicked();
            this.f46026c.onAdOpened();
        }
    }

    @Override // com.vungle.ads.InterfaceC4058p, com.vungle.ads.r
    public final void onAdFailedToLoad(AbstractC4059q abstractC4059q, k0 k0Var) {
        AdError adError = VungleMediationAdapter.getAdError(k0Var);
        Log.w(VungleMediationAdapter.TAG, adError.toString());
        this.f46025b.onFailure(adError);
    }

    @Override // com.vungle.ads.InterfaceC4058p, com.vungle.ads.r
    public final void onAdFailedToPlay(AbstractC4059q abstractC4059q, k0 k0Var) {
        Log.w(VungleMediationAdapter.TAG, VungleMediationAdapter.getAdError(k0Var).toString());
    }

    @Override // com.vungle.ads.InterfaceC4058p, com.vungle.ads.r
    public final void onAdImpression(AbstractC4059q abstractC4059q) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f46026c;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdImpression();
        }
    }

    @Override // com.vungle.ads.InterfaceC4058p, com.vungle.ads.r
    public final void onAdLeftApplication(AbstractC4059q abstractC4059q) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f46026c;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdLeftApplication();
        }
    }

    @Override // com.vungle.ads.InterfaceC4058p, com.vungle.ads.r
    public final void onAdLoaded(AbstractC4059q abstractC4059q) {
        this.f46026c = this.f46025b.onSuccess(this);
    }

    @Override // com.vungle.ads.InterfaceC4058p, com.vungle.ads.r
    public final void onAdEnd(AbstractC4059q abstractC4059q) {
    }

    @Override // com.vungle.ads.InterfaceC4058p, com.vungle.ads.r
    public final void onAdStart(AbstractC4059q abstractC4059q) {
    }
}
