package T;

import e0.InterfaceC5409b;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import nh.InterfaceC6944a;

/* renamed from: T.c1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3519c1 implements InterfaceC5409b, Iterable, InterfaceC6944a {

    /* renamed from: a, reason: collision with root package name */
    private final C3516b1 f21044a;

    /* renamed from: b, reason: collision with root package name */
    private final int f21045b;

    /* renamed from: c, reason: collision with root package name */
    private final int f21046c;

    public C3519c1(C3516b1 c3516b1, int i10, int i11) {
        this.f21044a = c3516b1;
        this.f21045b = i10;
        this.f21046c = i11;
    }

    private final void b() {
        if (this.f21044a.z() != this.f21046c) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        b();
        this.f21044a.J(this.f21045b);
        C3516b1 c3516b1 = this.f21044a;
        int i10 = this.f21045b;
        return new S(c3516b1, i10 + 1, i10 + AbstractC3522d1.I(c3516b1.u(), this.f21045b));
    }
}
