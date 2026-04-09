package E9;

import f9.InterfaceC4350h;

/* compiled from: SafeCollector.kt */
/* loaded from: classes3.dex */
public final class k implements InterfaceC4350h {

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f1560b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC4350h f1561c;

    public k(InterfaceC4350h interfaceC4350h, Throwable th) {
        this.f1560b = th;
        this.f1561c = interfaceC4350h;
    }

    @Override // f9.InterfaceC4350h
    public final <R> R fold(R r9, p9.p<? super R, ? super InterfaceC4350h.a, ? extends R> pVar) {
        return (R) this.f1561c.fold(r9, pVar);
    }

    @Override // f9.InterfaceC4350h
    public final <E extends InterfaceC4350h.a> E get(InterfaceC4350h.b<E> bVar) {
        return (E) this.f1561c.get(bVar);
    }

    @Override // f9.InterfaceC4350h
    public final InterfaceC4350h minusKey(InterfaceC4350h.b<?> bVar) {
        return this.f1561c.minusKey(bVar);
    }

    @Override // f9.InterfaceC4350h
    public final InterfaceC4350h plus(InterfaceC4350h interfaceC4350h) {
        return this.f1561c.plus(interfaceC4350h);
    }
}
