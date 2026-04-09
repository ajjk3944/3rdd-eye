package ii;

import Bh.InterfaceC2495e;
import Bh.InterfaceC2498h;
import Bh.InterfaceC2499i;
import Bh.k0;
import Zg.AbstractC3689v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;

/* renamed from: ii.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6160g extends AbstractC6165l {

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6164k f49216b;

    public C6160g(InterfaceC6164k workerScope) {
        AbstractC6492s.i(workerScope, "workerScope");
        this.f49216b = workerScope;
    }

    @Override // ii.AbstractC6165l, ii.InterfaceC6164k
    public Set a() {
        return this.f49216b.a();
    }

    @Override // ii.AbstractC6165l, ii.InterfaceC6164k
    public Set c() {
        return this.f49216b.c();
    }

    @Override // ii.AbstractC6165l, ii.InterfaceC6164k
    public Set f() {
        return this.f49216b.f();
    }

    @Override // ii.AbstractC6165l, ii.InterfaceC6167n
    public InterfaceC2498h g(Zh.f name, Ih.b location) {
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(location, "location");
        InterfaceC2498h interfaceC2498hG = this.f49216b.g(name, location);
        if (interfaceC2498hG == null) {
            return null;
        }
        InterfaceC2495e interfaceC2495e = interfaceC2498hG instanceof InterfaceC2495e ? (InterfaceC2495e) interfaceC2498hG : null;
        if (interfaceC2495e != null) {
            return interfaceC2495e;
        }
        if (interfaceC2498hG instanceof k0) {
            return (k0) interfaceC2498hG;
        }
        return null;
    }

    @Override // ii.AbstractC6165l, ii.InterfaceC6167n
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public List e(C6157d kindFilter, InterfaceC6835l nameFilter) {
        AbstractC6492s.i(kindFilter, "kindFilter");
        AbstractC6492s.i(nameFilter, "nameFilter");
        C6157d c6157dN = kindFilter.n(C6157d.f49182c.c());
        if (c6157dN == null) {
            return AbstractC3689v.l();
        }
        Collection collectionE = this.f49216b.e(c6157dN, nameFilter);
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionE) {
            if (obj instanceof InterfaceC2499i) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public String toString() {
        return "Classes from " + this.f49216b;
    }
}
