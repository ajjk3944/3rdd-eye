package yh;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ig.l;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class b extends hg.d {
    public View Z;

    /* renamed from: a0, reason: collision with root package name */
    public int f37618a0;

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
            this.Z = new View(layoutInflater.getContext());
            h0();
            this.Z.setFocusable(true);
            this.Z.requestFocus();
            this.Z.setOnClickListener(new com.applovin.mediation.nativeAds.a(28, this));
            this.Z.post(new l(25, this));
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

    public final void h0() {
        int i4 = this.f37618a0;
        if (i4 == 0) {
            this.Z.setBackgroundColor(-65536);
            return;
        }
        if (i4 == 1) {
            this.Z.setBackgroundColor(-16711936);
            return;
        }
        if (i4 == 2) {
            this.Z.setBackgroundColor(-16776961);
        } else if (i4 == 3) {
            this.Z.setBackgroundColor(-1);
        } else {
            if (i4 != 4) {
                return;
            }
            this.Z.setBackgroundColor(-16777216);
        }
    }
}
