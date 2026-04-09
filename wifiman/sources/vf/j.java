package Vf;

import T.AbstractC3561w;
import T.H0;
import Zg.AbstractC3689v;
import m0.AbstractC6697d0;
import m0.C6733v0;
import mh.InterfaceC6824a;
import r.AbstractC7535j;
import r.EnumC7520b0;
import r.G;
import r.N;

/* loaded from: classes4.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    private static final h f23423a;

    /* renamed from: b, reason: collision with root package name */
    private static final H0 f23424b;

    static {
        N nE = AbstractC7535j.e(g.a(800, 1500, G.d()), EnumC7520b0.Restart, 0L, 4, null);
        int i10 = AbstractC6697d0.f52884a.i();
        C6733v0.a aVar = C6733v0.f52951b;
        f23423a = new h(nE, i10, 15.0f, AbstractC3689v.o(C6733v0.g(C6733v0.k(aVar.f(), 0.25f, 0.0f, 0.0f, 0.0f, 14, null)), C6733v0.g(C6733v0.k(aVar.f(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null)), C6733v0.g(C6733v0.k(aVar.f(), 0.25f, 0.0f, 0.0f, 0.0f, 14, null))), AbstractC3689v.o(Float.valueOf(0.0f), Float.valueOf(0.5f), Float.valueOf(1.0f)), Y0.h.j(400), null);
        f23424b = AbstractC3561w.f(new InterfaceC6824a() { // from class: Vf.i
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return j.b();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h b() {
        return f23423a;
    }

    public static final h c() {
        return f23423a;
    }

    public static final H0 d() {
        return f23424b;
    }
}
