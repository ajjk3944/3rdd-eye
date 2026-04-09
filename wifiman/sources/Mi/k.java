package Mi;

import dh.InterfaceC5384i;
import mh.InterfaceC6839p;

/* loaded from: classes4.dex */
public final class k implements InterfaceC5384i {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ InterfaceC5384i f13293a;

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f13294b;

    public k(Throwable th2, InterfaceC5384i interfaceC5384i) {
        this.f13293a = interfaceC5384i;
        this.f13294b = th2;
    }

    @Override // dh.InterfaceC5384i
    public Object fold(Object obj, InterfaceC6839p interfaceC6839p) {
        return this.f13293a.fold(obj, interfaceC6839p);
    }

    @Override // dh.InterfaceC5384i
    public InterfaceC5384i.b get(InterfaceC5384i.c cVar) {
        return this.f13293a.get(cVar);
    }

    @Override // dh.InterfaceC5384i
    public InterfaceC5384i minusKey(InterfaceC5384i.c cVar) {
        return this.f13293a.minusKey(cVar);
    }

    @Override // dh.InterfaceC5384i
    public InterfaceC5384i plus(InterfaceC5384i interfaceC5384i) {
        return this.f13293a.plus(interfaceC5384i);
    }
}
