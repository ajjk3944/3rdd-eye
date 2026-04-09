package Nh;

import Bh.InterfaceC2495e;
import Bh.InterfaceC2498h;
import Bh.InterfaceC2499i;
import Zg.AbstractC3682n;
import Zg.AbstractC3689v;
import Zg.d0;
import ii.AbstractC6166m;
import ii.C6157d;
import ii.InterfaceC6164k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import wi.AbstractC8399a;

/* renamed from: Nh.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3379f implements InterfaceC6164k {

    /* renamed from: f, reason: collision with root package name */
    static final /* synthetic */ th.l[] f16508f = {kotlin.jvm.internal.O.h(new kotlin.jvm.internal.F(kotlin.jvm.internal.O.b(C3379f.class), "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};

    /* renamed from: b, reason: collision with root package name */
    private final Mh.k f16509b;

    /* renamed from: c, reason: collision with root package name */
    private final D f16510c;

    /* renamed from: d, reason: collision with root package name */
    private final G f16511d;

    /* renamed from: e, reason: collision with root package name */
    private final oi.i f16512e;

    public C3379f(Mh.k c10, Qh.u jPackage, D packageFragment) {
        AbstractC6492s.i(c10, "c");
        AbstractC6492s.i(jPackage, "jPackage");
        AbstractC6492s.i(packageFragment, "packageFragment");
        this.f16509b = c10;
        this.f16510c = packageFragment;
        this.f16511d = new G(c10, jPackage, packageFragment);
        this.f16512e = c10.e().f(new C3378e(this));
    }

    private final InterfaceC6164k[] j() {
        return (InterfaceC6164k[]) oi.m.a(this.f16512e, this, f16508f[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC6164k[] k(C3379f c3379f) {
        Collection collectionValues = c3379f.f16510c.O0().values();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            InterfaceC6164k interfaceC6164kC = c3379f.f16509b.a().b().c(c3379f.f16510c, (Sh.x) it.next());
            if (interfaceC6164kC != null) {
                arrayList.add(interfaceC6164kC);
            }
        }
        return (InterfaceC6164k[]) AbstractC8399a.b(arrayList).toArray(new InterfaceC6164k[0]);
    }

    @Override // ii.InterfaceC6164k
    public Set a() {
        InterfaceC6164k[] interfaceC6164kArrJ = j();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC6164k interfaceC6164k : interfaceC6164kArrJ) {
            AbstractC3689v.C(linkedHashSet, interfaceC6164k.a());
        }
        linkedHashSet.addAll(this.f16511d.a());
        return linkedHashSet;
    }

    @Override // ii.InterfaceC6164k
    public Collection b(Zh.f name, Ih.b location) {
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(location, "location");
        l(name, location);
        G g10 = this.f16511d;
        InterfaceC6164k[] interfaceC6164kArrJ = j();
        Collection collectionB = g10.b(name, location);
        for (InterfaceC6164k interfaceC6164k : interfaceC6164kArrJ) {
            collectionB = AbstractC8399a.a(collectionB, interfaceC6164k.b(name, location));
        }
        return collectionB == null ? d0.e() : collectionB;
    }

    @Override // ii.InterfaceC6164k
    public Set c() {
        InterfaceC6164k[] interfaceC6164kArrJ = j();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC6164k interfaceC6164k : interfaceC6164kArrJ) {
            AbstractC3689v.C(linkedHashSet, interfaceC6164k.c());
        }
        linkedHashSet.addAll(this.f16511d.c());
        return linkedHashSet;
    }

    @Override // ii.InterfaceC6164k
    public Collection d(Zh.f name, Ih.b location) {
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(location, "location");
        l(name, location);
        G g10 = this.f16511d;
        InterfaceC6164k[] interfaceC6164kArrJ = j();
        Collection collectionD = g10.d(name, location);
        for (InterfaceC6164k interfaceC6164k : interfaceC6164kArrJ) {
            collectionD = AbstractC8399a.a(collectionD, interfaceC6164k.d(name, location));
        }
        return collectionD == null ? d0.e() : collectionD;
    }

    @Override // ii.InterfaceC6167n
    public Collection e(C6157d kindFilter, InterfaceC6835l nameFilter) {
        AbstractC6492s.i(kindFilter, "kindFilter");
        AbstractC6492s.i(nameFilter, "nameFilter");
        G g10 = this.f16511d;
        InterfaceC6164k[] interfaceC6164kArrJ = j();
        Collection collectionE = g10.e(kindFilter, nameFilter);
        for (InterfaceC6164k interfaceC6164k : interfaceC6164kArrJ) {
            collectionE = AbstractC8399a.a(collectionE, interfaceC6164k.e(kindFilter, nameFilter));
        }
        return collectionE == null ? d0.e() : collectionE;
    }

    @Override // ii.InterfaceC6164k
    public Set f() {
        Set setA = AbstractC6166m.a(AbstractC3682n.P(j()));
        if (setA == null) {
            return null;
        }
        setA.addAll(this.f16511d.f());
        return setA;
    }

    @Override // ii.InterfaceC6167n
    public InterfaceC2498h g(Zh.f name, Ih.b location) {
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(location, "location");
        l(name, location);
        InterfaceC2495e interfaceC2495eG = this.f16511d.g(name, location);
        if (interfaceC2495eG != null) {
            return interfaceC2495eG;
        }
        InterfaceC2498h interfaceC2498h = null;
        for (InterfaceC6164k interfaceC6164k : j()) {
            InterfaceC2498h interfaceC2498hG = interfaceC6164k.g(name, location);
            if (interfaceC2498hG != null) {
                if (!(interfaceC2498hG instanceof InterfaceC2499i) || !((Bh.C) interfaceC2498hG).L()) {
                    return interfaceC2498hG;
                }
                if (interfaceC2498h == null) {
                    interfaceC2498h = interfaceC2498hG;
                }
            }
        }
        return interfaceC2498h;
    }

    public final G i() {
        return this.f16511d;
    }

    public void l(Zh.f name, Ih.b location) {
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(location, "location");
        Hh.a.b(this.f16509b.a().l(), location, this.f16510c, name);
    }

    public String toString() {
        return "scope for " + this.f16510c;
    }
}
