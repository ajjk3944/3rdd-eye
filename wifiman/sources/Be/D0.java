package Be;

import N.AbstractC3346t0;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.InterfaceC3551q0;
import T.L0;
import T.z1;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.t;
import b1.AbstractC4041C;
import b1.AbstractC4052i;
import b1.C4048e;
import b1.C4049f;
import b1.C4055l;
import b1.InterfaceC4042D;
import b1.s;
import j0.AbstractC6234e;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import la.C6562a;
import m0.C6733v0;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import q.AbstractC7402u;

/* loaded from: classes4.dex */
public abstract class D0 {

    public static final class a implements C0.C {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3551q0 f1390a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b1.z f1391b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b1.o f1392c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f1393d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC3551q0 f1394e;

        /* renamed from: Be.D0$a$a, reason: collision with other inner class name */
        static final class C0065a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ b1.z f1395a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ List f1396b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0065a(b1.z zVar, List list) {
                super(1);
                this.f1395a = zVar;
                this.f1396b = list;
            }

            public final void a(t.a aVar) {
                this.f1395a.h(aVar, this.f1396b);
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((t.a) obj);
                return Yg.J.f24997a;
            }
        }

        public a(InterfaceC3551q0 interfaceC3551q0, b1.z zVar, b1.o oVar, int i10, InterfaceC3551q0 interfaceC3551q02) {
            this.f1390a = interfaceC3551q0;
            this.f1391b = zVar;
            this.f1392c = oVar;
            this.f1393d = i10;
            this.f1394e = interfaceC3551q02;
        }

        @Override // C0.C
        public final C0.D b(androidx.compose.ui.layout.m mVar, List list, long j10) {
            this.f1390a.getValue();
            long jI = this.f1391b.i(j10, mVar.getLayoutDirection(), this.f1392c, list, this.f1393d);
            this.f1394e.getValue();
            return androidx.compose.ui.layout.m.x0(mVar, Y0.r.g(jI), Y0.r.f(jI), null, new C0065a(this.f1391b, list), 4, null);
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3551q0 f1397a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b1.o f1398b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC3551q0 interfaceC3551q0, b1.o oVar) {
            super(0);
            this.f1397a = interfaceC3551q0;
            this.f1398b = oVar;
        }

        public final void a() {
            this.f1397a.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
            this.f1398b.j(true);
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Yg.J.f24997a;
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b1.z f1399a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b1.z zVar) {
            super(1);
            this.f1399a = zVar;
        }

        public final void a(J0.w wVar) {
            AbstractC4041C.a(wVar, this.f1399a);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((J0.w) obj);
            return Yg.J.f24997a;
        }
    }

    public static final class d extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3551q0 f1400a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C4055l f1401b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f1402c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ B0 f1403d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ z1 f1404e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ z1 f1405f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC3551q0 interfaceC3551q0, C4055l c4055l, InterfaceC6824a interfaceC6824a, B0 b02, z1 z1Var, z1 z1Var2) {
            super(2);
            this.f1400a = interfaceC3551q0;
            this.f1401b = c4055l;
            this.f1402c = interfaceC6824a;
            this.f1403d = b02;
            this.f1404e = z1Var;
            this.f1405f = z1Var2;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            long jC;
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1200550679, i10, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:454)");
            }
            this.f1400a.setValue(Yg.J.f24997a);
            int iE = this.f1401b.e();
            this.f1401b.f();
            C4055l c4055l = this.f1401b;
            interfaceC3540l.U(1366635570);
            C4055l.b bVarJ = c4055l.j();
            C4049f c4049fA = bVarJ.a();
            C4049f c4049fB = bVarJ.b();
            if (this.f1403d.b() == null && this.f1403d.a()) {
                interfaceC3540l.U(1366814160);
                jC = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().b().f();
                interfaceC3540l.J();
            } else {
                interfaceC3540l.U(1366878423);
                jC = Ne.f.c(this.f1403d.b(), null, interfaceC3540l, 0, 1);
                interfaceC3540l.J();
            }
            z1 z1VarA = AbstractC7402u.a(jC, null, "signal color", null, interfaceC3540l, 384, 10);
            e.a aVar = androidx.compose.ui.e.f28771b0;
            interfaceC3540l.U(-1341374295);
            Object objF = interfaceC3540l.f();
            InterfaceC3540l.a aVar2 = InterfaceC3540l.f21100a;
            if (objF == aVar2.a()) {
                objF = e.f1406a;
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            AbstractC3346t0.g(((Number) this.f1404e.getValue()).floatValue(), AbstractC6234e.a(c4055l.h(aVar, c4049fA, (InterfaceC6835l) objF), E.h.d(Y0.h.j(3))), ((C6733v0) z1VarA.getValue()).u(), C6733v0.k(((C6733v0) z1VarA.getValue()).u(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), 0, interfaceC3540l, 0, 16);
            AbstractC4052i.c cVarC = c4055l.c(((Number) this.f1405f.getValue()).floatValue());
            interfaceC3540l.U(-1341352529);
            boolean zT = interfaceC3540l.T(cVarC);
            Object objF2 = interfaceC3540l.f();
            if (zT || objF2 == aVar2.a()) {
                objF2 = new f(cVarC);
                interfaceC3540l.K(objF2);
            }
            interfaceC3540l.J();
            androidx.compose.ui.e eVarH = c4055l.h(aVar, c4049fB, (InterfaceC6835l) objF2);
            interfaceC3540l.U(-1341341846);
            long jC2 = this.f1403d.c() != null ? C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().g().c() : C6733v0.f52951b.d();
            interfaceC3540l.J();
            z.a0.a(androidx.compose.foundation.b.d(eVarH, jC2, null, 2, null), interfaceC3540l, 0);
            interfaceC3540l.J();
            if (this.f1401b.e() != iE) {
                T.O.g(this.f1402c, interfaceC3540l, 6);
            }
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

    static final class e implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final e f1406a = new e();

        e() {
        }

        public final void a(C4048e constrainAs) {
            AbstractC6492s.i(constrainAs, "$this$constrainAs");
            b1.v.a(constrainAs.d(), constrainAs.g().c(), 0.0f, 0.0f, 6, null);
            InterfaceC4042D.b(constrainAs.h(), constrainAs.g().e(), 0.0f, 0.0f, 6, null);
            InterfaceC4042D.b(constrainAs.f(), constrainAs.g().d(), 0.0f, 0.0f, 6, null);
            s.b bVar = b1.s.f32772a;
            constrainAs.n(bVar.c(Y0.h.j(4)));
            constrainAs.o(bVar.a());
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C4048e) obj);
            return Yg.J.f24997a;
        }
    }

    static final class f implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC4052i.c f1407a;

        f(AbstractC4052i.c cVar) {
            this.f1407a = cVar;
        }

        public final void a(C4048e constrainAs) {
            AbstractC6492s.i(constrainAs, "$this$constrainAs");
            b1.v.a(constrainAs.i(), constrainAs.g().f(), 0.0f, 0.0f, 6, null);
            b1.v.a(constrainAs.d(), constrainAs.g().c(), 0.0f, 0.0f, 6, null);
            InterfaceC4042D.b(constrainAs.h(), this.f1407a, 0.0f, 0.0f, 6, null);
            s.b bVar = b1.s.f32772a;
            constrainAs.n(bVar.c(Y0.h.j(10)));
            constrainAs.o(bVar.c(Y0.h.j(1)));
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C4048e) obj);
            return Yg.J.f24997a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b8  */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final androidx.compose.ui.e r19, final Be.B0 r20, T.InterfaceC3540l r21, final int r22) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Be.D0.b(androidx.compose.ui.e, Be.B0, T.l, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J c(androidx.compose.ui.e eVar, B0 b02, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        b(eVar, b02, interfaceC3540l, L0.a(i10 | 1));
        return Yg.J.f24997a;
    }
}
