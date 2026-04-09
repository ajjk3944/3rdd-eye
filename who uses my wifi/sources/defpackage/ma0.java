package defpackage;

import android.view.View;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.phuongpn.whousemywifi.networkscanner.MainActivity;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class ma0 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ ma0(Object obj, int i, int i2) {
        this.f = i2;
        this.h = obj;
        this.g = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f) {
            case 0:
                f2 f2Var = ((MainActivity) this.h).C;
                if (f2Var != null) {
                    ((LinearProgressIndicator) f2Var.i).setProgress(this.g);
                    return;
                } else {
                    i30.S("binding");
                    throw null;
                }
            case 1:
                ((g82) this.h).o(this.g);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.h;
                View view = (View) sideSheetBehavior.p.get();
                if (view != null) {
                    sideSheetBehavior.z(view, this.g, false);
                    return;
                }
                return;
        }
    }
}
