package gd;

import G7.a;
import G7.q;
import gd.C5896a;
import gg.C;
import gg.InterfaceC5910A;
import gg.z;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: gd.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5897b implements C5896a.b {

    /* renamed from: b, reason: collision with root package name */
    public static final a f47836b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final z f47837a;

    /* renamed from: gd.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: gd.b$b, reason: collision with other inner class name */
    public static final class C1779b implements C5896a.InterfaceC1778a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ a.InterfaceC0278a f47838a;

        C1779b(a.InterfaceC0278a interfaceC0278a) {
            this.f47838a = interfaceC0278a;
        }

        @Override // gd.C5896a.InterfaceC1778a
        public C5896a a(int i10) {
            q qVarA = this.f47838a.a(i10);
            if (qVarA == null) {
                return null;
            }
            return new C5896a(qVarA.b(), qVarA.d(), qVarA.c(), qVarA.a());
        }
    }

    /* renamed from: gd.b$c */
    public static final class c implements C {
        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                Z7.b.g("Service lookup load started", "Port Services");
                a.InterfaceC0278a interfaceC0278aA = G7.a.f7095a.a();
                Z7.b.g("Services lookup load ended. Time: " + (System.currentTimeMillis() - jCurrentTimeMillis), "Port Services");
                interfaceC5910A.onSuccess(new C1779b(interfaceC0278aA));
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    public C5897b() {
        z zVarI = z.i(new c());
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        z zVarE = zVarI.O(Gg.a.d()).E(Gg.a.a()).e();
        AbstractC6492s.h(zVarE, "cache(...)");
        this.f47837a = zVarE;
    }

    @Override // gd.C5896a.b
    public z a() {
        return this.f47837a;
    }
}
