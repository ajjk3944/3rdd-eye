package Dh;

import Zg.AbstractC3689v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;

/* renamed from: Dh.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2606l implements Bh.T {

    /* renamed from: a, reason: collision with root package name */
    private final List f3471a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3472b;

    public C2606l(List providers, String debugName) {
        AbstractC6492s.i(providers, "providers");
        AbstractC6492s.i(debugName, "debugName");
        this.f3471a = providers;
        this.f3472b = debugName;
        providers.size();
        AbstractC3689v.n1(providers).size();
    }

    @Override // Bh.T
    public void a(Zh.c fqName, Collection packageFragments) {
        AbstractC6492s.i(fqName, "fqName");
        AbstractC6492s.i(packageFragments, "packageFragments");
        Iterator it = this.f3471a.iterator();
        while (it.hasNext()) {
            Bh.S.a((Bh.N) it.next(), fqName, packageFragments);
        }
    }

    @Override // Bh.T
    public boolean b(Zh.c fqName) {
        AbstractC6492s.i(fqName, "fqName");
        List list = this.f3471a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!Bh.S.b((Bh.N) it.next(), fqName)) {
                return false;
            }
        }
        return true;
    }

    @Override // Bh.N
    public List c(Zh.c fqName) {
        AbstractC6492s.i(fqName, "fqName");
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f3471a.iterator();
        while (it.hasNext()) {
            Bh.S.a((Bh.N) it.next(), fqName, arrayList);
        }
        return AbstractC3689v.i1(arrayList);
    }

    @Override // Bh.N
    public Collection s(Zh.c fqName, InterfaceC6835l nameFilter) {
        AbstractC6492s.i(fqName, "fqName");
        AbstractC6492s.i(nameFilter, "nameFilter");
        HashSet hashSet = new HashSet();
        Iterator it = this.f3471a.iterator();
        while (it.hasNext()) {
            hashSet.addAll(((Bh.N) it.next()).s(fqName, nameFilter));
        }
        return hashSet;
    }

    public String toString() {
        return this.f3472b;
    }
}
