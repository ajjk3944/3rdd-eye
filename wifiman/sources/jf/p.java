package jf;

import Li.P;
import Li.z;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.o1;
import Yg.J;
import Zg.AbstractC3689v;
import android.content.res.Resources;
import androidx.compose.foundation.layout.r;
import hf.AbstractC6027J;
import jf.AbstractC6321d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import m8.AbstractC6780c;
import mh.q;
import org.kodein.di.DI;
import q.AbstractC7391j;
import s9.d;
import z.InterfaceC8687j;

/* loaded from: classes4.dex */
public abstract class p {

    static final class a implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC6325h f50858a;

        /* renamed from: jf.p$a$a, reason: collision with other inner class name */
        static final class C1879a implements q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AbstractC6325h f50859a;

            C1879a(AbstractC6325h abstractC6325h) {
                this.f50859a = abstractC6325h;
            }

            public final void a(AbstractC6321d cnt, InterfaceC3540l interfaceC3540l, int i10) throws Resources.NotFoundException {
                AbstractC6492s.i(cnt, "cnt");
                if ((i10 & 6) == 0) {
                    i10 |= interfaceC3540l.T(cnt) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-1678330399, i10, -1, "com.ui.wifiman.ui.speedtest.result.SpeedtestResultDetailUi.<anonymous>.<anonymous> (SpeedtestResultDetailUi.kt:43)");
                }
                if (cnt instanceof AbstractC6321d.b) {
                    interfaceC3540l.U(-1817105087);
                    n.b(null, interfaceC3540l, 0, 1);
                    interfaceC3540l.J();
                } else {
                    if (!(cnt instanceof AbstractC6321d.a)) {
                        interfaceC3540l.U(-1817107356);
                        interfaceC3540l.J();
                        throw new NoWhenBranchMatchedException();
                    }
                    interfaceC3540l.U(-1817101976);
                    l.e(null, this.f50859a, interfaceC3540l, 0, 1);
                    interfaceC3540l.J();
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) throws Resources.NotFoundException {
                a((AbstractC6321d) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                return J.f24997a;
            }
        }

        a(AbstractC6325h abstractC6325h) {
            this.f50858a = abstractC6325h;
        }

        public final void a(InterfaceC8687j ModalScaffold, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(ModalScaffold, "$this$ModalScaffold");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(636123659, i10, -1, "com.ui.wifiman.ui.speedtest.result.SpeedtestResultDetailUi.<anonymous> (SpeedtestResultDetailUi.kt:36)");
            }
            AbstractC7391j.a((AbstractC6321d) o1.b(this.f50858a.q0(), null, interfaceC3540l, 0, 1).getValue(), r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), null, "SpeedtestResultDetailUi", b0.c.e(-1678330399, true, new C1879a(this.f50858a), interfaceC3540l, 54), interfaceC3540l, 27696, 4);
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

    public static final class b extends AbstractC6325h {

        /* renamed from: g, reason: collision with root package name */
        private final z f50860g;

        /* renamed from: h, reason: collision with root package name */
        private final z f50861h;

        /* renamed from: i, reason: collision with root package name */
        private final z f50862i;

        /* renamed from: j, reason: collision with root package name */
        private final z f50863j;

        b(AbstractC6321d abstractC6321d, C6324g c6324g, C6322e c6322e, C6320c c6320c) {
            this.f50860g = P.a(abstractC6321d);
            this.f50861h = P.a(c6324g);
            this.f50862i = P.a(c6322e);
            this.f50863j = P.a(c6320c);
        }

        @Override // jf.AbstractC6325h
        /* renamed from: A0, reason: merged with bridge method [inline-methods] */
        public z q0() {
            return this.f50860g;
        }

        @Override // org.kodein.di.c
        public DI d() {
            throw new Yg.r(null, 1, null);
        }

        @Override // jf.AbstractC6325h
        public void s0(String id2) {
            AbstractC6492s.i(id2, "id");
        }

        @Override // jf.AbstractC6325h
        public void t0() {
        }

        @Override // jf.AbstractC6325h
        public void u0() {
        }

        @Override // jf.AbstractC6325h
        public void v0() {
        }

        @Override // jf.AbstractC6325h
        public void w0(boolean z10) {
        }

        @Override // jf.AbstractC6325h
        /* renamed from: x0, reason: merged with bridge method [inline-methods] */
        public z n0() {
            return this.f50863j;
        }

        @Override // jf.AbstractC6325h
        /* renamed from: y0, reason: merged with bridge method [inline-methods] */
        public z o0() {
            return this.f50862i;
        }

        @Override // jf.AbstractC6325h
        /* renamed from: z0, reason: merged with bridge method [inline-methods] */
        public z p0() {
            return this.f50861h;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final androidx.compose.ui.e r11, final jf.AbstractC6325h r12, T.InterfaceC3540l r13, final int r14, final int r15) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: jf.p.b(androidx.compose.ui.e, jf.h, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J c(androidx.compose.ui.e eVar, AbstractC6325h abstractC6325h, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        b(eVar, abstractC6325h, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC6325h e(AbstractC6321d abstractC6321d, C6324g c6324g, C6322e c6322e, C6320c c6320c, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        interfaceC3540l.U(1895295786);
        AbstractC6321d abstractC6321d2 = (i11 & 1) != 0 ? AbstractC6321d.a.f50822a : abstractC6321d;
        C6324g c6324g2 = (i11 & 2) != 0 ? new C6324g(Pe.a.f18599a.d0(), new d.c("WiFiman"), new d.c("Internet → iPhone"), new d.c("Just Now"), AbstractC6027J.L(null, null, null, null, null, interfaceC3540l, 0, 31), new d.b(AbstractC6780c.f53542n3), AbstractC3689v.l()) : c6324g;
        C6322e c6322e2 = (i11 & 4) != 0 ? new C6322e(true) : c6322e;
        C6320c c6320c2 = (i11 & 8) != 0 ? new C6320c(true, true, true) : c6320c;
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(1895295786, i10, -1, "com.ui.wifiman.ui.speedtest.result.previewSpeedtestResultVM (SpeedtestResultDetailUi.kt:71)");
        }
        b bVar = new b(abstractC6321d2, c6324g2, c6322e2, c6320c2);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return bVar;
    }
}
