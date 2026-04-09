package ak;

import g1.q;
import g1.r;
import i1.m;
import i2.o;
import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import nk.k;
import x.a0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a implements ListIterator, ok.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f425a;

    /* renamed from: b, reason: collision with root package name */
    public int f426b;

    /* renamed from: c, reason: collision with root package name */
    public int f427c;

    /* renamed from: d, reason: collision with root package name */
    public int f428d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f429e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(o oVar, int i4, int i10) {
        this(oVar, (i10 & 1) != 0 ? 0 : i4, 0, oVar.f25725a.f36847b);
        this.f425a = 3;
    }

    public void a() {
        if (((AbstractList) ((b) this.f429e).f434e).modCount != this.f428d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f425a) {
            case 0:
                a();
                b bVar = (b) this.f429e;
                int i4 = this.f426b;
                this.f426b = i4 + 1;
                bVar.add(i4, obj);
                this.f427c = -1;
                this.f428d = ((AbstractList) bVar).modCount;
                return;
            case 1:
                b();
                c cVar = (c) this.f429e;
                int i10 = this.f426b;
                this.f426b = i10 + 1;
                cVar.add(i10, obj);
                this.f427c = -1;
                this.f428d = ((AbstractList) cVar).modCount;
                return;
            case 2:
                c();
                q qVar = (q) this.f429e;
                qVar.add(this.f426b + 1, obj);
                this.f427c = -1;
                this.f426b++;
                this.f428d = r.j(qVar);
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public void b() {
        if (((AbstractList) ((c) this.f429e)).modCount != this.f428d) {
            throw new ConcurrentModificationException();
        }
    }

    public void c() {
        if (r.j((q) this.f429e) != this.f428d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f425a) {
            case 0:
                return this.f426b < ((b) this.f429e).f432c;
            case 1:
                return this.f426b < ((c) this.f429e).f437b;
            case 2:
                return this.f426b < ((q) this.f429e).size() - 1;
            default:
                return this.f426b < this.f428d;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f425a) {
            case 0:
                if (this.f426b > 0) {
                }
                break;
            case 1:
                if (this.f426b > 0) {
                }
                break;
            case 2:
                if (this.f426b >= 0) {
                }
                break;
            default:
                if (this.f426b > this.f427c) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f425a) {
            case 0:
                a();
                int i4 = this.f426b;
                b bVar = (b) this.f429e;
                if (i4 >= bVar.f432c) {
                    throw new NoSuchElementException();
                }
                this.f426b = i4 + 1;
                this.f427c = i4;
                return bVar.f430a[bVar.f431b + i4];
            case 1:
                b();
                int i10 = this.f426b;
                c cVar = (c) this.f429e;
                if (i10 >= cVar.f437b) {
                    throw new NoSuchElementException();
                }
                this.f426b = i10 + 1;
                this.f427c = i10;
                return cVar.f436a[i10];
            case 2:
                c();
                int i11 = this.f426b + 1;
                this.f427c = i11;
                q qVar = (q) this.f429e;
                r.a(i11, qVar.size());
                Object obj = qVar.get(i11);
                this.f426b = i11;
                return obj;
            default:
                a0 a0Var = ((o) this.f429e).f25725a;
                int i12 = this.f426b;
                this.f426b = i12 + 1;
                Object objF = a0Var.f(i12);
                k.c(objF, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                return (m) objF;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f425a) {
            case 0:
                return this.f426b;
            case 1:
                return this.f426b;
            case 2:
                return this.f426b + 1;
            default:
                return this.f426b - this.f427c;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f425a) {
            case 0:
                a();
                int i4 = this.f426b;
                if (i4 <= 0) {
                    throw new NoSuchElementException();
                }
                int i10 = i4 - 1;
                this.f426b = i10;
                this.f427c = i10;
                b bVar = (b) this.f429e;
                return bVar.f430a[bVar.f431b + i10];
            case 1:
                b();
                int i11 = this.f426b;
                if (i11 <= 0) {
                    throw new NoSuchElementException();
                }
                int i12 = i11 - 1;
                this.f426b = i12;
                this.f427c = i12;
                return ((c) this.f429e).f436a[i12];
            case 2:
                c();
                int i13 = this.f426b;
                q qVar = (q) this.f429e;
                r.a(i13, qVar.size());
                int i14 = this.f426b;
                this.f427c = i14;
                this.f426b--;
                return qVar.get(i14);
            default:
                a0 a0Var = ((o) this.f429e).f25725a;
                int i15 = this.f426b - 1;
                this.f426b = i15;
                Object objF = a0Var.f(i15);
                k.c(objF, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                return (m) objF;
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i4;
        switch (this.f425a) {
            case 0:
                i4 = this.f426b;
                break;
            case 1:
                i4 = this.f426b;
                break;
            case 2:
                return this.f426b;
            default:
                i4 = this.f426b - this.f427c;
                break;
        }
        return i4 - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f425a) {
            case 0:
                b bVar = (b) this.f429e;
                a();
                int i4 = this.f427c;
                if (i4 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                bVar.c(i4);
                this.f426b = this.f427c;
                this.f427c = -1;
                this.f428d = ((AbstractList) bVar).modCount;
                return;
            case 1:
                c cVar = (c) this.f429e;
                b();
                int i10 = this.f427c;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                cVar.c(i10);
                this.f426b = this.f427c;
                this.f427c = -1;
                this.f428d = ((AbstractList) cVar).modCount;
                return;
            case 2:
                c();
                q qVar = (q) this.f429e;
                qVar.remove(this.f427c);
                this.f426b--;
                this.f427c = -1;
                this.f428d = r.j(qVar);
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f425a) {
            case 0:
                a();
                int i4 = this.f427c;
                if (i4 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((b) this.f429e).set(i4, obj);
                return;
            case 1:
                b();
                int i10 = this.f427c;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((c) this.f429e).set(i10, obj);
                return;
            case 2:
                q qVar = (q) this.f429e;
                c();
                int i11 = this.f427c;
                if (i11 < 0) {
                    throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                }
                qVar.set(i11, obj);
                this.f428d = r.j(qVar);
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public a(c cVar, int i4) {
        this.f425a = 1;
        this.f429e = cVar;
        this.f426b = i4;
        this.f427c = -1;
        this.f428d = ((AbstractList) cVar).modCount;
    }

    public a(q qVar, int i4) {
        this.f425a = 2;
        this.f429e = qVar;
        this.f426b = i4 - 1;
        this.f427c = -1;
        this.f428d = r.j(qVar);
    }

    public a(o oVar, int i4, int i10, int i11) {
        this.f425a = 3;
        this.f429e = oVar;
        this.f426b = i4;
        this.f427c = i10;
        this.f428d = i11;
    }

    public a(b bVar, int i4) {
        this.f425a = 0;
        this.f429e = bVar;
        this.f426b = i4;
        this.f427c = -1;
        this.f428d = ((AbstractList) bVar).modCount;
    }
}
