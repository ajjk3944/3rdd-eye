package defpackage;

import com.phuongpn.whousemywifi.networkscanner.PingActivity;
import com.phuongpn.whousemywifi.networkscanner.PortActivity;
import com.phuongpn.whousemywifi.networkscanner.RouterPasswordActivity;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class wk0 implements dy {
    public final /* synthetic */ int f;

    public /* synthetic */ wk0(int i) {
        this.f = i;
    }

    @Override // defpackage.dy
    public final Object g(Object obj) {
        int i = this.f;
        z31 z31Var = z31.a;
        switch (i) {
            case 0:
                zk0 zk0Var = (zk0) obj;
                int i2 = PingActivity.L;
                i30.m(zk0Var, "it");
                i30.m(zk0Var.b, "msg");
                break;
            case 1:
                ol0 ol0Var = (ol0) obj;
                int i3 = PortActivity.K;
                i30.m(ol0Var, "it");
                i30.m(ol0Var.b, "msg");
                break;
            default:
                int i4 = RouterPasswordActivity.H;
                i30.m((hr0) obj, "it");
                break;
        }
        return z31Var;
    }
}
