package m3;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.applovin.mediation.AppLovinUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import j3.h;
import j3.i;
import j3.j;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes.dex */
public class a extends k3.a {
    public a(MediationAdLoadCallback mediationAdLoadCallback, j3.a aVar) {
        super(mediationAdLoadCallback, aVar);
    }

    public void a(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration) {
        Bundle serverParameters = mediationAppOpenAdConfiguration.getServerParameters();
        String string = serverParameters.getString(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID);
        String string2 = serverParameters.getString(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER);
        AdError adErrorG = j.g(string, string2);
        if (adErrorG != null) {
            this.f21805a.onFailure(adErrorG);
            return;
        }
        if (this.f21809e.a()) {
            h hVar = new h(string, string2);
            this.f21806b = hVar;
            Map<h, WeakReference<Object>> map = MintegralMediationAdapter.loadedSlotIdentifiers;
            WeakReference<Object> weakReference = map.get(hVar);
            if (weakReference != null && weakReference.get() != null) {
                this.f21805a.onFailure(new AdError(106, "An ad for the Mintegral slot is already loaded and is yet to be shown.", "com.google.ads.mediation.mintegral"));
                return;
            }
            map.put(this.f21806b, new WeakReference<>(this));
        }
        i iVarF = j3.d.f();
        this.f21808d = iVarF;
        iVarF.d(string2, string);
        this.f21808d.e(this);
        this.f21808d.f(this);
        this.f21808d.a();
    }

    @Override // com.google.android.gms.ads.mediation.MediationAppOpenAd
    public void showAd(Context context) {
        Activity activity = (Activity) context;
        if (this.f21808d != null) {
            RelativeLayout relativeLayout = new RelativeLayout(activity);
            ((ViewGroup) activity.getWindow().getDecorView().findViewById(R.id.content)).addView(relativeLayout);
            this.f21808d.g(relativeLayout);
        }
    }
}
