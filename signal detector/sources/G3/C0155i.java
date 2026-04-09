package G3;

import com.google.android.material.button.MaterialButton;

/* renamed from: G3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0155i extends com.bumptech.glide.c {

    /* renamed from: e, reason: collision with root package name */
    public final int f1577e;

    public C0155i(int i) {
        this.f1577e = i;
    }

    @Override // com.bumptech.glide.c
    public final float A(Object obj) {
        float[] fArr = ((j) obj).f1593Q;
        if (fArr != null) {
            return fArr[this.f1577e];
        }
        return 0.0f;
    }

    @Override // com.bumptech.glide.c
    public final void L(Object obj, float f2) {
        j jVar = (j) obj;
        float[] fArr = jVar.f1593Q;
        if (fArr != null) {
            int i = this.f1577e;
            if (fArr[i] != f2) {
                fArr[i] = f2;
                F4.c cVar = jVar.f1595S;
                if (cVar != null) {
                    float fI = jVar.i();
                    MaterialButton materialButton = (MaterialButton) cVar.f1455b;
                    int i3 = (int) (fI * 0.11f);
                    if (materialButton.f18182L != i3) {
                        materialButton.f18182L = i3;
                        materialButton.j();
                        materialButton.invalidate();
                    }
                }
                jVar.invalidateSelf();
            }
        }
    }
}
