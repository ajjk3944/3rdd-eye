package kotlinx.serialization.internal;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class k2 extends p1 {

    /* renamed from: a, reason: collision with root package name */
    public long[] f22878a;

    /* renamed from: b, reason: collision with root package name */
    public int f22879b;

    public /* synthetic */ k2(long[] jArr, kotlin.jvm.internal.i iVar) {
        this(jArr);
    }

    @Override // kotlinx.serialization.internal.p1
    public /* bridge */ /* synthetic */ Object a() {
        return y8.o.c(f());
    }

    @Override // kotlinx.serialization.internal.p1
    public void b(int i10) {
        if (y8.o.u(this.f22878a) < i10) {
            long[] jArr = this.f22878a;
            long[] jArrCopyOf = Arrays.copyOf(jArr, q9.e.b(i10, y8.o.u(jArr) * 2));
            kotlin.jvm.internal.p.d(jArrCopyOf, "copyOf(this, newSize)");
            this.f22878a = y8.o.e(jArrCopyOf);
        }
    }

    @Override // kotlinx.serialization.internal.p1
    public int d() {
        return this.f22879b;
    }

    public final void e(long j10) {
        p1.c(this, 0, 1, null);
        long[] jArr = this.f22878a;
        int iD = d();
        this.f22879b = iD + 1;
        y8.o.y(jArr, iD, j10);
    }

    public long[] f() {
        long[] jArrCopyOf = Arrays.copyOf(this.f22878a, d());
        kotlin.jvm.internal.p.d(jArrCopyOf, "copyOf(this, newSize)");
        return y8.o.e(jArrCopyOf);
    }

    public k2(long[] jArr) {
        this.f22878a = jArr;
        this.f22879b = y8.o.u(jArr);
        b(10);
    }
}
