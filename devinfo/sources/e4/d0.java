package e4;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d0 implements Iterator, ok.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22318a;

    /* renamed from: b, reason: collision with root package name */
    public Iterator f22319b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f22320c;

    public d0(y0 y0Var) {
        this.f22318a = 0;
        this.f22320c = new ArrayList();
        this.f22319b = y0Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f22318a) {
        }
        return this.f22319b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f22318a) {
            case 0:
                Object next = this.f22319b.next();
                ArrayList arrayList = (ArrayList) this.f22320c;
                View view = (View) next;
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                y0 y0Var = viewGroup != null ? new y0(0, viewGroup) : null;
                if (y0Var == null || !y0Var.hasNext()) {
                    while (!this.f22319b.hasNext() && !arrayList.isEmpty()) {
                        this.f22319b = (Iterator) zj.n.h0(arrayList);
                        zj.n.l0(arrayList);
                    }
                } else {
                    arrayList.add(this.f22319b);
                    this.f22319b = y0Var;
                }
                return next;
            default:
                return ((mk.c) ((uk.e) this.f22320c).f35521b).invoke(this.f22319b.next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f22318a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public d0(uk.e eVar) {
        this.f22318a = 1;
        this.f22320c = eVar;
        this.f22319b = ((uk.f) eVar.f35522c).iterator();
    }
}
