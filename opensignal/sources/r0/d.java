package r0;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class d extends a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f21115g = 1;

    /* renamed from: r, reason: collision with root package name */
    public final Object f21116r;

    public d(Object[] objArr, int i10, int i11) {
        super(i10, i11);
        this.f21116r = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f21115g) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object[] objArr = (Object[]) this.f21116r;
                int i10 = this.f21111a;
                this.f21111a = i10 + 1;
                return objArr[i10];
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                this.f21111a++;
                return this.f21116r;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f21115g) {
            case 0:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                Object[] objArr = (Object[]) this.f21116r;
                int i10 = this.f21111a - 1;
                this.f21111a = i10;
                return objArr[i10];
            default:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                this.f21111a--;
                return this.f21116r;
        }
    }

    public d(int i10, Object obj) {
        super(i10, 1);
        this.f21116r = obj;
    }
}
