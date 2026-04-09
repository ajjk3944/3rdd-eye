package Q9;

import java.util.Arrays;

/* compiled from: PrimitiveArraysSerializers.kt */
/* loaded from: classes3.dex */
public final class E extends AbstractC1551q0<float[]> {

    /* renamed from: a, reason: collision with root package name */
    public float[] f11412a;

    /* renamed from: b, reason: collision with root package name */
    public int f11413b;

    @Override // Q9.AbstractC1551q0
    public final float[] a() {
        float[] fArrCopyOf = Arrays.copyOf(this.f11412a, this.f11413b);
        kotlin.jvm.internal.l.e(fArrCopyOf, "copyOf(this, newSize)");
        return fArrCopyOf;
    }

    @Override // Q9.AbstractC1551q0
    public final void b(int i) {
        float[] fArr = this.f11412a;
        if (fArr.length < i) {
            int length = fArr.length * 2;
            if (i < length) {
                i = length;
            }
            float[] fArrCopyOf = Arrays.copyOf(fArr, i);
            kotlin.jvm.internal.l.e(fArrCopyOf, "copyOf(this, newSize)");
            this.f11412a = fArrCopyOf;
        }
    }

    @Override // Q9.AbstractC1551q0
    public final int d() {
        return this.f11413b;
    }
}
