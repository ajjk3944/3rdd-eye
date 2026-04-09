package Mh;

import Bh.T;
import Jh.AbstractC3125t;
import Mh.p;
import Nh.D;
import Qh.u;
import Zg.AbstractC3689v;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import oi.InterfaceC7140a;
import xi.AbstractC8534a;

/* loaded from: classes4.dex */
public final class j implements T {

    /* renamed from: a, reason: collision with root package name */
    private final k f13210a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC7140a f13211b;

    public j(d components) {
        AbstractC6492s.i(components, "components");
        k kVar = new k(components, p.a.f13224a, Yg.n.c(null));
        this.f13210a = kVar;
        this.f13211b = kVar.e().c();
    }

    private final D e(Zh.c cVar) {
        u uVarA = AbstractC3125t.a(this.f13210a.a().d(), cVar, false, 2, null);
        if (uVarA == null) {
            return null;
        }
        return (D) this.f13211b.a(cVar, new i(this, uVarA));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final D f(j jVar, u uVar) {
        return new D(jVar.f13210a, uVar);
    }

    @Override // Bh.T
    public void a(Zh.c fqName, Collection packageFragments) {
        AbstractC6492s.i(fqName, "fqName");
        AbstractC6492s.i(packageFragments, "packageFragments");
        AbstractC8534a.a(packageFragments, e(fqName));
    }

    @Override // Bh.T
    public boolean b(Zh.c fqName) {
        AbstractC6492s.i(fqName, "fqName");
        return AbstractC3125t.a(this.f13210a.a().d(), fqName, false, 2, null) == null;
    }

    @Override // Bh.N
    public List c(Zh.c fqName) {
        AbstractC6492s.i(fqName, "fqName");
        return AbstractC3689v.p(e(fqName));
    }

    @Override // Bh.N
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public List s(Zh.c fqName, InterfaceC6835l nameFilter) {
        AbstractC6492s.i(fqName, "fqName");
        AbstractC6492s.i(nameFilter, "nameFilter");
        D dE = e(fqName);
        List listQ0 = dE != null ? dE.Q0() : null;
        return listQ0 == null ? AbstractC3689v.l() : listQ0;
    }

    public String toString() {
        return "LazyJavaPackageFragmentProvider of module " + this.f13210a.a().m();
    }
}
