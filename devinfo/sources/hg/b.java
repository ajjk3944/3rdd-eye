package hg;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import oc.f;
import oc.g;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class b extends g {
    @Override // oc.g, i.y, b5.s
    public final Dialog e0(Bundle bundle) {
        Dialog dialogE0 = super.e0(bundle);
        f fVar = (f) dialogE0;
        j0(fVar);
        dialogE0.setOnShowListener(new gh.c(fVar, this, 1));
        return dialogE0;
    }

    public void j0(f fVar) {
    }

    public void k0(View view, BottomSheetBehavior bottomSheetBehavior) {
    }
}
