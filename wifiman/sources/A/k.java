package A;

import B.AbstractC2451o;
import B.J;
import Zg.AbstractC3689v;
import java.util.List;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public final class k extends AbstractC2451o implements y {

    /* renamed from: a, reason: collision with root package name */
    private final J f91a = new J();

    /* renamed from: b, reason: collision with root package name */
    private List f92b;

    public k(InterfaceC6835l interfaceC6835l) {
        interfaceC6835l.invoke(this);
    }

    @Override // A.y
    public void a(int i10, InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2, mh.r rVar) {
        c().c(i10, new j(interfaceC6835l, interfaceC6835l2, rVar));
    }

    public final List f() {
        List list = this.f92b;
        return list == null ? AbstractC3689v.l() : list;
    }

    @Override // B.AbstractC2451o
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public J c() {
        return this.f91a;
    }
}
