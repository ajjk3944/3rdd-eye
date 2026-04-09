package Ye;

import Be.AbstractC2489y;
import C0.C;
import E0.InterfaceC2629g;
import L0.C3174d;
import L0.D;
import L9.AbstractC3198d;
import L9.E;
import L9.L;
import N.O0;
import N.Z;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.X0;
import T.o1;
import Te.AbstractC3596o;
import Te.B0;
import Te.C3589k;
import Te.D0;
import Ye.c;
import Ye.i;
import Yg.J;
import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.layout.o;
import androidx.compose.foundation.layout.r;
import androidx.compose.ui.e;
import f0.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import la.C6562a;
import m0.C6733v0;
import m8.AbstractC6780c;
import ma.AbstractC6784a;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import mh.q;
import q.AbstractC7385d;
import q.AbstractC7391j;
import q.InterfaceC7386e;
import s9.d;
import ta.AbstractC8049c;
import xe.AbstractC8460B;
import xe.InterfaceC8511f;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;
import z.W;
import z.Y;
import z.j0;

/* loaded from: classes4.dex */
public abstract class i {

    static final class a implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f24930a;

        /* renamed from: Ye.i$a$a, reason: collision with other inner class name */
        /* synthetic */ class C0955a extends C6490p implements InterfaceC6824a {
            C0955a(Object obj) {
                super(0, obj, f.class, "onCenteredClicked", "onCenteredClicked()V", 0);
            }

            public final void a() {
                ((f) this.receiver).w0();
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return J.f24997a;
            }
        }

        static final class b implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f24931a;

            b(boolean z10) {
                this.f24931a = z10;
            }

            public final void a(InterfaceC3540l interfaceC3540l, int i10) {
                if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(540387250, i10, -1, "com.ui.wifiman.ui.signal.floorplan.scan.FloorplanContainer.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FloorplanMapperAvailableUi.kt:210)");
                }
                if (this.f24931a) {
                    interfaceC3540l.U(-913597190);
                    AbstractC8049c.c(Pe.a.f18599a.x(), r.v(androidx.compose.ui.e.f28771b0, Y0.h.j(48)), C6733v0.g(C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).c().a()), null, interfaceC3540l, 54, 4);
                    interfaceC3540l.J();
                } else {
                    interfaceC3540l.U(-913359265);
                    AbstractC8049c.c(Pe.a.f18599a.y(), r.v(androidx.compose.ui.e.f28771b0, Y0.h.j(48)), C6733v0.g(C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).c().a()), null, interfaceC3540l, 54, 4);
                    interfaceC3540l.J();
                }
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

        a(f fVar) {
            this.f24930a = fVar;
        }

        public final void a(boolean z10, InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 6) == 0) {
                i10 |= interfaceC3540l.c(z10) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-211037234, i10, -1, "com.ui.wifiman.ui.signal.floorplan.scan.FloorplanContainer.<anonymous>.<anonymous>.<anonymous> (FloorplanMapperAvailableUi.kt:207)");
            }
            f fVar = this.f24930a;
            interfaceC3540l.U(1441701428);
            boolean zT = interfaceC3540l.T(fVar);
            Object objF = interfaceC3540l.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                objF = new C0955a(fVar);
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            Z.a((InterfaceC6824a) ((th.g) objF), null, false, null, b0.c.e(540387250, true, new b(z10), interfaceC3540l, 54), interfaceC3540l, 24576, 14);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a(((Boolean) obj).booleanValue(), (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    static final class b implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3589k f24932a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f24933b;

        /* synthetic */ class a extends C6490p implements InterfaceC6824a {
            a(Object obj) {
                super(0, obj, f.class, "onDeviceFoundOverlayPositiveButtonClicked", "onDeviceFoundOverlayPositiveButtonClicked()V", 0);
            }

            public final void a() {
                ((f) this.receiver).y0();
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return J.f24997a;
            }
        }

        /* renamed from: Ye.i$b$b, reason: collision with other inner class name */
        /* synthetic */ class C0956b extends C6490p implements InterfaceC6824a {
            C0956b(Object obj) {
                super(0, obj, f.class, "onDeviceFoundOverlayCancelled", "onDeviceFoundOverlayCancelled()V", 0);
            }

            public final void a() {
                ((f) this.receiver).x0();
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return J.f24997a;
            }
        }

        b(C3589k c3589k, f fVar) {
            this.f24932a = c3589k;
            this.f24933b = fVar;
        }

        public final void a(InterfaceC7386e AnimatedVisibility, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(AnimatedVisibility, "$this$AnimatedVisibility");
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1298580679, i10, -1, "com.ui.wifiman.ui.signal.floorplan.scan.FloorplanContainer.<anonymous>.<anonymous> (FloorplanMapperAvailableUi.kt:234)");
            }
            C3589k c3589k = this.f24932a;
            if (c3589k != null) {
                f fVar = this.f24933b;
                e.a aVar = androidx.compose.ui.e.f28771b0;
                interfaceC3540l.U(1441739116);
                boolean zT = interfaceC3540l.T(fVar);
                Object objF = interfaceC3540l.f();
                if (zT || objF == InterfaceC3540l.f21100a.a()) {
                    objF = new a(fVar);
                    interfaceC3540l.K(objF);
                }
                th.g gVar = (th.g) objF;
                interfaceC3540l.J();
                interfaceC3540l.U(1441741824);
                boolean zT2 = interfaceC3540l.T(fVar);
                Object objF2 = interfaceC3540l.f();
                if (zT2 || objF2 == InterfaceC3540l.f21100a.a()) {
                    objF2 = new C0956b(fVar);
                    interfaceC3540l.K(objF2);
                }
                interfaceC3540l.J();
                AbstractC3596o.d(aVar, c3589k, (InterfaceC6824a) ((th.g) objF2), (InterfaceC6824a) gVar, interfaceC3540l, 6, 0);
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((InterfaceC7386e) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    static final class c implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f24934a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f24935b;

        static final class a implements q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ f f24936a;

            /* renamed from: Ye.i$c$a$a, reason: collision with other inner class name */
            static final class C0957a implements q {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ f f24937a;

                /* renamed from: Ye.i$c$a$a$a, reason: collision with other inner class name */
                static final class C0958a implements q {

                    /* renamed from: a, reason: collision with root package name */
                    public static final C0958a f24938a = new C0958a();

                    C0958a() {
                    }

                    public final CharSequence a(Context it, InterfaceC3540l interfaceC3540l, int i10) {
                        AbstractC6492s.i(it, "it");
                        interfaceC3540l.U(-134896286);
                        if (AbstractC3546o.H()) {
                            AbstractC3546o.Q(-134896286, i10, -1, "com.ui.wifiman.ui.signal.floorplan.scan.FloorplanMapperAvailableUi.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FloorplanMapperAvailableUi.kt:94)");
                        }
                        C3174d.a aVar = new C3174d.a(0, 1, null);
                        int iN = aVar.n(new D(AbstractC6784a.b.f53648a.f().b(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
                        try {
                            aVar.append(it.getText(AbstractC6780c.f53468d));
                            J j10 = J.f24997a;
                            aVar.l(iN);
                            C3174d c3174dP = aVar.p();
                            if (AbstractC3546o.H()) {
                                AbstractC3546o.P();
                            }
                            interfaceC3540l.J();
                            return c3174dP;
                        } catch (Throwable th2) {
                            aVar.l(iN);
                            throw th2;
                        }
                    }

                    @Override // mh.q
                    public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                        return a((Context) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                    }
                }

                /* renamed from: Ye.i$c$a$a$b */
                /* synthetic */ class b extends C6490p implements InterfaceC6824a {
                    b(Object obj) {
                        super(0, obj, f.class, "onToolbarDoneClicked", "onToolbarDoneClicked()V", 0);
                    }

                    public final void a() {
                        ((f) this.receiver).z0();
                    }

                    @Override // mh.InterfaceC6824a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        a();
                        return J.f24997a;
                    }
                }

                C0957a(f fVar) {
                    this.f24937a = fVar;
                }

                public final void a(Y UiToolbarSideContainer, InterfaceC3540l interfaceC3540l, int i10) {
                    AbstractC6492s.i(UiToolbarSideContainer, "$this$UiToolbarSideContainer");
                    if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                        interfaceC3540l.C();
                        return;
                    }
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.Q(-1542327406, i10, -1, "com.ui.wifiman.ui.signal.floorplan.scan.FloorplanMapperAvailableUi.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FloorplanMapperAvailableUi.kt:92)");
                    }
                    d.a aVar = new d.a("done", C0958a.f24938a);
                    f fVar = this.f24937a;
                    interfaceC3540l.U(21695824);
                    boolean zT = interfaceC3540l.T(fVar);
                    Object objF = interfaceC3540l.f();
                    if (zT || objF == InterfaceC3540l.f21100a.a()) {
                        objF = new b(fVar);
                        interfaceC3540l.K(objF);
                    }
                    interfaceC3540l.J();
                    He.i.c(null, (InterfaceC6824a) ((th.g) objF), false, aVar, interfaceC3540l, 0, 5);
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

            a(f fVar) {
                this.f24936a = fVar;
            }

            public final void a(Y UiToolbar, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(UiToolbar, "$this$UiToolbar");
                if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(664770297, i10, -1, "com.ui.wifiman.ui.signal.floorplan.scan.FloorplanMapperAvailableUi.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FloorplanMapperAvailableUi.kt:91)");
                }
                L.b(null, b0.c.e(-1542327406, true, new C0957a(this.f24936a), interfaceC3540l, 54), interfaceC3540l, 48, 1);
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

        static final class b implements q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ s9.d f24939a;

            b(s9.d dVar) {
                this.f24939a = dVar;
            }

            public final void a(InterfaceC7386e AnimatedVisibility, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(AnimatedVisibility, "$this$AnimatedVisibility");
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-840825631, i10, -1, "com.ui.wifiman.ui.signal.floorplan.scan.FloorplanMapperAvailableUi.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FloorplanMapperAvailableUi.kt:111)");
                }
                s9.d dVar = this.f24939a;
                if (dVar != null) {
                    Ue.q.b(o.k(r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), C6562a.f52458a.d(interfaceC3540l, C6562a.f52459b).a().a().c(), 0.0f, 2, null), dVar, interfaceC3540l, 0, 0);
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                a((InterfaceC7386e) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                return J.f24997a;
            }
        }

        c(androidx.compose.ui.e eVar, f fVar) {
            this.f24934a = eVar;
            this.f24935b = fVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J c(InterfaceC8511f.b bVar) {
            bVar.a();
            return J.f24997a;
        }

        public final void b(InterfaceC3540l interfaceC3540l, int i10) throws Resources.NotFoundException {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1060528214, i10, -1, "com.ui.wifiman.ui.signal.floorplan.scan.FloorplanMapperAvailableUi.<anonymous> (FloorplanMapperAvailableUi.kt:54)");
            }
            androidx.compose.ui.e eVarF = r.f(this.f24934a, 0.0f, 1, null);
            androidx.compose.ui.e eVar = this.f24934a;
            f fVar = this.f24935b;
            c.a aVar = f0.c.f46573a;
            C cH = androidx.compose.foundation.layout.d.h(aVar.o(), false);
            int iA = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarF);
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
            E1.c(interfaceC3540lA, cH, aVar2.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar2.g());
            InterfaceC6839p interfaceC6839pB = aVar2.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar2.f());
            androidx.compose.foundation.layout.f fVar2 = androidx.compose.foundation.layout.f.f28130a;
            androidx.compose.ui.e eVarF2 = r.f(eVar, 0.0f, 1, null);
            C8680c c8680c = C8680c.f66832a;
            C cA = AbstractC8685h.a(c8680c.g(), aVar.k(), interfaceC3540l, 0);
            int iA2 = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG2 = interfaceC3540l.G();
            androidx.compose.ui.e eVarE2 = androidx.compose.ui.c.e(interfaceC3540l, eVarF2);
            InterfaceC6824a interfaceC6824aA2 = aVar2.a();
            if (interfaceC3540l.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540l.u();
            if (interfaceC3540l.o()) {
                interfaceC3540l.D(interfaceC6824aA2);
            } else {
                interfaceC3540l.I();
            }
            InterfaceC3540l interfaceC3540lA2 = E1.a(interfaceC3540l);
            E1.c(interfaceC3540lA2, cA, aVar2.e());
            E1.c(interfaceC3540lA2, interfaceC3563xG2, aVar2.g());
            InterfaceC6839p interfaceC6839pB2 = aVar2.b();
            if (interfaceC3540lA2.o() || !AbstractC6492s.d(interfaceC3540lA2.f(), Integer.valueOf(iA2))) {
                interfaceC3540lA2.K(Integer.valueOf(iA2));
                interfaceC3540lA2.Q(Integer.valueOf(iA2), interfaceC6839pB2);
            }
            E1.c(interfaceC3540lA2, eVarE2, aVar2.f());
            C8688k c8688k = C8688k.f66923a;
            e.a aVar3 = androidx.compose.ui.e.f28771b0;
            i.c(c8688k.a(r.h(aVar3, 0.0f, 1, null), 1.0f, true), fVar, interfaceC3540l, 0, 0);
            androidx.compose.ui.e eVarH = r.h(aVar3, 0.0f, 1, null);
            C6562a c6562a = C6562a.f52458a;
            int i11 = C6562a.f52459b;
            D0.b(o.j(eVarH, c6562a.d(interfaceC3540l, i11).a().a().c(), c6562a.d(interfaceC3540l, i11).a().b().c()), (B0) o1.b(fVar.u0(), null, interfaceC3540l, 0, 1).getValue(), interfaceC3540l, 0);
            interfaceC3540l.R();
            androidx.compose.ui.e eVarH2 = r.h(aVar3, 0.0f, 1, null);
            C cA2 = AbstractC8685h.a(c8680c.g(), aVar.k(), interfaceC3540l, 0);
            int iA3 = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG3 = interfaceC3540l.G();
            androidx.compose.ui.e eVarE3 = androidx.compose.ui.c.e(interfaceC3540l, eVarH2);
            InterfaceC6824a interfaceC6824aA3 = aVar2.a();
            if (interfaceC3540l.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540l.u();
            if (interfaceC3540l.o()) {
                interfaceC3540l.D(interfaceC6824aA3);
            } else {
                interfaceC3540l.I();
            }
            InterfaceC3540l interfaceC3540lA3 = E1.a(interfaceC3540l);
            E1.c(interfaceC3540lA3, cA2, aVar2.e());
            E1.c(interfaceC3540lA3, interfaceC3563xG3, aVar2.g());
            InterfaceC6839p interfaceC6839pB3 = aVar2.b();
            if (interfaceC3540lA3.o() || !AbstractC6492s.d(interfaceC3540lA3.f(), Integer.valueOf(iA3))) {
                interfaceC3540lA3.K(Integer.valueOf(iA3));
                interfaceC3540lA3.Q(Integer.valueOf(iA3), interfaceC6839pB3);
            }
            E1.c(interfaceC3540lA3, eVarE3, aVar2.f());
            final InterfaceC8511f.b bVar = (InterfaceC8511f.b) interfaceC3540l.t(AbstractC8460B.K());
            androidx.compose.ui.e eVarC = j0.c(r.h(aVar3, 0.0f, 1, null));
            AbstractC3198d.a aVar4 = AbstractC3198d.a.f11402b;
            String strA = H0.f.a(AbstractC6780c.f53477e1, interfaceC3540l, 0);
            interfaceC3540l.U(-2133490950);
            boolean zT = interfaceC3540l.T(bVar);
            Object objF = interfaceC3540l.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6824a() { // from class: Ye.j
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return i.c.c(bVar);
                    }
                };
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            E.i(eVarC, strA, aVar4, (InterfaceC6824a) objF, b0.c.e(664770297, true, new a(fVar), interfaceC3540l, 54), 0L, 0L, 0L, 0.0f, null, 0.0f, interfaceC3540l, (AbstractC3198d.a.f11403c << 6) | 24576, 0, 2016);
            s9.d dVar = (s9.d) o1.b(fVar.t0(), null, interfaceC3540l, 0, 1).getValue();
            AbstractC7385d.d(c8688k, dVar != null, r.h(aVar3, 0.0f, 1, null), null, null, null, b0.c.e(-840825631, true, new b(dVar), interfaceC3540l, 54), interfaceC3540l, 1573254, 28);
            interfaceC3540l.R();
            interfaceC3540l.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws Resources.NotFoundException {
            b((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(androidx.compose.ui.e eVar, final f fVar, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        final androidx.compose.ui.e eVar2;
        int i12;
        C6562a c6562a;
        int i13;
        androidx.compose.foundation.layout.f fVar2;
        androidx.compose.ui.e eVar3;
        int i14;
        d.b bVar;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1195989417);
        int i15 = i11 & 1;
        if (i15 != 0) {
            i12 = i10 | 6;
            eVar2 = eVar;
        } else if ((i10 & 6) == 0) {
            eVar2 = eVar;
            i12 = (interfaceC3540lR.T(eVar2) ? 4 : 2) | i10;
        } else {
            eVar2 = eVar;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC3540lR.T(fVar) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            androidx.compose.ui.e eVar4 = i15 != 0 ? androidx.compose.ui.e.f28771b0 : eVar2;
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1195989417, i12, -1, "com.ui.wifiman.ui.signal.floorplan.scan.FloorplanContainer (FloorplanMapperAvailableUi.kt:130)");
            }
            c.a aVar = f0.c.f46573a;
            C cH = androidx.compose.foundation.layout.d.h(aVar.o(), false);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVar4);
            InterfaceC2629g.a aVar2 = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar2.a();
            if (interfaceC3540lR.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540lR.u();
            if (interfaceC3540lR.o()) {
                interfaceC3540lR.D(interfaceC6824aA);
            } else {
                interfaceC3540lR.I();
            }
            InterfaceC3540l interfaceC3540lA = E1.a(interfaceC3540lR);
            E1.c(interfaceC3540lA, cH, aVar2.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar2.g());
            InterfaceC6839p interfaceC6839pB = aVar2.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar2.f());
            androidx.compose.foundation.layout.f fVar3 = androidx.compose.foundation.layout.f.f28130a;
            e.a aVar3 = androidx.compose.ui.e.f28771b0;
            androidx.compose.ui.e eVar5 = eVar4;
            Ue.o.h(r.f(aVar3, 0.0f, 1, null), fVar.q0(), true, interfaceC3540lR, 390, 0);
            androidx.compose.ui.e eVarF = fVar3.f(r.h(aVar3, 0.0f, 1, null), aVar.b());
            C6562a c6562a2 = C6562a.f52458a;
            int i16 = C6562a.f52459b;
            androidx.compose.ui.e eVarB = androidx.compose.animation.f.b(o.j(eVarF, c6562a2.d(interfaceC3540lR, i16).a().a().c(), c6562a2.d(interfaceC3540lR, i16).a().b().c()), null, null, 3, null);
            c.InterfaceC1752c interfaceC1752cA = aVar.a();
            C8680c c8680c = C8680c.f66832a;
            float f10 = 16;
            C cB = W.b(c8680c.n(Y0.h.j(f10)), interfaceC1752cA, interfaceC3540lR, 54);
            int iA2 = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG2 = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE2 = androidx.compose.ui.c.e(interfaceC3540lR, eVarB);
            InterfaceC6824a interfaceC6824aA2 = aVar2.a();
            if (interfaceC3540lR.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540lR.u();
            if (interfaceC3540lR.o()) {
                interfaceC3540lR.D(interfaceC6824aA2);
            } else {
                interfaceC3540lR.I();
            }
            InterfaceC3540l interfaceC3540lA2 = E1.a(interfaceC3540lR);
            E1.c(interfaceC3540lA2, cB, aVar2.e());
            E1.c(interfaceC3540lA2, interfaceC3563xG2, aVar2.g());
            InterfaceC6839p interfaceC6839pB2 = aVar2.b();
            if (interfaceC3540lA2.o() || !AbstractC6492s.d(interfaceC3540lA2.f(), Integer.valueOf(iA2))) {
                interfaceC3540lA2.K(Integer.valueOf(iA2));
                interfaceC3540lA2.Q(Integer.valueOf(iA2), interfaceC6839pB2);
            }
            E1.c(interfaceC3540lA2, eVarE2, aVar2.f());
            androidx.compose.ui.e eVarK = o.k(z.Z.f66823a.a(aVar3, 1.0f, true), 0.0f, Y0.h.j(f10), 1, null);
            C cA = AbstractC8685h.a(c8680c.n(Y0.h.j(f10)), aVar.k(), interfaceC3540lR, 6);
            int iA3 = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG3 = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE3 = androidx.compose.ui.c.e(interfaceC3540lR, eVarK);
            InterfaceC6824a interfaceC6824aA3 = aVar2.a();
            if (interfaceC3540lR.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540lR.u();
            if (interfaceC3540lR.o()) {
                interfaceC3540lR.D(interfaceC6824aA3);
            } else {
                interfaceC3540lR.I();
            }
            InterfaceC3540l interfaceC3540lA3 = E1.a(interfaceC3540lR);
            E1.c(interfaceC3540lA3, cA, aVar2.e());
            E1.c(interfaceC3540lA3, interfaceC3563xG3, aVar2.g());
            InterfaceC6839p interfaceC6839pB3 = aVar2.b();
            if (interfaceC3540lA3.o() || !AbstractC6492s.d(interfaceC3540lA3.f(), Integer.valueOf(iA3))) {
                interfaceC3540lA3.K(Integer.valueOf(iA3));
                interfaceC3540lA3.Q(Integer.valueOf(iA3), interfaceC6839pB3);
            }
            E1.c(interfaceC3540lA3, eVarE3, aVar2.f());
            C8688k c8688k = C8688k.f66923a;
            Te.W w10 = (Te.W) o1.b(fVar.s0(), null, interfaceC3540lR, 0, 1).getValue();
            interfaceC3540lR.U(1441617608);
            if (w10 != null) {
                Te.D.n(r.h(aVar3, 0.0f, 1, null), w10, interfaceC3540lR, 6);
                J j10 = J.f24997a;
            }
            interfaceC3540lR.J();
            Ye.c cVar = (Ye.c) o1.b(fVar.n0(), null, interfaceC3540lR, 0, 1).getValue();
            interfaceC3540lR.U(1441627824);
            if (cVar == null) {
                c6562a = c6562a2;
                i13 = 0;
                fVar2 = fVar3;
                eVar3 = eVar5;
                i14 = i16;
            } else {
                if (cVar instanceof c.a) {
                    interfaceC3540lR.U(-915889950);
                    if (!(((c.a) cVar) instanceof c.a.C0949a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i14 = i16;
                    c6562a = c6562a2;
                    fVar2 = fVar3;
                    eVar3 = eVar5;
                    i13 = 0;
                    AbstractC2489y.b(null, c6562a2.a(interfaceC3540lR, i16).a().d().f(), N9.b.f16117a.A(), new d.b(AbstractC6780c.f53436Y0), interfaceC3540lR, 0, 1);
                    interfaceC3540lR.J();
                } else {
                    c6562a = c6562a2;
                    i13 = 0;
                    fVar2 = fVar3;
                    eVar3 = eVar5;
                    i14 = i16;
                    if (!(cVar instanceof c.b)) {
                        interfaceC3540lR.U(1217380084);
                        interfaceC3540lR.J();
                        throw new NoWhenBranchMatchedException();
                    }
                    interfaceC3540lR.U(-915339452);
                    c.b bVar2 = (c.b) cVar;
                    if (bVar2 instanceof c.b.a) {
                        bVar = new d.b(AbstractC6780c.f53361N0);
                    } else if (bVar2 instanceof c.b.C0950b) {
                        bVar = new d.b(AbstractC6780c.f53368O0);
                    } else if (bVar2 instanceof c.b.C0951c) {
                        bVar = new d.b(AbstractC6780c.f53375P0);
                    } else if (bVar2 instanceof c.b.d) {
                        bVar = new d.b(AbstractC6780c.f53382Q0);
                    } else {
                        if (!(bVar2 instanceof c.b.e)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        bVar = new d.b(AbstractC6780c.f53389R0);
                    }
                    AbstractC2489y.b(null, c6562a.a(interfaceC3540lR, i14).a().l().f(), N9.b.f16117a.A(), bVar, interfaceC3540lR, 0, 1);
                    interfaceC3540lR.J();
                }
                J j11 = J.f24997a;
            }
            interfaceC3540lR.J();
            interfaceC3540lR.R();
            AbstractC7391j.a(o1.b(fVar.v0(), null, interfaceC3540lR, i13, 1).getValue(), null, null, "FloorplanContainer", b0.c.e(-211037234, true, new a(fVar), interfaceC3540lR, 54), interfaceC3540lR, 27648, 6);
            interfaceC3540lR.R();
            C3589k c3589k = (C3589k) o1.b(fVar.p0(), null, interfaceC3540lR, i13, 1).getValue();
            androidx.compose.ui.e eVarK2 = o.k(fVar2.f(aVar3, aVar.e()), c6562a.d(interfaceC3540lR, i14).a().a().c(), 0.0f, 2, null);
            if (c3589k != null) {
                i13 = 1;
            }
            AbstractC7385d.f(i13, eVarK2, androidx.compose.animation.g.o(null, 0.0f, 3, null), androidx.compose.animation.g.q(null, 0.0f, 3, null), null, b0.c.e(-1298580679, true, new b(c3589k, fVar), interfaceC3540lR, 54), interfaceC3540lR, 200064, 16);
            interfaceC3540lR.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            eVar2 = eVar3;
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Ye.h
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return i.d(eVar2, fVar, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J d(androidx.compose.ui.e eVar, f fVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        c(eVar, fVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }

    public static final void e(androidx.compose.ui.e eVar, final f vm, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        final androidx.compose.ui.e eVar2;
        int i12;
        InterfaceC3540l interfaceC3540l2;
        AbstractC6492s.i(vm, "vm");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-493356270);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            eVar2 = eVar;
        } else if ((i10 & 6) == 0) {
            eVar2 = eVar;
            i12 = (interfaceC3540lR.T(eVar2) ? 4 : 2) | i10;
        } else {
            eVar2 = eVar;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC3540lR.T(vm) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            androidx.compose.ui.e eVar3 = i13 != 0 ? androidx.compose.ui.e.f28771b0 : eVar2;
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-493356270, i12, -1, "com.ui.wifiman.ui.signal.floorplan.scan.FloorplanMapperAvailableUi (FloorplanMapperAvailableUi.kt:49)");
            }
            androidx.compose.ui.e eVar4 = eVar3;
            interfaceC3540l2 = interfaceC3540lR;
            O0.a(r.f(eVar3, 0.0f, 1, null), null, C6562a.f52458a.a(interfaceC3540lR, C6562a.f52459b).e().b(), 0L, null, 0.0f, b0.c.e(1060528214, true, new c(eVar3, vm), interfaceC3540lR, 54), interfaceC3540lR, 1572864, 58);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            eVar2 = eVar4;
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Ye.g
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return i.f(eVar2, vm, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J f(androidx.compose.ui.e eVar, f fVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        e(eVar, fVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }
}
