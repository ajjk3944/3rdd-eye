package We;

import C0.C;
import E0.InterfaceC2629g;
import L9.AbstractC3198d;
import L9.E;
import L9.L;
import L9.z;
import N.O0;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.X0;
import T.o1;
import Te.D;
import We.g;
import Yg.J;
import androidx.compose.foundation.layout.o;
import androidx.compose.foundation.layout.r;
import androidx.compose.ui.e;
import f0.c;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import la.C6562a;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import mh.q;
import q.AbstractC7385d;
import q.InterfaceC7386e;
import sa.AbstractC7930a;
import xe.AbstractC8460B;
import xe.InterfaceC8511f;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;
import z.Y;
import z.j0;

/* loaded from: classes4.dex */
public abstract class g {

    static final class a implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f23901a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f23902b;

        /* renamed from: We.g$a$a, reason: collision with other inner class name */
        static final class C0903a implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.e f23903a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ We.b f23904b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ c f23905c;

            /* renamed from: We.g$a$a$a, reason: collision with other inner class name */
            static final class C0904a implements q {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ We.b f23906a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ c f23907b;

                /* renamed from: We.g$a$a$a$a, reason: collision with other inner class name */
                static final class C0905a implements q {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ c f23908a;

                    /* renamed from: We.g$a$a$a$a$a, reason: collision with other inner class name */
                    /* synthetic */ class C0906a extends C6490p implements InterfaceC6824a {
                        C0906a(Object obj) {
                            super(0, obj, c.class, "onDeleteClicked", "onDeleteClicked()V", 0);
                        }

                        public final void a() {
                            ((c) this.receiver).p0();
                        }

                        @Override // mh.InterfaceC6824a
                        public /* bridge */ /* synthetic */ Object invoke() {
                            a();
                            return J.f24997a;
                        }
                    }

                    /* renamed from: We.g$a$a$a$a$b */
                    /* synthetic */ class b extends C6490p implements InterfaceC6824a {
                        b(Object obj) {
                            super(0, obj, c.class, "onShareClicked", "onShareClicked()V", 0);
                        }

                        public final void a() {
                            ((c) this.receiver).q0();
                        }

                        @Override // mh.InterfaceC6824a
                        public /* bridge */ /* synthetic */ Object invoke() {
                            a();
                            return J.f24997a;
                        }
                    }

                    C0905a(c cVar) {
                        this.f23908a = cVar;
                    }

                    public final void a(Y UiToolbarSideContainer, InterfaceC3540l interfaceC3540l, int i10) {
                        AbstractC6492s.i(UiToolbarSideContainer, "$this$UiToolbarSideContainer");
                        if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                            interfaceC3540l.C();
                            return;
                        }
                        if (AbstractC3546o.H()) {
                            AbstractC3546o.Q(1346058824, i10, -1, "com.ui.wifiman.ui.signal.floorplan.detail.FloorplanDetailUi.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FloorplanDetailUi.kt:67)");
                        }
                        s9.b bVarL = N9.b.f16117a.L();
                        c cVar = this.f23908a;
                        interfaceC3540l.U(350071684);
                        boolean zT = interfaceC3540l.T(cVar);
                        Object objF = interfaceC3540l.f();
                        if (zT || objF == InterfaceC3540l.f21100a.a()) {
                            objF = new C0906a(cVar);
                            interfaceC3540l.K(objF);
                        }
                        interfaceC3540l.J();
                        z.c(bVarL, null, 0L, false, (InterfaceC6824a) ((th.g) objF), interfaceC3540l, 0, 14);
                        s9.b bVarH = Pe.a.f18599a.H();
                        c cVar2 = this.f23908a;
                        interfaceC3540l.U(350079491);
                        boolean zT2 = interfaceC3540l.T(cVar2);
                        Object objF2 = interfaceC3540l.f();
                        if (zT2 || objF2 == InterfaceC3540l.f21100a.a()) {
                            objF2 = new b(cVar2);
                            interfaceC3540l.K(objF2);
                        }
                        interfaceC3540l.J();
                        z.c(bVarH, null, 0L, false, (InterfaceC6824a) ((th.g) objF2), interfaceC3540l, 6, 14);
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

                C0904a(We.b bVar, c cVar) {
                    this.f23906a = bVar;
                    this.f23907b = cVar;
                }

                public final void a(Y UiToolbar, InterfaceC3540l interfaceC3540l, int i10) {
                    AbstractC6492s.i(UiToolbar, "$this$UiToolbar");
                    if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                        interfaceC3540l.C();
                        return;
                    }
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.Q(154961205, i10, -1, "com.ui.wifiman.ui.signal.floorplan.detail.FloorplanDetailUi.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FloorplanDetailUi.kt:65)");
                    }
                    if (this.f23906a != null) {
                        L.b(null, b0.c.e(1346058824, true, new C0905a(this.f23907b), interfaceC3540l, 54), interfaceC3540l, 48, 1);
                    }
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

            /* renamed from: We.g$a$a$b */
            static final class b implements q {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ s9.d f23909a;

                b(s9.d dVar) {
                    this.f23909a = dVar;
                }

                public final void a(InterfaceC7386e AnimatedVisibility, InterfaceC3540l interfaceC3540l, int i10) {
                    AbstractC6492s.i(AnimatedVisibility, "$this$AnimatedVisibility");
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.Q(221284125, i10, -1, "com.ui.wifiman.ui.signal.floorplan.detail.FloorplanDetailUi.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FloorplanDetailUi.kt:84)");
                    }
                    s9.d dVar = this.f23909a;
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

            C0903a(androidx.compose.ui.e eVar, We.b bVar, c cVar) {
                this.f23903a = eVar;
                this.f23904b = bVar;
                this.f23905c = cVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final J c(InterfaceC8511f.b bVar) {
                bVar.a();
                return J.f24997a;
            }

            /* JADX WARN: Type inference failed for: r2v14 */
            /* JADX WARN: Type inference failed for: r2v15, types: [boolean, int] */
            /* JADX WARN: Type inference failed for: r2v17 */
            public final void b(InterfaceC3540l interfaceC3540l, int i10) {
                boolean z10;
                String strB;
                e.a aVar;
                float f10;
                ?? r22;
                Object obj;
                s9.d dVarD;
                if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-180468151, i10, -1, "com.ui.wifiman.ui.signal.floorplan.detail.FloorplanDetailUi.<anonymous>.<anonymous> (FloorplanDetailUi.kt:40)");
                }
                androidx.compose.ui.e eVarF = r.f(this.f23903a, 0.0f, 1, null);
                We.b bVar = this.f23904b;
                c cVar = this.f23905c;
                c.a aVar2 = f0.c.f46573a;
                C cH = androidx.compose.foundation.layout.d.h(aVar2.o(), false);
                int iA = AbstractC3536j.a(interfaceC3540l, 0);
                InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
                androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarF);
                InterfaceC2629g.a aVar3 = InterfaceC2629g.f3916K;
                InterfaceC6824a interfaceC6824aA = aVar3.a();
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
                E1.c(interfaceC3540lA, cH, aVar3.e());
                E1.c(interfaceC3540lA, interfaceC3563xG, aVar3.g());
                InterfaceC6839p interfaceC6839pB = aVar3.b();
                if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                    interfaceC3540lA.K(Integer.valueOf(iA));
                    interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
                }
                E1.c(interfaceC3540lA, eVarE, aVar3.f());
                androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f28130a;
                interfaceC3540l.U(-1623237850);
                if (bVar != null) {
                    g.c(r.f(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), bVar, interfaceC3540l, 6, 0);
                }
                interfaceC3540l.J();
                final InterfaceC8511f.b bVar2 = (InterfaceC8511f.b) interfaceC3540l.t(AbstractC8460B.K());
                e.a aVar4 = androidx.compose.ui.e.f28771b0;
                androidx.compose.ui.e eVarB = androidx.compose.animation.f.b(r.h(aVar4, 0.0f, 1, null), null, null, 3, null);
                C cA = AbstractC8685h.a(C8680c.f66832a.g(), aVar2.k(), interfaceC3540l, 0);
                int iA2 = AbstractC3536j.a(interfaceC3540l, 0);
                InterfaceC3563x interfaceC3563xG2 = interfaceC3540l.G();
                androidx.compose.ui.e eVarE2 = androidx.compose.ui.c.e(interfaceC3540l, eVarB);
                InterfaceC6824a interfaceC6824aA2 = aVar3.a();
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
                E1.c(interfaceC3540lA2, cA, aVar3.e());
                E1.c(interfaceC3540lA2, interfaceC3563xG2, aVar3.g());
                InterfaceC6839p interfaceC6839pB2 = aVar3.b();
                if (interfaceC3540lA2.o() || !AbstractC6492s.d(interfaceC3540lA2.f(), Integer.valueOf(iA2))) {
                    interfaceC3540lA2.K(Integer.valueOf(iA2));
                    interfaceC3540lA2.Q(Integer.valueOf(iA2), interfaceC6839pB2);
                }
                E1.c(interfaceC3540lA2, eVarE2, aVar3.f());
                C8688k c8688k = C8688k.f66923a;
                androidx.compose.ui.e eVarC = j0.c(r.h(aVar4, 0.0f, 1, null));
                AbstractC3198d.a aVar5 = AbstractC3198d.a.f11402b;
                s9.d dVarB = bVar != null ? bVar.b() : null;
                interfaceC3540l.U(533436897);
                if (dVarB == null) {
                    strB = null;
                    z10 = false;
                } else {
                    z10 = false;
                    strB = AbstractC7930a.b(dVarB, interfaceC3540l, 0);
                }
                interfaceC3540l.J();
                interfaceC3540l.U(533434420);
                boolean zT = interfaceC3540l.T(bVar2);
                Object objF = interfaceC3540l.f();
                if (zT || objF == InterfaceC3540l.f21100a.a()) {
                    objF = new InterfaceC6824a() { // from class: We.f
                        @Override // mh.InterfaceC6824a
                        public final Object invoke() {
                            return g.a.C0903a.c(bVar2);
                        }
                    };
                    interfaceC3540l.K(objF);
                }
                interfaceC3540l.J();
                boolean z11 = z10;
                E.i(eVarC, strB, aVar5, (InterfaceC6824a) objF, b0.c.e(154961205, true, new C0904a(bVar, cVar), interfaceC3540l, 54), 0L, 0L, 0L, 0.0f, null, 0.0f, interfaceC3540l, (AbstractC3198d.a.f11403c << 6) | 24576, 0, 2016);
                if (bVar != null) {
                    dVarD = bVar.d();
                    aVar = aVar4;
                    f10 = 0.0f;
                    r22 = 1;
                    obj = null;
                } else {
                    aVar = aVar4;
                    f10 = 0.0f;
                    r22 = 1;
                    obj = null;
                    dVarD = null;
                }
                androidx.compose.ui.e eVarH = r.h(aVar, f10, r22, obj);
                if (dVarD != null) {
                    z11 = r22;
                }
                AbstractC7385d.d(c8688k, z11, eVarH, null, null, null, b0.c.e(221284125, r22, new b(dVarD), interfaceC3540l, 54), interfaceC3540l, 1573254, 28);
                interfaceC3540l.R();
                interfaceC3540l.R();
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.InterfaceC6839p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((InterfaceC3540l) obj, ((Number) obj2).intValue());
                return J.f24997a;
            }
        }

        a(c cVar, androidx.compose.ui.e eVar) {
            this.f23901a = cVar;
            this.f23902b = eVar;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1672908795, i10, -1, "com.ui.wifiman.ui.signal.floorplan.detail.FloorplanDetailUi.<anonymous> (FloorplanDetailUi.kt:36)");
            }
            O0.a(r.f(this.f23902b, 0.0f, 1, null), null, 0L, 0L, null, 0.0f, b0.c.e(-180468151, true, new C0903a(this.f23902b, (b) o1.b(this.f23901a.n0(), null, interfaceC3540l, 0, 1).getValue(), this.f23901a), interfaceC3540l, 54), interfaceC3540l, 1572864, 62);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(androidx.compose.ui.e eVar, final b bVar, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        final androidx.compose.ui.e eVar2;
        int i12;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1831940986);
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
            i12 |= interfaceC3540lR.T(bVar) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            androidx.compose.ui.e eVar3 = i13 != 0 ? androidx.compose.ui.e.f28771b0 : eVar2;
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1831940986, i12, -1, "com.ui.wifiman.ui.signal.floorplan.detail.FloorplanContainer (FloorplanDetailUi.kt:103)");
            }
            c.a aVar = f0.c.f46573a;
            C cH = androidx.compose.foundation.layout.d.h(aVar.o(), false);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVar3);
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
            androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f28130a;
            e.a aVar3 = androidx.compose.ui.e.f28771b0;
            androidx.compose.ui.e eVar4 = eVar3;
            Ue.o.h(r.f(aVar3, 0.0f, 1, null), bVar.a(), false, interfaceC3540lR, 390, 0);
            androidx.compose.ui.e eVarH = r.h(aVar3, 0.0f, 1, null);
            C6562a c6562a = C6562a.f52458a;
            int i14 = C6562a.f52459b;
            D.n(fVar.f(o.j(eVarH, c6562a.d(interfaceC3540lR, i14).a().a().c(), c6562a.d(interfaceC3540lR, i14).a().b().d()), aVar.b()), bVar.c(), interfaceC3540lR, 0);
            interfaceC3540lR.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            eVar2 = eVar4;
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: We.e
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return g.d(eVar2, bVar, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J d(androidx.compose.ui.e eVar, b bVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        c(eVar, bVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(final androidx.compose.ui.e r10, final We.c r11, T.InterfaceC3540l r12, final int r13, final int r14) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: We.g.e(androidx.compose.ui.e, We.c, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J f(androidx.compose.ui.e eVar, c cVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        e(eVar, cVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }
}
