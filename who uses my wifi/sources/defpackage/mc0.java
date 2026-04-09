package defpackage;

import com.google.android.material.button.MaterialButton;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class mc0 extends uk2 {
    public final int p;

    public mc0(int i) {
        this.p = i;
    }

    @Override // defpackage.uk2
    public final float p(Object obj) {
        float[] fArr = ((nc0) obj).H;
        if (fArr != null) {
            return fArr[this.p];
        }
        return 0.0f;
    }

    @Override // defpackage.uk2
    public final void w(Object obj, float f) {
        nc0 nc0Var = (nc0) obj;
        float[] fArr = nc0Var.H;
        if (fArr != null) {
            int i = this.p;
            if (fArr[i] != f) {
                fArr[i] = f;
                dk dkVar = nc0Var.J;
                if (dkVar != null) {
                    float fH = nc0Var.h();
                    MaterialButton materialButton = (MaterialButton) dkVar.f;
                    int i2 = (int) (fH * 0.11f);
                    if (materialButton.C != i2) {
                        materialButton.C = i2;
                        materialButton.j();
                        materialButton.invalidate();
                    }
                }
                nc0Var.invalidateSelf();
            }
        }
    }
}
