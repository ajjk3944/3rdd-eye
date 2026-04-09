package st;

import com.google.android.gms.internal.measurement.i4;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import u.c0;
import u.d0;

/* loaded from: classes.dex */
public final class h implements Iterator, cr.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22291a;

    /* renamed from: d, reason: collision with root package name */
    public int f22292d;

    /* renamed from: g, reason: collision with root package name */
    public Object f22293g;

    /* renamed from: r, reason: collision with root package name */
    public final Object f22294r;

    public h(Map map, Object obj) {
        this.f22291a = 2;
        this.f22293g = obj;
        this.f22294r = map;
    }

    public void a() {
        Object objA;
        i iVar = (i) this.f22294r;
        if (this.f22292d == -2) {
            objA = iVar.f22295a.c();
        } else {
            ar.k kVar = iVar.f22296b;
            Object obj = this.f22293g;
            br.l.b(obj);
            objA = kVar.a(obj);
        }
        this.f22293g = objA;
        this.f22292d = objA == null ? 0 : 1;
    }

    public void b() {
        Iterator it = (Iterator) this.f22294r;
        if (it.hasNext()) {
            Object next = it.next();
            rr.l lVar = (rr.l) next;
            br.l.e(lVar, "it");
            if (lVar instanceof rr.b) {
                this.f22292d = 1;
                this.f22293g = next;
                return;
            }
        }
        this.f22292d = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f22291a) {
            case 0:
                if (this.f22292d < 0) {
                    a();
                }
                return this.f22292d == 1;
            case 1:
                if (this.f22292d == -1) {
                    b();
                }
                return this.f22292d == 1;
            case 2:
                return this.f22292d < ((Map) this.f22294r).size();
            default:
                return ((k) this.f22293g).hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f22291a) {
            case 0:
                if (this.f22292d < 0) {
                    a();
                }
                if (this.f22292d == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f22293g;
                br.l.c(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.f22292d = -1;
                return obj;
            case 1:
                if (this.f22292d == -1) {
                    b();
                }
                if (this.f22292d == 0) {
                    throw new NoSuchElementException();
                }
                Object obj2 = this.f22293g;
                this.f22293g = null;
                this.f22292d = -1;
                return obj2;
            case 2:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object obj3 = this.f22293g;
                this.f22292d++;
                Object obj4 = ((Map) this.f22294r).get(obj3);
                if (obj4 != null) {
                    this.f22293g = ((t0.a) obj4).f22375b;
                    return obj3;
                }
                throw new ConcurrentModificationException("Hash code of an element (" + obj3 + ") has changed after it was added to the persistent set.");
            default:
                return ((k) this.f22293g).next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f22291a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                int i10 = this.f22292d;
                if (i10 != -1) {
                    ((d0) this.f22294r).f23059d.l(i10);
                    this.f22292d = -1;
                    return;
                }
                return;
        }
    }

    public h(mq.n nVar) {
        this.f22291a = 1;
        this.f22294r = ((j) nVar.f16942b).iterator();
        this.f22292d = -1;
    }

    public h(i iVar) {
        this.f22291a = 0;
        this.f22294r = iVar;
        this.f22292d = -2;
    }

    public h(d0 d0Var) {
        this.f22291a = 3;
        this.f22294r = d0Var;
        this.f22292d = -1;
        this.f22293g = i4.u(new c0(d0Var, this, null));
    }
}
