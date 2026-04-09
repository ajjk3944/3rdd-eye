package com.ui.wifiman.ui.teleport.consoles;

import N.a1;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.o1;
import Yg.J;
import androidx.compose.ui.e;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import sa.AbstractC7930a;
import z.InterfaceC8687j;
import z.a0;

/* loaded from: classes4.dex */
public abstract class y {

    static final class a implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ w f45104a;

        a(w wVar) {
            this.f45104a = wVar;
        }

        public final void a(InterfaceC8687j ModalScaffold, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(ModalScaffold, "$this$ModalScaffold");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1010536772, i10, -1, "com.ui.wifiman.ui.teleport.consoles.TeleportConsoleUnavailableUi.<anonymous> (TeleportConsoleUnavailableUi.kt:31)");
            }
            Fe.j.c(androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), (s9.d) o1.b(this.f45104a.getTitle(), null, interfaceC3540l, 0, 1).getValue(), null, null, null, 0L, interfaceC3540l, 6, 60);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((InterfaceC8687j) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    static final class b implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ w f45105a;

        b(w wVar) {
            this.f45105a = wVar;
        }

        public final void a(InterfaceC8687j ModalScaffold, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(ModalScaffold, "$this$ModalScaffold");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-45804383, i10, -1, "com.ui.wifiman.ui.teleport.consoles.TeleportConsoleUnavailableUi.<anonymous> (TeleportConsoleUnavailableUi.kt:38)");
            }
            e.a aVar = androidx.compose.ui.e.f28771b0;
            C6562a c6562a = C6562a.f52458a;
            int i11 = C6562a.f52459b;
            androidx.compose.ui.e eVarM = androidx.compose.foundation.layout.o.m(androidx.compose.foundation.layout.o.k(aVar, c6562a.d(interfaceC3540l, i11).a().a().d(), 0.0f, 2, null), 0.0f, Y0.h.j(8), 0.0f, Y0.h.j(24), 5, null);
            a1.b(AbstractC7930a.b((s9.d) o1.b(this.f45105a.n0(), null, interfaceC3540l, 0, 1).getValue(), interfaceC3540l, 0), eVarM, c6562a.a(interfaceC3540l, i11).f().b(), 0L, null, null, null, 0L, null, W0.j.h(W0.j.f23523b.a()), 0L, 0, false, 0, 0, null, c6562a.c(interfaceC3540l, i11).b().a(), interfaceC3540l, 0, 0, 65016);
            a0.a(androidx.compose.foundation.layout.r.i(aVar, c6562a.d(interfaceC3540l, i11).a().b().a(Y0.h.j(32))), interfaceC3540l, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((InterfaceC8687j) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final com.ui.wifiman.ui.teleport.consoles.w r11, T.InterfaceC3540l r12, final int r13, final int r14) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ui.wifiman.ui.teleport.consoles.y.b(com.ui.wifiman.ui.teleport.consoles.w, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J c(w wVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        b(wVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }
}
