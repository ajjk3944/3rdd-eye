package oc;

import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.TypedValue;
import com.liuzh.deviceinfo.R;
import i.y;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class g extends y {
    @Override // b5.s
    public final void c0() {
        Dialog dialog = this.f1867k0;
        if (dialog instanceof f) {
            f fVar = (f) dialog;
            if (fVar.g == null) {
                fVar.f();
            }
            boolean z3 = fVar.g.I;
        }
        super.c0();
    }

    @Override // i.y, b5.s
    public Dialog e0(Bundle bundle) {
        Context contextP = p();
        int i4 = this.f1861e0;
        if (i4 == 0) {
            TypedValue typedValue = new TypedValue();
            i4 = contextP.getTheme().resolveAttribute(R.attr.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : R.style.Theme_Design_Light_BottomSheetDialog;
        }
        f fVar = new f(contextP, i4);
        fVar.f30508k = true;
        fVar.f30509l = true;
        fVar.f30514q = new d(fVar);
        fVar.d().h(1);
        TypedArray typedArrayObtainStyledAttributes = fVar.getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge});
        fVar.f30512o = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return fVar;
    }
}
