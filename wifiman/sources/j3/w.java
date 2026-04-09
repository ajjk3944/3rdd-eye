package j3;

import e3.InterfaceC5417b;
import java.util.concurrent.Executor;
import k3.InterfaceC6370d;
import l3.InterfaceC6542a;

/* loaded from: classes.dex */
public final class w implements InterfaceC5417b {

    /* renamed from: a, reason: collision with root package name */
    private final Jg.a f50112a;

    /* renamed from: b, reason: collision with root package name */
    private final Jg.a f50113b;

    /* renamed from: c, reason: collision with root package name */
    private final Jg.a f50114c;

    /* renamed from: d, reason: collision with root package name */
    private final Jg.a f50115d;

    public w(Jg.a aVar, Jg.a aVar2, Jg.a aVar3, Jg.a aVar4) {
        this.f50112a = aVar;
        this.f50113b = aVar2;
        this.f50114c = aVar3;
        this.f50115d = aVar4;
    }

    public static w a(Jg.a aVar, Jg.a aVar2, Jg.a aVar3, Jg.a aVar4) {
        return new w(aVar, aVar2, aVar3, aVar4);
    }

    public static v c(Executor executor, InterfaceC6370d interfaceC6370d, x xVar, InterfaceC6542a interfaceC6542a) {
        return new v(executor, interfaceC6370d, xVar, interfaceC6542a);
    }

    @Override // Jg.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public v get() {
        return c((Executor) this.f50112a.get(), (InterfaceC6370d) this.f50113b.get(), (x) this.f50114c.get(), (InterfaceC6542a) this.f50115d.get());
    }
}
