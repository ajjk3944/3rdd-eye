package Qi;

import Ii.AbstractC3059i;
import Ii.C3048c0;
import Ii.C3079s0;
import Ii.N;
import Ii.P;
import Li.InterfaceC3220g;
import Li.InterfaceC3221h;
import Yg.J;
import dh.C5385j;
import dh.InterfaceC5380e;
import dh.InterfaceC5384i;
import gg.s;
import gg.t;
import gg.u;
import mh.InterfaceC6839p;

/* loaded from: classes4.dex */
public abstract class i {

    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f19367a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f19368b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3220g f19369c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ t f19370d;

        /* renamed from: Qi.i$a$a, reason: collision with other inner class name */
        static final class C0685a implements InterfaceC3221h {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ t f19371a;

            C0685a(t tVar) {
                this.f19371a = tVar;
            }

            @Override // Li.InterfaceC3221h
            public final Object a(Object obj, InterfaceC5380e interfaceC5380e) {
                this.f19371a.h(obj);
                return J.f24997a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC3220g interfaceC3220g, t tVar, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f19369c = interfaceC3220g;
            this.f19370d = tVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            a aVar = new a(this.f19369c, this.f19370d, interfaceC5380e);
            aVar.f19368b = obj;
            return aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = eh.AbstractC5467b.g()
                int r1 = r6.f19367a
                r2 = 1
                if (r1 == 0) goto L1d
                if (r1 != r2) goto L15
                java.lang.Object r0 = r6.f19368b
                Ii.N r0 = (Ii.N) r0
                Yg.v.b(r7)     // Catch: java.lang.Throwable -> L13
                goto L39
            L13:
                r7 = move-exception
                goto L43
            L15:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1d:
                Yg.v.b(r7)
                java.lang.Object r7 = r6.f19368b
                Ii.N r7 = (Ii.N) r7
                Li.g r1 = r6.f19369c     // Catch: java.lang.Throwable -> L3f
                Qi.i$a$a r3 = new Qi.i$a$a     // Catch: java.lang.Throwable -> L3f
                gg.t r4 = r6.f19370d     // Catch: java.lang.Throwable -> L3f
                r3.<init>(r4)     // Catch: java.lang.Throwable -> L3f
                r6.f19368b = r7     // Catch: java.lang.Throwable -> L3f
                r6.f19367a = r2     // Catch: java.lang.Throwable -> L3f
                java.lang.Object r1 = r1.b(r3, r6)     // Catch: java.lang.Throwable -> L3f
                if (r1 != r0) goto L38
                return r0
            L38:
                r0 = r7
            L39:
                gg.t r7 = r6.f19370d     // Catch: java.lang.Throwable -> L13
                r7.a()     // Catch: java.lang.Throwable -> L13
                goto L5c
            L3f:
                r0 = move-exception
                r5 = r0
                r0 = r7
                r7 = r5
            L43:
                boolean r1 = r7 instanceof java.util.concurrent.CancellationException
                if (r1 != 0) goto L57
                gg.t r1 = r6.f19370d
                boolean r1 = r1.c(r7)
                if (r1 != 0) goto L5c
                dh.i r0 = r0.getCoroutineContext()
                Qi.d.a(r7, r0)
                goto L5c
            L57:
                gg.t r7 = r6.f19370d
                r7.a()
            L5c:
                Yg.J r7 = Yg.J.f24997a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: Qi.i.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    public static final gg.i b(InterfaceC3220g interfaceC3220g, InterfaceC5384i interfaceC5384i) {
        return gg.i.B0(Pi.e.b(interfaceC3220g, interfaceC5384i));
    }

    public static /* synthetic */ gg.i c(InterfaceC3220g interfaceC3220g, InterfaceC5384i interfaceC5384i, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC5384i = C5385j.f46088a;
        }
        return b(interfaceC3220g, interfaceC5384i);
    }

    public static final s d(final InterfaceC3220g interfaceC3220g, final InterfaceC5384i interfaceC5384i) {
        return s.o(new u() { // from class: Qi.h
            @Override // gg.u
            public final void a(t tVar) {
                i.f(interfaceC5384i, interfaceC3220g, tVar);
            }
        });
    }

    public static /* synthetic */ s e(InterfaceC3220g interfaceC3220g, InterfaceC5384i interfaceC5384i, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC5384i = C5385j.f46088a;
        }
        return d(interfaceC3220g, interfaceC5384i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(InterfaceC5384i interfaceC5384i, InterfaceC3220g interfaceC3220g, t tVar) {
        tVar.d(new c(AbstractC3059i.c(C3079s0.f9355a, C3048c0.d().plus(interfaceC5384i), P.ATOMIC, new a(interfaceC3220g, tVar, null))));
    }
}
