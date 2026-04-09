package xf;

import Af.A;
import Be.z0;
import C0.C;
import E0.InterfaceC2629g;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import Yg.J;
import androidx.compose.ui.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import mh.r;
import yf.InterfaceC8665a;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;
import z.a0;

/* renamed from: xf.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8531a {

    /* renamed from: a, reason: collision with root package name */
    public static final C8531a f66031a = new C8531a();

    /* renamed from: b, reason: collision with root package name */
    public static InterfaceC6839p f66032b = b0.c.c(-25547155, false, C2338a.f66034a);

    /* renamed from: c, reason: collision with root package name */
    public static r f66033c = b0.c.c(-1025569532, false, b.f66035a);

    /* renamed from: xf.a$a, reason: collision with other inner class name */
    static final class C2338a implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final C2338a f66034a = new C2338a();

        C2338a() {
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-25547155, i10, -1, "com.ui.wifiman.ui.wifi.ap.ComposableSingletons$WifiAccessPointDetailUiContentKt.lambda-1.<anonymous> (WifiAccessPointDetailUiContent.kt:68)");
            }
            e.a aVar = androidx.compose.ui.e.f28771b0;
            C cA = AbstractC8685h.a(C8680c.f66832a.g(), f0.c.f46573a.k(), interfaceC3540l, 0);
            int iA = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, aVar);
            InterfaceC2629g.a aVar2 = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar2.a();
            if (interfaceC3540l.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540l.u();
            if (interfaceC3540l.o()) {
                interfaceC3540l.D(interfaceC6824aA);
            } else {
                interfaceC3540l.I();
            }
            InterfaceC3540l interfaceC3540lA = E1.a(interfaceC3540l);
            E1.c(interfaceC3540lA, cA, aVar2.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar2.g());
            InterfaceC6839p interfaceC6839pB = aVar2.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar2.f());
            C8688k c8688k = C8688k.f66923a;
            float f10 = 16;
            a0.a(androidx.compose.foundation.layout.r.i(aVar, Y0.h.j(f10)), interfaceC3540l, 6);
            A.b(androidx.compose.foundation.layout.r.h(aVar, 0.0f, 1, null), null, interfaceC3540l, 6, 2);
            a0.a(androidx.compose.foundation.layout.r.i(aVar, Y0.h.j(f10)), interfaceC3540l, 6);
            androidx.compose.foundation.layout.d.a(androidx.compose.foundation.layout.r.i(aVar, Y0.h.j(164)), interfaceC3540l, 6);
            interfaceC3540l.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    /* renamed from: xf.a$b */
    static final class b implements r {

        /* renamed from: a, reason: collision with root package name */
        public static final b f66035a = new b();

        b() {
        }

        public final void a(androidx.compose.ui.e itemModifier, InterfaceC8665a item, InterfaceC3540l interfaceC3540l, int i10) {
            int i11;
            AbstractC6492s.i(itemModifier, "itemModifier");
            AbstractC6492s.i(item, "item");
            if ((i10 & 6) == 0) {
                i11 = i10 | (interfaceC3540l.T(itemModifier) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i10 & 48) == 0) {
                i11 |= (i10 & 64) == 0 ? interfaceC3540l.T(item) : interfaceC3540l.l(item) ? 32 : 16;
            }
            if ((i11 & 147) == 146 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1025569532, i11, -1, "com.ui.wifiman.ui.wifi.ap.ComposableSingletons$WifiAccessPointDetailUiContentKt.lambda-2.<anonymous> (WifiAccessPointDetailUiContent.kt:148)");
            }
            if (!(item instanceof InterfaceC8665a.C2371a)) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC8665a.C2371a c2371a = (InterfaceC8665a.C2371a) item;
            z0.b(itemModifier, c2371a.a(), null, c2371a.b(), false, 0, 0, 0, interfaceC3540l, i11 & 14, 244);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.r
        public /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3, Object obj4) {
            a((androidx.compose.ui.e) obj, (InterfaceC8665a) obj2, (InterfaceC3540l) obj3, ((Number) obj4).intValue());
            return J.f24997a;
        }
    }

    public final InterfaceC6839p a() {
        return f66032b;
    }

    public final r b() {
        return f66033c;
    }
}
