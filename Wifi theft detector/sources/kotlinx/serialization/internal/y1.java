package kotlinx.serialization.internal;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class y1 extends p1 {

    /* renamed from: a, reason: collision with root package name */
    public short[] f22933a;

    /* renamed from: b, reason: collision with root package name */
    public int f22934b;

    public y1(short[] bufferWithData) {
        kotlin.jvm.internal.p.e(bufferWithData, "bufferWithData");
        this.f22933a = bufferWithData;
        this.f22934b = bufferWithData.length;
        b(10);
    }

    @Override // kotlinx.serialization.internal.p1
    public void b(int i10) {
        short[] sArr = this.f22933a;
        if (sArr.length < i10) {
            short[] sArrCopyOf = Arrays.copyOf(sArr, q9.e.b(i10, sArr.length * 2));
            kotlin.jvm.internal.p.d(sArrCopyOf, "copyOf(this, newSize)");
            this.f22933a = sArrCopyOf;
        }
    }

    @Override // kotlinx.serialization.internal.p1
    public int d() {
        return this.f22934b;
    }

    public final void e(short s10) {
        p1.c(this, 0, 1, null);
        short[] sArr = this.f22933a;
        int iD = d();
        this.f22934b = iD + 1;
        sArr[iD] = s10;
    }

    @Override // kotlinx.serialization.internal.p1
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public short[] a() {
        short[] sArrCopyOf = Arrays.copyOf(this.f22933a, d());
        kotlin.jvm.internal.p.d(sArrCopyOf, "copyOf(this, newSize)");
        return sArrCopyOf;
    }
}
