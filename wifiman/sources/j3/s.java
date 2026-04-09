package j3;

import android.content.Context;
import d3.InterfaceC5291e;
import e3.InterfaceC5417b;
import java.util.concurrent.Executor;
import k3.InterfaceC6369c;
import k3.InterfaceC6370d;
import l3.InterfaceC6542a;
import m3.InterfaceC6756a;

/* loaded from: classes.dex */
public final class s implements InterfaceC5417b {

    /* renamed from: a, reason: collision with root package name */
    private final Jg.a f50097a;

    /* renamed from: b, reason: collision with root package name */
    private final Jg.a f50098b;

    /* renamed from: c, reason: collision with root package name */
    private final Jg.a f50099c;

    /* renamed from: d, reason: collision with root package name */
    private final Jg.a f50100d;

    /* renamed from: e, reason: collision with root package name */
    private final Jg.a f50101e;

    /* renamed from: f, reason: collision with root package name */
    private final Jg.a f50102f;

    /* renamed from: g, reason: collision with root package name */
    private final Jg.a f50103g;

    /* renamed from: h, reason: collision with root package name */
    private final Jg.a f50104h;

    /* renamed from: i, reason: collision with root package name */
    private final Jg.a f50105i;

    public s(Jg.a aVar, Jg.a aVar2, Jg.a aVar3, Jg.a aVar4, Jg.a aVar5, Jg.a aVar6, Jg.a aVar7, Jg.a aVar8, Jg.a aVar9) {
        this.f50097a = aVar;
        this.f50098b = aVar2;
        this.f50099c = aVar3;
        this.f50100d = aVar4;
        this.f50101e = aVar5;
        this.f50102f = aVar6;
        this.f50103g = aVar7;
        this.f50104h = aVar8;
        this.f50105i = aVar9;
    }

    public static s a(Jg.a aVar, Jg.a aVar2, Jg.a aVar3, Jg.a aVar4, Jg.a aVar5, Jg.a aVar6, Jg.a aVar7, Jg.a aVar8, Jg.a aVar9) {
        return new s(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9);
    }

    public static r c(Context context, InterfaceC5291e interfaceC5291e, InterfaceC6370d interfaceC6370d, x xVar, Executor executor, InterfaceC6542a interfaceC6542a, InterfaceC6756a interfaceC6756a, InterfaceC6756a interfaceC6756a2, InterfaceC6369c interfaceC6369c) {
        return new r(context, interfaceC5291e, interfaceC6370d, xVar, executor, interfaceC6542a, interfaceC6756a, interfaceC6756a2, interfaceC6369c);
    }

    @Override // Jg.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r get() {
        return c((Context) this.f50097a.get(), (InterfaceC5291e) this.f50098b.get(), (InterfaceC6370d) this.f50099c.get(), (x) this.f50100d.get(), (Executor) this.f50101e.get(), (InterfaceC6542a) this.f50102f.get(), (InterfaceC6756a) this.f50103g.get(), (InterfaceC6756a) this.f50104h.get(), (InterfaceC6369c) this.f50105i.get());
    }
}
