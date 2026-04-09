package T9;

import C0.C;
import C0.InterfaceC2528h;
import E0.InterfaceC2629g;
import F.D;
import F9.X;
import F9.c0;
import Ii.AbstractC3063k;
import Ii.N;
import L0.C3174d;
import L0.U;
import Li.AbstractC3222i;
import N.a1;
import Q0.A;
import Q0.AbstractC3434k;
import R0.C3471y;
import R0.K;
import R0.r;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.O;
import T.X0;
import T9.j;
import Y0.w;
import Yg.J;
import Yg.v;
import android.content.res.Resources;
import androidx.compose.foundation.layout.o;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.n1;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import f0.c;
import ja.AbstractC6262b;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import la.C6562a;
import m0.AbstractC6735w0;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import mh.q;
import pa.C7273a;
import s9.c;
import s9.d;
import sa.AbstractC7930a;
import ta.AbstractC8049c;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;

/* loaded from: classes3.dex */
public abstract class j {

    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f21489a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.ui.core.ui.sso.login.g f21490b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(com.ui.core.ui.sso.login.g gVar, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f21490b = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new a(this.f21490b, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            if (this.f21489a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            this.f21490b.s0();
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class b implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ui.core.ui.sso.login.g f21491a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ N f21492b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ n1 f21493c;

        static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f21494a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ com.ui.core.ui.sso.login.g f21495b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(com.ui.core.ui.sso.login.g gVar, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f21495b = gVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return new a(this.f21495b, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f21494a;
                if (i10 == 0) {
                    v.b(obj);
                    com.ui.core.ui.sso.login.g gVar = this.f21495b;
                    this.f21494a = 1;
                    if (gVar.p0(this) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v.b(obj);
                }
                return J.f24997a;
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                return ((a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        /* renamed from: T9.j$b$b, reason: collision with other inner class name */
        static final class C0789b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f21496a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f21497b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ com.ui.core.ui.sso.login.g f21498c;

            /* renamed from: T9.j$b$b$a */
            static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                int f21499a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ com.ui.core.ui.sso.login.g f21500b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(com.ui.core.ui.sso.login.g gVar, InterfaceC5380e interfaceC5380e) {
                    super(2, interfaceC5380e);
                    this.f21500b = gVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                    return new a(this.f21500b, interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    AbstractC5467b.g();
                    if (this.f21499a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v.b(obj);
                    this.f21500b.n0();
                    return J.f24997a;
                }

                @Override // mh.InterfaceC6839p
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CharSequence charSequence, InterfaceC5380e interfaceC5380e) {
                    return ((a) create(charSequence, interfaceC5380e)).invokeSuspend(J.f24997a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0789b(com.ui.core.ui.sso.login.g gVar, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f21498c = gVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                C0789b c0789b = new C0789b(this.f21498c, interfaceC5380e);
                c0789b.f21497b = obj;
                return c0789b;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AbstractC5467b.g();
                if (this.f21496a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
                AbstractC3222i.D(AbstractC3222i.I(AbstractC3222i.G(AbstractC6262b.b(this.f21498c.l0()), AbstractC6262b.b(this.f21498c.k0())), new a(this.f21498c, null)), (N) this.f21497b);
                return J.f24997a;
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                return ((C0789b) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        b(com.ui.core.ui.sso.login.g gVar, N n10, n1 n1Var) {
            this.f21491a = gVar;
            this.f21492b = n10;
            this.f21493c = n1Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(N n10, n1 n1Var, com.ui.core.ui.sso.login.g gVar, InterfaceC6824a it) {
            AbstractC6492s.i(it, "it");
            AbstractC3063k.d(n10, null, null, new a(gVar, null), 3, null);
            if (n1Var != null) {
                n1Var.c();
            }
        }

        public final void b(A9.i UiColumnWithDividers, InterfaceC3540l interfaceC3540l, int i10) throws Resources.NotFoundException {
            AbstractC6492s.i(UiColumnWithDividers, "$this$UiColumnWithDividers");
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1414953730, i10, -1, "com.ui.core.ui.sso.login.UiLoginLayout.<anonymous>.<anonymous>.<anonymous> (UiLoginLayout.kt:134)");
            }
            e.a aVar = androidx.compose.ui.e.f28771b0;
            androidx.compose.ui.e eVarG = M9.i.g(aVar, "sign_in_email");
            String strA = H0.f.a(P9.b.f18459q, interfaceC3540l, 0);
            H.l lVarL0 = this.f21491a.l0();
            Ci.h hVarE = Ci.a.e(g0.j.Username);
            C3471y.a aVar2 = C3471y.f19528b;
            int iC = aVar2.c();
            r.a aVar3 = r.f19498b;
            c0.c(eVarG, strA, null, lVarL0, null, null, false, null, 0, null, null, 0L, hVarE, false, null, new D(0, (Boolean) null, iC, aVar3.d(), (K) null, (Boolean) null, (S0.e) null, 115, (DefaultConstructorMarker) null), null, null, interfaceC3540l, 0, 196992, 225268);
            androidx.compose.ui.e eVarG2 = M9.i.g(aVar, "sign_in_password");
            String strA2 = H0.f.a(P9.b.f18455o, interfaceC3540l, 0);
            H.l lVarK0 = this.f21491a.k0();
            Ci.h hVarE2 = Ci.a.e(g0.j.Password);
            interfaceC3540l.U(-1751487189);
            boolean zL = interfaceC3540l.l(this.f21492b) | interfaceC3540l.T(this.f21491a) | interfaceC3540l.T(this.f21493c);
            final N n10 = this.f21492b;
            final n1 n1Var = this.f21493c;
            final com.ui.core.ui.sso.login.g gVar = this.f21491a;
            Object objF = interfaceC3540l.f();
            if (zL || objF == InterfaceC3540l.f21100a.a()) {
                objF = new H.d() { // from class: T9.k
                    @Override // H.d
                    public final void a(InterfaceC6824a interfaceC6824a) {
                        j.b.c(n10, n1Var, gVar, interfaceC6824a);
                    }
                };
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            X.e(eVarG2, strA2, null, lVarK0, null, false, null, 0, null, hVarE2, false, null, 0, new D(0, (Boolean) null, aVar2.f(), aVar3.b(), (K) null, (Boolean) null, (S0.e) null, 115, (DefaultConstructorMarker) null), (H.d) objF, null, interfaceC3540l, 805306368, 3072, 40436);
            interfaceC3540l.U(-1751472249);
            boolean zT = interfaceC3540l.T(this.f21491a);
            com.ui.core.ui.sso.login.g gVar2 = this.f21491a;
            Object objF2 = interfaceC3540l.f();
            if (zT || objF2 == InterfaceC3540l.f21100a.a()) {
                objF2 = new C0789b(gVar2, null);
                interfaceC3540l.K(objF2);
            }
            interfaceC3540l.J();
            O.f("credentials", (InterfaceC6839p) objF2, interfaceC3540l, 6);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) throws Resources.NotFoundException {
            b((A9.i) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f21501a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.ui.core.ui.sso.login.g f21502b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(com.ui.core.ui.sso.login.g gVar, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f21502b = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new c(this.f21502b, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f21501a;
            if (i10 == 0) {
                v.b(obj);
                com.ui.core.ui.sso.login.g gVar = this.f21502b;
                this.f21501a = 1;
                if (gVar.q0(this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((c) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f21503a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.ui.core.ui.sso.login.g f21504b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(com.ui.core.ui.sso.login.g gVar, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f21504b = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new d(this.f21504b, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f21503a;
            if (i10 == 0) {
                v.b(obj);
                com.ui.core.ui.sso.login.g gVar = this.f21504b;
                this.f21503a = 1;
                if (gVar.r0(this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((d) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f21505a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.ui.core.ui.sso.login.g f21506b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(com.ui.core.ui.sso.login.g gVar, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f21506b = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new e(this.f21506b, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f21505a;
            if (i10 == 0) {
                v.b(obj);
                com.ui.core.ui.sso.login.g gVar = this.f21506b;
                this.f21505a = 1;
                if (gVar.m0(this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((e) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0684  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x06a5  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x06b1  */
    /* JADX WARN: Removed duplicated region for block: B:190:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void h(final com.ui.core.ui.sso.login.g r46, final boolean r47, java.lang.String r48, mh.InterfaceC6824a r49, final boolean r50, T.InterfaceC3540l r51, final int r52, final int r53) {
        /*
            Method dump skipped, instructions count: 1734
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: T9.j.h(com.ui.core.ui.sso.login.g, boolean, java.lang.String, mh.a, boolean, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J i(N n10, com.ui.core.ui.sso.login.g gVar) {
        AbstractC3063k.d(n10, null, null, new a(gVar, null), 3, null);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J j(InterfaceC6824a interfaceC6824a) {
        if (interfaceC6824a != null) {
            interfaceC6824a.invoke();
        }
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J k(N n10, com.ui.core.ui.sso.login.g gVar) {
        AbstractC3063k.d(n10, null, null, new c(gVar, null), 3, null);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J l(n1 n1Var, N n10, com.ui.core.ui.sso.login.g gVar) {
        if (n1Var != null) {
            n1Var.c();
        }
        AbstractC3063k.d(n10, null, null, new d(gVar, null), 3, null);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J m(N n10, com.ui.core.ui.sso.login.g gVar) {
        AbstractC3063k.d(n10, null, null, new e(gVar, null), 3, null);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J n(com.ui.core.ui.sso.login.g gVar, boolean z10, String str, InterfaceC6824a interfaceC6824a, boolean z11, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        h(gVar, z10, str, interfaceC6824a, z11, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }

    private static final void o(InterfaceC3540l interfaceC3540l, final int i10) {
        InterfaceC3540l interfaceC3540l2;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-28023427);
        if (i10 == 0 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-28023427, i10, -1, "com.ui.core.ui.sso.login.UiTextLogo (UiLoginLayout.kt:247)");
            }
            c.b bVarG = f0.c.f46573a.g();
            e.a aVar = androidx.compose.ui.e.f28771b0;
            C cA = AbstractC8685h.a(C8680c.f66832a.g(), bVarG, interfaceC3540lR, 48);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, aVar);
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
            E1.c(interfaceC3540lA, cA, aVar2.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar2.g());
            InterfaceC6839p interfaceC6839pB = aVar2.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar2.f());
            C8688k c8688k = C8688k.f66923a;
            c.a aVar3 = new c.a(P9.a.f18375l, null, 2, null);
            androidx.compose.ui.e eVarD = androidx.compose.foundation.layout.r.d(androidx.compose.foundation.layout.r.k(androidx.compose.foundation.layout.r.H(aVar, null, false, 3, null), 0.0f, Y0.h.j(60), 1, null), 0.0f, 1, null);
            InterfaceC2528h interfaceC2528hC = InterfaceC2528h.f2145a.c();
            AbstractC6735w0.a aVar4 = AbstractC6735w0.f52966b;
            C6562a c6562a = C6562a.f52458a;
            int i11 = C6562a.f52459b;
            AbstractC8049c.e(aVar3, eVarD, null, null, null, null, interfaceC2528hC, 0.0f, AbstractC6735w0.a.b(aVar4, c6562a.a(interfaceC3540lR, i11).a().g().j(), 0, 2, null), interfaceC3540lR, 1572912, 94);
            androidx.compose.ui.e eVarM = o.m(androidx.compose.foundation.layout.r.h(aVar, 0.0f, 1, null), 0.0f, Y0.h.j(24), 0.0f, 0.0f, 13, null);
            int iA2 = W0.j.f23523b.a();
            C3174d c3174dA = AbstractC7930a.a(new d.b(P9.b.f18457p), interfaceC3540lR, 0);
            long j10 = c6562a.a(interfaceC3540lR, i11).a().g().j();
            AbstractC3434k abstractC3434kA = C7273a.f57808a.a();
            interfaceC3540l2 = interfaceC3540lR;
            a1.c(c3174dA, eVarM, j10, 0L, null, null, null, 0L, null, W0.j.h(iA2), 0L, 0, false, 0, 0, null, null, new U(0L, w.g(16), A.f18971b.a(), null, null, abstractC3434kA, null, w.g(0), null, null, null, 0L, null, null, null, 0, 0, w.g(20), null, null, null, 0, 0, null, 16645977, null), interfaceC3540l2, 48, 0, 130552);
            interfaceC3540l2.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: T9.i
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return j.p(i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J p(int i10, InterfaceC3540l interfaceC3540l, int i11) {
        o(interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }
}
