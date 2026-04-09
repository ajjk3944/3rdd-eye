package y3;

import android.content.Context;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class h implements z3.b {

    /* renamed from: a, reason: collision with root package name */
    public final Provider f25115a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider f25116b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider f25117c;

    public h(Provider provider, Provider provider2, Provider provider3) {
        this.f25115a = provider;
        this.f25116b = provider2;
        this.f25117c = provider3;
    }

    public static h a(Provider provider, Provider provider2, Provider provider3) {
        return new h(provider, provider2, provider3);
    }

    public static g c(Context context, h4.a aVar, h4.a aVar2) {
        return new g(context, aVar, aVar2);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public g get() {
        return c((Context) this.f25115a.get(), (h4.a) this.f25116b.get(), (h4.a) this.f25117c.get());
    }
}
