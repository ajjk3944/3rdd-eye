package Dh;

import Zg.AbstractC3689v;
import Zg.d0;
import ii.AbstractC6156c;
import ii.AbstractC6165l;
import ii.C6157d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import xi.AbstractC8534a;

/* loaded from: classes4.dex */
public class P extends AbstractC6165l {

    /* renamed from: b, reason: collision with root package name */
    private final Bh.G f3403b;

    /* renamed from: c, reason: collision with root package name */
    private final Zh.c f3404c;

    public P(Bh.G moduleDescriptor, Zh.c fqName) {
        AbstractC6492s.i(moduleDescriptor, "moduleDescriptor");
        AbstractC6492s.i(fqName, "fqName");
        this.f3403b = moduleDescriptor;
        this.f3404c = fqName;
    }

    @Override // ii.AbstractC6165l, ii.InterfaceC6167n
    public Collection e(C6157d kindFilter, InterfaceC6835l nameFilter) {
        AbstractC6492s.i(kindFilter, "kindFilter");
        AbstractC6492s.i(nameFilter, "nameFilter");
        if (!kindFilter.a(C6157d.f49182c.f())) {
            return AbstractC3689v.l();
        }
        if (this.f3404c.d() && kindFilter.l().contains(AbstractC6156c.b.f49181a)) {
            return AbstractC3689v.l();
        }
        Collection collectionS = this.f3403b.s(this.f3404c, nameFilter);
        ArrayList arrayList = new ArrayList(collectionS.size());
        Iterator it = collectionS.iterator();
        while (it.hasNext()) {
            Zh.f fVarG = ((Zh.c) it.next()).g();
            AbstractC6492s.h(fVarG, "shortName(...)");
            if (((Boolean) nameFilter.invoke(fVarG)).booleanValue()) {
                AbstractC8534a.a(arrayList, h(fVarG));
            }
        }
        return arrayList;
    }

    @Override // ii.AbstractC6165l, ii.InterfaceC6164k
    public Set f() {
        return d0.e();
    }

    protected final Bh.U h(Zh.f name) {
        AbstractC6492s.i(name, "name");
        if (name.j()) {
            return null;
        }
        Bh.G g10 = this.f3403b;
        Zh.c cVarC = this.f3404c.c(name);
        AbstractC6492s.h(cVarC, "child(...)");
        Bh.U uY = g10.y(cVarC);
        if (uY.isEmpty()) {
            return null;
        }
        return uY;
    }

    public String toString() {
        return "subpackages of " + this.f3404c + " from " + this.f3403b;
    }
}
