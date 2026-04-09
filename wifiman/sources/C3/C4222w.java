package c3;

import e3.InterfaceC5417b;
import i3.InterfaceC6069e;
import m3.InterfaceC6756a;

/* renamed from: c3.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4222w implements InterfaceC5417b {

    /* renamed from: a, reason: collision with root package name */
    private final Jg.a f33829a;

    /* renamed from: b, reason: collision with root package name */
    private final Jg.a f33830b;

    /* renamed from: c, reason: collision with root package name */
    private final Jg.a f33831c;

    /* renamed from: d, reason: collision with root package name */
    private final Jg.a f33832d;

    /* renamed from: e, reason: collision with root package name */
    private final Jg.a f33833e;

    public C4222w(Jg.a aVar, Jg.a aVar2, Jg.a aVar3, Jg.a aVar4, Jg.a aVar5) {
        this.f33829a = aVar;
        this.f33830b = aVar2;
        this.f33831c = aVar3;
        this.f33832d = aVar4;
        this.f33833e = aVar5;
    }

    public static C4222w a(Jg.a aVar, Jg.a aVar2, Jg.a aVar3, Jg.a aVar4, Jg.a aVar5) {
        return new C4222w(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static C4220u c(InterfaceC6756a interfaceC6756a, InterfaceC6756a interfaceC6756a2, InterfaceC6069e interfaceC6069e, j3.r rVar, j3.v vVar) {
        return new C4220u(interfaceC6756a, interfaceC6756a2, interfaceC6069e, rVar, vVar);
    }

    @Override // Jg.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C4220u get() {
        return c((InterfaceC6756a) this.f33829a.get(), (InterfaceC6756a) this.f33830b.get(), (InterfaceC6069e) this.f33831c.get(), (j3.r) this.f33832d.get(), (j3.v) this.f33833e.get());
    }
}
