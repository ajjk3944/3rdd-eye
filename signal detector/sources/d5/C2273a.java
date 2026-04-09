package d5;

import java.util.Iterator;
import java.util.NoSuchElementException;
import u.C2941j;

/* renamed from: d5.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2273a implements Iterator, r5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19808a;

    /* renamed from: b, reason: collision with root package name */
    public int f19809b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f19810c;

    public /* synthetic */ C2273a(int i, Object obj) {
        this.f19808a = i;
        this.f19810c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f19808a) {
            case 0:
                if (this.f19809b < ((AbstractC2276d) this.f19810c).a()) {
                }
                break;
            case 1:
                if (this.f19809b < ((Object[]) this.f19810c).length) {
                }
                break;
            default:
                if (this.f19809b < ((C2941j) this.f19810c).g()) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f19808a) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                AbstractC2276d abstractC2276d = (AbstractC2276d) this.f19810c;
                int i = this.f19809b;
                this.f19809b = i + 1;
                return abstractC2276d.get(i);
            case 1:
                try {
                    Object[] objArr = (Object[]) this.f19810c;
                    int i3 = this.f19809b;
                    this.f19809b = i3 + 1;
                    return objArr[i3];
                } catch (ArrayIndexOutOfBoundsException e6) {
                    this.f19809b--;
                    throw new NoSuchElementException(e6.getMessage());
                }
            default:
                C2941j c2941j = (C2941j) this.f19810c;
                int i6 = this.f19809b;
                this.f19809b = i6 + 1;
                return c2941j.h(i6);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f19808a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C2273a(Object[] objArr) {
        this.f19808a = 1;
        q5.i.e(objArr, "array");
        this.f19810c = objArr;
    }
}
