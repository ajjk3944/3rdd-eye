package f4;

import android.content.Context;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class h implements z3.b {

    /* renamed from: a, reason: collision with root package name */
    public final Provider f21073a;

    public h(Provider provider) {
        this.f21073a = provider;
    }

    public static h a(Provider provider) {
        return new h(provider);
    }

    public static String c(Context context) {
        return (String) z3.d.c(f.b(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get() {
        return c((Context) this.f21073a.get());
    }
}
