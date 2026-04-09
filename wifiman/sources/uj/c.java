package uj;

import kotlin.jvm.internal.AbstractC6492s;
import rj.InterfaceC7733m2;

/* loaded from: classes4.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    private final d f63184a;

    /* renamed from: b, reason: collision with root package name */
    private final d f63185b;

    public c(d src, d dst) {
        AbstractC6492s.i(src, "src");
        AbstractC6492s.i(dst, "dst");
        this.f63184a = src;
        this.f63185b = dst;
    }

    @Override // uj.d
    public Object a(InterfaceC7733m2 di2, Object ctx) {
        AbstractC6492s.i(di2, "di");
        AbstractC6492s.i(ctx, "ctx");
        Object objA = this.f63184a.a(di2, ctx);
        if (objA != null) {
            return this.f63185b.a(di2, objA);
        }
        return null;
    }

    @Override // uj.d
    public org.kodein.type.q b() {
        return this.f63184a.b();
    }

    @Override // uj.d
    public org.kodein.type.q c() {
        return this.f63185b.c();
    }

    public String toString() {
        return '(' + this.f63184a + " -> " + this.f63185b + ')';
    }
}
