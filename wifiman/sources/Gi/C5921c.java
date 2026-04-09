package gi;

import Bh.InterfaceC2495e;
import Bh.InterfaceC2498h;
import Mh.j;
import Qh.D;
import Qh.g;
import Zg.AbstractC3689v;
import ii.InterfaceC6164k;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: gi.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5921c {

    /* renamed from: a, reason: collision with root package name */
    private final j f47922a;

    /* renamed from: b, reason: collision with root package name */
    private final Kh.j f47923b;

    public C5921c(j packageFragmentProvider, Kh.j javaResolverCache) {
        AbstractC6492s.i(packageFragmentProvider, "packageFragmentProvider");
        AbstractC6492s.i(javaResolverCache, "javaResolverCache");
        this.f47922a = packageFragmentProvider;
        this.f47923b = javaResolverCache;
    }

    public final j a() {
        return this.f47922a;
    }

    public final InterfaceC2495e b(g javaClass) {
        AbstractC6492s.i(javaClass, "javaClass");
        Zh.c cVarE = javaClass.e();
        if (cVarE != null && javaClass.I() == D.SOURCE) {
            return this.f47923b.e(cVarE);
        }
        g gVarF = javaClass.f();
        if (gVarF != null) {
            InterfaceC2495e interfaceC2495eB = b(gVarF);
            InterfaceC6164k interfaceC6164kY0 = interfaceC2495eB != null ? interfaceC2495eB.y0() : null;
            InterfaceC2498h interfaceC2498hG = interfaceC6164kY0 != null ? interfaceC6164kY0.g(javaClass.getName(), Ih.d.FROM_JAVA_LOADER) : null;
            if (interfaceC2498hG instanceof InterfaceC2495e) {
                return (InterfaceC2495e) interfaceC2498hG;
            }
            return null;
        }
        if (cVarE == null) {
            return null;
        }
        j jVar = this.f47922a;
        Zh.c cVarE2 = cVarE.e();
        AbstractC6492s.h(cVarE2, "parent(...)");
        Nh.D d10 = (Nh.D) AbstractC3689v.s0(jVar.c(cVarE2));
        if (d10 != null) {
            return d10.N0(javaClass);
        }
        return null;
    }
}
