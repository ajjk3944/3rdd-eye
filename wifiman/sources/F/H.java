package F;

import Ii.AbstractC3063k;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.jvm.internal.AbstractC6494u;
import l0.C6531g;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import y0.C8604y;
import y0.InterfaceC8567G;
import y0.InterfaceC8581b;

/* loaded from: classes.dex */
public abstract class H {

    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f4870a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f4871b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC8567G f4872c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ U f4873d;

        /* renamed from: F.H$a$a, reason: collision with other inner class name */
        static final class C0204a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f4874a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC8567G f4875b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ U f4876c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0204a(InterfaceC8567G interfaceC8567G, U u10, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f4875b = interfaceC8567G;
                this.f4876c = u10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return new C0204a(this.f4875b, this.f4876c, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f4874a;
                if (i10 == 0) {
                    Yg.v.b(obj);
                    InterfaceC8567G interfaceC8567G = this.f4875b;
                    U u10 = this.f4876c;
                    this.f4874a = 1;
                    if (H.e(interfaceC8567G, u10, this) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Yg.v.b(obj);
                }
                return Yg.J.f24997a;
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
                return ((C0204a) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
            }
        }

        static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f4877a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC8567G f4878b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ U f4879c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(InterfaceC8567G interfaceC8567G, U u10, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f4878b = interfaceC8567G;
                this.f4879c = u10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return new b(this.f4878b, this.f4879c, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f4877a;
                if (i10 == 0) {
                    Yg.v.b(obj);
                    InterfaceC8567G interfaceC8567G = this.f4878b;
                    U u10 = this.f4879c;
                    this.f4877a = 1;
                    if (H.d(interfaceC8567G, u10, this) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Yg.v.b(obj);
                }
                return Yg.J.f24997a;
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
                return ((b) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC8567G interfaceC8567G, U u10, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f4872c = interfaceC8567G;
            this.f4873d = u10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            a aVar = new a(this.f4872c, this.f4873d, interfaceC5380e);
            aVar.f4871b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            if (this.f4870a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Yg.v.b(obj);
            Ii.N n10 = (Ii.N) this.f4871b;
            Ii.P p10 = Ii.P.UNDISPATCHED;
            AbstractC3063k.d(n10, null, p10, new C0204a(this.f4872c, this.f4873d, null), 1, null);
            return AbstractC3063k.d(n10, null, p10, new b(this.f4872c, this.f4873d, null), 1, null);
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
            return ((a) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ U f4880a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(U u10) {
            super(1);
            this.f4880a = u10;
        }

        public final void a(long j10) {
            this.f4880a.c(j10);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((C6531g) obj).v());
            return Yg.J.f24997a;
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ U f4881a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(U u10) {
            super(0);
            this.f4881a = u10;
        }

        public final void a() {
            this.f4881a.a();
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Yg.J.f24997a;
        }
    }

    static final class d extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ U f4882a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(U u10) {
            super(0);
            this.f4882a = u10;
        }

        public final void a() {
            this.f4882a.onCancel();
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Yg.J.f24997a;
        }
    }

    static final class e extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ U f4883a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(U u10) {
            super(2);
            this.f4883a = u10;
        }

        public final void a(C8604y c8604y, long j10) {
            this.f4883a.e(j10);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C8604y) obj, ((C6531g) obj2).v());
            return Yg.J.f24997a;
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.k implements InterfaceC6839p {

        /* renamed from: b, reason: collision with root package name */
        Object f4884b;

        /* renamed from: c, reason: collision with root package name */
        int f4885c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f4886d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ U f4887e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(U u10, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f4887e = u10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            f fVar = new f(this.f4887e, interfaceC5380e);
            fVar.f4886d = obj;
            return fVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x005d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x005b -> B:17:0x005e). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = eh.AbstractC5467b.g()
                int r1 = r12.f4885c
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2a
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                java.lang.Object r1 = r12.f4884b
                y0.y r1 = (y0.C8604y) r1
                java.lang.Object r4 = r12.f4886d
                y0.b r4 = (y0.InterfaceC8581b) r4
                Yg.v.b(r13)
                goto L5e
            L1a:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L22:
                java.lang.Object r1 = r12.f4886d
                y0.b r1 = (y0.InterfaceC8581b) r1
                Yg.v.b(r13)
                goto L43
            L2a:
                Yg.v.b(r13)
                java.lang.Object r13 = r12.f4886d
                r1 = r13
                y0.b r1 = (y0.InterfaceC8581b) r1
                r12.f4886d = r1
                r12.f4885c = r3
                r5 = 0
                r6 = 0
                r8 = 2
                r9 = 0
                r4 = r1
                r7 = r12
                java.lang.Object r13 = w.AbstractC8235B.f(r4, r5, r6, r7, r8, r9)
                if (r13 != r0) goto L43
                return r0
            L43:
                y0.y r13 = (y0.C8604y) r13
                F.U r4 = r12.f4887e
                long r5 = r13.h()
                r4.b(r5)
                r4 = r1
                r1 = r13
            L50:
                r12.f4886d = r4
                r12.f4884b = r1
                r12.f4885c = r2
                r13 = 0
                java.lang.Object r13 = y0.InterfaceC8581b.s1(r4, r13, r12, r3, r13)
                if (r13 != r0) goto L5e
                return r0
            L5e:
                y0.n r13 = (y0.C8593n) r13
                java.util.List r13 = r13.c()
                int r5 = r13.size()
                r6 = 0
            L69:
                if (r6 >= r5) goto L89
                java.lang.Object r7 = r13.get(r6)
                y0.y r7 = (y0.C8604y) r7
                long r8 = r7.f()
                long r10 = r1.f()
                boolean r8 = y0.C8603x.d(r8, r10)
                if (r8 == 0) goto L86
                boolean r7 = r7.i()
                if (r7 == 0) goto L86
                goto L50
            L86:
                int r6 = r6 + 1
                goto L69
            L89:
                F.U r13 = r12.f4887e
                r13.d()
                Yg.J r13 = Yg.J.f24997a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: F.H.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC8581b interfaceC8581b, InterfaceC5380e interfaceC5380e) {
            return ((f) create(interfaceC8581b, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    public static final Object c(InterfaceC8567G interfaceC8567G, U u10, InterfaceC5380e interfaceC5380e) {
        Object objG = Ii.O.g(new a(interfaceC8567G, u10, null), interfaceC5380e);
        return objG == AbstractC5467b.g() ? objG : Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(InterfaceC8567G interfaceC8567G, U u10, InterfaceC5380e interfaceC5380e) {
        Object objE = w.j.e(interfaceC8567G, new b(u10), new c(u10), new d(u10), new e(u10), interfaceC5380e);
        return objE == AbstractC5467b.g() ? objE : Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object e(InterfaceC8567G interfaceC8567G, U u10, InterfaceC5380e interfaceC5380e) {
        Object objD = w.o.d(interfaceC8567G, new f(u10, null), interfaceC5380e);
        return objD == AbstractC5467b.g() ? objD : Yg.J.f24997a;
    }
}
