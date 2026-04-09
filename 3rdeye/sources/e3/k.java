package E3;

import a9.InterfaceC1676a;
import android.content.Context;
import java.util.concurrent.Executor;
import t4.C5606d;

/* compiled from: Uploader_Factory.java */
/* loaded from: classes.dex */
public final class k implements A3.b<j> {

    /* renamed from: b, reason: collision with root package name */
    public final A3.c f1405b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1676a<z3.e> f1406c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1676a<F3.d> f1407d;

    /* renamed from: e, reason: collision with root package name */
    public final D3.f f1408e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC1676a<Executor> f1409f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC1676a<G3.b> f1410g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC1676a<F3.c> f1411h;

    public k(A3.c cVar, InterfaceC1676a interfaceC1676a, InterfaceC1676a interfaceC1676a2, D3.f fVar, InterfaceC1676a interfaceC1676a3, InterfaceC1676a interfaceC1676a4, InterfaceC1676a interfaceC1676a5) {
        this.f1405b = cVar;
        this.f1406c = interfaceC1676a;
        this.f1407d = interfaceC1676a2;
        this.f1408e = fVar;
        this.f1409f = interfaceC1676a3;
        this.f1410g = interfaceC1676a4;
        this.f1411h = interfaceC1676a5;
    }

    @Override // a9.InterfaceC1676a
    public final Object get() {
        return new j((Context) this.f1405b.f36c, this.f1406c.get(), this.f1407d.get(), (n) this.f1408e.get(), this.f1409f.get(), this.f1410g.get(), new C5606d(6), new B7.d(8), this.f1411h.get());
    }
}
