package y2;

import z2.InterfaceC8708a;

/* renamed from: y2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8607a implements c {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC8708a f66352a;

    public static void a(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2) {
        e.b(interfaceC8708a2);
        C8607a c8607a = (C8607a) interfaceC8708a;
        if (c8607a.f66352a != null) {
            throw new IllegalStateException();
        }
        c8607a.f66352a = interfaceC8708a2;
    }

    @Override // z2.InterfaceC8708a
    public Object get() {
        InterfaceC8708a interfaceC8708a = this.f66352a;
        if (interfaceC8708a != null) {
            return interfaceC8708a.get();
        }
        throw new IllegalStateException();
    }
}
