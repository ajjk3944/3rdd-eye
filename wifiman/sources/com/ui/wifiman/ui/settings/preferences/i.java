package com.ui.wifiman.ui.settings.preferences;

import Be.v0;
import C0.C;
import E0.InterfaceC2629g;
import N.a1;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import Yg.J;
import android.content.res.Resources;
import androidx.compose.ui.e;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import m8.AbstractC6780c;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import ta.AbstractC8049c;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;
import z.InterfaceC8687j;
import z.a0;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f44679a = new i();

    /* renamed from: b, reason: collision with root package name */
    public static mh.q f44680b = b0.c.c(21617572, false, a.f44682a);

    /* renamed from: c, reason: collision with root package name */
    public static InterfaceC6839p f44681c = b0.c.c(1586405004, false, b.f44683a);

    static final class a implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        public static final a f44682a = new a();

        a() {
        }

        public final void a(InterfaceC8687j ModalScaffold, InterfaceC3540l interfaceC3540l, int i10) throws Resources.NotFoundException {
            AbstractC6492s.i(ModalScaffold, "$this$ModalScaffold");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(21617572, i10, -1, "com.ui.wifiman.ui.settings.preferences.ComposableSingletons$TeleportQuickActionExplanationRemoveUiKt.lambda-1.<anonymous> (TeleportQuickActionExplanationRemoveUi.kt:50)");
            }
            e.a aVar = androidx.compose.ui.e.f28771b0;
            androidx.compose.ui.e eVarH = androidx.compose.foundation.layout.r.h(aVar, 0.0f, 1, null);
            C cA = AbstractC8685h.a(C8680c.f66832a.g(), f0.c.f46573a.g(), interfaceC3540l, 48);
            int iA = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarH);
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
            a0.a(androidx.compose.foundation.layout.r.i(aVar, Y0.h.j(8)), interfaceC3540l, 6);
            AbstractC8049c.e(Pe.b.f18633a.f(), aVar, null, null, null, null, null, 0.0f, null, interfaceC3540l, 54, 254);
            float f10 = 16;
            a0.a(androidx.compose.foundation.layout.r.i(aVar, Y0.h.j(f10)), interfaceC3540l, 6);
            androidx.compose.ui.e eVarH2 = androidx.compose.foundation.layout.r.h(aVar, 0.0f, 1, null);
            C6562a c6562a = C6562a.f52458a;
            int i11 = C6562a.f52459b;
            androidx.compose.ui.e eVarK = androidx.compose.foundation.layout.o.k(eVarH2, c6562a.d(interfaceC3540l, i11).a().a().d(), 0.0f, 2, null);
            a1.b(H0.f.a(AbstractC6780c.f53433X3, interfaceC3540l, 0), eVarK, c6562a.a(interfaceC3540l, i11).f().b(), 0L, null, null, null, 0L, null, W0.j.h(W0.j.f23523b.d()), 0L, 0, false, 0, 0, null, c6562a.c(interfaceC3540l, i11).b().a(), interfaceC3540l, 0, 0, 65016);
            a0.a(androidx.compose.foundation.layout.r.i(aVar, Y0.h.j(f10)), interfaceC3540l, 6);
            v0.b(null, interfaceC3540l, 0, 1);
            interfaceC3540l.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) throws Resources.NotFoundException {
            a((InterfaceC8687j) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    static final class b implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final b f44683a = new b();

        b() {
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1586405004, i10, -1, "com.ui.wifiman.ui.settings.preferences.ComposableSingletons$TeleportQuickActionExplanationRemoveUiKt.lambda-2.<anonymous> (TeleportQuickActionExplanationRemoveUi.kt:83)");
            }
            s.b(interfaceC3540l, 0);
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

    public final mh.q a() {
        return f44680b;
    }
}
