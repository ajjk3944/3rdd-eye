package p000if;

import Be.AbstractC2480o;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.o1;
import Yg.J;
import androidx.compose.foundation.layout.r;
import androidx.compose.ui.e;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import m8.AbstractC6780c;
import mh.InterfaceC6824a;
import mh.q;
import s9.b;
import s9.d;
import th.g;
import z.InterfaceC8687j;

/* renamed from: if.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6151d {

    /* renamed from: if.d$a */
    static final class a implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC6149b f49173a;

        /* renamed from: if.d$a$a, reason: collision with other inner class name */
        /* synthetic */ class C1850a extends C6490p implements InterfaceC6824a {
            C1850a(Object obj) {
                super(0, obj, AbstractC6149b.class, "onPositiveButtonClicked", "onPositiveButtonClicked()V", 0);
            }

            public final void a() {
                ((AbstractC6149b) this.receiver).p0();
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return J.f24997a;
            }
        }

        a(AbstractC6149b abstractC6149b) {
            this.f49173a = abstractC6149b;
        }

        public final void a(InterfaceC8687j ModalScaffold, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(ModalScaffold, "$this$ModalScaffold");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-105447048, i10, -1, "com.ui.wifiman.ui.speedtest.error.SpeedtestFailedUi.<anonymous> (SpeedtestFailedUi.kt:21)");
            }
            e eVarH = r.h(e.f28771b0, 0.0f, 1, null);
            b bVarL = Pe.a.f18599a.L();
            d dVar = (d) o1.b(this.f49173a.getTitle(), null, interfaceC3540l, 0, 1).getValue();
            d dVar2 = (d) o1.b(this.f49173a.o0(), null, interfaceC3540l, 0, 1).getValue();
            d.b bVar = new d.b(AbstractC6780c.f53482f);
            AbstractC6149b abstractC6149b = this.f49173a;
            interfaceC3540l.U(-1174391099);
            boolean zT = interfaceC3540l.T(abstractC6149b);
            Object objF = interfaceC3540l.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                objF = new C1850a(abstractC6149b);
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            AbstractC2480o.f(eVarH, bVarL, dVar, dVar2, null, bVar, (InterfaceC6824a) ((g) objF), null, null, interfaceC3540l, 54, 400);
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

    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final androidx.compose.ui.e r11, final p000if.AbstractC6149b r12, T.InterfaceC3540l r13, final int r14, final int r15) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000if.AbstractC6151d.b(androidx.compose.ui.e, if.b, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J c(e eVar, AbstractC6149b abstractC6149b, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        b(eVar, abstractC6149b, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }
}
