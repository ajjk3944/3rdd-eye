package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i1 {

    /* renamed from: b, reason: collision with root package name */
    public static final b7.h f1150b = new b7.h(5);

    /* renamed from: a, reason: collision with root package name */
    public final Object f1151a;

    public i1() {
        this.f1151a = new AtomicReference(null);
    }

    public e1 a(nk.e eVar) {
        a0.x0 x0Var = (a0.x0) this.f1151a;
        String strB = eVar.b();
        if (strB != null) {
            return x0Var.D(eVar, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public i1(j1 j1Var, h1 h1Var, h5.b bVar) {
        nk.k.e(j1Var, "store");
        nk.k.e(h1Var, "factory");
        nk.k.e(bVar, "defaultCreationExtras");
        this.f1151a = new a0.x0(j1Var, h1Var, bVar);
    }

    public i1(r0 r0Var) {
        this.f1151a = r0Var;
    }
}
