package k6;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f implements TypeEvaluator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27981a;

    /* renamed from: b, reason: collision with root package name */
    public Object f27982b;

    public f(int i4) {
        this.f27981a = i4;
        switch (i4) {
            case 1:
                this.f27982b = new FloatEvaluator();
                break;
        }
    }

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f10, Object obj, Object obj2) {
        switch (this.f27981a) {
            case 0:
                v3.d[] dVarArr = (v3.d[]) obj;
                v3.d[] dVarArr2 = (v3.d[]) obj2;
                if (!wb.e.e(dVarArr, dVarArr2)) {
                    throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
                }
                if (!wb.e.e((v3.d[]) this.f27982b, dVarArr)) {
                    this.f27982b = wb.e.n(dVarArr);
                }
                for (int i4 = 0; i4 < dVarArr.length; i4++) {
                    v3.d dVar = ((v3.d[]) this.f27982b)[i4];
                    v3.d dVar2 = dVarArr[i4];
                    v3.d dVar3 = dVarArr2[i4];
                    dVar.getClass();
                    dVar.f35798a = dVar2.f35798a;
                    int i10 = 0;
                    while (true) {
                        float[] fArr = dVar2.f35799b;
                        if (i10 < fArr.length) {
                            dVar.f35799b[i10] = (dVar3.f35799b[i10] * f10) + ((1.0f - f10) * fArr[i10]);
                            i10++;
                        }
                    }
                }
                return (v3.d[]) this.f27982b;
            default:
                float fFloatValue = ((FloatEvaluator) this.f27982b).evaluate(f10, (Number) obj, (Number) obj2).floatValue();
                if (fFloatValue < 0.1f) {
                    fFloatValue = 0.0f;
                }
                return Float.valueOf(fFloatValue);
        }
    }
}
