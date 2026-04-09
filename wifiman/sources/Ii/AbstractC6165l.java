package ii;

import Bh.InterfaceC2498h;
import Bh.f0;
import Zg.AbstractC3689v;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import xi.AbstractC8543j;

/* renamed from: ii.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6165l implements InterfaceC6164k {
    @Override // ii.InterfaceC6164k
    public Set a() {
        Collection collectionE = e(C6157d.f49201v, AbstractC8543j.k());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionE) {
            if (obj instanceof f0) {
                Zh.f name = ((f0) obj).getName();
                AbstractC6492s.h(name, "getName(...)");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // ii.InterfaceC6164k
    public Collection b(Zh.f name, Ih.b location) {
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(location, "location");
        return AbstractC3689v.l();
    }

    @Override // ii.InterfaceC6164k
    public Set c() {
        Collection collectionE = e(C6157d.f49202w, AbstractC8543j.k());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionE) {
            if (obj instanceof f0) {
                Zh.f name = ((f0) obj).getName();
                AbstractC6492s.h(name, "getName(...)");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // ii.InterfaceC6164k
    public Collection d(Zh.f name, Ih.b location) {
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(location, "location");
        return AbstractC3689v.l();
    }

    @Override // ii.InterfaceC6167n
    public Collection e(C6157d kindFilter, InterfaceC6835l nameFilter) {
        AbstractC6492s.i(kindFilter, "kindFilter");
        AbstractC6492s.i(nameFilter, "nameFilter");
        return AbstractC3689v.l();
    }

    @Override // ii.InterfaceC6164k
    public Set f() {
        return null;
    }

    @Override // ii.InterfaceC6167n
    public InterfaceC2498h g(Zh.f name, Ih.b location) {
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(location, "location");
        return null;
    }
}
