package X;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC6492s;
import nh.InterfaceC6944a;
import sh.AbstractC7978m;

/* loaded from: classes.dex */
public final class h extends a implements ListIterator, InterfaceC6944a {

    /* renamed from: c, reason: collision with root package name */
    private final f f23993c;

    /* renamed from: d, reason: collision with root package name */
    private int f23994d;

    /* renamed from: e, reason: collision with root package name */
    private k f23995e;

    /* renamed from: f, reason: collision with root package name */
    private int f23996f;

    public h(f fVar, int i10) {
        super(i10, fVar.size());
        this.f23993c = fVar;
        this.f23994d = fVar.y();
        this.f23996f = -1;
        p();
    }

    private final void j() {
        if (this.f23994d != this.f23993c.y()) {
            throw new ConcurrentModificationException();
        }
    }

    private final void k() {
        if (this.f23996f == -1) {
            throw new IllegalStateException();
        }
    }

    private final void n() {
        i(this.f23993c.size());
        this.f23994d = this.f23993c.y();
        this.f23996f = -1;
        p();
    }

    private final void p() {
        Object[] objArrC = this.f23993c.C();
        if (objArrC == null) {
            this.f23995e = null;
            return;
        }
        int iD = l.d(this.f23993c.size());
        int iG = AbstractC7978m.g(f(), iD);
        int iJ = (this.f23993c.J() / 5) + 1;
        k kVar = this.f23995e;
        if (kVar == null) {
            this.f23995e = new k(objArrC, iG, iD, iJ);
        } else {
            AbstractC6492s.f(kVar);
            kVar.p(objArrC, iG, iD, iJ);
        }
    }

    @Override // X.a, java.util.ListIterator
    public void add(Object obj) {
        j();
        this.f23993c.add(f(), obj);
        h(f() + 1);
        n();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        j();
        d();
        this.f23996f = f();
        k kVar = this.f23995e;
        if (kVar == null) {
            Object[] objArrS = this.f23993c.S();
            int iF = f();
            h(iF + 1);
            return objArrS[iF];
        }
        if (kVar.hasNext()) {
            h(f() + 1);
            return kVar.next();
        }
        Object[] objArrS2 = this.f23993c.S();
        int iF2 = f();
        h(iF2 + 1);
        return objArrS2[iF2 - kVar.g()];
    }

    @Override // java.util.ListIterator
    public Object previous() {
        j();
        e();
        this.f23996f = f() - 1;
        k kVar = this.f23995e;
        if (kVar == null) {
            Object[] objArrS = this.f23993c.S();
            h(f() - 1);
            return objArrS[f()];
        }
        if (f() <= kVar.g()) {
            h(f() - 1);
            return kVar.previous();
        }
        Object[] objArrS2 = this.f23993c.S();
        h(f() - 1);
        return objArrS2[f() - kVar.g()];
    }

    @Override // X.a, java.util.ListIterator, java.util.Iterator
    public void remove() {
        j();
        k();
        this.f23993c.remove(this.f23996f);
        if (this.f23996f < f()) {
            h(this.f23996f);
        }
        n();
    }

    @Override // X.a, java.util.ListIterator
    public void set(Object obj) {
        j();
        k();
        this.f23993c.set(this.f23996f, obj);
        this.f23994d = this.f23993c.y();
        p();
    }
}
