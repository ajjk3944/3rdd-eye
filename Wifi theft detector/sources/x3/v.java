package x3;

import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class v implements z3.b {

    /* renamed from: a, reason: collision with root package name */
    public final Provider f24965a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider f24966b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider f24967c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider f24968d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider f24969e;

    public v(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f24965a = provider;
        this.f24966b = provider2;
        this.f24967c = provider3;
        this.f24968d = provider4;
        this.f24969e = provider5;
    }

    public static v a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new v(provider, provider2, provider3, provider4, provider5);
    }

    public static t c(h4.a aVar, h4.a aVar2, d4.e eVar, e4.o oVar, e4.s sVar) {
        return new t(aVar, aVar2, eVar, oVar, sVar);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public t get() {
        return c((h4.a) this.f24965a.get(), (h4.a) this.f24966b.get(), (d4.e) this.f24967c.get(), (e4.o) this.f24968d.get(), (e4.s) this.f24969e.get());
    }
}
