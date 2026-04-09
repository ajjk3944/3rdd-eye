package e4;

import android.content.Context;
import java.util.concurrent.Executor;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class p implements z3.b {

    /* renamed from: a, reason: collision with root package name */
    public final Provider f20932a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider f20933b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider f20934c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider f20935d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider f20936e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider f20937f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider f20938g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider f20939h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider f20940i;

    public p(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9) {
        this.f20932a = provider;
        this.f20933b = provider2;
        this.f20934c = provider3;
        this.f20935d = provider4;
        this.f20936e = provider5;
        this.f20937f = provider6;
        this.f20938g = provider7;
        this.f20939h = provider8;
        this.f20940i = provider9;
    }

    public static p a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9) {
        return new p(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static o c(Context context, y3.d dVar, f4.d dVar2, u uVar, Executor executor, g4.a aVar, h4.a aVar2, h4.a aVar3, f4.c cVar) {
        return new o(context, dVar, dVar2, uVar, executor, aVar, aVar2, aVar3, cVar);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public o get() {
        return c((Context) this.f20932a.get(), (y3.d) this.f20933b.get(), (f4.d) this.f20934c.get(), (u) this.f20935d.get(), (Executor) this.f20936e.get(), (g4.a) this.f20937f.get(), (h4.a) this.f20938g.get(), (h4.a) this.f20939h.get(), (f4.c) this.f20940i.get());
    }
}
