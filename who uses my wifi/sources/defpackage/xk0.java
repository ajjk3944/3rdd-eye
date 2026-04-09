package defpackage;

import android.app.Dialog;
import android.widget.Button;
import com.phuongpn.whousemywifi.networkscanner.PingActivity;
import com.phuongpn.whousemywifi.networkscanner.R;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class xk0 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ PingActivity g;

    public /* synthetic */ xk0(PingActivity pingActivity, int i) {
        this.f = i;
        this.g = pingActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        int i2 = 0;
        PingActivity pingActivity = this.g;
        switch (i) {
            case 0:
                int i3 = PingActivity.L;
                pingActivity.z(true);
                pingActivity.x();
                o9 o9Var = pingActivity.K;
                if (o9Var == null) {
                    i30.S("pingChart");
                    throw null;
                }
                g2 g2Var = (g2) o9Var.d;
                ((j60) g2Var.e.getData()).i.clear();
                g2Var.e.invalidate();
                return;
            case 1:
                int i4 = PingActivity.L;
                try {
                    g2 g2Var2 = pingActivity.D;
                    if (g2Var2 == null) {
                        i30.S("binding");
                        throw null;
                    }
                    if (g2Var2.a.getVisibility() == 0) {
                        pingActivity.runOnUiThread(new xk0(pingActivity, 3));
                        return;
                    }
                    return;
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            case 2:
                int i5 = PingActivity.L;
                Dialog dialog = new Dialog(pingActivity, R.style.DialogStyle);
                dialog.requestWindowFeature(1);
                dialog.setContentView(R.layout.dialog_invalid_url);
                dialog.setCanceledOnTouchOutside(true);
                ((Button) dialog.findViewById(R.id.btn_ok)).setOnClickListener(new uk0(dialog, i2));
                dialog.setOnDismissListener(new vk0(pingActivity, i2));
                dialog.show();
                return;
            case 3:
                g2 g2Var3 = pingActivity.D;
                if (g2Var3 != null) {
                    g2Var3.a.setVisibility(8);
                    return;
                } else {
                    i30.S("binding");
                    throw null;
                }
            default:
                int i6 = PingActivity.L;
                pingActivity.z(false);
                return;
        }
    }
}
