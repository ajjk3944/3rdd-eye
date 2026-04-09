package androidx.compose.material;

import Ii.AbstractC3063k;
import Ii.N;
import Ii.O;
import Li.InterfaceC3220g;
import Li.InterfaceC3221h;
import N.C3310b;
import N.D;
import N.E;
import N.InterfaceC3308a;
import T.o1;
import Yg.J;
import Yg.v;
import Zg.U;
import androidx.compose.ui.e;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.K;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import mh.q;
import mh.r;
import org.snmp4j.mp.PduHandle;
import r.InterfaceC7533i;
import r.m0;
import y.InterfaceC8558m;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: androidx.compose.material.a$a, reason: collision with other inner class name */
    static final class C1056a extends l implements q {

        /* renamed from: a, reason: collision with root package name */
        int f28566a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f28567b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ float f28568c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C3310b f28569d;

        /* renamed from: androidx.compose.material.a$a$a, reason: collision with other inner class name */
        static final class C1057a extends l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f28570a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C3310b f28571b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ float f28572c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1057a(C3310b c3310b, float f10, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f28571b = c3310b;
                this.f28572c = f10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return new C1057a(this.f28571b, this.f28572c, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f28570a;
                if (i10 == 0) {
                    v.b(obj);
                    C3310b c3310b = this.f28571b;
                    float f10 = this.f28572c;
                    this.f28570a = 1;
                    if (c3310b.G(f10, this) == objG) {
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
                return ((C1057a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1056a(C3310b c3310b, InterfaceC5380e interfaceC5380e) {
            super(3, interfaceC5380e);
            this.f28569d = c3310b;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            if (this.f28566a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            AbstractC3063k.d((N) this.f28567b, null, null, new C1057a(this.f28569d, this.f28568c, null), 3, null);
            return J.f24997a;
        }

        public final Object n(N n10, float f10, InterfaceC5380e interfaceC5380e) {
            C1056a c1056a = new C1056a(this.f28569d, interfaceC5380e);
            c1056a.f28567b = n10;
            c1056a.f28568c = f10;
            return c1056a.invokeSuspend(J.f24997a);
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return n((N) obj, ((Number) obj2).floatValue(), (InterfaceC5380e) obj3);
        }
    }

    static final class b extends l implements r {

        /* renamed from: a, reason: collision with root package name */
        int f28573a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f28574b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f28575c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f28576d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C3310b f28577e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f28578f;

        /* renamed from: androidx.compose.material.a$b$a, reason: collision with other inner class name */
        static final class C1058a extends AbstractC6494u implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3308a f28579a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ K f28580b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1058a(InterfaceC3308a interfaceC3308a, K k10) {
                super(2);
                this.f28579a = interfaceC3308a;
                this.f28580b = k10;
            }

            public final void a(float f10, float f11) {
                this.f28579a.a(f10, f11);
                this.f28580b.f51686a = f10;
            }

            @Override // mh.InterfaceC6839p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                return J.f24997a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C3310b c3310b, float f10, InterfaceC5380e interfaceC5380e) {
            super(4, interfaceC5380e);
            this.f28577e = c3310b;
            this.f28578f = f10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f28573a;
            if (i10 == 0) {
                v.b(obj);
                InterfaceC3308a interfaceC3308a = (InterfaceC3308a) this.f28574b;
                float fE = ((D) this.f28575c).e(this.f28576d);
                if (!Float.isNaN(fE)) {
                    K k10 = new K();
                    float fW = Float.isNaN(this.f28577e.w()) ? 0.0f : this.f28577e.w();
                    k10.f51686a = fW;
                    float f10 = this.f28578f;
                    InterfaceC7533i interfaceC7533iP = this.f28577e.p();
                    C1058a c1058a = new C1058a(interfaceC3308a, k10);
                    this.f28574b = null;
                    this.f28575c = null;
                    this.f28573a = 1;
                    if (m0.b(fW, fE, f10, interfaceC7533iP, c1058a, this) == objG) {
                        return objG;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return J.f24997a;
        }

        @Override // mh.r
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object y(InterfaceC3308a interfaceC3308a, D d10, Object obj, InterfaceC5380e interfaceC5380e) {
            b bVar = new b(this.f28577e, this.f28578f, interfaceC5380e);
            bVar.f28574b = interfaceC3308a;
            bVar.f28575c = d10;
            bVar.f28576d = obj;
            return bVar.invokeSuspend(J.f24997a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f28581a;

        /* renamed from: b, reason: collision with root package name */
        int f28582b;

        c(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f28581a = obj;
            this.f28582b |= PduHandle.NONE;
            return a.j(null, null, this);
        }
    }

    static final class d extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f28583a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f28584b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f28585c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f28586d;

        /* renamed from: androidx.compose.material.a$d$a, reason: collision with other inner class name */
        static final class C1059a implements InterfaceC3221h {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.N f28587a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ N f28588b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC6839p f28589c;

            /* renamed from: androidx.compose.material.a$d$a$a, reason: collision with other inner class name */
            static final class C1060a extends l implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                int f28590a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC6839p f28591b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ Object f28592c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ N f28593d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1060a(InterfaceC6839p interfaceC6839p, Object obj, N n10, InterfaceC5380e interfaceC5380e) {
                    super(2, interfaceC5380e);
                    this.f28591b = interfaceC6839p;
                    this.f28592c = obj;
                    this.f28593d = n10;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                    return new C1060a(this.f28591b, this.f28592c, this.f28593d, interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objG = AbstractC5467b.g();
                    int i10 = this.f28590a;
                    if (i10 == 0) {
                        v.b(obj);
                        InterfaceC6839p interfaceC6839p = this.f28591b;
                        Object obj2 = this.f28592c;
                        this.f28590a = 1;
                        if (interfaceC6839p.invoke(obj2, this) == objG) {
                            return objG;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        v.b(obj);
                    }
                    O.d(this.f28593d, new AnchoredDragFinishedSignal());
                    return J.f24997a;
                }

                @Override // mh.InterfaceC6839p
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                    return ((C1060a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
                }
            }

            /* renamed from: androidx.compose.material.a$d$a$b */
            static final class b extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a, reason: collision with root package name */
                Object f28594a;

                /* renamed from: b, reason: collision with root package name */
                Object f28595b;

                /* renamed from: c, reason: collision with root package name */
                Object f28596c;

                /* renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f28597d;

                /* renamed from: f, reason: collision with root package name */
                int f28599f;

                b(InterfaceC5380e interfaceC5380e) {
                    super(interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f28597d = obj;
                    this.f28599f |= PduHandle.NONE;
                    return C1059a.this.a(null, this);
                }
            }

            C1059a(kotlin.jvm.internal.N n10, N n11, InterfaceC6839p interfaceC6839p) {
                this.f28587a = n10;
                this.f28588b = n11;
                this.f28589c = interfaceC6839p;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // Li.InterfaceC3221h
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object a(java.lang.Object r8, dh.InterfaceC5380e r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof androidx.compose.material.a.d.C1059a.b
                    if (r0 == 0) goto L13
                    r0 = r9
                    androidx.compose.material.a$d$a$b r0 = (androidx.compose.material.a.d.C1059a.b) r0
                    int r1 = r0.f28599f
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f28599f = r1
                    goto L18
                L13:
                    androidx.compose.material.a$d$a$b r0 = new androidx.compose.material.a$d$a$b
                    r0.<init>(r9)
                L18:
                    java.lang.Object r9 = r0.f28597d
                    java.lang.Object r1 = eh.AbstractC5467b.g()
                    int r2 = r0.f28599f
                    r3 = 1
                    if (r2 == 0) goto L3b
                    if (r2 != r3) goto L33
                    java.lang.Object r8 = r0.f28596c
                    Ii.y0 r8 = (Ii.InterfaceC3091y0) r8
                    java.lang.Object r8 = r0.f28595b
                    java.lang.Object r0 = r0.f28594a
                    androidx.compose.material.a$d$a r0 = (androidx.compose.material.a.d.C1059a) r0
                    Yg.v.b(r9)
                    goto L5e
                L33:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L3b:
                    Yg.v.b(r9)
                    kotlin.jvm.internal.N r9 = r7.f28587a
                    java.lang.Object r9 = r9.f51689a
                    Ii.y0 r9 = (Ii.InterfaceC3091y0) r9
                    if (r9 == 0) goto L5d
                    androidx.compose.material.AnchoredDragFinishedSignal r2 = new androidx.compose.material.AnchoredDragFinishedSignal
                    r2.<init>()
                    r9.cancel(r2)
                    r0.f28594a = r7
                    r0.f28595b = r8
                    r0.f28596c = r9
                    r0.f28599f = r3
                    java.lang.Object r9 = r9.join(r0)
                    if (r9 != r1) goto L5d
                    return r1
                L5d:
                    r0 = r7
                L5e:
                    kotlin.jvm.internal.N r9 = r0.f28587a
                    Ii.N r1 = r0.f28588b
                    Ii.P r3 = Ii.P.UNDISPATCHED
                    androidx.compose.material.a$d$a$a r4 = new androidx.compose.material.a$d$a$a
                    mh.p r0 = r0.f28589c
                    r2 = 0
                    r4.<init>(r0, r8, r1, r2)
                    r5 = 1
                    r6 = 0
                    Ii.y0 r8 = Ii.AbstractC3059i.d(r1, r2, r3, r4, r5, r6)
                    r9.f51689a = r8
                    Yg.J r8 = Yg.J.f24997a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.a.d.C1059a.a(java.lang.Object, dh.e):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(InterfaceC6824a interfaceC6824a, InterfaceC6839p interfaceC6839p, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f28585c = interfaceC6824a;
            this.f28586d = interfaceC6839p;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            d dVar = new d(this.f28585c, this.f28586d, interfaceC5380e);
            dVar.f28584b = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f28583a;
            if (i10 == 0) {
                v.b(obj);
                N n10 = (N) this.f28584b;
                kotlin.jvm.internal.N n11 = new kotlin.jvm.internal.N();
                InterfaceC3220g interfaceC3220gO = o1.o(this.f28585c);
                C1059a c1059a = new C1059a(n11, n10, this.f28586d);
                this.f28583a = 1;
                if (interfaceC3220gO.b(c1059a, this) == objG) {
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

    public static final D a(InterfaceC6835l interfaceC6835l) {
        E e10 = new E();
        interfaceC6835l.invoke(e10);
        return new androidx.compose.material.c(e10.b());
    }

    public static final e d(e eVar, C3310b c3310b, w.q qVar, boolean z10, boolean z11, InterfaceC8558m interfaceC8558m, boolean z12) {
        return w.l.g(eVar, c3310b.u(), qVar, (32 & 4) != 0 ? true : z10, (32 & 8) != 0 ? null : interfaceC8558m, (32 & 16) != 0 ? false : z12, (32 & 32) != 0 ? w.l.f63982a : null, (32 & 64) != 0 ? w.l.f63983b : new C1056a(c3310b, null), (32 & 128) != 0 ? false : z11);
    }

    public static /* synthetic */ e e(e eVar, C3310b c3310b, w.q qVar, boolean z10, boolean z11, InterfaceC8558m interfaceC8558m, boolean z12, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        boolean z13 = z10;
        if ((i10 & 8) != 0) {
            z11 = false;
        }
        boolean z14 = z11;
        if ((i10 & 16) != 0) {
            interfaceC8558m = null;
        }
        InterfaceC8558m interfaceC8558m2 = interfaceC8558m;
        if ((i10 & 32) != 0) {
            z12 = c3310b.y();
        }
        return d(eVar, c3310b, qVar, z13, z14, interfaceC8558m2, z12);
    }

    public static final Object f(C3310b c3310b, Object obj, float f10, InterfaceC5380e interfaceC5380e) throws Throwable {
        Object objK = C3310b.k(c3310b, obj, null, new b(c3310b, f10, null), interfaceC5380e, 2, null);
        return objK == AbstractC5467b.g() ? objK : J.f24997a;
    }

    public static /* synthetic */ Object g(C3310b c3310b, Object obj, float f10, InterfaceC5380e interfaceC5380e, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            f10 = c3310b.v();
        }
        return f(c3310b, obj, f10, interfaceC5380e);
    }

    public static final e h(e eVar, C3310b c3310b, w.q qVar, InterfaceC6839p interfaceC6839p) {
        return eVar.b0(new DraggableAnchorsElement(c3310b, interfaceC6839p, qVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.material.c i() {
        return new androidx.compose.material.c(U.h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object j(mh.InterfaceC6824a r4, mh.InterfaceC6839p r5, dh.InterfaceC5380e r6) {
        /*
            boolean r0 = r6 instanceof androidx.compose.material.a.c
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.material.a$c r0 = (androidx.compose.material.a.c) r0
            int r1 = r0.f28582b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28582b = r1
            goto L18
        L13:
            androidx.compose.material.a$c r0 = new androidx.compose.material.a$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f28581a
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f28582b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            Yg.v.b(r6)     // Catch: androidx.compose.material.AnchoredDragFinishedSignal -> L43
            goto L43
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            Yg.v.b(r6)
            androidx.compose.material.a$d r6 = new androidx.compose.material.a$d     // Catch: androidx.compose.material.AnchoredDragFinishedSignal -> L43
            r2 = 0
            r6.<init>(r4, r5, r2)     // Catch: androidx.compose.material.AnchoredDragFinishedSignal -> L43
            r0.f28582b = r3     // Catch: androidx.compose.material.AnchoredDragFinishedSignal -> L43
            java.lang.Object r4 = Ii.O.g(r6, r0)     // Catch: androidx.compose.material.AnchoredDragFinishedSignal -> L43
            if (r4 != r1) goto L43
            return r1
        L43:
            Yg.J r4 = Yg.J.f24997a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.a.j(mh.a, mh.p, dh.e):java.lang.Object");
    }
}
