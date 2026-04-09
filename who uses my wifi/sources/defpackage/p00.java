package defpackage;

import android.widget.FrameLayout;
import com.phuongpn.whousemywifi.networkscanner.HelpActivity;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class p00 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ HelpActivity g;

    public /* synthetic */ p00(HelpActivity helpActivity, int i) {
        this.f = i;
        this.g = helpActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        HelpActivity helpActivity = this.g;
        switch (i) {
            case 0:
                int i2 = HelpActivity.F;
                try {
                    p21 p21Var = helpActivity.C;
                    if (p21Var == null) {
                        i30.S("binding");
                        throw null;
                    }
                    if (((FrameLayout) p21Var.f).getVisibility() == 0) {
                        helpActivity.runOnUiThread(new p00(helpActivity, 1));
                        return;
                    }
                    return;
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            default:
                p21 p21Var2 = helpActivity.C;
                if (p21Var2 != null) {
                    ((FrameLayout) p21Var2.f).setVisibility(8);
                    return;
                } else {
                    i30.S("binding");
                    throw null;
                }
        }
    }
}
