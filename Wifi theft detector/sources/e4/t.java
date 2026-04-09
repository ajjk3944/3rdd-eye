package e4;

import java.util.concurrent.Executor;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class t implements z3.b {

    /* renamed from: a, reason: collision with root package name */
    public final Provider f20947a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider f20948b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider f20949c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider f20950d;

    public t(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f20947a = provider;
        this.f20948b = provider2;
        this.f20949c = provider3;
        this.f20950d = provider4;
    }

    public static t a(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new t(provider, provider2, provider3, provider4);
    }

    public static s c(Executor executor, f4.d dVar, u uVar, g4.a aVar) {
        return new s(executor, dVar, uVar, aVar);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public s get() {
        return c((Executor) this.f20947a.get(), (f4.d) this.f20948b.get(), (u) this.f20949c.get(), (g4.a) this.f20950d.get());
    }
}
