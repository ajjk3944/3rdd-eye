package X;

import W.e;
import Zg.AbstractC3672d;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public abstract class b extends AbstractC3672d implements W.e {

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Collection f23975a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Collection collection) {
            super(1);
            this.f23975a = collection;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(this.f23975a.contains(obj));
        }
    }

    @Override // java.util.Collection, java.util.List, W.e
    public W.e addAll(Collection collection) {
        e.a aVarC = c();
        aVarC.addAll(collection);
        return aVarC.a();
    }

    @Override // Zg.AbstractC3670b, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // Zg.AbstractC3670b, java.util.Collection, java.util.List
    public boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
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

    @Override // java.util.Collection, java.util.List, W.e
    public W.e remove(Object obj) {
        int iIndexOf = indexOf(obj);
        return iIndexOf != -1 ? f0(iIndexOf) : this;
    }

    @Override // java.util.Collection, java.util.List, W.e
    public W.e removeAll(Collection collection) {
        return T0(new a(collection));
    }

    @Override // Zg.AbstractC3672d, java.util.List
    public W.c subList(int i10, int i11) {
        return super.subList(i10, i11);
    }
}
