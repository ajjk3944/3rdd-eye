package Q9;

import java.util.Arrays;

/* compiled from: PrimitiveArraysSerializers.kt */
/* loaded from: classes3.dex */
public final class z0 extends AbstractC1551q0<short[]> {

    /* renamed from: a, reason: collision with root package name */
    public short[] f11546a;

    /* renamed from: b, reason: collision with root package name */
    public int f11547b;

    @Override // Q9.AbstractC1551q0
    public final short[] a() {
        short[] sArrCopyOf = Arrays.copyOf(this.f11546a, this.f11547b);
        kotlin.jvm.internal.l.e(sArrCopyOf, "copyOf(this, newSize)");
        return sArrCopyOf;
    }

    @Override // Q9.AbstractC1551q0
    public final void b(int i) {
        short[] sArr = this.f11546a;
        if (sArr.length < i) {
            int length = sArr.length * 2;
            if (i < length) {
                i = length;
            }
            short[] sArrCopyOf = Arrays.copyOf(sArr, i);
            kotlin.jvm.internal.l.e(sArrCopyOf, "copyOf(this, newSize)");
            this.f11546a = sArrCopyOf;
        }
    }

    @Override // Q9.AbstractC1551q0
    public final int d() {
        return this.f11547b;
    }
}
