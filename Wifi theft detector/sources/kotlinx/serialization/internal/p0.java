package kotlinx.serialization.internal;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class p0 extends p1 {

    /* renamed from: a, reason: collision with root package name */
    public int[] f22897a;

    /* renamed from: b, reason: collision with root package name */
    public int f22898b;

    public p0(int[] bufferWithData) {
        kotlin.jvm.internal.p.e(bufferWithData, "bufferWithData");
        this.f22897a = bufferWithData;
        this.f22898b = bufferWithData.length;
        b(10);
    }

    @Override // kotlinx.serialization.internal.p1
    public void b(int i10) {
        int[] iArr = this.f22897a;
        if (iArr.length < i10) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, q9.e.b(i10, iArr.length * 2));
            kotlin.jvm.internal.p.d(iArrCopyOf, "copyOf(this, newSize)");
            this.f22897a = iArrCopyOf;
        }
    }

    @Override // kotlinx.serialization.internal.p1
    public int d() {
        return this.f22898b;
    }

    public final void e(int i10) {
        p1.c(this, 0, 1, null);
        int[] iArr = this.f22897a;
        int iD = d();
        this.f22898b = iD + 1;
        iArr[iD] = i10;
    }

    @Override // kotlinx.serialization.internal.p1
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public int[] a() {
        int[] iArrCopyOf = Arrays.copyOf(this.f22897a, d());
        kotlin.jvm.internal.p.d(iArrCopyOf, "copyOf(this, newSize)");
        return iArrCopyOf;
    }
}
