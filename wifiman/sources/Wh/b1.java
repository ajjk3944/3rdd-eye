package wh;

import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AbstractC6480f;
import kotlin.jvm.internal.AbstractC6489o;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.AbstractC6496w;
import kotlin.jvm.internal.AbstractC6498y;
import kotlin.jvm.internal.InterfaceC6482h;
import kotlin.jvm.internal.InterfaceC6488n;
import uh.AbstractC8173a;

/* loaded from: classes4.dex */
public class b1 extends kotlin.jvm.internal.P {
    private static AbstractC8355d0 l(AbstractC6480f abstractC6480f) {
        th.f owner = abstractC6480f.getOwner();
        return owner instanceof AbstractC8355d0 ? (AbstractC8355d0) owner : C8368k.f65166d;
    }

    @Override // kotlin.jvm.internal.P
    public th.g a(AbstractC6489o abstractC6489o) {
        return new C8365i0(l(abstractC6489o), abstractC6489o.getName(), abstractC6489o.getSignature(), abstractC6489o.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.P
    public th.d b(Class cls) {
        return AbstractC8362h.m(cls);
    }

    @Override // kotlin.jvm.internal.P
    public th.f c(Class cls, String str) {
        return AbstractC8362h.n(cls);
    }

    @Override // kotlin.jvm.internal.P
    public th.i d(AbstractC6496w abstractC6496w) {
        return new C8369k0(l(abstractC6496w), abstractC6496w.getName(), abstractC6496w.getSignature(), abstractC6496w.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.P
    public th.j e(AbstractC6498y abstractC6498y) {
        return new C8373m0(l(abstractC6498y), abstractC6498y.getName(), abstractC6498y.getSignature(), abstractC6498y.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.P
    public th.m f(kotlin.jvm.internal.C c10) {
        return new B0(l(c10), c10.getName(), c10.getSignature(), c10.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.P
    public th.n g(kotlin.jvm.internal.E e10) {
        return new E0(l(e10), e10.getName(), e10.getSignature(), e10.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.P
    public th.o h(kotlin.jvm.internal.G g10) {
        return new H0(l(g10), g10.getName(), g10.getSignature());
    }

    @Override // kotlin.jvm.internal.P
    public String i(InterfaceC6488n interfaceC6488n) {
        C8365i0 c8365i0C;
        th.g gVarA = vh.d.a(interfaceC6488n);
        return (gVarA == null || (c8365i0C = j1.c(gVarA)) == null) ? super.i(interfaceC6488n) : e1.f65136a.h(c8365i0C.d0());
    }

    @Override // kotlin.jvm.internal.P
    public String j(AbstractC6494u abstractC6494u) {
        return i(abstractC6494u);
    }

    @Override // kotlin.jvm.internal.P
    public th.p k(th.e eVar, List list, boolean z10) {
        return eVar instanceof InterfaceC6482h ? AbstractC8362h.k(((InterfaceC6482h) eVar).b(), list, z10) : AbstractC8173a.b(eVar, list, z10, Collections.emptyList());
    }
}
