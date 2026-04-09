package Q9;

import java.util.Arrays;

/* compiled from: PrimitiveArraysSerializers.kt */
/* renamed from: Q9.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1546o extends AbstractC1551q0<char[]> {

    /* renamed from: a, reason: collision with root package name */
    public char[] f11506a;

    /* renamed from: b, reason: collision with root package name */
    public int f11507b;

    @Override // Q9.AbstractC1551q0
    public final char[] a() {
        char[] cArrCopyOf = Arrays.copyOf(this.f11506a, this.f11507b);
        kotlin.jvm.internal.l.e(cArrCopyOf, "copyOf(this, newSize)");
        return cArrCopyOf;
    }

    @Override // Q9.AbstractC1551q0
    public final void b(int i) {
        char[] cArr = this.f11506a;
        if (cArr.length < i) {
            int length = cArr.length * 2;
            if (i < length) {
                i = length;
            }
            char[] cArrCopyOf = Arrays.copyOf(cArr, i);
            kotlin.jvm.internal.l.e(cArrCopyOf, "copyOf(this, newSize)");
            this.f11506a = cArrCopyOf;
        }
    }

    @Override // Q9.AbstractC1551q0
    public final int d() {
        return this.f11507b;
    }
}
