package k3;

import android.content.Context;
import android.util.Log;
import com.google.ads.mediation.mintegral.MintegralConstants;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.NativeAdWithCodeListener;
import java.util.List;

/* loaded from: classes.dex */
public class e extends NativeAdWithCodeListener {

    /* renamed from: a, reason: collision with root package name */
    public MediationAdLoadCallback f21826a;

    /* renamed from: b, reason: collision with root package name */
    public d f21827b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f21828c;

    public e(d dVar, Context context, MediationAdLoadCallback mediationAdLoadCallback) {
        this.f21828c = context;
        this.f21827b = dVar;
        this.f21826a = mediationAdLoadCallback;
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onAdClick(Campaign campaign) {
        MediationNativeAdCallback mediationNativeAdCallback = this.f21827b.f21820c;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdClicked();
            this.f21827b.f21820c.onAdLeftApplication();
        }
    }

    @Override // com.mbridge.msdk.out.NativeAdWithCodeListener
    public void onAdLoadErrorWithCode(int i10, String str) {
        AdError adErrorB = MintegralConstants.b(i10, str);
        Log.w(MintegralMediationAdapter.TAG, adErrorB.toString());
        this.f21826a.onFailure(adErrorB);
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onAdLoaded(List list, int i10) {
        if (list == null || list.size() == 0) {
            AdError adErrorA = MintegralConstants.a(104, "Mintegral SDK failed to return a native ad.");
            Log.w(MintegralMediationAdapter.TAG, adErrorA.toString());
            this.f21826a.onFailure(adErrorA);
        } else {
            this.f21827b.a((Campaign) list.get(0), this.f21828c);
            d dVar = this.f21827b;
            dVar.f21820c = (MediationNativeAdCallback) this.f21826a.onSuccess(dVar);
        }
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onLoggingImpression(int i10) {
        MediationNativeAdCallback mediationNativeAdCallback = this.f21827b.f21820c;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdImpression();
        }
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onAdFramesLoaded(List list) {
    }
}
