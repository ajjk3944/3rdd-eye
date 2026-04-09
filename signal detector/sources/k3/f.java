package k3;

import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.TypedValue;
import com.apm.insight.R;
import h.y;

/* loaded from: classes.dex */
public class f extends y {
    @Override // k0.DialogInterfaceOnCancelListenerC2610n
    public final void X() {
        Dialog dialog = this.v0;
        if (dialog instanceof e) {
            boolean z6 = ((e) dialog).h().f18133W;
        }
        Z(false, false);
    }

    @Override // k0.DialogInterfaceOnCancelListenerC2610n
    public final void Y() {
        Dialog dialog = this.v0;
        if (dialog instanceof e) {
            boolean z6 = ((e) dialog).h().f18133W;
        }
        super.Y();
    }

    @Override // h.y, k0.DialogInterfaceOnCancelListenerC2610n
    public final Dialog b0(Bundle bundle) {
        Context contextM = m();
        int iA0 = a0();
        if (iA0 == 0) {
            TypedValue typedValue = new TypedValue();
            iA0 = contextM.getTheme().resolveAttribute(R.attr.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : R.style.Theme_Design_Light_BottomSheetDialog;
        }
        e eVar = new e(contextM, iA0);
        eVar.f21795j = true;
        eVar.f21796k = true;
        eVar.f21791D = new c(eVar);
        eVar.c().j(1);
        TypedArray typedArrayObtainStyledAttributes = eVar.getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge});
        eVar.f21799n = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return eVar;
    }
}
