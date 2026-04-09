package Q9;

import java.util.Arrays;

/* compiled from: PrimitiveArraysSerializers.kt */
/* loaded from: classes3.dex */
public final class O extends AbstractC1551q0<int[]> {

    /* renamed from: a, reason: collision with root package name */
    public int[] f11442a;

    /* renamed from: b, reason: collision with root package name */
    public int f11443b;

    @Override // Q9.AbstractC1551q0
    public final int[] a() {
        int[] iArrCopyOf = Arrays.copyOf(this.f11442a, this.f11443b);
        kotlin.jvm.internal.l.e(iArrCopyOf, "copyOf(this, newSize)");
        return iArrCopyOf;
    }

    @Override // Q9.AbstractC1551q0
    public final void b(int i) {
        int[] iArr = this.f11442a;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i);
            kotlin.jvm.internal.l.e(iArrCopyOf, "copyOf(this, newSize)");
            this.f11442a = iArrCopyOf;
        }
    }

    @Override // Q9.AbstractC1551q0
    public final int d() {
        return this.f11443b;
    }
}
