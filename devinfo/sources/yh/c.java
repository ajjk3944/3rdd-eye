package yh;

import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class c extends hg.d {
    public h4.e Z;

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
            h4.e eVar = new h4.e(layoutInflater.getContext());
            eVar.f24870b = new Path();
            Paint paint = new Paint(1);
            eVar.f24871c = paint;
            eVar.setBackgroundColor(-7829368);
            paint.setColor(-16777216);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(com.liuzh.deviceinfo.utilities.d.p(4.0f, eVar.getResources().getDisplayMetrics()));
            paint.setStrokeCap(Paint.Cap.ROUND);
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
