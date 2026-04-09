package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import Zg.AbstractC3682n;
import Zg.AbstractC3689v;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import zi.AbstractC8783m;
import zi.InterfaceC8780j;

/* loaded from: classes4.dex */
public final class o implements h {

    /* renamed from: a, reason: collision with root package name */
    private final List f51926a;

    public o(List delegates) {
        AbstractC6492s.i(delegates, "delegates");
        this.f51926a = delegates;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c f(Zh.c cVar, h it) {
        AbstractC6492s.i(it, "it");
        return it.l(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC8780j g(h it) {
        AbstractC6492s.i(it, "it");
        return AbstractC3689v.d0(it);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.h
    public boolean P(Zh.c fqName) {
        AbstractC6492s.i(fqName, "fqName");
        Iterator it = AbstractC3689v.d0(this.f51926a).iterator();
        while (it.hasNext()) {
            if (((h) it.next()).P(fqName)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.h
    public boolean isEmpty() {
        List list = this.f51926a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((h) it.next()).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return AbstractC8783m.H(AbstractC3689v.d0(this.f51926a), n.f51925a).iterator();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.h
    public c l(Zh.c fqName) {
        AbstractC6492s.i(fqName, "fqName");
        return (c) AbstractC8783m.G(AbstractC8783m.O(AbstractC3689v.d0(this.f51926a), new m(fqName)));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o(h... delegates) {
        this(AbstractC3682n.d1(delegates));
        AbstractC6492s.i(delegates, "delegates");
    }
}
