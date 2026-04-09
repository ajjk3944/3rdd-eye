package yh;

import android.graphics.Paint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import ig.l;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class f extends hg.d {
    public ki.f Z;

    @Override // b5.z
    public final void F(Bundle bundle) {
        super.F(bundle);
        i.g gVarU = U();
        wd.b bVarR = gVarU.r();
        if (bVarR != null) {
            bVarR.y();
        }
        Window window = gVarU.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.screenBrightness = 1.0f;
        window.setAttributes(attributes);
        if (c0()) {
            return;
        }
        com.liuzh.deviceinfo.utilities.d.d(U());
    }

    @Override // b5.z
    public final View G(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (this.Z == null) {
            ki.f fVar = new ki.f(layoutInflater.getContext());
            fVar.f28311c = new Paint(1);
            Paint paint = new Paint(1);
            fVar.f28312d = paint;
            fVar.f28313e = -1;
            paint.setColor(-16777216);
            this.Z = fVar;
            fVar.setFocusable(true);
            this.Z.requestFocus();
            this.Z.setOnClickListener(new e(0, this));
            this.Z.post(new l(27, this));
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
