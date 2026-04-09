package T;

import e0.InterfaceC5409b;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import nh.InterfaceC6944a;

/* loaded from: classes.dex */
final class S implements Iterator, InterfaceC6944a {

    /* renamed from: a, reason: collision with root package name */
    private final C3516b1 f20977a;

    /* renamed from: b, reason: collision with root package name */
    private final int f20978b;

    /* renamed from: c, reason: collision with root package name */
    private int f20979c;

    /* renamed from: d, reason: collision with root package name */
    private final int f20980d;

    public S(C3516b1 c3516b1, int i10, int i11) {
        this.f20977a = c3516b1;
        this.f20978b = i11;
        this.f20979c = i10;
        this.f20980d = c3516b1.z();
        if (c3516b1.A()) {
            throw new ConcurrentModificationException();
        }
    }

    private final void e() {
        if (this.f20977a.z() != this.f20980d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public InterfaceC5409b next() {
        e();
        int i10 = this.f20979c;
        this.f20979c = AbstractC3522d1.I(this.f20977a.u(), i10) + i10;
        return new C3519c1(this.f20977a, i10, this.f20980d);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f20979c < this.f20978b;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
