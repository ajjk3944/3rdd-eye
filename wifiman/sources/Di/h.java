package Di;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC6492s;
import nh.InterfaceC6944a;
import sh.AbstractC7978m;

/* loaded from: classes4.dex */
public final class h extends a implements ListIterator, InterfaceC6944a {

    /* renamed from: c, reason: collision with root package name */
    private final f f3583c;

    /* renamed from: d, reason: collision with root package name */
    private int f3584d;

    /* renamed from: e, reason: collision with root package name */
    private k f3585e;

    /* renamed from: f, reason: collision with root package name */
    private int f3586f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f builder, int i10) {
        super(i10, builder.size());
        AbstractC6492s.i(builder, "builder");
        this.f3583c = builder;
        this.f3584d = builder.y();
        this.f3586f = -1;
        p();
    }

    private final void j() {
        if (this.f3584d != this.f3583c.y()) {
            throw new ConcurrentModificationException();
        }
    }

    private final void k() {
        if (this.f3586f == -1) {
            throw new IllegalStateException();
        }
    }

    private final void n() {
        i(this.f3583c.size());
        this.f3584d = this.f3583c.y();
        this.f3586f = -1;
        p();
    }

    private final void p() {
        Object[] objArrC = this.f3583c.C();
        if (objArrC == null) {
            this.f3585e = null;
            return;
        }
        int iC = l.c(this.f3583c.size());
        int iG = AbstractC7978m.g(f(), iC);
        int iJ = (this.f3583c.J() / 5) + 1;
        k kVar = this.f3585e;
        if (kVar == null) {
            this.f3585e = new k(objArrC, iG, iC, iJ);
        } else {
            AbstractC6492s.f(kVar);
            kVar.p(objArrC, iG, iC, iJ);
        }
    }

    @Override // Di.a, java.util.ListIterator
    public void add(Object obj) {
        j();
        this.f3583c.add(f(), obj);
        h(f() + 1);
        n();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        j();
        d();
        this.f3586f = f();
        k kVar = this.f3585e;
        if (kVar == null) {
            Object[] objArrS = this.f3583c.S();
            int iF = f();
            h(iF + 1);
            return objArrS[iF];
        }
        if (kVar.hasNext()) {
            h(f() + 1);
            return kVar.next();
        }
        Object[] objArrS2 = this.f3583c.S();
        int iF2 = f();
        h(iF2 + 1);
        return objArrS2[iF2 - kVar.g()];
    }

    @Override // java.util.ListIterator
    public Object previous() {
        j();
        e();
        this.f3586f = f() - 1;
        k kVar = this.f3585e;
        if (kVar == null) {
            Object[] objArrS = this.f3583c.S();
            h(f() - 1);
            return objArrS[f()];
        }
        if (f() <= kVar.g()) {
            h(f() - 1);
            return kVar.previous();
        }
        Object[] objArrS2 = this.f3583c.S();
        h(f() - 1);
        return objArrS2[f() - kVar.g()];
    }

    @Override // Di.a, java.util.ListIterator, java.util.Iterator
    public void remove() {
        j();
        k();
        this.f3583c.remove(this.f3586f);
        if (this.f3586f < f()) {
            h(this.f3586f);
        }
        n();
    }

    @Override // Di.a, java.util.ListIterator
    public void set(Object obj) {
        j();
        k();
        this.f3583c.set(this.f3586f, obj);
        this.f3584d = this.f3583c.y();
        p();
    }
}
