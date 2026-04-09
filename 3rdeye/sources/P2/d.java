package P2;

import A2.l;
import D9.G;
import F3.m;
import F3.t;
import a9.InterfaceC1676a;
import android.content.Context;
import java.util.concurrent.Executor;
import l2.C5275h;
import y3.k;
import y3.n;

/* compiled from: InternalCacheDiskCacheFactory.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public Context f10571a;

    public k a() {
        Context context = this.f10571a;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        k kVar = new k();
        kVar.f48081b = A3.a.a(n.a.f48089a);
        A3.c cVar = new A3.c(context, 0);
        kVar.f48082c = cVar;
        kVar.f48083d = A3.a.a(new G(cVar, new t(cVar, 1)));
        A3.c cVar2 = kVar.f48082c;
        kVar.f48084e = new t(cVar2, 0);
        InterfaceC1676a<m> interfaceC1676aA = A3.a.a(new E7.b(kVar.f48084e, A3.a.a(new F3.f(cVar2))));
        kVar.f48085f = interfaceC1676aA;
        l lVar = new l(4);
        A3.c cVar3 = kVar.f48082c;
        D3.f fVar = new D3.f(cVar3, interfaceC1676aA, lVar);
        InterfaceC1676a<Executor> interfaceC1676a = kVar.f48081b;
        InterfaceC1676a interfaceC1676a2 = kVar.f48083d;
        kVar.f48086g = A3.a.a(new C5275h(new D3.d(interfaceC1676a, interfaceC1676a2, fVar, interfaceC1676aA, interfaceC1676aA), new E3.k(cVar3, interfaceC1676a2, interfaceC1676aA, fVar, interfaceC1676a, interfaceC1676aA, interfaceC1676aA), new E3.m(interfaceC1676a, interfaceC1676aA, fVar, interfaceC1676aA)));
        return kVar;
    }
}
