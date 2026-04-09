package defpackage;

import com.phuongpn.whousemywifi.networkscanner.RouterAdminActivity;
import com.phuongpn.whousemywifi.networkscanner.RouterPasswordActivity;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class fr0 extends h30 {
    public final /* synthetic */ int y;
    public final /* synthetic */ i5 z;

    public /* synthetic */ fr0(i5 i5Var, int i) {
        this.y = i;
        this.z = i5Var;
    }

    @Override // defpackage.um
    public final void q(u70 u70Var) {
        switch (this.y) {
            case 0:
                i30.l((String) u70Var.h, "getMessage(...)");
                ((RouterAdminActivity) this.z).D = null;
                break;
            default:
                i30.l((String) u70Var.h, "getMessage(...)");
                ((RouterPasswordActivity) this.z).G = null;
                break;
        }
    }

    @Override // defpackage.um
    public final void r(Object obj) {
        switch (this.y) {
            case 0:
                g30 g30Var = (g30) obj;
                i30.m(g30Var, "ad");
                ((RouterAdminActivity) this.z).D = (k52) g30Var;
                break;
            default:
                g30 g30Var2 = (g30) obj;
                i30.m(g30Var2, "ad");
                ((RouterPasswordActivity) this.z).G = (k52) g30Var2;
                break;
        }
    }
}
