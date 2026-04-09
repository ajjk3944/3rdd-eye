package tg;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.f1;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import j2.z0;
import nk.v;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g extends hg.b {

    /* renamed from: p0, reason: collision with root package name */
    public final f1 f34572p0 = new f1(v.a(zf.g.class), new f(this, 0), new f(this, 2), new f(this, 1));

    @Override // b5.z
    public final View G(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        nk.k.e(layoutInflater, "inflater");
        return new z0(W());
    }

    @Override // b5.z
    public final void R(View view, Bundle bundle) {
        nk.k.e(view, "view");
        ((z0) view).setContent(new c1.h(-1851030357, true, new c(this, 0, (byte) 0)));
    }

    @Override // hg.b
    public final void j0(oc.f fVar) {
        fVar.setCanceledOnTouchOutside(false);
    }

    @Override // hg.b
    public final void k0(View view, BottomSheetBehavior bottomSheetBehavior) {
        bottomSheetBehavior.J = true;
        bottomSheetBehavior.J(3);
        bottomSheetBehavior.K = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l0(int r38, u0.p r39) {
        /*
            Method dump skipped, instructions count: 936
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tg.g.l0(int, u0.p):void");
    }

    @Override // b5.s, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        nk.k.e(dialogInterface, "dialog");
        cg.a aVar = cg.a.f2848b;
        Bundle bundle = new Bundle();
        bundle.putString("action", "back");
        aVar.f(bundle, "exitcfm_dialog");
        i.g gVarN = n();
        if (gVarN != null) {
            gVarN.finish();
        }
    }
}
