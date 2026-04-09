package O8;

import P8.f;
import Yg.s;
import Yg.z;
import com.ubnt.usurvey.R;
import com.ui.wifiman.model.wmw.WifimanWizard;
import ec.AbstractC5452a;
import gg.AbstractC5912b;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import gg.f;
import gg.i;
import hc.C5973a;
import hc.InterfaceC5974b;
import kg.InterfaceC6465b;
import kg.n;
import kg.q;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class c implements O8.a {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5974b f17627a;

    /* renamed from: b, reason: collision with root package name */
    private final i f17628b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC5912b f17629c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC5912b f17630d;

    static final class a implements n {
        a() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f apply(Boolean enabled) {
            AbstractC6492s.i(enabled, "enabled");
            return enabled.booleanValue() ? c.this.f17629c : AbstractC5912b.m();
        }
    }

    static final class b implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f17632a = new b();

        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(f.b popupState) {
            boolean z10;
            AbstractC6492s.i(popupState, "popupState");
            if (popupState instanceof f.b.C0647b) {
                z10 = false;
            } else {
                if (!(popupState instanceof f.b.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* renamed from: O8.c$c, reason: collision with other inner class name */
    static final class C0608c implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final C0608c f17633a = new C0608c();

        C0608c() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final s apply(s sVar, WifimanWizard.a current) {
            AbstractC6492s.i(sVar, "<destruct>");
            AbstractC6492s.i(current, "current");
            return z.a((WifimanWizard.a) sVar.c(), current);
        }
    }

    static final class d implements n {

        public static final class a implements InterfaceC5915e {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ c f17635a;

            public a(c cVar) {
                this.f17635a = cVar;
            }

            @Override // gg.InterfaceC5915e
            public final void a(InterfaceC5913c interfaceC5913c) {
                try {
                    this.f17635a.f17627a.a(new C5973a(new AbstractC5452a.C1741a(R.string.wm_wizard_toast_connected, new Object[0]), false, 2, null));
                    interfaceC5913c.a();
                } catch (Throwable th2) {
                    interfaceC5913c.onError(th2);
                }
            }
        }

        public static final class b implements InterfaceC5915e {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ c f17636a;

            public b(c cVar) {
                this.f17636a = cVar;
            }

            @Override // gg.InterfaceC5915e
            public final void a(InterfaceC5913c interfaceC5913c) {
                try {
                    this.f17636a.f17627a.a(new C5973a(new AbstractC5452a.C1741a(R.string.wm_wizard_toast_disconnected, new Object[0]), false, 2, null));
                    interfaceC5913c.a();
                } catch (Throwable th2) {
                    interfaceC5913c.onError(th2);
                }
            }
        }

        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(s sVar) {
            AbstractC6492s.i(sVar, "<destruct>");
            WifimanWizard.a aVar = (WifimanWizard.a) sVar.a();
            WifimanWizard.a aVar2 = (WifimanWizard.a) sVar.c();
            if (aVar2 == null || (aVar2 instanceof WifimanWizard.a.c) || (aVar2 instanceof WifimanWizard.a.b) || (aVar2 instanceof WifimanWizard.a.AbstractC1520a.d) || (aVar2 instanceof WifimanWizard.a.AbstractC1520a.b)) {
                return AbstractC5912b.m();
            }
            if (aVar2 instanceof WifimanWizard.a.AbstractC1520a.C1521a) {
                if (aVar == null || (aVar instanceof WifimanWizard.a.AbstractC1520a.C1521a)) {
                    AbstractC5912b abstractC5912bM = AbstractC5912b.m();
                    AbstractC6492s.f(abstractC5912bM);
                    return abstractC5912bM;
                }
                AbstractC5912b abstractC5912bR = AbstractC5912b.r(new a(c.this));
                AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
                return abstractC5912bR;
            }
            if (!(aVar2 instanceof WifimanWizard.a.AbstractC1520a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            if (aVar == null || !(aVar instanceof WifimanWizard.a.AbstractC1520a.C1521a)) {
                AbstractC5912b abstractC5912bM2 = AbstractC5912b.m();
                AbstractC6492s.f(abstractC5912bM2);
                return abstractC5912bM2;
            }
            AbstractC5912b abstractC5912bR2 = AbstractC5912b.r(new b(c.this));
            AbstractC6492s.h(abstractC5912bR2, "crossinline action: () -…or(error)\n        }\n    }");
            return abstractC5912bR2;
        }
    }

    public c(WifimanWizard wifimanWizard, InterfaceC5974b toastService, P8.f popupController) {
        AbstractC6492s.i(wifimanWizard, "wifimanWizard");
        AbstractC6492s.i(toastService, "toastService");
        AbstractC6492s.i(popupController, "popupController");
        this.f17627a = toastService;
        i iVarW = popupController.getState().N0(b.f17632a).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        this.f17628b = iVarW;
        AbstractC5912b abstractC5912bF0 = wifimanWizard.getState().s1(new q() { // from class: O8.b
            @Override // kg.q
            public final Object get() {
                return c.e();
            }
        }, C0608c.f17633a).t0(new d()).f0().r0().l1().f0();
        AbstractC6492s.h(abstractC5912bF0, "ignoreElements(...)");
        this.f17629c = abstractC5912bF0;
        AbstractC5912b abstractC5912bF02 = iVarW.L1(new a()).f0().r0().l1().f0();
        AbstractC6492s.h(abstractC5912bF02, "ignoreElements(...)");
        this.f17630d = abstractC5912bF02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s e() {
        return z.a(null, null);
    }

    @Override // O8.a
    public AbstractC5912b a() {
        return this.f17630d;
    }
}
