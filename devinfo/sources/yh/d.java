package yh;

import android.graphics.Paint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ig.l;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class d extends hg.d {
    public ki.b Z;

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
        if (this.Z == null) {
            ki.b bVar = new ki.b(layoutInflater.getContext());
            bVar.f28300a = -1;
            bVar.f28301b = new Paint(1);
            this.Z = bVar;
            bVar.setCount(16);
            this.Z.setFocusable(true);
            this.Z.requestFocus();
            this.Z.setOnClickListener(new com.applovin.mediation.nativeAds.a(29, this));
            this.Z.post(new l(26, this));
        }
        return this.Z;
    }

    @Override // hg.d
    public final void g0(boolean z3) {
        if (c0()) {
            return;
        }
        com.liuzh.deviceinfo.utilities.d.d(U());
    }
}
