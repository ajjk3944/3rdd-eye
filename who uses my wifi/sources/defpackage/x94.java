package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class x94 extends AbstractList {
    public static final zt0 h = zt0.I(x94.class);
    public final List f;
    public final u94 g;

    public x94(ArrayList arrayList, u94 u94Var) {
        this.f = arrayList;
        this.g = u94Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        List list = this.f;
        if (list.size() > i) {
            return list.get(i);
        }
        u94 u94Var = this.g;
        if (!u94Var.hasNext()) {
            throw new NoSuchElementException();
        }
        list.add(u94Var.next());
        return get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new w94(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        zt0 zt0Var = h;
        zt0Var.C("potentially expensive size() call");
        zt0Var.C("blowup running");
        while (true) {
            u94 u94Var = this.g;
            boolean zHasNext = u94Var.hasNext();
            List list = this.f;
            if (!zHasNext) {
                return list.size();
            }
            list.add(u94Var.next());
        }
    }
}
