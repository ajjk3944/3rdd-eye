package Mi;

import Ii.N;
import Ki.w;
import Li.InterfaceC3220g;
import Li.InterfaceC3221h;
import Yg.J;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import java.util.concurrent.atomic.AtomicInteger;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes4.dex */
public abstract class j {

    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        Object f13273a;

        /* renamed from: b, reason: collision with root package name */
        Object f13274b;

        /* renamed from: c, reason: collision with root package name */
        int f13275c;

        /* renamed from: d, reason: collision with root package name */
        int f13276d;

        /* renamed from: e, reason: collision with root package name */
        int f13277e;

        /* renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f13278f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC3220g[] f13279g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f13280h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ mh.q f13281i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ InterfaceC3221h f13282j;

        /* renamed from: Mi.j$a$a, reason: collision with other inner class name */
        static final class C0529a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f13283a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC3220g[] f13284b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f13285c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ AtomicInteger f13286d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Ki.g f13287e;

            /* renamed from: Mi.j$a$a$a, reason: collision with other inner class name */
            static final class C0530a implements InterfaceC3221h {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Ki.g f13288a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ int f13289b;

                /* renamed from: Mi.j$a$a$a$a, reason: collision with other inner class name */
                static final class C0531a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: a, reason: collision with root package name */
                    /* synthetic */ Object f13290a;

                    /* renamed from: c, reason: collision with root package name */
                    int f13292c;

                    C0531a(InterfaceC5380e interfaceC5380e) {
                        super(interfaceC5380e);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f13290a = obj;
                        this.f13292c |= PduHandle.NONE;
                        return C0530a.this.a(null, this);
                    }
                }

                C0530a(Ki.g gVar, int i10) {
                    this.f13288a = gVar;
                    this.f13289b = i10;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // Li.InterfaceC3221h
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object a(java.lang.Object r7, dh.InterfaceC5380e r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof Mi.j.a.C0529a.C0530a.C0531a
                        if (r0 == 0) goto L13
                        r0 = r8
                        Mi.j$a$a$a$a r0 = (Mi.j.a.C0529a.C0530a.C0531a) r0
                        int r1 = r0.f13292c
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f13292c = r1
                        goto L18
                    L13:
                        Mi.j$a$a$a$a r0 = new Mi.j$a$a$a$a
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.f13290a
                        java.lang.Object r1 = eh.AbstractC5467b.g()
                        int r2 = r0.f13292c
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L38
                        if (r2 == r4) goto L34
                        if (r2 != r3) goto L2c
                        Yg.v.b(r8)
                        goto L56
                    L2c:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L34:
                        Yg.v.b(r8)
                        goto L4d
                    L38:
                        Yg.v.b(r8)
                        Ki.g r8 = r6.f13288a
                        Zg.N r2 = new Zg.N
                        int r5 = r6.f13289b
                        r2.<init>(r5, r7)
                        r0.f13292c = r4
                        java.lang.Object r7 = r8.b(r2, r0)
                        if (r7 != r1) goto L4d
                        return r1
                    L4d:
                        r0.f13292c = r3
                        java.lang.Object r7 = Ii.c1.a(r0)
                        if (r7 != r1) goto L56
                        return r1
                    L56:
                        Yg.J r7 = Yg.J.f24997a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: Mi.j.a.C0529a.C0530a.a(java.lang.Object, dh.e):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0529a(InterfaceC3220g[] interfaceC3220gArr, int i10, AtomicInteger atomicInteger, Ki.g gVar, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f13284b = interfaceC3220gArr;
                this.f13285c = i10;
                this.f13286d = atomicInteger;
                this.f13287e = gVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return new C0529a(this.f13284b, this.f13285c, this.f13286d, this.f13287e, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AtomicInteger atomicInteger;
                Object objG = AbstractC5467b.g();
                int i10 = this.f13283a;
                try {
                    if (i10 == 0) {
                        Yg.v.b(obj);
                        InterfaceC3220g[] interfaceC3220gArr = this.f13284b;
                        int i11 = this.f13285c;
                        InterfaceC3220g interfaceC3220g = interfaceC3220gArr[i11];
                        C0530a c0530a = new C0530a(this.f13287e, i11);
                        this.f13283a = 1;
                        if (interfaceC3220g.b(c0530a, this) == objG) {
                            return objG;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Yg.v.b(obj);
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        w.a.a(this.f13287e, null, 1, null);
                    }
                    return J.f24997a;
                } finally {
                    if (this.f13286d.decrementAndGet() == 0) {
                        w.a.a(this.f13287e, null, 1, null);
                    }
                }
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                return ((C0529a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC3220g[] interfaceC3220gArr, InterfaceC6824a interfaceC6824a, mh.q qVar, InterfaceC3221h interfaceC3221h, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f13279g = interfaceC3220gArr;
            this.f13280h = interfaceC6824a;
            this.f13281i = qVar;
            this.f13282j = interfaceC3221h;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            a aVar = new a(this.f13279g, this.f13280h, this.f13281i, this.f13282j, interfaceC5380e);
            aVar.f13278f = obj;
            return aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00bd A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00c7  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00ca A[LOOP:0: B:28:0x00ca->B:48:?, LOOP_START, PHI: r6 r10
  0x00ca: PHI (r6v6 int) = (r6v5 int), (r6v7 int) binds: [B:25:0x00c5, B:48:?] A[DONT_GENERATE, DONT_INLINE]
  0x00ca: PHI (r10v8 Zg.N) = (r10v7 Zg.N), (r10v21 Zg.N) binds: [B:25:0x00c5, B:48:?] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Type inference failed for: r2v7, types: [int] */
        /* JADX WARN: Type inference failed for: r2v9, types: [int] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0135 -> B:45:0x0137). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r24) {
            /*
                Method dump skipped, instructions count: 314
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: Mi.j.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    public static final Object a(InterfaceC3221h interfaceC3221h, InterfaceC3220g[] interfaceC3220gArr, InterfaceC6824a interfaceC6824a, mh.q qVar, InterfaceC5380e interfaceC5380e) {
        Object objA = m.a(new a(interfaceC3220gArr, interfaceC6824a, qVar, interfaceC3221h, null), interfaceC5380e);
        return objA == AbstractC5467b.g() ? objA : J.f24997a;
    }
}
