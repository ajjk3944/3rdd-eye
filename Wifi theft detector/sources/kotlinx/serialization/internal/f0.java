package kotlinx.serialization.internal;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class f0 extends p1 {

    /* renamed from: a, reason: collision with root package name */
    public float[] f22851a;

    /* renamed from: b, reason: collision with root package name */
    public int f22852b;

    public f0(float[] bufferWithData) {
        kotlin.jvm.internal.p.e(bufferWithData, "bufferWithData");
        this.f22851a = bufferWithData;
        this.f22852b = bufferWithData.length;
        b(10);
    }

    @Override // kotlinx.serialization.internal.p1
    public void b(int i10) {
        float[] fArr = this.f22851a;
        if (fArr.length < i10) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, q9.e.b(i10, fArr.length * 2));
            kotlin.jvm.internal.p.d(fArrCopyOf, "copyOf(this, newSize)");
            this.f22851a = fArrCopyOf;
        }
    }

    @Override // kotlinx.serialization.internal.p1
    public int d() {
        return this.f22852b;
    }

    public final void e(float f10) {
        p1.c(this, 0, 1, null);
        float[] fArr = this.f22851a;
        int iD = d();
        this.f22852b = iD + 1;
        fArr[iD] = f10;
    }

    @Override // kotlinx.serialization.internal.p1
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public float[] a() {
        float[] fArrCopyOf = Arrays.copyOf(this.f22851a, d());
        kotlin.jvm.internal.p.d(fArrCopyOf, "copyOf(this, newSize)");
        return fArrCopyOf;
    }
}
