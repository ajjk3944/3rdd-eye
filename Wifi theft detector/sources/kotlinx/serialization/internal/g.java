package kotlinx.serialization.internal;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class g extends p1 {

    /* renamed from: a, reason: collision with root package name */
    public boolean[] f22854a;

    /* renamed from: b, reason: collision with root package name */
    public int f22855b;

    public g(boolean[] bufferWithData) {
        kotlin.jvm.internal.p.e(bufferWithData, "bufferWithData");
        this.f22854a = bufferWithData;
        this.f22855b = bufferWithData.length;
        b(10);
    }

    @Override // kotlinx.serialization.internal.p1
    public void b(int i10) {
        boolean[] zArr = this.f22854a;
        if (zArr.length < i10) {
            boolean[] zArrCopyOf = Arrays.copyOf(zArr, q9.e.b(i10, zArr.length * 2));
            kotlin.jvm.internal.p.d(zArrCopyOf, "copyOf(this, newSize)");
            this.f22854a = zArrCopyOf;
        }
    }

    @Override // kotlinx.serialization.internal.p1
    public int d() {
        return this.f22855b;
    }

    public final void e(boolean z10) {
        p1.c(this, 0, 1, null);
        boolean[] zArr = this.f22854a;
        int iD = d();
        this.f22855b = iD + 1;
        zArr[iD] = z10;
    }

    @Override // kotlinx.serialization.internal.p1
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean[] a() {
        boolean[] zArrCopyOf = Arrays.copyOf(this.f22854a, d());
        kotlin.jvm.internal.p.d(zArrCopyOf, "copyOf(this, newSize)");
        return zArrCopyOf;
    }
}
