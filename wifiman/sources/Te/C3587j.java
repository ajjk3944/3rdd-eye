package Te;

import L0.C3174d;
import N.O0;
import S8.l;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import Te.C3592l0;
import W7.a;
import mh.InterfaceC6839p;

/* renamed from: Te.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3587j {

    /* renamed from: a, reason: collision with root package name */
    public static final C3587j f21858a = new C3587j();

    /* renamed from: b, reason: collision with root package name */
    public static InterfaceC6839p f21859b = b0.c.c(-25601209, false, a.f21862a);

    /* renamed from: c, reason: collision with root package name */
    public static InterfaceC6839p f21860c = b0.c.c(-1509765750, false, b.f21863a);

    /* renamed from: d, reason: collision with root package name */
    public static InterfaceC6839p f21861d = b0.c.c(-367625402, false, c.f21864a);

    /* renamed from: Te.j$a */
    static final class a implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final a f21862a = new a();

        a() {
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-25601209, i10, -1, "com.ui.wifiman.ui.signal.components.ComposableSingletons$SignalTabConnectionStatsBarKt.lambda-1.<anonymous> (SignalTabConnectionStatsBar.kt:126)");
            }
            w0.l(new C3174d("-100 Dbm", null, null, 6, null), null, 0L, interfaceC3540l, 6, 6);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    /* renamed from: Te.j$b */
    static final class b implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final b f21863a = new b();

        b() {
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1509765750, i10, -1, "com.ui.wifiman.ui.signal.components.ComposableSingletons$SignalTabConnectionStatsBarKt.lambda-2.<anonymous> (SignalTabConnectionStatsBar.kt:219)");
            }
            androidx.compose.ui.e eVarH = androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null);
            S8.c cVar = S8.c.GHZ_2_4;
            l.a aVar = S8.l.f20404f;
            S8.l lVarA = aVar.a(-42);
            a.C0878a c0878a = W7.a.f23676b;
            Yg.s sVarA = Yg.z.a(cVar, new C3592l0.a(cVar, lVarA, null, new W7.b(c0878a.d(100), c0878a.d(100))));
            S8.c cVar2 = S8.c.GHZ_5;
            Yg.s sVarA2 = Yg.z.a(cVar2, new C3592l0.a(cVar2, aVar.a(-99), S8.d.MHZ_160, new W7.b(c0878a.d(100), c0878a.d(100))));
            S8.c cVar3 = S8.c.GHZ_6;
            w0.o(eVarH, new C3592l0(Ci.a.j(Zg.U.k(sVarA, sVarA2, Yg.z.a(cVar3, new C3592l0.a(cVar3, null, S8.d.MHZ_20, new W7.b(c0878a.d(100), c0878a.d(100))))))), interfaceC3540l, 6);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    /* renamed from: Te.j$c */
    static final class c implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final c f21864a = new c();

        c() {
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-367625402, i10, -1, "com.ui.wifiman.ui.signal.components.ComposableSingletons$SignalTabConnectionStatsBarKt.lambda-3.<anonymous> (SignalTabConnectionStatsBar.kt:218)");
            }
            O0.a(androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), null, 0L, 0L, null, 0.0f, C3587j.f21858a.b(), interfaceC3540l, 1572870, 62);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    public final InterfaceC6839p a() {
        return f21859b;
    }

    public final InterfaceC6839p b() {
        return f21860c;
    }
}
