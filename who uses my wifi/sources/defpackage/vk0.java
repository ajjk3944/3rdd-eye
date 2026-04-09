package defpackage;

import android.content.DialogInterface;
import com.google.android.material.textfield.TextInputEditText;
import com.phuongpn.whousemywifi.networkscanner.PingActivity;
import com.phuongpn.whousemywifi.networkscanner.PortActivity;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class vk0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ i5 g;

    public /* synthetic */ vk0(i5 i5Var, int i) {
        this.f = i;
        this.g = i5Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i = this.f;
        i5 i5Var = this.g;
        switch (i) {
            case 0:
                PingActivity pingActivity = (PingActivity) i5Var;
                int i2 = PingActivity.L;
                try {
                    g2 g2Var = pingActivity.D;
                    if (g2Var != null) {
                        ((TextInputEditText) g2Var.h.i).requestFocus();
                        return;
                    } else {
                        i30.S("binding");
                        throw null;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            default:
                PortActivity portActivity = (PortActivity) i5Var;
                int i3 = PortActivity.K;
                try {
                    ((TextInputEditText) ((p21) portActivity.y().i).i).requestFocus();
                    return;
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return;
                }
        }
    }
}
