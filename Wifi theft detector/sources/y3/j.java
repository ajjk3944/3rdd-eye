package y3;

import android.content.Context;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class j implements z3.b {

    /* renamed from: a, reason: collision with root package name */
    public final Provider f25123a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider f25124b;

    public j(Provider provider, Provider provider2) {
        this.f25123a = provider;
        this.f25124b = provider2;
    }

    public static j a(Provider provider, Provider provider2) {
        return new j(provider, provider2);
    }

    public static i c(Context context, Object obj) {
        return new i(context, (g) obj);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c((Context) this.f25123a.get(), this.f25124b.get());
    }
}
