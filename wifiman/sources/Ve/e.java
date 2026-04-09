package Ve;

import Be.v0;
import C0.C;
import E0.InterfaceC2629g;
import Fe.j;
import L0.C3174d;
import L9.L;
import L9.z;
import N.a1;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.o1;
import Ve.e;
import Y0.h;
import Yg.J;
import android.content.res.Resources;
import androidx.compose.foundation.layout.o;
import androidx.compose.foundation.layout.r;
import androidx.compose.ui.e;
import f0.c;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import la.C6562a;
import m8.AbstractC6780c;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import mh.q;
import s9.d;
import sa.AbstractC7930a;
import th.g;
import w9.p;
import xe.InterfaceC8511f;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;
import z.InterfaceC8687j;
import z.Y;
import z.a0;

/* loaded from: classes4.dex */
public abstract class e {

    static final class a implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC8511f.b f23384a;

        /* renamed from: Ve.e$a$a, reason: collision with other inner class name */
        static final class C0869a implements q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC8511f.b f23385a;

            /* renamed from: Ve.e$a$a$a, reason: collision with other inner class name */
            static final class C0870a implements q {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC8511f.b f23386a;

                C0870a(InterfaceC8511f.b bVar) {
                    this.f23386a = bVar;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final J c(InterfaceC8511f.b bVar) {
                    bVar.a();
                    return J.f24997a;
                }

                public final void b(Y UiToolbarSideContainer, InterfaceC3540l interfaceC3540l, int i10) {
                    AbstractC6492s.i(UiToolbarSideContainer, "$this$UiToolbarSideContainer");
                    if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                        interfaceC3540l.C();
                        return;
                    }
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.Q(1996383508, i10, -1, "com.ui.wifiman.ui.signal.floorplan.delete.FloorplanRemoveUi.<anonymous>.<anonymous>.<anonymous> (FloorplanRemoveUi.kt:50)");
                    }
                    s9.b bVarS = N9.b.f16117a.s();
                    interfaceC3540l.U(-1702521630);
                    boolean zT = interfaceC3540l.T(this.f23386a);
                    final InterfaceC8511f.b bVar = this.f23386a;
                    Object objF = interfaceC3540l.f();
                    if (zT || objF == InterfaceC3540l.f21100a.a()) {
                        objF = new InterfaceC6824a() { // from class: Ve.d
                            @Override // mh.InterfaceC6824a
                            public final Object invoke() {
                                return e.a.C0869a.C0870a.c(bVar);
                            }
                        };
                        interfaceC3540l.K(objF);
                    }
                    interfaceC3540l.J();
                    z.c(bVarS, null, 0L, false, (InterfaceC6824a) objF, interfaceC3540l, 0, 14);
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.P();
                    }
                }

                @Override // mh.q
                public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                    b((Y) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                    return J.f24997a;
                }
            }

            C0869a(InterfaceC8511f.b bVar) {
                this.f23385a = bVar;
            }

            public final void a(Y ModalToolbar, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(ModalToolbar, "$this$ModalToolbar");
                if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-1379296627, i10, -1, "com.ui.wifiman.ui.signal.floorplan.delete.FloorplanRemoveUi.<anonymous>.<anonymous> (FloorplanRemoveUi.kt:49)");
                }
                L.b(null, b0.c.e(1996383508, true, new C0870a(this.f23385a), interfaceC3540l, 54), interfaceC3540l, 48, 1);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                a((Y) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                return J.f24997a;
            }
        }

        a(InterfaceC8511f.b bVar) {
            this.f23384a = bVar;
        }

        public final void a(InterfaceC8687j ModalScaffold, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(ModalScaffold, "$this$ModalScaffold");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-522149626, i10, -1, "com.ui.wifiman.ui.signal.floorplan.delete.FloorplanRemoveUi.<anonymous> (FloorplanRemoveUi.kt:46)");
            }
            j.c(null, new d.b(AbstractC6780c.f53449a1), null, null, b0.c.e(-1379296627, true, new C0869a(this.f23384a), interfaceC3540l, 54), 0L, interfaceC3540l, 24576, 45);
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

    static final class b implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Ve.b f23387a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC8511f.b f23388b;

        /* synthetic */ class a extends C6490p implements InterfaceC6824a {
            a(Object obj) {
                super(0, obj, Ve.b.class, "onDeleteClicked", "onDeleteClicked()V", 0);
            }

            public final void a() {
                ((Ve.b) this.receiver).p0();
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return J.f24997a;
            }
        }

        b(Ve.b bVar, InterfaceC8511f.b bVar2) {
            this.f23387a = bVar;
            this.f23388b = bVar2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J c(InterfaceC8511f.b bVar) {
            bVar.a();
            return J.f24997a;
        }

        public final void b(InterfaceC8687j ModalScaffold, InterfaceC3540l interfaceC3540l, int i10) throws Resources.NotFoundException {
            AbstractC6492s.i(ModalScaffold, "$this$ModalScaffold");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1339458487, i10, -1, "com.ui.wifiman.ui.signal.floorplan.delete.FloorplanRemoveUi.<anonymous> (FloorplanRemoveUi.kt:59)");
            }
            v0.b(null, interfaceC3540l, 0, 1);
            e.a aVar = androidx.compose.ui.e.f28771b0;
            androidx.compose.ui.e eVarH = r.h(aVar, 0.0f, 1, null);
            C6562a c6562a = C6562a.f52458a;
            int i11 = C6562a.f52459b;
            androidx.compose.ui.e eVarK = o.k(eVarH, c6562a.d(interfaceC3540l, i11).a().a().a(h.j(32)), 0.0f, 2, null);
            c.b bVarG = f0.c.f46573a.g();
            Ve.b bVar = this.f23387a;
            final InterfaceC8511f.b bVar2 = this.f23388b;
            C cA = AbstractC8685h.a(C8680c.f66832a.g(), bVarG, interfaceC3540l, 48);
            int iA = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarK);
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
            androidx.compose.ui.e eVarH2 = r.h(aVar, 0.0f, 1, null);
            s9.d dVar = (s9.d) o1.b(bVar.o0(), null, interfaceC3540l, 0, 1).getValue();
            interfaceC3540l.U(-1582030581);
            C3174d c3174dA = dVar == null ? null : AbstractC7930a.a(dVar, interfaceC3540l, 0);
            interfaceC3540l.J();
            if (c3174dA == null) {
                c3174dA = new C3174d("", null, null, 6, null);
            }
            a1.c(c3174dA, eVarH2, c6562a.a(interfaceC3540l, i11).f().a(), 0L, null, null, null, 0L, null, W0.j.h(W0.j.f23523b.a()), 0L, 0, false, 0, 0, null, null, c6562a.c(interfaceC3540l, i11).b().a(), interfaceC3540l, 48, 0, 130552);
            a0.a(r.i(aVar, h.j(16)), interfaceC3540l, 6);
            androidx.compose.ui.e eVarH3 = r.h(aVar, 0.0f, 1, null);
            String strA = H0.f.a(AbstractC6780c.f53442Z0, interfaceC3540l, 0);
            p pVar = p.ALERT;
            interfaceC3540l.U(-1582014890);
            boolean zT = interfaceC3540l.T(bVar);
            Object objF = interfaceC3540l.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                objF = new a(bVar);
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            w9.r.b(eVarH3, (InterfaceC6824a) ((g) objF), false, false, null, pVar, strA, null, interfaceC3540l, 196614, 156);
            androidx.compose.ui.e eVarH4 = r.h(aVar, 0.0f, 1, null);
            String strA2 = H0.f.a(AbstractC6780c.f53447a, interfaceC3540l, 0);
            interfaceC3540l.U(-1582008381);
            boolean zT2 = interfaceC3540l.T(bVar2);
            Object objF2 = interfaceC3540l.f();
            if (zT2 || objF2 == InterfaceC3540l.f21100a.a()) {
                objF2 = new InterfaceC6824a() { // from class: Ve.f
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return e.b.c(bVar2);
                    }
                };
                interfaceC3540l.K(objF2);
            }
            interfaceC3540l.J();
            w9.o.c(eVarH4, (InterfaceC6824a) objF2, false, false, null, strA2, interfaceC3540l, 6, 28);
            interfaceC3540l.R();
            v0.b(null, interfaceC3540l, 0, 1);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) throws Resources.NotFoundException {
            b((InterfaceC8687j) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final androidx.compose.ui.e r11, final Ve.b r12, T.InterfaceC3540l r13, final int r14, final int r15) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Ve.e.b(androidx.compose.ui.e, Ve.b, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J c(androidx.compose.ui.e eVar, Ve.b bVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        b(eVar, bVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }
}
