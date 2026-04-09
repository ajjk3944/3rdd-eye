package c8;

import Mj.x;
import Nj.g;
import Y6.r;
import gg.C;
import gg.InterfaceC5910A;
import gg.z;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: c8.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4231c {

    /* renamed from: a, reason: collision with root package name */
    private final r f33893a;

    /* renamed from: b, reason: collision with root package name */
    private final z f33894b;

    /* renamed from: c8.c$a */
    public static final class a implements C {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ EnumC4229a f33895a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C4231c f33896b;

        public a(EnumC4229a enumC4229a, C4231c c4231c) {
            this.f33895a = enumC4229a;
            this.f33896b = c4231c;
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                interfaceC5910A.onSuccess((InterfaceC4230b) new x.b().c(this.f33895a.getBaseUrl()).a(g.e()).b(Pj.a.g(this.f33896b.f33893a)).e().b(InterfaceC4230b.class));
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    public C4231c(EnumC4229a environment) {
        AbstractC6492s.i(environment, "environment");
        this.f33893a = new r.a().c();
        z zVarI = z.i(new a(environment, this));
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        z zVarE = zVarI.e();
        AbstractC6492s.h(zVarE, "cache(...)");
        this.f33894b = zVarE;
    }

    public final z b() {
        return this.f33894b;
    }
}
