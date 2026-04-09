package dn;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import kotlin.Metadata;
import o4.p;
import qk.l;
import qk.m;
import y1.b1;
import y1.v1;
import zt.f0;
import zt.o0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ldn/d;", "Lo4/p;", "<init>", "()V", "dn/b", "openSignal_externalRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d extends p {
    public b M0;
    public final o0 N0 = f0.a(new fn.a(l.connectivity_assistant_starting_title, l.connectivity_assistant_starting_status, l.connectivity_assistant_starting_description, null, bh.g.TESTING, null, l.connectivity_assistant_button_cancel_label, null, fn.c.CANCEL, new bn.c("", 0), 168));

    @Override // o4.p, androidx.fragment.app.b
    public final void D(Bundle bundle) {
        super.D(bundle);
        i0(m.DialogTheme_FullscreenComposeDialog);
        this.C0 = false;
        Dialog dialog = this.H0;
        if (dialog != null) {
            dialog.setCancelable(false);
        }
    }

    @Override // androidx.fragment.app.b
    public final View F(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        br.l.e(layoutInflater, "inflater");
        super.F(layoutInflater, viewGroup, bundle);
        b1 b1Var = new b1(X());
        b1Var.setViewCompositionStrategy(v1.f25786a);
        b1Var.setContent(new v0.d(new a(this, 0), -140845245, true));
        return b1Var;
    }

    @Override // o4.p, androidx.fragment.app.b
    public final void Q() {
        Window window;
        super.Q();
        Dialog dialog = this.H0;
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setBackgroundDrawableResource(qk.f.bg_rounded_white);
    }
}
