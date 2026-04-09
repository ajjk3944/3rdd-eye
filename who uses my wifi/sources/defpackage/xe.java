package defpackage;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class xe extends ob1 {
    public final /* synthetic */ int q;
    public final /* synthetic */ Object r;

    public /* synthetic */ xe(int i, Object obj) {
        this.q = i;
        this.r = obj;
    }

    @Override // defpackage.ob1
    public final void p(int i) {
        switch (this.q) {
            case 0:
                break;
            default:
                al0 al0Var = (al0) this.r;
                al0Var.c = true;
                x01 x01Var = (x01) ((WeakReference) al0Var.f).get();
                if (x01Var != null) {
                    bf bfVar = (bf) x01Var;
                    bfVar.H();
                    bfVar.invalidateSelf();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.ob1
    public final void q(Typeface typeface, boolean z) {
        switch (this.q) {
            case 0:
                Chip chip = (Chip) this.r;
                bf bfVar = chip.j;
                chip.setText(bfVar.R0 ? bfVar.T : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z) {
                    al0 al0Var = (al0) this.r;
                    al0Var.c = true;
                    x01 x01Var = (x01) ((WeakReference) al0Var.f).get();
                    if (x01Var != null) {
                        bf bfVar2 = (bf) x01Var;
                        bfVar2.H();
                        bfVar2.invalidateSelf();
                        break;
                    }
                }
                break;
        }
    }

    private final void M(int i) {
    }
}
