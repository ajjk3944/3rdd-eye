package Q9;

import java.util.Arrays;

/* compiled from: PrimitiveArraysSerializers.kt */
/* loaded from: classes3.dex */
public final class K0 extends AbstractC1551q0<b9.u> {

    /* renamed from: a, reason: collision with root package name */
    public int[] f11431a;

    /* renamed from: b, reason: collision with root package name */
    public int f11432b;

    @Override // Q9.AbstractC1551q0
    public final b9.u a() {
        int[] iArrCopyOf = Arrays.copyOf(this.f11431a, this.f11432b);
        kotlin.jvm.internal.l.e(iArrCopyOf, "copyOf(this, newSize)");
        return new b9.u(iArrCopyOf);
    }

    @Override // Q9.AbstractC1551q0
    public final void b(int i) {
        int[] iArr = this.f11431a;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i);
            kotlin.jvm.internal.l.e(iArrCopyOf, "copyOf(this, newSize)");
            this.f11431a = iArrCopyOf;
        }
    }

    @Override // Q9.AbstractC1551q0
    public final int d() {
        return this.f11432b;
    }
}
