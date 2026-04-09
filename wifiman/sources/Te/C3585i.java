package Te;

import E0.InterfaceC2629g;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import androidx.compose.ui.e;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;
import z.InterfaceC8687j;

/* renamed from: Te.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3585i {

    /* renamed from: a, reason: collision with root package name */
    public static final C3585i f21850a = new C3585i();

    /* renamed from: b, reason: collision with root package name */
    public static mh.q f21851b = b0.c.c(-1280658563, false, a.f21852a);

    /* renamed from: Te.i$a */
    static final class a implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        public static final a f21852a = new a();

        a() {
        }

        public final void a(InterfaceC8687j UiContentCard, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(UiContentCard, "$this$UiContentCard");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1280658563, i10, -1, "com.ui.wifiman.ui.signal.components.ComposableSingletons$FloorplanRecordItemLoadingKt.lambda-1.<anonymous> (FloorplanRecordItemLoading.kt:35)");
            }
            e.a aVar = androidx.compose.ui.e.f28771b0;
            float f10 = 16;
            androidx.compose.ui.e eVarM = androidx.compose.foundation.layout.o.m(androidx.compose.foundation.layout.r.h(aVar, 0.0f, 1, null), Y0.h.j(f10), Y0.h.j(f10), Y0.h.j(f10), 0.0f, 8, null);
            float f11 = 8;
            C0.C cA = AbstractC8685h.a(C8680c.f66832a.n(Y0.h.j(f11)), f0.c.f46573a.k(), interfaceC3540l, 6);
            int iA = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarM);
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
            AbstractC3604x.h(androidx.compose.foundation.layout.o.k(androidx.compose.foundation.layout.r.h(aVar, 0.0f, 1, null), Y0.h.j(f11), 0.0f, 2, null), interfaceC3540l, 6);
            androidx.compose.foundation.layout.d.a(androidx.compose.foundation.b.d(androidx.compose.foundation.layout.r.h(androidx.compose.foundation.layout.r.i(aVar, Y0.h.j(190)), 0.0f, 1, null), C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().g().e(), null, 2, null), interfaceC3540l, 0);
            AbstractC3604x.d(androidx.compose.foundation.layout.o.m(androidx.compose.foundation.layout.r.h(aVar, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Y0.h.j(f11), 7, null), interfaceC3540l, 6);
            interfaceC3540l.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((InterfaceC8687j) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return Yg.J.f24997a;
        }
    }

    public final mh.q a() {
        return f21851b;
    }
}
