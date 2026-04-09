package ed;

import com.google.android.material.button.MaterialButton;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i extends ci.b {

    /* renamed from: k, reason: collision with root package name */
    public final int f23314k;

    public i(int i4) {
        this.f23314k = i4;
    }

    @Override // ci.b
    public final void A(y yVar, float f10) {
        j jVar = (j) yVar;
        float[] fArr = jVar.C;
        if (fArr != null) {
            int i4 = this.f23314k;
            if (fArr[i4] != f10) {
                fArr[i4] = f10;
                lf.e eVar = jVar.E;
                if (eVar != null) {
                    float fI = jVar.i();
                    MaterialButton materialButton = (MaterialButton) eVar.f28758b;
                    int i10 = (int) (fI * 0.11f);
                    if (materialButton.f20399x != i10) {
                        materialButton.f20399x = i10;
                        materialButton.j();
                        materialButton.invalidate();
                    }
                }
                jVar.invalidateSelf();
            }
        }
    }

    @Override // ci.b
    public final float q(y yVar) {
        float[] fArr = ((j) yVar).C;
        if (fArr != null) {
            return fArr[this.f23314k];
        }
        return 0.0f;
    }
}
