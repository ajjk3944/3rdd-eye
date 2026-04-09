package Di;

import Ci.f;
import Zg.AbstractC3672d;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public abstract class b extends AbstractC3672d implements Ci.f {
    @Override // java.util.Collection, java.util.List, Ci.f
    public Ci.f addAll(Collection elements) {
        AbstractC6492s.i(elements, "elements");
        if (elements.isEmpty()) {
            return this;
        }
        f.a aVarC = c();
        aVarC.addAll(elements);
        return aVarC.a();
    }

    @Override // Zg.AbstractC3670b, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // Zg.AbstractC3670b, java.util.Collection, java.util.List
    public boolean containsAll(Collection elements) {
        AbstractC6492s.i(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // Zg.AbstractC3672d, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator();
    }

    @Override // Zg.AbstractC3672d, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // Zg.AbstractC3672d, java.util.List
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public Ci.c subList(int i10, int i11) {
        return f.b.a(this, i10, i11);
    }
}
