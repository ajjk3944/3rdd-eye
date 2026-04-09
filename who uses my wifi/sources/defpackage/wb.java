package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class wb extends k6 {
    @Override // defpackage.k6, defpackage.xo
    public Dialog O(Bundle bundle) {
        return new vb(i(), this.e0);
    }

    public final void R() {
        Dialog dialog = this.k0;
        if (dialog instanceof vb) {
            vb vbVar = (vb) dialog;
            if (vbVar.k == null) {
                vbVar.g();
            }
            BottomSheetBehavior bottomSheetBehavior = vbVar.k;
            if (bottomSheetBehavior.I && vbVar.o) {
                if (bottomSheetBehavior.N == 5) {
                    N(false, false);
                    return;
                }
                Dialog dialog2 = this.k0;
                if (dialog2 instanceof vb) {
                    vb vbVar2 = (vb) dialog2;
                    BottomSheetBehavior bottomSheetBehavior2 = vbVar2.k;
                    bottomSheetBehavior2.Y.remove(vbVar2.v);
                }
                tb tbVar = new tb(1, (y00) this);
                ArrayList arrayList = bottomSheetBehavior.Y;
                if (!arrayList.contains(tbVar)) {
                    arrayList.add(tbVar);
                }
                bottomSheetBehavior.I(5);
                return;
            }
        }
        N(false, false);
    }
}
