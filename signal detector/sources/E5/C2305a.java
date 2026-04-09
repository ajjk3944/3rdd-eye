package e5;

import d5.AbstractC2277e;
import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: e5.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2305a implements ListIterator, r5.a {

    /* renamed from: b, reason: collision with root package name */
    public int f19942b;

    /* renamed from: d, reason: collision with root package name */
    public int f19944d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC2277e f19945e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19941a = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f19943c = -1;

    public C2305a(C2307c c2307c, int i) {
        this.f19945e = c2307c;
        this.f19942b = i;
        this.f19944d = ((AbstractList) c2307c).modCount;
    }

    public void a() {
        if (((AbstractList) ((C2306b) this.f19945e).f19950e).modCount != this.f19944d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f19941a) {
            case 0:
                a();
                C2306b c2306b = (C2306b) this.f19945e;
                int i = this.f19942b;
                this.f19942b = i + 1;
                c2306b.add(i, obj);
                this.f19943c = -1;
                this.f19944d = ((AbstractList) c2306b).modCount;
                break;
            default:
                b();
                C2307c c2307c = (C2307c) this.f19945e;
                int i3 = this.f19942b;
                this.f19942b = i3 + 1;
                c2307c.add(i3, obj);
                this.f19943c = -1;
                this.f19944d = ((AbstractList) c2307c).modCount;
                break;
        }
    }

    public void b() {
        if (((AbstractList) ((C2307c) this.f19945e)).modCount != this.f19944d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f19941a) {
            case 0:
                if (this.f19942b < ((C2306b) this.f19945e).f19948c) {
                }
                break;
            default:
                if (this.f19942b < ((C2307c) this.f19945e).f19953b) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f19941a) {
            case 0:
                if (this.f19942b > 0) {
                }
                break;
            default:
                if (this.f19942b > 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f19941a) {
            case 0:
                a();
                int i = this.f19942b;
                C2306b c2306b = (C2306b) this.f19945e;
                if (i >= c2306b.f19948c) {
                    throw new NoSuchElementException();
                }
                this.f19942b = i + 1;
                this.f19943c = i;
                return c2306b.f19946a[c2306b.f19947b + i];
            default:
                b();
                int i3 = this.f19942b;
                C2307c c2307c = (C2307c) this.f19945e;
                if (i3 >= c2307c.f19953b) {
                    throw new NoSuchElementException();
                }
                this.f19942b = i3 + 1;
                this.f19943c = i3;
                return c2307c.f19952a[i3];
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f19941a) {
        }
        return this.f19942b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f19941a) {
            case 0:
                a();
                int i = this.f19942b;
                if (i <= 0) {
                    throw new NoSuchElementException();
                }
                int i3 = i - 1;
                this.f19942b = i3;
                this.f19943c = i3;
                C2306b c2306b = (C2306b) this.f19945e;
                return c2306b.f19946a[c2306b.f19947b + i3];
            default:
                b();
                int i6 = this.f19942b;
                if (i6 <= 0) {
                    throw new NoSuchElementException();
                }
                int i7 = i6 - 1;
                this.f19942b = i7;
                this.f19943c = i7;
                return ((C2307c) this.f19945e).f19952a[i7];
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.f19941a) {
            case 0:
                i = this.f19942b;
                break;
            default:
                i = this.f19942b;
                break;
        }
        return i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f19941a) {
            case 0:
                C2306b c2306b = (C2306b) this.f19945e;
                a();
                int i = this.f19943c;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                c2306b.b(i);
                this.f19942b = this.f19943c;
                this.f19943c = -1;
                this.f19944d = ((AbstractList) c2306b).modCount;
                return;
            default:
                C2307c c2307c = (C2307c) this.f19945e;
                b();
                int i3 = this.f19943c;
                if (i3 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                c2307c.b(i3);
                this.f19942b = this.f19943c;
                this.f19943c = -1;
                this.f19944d = ((AbstractList) c2307c).modCount;
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f19941a) {
            case 0:
                a();
                int i = this.f19943c;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((C2306b) this.f19945e).set(i, obj);
                return;
            default:
                b();
                int i3 = this.f19943c;
                if (i3 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((C2307c) this.f19945e).set(i3, obj);
                return;
        }
    }

    public C2305a(C2306b c2306b, int i) {
        this.f19945e = c2306b;
        this.f19942b = i;
        this.f19944d = ((AbstractList) c2306b).modCount;
    }
}
