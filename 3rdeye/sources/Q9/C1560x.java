package Q9;

import java.util.Arrays;

/* compiled from: PrimitiveArraysSerializers.kt */
/* renamed from: Q9.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1560x extends AbstractC1551q0<double[]> {

    /* renamed from: a, reason: collision with root package name */
    public double[] f11541a;

    /* renamed from: b, reason: collision with root package name */
    public int f11542b;

    @Override // Q9.AbstractC1551q0
    public final double[] a() {
        double[] dArrCopyOf = Arrays.copyOf(this.f11541a, this.f11542b);
        kotlin.jvm.internal.l.e(dArrCopyOf, "copyOf(this, newSize)");
        return dArrCopyOf;
    }

    @Override // Q9.AbstractC1551q0
    public final void b(int i) {
        double[] dArr = this.f11541a;
        if (dArr.length < i) {
            int length = dArr.length * 2;
            if (i < length) {
                i = length;
            }
            double[] dArrCopyOf = Arrays.copyOf(dArr, i);
            kotlin.jvm.internal.l.e(dArrCopyOf, "copyOf(this, newSize)");
            this.f11541a = dArrCopyOf;
        }
    }

    @Override // Q9.AbstractC1551q0
    public final int d() {
        return this.f11542b;
    }
}
