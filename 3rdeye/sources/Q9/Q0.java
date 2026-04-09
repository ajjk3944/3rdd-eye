package Q9;

import java.util.Arrays;

/* compiled from: PrimitiveArraysSerializers.kt */
/* loaded from: classes3.dex */
public final class Q0 extends AbstractC1551q0<b9.z> {

    /* renamed from: a, reason: collision with root package name */
    public short[] f11450a;

    /* renamed from: b, reason: collision with root package name */
    public int f11451b;

    @Override // Q9.AbstractC1551q0
    public final b9.z a() {
        short[] sArrCopyOf = Arrays.copyOf(this.f11450a, this.f11451b);
        kotlin.jvm.internal.l.e(sArrCopyOf, "copyOf(this, newSize)");
        return new b9.z(sArrCopyOf);
    }

    @Override // Q9.AbstractC1551q0
    public final void b(int i) {
        short[] sArr = this.f11450a;
        if (sArr.length < i) {
            int length = sArr.length * 2;
            if (i < length) {
                i = length;
            }
            short[] sArrCopyOf = Arrays.copyOf(sArr, i);
            kotlin.jvm.internal.l.e(sArrCopyOf, "copyOf(this, newSize)");
            this.f11450a = sArrCopyOf;
        }
    }

    @Override // Q9.AbstractC1551q0
    public final int d() {
        return this.f11451b;
    }
}
