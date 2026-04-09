package f4;

import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class n0 implements z3.b {

    /* renamed from: a, reason: collision with root package name */
    public final Provider f21095a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider f21096b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider f21097c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider f21098d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider f21099e;

    public n0(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f21095a = provider;
        this.f21096b = provider2;
        this.f21097c = provider3;
        this.f21098d = provider4;
        this.f21099e = provider5;
    }

    public static n0 a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new n0(provider, provider2, provider3, provider4, provider5);
    }

    public static m0 c(h4.a aVar, h4.a aVar2, Object obj, Object obj2, Provider provider) {
        return new m0(aVar, aVar2, (e) obj, (t0) obj2, provider);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public m0 get() {
        return c((h4.a) this.f21095a.get(), (h4.a) this.f21096b.get(), this.f21097c.get(), this.f21098d.get(), this.f21099e);
    }
}
