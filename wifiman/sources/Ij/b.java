package ij;

import gj.InterfaceC5925b;
import gj.InterfaceC5926c;
import ij.AbstractC6178a;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public abstract class b extends AbstractC6178a implements Map {

    /* renamed from: j, reason: collision with root package name */
    transient c f49260j;

    protected static class a extends d implements InterfaceC5925b, Iterator {
        protected a(b bVar) {
            super(bVar);
        }

        @Override // java.util.Iterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            return super.c();
        }
    }

    /* renamed from: ij.b$b, reason: collision with other inner class name */
    protected static class C1854b extends d implements InterfaceC5925b, Iterator {
        protected C1854b(b bVar) {
            super(bVar);
        }

        @Override // java.util.Iterator
        public Object next() {
            return super.c().getKey();
        }
    }

    protected static class c extends AbstractC6178a.b {

        /* renamed from: e, reason: collision with root package name */
        protected c f49261e;

        /* renamed from: f, reason: collision with root package name */
        protected c f49262f;

        protected c(AbstractC6178a.b bVar, int i10, Object obj, Object obj2) {
            super(bVar, i10, obj, obj2);
        }
    }

    protected static abstract class d {

        /* renamed from: a, reason: collision with root package name */
        protected final b f49263a;

        /* renamed from: b, reason: collision with root package name */
        protected c f49264b;

        /* renamed from: c, reason: collision with root package name */
        protected c f49265c;

        /* renamed from: d, reason: collision with root package name */
        protected int f49266d;

        protected d(b bVar) {
            this.f49263a = bVar;
            this.f49265c = bVar.f49260j.f49262f;
            this.f49266d = bVar.f49249e;
        }

        protected c a() {
            return this.f49264b;
        }

        protected c c() {
            b bVar = this.f49263a;
            if (bVar.f49249e != this.f49266d) {
                throw new ConcurrentModificationException();
            }
            c cVar = this.f49265c;
            if (cVar == bVar.f49260j) {
                throw new NoSuchElementException("No next() entry in the iteration");
            }
            this.f49264b = cVar;
            this.f49265c = cVar.f49262f;
            return cVar;
        }

        public boolean hasNext() {
            return this.f49265c != this.f49263a.f49260j;
        }

        public void remove() {
            c cVar = this.f49264b;
            if (cVar == null) {
                throw new IllegalStateException("remove() can only be called once after next()");
            }
            b bVar = this.f49263a;
            if (bVar.f49249e != this.f49266d) {
                throw new ConcurrentModificationException();
            }
            bVar.remove(cVar.getKey());
            this.f49264b = null;
            this.f49266d = this.f49263a.f49249e;
        }

        public String toString() {
            if (this.f49264b == null) {
                return "Iterator[]";
            }
            return "Iterator[" + this.f49264b.getKey() + "=" + this.f49264b.getValue() + "]";
        }
    }

    protected static class e extends d implements InterfaceC5926c, Iterator {
        protected e(b bVar) {
            super(bVar);
        }

        @Override // gj.InterfaceC5924a
        public Object getValue() {
            c cVarA = a();
            if (cVarA != null) {
                return cVarA.getValue();
            }
            throw new IllegalStateException("getValue() can only be called after next() and before remove()");
        }

        @Override // gj.InterfaceC5924a, java.util.Iterator
        public Object next() {
            return super.c().getKey();
        }
    }

    protected static class f extends d implements InterfaceC5925b, Iterator {
        protected f(b bVar) {
            super(bVar);
        }

        @Override // java.util.Iterator
        public Object next() {
            return super.c().getValue();
        }
    }

    protected b() {
    }

    @Override // ij.AbstractC6178a
    protected Iterator K() {
        return size() == 0 ? hj.c.a() : new a(this);
    }

    @Override // ij.AbstractC6178a
    protected void M0() {
        c cVarE = E(null, -1, null, null);
        this.f49260j = cVarE;
        cVarE.f49262f = cVarE;
        cVarE.f49261e = cVarE;
    }

    @Override // ij.AbstractC6178a
    protected Iterator P() {
        return size() == 0 ? hj.c.a() : new C1854b(this);
    }

    @Override // ij.AbstractC6178a
    protected Iterator S() {
        return size() == 0 ? hj.c.a() : new f(this);
    }

    @Override // ij.AbstractC6178a
    protected void U0(AbstractC6178a.b bVar, int i10, AbstractC6178a.b bVar2) {
        c cVar = (c) bVar;
        c cVar2 = cVar.f49261e;
        cVar2.f49262f = cVar.f49262f;
        cVar.f49262f.f49261e = cVar2;
        cVar.f49262f = null;
        cVar.f49261e = null;
        super.U0(bVar, i10, bVar2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ij.AbstractC6178a
    /* renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public c E(AbstractC6178a.b bVar, int i10, Object obj, Object obj2) {
        return new c(bVar, i10, B(obj), obj2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ij.AbstractC6178a
    /* renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public c C0(Object obj) {
        return (c) super.C0(obj);
    }

    @Override // ij.AbstractC6178a
    /* renamed from: a1, reason: merged with bridge method [inline-methods] */
    public InterfaceC5926c T0() {
        return this.f49246b == 0 ? hj.d.a() : new e(this);
    }

    @Override // ij.AbstractC6178a, java.util.AbstractMap, java.util.Map
    public void clear() {
        super.clear();
        c cVar = this.f49260j;
        cVar.f49262f = cVar;
        cVar.f49261e = cVar;
    }

    @Override // ij.AbstractC6178a, java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        if (obj == null) {
            c cVar = this.f49260j;
            do {
                cVar = cVar.f49262f;
                if (cVar == this.f49260j) {
                    return false;
                }
            } while (cVar.getValue() != null);
            return true;
        }
        c cVar2 = this.f49260j;
        do {
            cVar2 = cVar2.f49262f;
            if (cVar2 == this.f49260j) {
                return false;
            }
        } while (!P0(obj, cVar2.getValue()));
        return true;
    }

    @Override // ij.AbstractC6178a
    protected void h(AbstractC6178a.b bVar, int i10) {
        c cVar = (c) bVar;
        c cVar2 = this.f49260j;
        cVar.f49262f = cVar2;
        cVar.f49261e = cVar2.f49261e;
        cVar2.f49261e.f49262f = cVar;
        cVar2.f49261e = cVar;
        this.f49247c[i10] = cVar;
    }

    protected b(int i10, float f10) {
        super(i10, f10);
    }
}
