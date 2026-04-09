package Jc;

import Dc.k;
import Jc.a;
import gg.C;
import gg.InterfaceC5910A;
import gg.y;
import gg.z;
import inet.ipaddr.e;
import inet.ipaddr.g;
import java.util.concurrent.TimeUnit;
import kg.n;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l9.C6556a;

/* loaded from: classes4.dex */
public final class c extends Jc.a {

    /* renamed from: g, reason: collision with root package name */
    public static final a f9986g = new a(null);

    /* renamed from: d, reason: collision with root package name */
    private final y f9987d;

    /* renamed from: e, reason: collision with root package name */
    private final String f9988e;

    /* renamed from: f, reason: collision with root package name */
    private final k f9989f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements C {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f9990a;

        public b(g gVar) {
            this.f9990a = gVar;
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            String strG;
            try {
                e eVarM1 = this.f9990a.m1();
                a.b bVar = null;
                if (eVarM1 != null && (strG = eVarM1.g()) != null && !AbstractC6492s.d(strG, String.valueOf(this.f9990a))) {
                    bVar = new a.b(this.f9990a, strG, System.currentTimeMillis(), Long.MAX_VALUE);
                }
                interfaceC5910A.onSuccess(new C6556a(bVar));
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    public c(a.C0403a params, y scheduler) {
        AbstractC6492s.i(params, "params");
        AbstractC6492s.i(scheduler, "scheduler");
        this.f9987d = scheduler;
        this.f9988e = "HostnameDiscovery";
        this.f9989f = params.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6556a r(Throwable it) {
        AbstractC6492s.i(it, "it");
        return new C6556a(null);
    }

    @Override // Dc.t
    public k h() {
        return this.f9989f;
    }

    @Override // Dc.t
    protected String i() {
        return this.f9988e;
    }

    @Override // Dc.t
    protected y k() {
        return this.f9987d;
    }

    @Override // Dc.t
    protected z m(g ip) {
        AbstractC6492s.i(ip, "ip");
        z zVarI = z.i(new b(ip));
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        z zVarG = zVarI.Q(300L, TimeUnit.MILLISECONDS).G(new n() { // from class: Jc.b
            @Override // kg.n
            public final Object apply(Object obj) {
                return c.r((Throwable) obj);
            }
        });
        AbstractC6492s.h(zVarG, "onErrorReturn(...)");
        return zVarG;
    }
}
