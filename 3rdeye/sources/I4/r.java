package I4;

import C.f0;
import g5.InterfaceC4391a;
import g5.InterfaceC4392b;

/* compiled from: OptionalProvider.java */
/* loaded from: classes2.dex */
public final class r<T> implements InterfaceC4392b<T>, InterfaceC4391a<T> {

    /* renamed from: c, reason: collision with root package name */
    public static final B4.i f2477c = new B4.i(3);

    /* renamed from: d, reason: collision with root package name */
    public static final q f2478d = new q(0);

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC4391a.InterfaceC0459a<T> f2479a;

    /* renamed from: b, reason: collision with root package name */
    public volatile InterfaceC4392b<T> f2480b;

    public r(B4.i iVar, InterfaceC4392b interfaceC4392b) {
        this.f2479a = iVar;
        this.f2480b = interfaceC4392b;
    }

    public final void a(InterfaceC4391a.InterfaceC0459a<T> interfaceC0459a) {
        InterfaceC4392b<T> interfaceC4392b;
        InterfaceC4392b<T> interfaceC4392b2;
        InterfaceC4392b<T> interfaceC4392b3 = this.f2480b;
        q qVar = f2478d;
        if (interfaceC4392b3 != qVar) {
            interfaceC0459a.h(interfaceC4392b3);
            return;
        }
        synchronized (this) {
            interfaceC4392b = this.f2480b;
            if (interfaceC4392b != qVar) {
                interfaceC4392b2 = interfaceC4392b;
            } else {
                this.f2479a = new f0(4, this.f2479a, interfaceC0459a);
                interfaceC4392b2 = null;
            }
        }
        if (interfaceC4392b2 != null) {
            interfaceC0459a.h(interfaceC4392b);
        }
    }

    @Override // g5.InterfaceC4392b
    public final T get() {
        return this.f2480b.get();
    }
}
