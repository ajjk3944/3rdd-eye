package lf;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.o1;
import Yg.J;
import androidx.compose.foundation.layout.r;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import lf.k;
import mh.q;
import q.AbstractC7391j;
import z.InterfaceC8687j;

/* loaded from: classes4.dex */
public abstract class j {

    static final class a implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f52610a;

        /* renamed from: lf.j$a$a, reason: collision with other inner class name */
        static final class C1944a implements q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ l f52611a;

            C1944a(l lVar) {
                this.f52611a = lVar;
            }

            public final void a(k cnt, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(cnt, "cnt");
                if ((i10 & 6) == 0) {
                    i10 |= interfaceC3540l.T(cnt) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(1406007431, i10, -1, "com.ui.wifiman.ui.speedtest.server.SpeedtestInternetServerPickerUi.<anonymous>.<anonymous> (SpeedtestInternetServerPickerUi.kt:36)");
                }
                if (cnt instanceof k.c) {
                    interfaceC3540l.U(735140204);
                    h.b(androidx.compose.ui.e.f28771b0, interfaceC3540l, 6);
                    interfaceC3540l.J();
                } else if (cnt instanceof k.b) {
                    interfaceC3540l.U(735145673);
                    f.b(androidx.compose.ui.e.f28771b0, (k.b) cnt, this.f52611a, interfaceC3540l, 6);
                    interfaceC3540l.J();
                } else {
                    if (!(cnt instanceof k.a)) {
                        interfaceC3540l.U(735137982);
                        interfaceC3540l.J();
                        throw new NoWhenBranchMatchedException();
                    }
                    interfaceC3540l.U(735153065);
                    d.b(androidx.compose.ui.e.f28771b0, this.f52611a, interfaceC3540l, 6);
                    interfaceC3540l.J();
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                a((k) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                return J.f24997a;
            }
        }

        a(l lVar) {
            this.f52610a = lVar;
        }

        public final void a(InterfaceC8687j ModalScaffold, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(ModalScaffold, "$this$ModalScaffold");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-510121807, i10, -1, "com.ui.wifiman.ui.speedtest.server.SpeedtestInternetServerPickerUi.<anonymous> (SpeedtestInternetServerPickerUi.kt:30)");
            }
            AbstractC7391j.a((k) o1.b(this.f52610a.n0(), null, interfaceC3540l, 0, 1).getValue(), r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), null, "content type", b0.c.e(1406007431, true, new C1944a(this.f52610a), interfaceC3540l, 54), interfaceC3540l, 27696, 4);
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
    /* JADX WARN: Removed duplicated region for block: B:55:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final androidx.compose.ui.e r11, final lf.l r12, T.InterfaceC3540l r13, final int r14, final int r15) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lf.j.b(androidx.compose.ui.e, lf.l, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J c(androidx.compose.ui.e eVar, l lVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        b(eVar, lVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }
}
