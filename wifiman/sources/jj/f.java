package jj;

import Yg.J;
import Yg.v;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import java.util.List;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import l0.C6531g;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import w.o;
import y0.AbstractC8576P;
import y0.AbstractC8594o;
import y0.C8603x;
import y0.C8604y;
import y0.InterfaceC8567G;
import y0.InterfaceC8581b;

/* loaded from: classes4.dex */
public abstract class f {

    static final class a extends kotlin.coroutines.jvm.internal.k implements InterfaceC6839p {

        /* renamed from: b, reason: collision with root package name */
        int f50920b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f50921c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f50922d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f50923e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f50924f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f50925g;

        /* renamed from: jj.f$a$a, reason: collision with other inner class name */
        static final class C1883a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC6839p f50926a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1883a(InterfaceC6839p interfaceC6839p) {
                super(1);
                this.f50926a = interfaceC6839p;
            }

            public final void a(C8604y it) {
                AbstractC6492s.i(it, "it");
                this.f50926a.invoke(it, C6531g.d(AbstractC8594o.g(it)));
                it.a();
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C8604y) obj);
                return J.f24997a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j10, InterfaceC6824a interfaceC6824a, InterfaceC6824a interfaceC6824a2, InterfaceC6839p interfaceC6839p, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f50922d = j10;
            this.f50923e = interfaceC6824a;
            this.f50924f = interfaceC6824a2;
            this.f50925g = interfaceC6839p;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            a aVar = new a(this.f50922d, this.f50923e, this.f50924f, this.f50925g, interfaceC5380e);
            aVar.f50921c = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            InterfaceC8581b interfaceC8581b;
            Object objG = AbstractC5467b.g();
            int i10 = this.f50920b;
            if (i10 == 0) {
                v.b(obj);
                InterfaceC8581b interfaceC8581b2 = (InterfaceC8581b) this.f50921c;
                long j10 = this.f50922d;
                C1883a c1883a = new C1883a(this.f50925g);
                this.f50921c = interfaceC8581b2;
                this.f50920b = 1;
                Object objH = w.j.h(interfaceC8581b2, j10, c1883a, this);
                if (objH == objG) {
                    return objG;
                }
                interfaceC8581b = interfaceC8581b2;
                obj = objH;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC8581b = (InterfaceC8581b) this.f50921c;
                v.b(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                for (C8604y c8604y : interfaceC8581b.Z().c()) {
                    if (AbstractC8594o.c(c8604y)) {
                        c8604y.a();
                    }
                }
                this.f50923e.invoke();
            } else {
                this.f50924f.invoke();
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC8581b interfaceC8581b, InterfaceC5380e interfaceC5380e) {
            return ((a) create(interfaceC8581b, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class b extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f50927a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f50928b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ i f50929c;

        static final class a extends l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            Object f50930a;

            /* renamed from: b, reason: collision with root package name */
            int f50931b;

            /* renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f50932c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ i f50933d;

            /* renamed from: jj.f$b$a$a, reason: collision with other inner class name */
            static final class C1884a extends AbstractC6494u implements InterfaceC6824a {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ i f50934a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1884a(i iVar) {
                    super(0);
                    this.f50934a = iVar;
                }

                public final void a() {
                    this.f50934a.K();
                }

                @Override // mh.InterfaceC6824a
                public /* bridge */ /* synthetic */ Object invoke() {
                    a();
                    return J.f24997a;
                }
            }

            /* renamed from: jj.f$b$a$b, reason: collision with other inner class name */
            static final class C1885b extends AbstractC6494u implements InterfaceC6824a {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ i f50935a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1885b(i iVar) {
                    super(0);
                    this.f50935a = iVar;
                }

                public final void a() {
                    this.f50935a.K();
                }

                @Override // mh.InterfaceC6824a
                public /* bridge */ /* synthetic */ Object invoke() {
                    a();
                    return J.f24997a;
                }
            }

            static final class c extends AbstractC6494u implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ i f50936a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(i iVar) {
                    super(2);
                    this.f50936a = iVar;
                }

                public final void a(C8604y change, long j10) {
                    AbstractC6492s.i(change, "change");
                    change.a();
                    this.f50936a.J((int) C6531g.m(j10), (int) C6531g.n(j10));
                }

                @Override // mh.InterfaceC6839p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    a((C8604y) obj, ((C6531g) obj2).v());
                    return J.f24997a;
                }
            }

            static final class d extends kotlin.coroutines.jvm.internal.k implements InterfaceC6839p {

                /* renamed from: b, reason: collision with root package name */
                int f50937b;

                /* renamed from: c, reason: collision with root package name */
                private /* synthetic */ Object f50938c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ k f50939d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(k kVar, InterfaceC5380e interfaceC5380e) {
                    super(2, interfaceC5380e);
                    this.f50939d = kVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                    d dVar = new d(this.f50939d, interfaceC5380e);
                    dVar.f50938c = obj;
                    return dVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    AbstractC5467b.g();
                    if (this.f50937b != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v.b(obj);
                    List listC = ((InterfaceC8581b) this.f50938c).Z().c();
                    k kVar = this.f50939d;
                    int size = listC.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        Object obj2 = listC.get(i10);
                        if (C8603x.d(((C8604y) obj2).f(), kVar.a())) {
                            return obj2;
                        }
                    }
                    return null;
                }

                @Override // mh.InterfaceC6839p
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Object invoke(InterfaceC8581b interfaceC8581b, InterfaceC5380e interfaceC5380e) {
                    return ((d) create(interfaceC8581b, interfaceC5380e)).invokeSuspend(J.f24997a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(i iVar, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f50933d = iVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                a aVar = new a(this.f50933d, interfaceC5380e);
                aVar.f50932c = obj;
                return aVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x00c3 A[RETURN] */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r15) {
                /*
                    r14 = this;
                    java.lang.Object r0 = eh.AbstractC5467b.g()
                    int r1 = r14.f50931b
                    r2 = 3
                    r3 = 2
                    r4 = 1
                    r5 = 0
                    if (r1 == 0) goto L34
                    if (r1 == r4) goto L2c
                    if (r1 == r3) goto L1f
                    if (r1 != r2) goto L17
                    Yg.v.b(r15)
                    goto Lc4
                L17:
                    java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r15.<init>(r0)
                    throw r15
                L1f:
                    java.lang.Object r1 = r14.f50930a
                    jj.k r1 = (jj.k) r1
                    java.lang.Object r3 = r14.f50932c
                    y0.G r3 = (y0.InterfaceC8567G) r3
                    Yg.v.b(r15)
                    r6 = r3
                    goto L66
                L2c:
                    java.lang.Object r1 = r14.f50932c
                    y0.G r1 = (y0.InterfaceC8567G) r1
                    Yg.v.b(r15)
                    goto L4f
                L34:
                    Yg.v.b(r15)
                    java.lang.Object r15 = r14.f50932c
                    y0.G r15 = (y0.InterfaceC8567G) r15
                    jj.i r1 = r14.f50933d
                    Ki.g r1 = r1.w()
                    r14.f50932c = r15
                    r14.f50931b = r4
                    java.lang.Object r1 = r1.c(r14)
                    if (r1 != r0) goto L4c
                    return r0
                L4c:
                    r13 = r1
                    r1 = r15
                    r15 = r13
                L4f:
                    jj.k r15 = (jj.k) r15
                    jj.f$b$a$d r4 = new jj.f$b$a$d
                    r4.<init>(r15, r5)
                    r14.f50932c = r1
                    r14.f50930a = r15
                    r14.f50931b = r3
                    java.lang.Object r3 = r1.P(r4, r14)
                    if (r3 != r0) goto L63
                    return r0
                L63:
                    r6 = r1
                    r1 = r15
                    r15 = r3
                L66:
                    y0.y r15 = (y0.C8604y) r15
                    if (r15 == 0) goto Lc4
                    jj.i r3 = r14.f50933d
                    long r7 = r15.h()
                    float r4 = l0.C6531g.m(r7)
                    int r4 = (int) r4
                    long r7 = r15.h()
                    float r7 = l0.C6531g.n(r7)
                    int r7 = (int) r7
                    boolean r3 = r3.L(r4, r7)
                    if (r3 == 0) goto Lc4
                    l0.g r1 = r1.b()
                    if (r1 == 0) goto L9d
                    jj.i r3 = r14.f50933d
                    long r7 = r1.v()
                    float r1 = l0.C6531g.m(r7)
                    int r1 = (int) r1
                    float r4 = l0.C6531g.n(r7)
                    int r4 = (int) r4
                    r3.J(r1, r4)
                L9d:
                    long r7 = r15.f()
                    jj.f$b$a$a r9 = new jj.f$b$a$a
                    jj.i r15 = r14.f50933d
                    r9.<init>(r15)
                    jj.f$b$a$b r10 = new jj.f$b$a$b
                    jj.i r15 = r14.f50933d
                    r10.<init>(r15)
                    jj.f$b$a$c r11 = new jj.f$b$a$c
                    jj.i r15 = r14.f50933d
                    r11.<init>(r15)
                    r14.f50932c = r5
                    r14.f50930a = r5
                    r14.f50931b = r2
                    r12 = r14
                    java.lang.Object r15 = jj.f.a(r6, r7, r9, r10, r11, r12)
                    if (r15 != r0) goto Lc4
                    return r0
                Lc4:
                    Yg.J r15 = Yg.J.f24997a
                    return r15
                */
                throw new UnsupportedOperationException("Method not decompiled: jj.f.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC8567G interfaceC8567G, InterfaceC5380e interfaceC5380e) {
                return ((a) create(interfaceC8567G, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(i iVar, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f50929c = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            b bVar = new b(this.f50929c, interfaceC5380e);
            bVar.f50928b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f50927a;
            if (i10 == 0) {
                v.b(obj);
                InterfaceC8567G interfaceC8567G = (InterfaceC8567G) this.f50928b;
                a aVar = new a(this.f50929c, null);
                this.f50927a = 1;
                if (o.e(interfaceC8567G, aVar, this) == objG) {
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
        public final Object invoke(InterfaceC8567G interfaceC8567G, InterfaceC5380e interfaceC5380e) {
            return ((b) create(interfaceC8567G, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    public static final Object a(InterfaceC8567G interfaceC8567G, long j10, InterfaceC6824a interfaceC6824a, InterfaceC6824a interfaceC6824a2, InterfaceC6839p interfaceC6839p, InterfaceC5380e interfaceC5380e) {
        Object objP = interfaceC8567G.P(new a(j10, interfaceC6824a, interfaceC6824a2, interfaceC6839p, null), interfaceC5380e);
        return objP == AbstractC5467b.g() ? objP : J.f24997a;
    }

    public static final androidx.compose.ui.e b(androidx.compose.ui.e eVar, i state) {
        AbstractC6492s.i(eVar, "<this>");
        AbstractC6492s.i(state, "state");
        return eVar.b0(AbstractC8576P.d(androidx.compose.ui.e.f28771b0, J.f24997a, new b(state, null)));
    }
}
