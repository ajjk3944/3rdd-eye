package J8;

import C.C0635w;
import L0.I;
import android.R;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import com.android.billingclient.api.ProxyBillingActivity;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.facebook.ads.AudienceNetworkActivity;
import com.google.android.gms.ads.AdActivity;
import com.zipoapps.premium.relaunch.RelaunchActivity;
import com.zipoapps.premiumhelper.e;
import com.zipoapps.premiumhelper.ui.splash.WarmSplashActivity;
import java.util.WeakHashMap;

/* compiled from: ActivityUtils.kt */
/* renamed from: J8.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0690e {
    public static void a(AppCompatActivity appCompatActivity, View view, int i) {
        View childAt;
        if ((i & 1) != 0) {
            view = null;
        }
        ViewGroup viewGroup = (ViewGroup) appCompatActivity.findViewById(R.id.content);
        if (viewGroup == null || (childAt = viewGroup.getChildAt(0)) == null) {
            return;
        }
        if (view == null) {
            view = childAt;
        }
        C0635w c0635w = new C0635w(3, view, childAt);
        WeakHashMap<View, L0.S> weakHashMap = L0.I.f3792a;
        I.d.u(childAt, c0635w);
    }

    public static final boolean b(Activity activity) {
        kotlin.jvm.internal.l.f(activity, "<this>");
        return (activity instanceof AdActivity) || (activity instanceof AppLovinFullscreenActivity) || (activity instanceof AudienceNetworkActivity);
    }

    public static final boolean c(Activity activity) {
        kotlin.jvm.internal.l.f(activity, "<this>");
        if (!(activity instanceof ProxyBillingActivity) && !(activity instanceof WarmSplashActivity) && !(activity instanceof RelaunchActivity) && !b(activity)) {
            if (!(activity instanceof AppCompatActivity)) {
                return true;
            }
            com.zipoapps.premiumhelper.e.f37006D.getClass();
            e.a.a().f37025o.getClass();
            if (!com.zipoapps.premiumhelper.ui.rate.f.b(activity)) {
                return true;
            }
        }
        return false;
    }
}
