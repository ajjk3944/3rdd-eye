package Ye;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.o1;
import Ye.d;
import Yg.J;
import androidx.compose.foundation.layout.r;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6839p;
import mh.q;
import q.AbstractC7391j;

/* loaded from: classes4.dex */
public abstract class l {

    static final class a implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f24945a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f24946b;

        /* renamed from: Ye.l$a$a, reason: collision with other inner class name */
        static final class C0959a implements q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ f f24947a;

            C0959a(f fVar) {
                this.f24947a = fVar;
            }

            public final void a(d cnt, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(cnt, "cnt");
                if ((i10 & 6) == 0) {
                    i10 |= interfaceC3540l.T(cnt) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-619977881, i10, -1, "com.ui.wifiman.ui.signal.floorplan.scan.FloorplanMapperUi.<anonymous>.<anonymous> (FloorplanMapperUi.kt:22)");
                }
                if (cnt instanceof d.a) {
                    interfaceC3540l.U(-875220011);
                    i.e(null, this.f24947a, interfaceC3540l, 0, 1);
                    interfaceC3540l.J();
                } else {
                    if (!(cnt instanceof d.b)) {
                        interfaceC3540l.U(-875222088);
                        interfaceC3540l.J();
                        throw new NoWhenBranchMatchedException();
                    }
                    interfaceC3540l.U(-1361917053);
                    n.b(null, (d.b) cnt, this.f24947a, interfaceC3540l, 0, 1);
                    interfaceC3540l.J();
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                a((d) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                return J.f24997a;
            }
        }

        a(f fVar, androidx.compose.ui.e eVar) {
            this.f24945a = fVar;
            this.f24946b = eVar;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1422385297, i10, -1, "com.ui.wifiman.ui.signal.floorplan.scan.FloorplanMapperUi.<anonymous> (FloorplanMapperUi.kt:16)");
            }
            AbstractC7391j.a((d) o1.b(this.f24945a.o0(), null, interfaceC3540l, 0, 1).getValue(), r.f(this.f24946b, 0.0f, 1, null), null, "FloorplanMapperUi", b0.c.e(-619977881, true, new C0959a(this.f24945a), interfaceC3540l, 54), interfaceC3540l, 27648, 4);
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

    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final androidx.compose.ui.e r10, final Ye.f r11, T.InterfaceC3540l r12, final int r13, final int r14) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Ye.l.b(androidx.compose.ui.e, Ye.f, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J c(androidx.compose.ui.e eVar, f fVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        b(eVar, fVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }
}
