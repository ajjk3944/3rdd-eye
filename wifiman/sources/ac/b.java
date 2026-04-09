package Ac;

import Ac.a;
import com.ui.wifiman.model.vendor.d;
import gg.C;
import gg.InterfaceC5910A;
import gg.z;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n7.C6875a;

/* loaded from: classes4.dex */
public final class b implements Ac.a {

    /* renamed from: c, reason: collision with root package name */
    public static final a f609c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final d.b f610a;

    /* renamed from: b, reason: collision with root package name */
    private final z f611b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: Ac.b$b, reason: collision with other inner class name */
    public static final class C0019b implements a.InterfaceC0018a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C6875a.InterfaceC1965a f612a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f613b;

        C0019b(C6875a.InterfaceC1965a interfaceC1965a, b bVar) {
            this.f612a = interfaceC1965a;
            this.f613b = bVar;
        }

        @Override // Ac.a.InterfaceC0018a
        public d a(int i10) {
            String strA = this.f612a.a(i10);
            if (strA != null) {
                return this.f613b.f610a.b(strA);
            }
            return null;
        }
    }

    public static final class c implements C {
        public c() {
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                Z7.b.g("OUI Bluetooth lookup db LOAD start", "Bluetooth Vendor Dir");
                C6875a.InterfaceC1965a interfaceC1965aA = C6875a.f54295a.a();
                Z7.b.g("OUI Bluetooth lookup db LOAD ended. Took " + (System.currentTimeMillis() - jCurrentTimeMillis), "Bluetooth Vendor Dir");
                interfaceC5910A.onSuccess(new C0019b(interfaceC1965aA, b.this));
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    public b(d.b vendorManager) {
        AbstractC6492s.i(vendorManager, "vendorManager");
        this.f610a = vendorManager;
        z zVarI = z.i(new c());
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        z zVarE = zVarI.O(Gg.a.d()).e();
        AbstractC6492s.h(zVarE, "cache(...)");
        this.f611b = zVarE;
    }

    @Override // Ac.a
    public z a() {
        return this.f611b;
    }
}
