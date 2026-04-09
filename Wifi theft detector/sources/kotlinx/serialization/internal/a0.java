package kotlinx.serialization.internal;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class a0 extends p1 {

    /* renamed from: a, reason: collision with root package name */
    public double[] f22820a;

    /* renamed from: b, reason: collision with root package name */
    public int f22821b;

    public a0(double[] bufferWithData) {
        kotlin.jvm.internal.p.e(bufferWithData, "bufferWithData");
        this.f22820a = bufferWithData;
        this.f22821b = bufferWithData.length;
        b(10);
    }

    @Override // kotlinx.serialization.internal.p1
    public void b(int i10) {
        double[] dArr = this.f22820a;
        if (dArr.length < i10) {
            double[] dArrCopyOf = Arrays.copyOf(dArr, q9.e.b(i10, dArr.length * 2));
            kotlin.jvm.internal.p.d(dArrCopyOf, "copyOf(this, newSize)");
            this.f22820a = dArrCopyOf;
        }
    }

    @Override // kotlinx.serialization.internal.p1
    public int d() {
        return this.f22821b;
    }

    public final void e(double d10) {
        p1.c(this, 0, 1, null);
        double[] dArr = this.f22820a;
        int iD = d();
        this.f22821b = iD + 1;
        dArr[iD] = d10;
    }

    @Override // kotlinx.serialization.internal.p1
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public double[] a() {
        double[] dArrCopyOf = Arrays.copyOf(this.f22820a, d());
        kotlin.jvm.internal.p.d(dArrCopyOf, "copyOf(this, newSize)");
        return dArrCopyOf;
    }
}
