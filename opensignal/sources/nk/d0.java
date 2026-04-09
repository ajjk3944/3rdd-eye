package nk;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class d0 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public f0 f18366a;

    /* renamed from: d, reason: collision with root package name */
    public f0 f18367d = null;

    /* renamed from: g, reason: collision with root package name */
    public int f18368g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g0 f18369r;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f18370x;

    public d0(g0 g0Var, int i10) {
        this.f18370x = i10;
        this.f18369r = g0Var;
        this.f18366a = g0Var.f18389g.f18379r;
        this.f18368g = g0Var.f18391x;
    }

    public final Object a() {
        return b();
    }

    public final f0 b() {
        f0 f0Var = this.f18366a;
        g0 g0Var = this.f18369r;
        if (f0Var == g0Var.f18389g) {
            throw new NoSuchElementException();
        }
        if (g0Var.f18391x != this.f18368g) {
            throw new ConcurrentModificationException();
        }
        this.f18366a = f0Var.f18379r;
        this.f18367d = f0Var;
        return f0Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18366a != this.f18369r.f18389g;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.f18370x) {
            case 1:
                return b().f18381y;
            default:
                return a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        f0 f0Var = this.f18367d;
        if (f0Var == null) {
            throw new IllegalStateException();
        }
        g0 g0Var = this.f18369r;
        g0Var.c(f0Var, true);
        this.f18367d = null;
        this.f18368g = g0Var.f18391x;
    }
}
