package k3;

import android.util.Log;
import com.google.ads.mediation.mintegral.MintegralConstants;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.mbridge.msdk.out.MBSplashLoadWithCodeListener;
import com.mbridge.msdk.out.MBSplashShowListener;
import com.mbridge.msdk.out.MBridgeIds;
import j3.h;
import j3.i;

/* loaded from: classes.dex */
public abstract class a extends MBSplashLoadWithCodeListener implements MediationAppOpenAd, MBSplashShowListener {

    /* renamed from: a, reason: collision with root package name */
    public final MediationAdLoadCallback f21805a;

    /* renamed from: b, reason: collision with root package name */
    public h f21806b;

    /* renamed from: c, reason: collision with root package name */
    public MediationAppOpenAdCallback f21807c;

    /* renamed from: d, reason: collision with root package name */
    public i f21808d;

    /* renamed from: e, reason: collision with root package name */
    public final j3.a f21809e;

    public a(MediationAdLoadCallback mediationAdLoadCallback, j3.a aVar) {
        this.f21805a = mediationAdLoadCallback;
        this.f21809e = aVar;
    }

    @Override // com.mbridge.msdk.out.MBSplashShowListener
    public void onAdClicked(MBridgeIds mBridgeIds) {
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f21807c;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.reportAdClicked();
        }
    }

    @Override // com.mbridge.msdk.out.MBSplashShowListener
    public void onDismiss(MBridgeIds mBridgeIds, int i10) {
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f21807c;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdClosed();
        }
        i iVar = this.f21808d;
        if (iVar != null) {
            iVar.onDestroy();
        }
    }

    @Override // com.mbridge.msdk.out.MBSplashLoadWithCodeListener
    public void onLoadFailedWithCode(MBridgeIds mBridgeIds, int i10, String str, int i11) {
        h hVar;
        if (this.f21809e.a() && (hVar = this.f21806b) != null) {
            MintegralMediationAdapter.loadedSlotIdentifiers.remove(hVar);
        }
        AdError adErrorB = MintegralConstants.b(i10, str);
        Log.d(MintegralMediationAdapter.TAG, adErrorB.toString());
        this.f21805a.onFailure(adErrorB);
    }

    @Override // com.mbridge.msdk.out.MBSplashLoadListener
    public void onLoadSuccessed(MBridgeIds mBridgeIds, int i10) {
        this.f21807c = (MediationAppOpenAdCallback) this.f21805a.onSuccess(this);
    }

    @Override // com.mbridge.msdk.out.MBSplashShowListener
    public void onShowFailed(MBridgeIds mBridgeIds, String str) {
        h hVar;
        if (this.f21809e.a() && (hVar = this.f21806b) != null) {
            MintegralMediationAdapter.loadedSlotIdentifiers.remove(hVar);
        }
        if (this.f21807c != null) {
            AdError adErrorB = MintegralConstants.b(100, str);
            Log.w(MintegralMediationAdapter.TAG, adErrorB.toString());
            this.f21807c.onAdFailedToShow(adErrorB);
        }
    }

    @Override // com.mbridge.msdk.out.MBSplashShowListener
    public void onShowSuccessed(MBridgeIds mBridgeIds) {
        h hVar;
        if (this.f21809e.a() && (hVar = this.f21806b) != null) {
            MintegralMediationAdapter.loadedSlotIdentifiers.remove(hVar);
        }
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f21807c;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdOpened();
            this.f21807c.reportAdImpression();
        }
    }

    @Override // com.mbridge.msdk.out.MBSplashShowListener
    public void onZoomOutPlayFinish(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.out.MBSplashShowListener
    public void onZoomOutPlayStart(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.out.MBSplashLoadListener
    public void isSupportZoomOut(MBridgeIds mBridgeIds, boolean z10) {
    }

    @Override // com.mbridge.msdk.out.MBSplashShowListener
    public void onAdTick(MBridgeIds mBridgeIds, long j10) {
    }
}
