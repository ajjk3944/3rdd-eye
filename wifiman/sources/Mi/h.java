package Mi;

import Ii.O;
import Li.InterfaceC3220g;
import Li.InterfaceC3221h;
import Yg.J;
import dh.C5385j;
import dh.InterfaceC5380e;
import dh.InterfaceC5384i;
import eh.AbstractC5467b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.N;
import mh.InterfaceC6839p;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes4.dex */
public final class h extends f {

    /* renamed from: e, reason: collision with root package name */
    private final mh.q f13250e;

    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f13251a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f13252b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC3221h f13254d;

        /* renamed from: Mi.h$a$a, reason: collision with other inner class name */
        static final class C0527a implements InterfaceC3221h {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ N f13255a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Ii.N f13256b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ h f13257c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC3221h f13258d;

            /* renamed from: Mi.h$a$a$a, reason: collision with other inner class name */
            static final class C0528a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                int f13259a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ h f13260b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC3221h f13261c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ Object f13262d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0528a(h hVar, InterfaceC3221h interfaceC3221h, Object obj, InterfaceC5380e interfaceC5380e) {
                    super(2, interfaceC5380e);
                    this.f13260b = hVar;
                    this.f13261c = interfaceC3221h;
                    this.f13262d = obj;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                    return new C0528a(this.f13260b, this.f13261c, this.f13262d, interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objG = AbstractC5467b.g();
                    int i10 = this.f13259a;
                    if (i10 == 0) {
                        Yg.v.b(obj);
                        mh.q qVar = this.f13260b.f13250e;
                        InterfaceC3221h interfaceC3221h = this.f13261c;
                        Object obj2 = this.f13262d;
                        this.f13259a = 1;
                        if (qVar.s(interfaceC3221h, obj2, this) == objG) {
                            return objG;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Yg.v.b(obj);
                    }
                    return J.f24997a;
                }

                @Override // mh.InterfaceC6839p
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
                    return ((C0528a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
                }
            }

            /* renamed from: Mi.h$a$a$b */
            static final class b extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a, reason: collision with root package name */
                Object f13263a;

                /* renamed from: b, reason: collision with root package name */
                Object f13264b;

                /* renamed from: c, reason: collision with root package name */
                Object f13265c;

                /* renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f13266d;

                /* renamed from: f, reason: collision with root package name */
                int f13268f;

                b(InterfaceC5380e interfaceC5380e) {
                    super(interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f13266d = obj;
                    this.f13268f |= PduHandle.NONE;
                    return C0527a.this.a(null, this);
                }
            }

            C0527a(N n10, Ii.N n11, h hVar, InterfaceC3221h interfaceC3221h) {
                this.f13255a = n10;
                this.f13256b = n11;
                this.f13257c = hVar;
                this.f13258d = interfaceC3221h;
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
                    boolean r0 = r9 instanceof Mi.h.a.C0527a.b
                    if (r0 == 0) goto L13
                    r0 = r9
                    Mi.h$a$a$b r0 = (Mi.h.a.C0527a.b) r0
                    int r1 = r0.f13268f
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f13268f = r1
                    goto L18
                L13:
                    Mi.h$a$a$b r0 = new Mi.h$a$a$b
                    r0.<init>(r9)
                L18:
                    java.lang.Object r9 = r0.f13266d
                    java.lang.Object r1 = eh.AbstractC5467b.g()
                    int r2 = r0.f13268f
                    r3 = 1
                    if (r2 == 0) goto L3b
                    if (r2 != r3) goto L33
                    java.lang.Object r8 = r0.f13265c
                    Ii.y0 r8 = (Ii.InterfaceC3091y0) r8
                    java.lang.Object r8 = r0.f13264b
                    java.lang.Object r0 = r0.f13263a
                    Mi.h$a$a r0 = (Mi.h.a.C0527a) r0
                    Yg.v.b(r9)
                    goto L5e
                L33:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L3b:
                    Yg.v.b(r9)
                    kotlin.jvm.internal.N r9 = r7.f13255a
                    java.lang.Object r9 = r9.f51689a
                    Ii.y0 r9 = (Ii.InterfaceC3091y0) r9
                    if (r9 == 0) goto L5d
                    kotlinx.coroutines.flow.internal.ChildCancelledException r2 = new kotlinx.coroutines.flow.internal.ChildCancelledException
                    r2.<init>()
                    r9.cancel(r2)
                    r0.f13263a = r7
                    r0.f13264b = r8
                    r0.f13265c = r9
                    r0.f13268f = r3
                    java.lang.Object r9 = r9.join(r0)
                    if (r9 != r1) goto L5d
                    return r1
                L5d:
                    r0 = r7
                L5e:
                    kotlin.jvm.internal.N r9 = r0.f13255a
                    Ii.N r1 = r0.f13256b
                    Ii.P r3 = Ii.P.UNDISPATCHED
                    Mi.h$a$a$a r4 = new Mi.h$a$a$a
                    Mi.h r2 = r0.f13257c
                    Li.h r0 = r0.f13258d
                    r5 = 0
                    r4.<init>(r2, r0, r8, r5)
                    r5 = 1
                    r6 = 0
                    r2 = 0
                    Ii.y0 r8 = Ii.AbstractC3059i.d(r1, r2, r3, r4, r5, r6)
                    r9.f51689a = r8
                    Yg.J r8 = Yg.J.f24997a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: Mi.h.a.C0527a.a(java.lang.Object, dh.e):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC3221h interfaceC3221h, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f13254d = interfaceC3221h;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            a aVar = h.this.new a(this.f13254d, interfaceC5380e);
            aVar.f13252b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f13251a;
            if (i10 == 0) {
                Yg.v.b(obj);
                Ii.N n10 = (Ii.N) this.f13252b;
                N n11 = new N();
                h hVar = h.this;
                InterfaceC3220g interfaceC3220g = hVar.f13246d;
                C0527a c0527a = new C0527a(n11, n10, hVar, this.f13254d);
                this.f13251a = 1;
                if (interfaceC3220g.b(c0527a, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
            return ((a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    public /* synthetic */ h(mh.q qVar, InterfaceC3220g interfaceC3220g, InterfaceC5384i interfaceC5384i, int i10, Ki.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(qVar, interfaceC3220g, (i11 & 4) != 0 ? C5385j.f46088a : interfaceC5384i, (i11 & 8) != 0 ? -2 : i10, (i11 & 16) != 0 ? Ki.a.SUSPEND : aVar);
    }

    @Override // Mi.d
    protected d i(InterfaceC5384i interfaceC5384i, int i10, Ki.a aVar) {
        return new h(this.f13250e, this.f13246d, interfaceC5384i, i10, aVar);
    }

    @Override // Mi.f
    protected Object s(InterfaceC3221h interfaceC3221h, InterfaceC5380e interfaceC5380e) {
        Object objG = O.g(new a(interfaceC3221h, null), interfaceC5380e);
        return objG == AbstractC5467b.g() ? objG : J.f24997a;
    }

    public h(mh.q qVar, InterfaceC3220g interfaceC3220g, InterfaceC5384i interfaceC5384i, int i10, Ki.a aVar) {
        super(interfaceC3220g, interfaceC5384i, i10, aVar);
        this.f13250e = qVar;
    }
}
