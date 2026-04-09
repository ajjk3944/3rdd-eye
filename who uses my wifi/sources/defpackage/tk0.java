package defpackage;

import android.view.View;
import com.phuongpn.whousemywifi.networkscanner.PingActivity;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class tk0 implements View.OnClickListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ PingActivity g;

    public /* synthetic */ tk0(PingActivity pingActivity, int i) {
        this.f = i;
        this.g = pingActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f;
        PingActivity pingActivity = this.g;
        switch (i) {
            case 0:
                int i2 = PingActivity.L;
                pingActivity.i().c();
                return;
            case 1:
                int i3 = PingActivity.L;
                pingActivity.y();
                return;
            case 2:
                vy2 vy2Var = pingActivity.G;
                if (vy2Var != null) {
                    vy2Var.b = true;
                    return;
                } else {
                    i30.S("ping");
                    throw null;
                }
            default:
                int i4 = PingActivity.L;
                pingActivity.y();
                return;
        }
    }
}
