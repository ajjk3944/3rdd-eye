package Gh;

import Qh.InterfaceC3444a;
import Zg.AbstractC3689v;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;

/* loaded from: classes4.dex */
public final class B extends u implements Qh.u {

    /* renamed from: a, reason: collision with root package name */
    private final Zh.c f7443a;

    public B(Zh.c fqName) {
        AbstractC6492s.i(fqName, "fqName");
        this.f7443a = fqName;
    }

    @Override // Qh.u
    public Zh.c e() {
        return this.f7443a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof B) && AbstractC6492s.d(e(), ((B) obj).e());
    }

    @Override // Qh.InterfaceC3447d
    public boolean h() {
        return false;
    }

    public int hashCode() {
        return e().hashCode();
    }

    @Override // Qh.InterfaceC3447d
    public InterfaceC3444a l(Zh.c fqName) {
        AbstractC6492s.i(fqName, "fqName");
        return null;
    }

    @Override // Qh.u
    public Collection q(InterfaceC6835l nameFilter) {
        AbstractC6492s.i(nameFilter, "nameFilter");
        return AbstractC3689v.l();
    }

    public String toString() {
        return B.class.getName() + ": " + e();
    }

    @Override // Qh.u
    public Collection z() {
        return AbstractC3689v.l();
    }

    @Override // Qh.InterfaceC3447d
    public List getAnnotations() {
        return AbstractC3689v.l();
    }
}
