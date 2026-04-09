package Q9;

import java.util.Arrays;

/* compiled from: PrimitiveArraysSerializers.kt */
/* loaded from: classes3.dex */
public final class N0 extends AbstractC1551q0<b9.w> {

    /* renamed from: a, reason: collision with root package name */
    public long[] f11440a;

    /* renamed from: b, reason: collision with root package name */
    public int f11441b;

    @Override // Q9.AbstractC1551q0
    public final b9.w a() {
        long[] jArrCopyOf = Arrays.copyOf(this.f11440a, this.f11441b);
        kotlin.jvm.internal.l.e(jArrCopyOf, "copyOf(this, newSize)");
        return new b9.w(jArrCopyOf);
    }

    @Override // Q9.AbstractC1551q0
    public final void b(int i) {
        long[] jArr = this.f11440a;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            long[] jArrCopyOf = Arrays.copyOf(jArr, i);
            kotlin.jvm.internal.l.e(jArrCopyOf, "copyOf(this, newSize)");
            this.f11440a = jArrCopyOf;
        }
    }

    @Override // Q9.AbstractC1551q0
    public final int d() {
        return this.f11441b;
    }
}
