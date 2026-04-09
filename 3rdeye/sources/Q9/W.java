package Q9;

import java.util.Arrays;

/* compiled from: PrimitiveArraysSerializers.kt */
/* loaded from: classes3.dex */
public final class W extends AbstractC1551q0<long[]> {

    /* renamed from: a, reason: collision with root package name */
    public long[] f11462a;

    /* renamed from: b, reason: collision with root package name */
    public int f11463b;

    @Override // Q9.AbstractC1551q0
    public final long[] a() {
        long[] jArrCopyOf = Arrays.copyOf(this.f11462a, this.f11463b);
        kotlin.jvm.internal.l.e(jArrCopyOf, "copyOf(this, newSize)");
        return jArrCopyOf;
    }

    @Override // Q9.AbstractC1551q0
    public final void b(int i) {
        long[] jArr = this.f11462a;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            long[] jArrCopyOf = Arrays.copyOf(jArr, i);
            kotlin.jvm.internal.l.e(jArrCopyOf, "copyOf(this, newSize)");
            this.f11462a = jArrCopyOf;
        }
    }

    @Override // Q9.AbstractC1551q0
    public final int d() {
        return this.f11463b;
    }
}
