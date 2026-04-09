package st;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import mq.t;

/* loaded from: classes.dex */
public final class o implements Iterator, cr.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22301a;

    /* renamed from: d, reason: collision with root package name */
    public Iterator f22302d;

    /* renamed from: g, reason: collision with root package name */
    public final Object f22303g;

    public o(br.b bVar) {
        this.f22301a = 1;
        this.f22303g = new ArrayList();
        this.f22302d = bVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f22301a) {
        }
        return this.f22302d.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f22301a) {
            case 0:
                return ((p) this.f22303g).f22305b.a(this.f22302d.next());
            default:
                Object next = this.f22302d.next();
                ArrayList arrayList = (ArrayList) this.f22303g;
                View view = (View) next;
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                br.b bVar = viewGroup != null ? new br.b(7, viewGroup) : null;
                if (bVar == null || !bVar.hasNext()) {
                    while (!this.f22302d.hasNext() && !arrayList.isEmpty()) {
                        this.f22302d = (Iterator) mq.o.z0(arrayList);
                        t.g0(arrayList);
                    }
                } else {
                    arrayList.add(this.f22302d);
                    this.f22302d = bVar;
                }
                return next;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f22301a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public o(p pVar) {
        this.f22301a = 0;
        this.f22303g = pVar;
        this.f22302d = pVar.f22304a.iterator();
    }
}
