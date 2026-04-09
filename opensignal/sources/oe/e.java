package oe;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* loaded from: classes.dex */
public class e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19316a = 0;

    /* renamed from: d, reason: collision with root package name */
    public final Iterator f19317d;

    /* renamed from: g, reason: collision with root package name */
    public Object f19318g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f19319r;

    public e(n nVar) {
        this.f19319r = nVar;
        Collection collection = nVar.f19356d;
        this.f19318g = collection;
        this.f19317d = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public void a() {
        n nVar = (n) this.f19319r;
        nVar.b();
        if (nVar.f19356d != ((Collection) this.f19318g)) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f19316a) {
            case 0:
                break;
            case 1:
                break;
            default:
                a();
                break;
        }
        return this.f19317d.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f19316a) {
            case 0:
                Map.Entry entry = (Map.Entry) this.f19317d.next();
                this.f19318g = (Collection) entry.getValue();
                return ((f) this.f19319r).a(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) this.f19317d.next();
                this.f19318g = entry2;
                return entry2.getKey();
            default:
                a();
                return this.f19317d.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f19316a) {
            case 0:
                ba.m.n("no calls to next() since the last call to remove()", ((Collection) this.f19318g) != null);
                this.f19317d.remove();
                ((f) this.f19319r).f19326r.f19370x -= ((Collection) this.f19318g).size();
                ((Collection) this.f19318g).clear();
                this.f19318g = null;
                break;
            case 1:
                ba.m.n("no calls to next() since the last call to remove()", ((Map.Entry) this.f19318g) != null);
                Collection collection = (Collection) ((Map.Entry) this.f19318g).getValue();
                this.f19317d.remove();
                ((g) this.f19319r).f19331d.f19370x -= collection.size();
                collection.clear();
                this.f19318g = null;
                break;
            default:
                this.f19317d.remove();
                n nVar = (n) this.f19319r;
                q0 q0Var = nVar.f19359x;
                q0Var.f19370x--;
                nVar.c();
                break;
        }
    }

    public e(n nVar, ListIterator listIterator) {
        this.f19319r = nVar;
        this.f19318g = nVar.f19356d;
        this.f19317d = listIterator;
    }

    public e(g gVar, Iterator it) {
        this.f19319r = gVar;
        this.f19317d = it;
    }

    public e(f fVar) {
        this.f19319r = fVar;
        this.f19317d = fVar.f19325g.entrySet().iterator();
    }
}
