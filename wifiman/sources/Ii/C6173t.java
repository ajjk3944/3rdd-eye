package ii;

import Bh.InterfaceC2498h;
import Bh.InterfaceC2503m;
import Bh.i0;
import ci.AbstractC4268e;
import ii.InterfaceC6167n;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import pi.E0;
import pi.G0;
import xi.AbstractC8534a;

/* renamed from: ii.t, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6173t implements InterfaceC6164k {

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6164k f49233b;

    /* renamed from: c, reason: collision with root package name */
    private final Yg.m f49234c;

    /* renamed from: d, reason: collision with root package name */
    private final G0 f49235d;

    /* renamed from: e, reason: collision with root package name */
    private Map f49236e;

    /* renamed from: f, reason: collision with root package name */
    private final Yg.m f49237f;

    public C6173t(InterfaceC6164k workerScope, G0 givenSubstitutor) {
        AbstractC6492s.i(workerScope, "workerScope");
        AbstractC6492s.i(givenSubstitutor, "givenSubstitutor");
        this.f49233b = workerScope;
        this.f49234c = Yg.n.b(new C6171r(givenSubstitutor));
        E0 e0J = givenSubstitutor.j();
        AbstractC6492s.h(e0J, "getSubstitution(...)");
        this.f49235d = AbstractC4268e.h(e0J, false, 1, null).c();
        this.f49237f = Yg.n.b(new C6172s(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection h(C6173t c6173t) {
        return c6173t.m(InterfaceC6167n.a.a(c6173t.f49233b, null, null, 3, null));
    }

    private final Collection k() {
        return (Collection) this.f49237f.getValue();
    }

    private final InterfaceC2503m l(InterfaceC2503m interfaceC2503m) {
        if (this.f49235d.k()) {
            return interfaceC2503m;
        }
        if (this.f49236e == null) {
            this.f49236e = new HashMap();
        }
        Map map = this.f49236e;
        AbstractC6492s.f(map);
        Object objC = map.get(interfaceC2503m);
        if (objC == null) {
            if (!(interfaceC2503m instanceof i0)) {
                throw new IllegalStateException(("Unknown descriptor in scope: " + interfaceC2503m).toString());
            }
            objC = ((i0) interfaceC2503m).c(this.f49235d);
            if (objC == null) {
                throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + interfaceC2503m + " substitution fails");
            }
            map.put(interfaceC2503m, objC);
        }
        InterfaceC2503m interfaceC2503m2 = (InterfaceC2503m) objC;
        AbstractC6492s.g(interfaceC2503m2, "null cannot be cast to non-null type D of org.jetbrains.kotlin.resolve.scopes.SubstitutingScope.substitute");
        return interfaceC2503m2;
    }

    private final Collection m(Collection collection) {
        if (this.f49235d.k() || collection.isEmpty()) {
            return collection;
        }
        LinkedHashSet linkedHashSetG = AbstractC8534a.g(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSetG.add(l((InterfaceC2503m) it.next()));
        }
        return linkedHashSetG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 n(G0 g02) {
        return g02.j().c();
    }

    @Override // ii.InterfaceC6164k
    public Set a() {
        return this.f49233b.a();
    }

    @Override // ii.InterfaceC6164k
    public Collection b(Zh.f name, Ih.b location) {
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(location, "location");
        return m(this.f49233b.b(name, location));
    }

    @Override // ii.InterfaceC6164k
    public Set c() {
        return this.f49233b.c();
    }

    @Override // ii.InterfaceC6164k
    public Collection d(Zh.f name, Ih.b location) {
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(location, "location");
        return m(this.f49233b.d(name, location));
    }

    @Override // ii.InterfaceC6167n
    public Collection e(C6157d kindFilter, InterfaceC6835l nameFilter) {
        AbstractC6492s.i(kindFilter, "kindFilter");
        AbstractC6492s.i(nameFilter, "nameFilter");
        return k();
    }

    @Override // ii.InterfaceC6164k
    public Set f() {
        return this.f49233b.f();
    }

    @Override // ii.InterfaceC6167n
    public InterfaceC2498h g(Zh.f name, Ih.b location) {
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(location, "location");
        InterfaceC2498h interfaceC2498hG = this.f49233b.g(name, location);
        if (interfaceC2498hG != null) {
            return (InterfaceC2498h) l(interfaceC2498hG);
        }
        return null;
    }
}
