package com.ui.wifiman.ui.signal;

import Ee.C2706g;
import L9.AbstractC3198d;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.o1;
import Zg.AbstractC3689v;
import com.google.ar.core.ImageMetadata;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import m8.AbstractC6780c;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import z.InterfaceC8687j;
import z.Y;

/* loaded from: classes4.dex */
public abstract class G {

    static final class a implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ E f44742a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f44743b;

        /* renamed from: com.ui.wifiman.ui.signal.G$a$a, reason: collision with other inner class name */
        static final class C1597a implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.e f44744a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ E f44745b;

            /* renamed from: com.ui.wifiman.ui.signal.G$a$a$a, reason: collision with other inner class name */
            static final class C1598a implements mh.q {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ androidx.compose.ui.e f44746a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ E f44747b;

                /* renamed from: com.ui.wifiman.ui.signal.G$a$a$a$a, reason: collision with other inner class name */
                /* synthetic */ class C1599a extends C6490p implements InterfaceC6824a {
                    C1599a(Object obj) {
                        super(0, obj, E.class, "onDeleteClicked", "onDeleteClicked()V", 0);
                    }

                    public final void a() {
                        ((E) this.receiver).p0();
                    }

                    @Override // mh.InterfaceC6824a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        a();
                        return Yg.J.f24997a;
                    }
                }

                C1598a(androidx.compose.ui.e eVar, E e10) {
                    this.f44746a = eVar;
                    this.f44747b = e10;
                }

                public final void a(Y TextButton, InterfaceC3540l interfaceC3540l, int i10) {
                    AbstractC6492s.i(TextButton, "$this$TextButton");
                    if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                        interfaceC3540l.C();
                        return;
                    }
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.Q(-645654191, i10, -1, "com.ui.wifiman.ui.signal.SignalTabPlaceDetailUi.<anonymous>.<anonymous>.<anonymous> (SignalTabPlaceDetailUi.kt:42)");
                    }
                    androidx.compose.ui.e eVarI = androidx.compose.foundation.layout.o.i(this.f44746a, Y0.h.j(6));
                    w9.h hVar = w9.h.ALERT;
                    E e10 = this.f44747b;
                    interfaceC3540l.U(-1641605007);
                    boolean zT = interfaceC3540l.T(e10);
                    Object objF = interfaceC3540l.f();
                    if (zT || objF == InterfaceC3540l.f21100a.a()) {
                        objF = new C1599a(e10);
                        interfaceC3540l.K(objF);
                    }
                    interfaceC3540l.J();
                    w9.k.c(eVarI, (InterfaceC6824a) ((th.g) objF), false, false, null, hVar, H0.f.a(AbstractC6780c.f53489g, interfaceC3540l, 0), null, interfaceC3540l, ImageMetadata.EDGE_MODE, 156);
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.P();
                    }
                }

                @Override // mh.q
                public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                    a((Y) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                    return Yg.J.f24997a;
                }
            }

            C1597a(androidx.compose.ui.e eVar, E e10) {
                this.f44744a = eVar;
                this.f44745b = e10;
            }

            public final void a(InterfaceC3540l interfaceC3540l, int i10) {
                if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(1773252805, i10, -1, "com.ui.wifiman.ui.signal.SignalTabPlaceDetailUi.<anonymous>.<anonymous> (SignalTabPlaceDetailUi.kt:41)");
                }
                L9.H.f11313a.e(b0.c.e(-645654191, true, new C1598a(this.f44744a, this.f44745b), interfaceC3540l, 54), interfaceC3540l, (L9.H.f11314b << 3) | 6, 0);
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

        a(E e10, androidx.compose.ui.e eVar) {
            this.f44742a = e10;
            this.f44743b = eVar;
        }

        public final void a(InterfaceC8687j ModalScaffold, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(ModalScaffold, "$this$ModalScaffold");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1188618852, i10, -1, "com.ui.wifiman.ui.signal.SignalTabPlaceDetailUi.<anonymous> (SignalTabPlaceDetailUi.kt:37)");
            }
            Fe.j.c(androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), (s9.d) o1.b(this.f44742a.getTitle(), null, interfaceC3540l, 0, 1).getValue(), new AbstractC3198d.c.a(b0.c.e(1773252805, true, new C1597a(this.f44743b, this.f44742a), interfaceC3540l, 54)), null, null, 0L, interfaceC3540l, 390, 56);
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

    static final class b implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ E f44748a;

        b(E e10) {
            this.f44748a = e10;
        }

        public final void a(InterfaceC8687j ModalScaffold, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(ModalScaffold, "$this$ModalScaffold");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(231937977, i10, -1, "com.ui.wifiman.ui.signal.SignalTabPlaceDetailUi.<anonymous> (SignalTabPlaceDetailUi.kt:54)");
            }
            Ee.z.L(androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), new C2706g(AbstractC3689v.e(new C2706g.a.C0194a("details", null, null, (List) o1.b(this.f44748a.n0(), null, interfaceC3540l, 0, 1).getValue(), 6, null))), null, false, false, null, null, C5228a.f44791a.a(), interfaceC3540l, 12585990, 116);
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

    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final androidx.compose.ui.e r11, final com.ui.wifiman.ui.signal.E r12, T.InterfaceC3540l r13, final int r14, final int r15) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ui.wifiman.ui.signal.G.b(androidx.compose.ui.e, com.ui.wifiman.ui.signal.E, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J c(androidx.compose.ui.e eVar, E e10, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        b(eVar, e10, interfaceC3540l, L0.a(i10 | 1), i11);
        return Yg.J.f24997a;
    }
}
