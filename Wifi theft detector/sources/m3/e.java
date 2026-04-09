package m3;

import android.content.Context;
import com.applovin.mediation.AppLovinUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import j3.g;
import j3.h;
import j3.j;
import java.lang.ref.WeakReference;
import java.util.Map;
import k3.f;

/* loaded from: classes.dex */
public class e extends f {

    /* renamed from: f, reason: collision with root package name */
    public g f23443f;

    public e(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback, j3.a aVar) {
        super(mediationRewardedAdConfiguration, mediationAdLoadCallback, aVar);
    }

    public void a(MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        String string = mediationRewardedAdConfiguration.getServerParameters().getString(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID);
        String string2 = mediationRewardedAdConfiguration.getServerParameters().getString(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER);
        AdError adErrorG = j.g(string, string2);
        if (adErrorG != null) {
            this.f21829a.onFailure(adErrorG);
            return;
        }
        if (this.f21833e.a()) {
            h hVar = new h(string, string2);
            this.f21830b = hVar;
            Map<h, WeakReference<Object>> map = MintegralMediationAdapter.loadedSlotIdentifiers;
            WeakReference<Object> weakReference = map.get(hVar);
            if (weakReference != null && weakReference.get() != null) {
                this.f21829a.onFailure(new AdError(106, "An ad for the Mintegral slot is already loaded and is yet to be shown.", "com.google.ads.mediation.mintegral"));
                return;
            }
            map.put(this.f21830b, new WeakReference<>(this));
        }
        g gVarE = j3.d.e();
        this.f23443f = gVarE;
        gVarE.a(mediationRewardedAdConfiguration.getContext(), string2, string);
        this.f23443f.b(this);
        this.f23443f.load();
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(Context context) {
        this.f23443f.playVideoMute(this.f21832d ? 1 : 2);
        this.f23443f.show();
    }
}
