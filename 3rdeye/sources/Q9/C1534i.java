package Q9;

import java.util.Arrays;

/* compiled from: PrimitiveArraysSerializers.kt */
/* renamed from: Q9.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1534i extends AbstractC1551q0<byte[]> {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f11491a;

    /* renamed from: b, reason: collision with root package name */
    public int f11492b;

    @Override // Q9.AbstractC1551q0
    public final byte[] a() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f11491a, this.f11492b);
        kotlin.jvm.internal.l.e(bArrCopyOf, "copyOf(this, newSize)");
        return bArrCopyOf;
    }

    @Override // Q9.AbstractC1551q0
    public final void b(int i) {
        byte[] bArr = this.f11491a;
        if (bArr.length < i) {
            int length = bArr.length * 2;
            if (i < length) {
                i = length;
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i);
            kotlin.jvm.internal.l.e(bArrCopyOf, "copyOf(this, newSize)");
            this.f11491a = bArrCopyOf;
        }
    }

    @Override // Q9.AbstractC1551q0
    public final int d() {
        return this.f11492b;
    }
}
