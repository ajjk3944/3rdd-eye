package defpackage;

import android.app.Dialog;
import android.widget.Button;
import android.widget.FrameLayout;
import com.phuongpn.whousemywifi.networkscanner.PortActivity;
import com.phuongpn.whousemywifi.networkscanner.R;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class ll0 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ PortActivity g;

    public /* synthetic */ ll0(PortActivity portActivity, int i) {
        this.f = i;
        this.g = portActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        int i2 = 0;
        int i3 = 1;
        PortActivity portActivity = this.g;
        switch (i) {
            case 0:
                int i4 = PortActivity.K;
                ((FrameLayout) portActivity.y().b).setVisibility(8);
                break;
            case 1:
                int i5 = PortActivity.K;
                portActivity.z(true);
                break;
            case 2:
                int i6 = PortActivity.K;
                portActivity.getClass();
                Dialog dialog = new Dialog(portActivity, R.style.DialogStyle);
                dialog.requestWindowFeature(1);
                dialog.setContentView(R.layout.dialog_invalid_url);
                dialog.setCanceledOnTouchOutside(true);
                ((Button) dialog.findViewById(R.id.btn_ok)).setOnClickListener(new uk0(dialog, i3));
                dialog.setOnDismissListener(new vk0(portActivity, i3));
                dialog.show();
                break;
            case 3:
                int i7 = PortActivity.K;
                try {
                    if (((FrameLayout) portActivity.y().b).getVisibility() == 0) {
                        portActivity.runOnUiThread(new ll0(portActivity, i2));
                        break;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
                break;
            default:
                int i8 = PortActivity.K;
                portActivity.z(false);
                break;
        }
    }
}
