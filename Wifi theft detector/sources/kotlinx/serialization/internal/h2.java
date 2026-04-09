package kotlinx.serialization.internal;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class h2 extends p1 {

    /* renamed from: a, reason: collision with root package name */
    public int[] f22866a;

    /* renamed from: b, reason: collision with root package name */
    public int f22867b;

    public /* synthetic */ h2(int[] iArr, kotlin.jvm.internal.i iVar) {
        this(iArr);
    }

    @Override // kotlinx.serialization.internal.p1
    public /* bridge */ /* synthetic */ Object a() {
        return y8.m.c(f());
    }

    @Override // kotlinx.serialization.internal.p1
    public void b(int i10) {
        if (y8.m.u(this.f22866a) < i10) {
            int[] iArr = this.f22866a;
            int[] iArrCopyOf = Arrays.copyOf(iArr, q9.e.b(i10, y8.m.u(iArr) * 2));
            kotlin.jvm.internal.p.d(iArrCopyOf, "copyOf(this, newSize)");
            this.f22866a = y8.m.e(iArrCopyOf);
        }
    }

    @Override // kotlinx.serialization.internal.p1
    public int d() {
        return this.f22867b;
    }

    public final void e(int i10) {
        p1.c(this, 0, 1, null);
        int[] iArr = this.f22866a;
        int iD = d();
        this.f22867b = iD + 1;
        y8.m.y(iArr, iD, i10);
    }

    public int[] f() {
        int[] iArrCopyOf = Arrays.copyOf(this.f22866a, d());
        kotlin.jvm.internal.p.d(iArrCopyOf, "copyOf(this, newSize)");
        return y8.m.e(iArrCopyOf);
    }

    public h2(int[] iArr) {
        this.f22866a = iArr;
        this.f22867b = y8.m.u(iArr);
        b(10);
    }
}
