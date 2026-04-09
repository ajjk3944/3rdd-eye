package f4;

import android.content.Context;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class u0 implements z3.b {

    /* renamed from: a, reason: collision with root package name */
    public final Provider f21123a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider f21124b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider f21125c;

    public u0(Provider provider, Provider provider2, Provider provider3) {
        this.f21123a = provider;
        this.f21124b = provider2;
        this.f21125c = provider3;
    }

    public static u0 a(Provider provider, Provider provider2, Provider provider3) {
        return new u0(provider, provider2, provider3);
    }

    public static t0 c(Context context, String str, int i10) {
        return new t0(context, str, i10);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public t0 get() {
        return c((Context) this.f21123a.get(), (String) this.f21124b.get(), ((Integer) this.f21125c.get()).intValue());
    }
}
