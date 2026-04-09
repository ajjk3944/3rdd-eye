package nq;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import br.l;
import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import u.z;
import x1.p;

/* loaded from: classes.dex */
public final class a implements ListIterator, cr.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18487a;

    /* renamed from: d, reason: collision with root package name */
    public int f18488d;

    /* renamed from: g, reason: collision with root package name */
    public int f18489g;

    /* renamed from: r, reason: collision with root package name */
    public int f18490r;

    /* renamed from: x, reason: collision with root package name */
    public final Object f18491x;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(p pVar, int i10, int i11) {
        this(pVar, (i11 & 1) != 0 ? 0 : i10, 0, pVar.f24906a.f23135b);
        this.f18487a = 3;
    }

    public void a() {
        if (((AbstractList) ((b) this.f18491x).f18496x).modCount != this.f18490r) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f18487a) {
            case 0:
                a();
                b bVar = (b) this.f18491x;
                int i10 = this.f18488d;
                this.f18488d = i10 + 1;
                bVar.add(i10, obj);
                this.f18489g = -1;
                this.f18490r = ((AbstractList) bVar).modCount;
                return;
            case 1:
                b();
                c cVar = (c) this.f18491x;
                int i11 = this.f18488d;
                this.f18488d = i11 + 1;
                cVar.add(i11, obj);
                this.f18489g = -1;
                this.f18490r = ((AbstractList) cVar).modCount;
                return;
            case 2:
                c();
                SnapshotStateList snapshotStateList = (SnapshotStateList) this.f18491x;
                snapshotStateList.add(this.f18488d + 1, obj);
                this.f18489g = -1;
                this.f18488d++;
                this.f18490r = x0.p.f(snapshotStateList);
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public void b() {
        if (((AbstractList) ((c) this.f18491x)).modCount != this.f18490r) {
            throw new ConcurrentModificationException();
        }
    }

    public void c() {
        if (x0.p.f((SnapshotStateList) this.f18491x) != this.f18490r) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f18487a) {
            case 0:
                return this.f18488d < ((b) this.f18491x).f18494g;
            case 1:
                return this.f18488d < ((c) this.f18491x).f18499d;
            case 2:
                return this.f18488d < ((SnapshotStateList) this.f18491x).size() - 1;
            default:
                return this.f18488d < this.f18490r;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f18487a) {
            case 0:
                if (this.f18488d > 0) {
                }
                break;
            case 1:
                if (this.f18488d > 0) {
                }
                break;
            case 2:
                if (this.f18488d >= 0) {
                }
                break;
            default:
                if (this.f18488d > this.f18489g) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f18487a) {
            case 0:
                a();
                int i10 = this.f18488d;
                b bVar = (b) this.f18491x;
                if (i10 >= bVar.f18494g) {
                    throw new NoSuchElementException();
                }
                this.f18488d = i10 + 1;
                this.f18489g = i10;
                return bVar.f18492a[bVar.f18493d + i10];
            case 1:
                b();
                int i11 = this.f18488d;
                c cVar = (c) this.f18491x;
                if (i11 >= cVar.f18499d) {
                    throw new NoSuchElementException();
                }
                this.f18488d = i11 + 1;
                this.f18489g = i11;
                return cVar.f18498a[i11];
            case 2:
                c();
                int i12 = this.f18488d + 1;
                this.f18489g = i12;
                SnapshotStateList snapshotStateList = (SnapshotStateList) this.f18491x;
                x0.p.a(i12, snapshotStateList.size());
                Object obj = snapshotStateList.get(i12);
                this.f18488d = i12;
                return obj;
            default:
                z zVar = ((p) this.f18491x).f24906a;
                int i13 = this.f18488d;
                this.f18488d = i13 + 1;
                Object objE = zVar.e(i13);
                l.c(objE, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                return (z0.l) objE;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f18487a) {
            case 0:
                return this.f18488d;
            case 1:
                return this.f18488d;
            case 2:
                return this.f18488d + 1;
            default:
                return this.f18488d - this.f18489g;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f18487a) {
            case 0:
                a();
                int i10 = this.f18488d;
                if (i10 <= 0) {
                    throw new NoSuchElementException();
                }
                int i11 = i10 - 1;
                this.f18488d = i11;
                this.f18489g = i11;
                b bVar = (b) this.f18491x;
                return bVar.f18492a[bVar.f18493d + i11];
            case 1:
                b();
                int i12 = this.f18488d;
                if (i12 <= 0) {
                    throw new NoSuchElementException();
                }
                int i13 = i12 - 1;
                this.f18488d = i13;
                this.f18489g = i13;
                return ((c) this.f18491x).f18498a[i13];
            case 2:
                c();
                int i14 = this.f18488d;
                SnapshotStateList snapshotStateList = (SnapshotStateList) this.f18491x;
                x0.p.a(i14, snapshotStateList.size());
                int i15 = this.f18488d;
                this.f18489g = i15;
                this.f18488d--;
                return snapshotStateList.get(i15);
            default:
                z zVar = ((p) this.f18491x).f24906a;
                int i16 = this.f18488d - 1;
                this.f18488d = i16;
                Object objE = zVar.e(i16);
                l.c(objE, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                return (z0.l) objE;
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i10;
        switch (this.f18487a) {
            case 0:
                i10 = this.f18488d;
                break;
            case 1:
                i10 = this.f18488d;
                break;
            case 2:
                return this.f18488d;
            default:
                i10 = this.f18488d - this.f18489g;
                break;
        }
        return i10 - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f18487a) {
            case 0:
                b bVar = (b) this.f18491x;
                a();
                int i10 = this.f18489g;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                bVar.b(i10);
                this.f18488d = this.f18489g;
                this.f18489g = -1;
                this.f18490r = ((AbstractList) bVar).modCount;
                return;
            case 1:
                c cVar = (c) this.f18491x;
                b();
                int i11 = this.f18489g;
                if (i11 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                cVar.b(i11);
                this.f18488d = this.f18489g;
                this.f18489g = -1;
                this.f18490r = ((AbstractList) cVar).modCount;
                return;
            case 2:
                c();
                SnapshotStateList snapshotStateList = (SnapshotStateList) this.f18491x;
                snapshotStateList.remove(this.f18489g);
                this.f18488d--;
                this.f18489g = -1;
                this.f18490r = x0.p.f(snapshotStateList);
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f18487a) {
            case 0:
                a();
                int i10 = this.f18489g;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((b) this.f18491x).set(i10, obj);
                return;
            case 1:
                b();
                int i11 = this.f18489g;
                if (i11 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((c) this.f18491x).set(i11, obj);
                return;
            case 2:
                SnapshotStateList snapshotStateList = (SnapshotStateList) this.f18491x;
                c();
                int i12 = this.f18489g;
                if (i12 < 0) {
                    throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                }
                snapshotStateList.set(i12, obj);
                this.f18490r = x0.p.f(snapshotStateList);
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public a(c cVar, int i10) {
        this.f18487a = 1;
        this.f18491x = cVar;
        this.f18488d = i10;
        this.f18489g = -1;
        this.f18490r = ((AbstractList) cVar).modCount;
    }

    public a(SnapshotStateList snapshotStateList, int i10) {
        this.f18487a = 2;
        this.f18491x = snapshotStateList;
        this.f18488d = i10 - 1;
        this.f18489g = -1;
        this.f18490r = x0.p.f(snapshotStateList);
    }

    public a(p pVar, int i10, int i11, int i12) {
        this.f18487a = 3;
        this.f18491x = pVar;
        this.f18488d = i10;
        this.f18489g = i11;
        this.f18490r = i12;
    }

    public a(b bVar, int i10) {
        this.f18487a = 0;
        this.f18491x = bVar;
        this.f18488d = i10;
        this.f18489g = -1;
        this.f18490r = ((AbstractList) bVar).modCount;
    }
}
