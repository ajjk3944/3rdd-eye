package q9;

import C0.C;
import C0.D;
import E0.InterfaceC2629g;
import J0.w;
import N.a1;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3551q0;
import T.InterfaceC3563x;
import T.L0;
import T.O;
import T.X0;
import T.o1;
import T.t1;
import Yg.J;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.platform.AbstractC3932k0;
import b1.AbstractC4041C;
import b1.C4048e;
import b1.C4049f;
import b1.C4055l;
import b1.InterfaceC4042D;
import b1.v;
import b1.z;
import com.google.ar.core.ImageMetadata;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import la.C6562a;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.transport.TLSTM;
import s9.InterfaceC7929a;
import ta.AbstractC8049c;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;

/* loaded from: classes3.dex */
public abstract class t {

    public static final class a implements C {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3551q0 f58569a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ z f58570b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b1.o f58571c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f58572d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC3551q0 f58573e;

        /* renamed from: q9.t$a$a, reason: collision with other inner class name */
        static final class C2062a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ z f58574a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ List f58575b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2062a(z zVar, List list) {
                super(1);
                this.f58574a = zVar;
                this.f58575b = list;
            }

            public final void a(t.a aVar) {
                this.f58574a.h(aVar, this.f58575b);
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((t.a) obj);
                return J.f24997a;
            }
        }

        public a(InterfaceC3551q0 interfaceC3551q0, z zVar, b1.o oVar, int i10, InterfaceC3551q0 interfaceC3551q02) {
            this.f58569a = interfaceC3551q0;
            this.f58570b = zVar;
            this.f58571c = oVar;
            this.f58572d = i10;
            this.f58573e = interfaceC3551q02;
        }

        @Override // C0.C
        public final D b(androidx.compose.ui.layout.m mVar, List list, long j10) {
            this.f58569a.getValue();
            long jI = this.f58570b.i(j10, mVar.getLayoutDirection(), this.f58571c, list, this.f58572d);
            this.f58573e.getValue();
            return androidx.compose.ui.layout.m.x0(mVar, Y0.r.g(jI), Y0.r.f(jI), null, new C2062a(this.f58570b, list), 4, null);
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3551q0 f58576a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b1.o f58577b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC3551q0 interfaceC3551q0, b1.o oVar) {
            super(0);
            this.f58576a = interfaceC3551q0;
            this.f58577b = oVar;
        }

        public final void a() {
            this.f58576a.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
            this.f58577b.j(true);
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return J.f24997a;
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ z f58578a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(z zVar) {
            super(1);
            this.f58578a = zVar;
        }

        public final void a(w wVar) {
            AbstractC4041C.a(wVar, this.f58578a);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((w) obj);
            return J.f24997a;
        }
    }

    public static final class d extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3551q0 f58579a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C4055l f58580b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f58581c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ s9.c f58582d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC7929a.b f58583e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ s9.b f58584f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f58585g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f58586h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC3551q0 interfaceC3551q0, C4055l c4055l, InterfaceC6824a interfaceC6824a, s9.c cVar, InterfaceC7929a.b bVar, s9.b bVar2, String str, String str2) {
            super(2);
            this.f58579a = interfaceC3551q0;
            this.f58580b = c4055l;
            this.f58581c = interfaceC6824a;
            this.f58582d = cVar;
            this.f58583e = bVar;
            this.f58584f = bVar2;
            this.f58585g = str;
            this.f58586h = str2;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            int i11;
            C4049f c4049f;
            C4049f c4049f2;
            C4055l c4055l;
            e.a aVar;
            e.a aVar2;
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1200550679, i10, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:454)");
            }
            this.f58579a.setValue(J.f24997a);
            int iE = this.f58580b.e();
            this.f58580b.f();
            C4055l c4055l2 = this.f58580b;
            interfaceC3540l.U(-431472732);
            C4055l.b bVarJ = c4055l2.j();
            C4049f c4049fA = bVarJ.a();
            C4049f c4049fB = bVarJ.b();
            C4049f c4049fC = bVarJ.c();
            float f10 = 4;
            float fJ = Y0.h.j(f10);
            float fJ2 = Y0.h.j(16);
            float fJ3 = Y0.h.j(f10);
            e.a aVar3 = androidx.compose.ui.e.f28771b0;
            interfaceC3540l.U(-1815025915);
            Object objF = interfaceC3540l.f();
            InterfaceC3540l.a aVar4 = InterfaceC3540l.f21100a;
            if (objF == aVar4.a()) {
                objF = e.f58587a;
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            AbstractC7440f.c(c4055l2.h(aVar3, c4049fA, (InterfaceC6835l) objF), this.f58582d, this.f58583e, Y0.h.j(40), null, interfaceC3540l, 3072, 16);
            interfaceC3540l.U(-1815014969);
            boolean zT = interfaceC3540l.T(c4049fA) | interfaceC3540l.T(this.f58584f) | interfaceC3540l.T(c4049fC);
            Object objF2 = interfaceC3540l.f();
            if (zT || objF2 == aVar4.a()) {
                objF2 = new f(c4049fA, fJ, this.f58584f, c4049fC);
                interfaceC3540l.K(objF2);
            }
            interfaceC3540l.J();
            androidx.compose.ui.e eVarH = c4055l2.h(aVar3, c4049fB, (InterfaceC6835l) objF2);
            C cA = AbstractC8685h.a(C8680c.f66832a.g(), f0.c.f46573a.k(), interfaceC3540l, 0);
            int iA = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarH);
            InterfaceC2629g.a aVar5 = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar5.a();
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
            E1.c(interfaceC3540lA, cA, aVar5.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar5.g());
            InterfaceC6839p interfaceC6839pB = aVar5.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar5.f());
            C8688k c8688k = C8688k.f66923a;
            interfaceC3540l.U(-1467736355);
            String str = this.f58585g;
            if (str != null) {
                c4049f = c4049fC;
                c4049f2 = c4049fB;
                c4055l = c4055l2;
                i11 = iE;
                aVar = aVar3;
                a1.b(str, androidx.compose.foundation.layout.r.h(aVar3, 0.0f, 1, null), 0L, 0L, null, null, null, 0L, null, null, 0L, W0.t.f23567a.b(), false, 1, 0, null, C6562a.f52458a.c(interfaceC3540l, C6562a.f52459b).a().b(), interfaceC3540l, 48, 3120, 55292);
            } else {
                i11 = iE;
                c4049f = c4049fC;
                c4049f2 = c4049fB;
                c4055l = c4055l2;
                aVar = aVar3;
            }
            interfaceC3540l.J();
            interfaceC3540l.U(-1467726189);
            String str2 = this.f58586h;
            if (str2 != null) {
                e.a aVar6 = aVar;
                androidx.compose.ui.e eVarH2 = androidx.compose.foundation.layout.r.h(aVar6, 0.0f, 1, null);
                int iB = W0.t.f23567a.b();
                C6562a c6562a = C6562a.f52458a;
                int i12 = C6562a.f52459b;
                aVar2 = aVar6;
                a1.b(str2, eVarH2, c6562a.a(interfaceC3540l, i12).f().c(), 0L, null, null, null, 0L, null, null, 0L, iB, false, 1, 0, null, c6562a.c(interfaceC3540l, i12).b().f(), interfaceC3540l, 48, 3120, 55288);
            } else {
                aVar2 = aVar;
            }
            interfaceC3540l.J();
            interfaceC3540l.R();
            interfaceC3540l.U(-1814978706);
            s9.b bVar = this.f58584f;
            if (bVar != null) {
                androidx.compose.ui.e eVarV = androidx.compose.foundation.layout.r.v(aVar2, Y0.h.j(24));
                interfaceC3540l.U(-1467709278);
                C4049f c4049f3 = c4049f2;
                boolean zT2 = interfaceC3540l.T(c4049f3);
                Object objF3 = interfaceC3540l.f();
                if (zT2 || objF3 == aVar4.a()) {
                    objF3 = new g(c4049f3, fJ2, fJ3);
                    interfaceC3540l.K(objF3);
                }
                interfaceC3540l.J();
                AbstractC8049c.c(bVar, c4055l.h(eVarV, c4049f, (InterfaceC6835l) objF3), null, null, interfaceC3540l, 0, 6);
            }
            interfaceC3540l.J();
            interfaceC3540l.J();
            if (this.f58580b.e() != i11) {
                O.g(this.f58581c, interfaceC3540l, 6);
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

    static final class e implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final e f58587a = new e();

        e() {
        }

        public final void a(C4048e constrainAs) {
            AbstractC6492s.i(constrainAs, "$this$constrainAs");
            InterfaceC4042D.b(constrainAs.h(), constrainAs.g().e(), 0.0f, 0.0f, 6, null);
            v.a(constrainAs.i(), constrainAs.g().f(), 0.0f, 0.0f, 6, null);
            v.a(constrainAs.d(), constrainAs.g().c(), 0.0f, 0.0f, 6, null);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C4048e) obj);
            return J.f24997a;
        }
    }

    static final class f implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C4049f f58588a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f58589b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ s9.b f58590c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C4049f f58591d;

        f(C4049f c4049f, float f10, s9.b bVar, C4049f c4049f2) {
            this.f58588a = c4049f;
            this.f58589b = f10;
            this.f58590c = bVar;
            this.f58591d = c4049f2;
        }

        public final void a(C4048e constrainAs) {
            AbstractC6492s.i(constrainAs, "$this$constrainAs");
            InterfaceC4042D.b(constrainAs.h(), this.f58588a.d(), this.f58589b, 0.0f, 4, null);
            if (this.f58590c != null) {
                InterfaceC4042D.b(constrainAs.f(), this.f58591d.e(), 0.0f, 0.0f, 6, null);
            } else {
                InterfaceC4042D.b(constrainAs.f(), constrainAs.g().d(), 0.0f, 0.0f, 6, null);
            }
            v.a(constrainAs.i(), constrainAs.g().f(), 0.0f, 0.0f, 6, null);
            v.a(constrainAs.d(), constrainAs.g().c(), 0.0f, 0.0f, 6, null);
            constrainAs.o(b1.s.f32772a.a());
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C4048e) obj);
            return J.f24997a;
        }
    }

    static final class g implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C4049f f58592a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f58593b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f58594c;

        g(C4049f c4049f, float f10, float f11) {
            this.f58592a = c4049f;
            this.f58593b = f10;
            this.f58594c = f11;
        }

        public final void a(C4048e constrainAs) {
            AbstractC6492s.i(constrainAs, "$this$constrainAs");
            InterfaceC4042D.b(constrainAs.h(), this.f58592a.d(), this.f58593b, 0.0f, 4, null);
            InterfaceC4042D.b(constrainAs.f(), constrainAs.g().d(), this.f58594c, 0.0f, 4, null);
            v.a(constrainAs.i(), constrainAs.g().f(), 0.0f, 0.0f, 6, null);
            v.a(constrainAs.d(), constrainAs.g().c(), 0.0f, 0.0f, 6, null);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C4048e) obj);
            return J.f24997a;
        }
    }

    public static final void b(androidx.compose.ui.e eVar, final s9.c avatar, final InterfaceC7929a.b avatarPlaceholder, final String str, final String str2, final s9.b bVar, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        androidx.compose.ui.e eVar2;
        int i12;
        final androidx.compose.ui.e eVar3;
        AbstractC6492s.i(avatar, "avatar");
        AbstractC6492s.i(avatarPlaceholder, "avatarPlaceholder");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1898133373);
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
            i12 |= interfaceC3540lR.T(avatar) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= interfaceC3540lR.T(avatarPlaceholder) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= interfaceC3540lR.T(str) ? 2048 : 1024;
        }
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((i10 & 24576) == 0) {
            i12 |= interfaceC3540lR.T(str2) ? TLSTM.TLS_MAX_FRAGMENT_SIZE : 8192;
        }
        if ((i11 & 32) != 0) {
            i12 |= ImageMetadata.EDGE_MODE;
        } else if ((i10 & ImageMetadata.EDGE_MODE) == 0) {
            i12 |= interfaceC3540lR.T(bVar) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        if ((74899 & i12) == 74898 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            eVar3 = eVar2;
        } else {
            androidx.compose.ui.e eVar4 = i13 != 0 ? androidx.compose.ui.e.f28771b0 : eVar2;
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1898133373, i12, -1, "com.ui.core.ui.account.UiAccountStrip (UiAccountStrip.kt:30)");
            }
            androidx.compose.ui.e eVarB = androidx.compose.foundation.layout.r.b(eVar4, 0.0f, Y0.h.j(72), 1, null);
            interfaceC3540lR.U(-1003410150);
            interfaceC3540lR.U(212064437);
            interfaceC3540lR.J();
            Y0.d dVar = (Y0.d) interfaceC3540lR.t(AbstractC3932k0.g());
            Object objF = interfaceC3540lR.f();
            InterfaceC3540l.a aVar = InterfaceC3540l.f21100a;
            if (objF == aVar.a()) {
                objF = new z(dVar);
                interfaceC3540lR.K(objF);
            }
            z zVar = (z) objF;
            Object objF2 = interfaceC3540lR.f();
            if (objF2 == aVar.a()) {
                objF2 = new C4055l();
                interfaceC3540lR.K(objF2);
            }
            C4055l c4055l = (C4055l) objF2;
            Object objF3 = interfaceC3540lR.f();
            if (objF3 == aVar.a()) {
                objF3 = t1.d(Boolean.FALSE, null, 2, null);
                interfaceC3540lR.K(objF3);
            }
            InterfaceC3551q0 interfaceC3551q0 = (InterfaceC3551q0) objF3;
            Object objF4 = interfaceC3540lR.f();
            if (objF4 == aVar.a()) {
                objF4 = new b1.o(c4055l);
                interfaceC3540lR.K(objF4);
            }
            b1.o oVar = (b1.o) objF4;
            Object objF5 = interfaceC3540lR.f();
            if (objF5 == aVar.a()) {
                objF5 = o1.h(J.f24997a, o1.j());
                interfaceC3540lR.K(objF5);
            }
            InterfaceC3551q0 interfaceC3551q02 = (InterfaceC3551q0) objF5;
            androidx.compose.ui.e eVar5 = eVar4;
            boolean zL = interfaceC3540lR.l(zVar) | interfaceC3540lR.i(257);
            Object objF6 = interfaceC3540lR.f();
            if (zL || objF6 == aVar.a()) {
                objF6 = new a(interfaceC3551q02, zVar, oVar, 257, interfaceC3551q0);
                interfaceC3540lR.K(objF6);
            }
            C c10 = (C) objF6;
            Object objF7 = interfaceC3540lR.f();
            if (objF7 == aVar.a()) {
                objF7 = new b(interfaceC3551q0, oVar);
                interfaceC3540lR.K(objF7);
            }
            InterfaceC6824a interfaceC6824a = (InterfaceC6824a) objF7;
            boolean zL2 = interfaceC3540lR.l(zVar);
            Object objF8 = interfaceC3540lR.f();
            if (zL2 || objF8 == aVar.a()) {
                objF8 = new c(zVar);
                interfaceC3540lR.K(objF8);
            }
            C0.w.a(J0.m.c(eVarB, false, (InterfaceC6835l) objF8, 1, null), b0.c.e(1200550679, true, new d(interfaceC3551q02, c4055l, interfaceC6824a, avatar, avatarPlaceholder, bVar, str, str2), interfaceC3540lR, 54), c10, interfaceC3540lR, 48, 0);
            interfaceC3540lR.J();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            eVar3 = eVar5;
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: q9.s
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return t.c(eVar3, avatar, avatarPlaceholder, str, str2, bVar, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J c(androidx.compose.ui.e eVar, s9.c cVar, InterfaceC7929a.b bVar, String str, String str2, s9.b bVar2, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        b(eVar, cVar, bVar, str, str2, bVar2, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }
}
