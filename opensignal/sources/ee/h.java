package ee;

import com.google.android.gms.internal.measurement.y3;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public final class h extends y3 {

    /* renamed from: b, reason: collision with root package name */
    public final int f8112b;

    public h(int i10) {
        this.f8112b = i10;
    }

    @Override // com.google.android.gms.internal.measurement.y3
    public final void O(v vVar, float f10) {
        i iVar = (i) vVar;
        float[] fArr = iVar.Y;
        if (fArr != null) {
            int i10 = this.f8112b;
            if (fArr[i10] != f10) {
                fArr[i10] = f10;
                io.sentry.android.replay.capture.e eVar = iVar.f8116a0;
                if (eVar != null) {
                    float fI = iVar.i();
                    MaterialButton materialButton = (MaterialButton) eVar.f11882d;
                    int i11 = (int) (fI * 0.11f);
                    if (materialButton.T != i11) {
                        materialButton.T = i11;
                        materialButton.j();
                        materialButton.invalidate();
                    }
                }
                iVar.invalidateSelf();
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.y3
    public final float z(v vVar) {
        float[] fArr = ((i) vVar).Y;
        if (fArr != null) {
            return fArr[this.f8112b];
        }
        return 0.0f;
    }
}
