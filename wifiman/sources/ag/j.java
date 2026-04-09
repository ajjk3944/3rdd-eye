package ag;

import ag.AbstractC3846d;
import dg.InterfaceC5372b;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToLongFunction;

/* loaded from: classes4.dex */
class j extends AbstractC3846d.a implements InterfaceC5372b {
    j(Zf.b bVar, Predicate predicate, AbstractC3846d.InterfaceC1014d interfaceC1014d, Function function, Predicate predicate2, ToLongFunction toLongFunction) {
        super(bVar, predicate, interfaceC1014d, function, predicate2, toLongFunction);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ag.AbstractC3846d.a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public j g(Zf.b bVar, boolean z10, Function function, Predicate predicate, ToLongFunction toLongFunction) {
        return new j(bVar, this.f26233s, this.f26225k, z10, function, predicate, toLongFunction);
    }

    @Override // ag.AbstractC3846d.a, java.util.Spliterator
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public j trySplit() {
        return (j) super.trySplit();
    }

    j(Zf.b bVar, Predicate predicate, AbstractC3846d.InterfaceC1014d interfaceC1014d, boolean z10, Function function, Predicate predicate2, ToLongFunction toLongFunction) {
        super(bVar, predicate, interfaceC1014d, z10, false, function, predicate2, toLongFunction);
    }
}
