package kotlinx.serialization.internal;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class z0 extends p1 {

    /* renamed from: a, reason: collision with root package name */
    public long[] f22937a;

    /* renamed from: b, reason: collision with root package name */
    public int f22938b;

    public z0(long[] bufferWithData) {
        kotlin.jvm.internal.p.e(bufferWithData, "bufferWithData");
        this.f22937a = bufferWithData;
        this.f22938b = bufferWithData.length;
        b(10);
    }

    @Override // kotlinx.serialization.internal.p1
    public void b(int i10) {
        long[] jArr = this.f22937a;
        if (jArr.length < i10) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, q9.e.b(i10, jArr.length * 2));
            kotlin.jvm.internal.p.d(jArrCopyOf, "copyOf(this, newSize)");
            this.f22937a = jArrCopyOf;
        }
    }

    @Override // kotlinx.serialization.internal.p1
    public int d() {
        return this.f22938b;
    }

    public final void e(long j10) {
        p1.c(this, 0, 1, null);
        long[] jArr = this.f22937a;
        int iD = d();
        this.f22938b = iD + 1;
        jArr[iD] = j10;
    }

    @Override // kotlinx.serialization.internal.p1
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public long[] a() {
        long[] jArrCopyOf = Arrays.copyOf(this.f22937a, d());
        kotlin.jvm.internal.p.d(jArrCopyOf, "copyOf(this, newSize)");
        return jArrCopyOf;
    }
}
