package defpackage;

import android.util.DisplayMetrics;
import android.view.Display;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.phuongpn.whousemywifi.networkscanner.HelpActivity;
import com.phuongpn.whousemywifi.networkscanner.PingActivity;
import com.phuongpn.whousemywifi.networkscanner.PortActivity;
import com.phuongpn.whousemywifi.networkscanner.R;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class o00 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ i5 g;

    public /* synthetic */ o00(i5 i5Var, int i) {
        this.f = i;
        this.g = i5Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f) {
            case 0:
                HelpActivity helpActivity = (HelpActivity) this.g;
                if (helpActivity.E) {
                    return;
                }
                helpActivity.E = true;
                e3 e3Var = helpActivity.D;
                if (e3Var == null) {
                    i30.S("adView");
                    throw null;
                }
                e3Var.setAdUnitId(helpActivity.getString(R.string.ads_banner));
                e3 e3Var2 = helpActivity.D;
                if (e3Var2 == null) {
                    i30.S("adView");
                    throw null;
                }
                Display defaultDisplay = helpActivity.getWindowManager().getDefaultDisplay();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                defaultDisplay.getMetrics(displayMetrics);
                float f = displayMetrics.density;
                p21 p21Var = helpActivity.C;
                if (p21Var == null) {
                    i30.S("binding");
                    throw null;
                }
                float width = ((FrameLayout) p21Var.g).getWidth();
                if (width == 0.0f) {
                    width = displayMetrics.widthPixels;
                }
                e3Var2.setAdSize(d3.a(helpActivity, (int) (width / f)));
                b3 b3Var = new b3(new a3(1));
                e3 e3Var3 = helpActivity.D;
                if (e3Var3 == null) {
                    i30.S("adView");
                    throw null;
                }
                e3Var3.setAdListener(new q00(helpActivity, 0));
                e3 e3Var4 = helpActivity.D;
                if (e3Var4 != null) {
                    e3Var4.b(b3Var);
                    return;
                } else {
                    i30.S("adView");
                    throw null;
                }
            case 1:
                PingActivity pingActivity = (PingActivity) this.g;
                if (pingActivity.F) {
                    return;
                }
                pingActivity.F = true;
                e3 e3Var5 = pingActivity.E;
                if (e3Var5 == null) {
                    i30.S("adView");
                    throw null;
                }
                e3Var5.setAdUnitId(pingActivity.getString(R.string.ads_banner));
                e3 e3Var6 = pingActivity.E;
                if (e3Var6 == null) {
                    i30.S("adView");
                    throw null;
                }
                Display defaultDisplay2 = pingActivity.getWindowManager().getDefaultDisplay();
                DisplayMetrics displayMetrics2 = new DisplayMetrics();
                defaultDisplay2.getMetrics(displayMetrics2);
                float f2 = displayMetrics2.density;
                g2 g2Var = pingActivity.D;
                if (g2Var == null) {
                    i30.S("binding");
                    throw null;
                }
                float width2 = g2Var.b.getWidth();
                if (width2 == 0.0f) {
                    width2 = displayMetrics2.widthPixels;
                }
                e3Var6.setAdSize(d3.a(pingActivity, (int) (width2 / f2)));
                b3 b3Var2 = new b3(new a3(1));
                e3 e3Var7 = pingActivity.E;
                if (e3Var7 == null) {
                    i30.S("adView");
                    throw null;
                }
                e3Var7.setAdListener(new q00(pingActivity, 2));
                e3 e3Var8 = pingActivity.E;
                if (e3Var8 != null) {
                    e3Var8.b(b3Var2);
                    return;
                } else {
                    i30.S("adView");
                    throw null;
                }
            default:
                PortActivity portActivity = (PortActivity) this.g;
                if (portActivity.J) {
                    return;
                }
                portActivity.J = true;
                e3 e3Var9 = portActivity.I;
                if (e3Var9 == null) {
                    i30.S("adView");
                    throw null;
                }
                e3Var9.setAdUnitId(portActivity.getString(R.string.ads_banner));
                e3 e3Var10 = portActivity.I;
                if (e3Var10 == null) {
                    i30.S("adView");
                    throw null;
                }
                Display defaultDisplay3 = portActivity.getWindowManager().getDefaultDisplay();
                DisplayMetrics displayMetrics3 = new DisplayMetrics();
                defaultDisplay3.getMetrics(displayMetrics3);
                float f3 = displayMetrics3.density;
                float width3 = ((FrameLayout) portActivity.y().c).getWidth();
                if (width3 == 0.0f) {
                    width3 = displayMetrics3.widthPixels;
                }
                e3Var10.setAdSize(d3.a(portActivity, (int) (width3 / f3)));
                b3 b3Var3 = new b3(new a3(1));
                e3 e3Var11 = portActivity.I;
                if (e3Var11 == null) {
                    i30.S("adView");
                    throw null;
                }
                e3Var11.setAdListener(new q00(portActivity, 3));
                e3 e3Var12 = portActivity.I;
                if (e3Var12 != null) {
                    e3Var12.b(b3Var3);
                    return;
                } else {
                    i30.S("adView");
                    throw null;
                }
        }
    }
}
