package bf;

import Be.AbstractC2487w;
import C0.C;
import E0.InterfaceC2629g;
import L0.C3174d;
import L0.U;
import N.a1;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.X0;
import Yg.J;
import androidx.compose.ui.e;
import b8.AbstractC4075b;
import bf.AbstractC4105i;
import f0.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import m0.C6733v0;
import m8.AbstractC6778a;
import m8.AbstractC6780c;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.snmp4j.mp.MPv3;
import q.AbstractC7385d;
import q.AbstractC7402u;
import q.InterfaceC7386e;
import s9.InterfaceC7929a;
import s9.c;
import s9.d;
import sa.AbstractC7930a;
import ta.AbstractC8049c;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;
import z.W;
import z.Z;

/* renamed from: bf.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4105i {

    /* renamed from: bf.i$a */
    static final class a implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ EnumC4097a f33190a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f33191b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C4101e f33192c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f33193d;

        /* renamed from: bf.i$a$a, reason: collision with other inner class name */
        static final class C1157a implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC6835l f33194a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C4101e f33195b;

            C1157a(InterfaceC6835l interfaceC6835l, C4101e c4101e) {
                this.f33194a = interfaceC6835l;
                this.f33195b = c4101e;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final J c(InterfaceC6835l interfaceC6835l, C4101e c4101e) {
                interfaceC6835l.invoke(c4101e.b());
                return J.f24997a;
            }

            public final void b(InterfaceC7386e AnimatedVisibility, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(AnimatedVisibility, "$this$AnimatedVisibility");
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-503794415, i10, -1, "com.ui.wifiman.ui.speed.hosts.NetworkHostlistItem.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NetworkHostListItem.kt:122)");
                }
                s9.b bVarE = N9.b.f16117a.E();
                androidx.compose.ui.e eVarV = androidx.compose.foundation.layout.r.v(androidx.compose.ui.e.f28771b0, Y0.h.j(20));
                interfaceC3540l.U(-1991819022);
                boolean zT = interfaceC3540l.T(this.f33194a) | interfaceC3540l.T(this.f33195b);
                final InterfaceC6835l interfaceC6835l = this.f33194a;
                final C4101e c4101e = this.f33195b;
                Object objF = interfaceC3540l.f();
                if (zT || objF == InterfaceC3540l.f21100a.a()) {
                    objF = new InterfaceC6824a() { // from class: bf.h
                        @Override // mh.InterfaceC6824a
                        public final Object invoke() {
                            return AbstractC4105i.a.C1157a.c(interfaceC6835l, c4101e);
                        }
                    };
                    interfaceC3540l.K(objF);
                }
                interfaceC3540l.J();
                AbstractC8049c.c(bVarE, androidx.compose.foundation.d.d(eVarV, false, null, null, (InterfaceC6824a) objF, 7, null), C6733v0.g(C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().l().f()), null, interfaceC3540l, 0, 4);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                b((InterfaceC7386e) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                return J.f24997a;
            }
        }

        /* renamed from: bf.i$a$b */
        static final class b implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C4101e f33196a;

            b(C4101e c4101e) {
                this.f33196a = c4101e;
            }

            public final void a(InterfaceC7386e AnimatedVisibility, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(AnimatedVisibility, "$this$AnimatedVisibility");
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-2063629817, i10, -1, "com.ui.wifiman.ui.speed.hosts.NetworkHostlistItem.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NetworkHostListItem.kt:146)");
                }
                if (this.f33196a.f() != null) {
                    C3174d c3174dA = AbstractC7930a.a(this.f33196a.f(), interfaceC3540l, 0);
                    C6562a c6562a = C6562a.f52458a;
                    int i11 = C6562a.f52459b;
                    a1.c(c3174dA, null, c6562a.a(interfaceC3540l, i11).f().c(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6562a.c(interfaceC3540l, i11).b().f(), interfaceC3540l, 0, 0, 131066);
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

        /* renamed from: bf.i$a$c */
        static final class c implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C4101e f33197a;

            c(C4101e c4101e) {
                this.f33197a = c4101e;
            }

            public final void a(InterfaceC7386e AnimatedVisibility, InterfaceC3540l interfaceC3540l, int i10) {
                s9.d bVar;
                AbstractC6492s.i(AnimatedVisibility, "$this$AnimatedVisibility");
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(363111048, i10, -1, "com.ui.wifiman.ui.speed.hosts.NetworkHostlistItem.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NetworkHostListItem.kt:159)");
                }
                AbstractC4075b abstractC4075bC = this.f33197a.c();
                if (abstractC4075bC == null || (bVar = Ne.d.c(abstractC4075bC, false)) == null) {
                    bVar = this.f33197a.e() ? new d.b(AbstractC6780c.f53627z4) : new d.c("");
                }
                C3174d c3174dA = AbstractC7930a.a(bVar, interfaceC3540l, 0);
                U uB = C6562a.f52458a.c(interfaceC3540l, C6562a.f52459b).b().b();
                AbstractC4075b abstractC4075bC2 = this.f33197a.c();
                interfaceC3540l.U(-1991761508);
                C6733v0 c6733v0G = abstractC4075bC2 == null ? null : C6733v0.g(Ne.d.a(abstractC4075bC2, interfaceC3540l, 0));
                interfaceC3540l.J();
                interfaceC3540l.U(-1991761928);
                long jA = c6733v0G == null ? Ne.d.a(AbstractC4075b.f33002a.a(MPv3.MAX_MESSAGE_ID), interfaceC3540l, 0) : c6733v0G.u();
                interfaceC3540l.J();
                a1.c(c3174dA, null, ((C6733v0) AbstractC7402u.a(jA, null, "edit mode", null, interfaceC3540l, 384, 10).getValue()).u(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, uB, interfaceC3540l, 0, 0, 131066);
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

        /* renamed from: bf.i$a$d */
        public /* synthetic */ class d {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f33198a;

            static {
                int[] iArr = new int[EnumC4097a.values().length];
                try {
                    iArr[EnumC4097a.ON_LIST_BOTTOM.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC4097a.IN_LIST_MIDDLE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC4097a.ON_LIST_TOP_BOTTOM.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC4097a.DRAGGING.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EnumC4097a.ON_LIST_TOP.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f33198a = iArr;
            }
        }

        a(EnumC4097a enumC4097a, boolean z10, C4101e c4101e, InterfaceC6835l interfaceC6835l) {
            this.f33190a = enumC4097a;
            this.f33191b = z10;
            this.f33192c = c4101e;
            this.f33193d = interfaceC6835l;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            boolean z10;
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(2108647263, i10, -1, "com.ui.wifiman.ui.speed.hosts.NetworkHostlistItem.<anonymous> (NetworkHostListItem.kt:91)");
            }
            e.a aVar = androidx.compose.ui.e.f28771b0;
            androidx.compose.ui.e eVarH = androidx.compose.foundation.layout.r.h(aVar, 0.0f, 1, null);
            C8680c c8680c = C8680c.f66832a;
            C8680c.f fVarB = c8680c.b();
            EnumC4097a enumC4097a = this.f33190a;
            boolean z11 = this.f33191b;
            C4101e c4101e = this.f33192c;
            InterfaceC6835l interfaceC6835l = this.f33193d;
            c.a aVar2 = f0.c.f46573a;
            C cA = AbstractC8685h.a(fVarB, aVar2.k(), interfaceC3540l, 6);
            int iA = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarH);
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
            E1.c(interfaceC3540lA, cA, aVar3.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar3.g());
            InterfaceC6839p interfaceC6839pB = aVar3.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar3.f());
            C8688k c8688k = C8688k.f66923a;
            int i11 = d.f33198a[enumC4097a.ordinal()];
            if (i11 == 1 || i11 == 2) {
                z10 = true;
            } else {
                if (i11 != 3 && i11 != 4 && i11 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                z10 = false;
            }
            C4098b c4098b = C4098b.f33162a;
            AbstractC7385d.d(c8688k, z10, null, null, null, null, c4098b.a(), interfaceC3540l, 1572870, 30);
            float f10 = 16;
            androidx.compose.ui.e eVarJ = androidx.compose.foundation.layout.o.j(androidx.compose.foundation.layout.r.h(androidx.compose.foundation.layout.r.k(aVar, Y0.h.j(60), 0.0f, 2, null), 0.0f, 1, null), Y0.h.j(f10), Y0.h.j(4));
            C cB = W.b(c8680c.n(Y0.h.j(f10)), aVar2.i(), interfaceC3540l, 54);
            int iA2 = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG2 = interfaceC3540l.G();
            androidx.compose.ui.e eVarE2 = androidx.compose.ui.c.e(interfaceC3540l, eVarJ);
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
            E1.c(interfaceC3540lA2, cB, aVar3.e());
            E1.c(interfaceC3540lA2, interfaceC3563xG2, aVar3.g());
            InterfaceC6839p interfaceC6839pB2 = aVar3.b();
            if (interfaceC3540lA2.o() || !AbstractC6492s.d(interfaceC3540lA2.f(), Integer.valueOf(iA2))) {
                interfaceC3540lA2.K(Integer.valueOf(iA2));
                interfaceC3540lA2.Q(Integer.valueOf(iA2), interfaceC6839pB2);
            }
            E1.c(interfaceC3540lA2, eVarE2, aVar3.f());
            Z z12 = Z.f66823a;
            AbstractC7385d.e(z12, z11 && c4101e.d(), null, null, null, null, b0.c.e(-503794415, true, new C1157a(interfaceC6835l, c4101e), interfaceC3540l, 54), interfaceC3540l, 1572870, 30);
            AbstractC2487w.b(c4101e.a(), androidx.compose.foundation.layout.r.v(aVar, Y0.h.j(24)), null, null, null, 0.0f, 0L, interfaceC3540l, 48, 62);
            androidx.compose.ui.e eVarA = z12.a(aVar, 1.0f, true);
            C cA2 = AbstractC8685h.a(c8680c.n(Y0.h.j(2)), aVar2.k(), interfaceC3540l, 6);
            int iA3 = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG3 = interfaceC3540l.G();
            androidx.compose.ui.e eVarE3 = androidx.compose.ui.c.e(interfaceC3540l, eVarA);
            InterfaceC6824a interfaceC6824aA3 = aVar3.a();
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
            E1.c(interfaceC3540lA3, cA2, aVar3.e());
            E1.c(interfaceC3540lA3, interfaceC3563xG3, aVar3.g());
            InterfaceC6839p interfaceC6839pB3 = aVar3.b();
            if (interfaceC3540lA3.o() || !AbstractC6492s.d(interfaceC3540lA3.f(), Integer.valueOf(iA3))) {
                interfaceC3540lA3.K(Integer.valueOf(iA3));
                interfaceC3540lA3.Q(Integer.valueOf(iA3), interfaceC6839pB3);
            }
            E1.c(interfaceC3540lA3, eVarE3, aVar3.f());
            C3174d c3174dA = AbstractC7930a.a(c4101e.g(), interfaceC3540l, 0);
            C6562a c6562a = C6562a.f52458a;
            int i12 = C6562a.f52459b;
            a1.c(c3174dA, null, c6562a.a(interfaceC3540l, i12).f().a(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6562a.c(interfaceC3540l, i12).a().b(), interfaceC3540l, 0, 0, 131066);
            AbstractC7385d.d(c8688k, c4101e.f() != null, null, null, null, null, b0.c.e(-2063629817, true, new b(c4101e), interfaceC3540l, 54), interfaceC3540l, 1572870, 30);
            interfaceC3540l.R();
            AbstractC7385d.e(z12, !z11, null, null, null, null, b0.c.e(363111048, true, new c(c4101e), interfaceC3540l, 54), interfaceC3540l, 1572870, 30);
            AbstractC7385d.e(z12, z11, null, null, null, null, c4098b.b(), interfaceC3540l, 1572870, 30);
            interfaceC3540l.R();
            interfaceC3540l.R();
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

    /* renamed from: bf.i$b */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33199a;

        static {
            int[] iArr = new int[EnumC4097a.values().length];
            try {
                iArr[EnumC4097a.ON_LIST_TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4097a.ON_LIST_BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC4097a.ON_LIST_TOP_BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC4097a.IN_LIST_MIDDLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC4097a.DRAGGING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f33199a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(androidx.compose.ui.e eVar, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        androidx.compose.ui.e eVar2;
        int i12;
        final androidx.compose.ui.e eVar3;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1722210115);
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
        if ((i12 & 3) == 2 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            eVar3 = eVar2;
        } else {
            eVar3 = i13 != 0 ? androidx.compose.ui.e.f28771b0 : eVar2;
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1722210115, i12, -1, "com.ui.wifiman.ui.speed.hosts.NetworkHostlistDivider (NetworkHostListItem.kt:192)");
            }
            androidx.compose.ui.e eVarD = androidx.compose.foundation.b.d(androidx.compose.foundation.layout.o.m(androidx.compose.foundation.layout.r.i(eVar3, Y0.h.j(1)), Y0.h.j(56), 0.0f, 0.0f, 0.0f, 14, null), C6562a.f52458a.a(interfaceC3540lR, C6562a.f52459b).a().g().e(), null, 2, null);
            C cH = androidx.compose.foundation.layout.d.h(f0.c.f46573a.o(), false);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVarD);
            InterfaceC2629g.a aVar = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar.a();
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
            E1.c(interfaceC3540lA, cH, aVar.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar.g());
            InterfaceC6839p interfaceC6839pB = aVar.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar.f());
            androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f28130a;
            interfaceC3540lR.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: bf.g
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC4105i.d(eVar3, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J d(androidx.compose.ui.e eVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        c(eVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(androidx.compose.ui.e r22, final bf.C4101e r23, boolean r24, bf.EnumC4097a r25, final mh.InterfaceC6835l r26, T.InterfaceC3540l r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bf.AbstractC4105i.e(androidx.compose.ui.e, bf.e, boolean, bf.a, mh.l, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J f(androidx.compose.ui.e eVar, C4101e c4101e, boolean z10, EnumC4097a enumC4097a, InterfaceC6835l interfaceC6835l, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        e(eVar, c4101e, z10, enumC4097a, interfaceC6835l, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }

    public static final C4101e h(String id2, InterfaceC7929a icon, s9.d title, s9.d subtitle, boolean z10, AbstractC4075b abstractC4075b) {
        AbstractC6492s.i(id2, "id");
        AbstractC6492s.i(icon, "icon");
        AbstractC6492s.i(title, "title");
        AbstractC6492s.i(subtitle, "subtitle");
        return new C4101e(id2, icon, title, subtitle, z10, abstractC4075b, true);
    }

    public static /* synthetic */ C4101e i(String str, InterfaceC7929a interfaceC7929a, s9.d dVar, s9.d dVar2, boolean z10, AbstractC4075b abstractC4075b, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        if ((i10 & 2) != 0) {
            interfaceC7929a = new c.a(AbstractC6778a.f53267z0, null, 2, null);
        }
        InterfaceC7929a interfaceC7929a2 = interfaceC7929a;
        if ((i10 & 4) != 0) {
            dVar = new d.c("google.com");
        }
        s9.d dVar3 = dVar;
        if ((i10 & 8) != 0) {
            dVar2 = new d.c("177.156.452.215");
        }
        s9.d dVar4 = dVar2;
        if ((i10 & 16) != 0) {
            z10 = true;
        }
        boolean z11 = z10;
        if ((i10 & 32) != 0) {
            abstractC4075b = AbstractC4075b.f33002a.a(20);
        }
        return h(str, interfaceC7929a2, dVar3, dVar4, z11, abstractC4075b);
    }
}
