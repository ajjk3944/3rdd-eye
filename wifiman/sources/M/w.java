package M;

import l0.AbstractC6532h;
import l0.C6531g;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    private static final float f12305a;

    /* renamed from: b, reason: collision with root package name */
    private static final float f12306b;

    /* renamed from: c, reason: collision with root package name */
    private static final J0.v f12307c = new J0.v("SelectionHandleInfo", null, 2, null);

    static {
        float f10 = 25;
        f12305a = Y0.h.j(f10);
        f12306b = Y0.h.j(f10);
    }

    public static final long a(long j10) {
        return AbstractC6532h.a(C6531g.m(j10), C6531g.n(j10) - 1.0f);
    }

    public static final float b() {
        return f12306b;
    }

    public static final float c() {
        return f12305a;
    }

    public static final J0.v d() {
        return f12307c;
    }

    public static final boolean e(W0.i iVar, boolean z10) {
        return (iVar == W0.i.Ltr && !z10) || (iVar == W0.i.Rtl && z10);
    }

    public static final boolean f(boolean z10, W0.i iVar, boolean z11) {
        return z10 ? e(iVar, z11) : !e(iVar, z11);
    }
}
