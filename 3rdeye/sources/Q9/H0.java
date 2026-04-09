package Q9;

import java.util.Arrays;

/* compiled from: PrimitiveArraysSerializers.kt */
/* loaded from: classes3.dex */
public final class H0 extends AbstractC1551q0<b9.s> {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f11424a;

    /* renamed from: b, reason: collision with root package name */
    public int f11425b;

    @Override // Q9.AbstractC1551q0
    public final b9.s a() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f11424a, this.f11425b);
        kotlin.jvm.internal.l.e(bArrCopyOf, "copyOf(this, newSize)");
        return new b9.s(bArrCopyOf);
    }

    @Override // Q9.AbstractC1551q0
    public final void b(int i) {
        byte[] bArr = this.f11424a;
        if (bArr.length < i) {
            int length = bArr.length * 2;
            if (i < length) {
                i = length;
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i);
            kotlin.jvm.internal.l.e(bArrCopyOf, "copyOf(this, newSize)");
            this.f11424a = bArrCopyOf;
        }
    }

    @Override // Q9.AbstractC1551q0
    public final int d() {
        return this.f11425b;
    }
}
