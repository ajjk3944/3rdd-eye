package y0;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c extends a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f37289c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final Object f37290d;

    public c(Object[] objArr, int i4, int i10) {
        super(i4, i10);
        this.f37290d = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f37289c) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object[] objArr = (Object[]) this.f37290d;
                int i4 = this.f37287a;
                this.f37287a = i4 + 1;
                return objArr[i4];
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                this.f37287a++;
                return this.f37290d;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f37289c) {
            case 0:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                Object[] objArr = (Object[]) this.f37290d;
                int i4 = this.f37287a - 1;
                this.f37287a = i4;
                return objArr[i4];
            default:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                this.f37287a--;
                return this.f37290d;
        }
    }

    public c(int i4, Object obj) {
        super(i4, 1);
        this.f37290d = obj;
    }
}
