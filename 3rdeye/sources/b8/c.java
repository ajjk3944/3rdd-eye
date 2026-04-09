package B8;

import A9.C0575f;
import A9.C0580h0;
import H8.j;
import H8.k;
import H8.l;
import U7.f;
import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;
import androidx.fragment.app.ActivityC1762o;
import b9.C1992A;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.zipoapps.premiumhelper.g;
import com.zipoapps.premiumhelper.ui.settings.PHSettingsActivity;
import com.zipoapps.premiumhelper.ui.splash.PHSplashActivity;
import f8.AbstractActivityC4340c;
import p9.InterfaceC5480a;
import w9.i;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements InterfaceC5480a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f587b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f588c;

    public /* synthetic */ c(Object obj, int i) {
        this.f587b = i;
        this.f588c = obj;
    }

    @Override // p9.InterfaceC5480a
    public final Object invoke() {
        Object obj = this.f588c;
        switch (this.f587b) {
            case 0:
                com.zipoapps.premiumhelper.ui.settings.a aVar = (com.zipoapps.premiumhelper.ui.settings.a) obj;
                Bundle bundle = new Bundle();
                bundle.putInt("RESULT", 13627834);
                aVar.requireActivity().getSupportFragmentManager().V(bundle);
                aVar.getChildFragmentManager().V(bundle);
                ActivityC1762o activityC1762oRequireActivity = aVar.requireActivity();
                PHSettingsActivity pHSettingsActivity = activityC1762oRequireActivity instanceof PHSettingsActivity ? (PHSettingsActivity) activityC1762oRequireActivity : null;
                if (pHSettingsActivity != null) {
                    pHSettingsActivity.setResult(13627834);
                }
                return C1992A.f18074a;
            case 1:
                i<Object>[] iVarArr = PHSplashActivity.i;
                int i = Build.VERSION.SDK_INT;
                PHSplashActivity pHSplashActivity = (PHSplashActivity) obj;
                return i >= 33 ? new l(pHSplashActivity) : (i == 31) | (i == 32) ? new k(pHSplashActivity) : new j(pHSplashActivity);
            case 2:
                return Long.valueOf(((Number) ((InterfaceC5480a) obj).invoke()).longValue() * 1000);
            case 3:
                l8.b bVar = ((f) obj).f12508b;
                l8.d<Integer> PH_INTERSTITIAL_ON_ACTION_CAPPING_SECONDS = i8.d.f38523C;
                kotlin.jvm.internal.l.e(PH_INTERSTITIAL_ON_ACTION_CAPPING_SECONDS, "PH_INTERSTITIAL_ON_ACTION_CAPPING_SECONDS");
                return Long.valueOf(((Number) bVar.h(PH_INTERSTITIAL_ON_ACTION_CAPPING_SECONDS)).intValue());
            case 4:
                int i10 = AbstractActivityC4340c.i;
                return (TextView) ((AbstractActivityC4340c) obj).findViewById(R.id.btnCta);
            case 5:
                C0575f.e(C0580h0.f248b, null, null, new g.a((com.zipoapps.premiumhelper.e) obj, null), 3);
                return C1992A.f18074a;
            case 6:
                ((androidx.room.c) obj).getClass();
                return C1992A.f18074a;
            default:
                l8.b bVar2 = ((w8.i) obj).f47582b;
                l8.d<Integer> PH_HAPPY_MOMENT_CAPPING_SECONDS = i8.d.f38579u;
                kotlin.jvm.internal.l.e(PH_HAPPY_MOMENT_CAPPING_SECONDS, "PH_HAPPY_MOMENT_CAPPING_SECONDS");
                return Long.valueOf(((Number) bVar2.h(PH_HAPPY_MOMENT_CAPPING_SECONDS)).intValue());
        }
    }
}
