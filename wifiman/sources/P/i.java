package P;

import l0.AbstractC6532h;
import l0.C6531g;
import l0.C6537m;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    private static final float f17930a = Y0.h.j(10);

    public static final float a(Y0.d dVar, boolean z10, long j10) {
        float fK = C6531g.k(AbstractC6532h.a(C6537m.i(j10), C6537m.g(j10))) / 2.0f;
        return z10 ? fK + dVar.d1(f17930a) : fK;
    }

    public static final float b(long j10) {
        return Math.max(C6537m.i(j10), C6537m.g(j10)) * 0.3f;
    }
}
