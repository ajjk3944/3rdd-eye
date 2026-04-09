package aa;

import A.AbstractC2395b;
import A.InterfaceC2396c;
import A.y;
import C0.C;
import C0.D;
import Ii.AbstractC3063k;
import Ii.N;
import L9.AbstractC3198d;
import L9.E;
import L9.w;
import N.C0;
import T.A;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.InterfaceC3551q0;
import T.L0;
import T.O;
import T.X0;
import T.o1;
import Yg.J;
import Yg.v;
import aa.c;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.m;
import androidx.compose.ui.layout.t;
import b0.InterfaceC4038a;
import b1.AbstractC4041C;
import b1.C4048e;
import b1.C4049f;
import b1.C4055l;
import b1.InterfaceC4042D;
import b1.o;
import b1.s;
import b1.z;
import dh.C5385j;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import java.util.List;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import la.C6562a;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import mh.q;
import mh.r;
import sa.AbstractC7930a;
import z.C8680c;

/* loaded from: classes3.dex */
public abstract class c {

    static final class a implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f25778a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ N f25779b;

        /* renamed from: aa.c$a$a, reason: collision with other inner class name */
        static final class C0983a extends l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f25780a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ d f25781b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0983a(d dVar, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f25781b = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return new C0983a(this.f25781b, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f25780a;
                if (i10 == 0) {
                    v.b(obj);
                    d dVar = this.f25781b;
                    this.f25780a = 1;
                    if (dVar.H(this) == objG) {
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
                return ((C0983a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        a(d dVar, N n10) {
            this.f25778a = dVar;
            this.f25779b = n10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J c(N n10, d dVar) {
            AbstractC3063k.d(n10, null, null, new C0983a(dVar, null), 3, null);
            return J.f24997a;
        }

        public final void b(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(806037850, i10, -1, "com.ui.core.ui.sso.mfa.methods.UiMFAMethodPickerLayout.<anonymous> (UiMFAMethodPickerLayout.kt:42)");
            }
            String strB = AbstractC7930a.b((s9.d) o1.b(this.f25778a.P(), null, interfaceC3540l, 0, 1).getValue(), interfaceC3540l, 0);
            float fC = w.f11485a.c();
            AbstractC3198d.a aVar = AbstractC3198d.a.f11402b;
            interfaceC3540l.U(1868227072);
            boolean zL = interfaceC3540l.l(this.f25779b) | interfaceC3540l.T(this.f25778a);
            final N n10 = this.f25779b;
            final d dVar = this.f25778a;
            Object objF = interfaceC3540l.f();
            if (zL || objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6824a() { // from class: aa.b
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return c.a.c(n10, dVar);
                    }
                };
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            E.i(null, strB, aVar, (InterfaceC6824a) objF, null, 0L, 0L, 0L, fC, null, 0.0f, interfaceC3540l, AbstractC3198d.a.f11403c << 6, 0, 1777);
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

    static final class b implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ aa.d f25782a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ N f25783b;

        static final class a implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ float f25784a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ float f25785b;

            a(float f10, float f11) {
                this.f25784a = f10;
                this.f25785b = f11;
            }

            public final void a(C4048e constrainAs) {
                AbstractC6492s.i(constrainAs, "$this$constrainAs");
                InterfaceC4042D.b(constrainAs.h(), constrainAs.g().e(), this.f25784a, 0.0f, 4, null);
                InterfaceC4042D.b(constrainAs.f(), constrainAs.g().d(), this.f25784a, 0.0f, 4, null);
                b1.v.a(constrainAs.i(), constrainAs.g().f(), this.f25785b, 0.0f, 4, null);
                constrainAs.o(s.f32772a.a());
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C4048e) obj);
                return J.f24997a;
            }
        }

        /* renamed from: aa.c$b$b, reason: collision with other inner class name */
        static final class C0984b implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C4049f f25786a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f25787b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C4049f f25788c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C4049f f25789d;

            C0984b(C4049f c4049f, boolean z10, C4049f c4049f2, C4049f c4049f3) {
                this.f25786a = c4049f;
                this.f25787b = z10;
                this.f25788c = c4049f2;
                this.f25789d = c4049f3;
            }

            public final void a(C4048e constrainAs) {
                AbstractC6492s.i(constrainAs, "$this$constrainAs");
                C4048e.b(constrainAs, constrainAs.g(), 0.0f, 2, null);
                b1.v.a(constrainAs.i(), this.f25786a.c(), 0.0f, 0.0f, 6, null);
                if (this.f25787b) {
                    b1.v.a(constrainAs.d(), this.f25788c.f(), 0.0f, 0.0f, 6, null);
                } else {
                    b1.v.a(constrainAs.d(), this.f25789d.f(), 0.0f, 0.0f, 6, null);
                }
                s.b bVar = s.f32772a;
                constrainAs.o(bVar.a());
                constrainAs.n(bVar.a());
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C4048e) obj);
                return J.f24997a;
            }
        }

        /* renamed from: aa.c$b$c, reason: collision with other inner class name */
        static final class C0985c implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f25790a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ N f25791b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ aa.d f25792c;

            /* renamed from: aa.c$b$c$a */
            static final class a implements InterfaceC6835l {

                /* renamed from: a, reason: collision with root package name */
                public static final a f25793a = new a();

                a() {
                }

                @Override // mh.InterfaceC6835l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(Z9.a it) {
                    AbstractC6492s.i(it, "it");
                    return it.b();
                }
            }

            /* renamed from: aa.c$b$c$b, reason: collision with other inner class name */
            static final class C0986b implements InterfaceC6835l {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ N f25794a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ aa.d f25795b;

                /* renamed from: aa.c$b$c$b$a */
                static final class a extends l implements InterfaceC6839p {

                    /* renamed from: a, reason: collision with root package name */
                    int f25796a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ aa.d f25797b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ Z9.a f25798c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    a(aa.d dVar, Z9.a aVar, InterfaceC5380e interfaceC5380e) {
                        super(2, interfaceC5380e);
                        this.f25797b = dVar;
                        this.f25798c = aVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                        return new a(this.f25797b, this.f25798c, interfaceC5380e);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        Object objG = AbstractC5467b.g();
                        int i10 = this.f25796a;
                        if (i10 == 0) {
                            v.b(obj);
                            aa.d dVar = this.f25797b;
                            String strB = this.f25798c.b();
                            this.f25796a = 1;
                            if (dVar.k0(strB, this) == objG) {
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

                C0986b(N n10, aa.d dVar) {
                    this.f25794a = n10;
                    this.f25795b = dVar;
                }

                public final void a(Z9.a it) {
                    AbstractC6492s.i(it, "it");
                    AbstractC3063k.d(this.f25794a, null, null, new a(this.f25795b, it, null), 3, null);
                }

                @Override // mh.InterfaceC6835l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a((Z9.a) obj);
                    return J.f24997a;
                }
            }

            /* renamed from: aa.c$b$c$c, reason: collision with other inner class name */
            public static final class C0987c extends AbstractC6494u implements InterfaceC6835l {

                /* renamed from: a, reason: collision with root package name */
                public static final C0987c f25799a = new C0987c();

                public C0987c() {
                    super(1);
                }

                @Override // mh.InterfaceC6835l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Void invoke(Object obj) {
                    return null;
                }
            }

            /* renamed from: aa.c$b$c$d */
            public static final class d extends AbstractC6494u implements InterfaceC6835l {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC6835l f25800a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ List f25801b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public d(InterfaceC6835l interfaceC6835l, List list) {
                    super(1);
                    this.f25800a = interfaceC6835l;
                    this.f25801b = list;
                }

                public final Object a(int i10) {
                    return this.f25800a.invoke(this.f25801b.get(i10));
                }

                @Override // mh.InterfaceC6835l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return a(((Number) obj).intValue());
                }
            }

            /* renamed from: aa.c$b$c$e */
            public static final class e extends AbstractC6494u implements InterfaceC6835l {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC6835l f25802a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ List f25803b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public e(InterfaceC6835l interfaceC6835l, List list) {
                    super(1);
                    this.f25802a = interfaceC6835l;
                    this.f25803b = list;
                }

                public final Object a(int i10) {
                    return this.f25802a.invoke(this.f25803b.get(i10));
                }

                @Override // mh.InterfaceC6835l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return a(((Number) obj).intValue());
                }
            }

            /* renamed from: aa.c$b$c$f */
            public static final class f extends AbstractC6494u implements r {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ List f25804a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ N f25805b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ aa.d f25806c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public f(List list, N n10, aa.d dVar) {
                    super(4);
                    this.f25804a = list;
                    this.f25805b = n10;
                    this.f25806c = dVar;
                }

                public final void a(InterfaceC2396c interfaceC2396c, int i10, InterfaceC3540l interfaceC3540l, int i11) {
                    int i12;
                    if ((i11 & 6) == 0) {
                        i12 = (interfaceC3540l.T(interfaceC2396c) ? 4 : 2) | i11;
                    } else {
                        i12 = i11;
                    }
                    if ((i11 & 48) == 0) {
                        i12 |= interfaceC3540l.i(i10) ? 32 : 16;
                    }
                    if ((i12 & 147) == 146 && interfaceC3540l.v()) {
                        interfaceC3540l.C();
                        return;
                    }
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.Q(-632812321, i12, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
                    }
                    Z9.a aVar = (Z9.a) this.f25804a.get(i10);
                    interfaceC3540l.U(1900266231);
                    interfaceC3540l.U(1585322518);
                    boolean zL = interfaceC3540l.l(this.f25805b) | interfaceC3540l.T(this.f25806c);
                    Object objF = interfaceC3540l.f();
                    if (zL || objF == InterfaceC3540l.f21100a.a()) {
                        objF = new C0986b(this.f25805b, this.f25806c);
                        interfaceC3540l.K(objF);
                    }
                    interfaceC3540l.J();
                    Z9.e.d(null, false, (InterfaceC6835l) objF, aVar, interfaceC3540l, 0, 3);
                    interfaceC3540l.J();
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.P();
                    }
                }

                @Override // mh.r
                public /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3, Object obj4) {
                    a((InterfaceC2396c) obj, ((Number) obj2).intValue(), (InterfaceC3540l) obj3, ((Number) obj4).intValue());
                    return J.f24997a;
                }
            }

            C0985c(List list, N n10, aa.d dVar) {
                this.f25790a = list;
                this.f25791b = n10;
                this.f25792c = dVar;
            }

            public final void a(y LazyColumn) {
                AbstractC6492s.i(LazyColumn, "$this$LazyColumn");
                List list = this.f25790a;
                a aVar = a.f25793a;
                N n10 = this.f25791b;
                aa.d dVar = this.f25792c;
                LazyColumn.a(list.size(), aVar != null ? new d(aVar, list) : null, new e(C0987c.f25799a, list), b0.c.c(-632812321, true, new f(list, n10, dVar)));
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((y) obj);
                return J.f24997a;
            }
        }

        static final class d implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ float f25807a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C4049f f25808b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ float f25809c;

            d(float f10, C4049f c4049f, float f11) {
                this.f25807a = f10;
                this.f25808b = c4049f;
                this.f25809c = f11;
            }

            public final void a(C4048e constrainAs) {
                AbstractC6492s.i(constrainAs, "$this$constrainAs");
                InterfaceC4042D.b(constrainAs.h(), constrainAs.g().e(), this.f25807a, 0.0f, 4, null);
                InterfaceC4042D.b(constrainAs.f(), constrainAs.g().d(), this.f25807a, 0.0f, 4, null);
                b1.v.a(constrainAs.d(), this.f25808b.f(), this.f25809c, 0.0f, 4, null);
                constrainAs.o(s.f32772a.a());
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C4048e) obj);
                return J.f24997a;
            }
        }

        static final class e implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ N f25810a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ aa.d f25811b;

            static final class a extends l implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                int f25812a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ aa.d f25813b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(aa.d dVar, InterfaceC5380e interfaceC5380e) {
                    super(2, interfaceC5380e);
                    this.f25813b = dVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                    return new a(this.f25813b, interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objG = AbstractC5467b.g();
                    int i10 = this.f25812a;
                    if (i10 == 0) {
                        v.b(obj);
                        aa.d dVar = this.f25813b;
                        this.f25812a = 1;
                        if (dVar.l0(this) == objG) {
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

            e(N n10, aa.d dVar) {
                this.f25810a = n10;
                this.f25811b = dVar;
            }

            public final void a() {
                AbstractC3063k.d(this.f25810a, null, null, new a(this.f25811b, null), 3, null);
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return J.f24997a;
            }
        }

        static final class f implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ float f25814a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ float f25815b;

            f(float f10, float f11) {
                this.f25814a = f10;
                this.f25815b = f11;
            }

            public final void a(C4048e constrainAs) {
                AbstractC6492s.i(constrainAs, "$this$constrainAs");
                InterfaceC4042D.b(constrainAs.h(), constrainAs.g().e(), this.f25814a, 0.0f, 4, null);
                InterfaceC4042D.b(constrainAs.f(), constrainAs.g().d(), this.f25814a, 0.0f, 4, null);
                b1.v.a(constrainAs.d(), constrainAs.g().c(), this.f25815b, 0.0f, 4, null);
                constrainAs.o(s.f32772a.a());
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C4048e) obj);
                return J.f24997a;
            }
        }

        static final class g implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ N f25816a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ aa.d f25817b;

            static final class a extends l implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                int f25818a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ aa.d f25819b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(aa.d dVar, InterfaceC5380e interfaceC5380e) {
                    super(2, interfaceC5380e);
                    this.f25819b = dVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                    return new a(this.f25819b, interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objG = AbstractC5467b.g();
                    int i10 = this.f25818a;
                    if (i10 == 0) {
                        v.b(obj);
                        aa.d dVar = this.f25819b;
                        this.f25818a = 1;
                        if (dVar.j0(this) == objG) {
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

            g(N n10, aa.d dVar) {
                this.f25816a = n10;
                this.f25817b = dVar;
            }

            public final void a() {
                AbstractC3063k.d(this.f25816a, null, null, new a(this.f25817b, null), 3, null);
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return J.f24997a;
            }
        }

        public static final class h implements C {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3551q0 f25820a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ z f25821b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ o f25822c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f25823d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC3551q0 f25824e;

            static final class a extends AbstractC6494u implements InterfaceC6835l {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ z f25825a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ List f25826b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(z zVar, List list) {
                    super(1);
                    this.f25825a = zVar;
                    this.f25826b = list;
                }

                public final void a(t.a aVar) {
                    this.f25825a.h(aVar, this.f25826b);
                }

                @Override // mh.InterfaceC6835l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a((t.a) obj);
                    return J.f24997a;
                }
            }

            public h(InterfaceC3551q0 interfaceC3551q0, z zVar, o oVar, int i10, InterfaceC3551q0 interfaceC3551q02) {
                this.f25820a = interfaceC3551q0;
                this.f25821b = zVar;
                this.f25822c = oVar;
                this.f25823d = i10;
                this.f25824e = interfaceC3551q02;
            }

            @Override // C0.C
            public final D b(m mVar, List list, long j10) {
                this.f25820a.getValue();
                long jI = this.f25821b.i(j10, mVar.getLayoutDirection(), this.f25822c, list, this.f25823d);
                this.f25824e.getValue();
                return m.x0(mVar, Y0.r.g(jI), Y0.r.f(jI), null, new a(this.f25821b, list), 4, null);
            }
        }

        static final class i extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3551q0 f25827a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ o f25828b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public i(InterfaceC3551q0 interfaceC3551q0, o oVar) {
                super(0);
                this.f25827a = interfaceC3551q0;
                this.f25828b = oVar;
            }

            public final void a() {
                this.f25827a.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                this.f25828b.j(true);
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return J.f24997a;
            }
        }

        static final class j extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ z f25829a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public j(z zVar) {
                super(1);
                this.f25829a = zVar;
            }

            public final void a(J0.w wVar) {
                AbstractC4041C.a(wVar, this.f25829a);
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((J0.w) obj);
                return J.f24997a;
            }
        }

        public static final class k extends AbstractC6494u implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3551q0 f25830a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C4055l f25831b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC6824a f25832c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ aa.d f25833d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ N f25834e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public k(InterfaceC3551q0 interfaceC3551q0, C4055l c4055l, InterfaceC6824a interfaceC6824a, aa.d dVar, N n10) {
                super(2);
                this.f25830a = interfaceC3551q0;
                this.f25831b = c4055l;
                this.f25832c = interfaceC6824a;
                this.f25833d = dVar;
                this.f25834e = n10;
            }

            public final void a(InterfaceC3540l interfaceC3540l, int i10) {
                float f10;
                e.a aVar;
                C4055l c4055l;
                C4049f c4049f;
                if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(1200550679, i10, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:454)");
                }
                this.f25830a.setValue(J.f24997a);
                int iE = this.f25831b.e();
                this.f25831b.f();
                C4055l c4055l2 = this.f25831b;
                interfaceC3540l.U(-1575219129);
                C4055l.b bVarJ = c4055l2.j();
                C4049f c4049fA = bVarJ.a();
                C4049f c4049fB = bVarJ.b();
                C4049f c4049fC = bVarJ.c();
                C4049f c4049fD = bVarJ.d();
                C6562a c6562a = C6562a.f52458a;
                int i11 = C6562a.f52459b;
                float fC = c6562a.d(interfaceC3540l, i11).a().a().c();
                float fD = c6562a.d(interfaceC3540l, i11).a().b().d();
                float fA = c6562a.d(interfaceC3540l, i11).a().a().a(Y0.h.j(32));
                e.a aVar2 = androidx.compose.ui.e.f28771b0;
                interfaceC3540l.U(364838942);
                boolean zG = interfaceC3540l.g(fC) | interfaceC3540l.g(fD);
                Object objF = interfaceC3540l.f();
                if (zG || objF == InterfaceC3540l.f21100a.a()) {
                    objF = new a(fC, fD);
                    interfaceC3540l.K(objF);
                }
                interfaceC3540l.J();
                Z9.k.c(AbstractC7930a.a((s9.d) o1.b(this.f25833d.L(), null, interfaceC3540l, 0, 1).getValue(), interfaceC3540l, 0).toString(), c4055l2.h(aVar2, c4049fA, (InterfaceC6835l) objF), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, interfaceC3540l, 0, 0, 65532);
                boolean zBooleanValue = ((Boolean) o1.b(this.f25833d.g0(), null, interfaceC3540l, 0, 1).getValue()).booleanValue();
                List list = (List) o1.b(this.f25833d.i0(), null, interfaceC3540l, 0, 1).getValue();
                interfaceC3540l.U(364857723);
                boolean zT = interfaceC3540l.T(c4049fA) | interfaceC3540l.c(zBooleanValue) | interfaceC3540l.T(c4049fC) | interfaceC3540l.T(c4049fD);
                Object objF2 = interfaceC3540l.f();
                if (zT || objF2 == InterfaceC3540l.f21100a.a()) {
                    objF2 = new C0984b(c4049fA, zBooleanValue, c4049fC, c4049fD);
                    interfaceC3540l.K(objF2);
                }
                interfaceC3540l.J();
                androidx.compose.ui.e eVarH = c4055l2.h(aVar2, c4049fB, (InterfaceC6835l) objF2);
                z.N nB = androidx.compose.foundation.layout.o.b(fC, fD);
                C8680c.f fVarN = C8680c.f66832a.n(Y0.h.j(16));
                interfaceC3540l.U(364878845);
                boolean zL = interfaceC3540l.l(list) | interfaceC3540l.l(this.f25834e) | interfaceC3540l.T(this.f25833d);
                Object objF3 = interfaceC3540l.f();
                if (zL || objF3 == InterfaceC3540l.f21100a.a()) {
                    objF3 = new C0985c(list, this.f25834e, this.f25833d);
                    interfaceC3540l.K(objF3);
                }
                interfaceC3540l.J();
                AbstractC2395b.a(eVarH, null, nB, false, fVarN, null, null, false, (InterfaceC6835l) objF3, interfaceC3540l, 24576, 234);
                interfaceC3540l.U(364894281);
                if (zBooleanValue) {
                    interfaceC3540l.U(364898440);
                    f10 = fA;
                    c4049f = c4049fD;
                    boolean zG2 = interfaceC3540l.g(f10) | interfaceC3540l.T(c4049f) | interfaceC3540l.g(fD);
                    Object objF4 = interfaceC3540l.f();
                    if (zG2 || objF4 == InterfaceC3540l.f21100a.a()) {
                        objF4 = new d(f10, c4049f, fD);
                        interfaceC3540l.K(objF4);
                    }
                    interfaceC3540l.J();
                    c4055l = c4055l2;
                    androidx.compose.ui.e eVarH2 = c4055l.h(aVar2, c4049fC, (InterfaceC6835l) objF4);
                    String strB = AbstractC7930a.b((s9.d) o1.b(this.f25833d.h0(), null, interfaceC3540l, 0, 1).getValue(), interfaceC3540l, 0);
                    interfaceC3540l.U(364912074);
                    boolean zL2 = interfaceC3540l.l(this.f25834e) | interfaceC3540l.T(this.f25833d);
                    Object objF5 = interfaceC3540l.f();
                    if (zL2 || objF5 == InterfaceC3540l.f21100a.a()) {
                        objF5 = new e(this.f25834e, this.f25833d);
                        interfaceC3540l.K(objF5);
                    }
                    interfaceC3540l.J();
                    aVar = aVar2;
                    w9.o.c(eVarH2, (InterfaceC6824a) objF5, false, false, null, strB, interfaceC3540l, 0, 28);
                } else {
                    f10 = fA;
                    aVar = aVar2;
                    c4055l = c4055l2;
                    c4049f = c4049fD;
                }
                interfaceC3540l.J();
                interfaceC3540l.U(364922084);
                boolean zG3 = interfaceC3540l.g(f10) | interfaceC3540l.g(fD);
                Object objF6 = interfaceC3540l.f();
                if (zG3 || objF6 == InterfaceC3540l.f21100a.a()) {
                    objF6 = new f(f10, fD);
                    interfaceC3540l.K(objF6);
                }
                interfaceC3540l.J();
                androidx.compose.ui.e eVarH3 = c4055l.h(aVar, c4049f, (InterfaceC6835l) objF6);
                String strB2 = AbstractC7930a.b((s9.d) o1.b(this.f25833d.f0(), null, interfaceC3540l, 0, 1).getValue(), interfaceC3540l, 0);
                boolean zBooleanValue2 = ((Boolean) o1.b(this.f25833d.e0(), null, interfaceC3540l, 0, 1).getValue()).booleanValue();
                interfaceC3540l.U(364936900);
                boolean zL3 = interfaceC3540l.l(this.f25834e) | interfaceC3540l.T(this.f25833d);
                Object objF7 = interfaceC3540l.f();
                if (zL3 || objF7 == InterfaceC3540l.f21100a.a()) {
                    objF7 = new g(this.f25834e, this.f25833d);
                    interfaceC3540l.K(objF7);
                }
                interfaceC3540l.J();
                w9.o.c(eVarH3, (InterfaceC6824a) objF7, zBooleanValue2, false, null, strB2, interfaceC3540l, 0, 24);
                interfaceC3540l.J();
                if (this.f25831b.e() != iE) {
                    O.g(this.f25832c, interfaceC3540l, 6);
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

        b(aa.d dVar, N n10) {
            this.f25782a = dVar;
            this.f25783b = n10;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v3 ??, still in use, count: 1, list:
              (r11v3 ?? I:java.lang.Object) from 0x0103: INVOKE (r22v0 ?? I:T.l), (r11v3 ?? I:java.lang.Object) INTERFACE call: T.l.K(java.lang.Object):void A[MD:(java.lang.Object):void (m)]
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
            	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
            	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
            	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
            */
        public final void a(
        /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v3 ??, still in use, count: 1, list:
              (r11v3 ?? I:java.lang.Object) from 0x0103: INVOKE (r22v0 ?? I:T.l), (r11v3 ?? I:java.lang.Object) INTERFACE call: T.l.K(java.lang.Object):void A[MD:(java.lang.Object):void (m)]
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
            	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
            	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
            */
        /*  JADX ERROR: Method generation error
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r21v0 ??
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
            	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
            	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
            	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:310)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
            	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
            	at jadx.core.ProcessClass.process(ProcessClass.java:79)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:403)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:391)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:341)
            */

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((z.N) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    public static final void b(final d vm, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540l2;
        AbstractC6492s.i(vm, "vm");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1047872597);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(vm) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1047872597, i11, -1, "com.ui.core.ui.sso.mfa.methods.UiMFAMethodPickerLayout (UiMFAMethodPickerLayout.kt:37)");
            }
            Object objF = interfaceC3540lR.f();
            if (objF == InterfaceC3540l.f21100a.a()) {
                A a10 = new A(O.i(C5385j.f46088a, interfaceC3540lR));
                interfaceC3540lR.K(a10);
                objF = a10;
            }
            N nA = ((A) objF).a();
            InterfaceC4038a interfaceC4038aE = b0.c.e(806037850, true, new a(vm, nA), interfaceC3540lR, 54);
            long jA = C6562a.f52458a.a(interfaceC3540lR, C6562a.f52459b).e().a();
            InterfaceC4038a interfaceC4038aE2 = b0.c.e(458624659, true, new b(vm, nA), interfaceC3540lR, 54);
            interfaceC3540l2 = interfaceC3540lR;
            C0.a(null, null, interfaceC4038aE, null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, jA, 0L, interfaceC4038aE2, interfaceC3540l2, 384, 12582912, 98299);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: aa.a
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return c.c(vm, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J c(d dVar, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        b(dVar, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }
}
