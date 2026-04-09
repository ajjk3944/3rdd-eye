package kf;

import Be.C2459b0;
import L9.AbstractC3198d;
import L9.E;
import L9.L;
import L9.z;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.o1;
import T.z1;
import Yg.J;
import android.content.res.Resources;
import androidx.compose.foundation.layout.r;
import kf.AbstractC6459a;
import kf.o;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import m8.AbstractC6780c;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import mh.q;
import q.AbstractC7391j;
import s9.d;
import xe.AbstractC8460B;
import xe.InterfaceC8511f;
import z.N;
import z.Y;
import z.j0;

/* loaded from: classes4.dex */
public abstract class o {

    static final class a implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ z1 f51451a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC6460b f51452b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC6459a f51453c;

        /* renamed from: kf.o$a$a, reason: collision with other inner class name */
        static final class C1911a implements q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AbstractC6460b f51454a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ z1 f51455b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AbstractC6459a f51456c;

            /* renamed from: kf.o$a$a$a, reason: collision with other inner class name */
            static final class C1912a implements q {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ AbstractC6460b f51457a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC8511f.b f51458b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ AbstractC6459a f51459c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ z1 f51460d;

                /* renamed from: kf.o$a$a$a$a, reason: collision with other inner class name */
                /* synthetic */ class C1913a extends C6490p implements InterfaceC6824a {
                    C1913a(Object obj) {
                        super(0, obj, AbstractC6460b.class, "onEditDoneClicked", "onEditDoneClicked()V", 0);
                    }

                    public final void a() {
                        ((AbstractC6460b) this.receiver).r0();
                    }

                    @Override // mh.InterfaceC6824a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        a();
                        return J.f24997a;
                    }
                }

                /* renamed from: kf.o$a$a$a$b */
                static final class b implements q {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ AbstractC6460b f51461a;

                    /* renamed from: kf.o$a$a$a$b$a, reason: collision with other inner class name */
                    static final class C1914a implements q {

                        /* renamed from: a, reason: collision with root package name */
                        final /* synthetic */ AbstractC6460b f51462a;

                        /* renamed from: kf.o$a$a$a$b$a$a, reason: collision with other inner class name */
                        /* synthetic */ class C1915a extends C6490p implements InterfaceC6824a {
                            C1915a(Object obj) {
                                super(0, obj, AbstractC6460b.class, "onEditDoneClicked", "onEditDoneClicked()V", 0);
                            }

                            public final void a() {
                                ((AbstractC6460b) this.receiver).r0();
                            }

                            @Override // mh.InterfaceC6824a
                            public /* bridge */ /* synthetic */ Object invoke() {
                                a();
                                return J.f24997a;
                            }
                        }

                        C1914a(AbstractC6460b abstractC6460b) {
                            this.f51462a = abstractC6460b;
                        }

                        public final void a(Y UiToolbarSideContainer, InterfaceC3540l interfaceC3540l, int i10) {
                            AbstractC6492s.i(UiToolbarSideContainer, "$this$UiToolbarSideContainer");
                            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                                interfaceC3540l.C();
                                return;
                            }
                            if (AbstractC3546o.H()) {
                                AbstractC3546o.Q(94906946, i10, -1, "com.ui.wifiman.ui.speedtest.results.SpeedtestResultsUi.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SpeedtestResultsUi.kt:68)");
                            }
                            d.b bVar = new d.b(AbstractC6780c.f53468d);
                            AbstractC6460b abstractC6460b = this.f51462a;
                            interfaceC3540l.U(-1721611502);
                            boolean zT = interfaceC3540l.T(abstractC6460b);
                            Object objF = interfaceC3540l.f();
                            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                                objF = new C1915a(abstractC6460b);
                                interfaceC3540l.K(objF);
                            }
                            interfaceC3540l.J();
                            He.i.c(null, (InterfaceC6824a) ((th.g) objF), false, bVar, interfaceC3540l, 0, 5);
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

                    b(AbstractC6460b abstractC6460b) {
                        this.f51461a = abstractC6460b;
                    }

                    public final void a(Y UiToolbar, InterfaceC3540l interfaceC3540l, int i10) {
                        AbstractC6492s.i(UiToolbar, "$this$UiToolbar");
                        if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                            interfaceC3540l.C();
                            return;
                        }
                        if (AbstractC3546o.H()) {
                            AbstractC3546o.Q(1135934971, i10, -1, "com.ui.wifiman.ui.speedtest.results.SpeedtestResultsUi.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SpeedtestResultsUi.kt:67)");
                        }
                        L.b(null, b0.c.e(94906946, true, new C1914a(this.f51461a), interfaceC3540l, 54), interfaceC3540l, 48, 1);
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

                /* renamed from: kf.o$a$a$a$c */
                static final class c implements q {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ AbstractC6459a f51463a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ z1 f51464b;

                    /* renamed from: kf.o$a$a$a$c$a, reason: collision with other inner class name */
                    static final class C1916a implements q {

                        /* renamed from: a, reason: collision with root package name */
                        final /* synthetic */ z1 f51465a;

                        C1916a(z1 z1Var) {
                            this.f51465a = z1Var;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final J c(z1 z1Var) {
                            o.d(z1Var).e();
                            return J.f24997a;
                        }

                        public final void b(Y UiToolbarSideContainer, InterfaceC3540l interfaceC3540l, int i10) {
                            AbstractC6492s.i(UiToolbarSideContainer, "$this$UiToolbarSideContainer");
                            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                                interfaceC3540l.C();
                                return;
                            }
                            if (AbstractC3546o.H()) {
                                AbstractC3546o.Q(50476702, i10, -1, "com.ui.wifiman.ui.speedtest.results.SpeedtestResultsUi.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SpeedtestResultsUi.kt:86)");
                            }
                            s9.b bVarH = N9.b.f16117a.H();
                            interfaceC3540l.U(-1721577637);
                            boolean zT = interfaceC3540l.T(this.f51465a);
                            final z1 z1Var = this.f51465a;
                            Object objF = interfaceC3540l.f();
                            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                                objF = new InterfaceC6824a() { // from class: kf.p
                                    @Override // mh.InterfaceC6824a
                                    public final Object invoke() {
                                        return o.a.C1911a.C1912a.c.C1916a.c(z1Var);
                                    }
                                };
                                interfaceC3540l.K(objF);
                            }
                            interfaceC3540l.J();
                            z.c(bVarH, null, 0L, false, (InterfaceC6824a) objF, interfaceC3540l, 0, 14);
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

                    c(AbstractC6459a abstractC6459a, z1 z1Var) {
                        this.f51463a = abstractC6459a;
                        this.f51464b = z1Var;
                    }

                    public final void a(Y UiToolbar, InterfaceC3540l interfaceC3540l, int i10) {
                        AbstractC6492s.i(UiToolbar, "$this$UiToolbar");
                        if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                            interfaceC3540l.C();
                            return;
                        }
                        if (AbstractC3546o.H()) {
                            AbstractC3546o.Q(-1306794478, i10, -1, "com.ui.wifiman.ui.speedtest.results.SpeedtestResultsUi.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SpeedtestResultsUi.kt:84)");
                        }
                        if (!AbstractC6492s.d(this.f51463a, AbstractC6459a.c.f51426a)) {
                            L.b(null, b0.c.e(50476702, true, new C1916a(this.f51464b), interfaceC3540l, 54), interfaceC3540l, 48, 1);
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

                C1912a(AbstractC6460b abstractC6460b, InterfaceC8511f.b bVar, AbstractC6459a abstractC6459a, z1 z1Var) {
                    this.f51457a = abstractC6460b;
                    this.f51458b = bVar;
                    this.f51459c = abstractC6459a;
                    this.f51460d = z1Var;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final J c(InterfaceC8511f.b bVar) {
                    bVar.a();
                    return J.f24997a;
                }

                public final void b(boolean z10, InterfaceC3540l interfaceC3540l, int i10) throws Resources.NotFoundException {
                    int i11;
                    if ((i10 & 6) == 0) {
                        i11 = i10 | (interfaceC3540l.c(z10) ? 4 : 2);
                    } else {
                        i11 = i10;
                    }
                    if ((i11 & 19) == 18 && interfaceC3540l.v()) {
                        interfaceC3540l.C();
                        return;
                    }
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.Q(-292746202, i11, -1, "com.ui.wifiman.ui.speedtest.results.SpeedtestResultsUi.<anonymous>.<anonymous>.<anonymous> (SpeedtestResultsUi.kt:58)");
                    }
                    if (z10) {
                        interfaceC3540l.U(-142751860);
                        androidx.compose.ui.e eVarC = j0.c(r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null));
                        AbstractC3198d.b bVar = AbstractC3198d.b.f11404b;
                        AbstractC6460b abstractC6460b = this.f51457a;
                        interfaceC3540l.U(826688724);
                        boolean zT = interfaceC3540l.T(abstractC6460b);
                        Object objF = interfaceC3540l.f();
                        if (zT || objF == InterfaceC3540l.f21100a.a()) {
                            objF = new C1913a(abstractC6460b);
                            interfaceC3540l.K(objF);
                        }
                        interfaceC3540l.J();
                        E.i(eVarC, H0.f.a(AbstractC6780c.f53619y3, interfaceC3540l, 0), bVar, (InterfaceC6824a) ((th.g) objF), b0.c.e(1135934971, true, new b(this.f51457a), interfaceC3540l, 54), 0L, 0L, 0L, 0.0f, null, 0.0f, interfaceC3540l, (AbstractC3198d.b.f11405c << 6) | 24576, 0, 2016);
                        interfaceC3540l.J();
                    } else {
                        interfaceC3540l.U(-141797680);
                        androidx.compose.ui.e eVarC2 = j0.c(r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null));
                        AbstractC3198d.a aVar = AbstractC3198d.a.f11402b;
                        String strA = H0.f.a(AbstractC6780c.f53619y3, interfaceC3540l, 0);
                        interfaceC3540l.U(826719327);
                        boolean zT2 = interfaceC3540l.T(this.f51458b);
                        final InterfaceC8511f.b bVar2 = this.f51458b;
                        Object objF2 = interfaceC3540l.f();
                        if (zT2 || objF2 == InterfaceC3540l.f21100a.a()) {
                            objF2 = new InterfaceC6824a() { // from class: kf.n
                                @Override // mh.InterfaceC6824a
                                public final Object invoke() {
                                    return o.a.C1911a.C1912a.c(bVar2);
                                }
                            };
                            interfaceC3540l.K(objF2);
                        }
                        interfaceC3540l.J();
                        E.i(eVarC2, strA, aVar, (InterfaceC6824a) objF2, b0.c.e(-1306794478, true, new c(this.f51459c, this.f51460d), interfaceC3540l, 54), 0L, 0L, 0L, 0.0f, null, 0.0f, interfaceC3540l, (AbstractC3198d.a.f11403c << 6) | 24576, 0, 2016);
                        interfaceC3540l.J();
                    }
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.P();
                    }
                }

                @Override // mh.q
                public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) throws Resources.NotFoundException {
                    b(((Boolean) obj).booleanValue(), (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                    return J.f24997a;
                }
            }

            C1911a(AbstractC6460b abstractC6460b, z1 z1Var, AbstractC6459a abstractC6459a) {
                this.f51454a = abstractC6460b;
                this.f51455b = z1Var;
                this.f51456c = abstractC6459a;
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
                    AbstractC3546o.Q(-89540567, i10, -1, "com.ui.wifiman.ui.speedtest.results.SpeedtestResultsUi.<anonymous>.<anonymous> (SpeedtestResultsUi.kt:44)");
                }
                if (z10) {
                    interfaceC3540l.U(-1779925126);
                    He.f.b(j0.c(r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null)), o.d(this.f51455b), new d.b(AbstractC6780c.f53612x3), interfaceC3540l, 0);
                    interfaceC3540l.J();
                } else {
                    interfaceC3540l.U(-1779467380);
                    AbstractC7391j.a(o1.b(this.f51454a.p0(), null, interfaceC3540l, 0, 1).getValue(), null, null, "SpeedtestResultsLocation", b0.c.e(-292746202, true, new C1912a(this.f51454a, (InterfaceC8511f.b) interfaceC3540l.t(AbstractC8460B.K()), this.f51456c, this.f51455b), interfaceC3540l, 54), interfaceC3540l, 27648, 6);
                    interfaceC3540l.J();
                }
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

        a(z1 z1Var, AbstractC6460b abstractC6460b, AbstractC6459a abstractC6459a) {
            this.f51451a = z1Var;
            this.f51452b = abstractC6460b;
            this.f51453c = abstractC6459a;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1325973704, i10, -1, "com.ui.wifiman.ui.speedtest.results.SpeedtestResultsUi.<anonymous> (SpeedtestResultsUi.kt:40)");
            }
            AbstractC7391j.a(o.d(this.f51451a).c().getValue(), null, null, "SpeedtestResultsUi", b0.c.e(-89540567, true, new C1911a(this.f51452b, this.f51451a, this.f51453c), interfaceC3540l, 54), interfaceC3540l, 27648, 6);
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

    static final class b implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC6459a f51466a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC6460b f51467b;

        static final class a implements q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AbstractC6460b f51468a;

            a(AbstractC6460b abstractC6460b) {
                this.f51468a = abstractC6460b;
            }

            public final void a(AbstractC6459a cnt, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(cnt, "cnt");
                if ((i10 & 6) == 0) {
                    i10 |= interfaceC3540l.T(cnt) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-1467244603, i10, -1, "com.ui.wifiman.ui.speedtest.results.SpeedtestResultsUi.<anonymous>.<anonymous> (SpeedtestResultsUi.kt:107)");
                }
                if (cnt instanceof AbstractC6459a.c) {
                    interfaceC3540l.U(-472957349);
                    k.b(null, interfaceC3540l, 0, 1);
                    interfaceC3540l.J();
                } else if (cnt instanceof AbstractC6459a.b) {
                    interfaceC3540l.U(-472954581);
                    i.b(null, (AbstractC6459a.b) cnt, interfaceC3540l, 0, 1);
                    interfaceC3540l.J();
                } else {
                    if (!(cnt instanceof AbstractC6459a.C1908a)) {
                        interfaceC3540l.U(-472959340);
                        interfaceC3540l.J();
                        throw new NoWhenBranchMatchedException();
                    }
                    interfaceC3540l.U(-472950302);
                    f.b(null, this.f51468a, interfaceC3540l, 0, 1);
                    interfaceC3540l.J();
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                a((AbstractC6459a) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                return J.f24997a;
            }
        }

        b(AbstractC6459a abstractC6459a, AbstractC6460b abstractC6460b) {
            this.f51466a = abstractC6459a;
            this.f51467b = abstractC6460b;
        }

        public final void a(N scaffoldPadding, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(scaffoldPadding, "scaffoldPadding");
            if ((i10 & 6) == 0) {
                i10 |= interfaceC3540l.T(scaffoldPadding) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(741659375, i10, -1, "com.ui.wifiman.ui.speedtest.results.SpeedtestResultsUi.<anonymous> (SpeedtestResultsUi.kt:100)");
            }
            AbstractC7391j.a(this.f51466a, androidx.compose.foundation.layout.o.h(r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), scaffoldPadding), null, "SpeedtestResultsContent", b0.c.e(-1467244603, true, new a(this.f51467b), interfaceC3540l, 54), interfaceC3540l, 27648, 4);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((N) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    /* synthetic */ class c extends C6490p implements InterfaceC6835l {
        c(Object obj) {
            super(1, obj, AbstractC6460b.class, "onSearchQueryChanged", "onSearchQueryChanged(Ljava/lang/String;)V", 0);
        }

        public final void a(String p02) {
            AbstractC6492s.i(p02, "p0");
            ((AbstractC6460b) this.receiver).u0(p02);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((String) obj);
            return J.f24997a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0210  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(androidx.compose.ui.e r32, kf.AbstractC6460b r33, T.InterfaceC3540l r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.o.c(androidx.compose.ui.e, kf.b, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2459b0 d(z1 z1Var) {
        return (C2459b0) z1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J e(z1 z1Var) {
        d(z1Var).d();
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J f(androidx.compose.ui.e eVar, AbstractC6460b abstractC6460b, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        c(eVar, abstractC6460b, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }
}
