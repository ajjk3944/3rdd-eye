package o;

import Zg.AbstractC3682n;
import p.AbstractC7176d;

/* renamed from: o.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7031w extends AbstractC7015f {

    /* renamed from: e, reason: collision with root package name */
    private int f55018e;

    public C7031w(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            AbstractC7176d.a("Capacity must be a positive value.");
        }
        g(S.g(i10));
    }

    private final void e() {
        this.f55018e = S.c(b()) - this.f54966d;
    }

    private final void f(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = S.f54926a;
        } else {
            jArr = new long[((i10 + 15) & (-8)) >> 3];
            AbstractC3682n.x(jArr, -9187201950435737472L, 0, 0, 6, null);
        }
        this.f54963a = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        e();
    }

    private final void g(int i10) {
        int iMax = i10 > 0 ? Math.max(7, S.f(i10)) : 0;
        this.f54965c = iMax;
        f(iMax);
        this.f54964b = new float[iMax];
    }
}
