package Ii;

import dh.InterfaceC5384i;
import mh.InterfaceC6839p;

/* loaded from: classes4.dex */
final class Z0 implements InterfaceC5384i.b, InterfaceC5384i.c {

    /* renamed from: a, reason: collision with root package name */
    public static final Z0 f9297a = new Z0();

    private Z0() {
    }

    @Override // dh.InterfaceC5384i.b, dh.InterfaceC5384i
    public Object fold(Object obj, InterfaceC6839p interfaceC6839p) {
        return InterfaceC5384i.b.a.a(this, obj, interfaceC6839p);
    }

    @Override // dh.InterfaceC5384i.b, dh.InterfaceC5384i
    public InterfaceC5384i.b get(InterfaceC5384i.c cVar) {
        return InterfaceC5384i.b.a.b(this, cVar);
    }

    @Override // dh.InterfaceC5384i.b
    public InterfaceC5384i.c getKey() {
        return this;
    }

    @Override // dh.InterfaceC5384i.b, dh.InterfaceC5384i
    public InterfaceC5384i minusKey(InterfaceC5384i.c cVar) {
        return InterfaceC5384i.b.a.c(this, cVar);
    }

    @Override // dh.InterfaceC5384i
    public InterfaceC5384i plus(InterfaceC5384i interfaceC5384i) {
        return InterfaceC5384i.b.a.d(this, interfaceC5384i);
    }
}
