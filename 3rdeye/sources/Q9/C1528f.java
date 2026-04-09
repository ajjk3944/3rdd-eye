package Q9;

import java.util.Arrays;

/* compiled from: PrimitiveArraysSerializers.kt */
/* renamed from: Q9.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1528f extends AbstractC1551q0<boolean[]> {

    /* renamed from: a, reason: collision with root package name */
    public boolean[] f11479a;

    /* renamed from: b, reason: collision with root package name */
    public int f11480b;

    @Override // Q9.AbstractC1551q0
    public final boolean[] a() {
        boolean[] zArrCopyOf = Arrays.copyOf(this.f11479a, this.f11480b);
        kotlin.jvm.internal.l.e(zArrCopyOf, "copyOf(this, newSize)");
        return zArrCopyOf;
    }

    @Override // Q9.AbstractC1551q0
    public final void b(int i) {
        boolean[] zArr = this.f11479a;
        if (zArr.length < i) {
            int length = zArr.length * 2;
            if (i < length) {
                i = length;
            }
            boolean[] zArrCopyOf = Arrays.copyOf(zArr, i);
            kotlin.jvm.internal.l.e(zArrCopyOf, "copyOf(this, newSize)");
            this.f11479a = zArrCopyOf;
        }
    }

    @Override // Q9.AbstractC1551q0
    public final int d() {
        return this.f11480b;
    }
}
