package s0;

import Zg.AbstractC3689v;
import java.util.List;
import m0.AbstractC6697d0;
import m0.AbstractC6735w0;
import m0.C6699e0;
import m0.C6733v0;
import m0.W0;
import m0.k1;
import m0.l1;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    private static final List f60984a = AbstractC3689v.l();

    /* renamed from: b, reason: collision with root package name */
    private static final int f60985b = k1.f52924a.a();

    /* renamed from: c, reason: collision with root package name */
    private static final int f60986c = l1.f52930a.b();

    /* renamed from: d, reason: collision with root package name */
    private static final int f60987d = AbstractC6697d0.f52884a.z();

    /* renamed from: e, reason: collision with root package name */
    private static final long f60988e = C6733v0.f52951b.d();

    /* renamed from: f, reason: collision with root package name */
    private static final int f60989f = W0.f52862a.b();

    public static final int a() {
        return f60989f;
    }

    public static final int b() {
        return f60985b;
    }

    public static final int c() {
        return f60986c;
    }

    public static final List d() {
        return f60984a;
    }

    public static final boolean e(long j10, long j11) {
        return C6733v0.r(j10) == C6733v0.r(j11) && C6733v0.q(j10) == C6733v0.q(j11) && C6733v0.o(j10) == C6733v0.o(j11);
    }

    public static final boolean f(AbstractC6735w0 abstractC6735w0) {
        if (abstractC6735w0 instanceof C6699e0) {
            C6699e0 c6699e0 = (C6699e0) abstractC6735w0;
            int iB = c6699e0.b();
            AbstractC6697d0.a aVar = AbstractC6697d0.f52884a;
            if (AbstractC6697d0.E(iB, aVar.z()) || AbstractC6697d0.E(c6699e0.b(), aVar.B())) {
                return true;
            }
        } else if (abstractC6735w0 == null) {
            return true;
        }
        return false;
    }
}
