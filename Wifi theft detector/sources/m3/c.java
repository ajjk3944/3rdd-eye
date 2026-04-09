package m3;

import android.content.Context;
import com.applovin.mediation.AppLovinUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import j3.f;
import j3.h;
import j3.j;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes.dex */
public class c extends k3.c {

    /* renamed from: f, reason: collision with root package name */
    public f f23441f;

    public c(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback, j3.a aVar) {
        super(mediationInterstitialAdConfiguration, mediationAdLoadCallback, aVar);
    }

    public void a(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        String string = mediationInterstitialAdConfiguration.getServerParameters().getString(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID);
        String string2 = mediationInterstitialAdConfiguration.getServerParameters().getString(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER);
        AdError adErrorG = j.g(string, string2);
        if (adErrorG != null) {
            this.f21813a.onFailure(adErrorG);
            return;
        }
        if (this.f21817e.a()) {
            h hVar = new h(string, string2);
            this.f21814b = hVar;
            Map<h, WeakReference<Object>> map = MintegralMediationAdapter.loadedSlotIdentifiers;
            WeakReference<Object> weakReference = map.get(hVar);
            if (weakReference != null && weakReference.get() != null) {
                this.f21813a.onFailure(new AdError(106, "An ad for the Mintegral slot is already loaded and is yet to be shown.", "com.google.ads.mediation.mintegral"));
                return;
            }
            map.put(this.f21814b, new WeakReference<>(this));
        }
        f fVarB = j3.d.b();
        this.f23441f = fVarB;
        fVarB.a(mediationInterstitialAdConfiguration.getContext(), string2, string);
        this.f23441f.b(this);
        this.f23441f.load();
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(Context context) {
        this.f23441f.playVideoMute(this.f21816d ? 1 : 2);
        this.f23441f.show();
    }
}
