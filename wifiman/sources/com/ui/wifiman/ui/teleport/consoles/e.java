package com.ui.wifiman.ui.teleport.consoles;

import N.a1;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.o1;
import Yg.J;
import android.content.res.Resources;
import androidx.compose.ui.e;
import com.google.ar.core.ImageMetadata;
import com.ui.wifiman.ui.teleport.consoles.e;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import m8.AbstractC6780c;
import mh.InterfaceC6824a;
import xe.AbstractC8460B;
import xe.InterfaceC8511f;
import z.InterfaceC8687j;
import z.a0;

/* loaded from: classes4.dex */
public abstract class e {

    static final class a implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f45028a;

        a(c cVar) {
            this.f45028a = cVar;
        }

        public final void a(InterfaceC8687j ModalScaffold, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(ModalScaffold, "$this$ModalScaffold");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1261191894, i10, -1, "com.ui.wifiman.ui.teleport.consoles.TeleportConsoleDeleteUi.<anonymous> (TeleportConsoleDeleteUi.kt:33)");
            }
            Fe.j.c(androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), (s9.d) o1.b(this.f45028a.getTitle(), null, interfaceC3540l, 0, 1).getValue(), null, null, null, 0L, interfaceC3540l, 6, 60);
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
        final /* synthetic */ c f45029a;

        b(c cVar) {
            this.f45029a = cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J e(c cVar) {
            cVar.o0();
            return J.f24997a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J f(InterfaceC8511f.b bVar) {
            bVar.a();
            return J.f24997a;
        }

        public final void c(InterfaceC8687j ModalScaffold, InterfaceC3540l interfaceC3540l, int i10) throws Resources.NotFoundException {
            AbstractC6492s.i(ModalScaffold, "$this$ModalScaffold");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-2138349369, i10, -1, "com.ui.wifiman.ui.teleport.consoles.TeleportConsoleDeleteUi.<anonymous> (TeleportConsoleDeleteUi.kt:40)");
            }
            e.a aVar = androidx.compose.ui.e.f28771b0;
            C6562a c6562a = C6562a.f52458a;
            int i11 = C6562a.f52459b;
            float f10 = 24;
            a1.b(H0.f.a(AbstractC6780c.f53392R3, interfaceC3540l, 0), androidx.compose.foundation.layout.o.m(androidx.compose.foundation.layout.o.k(aVar, c6562a.d(interfaceC3540l, i11).a().a().d(), 0.0f, 2, null), 0.0f, Y0.h.j(8), 0.0f, Y0.h.j(f10), 5, null), c6562a.a(interfaceC3540l, i11).f().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c6562a.c(interfaceC3540l, i11).b().a(), interfaceC3540l, 0, 0, 65528);
            androidx.compose.ui.e eVarK = androidx.compose.foundation.layout.o.k(androidx.compose.foundation.layout.r.h(aVar, 0.0f, 1, null), c6562a.d(interfaceC3540l, i11).a().a().d(), 0.0f, 2, null);
            interfaceC3540l.U(1306914193);
            boolean zT = interfaceC3540l.T(this.f45029a);
            final c cVar = this.f45029a;
            Object objF = interfaceC3540l.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6824a() { // from class: com.ui.wifiman.ui.teleport.consoles.f
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return e.b.e(cVar);
                    }
                };
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            w9.r.b(eVarK, (InterfaceC6824a) objF, false, false, null, w9.p.ALERT, H0.f.a(AbstractC6780c.f53385Q3, interfaceC3540l, 0), null, interfaceC3540l, ImageMetadata.EDGE_MODE, 156);
            final InterfaceC8511f.b bVar = (InterfaceC8511f.b) interfaceC3540l.t(AbstractC8460B.K());
            androidx.compose.ui.e eVarK2 = androidx.compose.foundation.layout.o.k(androidx.compose.foundation.layout.r.h(aVar, 0.0f, 1, null), c6562a.d(interfaceC3540l, i11).a().a().d(), 0.0f, 2, null);
            interfaceC3540l.U(1306926967);
            boolean zT2 = interfaceC3540l.T(bVar);
            Object objF2 = interfaceC3540l.f();
            if (zT2 || objF2 == InterfaceC3540l.f21100a.a()) {
                objF2 = new InterfaceC6824a() { // from class: com.ui.wifiman.ui.teleport.consoles.g
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return e.b.f(bVar);
                    }
                };
                interfaceC3540l.K(objF2);
            }
            interfaceC3540l.J();
            w9.o.c(eVarK2, (InterfaceC6824a) objF2, false, false, null, H0.f.a(AbstractC6780c.f53390R1, interfaceC3540l, 0), interfaceC3540l, 0, 28);
            a0.a(androidx.compose.foundation.layout.r.i(aVar, c6562a.d(interfaceC3540l, i11).a().b().a(Y0.h.j(f10))), interfaceC3540l, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) throws Resources.NotFoundException {
            c((InterfaceC8687j) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final com.ui.wifiman.ui.teleport.consoles.c r11, T.InterfaceC3540l r12, final int r13, final int r14) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ui.wifiman.ui.teleport.consoles.e.b(com.ui.wifiman.ui.teleport.consoles.c, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J c(c cVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        b(cVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }
}
