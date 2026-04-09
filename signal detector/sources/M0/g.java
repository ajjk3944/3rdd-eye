package M0;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;

/* loaded from: classes.dex */
public final class g implements TypeEvaluator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2641a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2642b;

    public g(int i) {
        this.f2641a = i;
        switch (i) {
            case 1:
                this.f2642b = new FloatEvaluator();
                break;
        }
    }

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f2, Object obj, Object obj2) {
        switch (this.f2641a) {
            case 0:
                J.e[] eVarArr = (J.e[]) obj;
                J.e[] eVarArr2 = (J.e[]) obj2;
                if (!com.bumptech.glide.d.h(eVarArr, eVarArr2)) {
                    throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
                }
                if (!com.bumptech.glide.d.h((J.e[]) this.f2642b, eVarArr)) {
                    this.f2642b = com.bumptech.glide.d.p(eVarArr);
                }
                for (int i = 0; i < eVarArr.length; i++) {
                    J.e eVar = ((J.e[]) this.f2642b)[i];
                    J.e eVar2 = eVarArr[i];
                    J.e eVar3 = eVarArr2[i];
                    eVar.getClass();
                    eVar.f2012a = eVar2.f2012a;
                    int i3 = 0;
                    while (true) {
                        float[] fArr = eVar2.f2013b;
                        if (i3 < fArr.length) {
                            eVar.f2013b[i3] = (eVar3.f2013b[i3] * f2) + ((1.0f - f2) * fArr[i3]);
                            i3++;
                        }
                    }
                }
                return (J.e[]) this.f2642b;
            default:
                float fFloatValue = ((FloatEvaluator) this.f2642b).evaluate(f2, (Number) obj, (Number) obj2).floatValue();
                if (fFloatValue < 0.1f) {
                    fFloatValue = 0.0f;
                }
                return Float.valueOf(fFloatValue);
        }
    }
}
