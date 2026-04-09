package Nh;

import Bh.InterfaceC2503m;
import Bh.g0;
import Dh.AbstractC2596b;
import Zg.AbstractC3689v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import pi.AbstractC7346d0;
import pi.I0;
import pi.N0;

/* loaded from: classes4.dex */
public final class c0 extends AbstractC2596b {

    /* renamed from: k, reason: collision with root package name */
    private final Mh.k f16505k;

    /* renamed from: l, reason: collision with root package name */
    private final Qh.y f16506l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(Mh.k c10, Qh.y javaTypeParameter, int i10, InterfaceC2503m containingDeclaration) {
        super(c10.e(), containingDeclaration, new Mh.g(c10, javaTypeParameter, false, 4, null), javaTypeParameter.getName(), N0.INVARIANT, false, i10, g0.f1784a, c10.a().v());
        AbstractC6492s.i(c10, "c");
        AbstractC6492s.i(javaTypeParameter, "javaTypeParameter");
        AbstractC6492s.i(containingDeclaration, "containingDeclaration");
        this.f16505k = c10;
        this.f16506l = javaTypeParameter;
    }

    private final List M0() {
        Collection upperBounds = this.f16506l.getUpperBounds();
        if (upperBounds.isEmpty()) {
            AbstractC7346d0 abstractC7346d0I = this.f16505k.d().q().i();
            AbstractC6492s.h(abstractC7346d0I, "getAnyType(...)");
            AbstractC7346d0 abstractC7346d0I2 = this.f16505k.d().q().I();
            AbstractC6492s.h(abstractC7346d0I2, "getNullableAnyType(...)");
            return AbstractC3689v.e(pi.V.e(abstractC7346d0I, abstractC7346d0I2));
        }
        Collection collection = upperBounds;
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f16505k.g().p((Qh.j) it.next(), Oh.b.b(I0.COMMON, false, false, this, 3, null)));
        }
        return arrayList;
    }

    @Override // Dh.AbstractC2602h
    protected List G0(List bounds) {
        AbstractC6492s.i(bounds, "bounds");
        return this.f16505k.a().r().r(this, bounds, this.f16505k);
    }

    @Override // Dh.AbstractC2602h
    protected void K0(pi.S type) {
        AbstractC6492s.i(type, "type");
    }

    @Override // Dh.AbstractC2602h
    protected List L0() {
        return M0();
    }
}
