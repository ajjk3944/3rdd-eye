package Zi;

import kotlin.jvm.internal.AbstractC6492s;
import lh.AbstractC6596a;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;

/* renamed from: Zi.t, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C3731t implements S0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6835l f25690a;

    /* renamed from: b, reason: collision with root package name */
    private final C3735v f25691b;

    /* renamed from: Zi.t$a */
    public static final class a implements InterfaceC6824a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ th.d f25693b;

        public a(th.d dVar) {
            this.f25693b = dVar;
        }

        @Override // mh.InterfaceC6824a
        public final Object invoke() {
            return new C3718m((Vi.b) C3731t.this.b().invoke(this.f25693b));
        }
    }

    public C3731t(InterfaceC6835l compute) {
        AbstractC6492s.i(compute, "compute");
        this.f25690a = compute;
        this.f25691b = new C3735v();
    }

    @Override // Zi.S0
    public Vi.b a(th.d key) {
        AbstractC6492s.i(key, "key");
        Object obj = this.f25691b.get(AbstractC6596a.b(key));
        AbstractC6492s.h(obj, "get(...)");
        C3719m0 c3719m0 = (C3719m0) obj;
        Object objA = c3719m0.f25665a.get();
        if (objA == null) {
            objA = c3719m0.a(new a(key));
        }
        return ((C3718m) objA).f25664a;
    }

    public final InterfaceC6835l b() {
        return this.f25690a;
    }
}
