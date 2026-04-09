package io.sentry.android.replay;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class p extends ArrayList {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f11942a;

    public p(q qVar) {
        this.f11942a = qVar;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        View view = (View) obj;
        br.l.e(view, "element");
        Iterator it = this.f11942a.f11945g.iterator();
        while (it.hasNext()) {
            ((f) it.next()).b(view, true);
        }
        return super.add(view);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        br.l.e(collection, "elements");
        Iterator it = this.f11942a.f11945g.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                fVar.b((View) it2.next(), true);
            }
        }
        return super.addAll(collection);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof View) {
            return super.contains((View) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof View) {
            return super.indexOf((View) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof View) {
            return super.lastIndexOf((View) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof View) {
            return super.remove((View) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        Object objRemove = super.remove(i10);
        br.l.d(objRemove, "removeAt(...)");
        View view = (View) objRemove;
        Iterator it = this.f11942a.f11945g.iterator();
        while (it.hasNext()) {
            ((f) it.next()).b(view, false);
        }
        return view;
    }
}
