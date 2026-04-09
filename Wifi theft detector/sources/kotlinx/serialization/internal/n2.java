package kotlinx.serialization.internal;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class n2 extends p1 {

    /* renamed from: a, reason: collision with root package name */
    public short[] f22889a;

    /* renamed from: b, reason: collision with root package name */
    public int f22890b;

    public /* synthetic */ n2(short[] sArr, kotlin.jvm.internal.i iVar) {
        this(sArr);
    }

    @Override // kotlinx.serialization.internal.p1
    public /* bridge */ /* synthetic */ Object a() {
        return y8.r.c(f());
    }

    @Override // kotlinx.serialization.internal.p1
    public void b(int i10) {
        if (y8.r.u(this.f22889a) < i10) {
            short[] sArr = this.f22889a;
            short[] sArrCopyOf = Arrays.copyOf(sArr, q9.e.b(i10, y8.r.u(sArr) * 2));
            kotlin.jvm.internal.p.d(sArrCopyOf, "copyOf(this, newSize)");
            this.f22889a = y8.r.e(sArrCopyOf);
        }
    }

    @Override // kotlinx.serialization.internal.p1
    public int d() {
        return this.f22890b;
    }

    public final void e(short s10) {
        p1.c(this, 0, 1, null);
        short[] sArr = this.f22889a;
        int iD = d();
        this.f22890b = iD + 1;
        y8.r.y(sArr, iD, s10);
    }

    public short[] f() {
        short[] sArrCopyOf = Arrays.copyOf(this.f22889a, d());
        kotlin.jvm.internal.p.d(sArrCopyOf, "copyOf(this, newSize)");
        return y8.r.e(sArrCopyOf);
    }

    public n2(short[] sArr) {
        this.f22889a = sArr;
        this.f22890b = y8.r.u(sArr);
        b(10);
    }
}
