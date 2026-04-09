package c4;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;

/* compiled from: FloatingActionButtonImpl.java */
/* loaded from: classes2.dex */
public final class d implements TypeEvaluator<Float> {

    /* renamed from: a, reason: collision with root package name */
    public FloatEvaluator f18483a;

    @Override // android.animation.TypeEvaluator
    public final Float evaluate(float f10, Float f11, Float f12) {
        float fFloatValue = this.f18483a.evaluate(f10, (Number) f11, (Number) f12).floatValue();
        if (fFloatValue < 0.1f) {
            fFloatValue = 0.0f;
        }
        return Float.valueOf(fFloatValue);
    }
}
