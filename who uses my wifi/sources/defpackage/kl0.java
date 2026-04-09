package defpackage;

import android.view.View;
import com.phuongpn.whousemywifi.networkscanner.PortActivity;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class kl0 implements View.OnClickListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ PortActivity g;

    public /* synthetic */ kl0(PortActivity portActivity, int i) {
        this.f = i;
        this.g = portActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f;
        PortActivity portActivity = this.g;
        switch (i) {
            case 0:
                int i2 = PortActivity.K;
                portActivity.onBackPressed();
                return;
            case 1:
                int i3 = PortActivity.K;
                portActivity.x();
                return;
            case 2:
                int i4 = PortActivity.K;
                portActivity.x();
                return;
            case 3:
                ql0 ql0Var = portActivity.D;
                if (ql0Var != null) {
                    ql0Var.d = true;
                    return;
                } else {
                    i30.S("portScan");
                    throw null;
                }
            default:
                int i5 = PortActivity.K;
                portActivity.x();
                return;
        }
    }
}
