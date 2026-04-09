package j6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: ObserverList.java */
/* renamed from: j6.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5195A<E> implements Iterable<E> {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f42976b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public int f42977c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f42978d;

    /* compiled from: ObserverList.java */
    /* renamed from: j6.A$a */
    public class a implements Iterator {

        /* renamed from: b, reason: collision with root package name */
        public final int f42979b;

        /* renamed from: c, reason: collision with root package name */
        public int f42980c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f42981d;

        public a() {
            C5195A.this.f42977c++;
            this.f42979b = C5195A.this.f42976b.size();
        }

        public final void a() {
            if (this.f42981d) {
                return;
            }
            this.f42981d = true;
            C5195A c5195a = C5195A.this;
            int i = c5195a.f42977c - 1;
            c5195a.f42977c = i;
            if (i <= 0 && c5195a.f42978d) {
                c5195a.f42978d = false;
                ArrayList arrayList = c5195a.f42976b;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (arrayList.get(size) == null) {
                        arrayList.remove(size);
                    }
                }
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i;
            int i10 = this.f42980c;
            while (true) {
                i = this.f42979b;
                if (i10 >= i || C5195A.this.f42976b.get(i10) != null) {
                    break;
                }
                i10++;
            }
            if (i10 < i) {
                return true;
            }
            a();
            return false;
        }

        @Override // java.util.Iterator
        public final E next() {
            int i;
            ArrayList arrayList;
            while (true) {
                int i10 = this.f42980c;
                C5195A c5195a = C5195A.this;
                i = this.f42979b;
                arrayList = c5195a.f42976b;
                if (i10 >= i || arrayList.get(i10) != null) {
                    break;
                }
                this.f42980c++;
            }
            int i11 = this.f42980c;
            if (i11 < i) {
                this.f42980c = i11 + 1;
                return (E) arrayList.get(i11);
            }
            a();
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public final void b(Object obj) {
        if (obj != null) {
            ArrayList arrayList = this.f42976b;
            if (arrayList.contains(obj)) {
                return;
            }
            arrayList.add(obj);
        }
    }

    public final void c(Object obj) {
        ArrayList arrayList;
        int iIndexOf;
        if (obj == null || (iIndexOf = (arrayList = this.f42976b).indexOf(obj)) == -1) {
            return;
        }
        if (this.f42977c == 0) {
            arrayList.remove(iIndexOf);
        } else {
            this.f42978d = true;
            arrayList.set(iIndexOf, null);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<E> iterator() {
        return new a();
    }
}
