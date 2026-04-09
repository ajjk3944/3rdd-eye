package S6;

import Ii.N;
import Li.AbstractC3222i;
import Li.InterfaceC3220g;
import Li.InterfaceC3221h;
import S6.j;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.InterfaceC3551q0;
import T.L0;
import T.O;
import Yg.J;
import Yg.v;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import z.InterfaceC8683f;

/* loaded from: classes3.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    private static final long f20310a = Y0.b.f24516b.c(0, 0);

    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f20311a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f20312b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3551q0 f20313c;

        /* renamed from: S6.i$a$a, reason: collision with other inner class name */
        static final class C0726a implements InterfaceC3221h {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3551q0 f20314a;

            C0726a(InterfaceC3551q0 interfaceC3551q0) {
                this.f20314a = interfaceC3551q0;
            }

            @Override // Li.InterfaceC3221h
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object a(j jVar, InterfaceC5380e interfaceC5380e) {
                i.d(this.f20314a, jVar);
                return J.f24997a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC6835l interfaceC6835l, InterfaceC3551q0 interfaceC3551q0, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f20312b = interfaceC6835l;
            this.f20313c = interfaceC3551q0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new a(this.f20312b, this.f20313c, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f20311a;
            if (i10 == 0) {
                v.b(obj);
                InterfaceC6835l interfaceC6835l = this.f20312b;
                this.f20311a = 1;
                obj = i.i(interfaceC6835l, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v.b(obj);
                    return J.f24997a;
                }
                v.b(obj);
            }
            C0726a c0726a = new C0726a(this.f20313c);
            this.f20311a = 2;
            if (((InterfaceC3220g) obj).b(c0726a, this) == objG) {
                return objG;
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class b implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f20315a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f20316b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ U6.a f20317c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f20318d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ mh.r f20319e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC3551q0 f20320f;

        static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f20321a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ k f20322b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC8683f f20323c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ U6.a f20324d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k kVar, InterfaceC8683f interfaceC8683f, U6.a aVar, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f20322b = kVar;
                this.f20323c = interfaceC8683f;
                this.f20324d = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return new a(this.f20322b, this.f20323c, this.f20324d, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                long jD;
                AbstractC5467b.g();
                if (this.f20321a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
                k kVar = this.f20322b;
                if (Y0.r.g(kVar.h()) <= 0 || Y0.r.f(kVar.h()) <= 0) {
                    jD = this.f20323c.d();
                } else {
                    long jH = this.f20322b.h();
                    jD = Y0.b.c(this.f20323c.d(), Y0.r.g(jH), Y0.r.g(jH), Y0.r.f(jH), Y0.r.f(jH));
                }
                U6.a aVar = this.f20324d;
                if (aVar != null) {
                    aVar.c(jD);
                }
                return J.f24997a;
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                return ((a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        b(Object obj, k kVar, U6.a aVar, int i10, mh.r rVar, InterfaceC3551q0 interfaceC3551q0) {
            this.f20315a = obj;
            this.f20316b = kVar;
            this.f20317c = aVar;
            this.f20318d = i10;
            this.f20319e = rVar;
            this.f20320f = interfaceC3551q0;
        }

        public final void a(InterfaceC8683f BoxWithConstraints, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(BoxWithConstraints, "$this$BoxWithConstraints");
            if ((i10 & 6) == 0) {
                i10 |= interfaceC3540l.T(BoxWithConstraints) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-906212105, i10, -1, "com.skydoves.landscapist.ImageLoad.<anonymous> (ImageLoad.kt:68)");
            }
            Object obj = this.f20315a;
            k kVar = this.f20316b;
            interfaceC3540l.U(1026798666);
            int i11 = i10 & 14;
            boolean zT = (i11 == 4) | interfaceC3540l.T(this.f20316b) | interfaceC3540l.T(this.f20317c);
            k kVar2 = this.f20316b;
            U6.a aVar = this.f20317c;
            Object objF = interfaceC3540l.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                objF = new a(kVar2, BoxWithConstraints, aVar, null);
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            O.e(obj, kVar, (InterfaceC6839p) objF, interfaceC3540l, this.f20318d & 8);
            this.f20319e.y(BoxWithConstraints, i.c(this.f20320f), interfaceC3540l, Integer.valueOf(i11));
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((InterfaceC8683f) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f20325a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f20326b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f20327c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC6835l interfaceC6835l, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f20327c = interfaceC6835l;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            c cVar = new c(this.f20327c, interfaceC5380e);
            cVar.f20326b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            InterfaceC3221h interfaceC3221h;
            Object objG = AbstractC5467b.g();
            int i10 = this.f20325a;
            if (i10 == 0) {
                v.b(obj);
                interfaceC3221h = (InterfaceC3221h) this.f20326b;
                InterfaceC6835l interfaceC6835l = this.f20327c;
                this.f20326b = interfaceC3221h;
                this.f20325a = 1;
                obj = interfaceC6835l.invoke(this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v.b(obj);
                    return J.f24997a;
                }
                interfaceC3221h = (InterfaceC3221h) this.f20326b;
                v.b(obj);
            }
            this.f20326b = null;
            this.f20325a = 2;
            if (AbstractC3222i.t(interfaceC3221h, (InterfaceC3220g) obj, this) == objG) {
                return objG;
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC3221h interfaceC3221h, InterfaceC5380e interfaceC5380e) {
            return ((c) create(interfaceC3221h, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.l implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        int f20328a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f20329b;

        d(InterfaceC5380e interfaceC5380e) {
            super(3, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f20328a;
            if (i10 == 0) {
                v.b(obj);
                InterfaceC3221h interfaceC3221h = (InterfaceC3221h) this.f20329b;
                j.a aVar = new j.a(null, null);
                this.f20328a = 1;
                if (interfaceC3221h.a(aVar, this) == objG) {
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

        @Override // mh.q
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object s(InterfaceC3221h interfaceC3221h, Throwable th2, InterfaceC5380e interfaceC5380e) {
            d dVar = new d(interfaceC5380e);
            dVar.f20329b = interfaceC3221h;
            return dVar.invokeSuspend(J.f24997a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final java.lang.Object r21, final mh.InterfaceC6835l r22, androidx.compose.ui.e r23, final S6.k r24, U6.a r25, final mh.r r26, T.InterfaceC3540l r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: S6.i.b(java.lang.Object, mh.l, androidx.compose.ui.e, S6.k, U6.a, mh.r, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j c(InterfaceC3551q0 interfaceC3551q0) {
        return (j) interfaceC3551q0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(InterfaceC3551q0 interfaceC3551q0, j jVar) {
        interfaceC3551q0.setValue(jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J e(Object obj, InterfaceC6835l interfaceC6835l, androidx.compose.ui.e eVar, k kVar, U6.a aVar, mh.r rVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        b(obj, interfaceC6835l, eVar, kVar, aVar, rVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object i(InterfaceC6835l interfaceC6835l, InterfaceC5380e interfaceC5380e) {
        return AbstractC3222i.C(AbstractC3222i.n(AbstractC3222i.f(AbstractC3222i.A(new c(interfaceC6835l, null)), new d(null))), W6.a.a());
    }
}
