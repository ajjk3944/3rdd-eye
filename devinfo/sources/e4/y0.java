package e4;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class y0 implements Iterator, ok.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22418a;

    /* renamed from: b, reason: collision with root package name */
    public int f22419b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f22420c;

    public /* synthetic */ y0(int i4, Object obj) {
        this.f22418a = i4;
        this.f22420c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f22418a) {
            case 0:
                return this.f22419b < ((ViewGroup) this.f22420c).getChildCount();
            case 1:
                return this.f22419b < ((Object[]) this.f22420c).length;
            case 2:
                Iterator it = (Iterator) this.f22420c;
                while (this.f22419b > 0 && it.hasNext()) {
                    it.next();
                    this.f22419b--;
                }
                return it.hasNext();
            default:
                return this.f22419b < ((zj.e) this.f22420c).size();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f22418a) {
            case 0:
                ViewGroup viewGroup = (ViewGroup) this.f22420c;
                int i4 = this.f22419b;
                this.f22419b = i4 + 1;
                View childAt = viewGroup.getChildAt(i4);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
            case 1:
                try {
                    Object[] objArr = (Object[]) this.f22420c;
                    int i10 = this.f22419b;
                    this.f22419b = i10 + 1;
                    return objArr[i10];
                } catch (ArrayIndexOutOfBoundsException e2) {
                    this.f22419b--;
                    throw new NoSuchElementException(e2.getMessage());
                }
            case 2:
                Iterator it = (Iterator) this.f22420c;
                while (this.f22419b > 0 && it.hasNext()) {
                    it.next();
                    this.f22419b--;
                }
                return it.next();
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                zj.e eVar = (zj.e) this.f22420c;
                int i11 = this.f22419b;
                this.f22419b = i11 + 1;
                return eVar.get(i11);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f22418a) {
            case 0:
                ViewGroup viewGroup = (ViewGroup) this.f22420c;
                int i4 = this.f22419b - 1;
                this.f22419b = i4;
                viewGroup.removeViewAt(i4);
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public y0(Object[] objArr) {
        this.f22418a = 1;
        nk.k.e(objArr, "array");
        this.f22420c = objArr;
    }

    public y0(uk.b bVar) {
        this.f22418a = 2;
        this.f22420c = bVar.f35517a.iterator();
        this.f22419b = bVar.f35518b;
    }
}
