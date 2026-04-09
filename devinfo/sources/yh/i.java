package yh;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ki.m;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i extends hg.d {
    @Override // b5.z
    public final void F(Bundle bundle) {
        super.F(bundle);
        wd.b bVarR = U().r();
        if (bVarR != null) {
            bVarR.y();
        }
        if (c0()) {
            return;
        }
        com.liuzh.deviceinfo.utilities.d.d(U());
    }

    @Override // b5.z
    public final View G(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        k.e(layoutInflater, "inflater");
        Context context = layoutInflater.getContext();
        k.d(context, "getContext(...)");
        return new m(context);
    }

    @Override // hg.d
    public final void g0(boolean z3) {
        if (c0()) {
            return;
        }
        com.liuzh.deviceinfo.utilities.d.d(U());
    }
}
