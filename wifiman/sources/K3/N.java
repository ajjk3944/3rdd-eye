package k3;

import e3.InterfaceC5417b;
import m3.InterfaceC6756a;

/* loaded from: classes.dex */
public final class N implements InterfaceC5417b {

    /* renamed from: a, reason: collision with root package name */
    private final Jg.a f51138a;

    /* renamed from: b, reason: collision with root package name */
    private final Jg.a f51139b;

    /* renamed from: c, reason: collision with root package name */
    private final Jg.a f51140c;

    /* renamed from: d, reason: collision with root package name */
    private final Jg.a f51141d;

    /* renamed from: e, reason: collision with root package name */
    private final Jg.a f51142e;

    public N(Jg.a aVar, Jg.a aVar2, Jg.a aVar3, Jg.a aVar4, Jg.a aVar5) {
        this.f51138a = aVar;
        this.f51139b = aVar2;
        this.f51140c = aVar3;
        this.f51141d = aVar4;
        this.f51142e = aVar5;
    }

    public static N a(Jg.a aVar, Jg.a aVar2, Jg.a aVar3, Jg.a aVar4, Jg.a aVar5) {
        return new N(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static M c(InterfaceC6756a interfaceC6756a, InterfaceC6756a interfaceC6756a2, Object obj, Object obj2, Jg.a aVar) {
        return new M(interfaceC6756a, interfaceC6756a2, (AbstractC6371e) obj, (W) obj2, aVar);
    }

    @Override // Jg.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public M get() {
        return c((InterfaceC6756a) this.f51138a.get(), (InterfaceC6756a) this.f51139b.get(), this.f51140c.get(), this.f51141d.get(), this.f51142e);
    }
}
