package defpackage;

import android.app.Dialog;
import android.view.View;
import com.phuongpn.whousemywifi.networkscanner.PingActivity;
import com.phuongpn.whousemywifi.networkscanner.PortActivity;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class uk0 implements View.OnClickListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ Dialog g;

    public /* synthetic */ uk0(Dialog dialog, int i) {
        this.f = i;
        this.g = dialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f;
        Dialog dialog = this.g;
        switch (i) {
            case 0:
                int i2 = PingActivity.L;
                dialog.dismiss();
                break;
            case 1:
                int i3 = PortActivity.K;
                dialog.dismiss();
                break;
            case 2:
                dialog.dismiss();
                break;
            default:
                dialog.dismiss();
                break;
        }
    }
}
