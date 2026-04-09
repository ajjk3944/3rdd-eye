package r0;

import Y0.n;
import Y0.s;
import m0.AbstractC6665E0;
import m0.J0;

/* renamed from: r0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7552b {
    public static final C7551a a(J0 j02, long j10, long j11, int i10) {
        C7551a c7551a = new C7551a(j02, j10, j11, null);
        c7551a.o(i10);
        return c7551a;
    }

    public static /* synthetic */ C7551a b(J0 j02, long j10, long j11, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j10 = n.f24536b.a();
        }
        long j12 = j10;
        if ((i11 & 4) != 0) {
            j11 = s.a(j02.getWidth(), j02.getHeight());
        }
        long j13 = j11;
        if ((i11 & 8) != 0) {
            i10 = AbstractC6665E0.f52788a.a();
        }
        return a(j02, j12, j13, i10);
    }
}
