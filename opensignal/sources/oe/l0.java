package oe;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class l0 extends h1 {

    /* renamed from: a, reason: collision with root package name */
    public b f19347a;

    /* renamed from: d, reason: collision with root package name */
    public Object f19348d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f19349g;

    /* renamed from: r, reason: collision with root package name */
    public final Iterator f19350r;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f19351x;

    public l0() {
        this.f19347a = b.NOT_READY;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        Object next;
        b bVar = this.f19347a;
        b bVar2 = b.FAILED;
        if (bVar == bVar2) {
            throw new IllegalStateException();
        }
        int i10 = a.f19294a[bVar.ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 != 2) {
            this.f19347a = bVar2;
            switch (this.f19349g) {
                case 0:
                    do {
                        Iterator it = this.f19350r;
                        if (!it.hasNext()) {
                            this.f19347a = b.DONE;
                            next = null;
                            break;
                        } else {
                            next = it.next();
                        }
                    } while (!((ne.j) this.f19351x).apply(next));
                default:
                    do {
                        Iterator it2 = this.f19350r;
                        if (!it2.hasNext()) {
                            this.f19347a = b.DONE;
                            next = null;
                            break;
                        } else {
                            next = it2.next();
                        }
                    } while (!((c1) this.f19351x).f19310d.contains(next));
            }
            this.f19348d = next;
            if (this.f19347a == b.DONE) {
                return false;
            }
            this.f19347a = b.READY;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f19347a = b.NOT_READY;
        Object obj = this.f19348d;
        this.f19348d = null;
        return obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l0(Iterator it, ne.j jVar) {
        this();
        this.f19349g = 0;
        this.f19350r = it;
        this.f19351x = jVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l0(c1 c1Var) {
        this();
        this.f19349g = 1;
        this.f19351x = c1Var;
        this.f19350r = c1Var.f19309a.iterator();
    }
}
