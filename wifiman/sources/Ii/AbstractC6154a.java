package ii;

import Bh.InterfaceC2498h;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;

/* renamed from: ii.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6154a implements InterfaceC6164k {
    @Override // ii.InterfaceC6164k
    public Set a() {
        return i().a();
    }

    @Override // ii.InterfaceC6164k
    public Collection b(Zh.f name, Ih.b location) {
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(location, "location");
        return i().b(name, location);
    }

    @Override // ii.InterfaceC6164k
    public Set c() {
        return i().c();
    }

    @Override // ii.InterfaceC6164k
    public Collection d(Zh.f name, Ih.b location) {
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(location, "location");
        return i().d(name, location);
    }

    @Override // ii.InterfaceC6167n
    public Collection e(C6157d kindFilter, InterfaceC6835l nameFilter) {
        AbstractC6492s.i(kindFilter, "kindFilter");
        AbstractC6492s.i(nameFilter, "nameFilter");
        return i().e(kindFilter, nameFilter);
    }

    @Override // ii.InterfaceC6164k
    public Set f() {
        return i().f();
    }

    @Override // ii.InterfaceC6167n
    public InterfaceC2498h g(Zh.f name, Ih.b location) {
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(location, "location");
        return i().g(name, location);
    }

    public final InterfaceC6164k h() {
        if (!(i() instanceof AbstractC6154a)) {
            return i();
        }
        InterfaceC6164k interfaceC6164kI = i();
        AbstractC6492s.g(interfaceC6164kI, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter");
        return ((AbstractC6154a) interfaceC6164kI).h();
    }

    protected abstract InterfaceC6164k i();
}
