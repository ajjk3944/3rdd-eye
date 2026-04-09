package yh;

import android.graphics.Paint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class a extends hg.d {
    public ki.e Z;

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
            ki.e eVar = new ki.e(layoutInflater.getContext());
            eVar.f28305a = new int[]{-16777216, -15724528, -14671840, -13619152, -12566464, -11513776, -10461088, -9408400, -8355712, -7303024, -6250336, -5197648, -4144960, -3092272, -2039584, -986896};
            eVar.f28306b = new String[]{"#000000", "#101010", "#202020", "#303030", "#404040", "#505050", "#606060", "#707070", "#808080", "#909090", "#A0A0A0", "#B0B0B0", "#C0C0C0", "#D0D0D0", "#E0E0E0", "#F0F0F0"};
            eVar.f28307c = new Paint(1);
            Paint paint = new Paint(1);
            eVar.f28308d = paint;
            paint.setTextSize(com.liuzh.deviceinfo.utilities.d.q(12.0f, eVar.getResources().getDisplayMetrics()));
            this.Z = eVar;
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
