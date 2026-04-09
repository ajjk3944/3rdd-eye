package i3;

import d3.InterfaceC5291e;
import e3.InterfaceC5417b;
import j3.x;
import java.util.concurrent.Executor;
import k3.InterfaceC6370d;
import l3.InterfaceC6542a;

/* renamed from: i3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6068d implements InterfaceC5417b {

    /* renamed from: a, reason: collision with root package name */
    private final Jg.a f48813a;

    /* renamed from: b, reason: collision with root package name */
    private final Jg.a f48814b;

    /* renamed from: c, reason: collision with root package name */
    private final Jg.a f48815c;

    /* renamed from: d, reason: collision with root package name */
    private final Jg.a f48816d;

    /* renamed from: e, reason: collision with root package name */
    private final Jg.a f48817e;

    public C6068d(Jg.a aVar, Jg.a aVar2, Jg.a aVar3, Jg.a aVar4, Jg.a aVar5) {
        this.f48813a = aVar;
        this.f48814b = aVar2;
        this.f48815c = aVar3;
        this.f48816d = aVar4;
        this.f48817e = aVar5;
    }

    public static C6068d a(Jg.a aVar, Jg.a aVar2, Jg.a aVar3, Jg.a aVar4, Jg.a aVar5) {
        return new C6068d(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static C6067c c(Executor executor, InterfaceC5291e interfaceC5291e, x xVar, InterfaceC6370d interfaceC6370d, InterfaceC6542a interfaceC6542a) {
        return new C6067c(executor, interfaceC5291e, xVar, interfaceC6370d, interfaceC6542a);
    }

    @Override // Jg.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C6067c get() {
        return c((Executor) this.f48813a.get(), (InterfaceC5291e) this.f48814b.get(), (x) this.f48815c.get(), (InterfaceC6370d) this.f48816d.get(), (InterfaceC6542a) this.f48817e.get());
    }
}
