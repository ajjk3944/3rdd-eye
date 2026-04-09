package com.google.common.collect;

import java.util.Comparator;
import m4.InterfaceC6764c;

/* loaded from: classes3.dex */
public abstract class G implements Comparator {
    protected G() {
    }

    public static G a(Comparator comparator) {
        return comparator instanceof G ? (G) comparator : new C5065k(comparator);
    }

    public static G d() {
        return D.f38320a;
    }

    public AbstractC5069o c(Iterable iterable) {
        return AbstractC5069o.U0(this, iterable);
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    G g() {
        return h(z.b());
    }

    public G h(InterfaceC6764c interfaceC6764c) {
        return new C5060f(interfaceC6764c, this);
    }
}
