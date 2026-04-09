package d4;

import e4.u;
import java.util.concurrent.Executor;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class d implements z3.b {

    /* renamed from: a, reason: collision with root package name */
    public final Provider f20751a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider f20752b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider f20753c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider f20754d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider f20755e;

    public d(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f20751a = provider;
        this.f20752b = provider2;
        this.f20753c = provider3;
        this.f20754d = provider4;
        this.f20755e = provider5;
    }

    public static d a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new d(provider, provider2, provider3, provider4, provider5);
    }

    public static c c(Executor executor, y3.d dVar, u uVar, f4.d dVar2, g4.a aVar) {
        return new c(executor, dVar, uVar, dVar2, aVar);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c((Executor) this.f20751a.get(), (y3.d) this.f20752b.get(), (u) this.f20753c.get(), (f4.d) this.f20754d.get(), (g4.a) this.f20755e.get());
    }
}
