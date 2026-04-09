package defpackage;

import android.widget.FrameLayout;
import com.google.android.material.card.MaterialCardView;
import com.phuongpn.whousemywifi.networkscanner.HelpActivity;
import com.phuongpn.whousemywifi.networkscanner.MainActivity;
import com.phuongpn.whousemywifi.networkscanner.PingActivity;
import com.phuongpn.whousemywifi.networkscanner.PortActivity;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class q00 extends t2 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ q00(i5 i5Var, int i) {
        this.f = i;
        this.g = i5Var;
    }

    @Override // defpackage.t2
    public final void b(u70 u70Var) {
        switch (this.f) {
            case 0:
                HelpActivity helpActivity = (HelpActivity) this.g;
                if (helpActivity.isDestroyed()) {
                    return;
                }
                p21 p21Var = helpActivity.C;
                if (p21Var != null) {
                    ((FrameLayout) p21Var.f).setVisibility(8);
                    return;
                } else {
                    i30.S("binding");
                    throw null;
                }
            case 1:
                MainActivity mainActivity = (MainActivity) this.g;
                f2 f2Var = mainActivity.C;
                if (f2Var == null) {
                    i30.S("binding");
                    throw null;
                }
                ((MaterialCardView) f2Var.a).setVisibility(8);
                mainActivity.runOnUiThread(new la0(mainActivity, 1));
                return;
            case 2:
                PingActivity pingActivity = (PingActivity) this.g;
                if (pingActivity.isDestroyed()) {
                    return;
                }
                g2 g2Var = pingActivity.D;
                if (g2Var != null) {
                    g2Var.a.setVisibility(8);
                    return;
                } else {
                    i30.S("binding");
                    throw null;
                }
            case 3:
                PortActivity portActivity = (PortActivity) this.g;
                if (portActivity.isDestroyed()) {
                    return;
                }
                ((FrameLayout) portActivity.y().b).setVisibility(8);
                return;
            default:
                ((ex2) this.g).C3(ex2.F3(u70Var));
                return;
        }
    }

    @Override // defpackage.t2
    public void e() {
        switch (this.f) {
            case 0:
                HelpActivity helpActivity = (HelpActivity) this.g;
                if (helpActivity.isDestroyed()) {
                    return;
                }
                p21 p21Var = helpActivity.C;
                if (p21Var != null) {
                    ((FrameLayout) p21Var.f).setVisibility(8);
                    return;
                } else {
                    i30.S("binding");
                    throw null;
                }
            case 1:
                MainActivity mainActivity = (MainActivity) this.g;
                f2 f2Var = mainActivity.C;
                if (f2Var == null) {
                    i30.S("binding");
                    throw null;
                }
                if (((MaterialCardView) f2Var.c).getVisibility() == 8) {
                    f2 f2Var2 = mainActivity.C;
                    if (f2Var2 == null) {
                        i30.S("binding");
                        throw null;
                    }
                    ((MaterialCardView) f2Var2.a).setVisibility(0);
                }
                mainActivity.runOnUiThread(new la0(mainActivity, 1));
                return;
            case 2:
                PingActivity pingActivity = (PingActivity) this.g;
                if (pingActivity.isDestroyed()) {
                    return;
                }
                g2 g2Var = pingActivity.D;
                if (g2Var != null) {
                    g2Var.a.setVisibility(8);
                    return;
                } else {
                    i30.S("binding");
                    throw null;
                }
            case 3:
                PortActivity portActivity = (PortActivity) this.g;
                if (portActivity.isDestroyed()) {
                    return;
                }
                ((FrameLayout) portActivity.y().b).setVisibility(8);
                return;
            default:
                return;
        }
    }

    public q00(ex2 ex2Var) {
        this.f = 4;
        Objects.requireNonNull(ex2Var);
        this.g = ex2Var;
    }
}
