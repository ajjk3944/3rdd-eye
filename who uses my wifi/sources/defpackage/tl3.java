package defpackage;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class tl3 implements Iterator {
    public final /* synthetic */ int f = 2;
    public final Iterator g;
    public Object h;
    public final /* synthetic */ Object i;

    public tl3(ul3 ul3Var) {
        Objects.requireNonNull(ul3Var);
        this.i = ul3Var;
        this.g = ul3Var.h.entrySet().iterator();
    }

    public void a() {
        cm3 cm3Var = (cm3) this.i;
        cm3Var.a();
        if (cm3Var.g != ((Collection) this.h)) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f) {
            case 0:
                break;
            case 1:
                break;
            default:
                a();
                break;
        }
        return this.g.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f) {
            case 0:
                Map.Entry entry = (Map.Entry) this.g.next();
                this.h = (Collection) entry.getValue();
                return ((ul3) this.i).a(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) this.g.next();
                this.h = entry2;
                return entry2.getKey();
            default:
                a();
                return this.g.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f) {
            case 0:
                zt0.c0("no calls to next() since the last call to remove()", ((Collection) this.h) != null);
                this.g.remove();
                ((ul3) this.i).i.j -= ((Collection) this.h).size();
                ((Collection) this.h).clear();
                this.h = null;
                break;
            case 1:
                zt0.c0("no calls to next() since the last call to remove()", ((Map.Entry) this.h) != null);
                Collection collection = (Collection) ((Map.Entry) this.h).getValue();
                this.g.remove();
                ((vl3) this.i).g.j -= collection.size();
                collection.clear();
                this.h = null;
                break;
            default:
                this.g.remove();
                cm3 cm3Var = (cm3) this.i;
                pn3 pn3Var = cm3Var.j;
                pn3Var.j--;
                cm3Var.b();
                break;
        }
    }

    public tl3(vl3 vl3Var, Iterator it) {
        this.g = it;
        this.i = vl3Var;
    }

    public tl3(cm3 cm3Var) {
        Iterator it;
        this.i = cm3Var;
        Collection collection = cm3Var.g;
        this.h = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.g = it;
    }

    public tl3(cm3 cm3Var, ListIterator listIterator) {
        this.i = cm3Var;
        this.h = cm3Var.g;
        this.g = listIterator;
    }
}
