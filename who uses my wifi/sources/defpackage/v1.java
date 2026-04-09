package defpackage;

import android.content.Context;
import android.view.View;
import com.phuongpn.whousemywifi.networkscanner.R;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class v1 extends zd0 {
    public final /* synthetic */ int l = 1;
    public final /* synthetic */ y1 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(y1 y1Var, Context context, od0 od0Var, View view) {
        super(context, od0Var, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.m = y1Var;
        this.f = 8388613;
        zs1 zs1Var = y1Var.B;
        this.h = zs1Var;
        xd0 xd0Var = this.i;
        if (xd0Var != null) {
            xd0Var.d(zs1Var);
        }
    }

    @Override // defpackage.zd0
    public final void c() {
        switch (this.l) {
            case 0:
                y1 y1Var = this.m;
                y1Var.y = null;
                y1Var.getClass();
                super.c();
                break;
            default:
                y1 y1Var2 = this.m;
                od0 od0Var = y1Var2.h;
                if (od0Var != null) {
                    od0Var.c(true);
                }
                y1Var2.x = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(y1 y1Var, Context context, uy0 uy0Var, View view) {
        super(context, uy0Var, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.m = y1Var;
        if ((uy0Var.A.x & 32) != 32) {
            View view2 = y1Var.n;
            this.e = view2 == null ? (View) y1Var.m : view2;
        }
        zs1 zs1Var = y1Var.B;
        this.h = zs1Var;
        xd0 xd0Var = this.i;
        if (xd0Var != null) {
            xd0Var.d(zs1Var);
        }
    }
}
