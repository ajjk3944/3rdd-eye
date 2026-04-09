package Ki;

import Ii.H;
import Ii.InterfaceC3069n;
import Ii.N;
import Ii.P;
import Yg.J;
import Yg.u;
import dh.C5385j;
import dh.InterfaceC5380e;
import dh.InterfaceC5384i;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes4.dex */
public abstract class r {

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f10885a;

        /* renamed from: b, reason: collision with root package name */
        Object f10886b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f10887c;

        /* renamed from: d, reason: collision with root package name */
        int f10888d;

        a(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f10887c = obj;
            this.f10888d |= PduHandle.NONE;
            return r.a(null, null, this);
        }
    }

    static final class b implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3069n f10889a;

        b(InterfaceC3069n interfaceC3069n) {
            this.f10889a = interfaceC3069n;
        }

        public final void a(Throwable th2) {
            InterfaceC3069n interfaceC3069n = this.f10889a;
            u.a aVar = Yg.u.f25017b;
            interfaceC3069n.resumeWith(Yg.u.c(J.f24997a));
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return J.f24997a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(Ki.t r4, mh.InterfaceC6824a r5, dh.InterfaceC5380e r6) {
        /*
            boolean r0 = r6 instanceof Ki.r.a
            if (r0 == 0) goto L13
            r0 = r6
            Ki.r$a r0 = (Ki.r.a) r0
            int r1 = r0.f10888d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10888d = r1
            goto L18
        L13:
            Ki.r$a r0 = new Ki.r$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f10887c
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f10888d
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r4 = r0.f10886b
            r5 = r4
            mh.a r5 = (mh.InterfaceC6824a) r5
            java.lang.Object r4 = r0.f10885a
            Ki.t r4 = (Ki.t) r4
            Yg.v.b(r6)     // Catch: java.lang.Throwable -> L32
            goto L75
        L32:
            r4 = move-exception
            goto L7b
        L34:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3c:
            Yg.v.b(r6)
            dh.i r6 = r0.getContext()
            Ii.y0$b r2 = Ii.InterfaceC3091y0.f9363O
            dh.i$b r6 = r6.get(r2)
            if (r6 != r4) goto L7f
            r0.f10885a = r4     // Catch: java.lang.Throwable -> L32
            r0.f10886b = r5     // Catch: java.lang.Throwable -> L32
            r0.f10888d = r3     // Catch: java.lang.Throwable -> L32
            Ii.p r6 = new Ii.p     // Catch: java.lang.Throwable -> L32
            dh.e r2 = eh.AbstractC5467b.d(r0)     // Catch: java.lang.Throwable -> L32
            r6.<init>(r2, r3)     // Catch: java.lang.Throwable -> L32
            r6.A()     // Catch: java.lang.Throwable -> L32
            Ki.r$b r2 = new Ki.r$b     // Catch: java.lang.Throwable -> L32
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L32
            r4.e(r2)     // Catch: java.lang.Throwable -> L32
            java.lang.Object r4 = r6.u()     // Catch: java.lang.Throwable -> L32
            java.lang.Object r6 = eh.AbstractC5467b.g()     // Catch: java.lang.Throwable -> L32
            if (r4 != r6) goto L72
            kotlin.coroutines.jvm.internal.h.c(r0)     // Catch: java.lang.Throwable -> L32
        L72:
            if (r4 != r1) goto L75
            return r1
        L75:
            r5.invoke()
            Yg.J r4 = Yg.J.f24997a
            return r4
        L7b:
            r5.invoke()
            throw r4
        L7f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Ki.r.a(Ki.t, mh.a, dh.e):java.lang.Object");
    }

    public static final v b(N n10, InterfaceC5384i interfaceC5384i, int i10, Ki.a aVar, P p10, InterfaceC6835l interfaceC6835l, InterfaceC6839p interfaceC6839p) {
        s sVar = new s(H.j(n10, interfaceC5384i), j.b(i10, aVar, null, 4, null));
        if (interfaceC6835l != null) {
            sVar.invokeOnCompletion(interfaceC6835l);
        }
        sVar.Q0(p10, sVar, interfaceC6839p);
        return sVar;
    }

    public static final v c(N n10, InterfaceC5384i interfaceC5384i, int i10, InterfaceC6839p interfaceC6839p) {
        return b(n10, interfaceC5384i, i10, Ki.a.SUSPEND, P.DEFAULT, null, interfaceC6839p);
    }

    public static /* synthetic */ v d(N n10, InterfaceC5384i interfaceC5384i, int i10, Ki.a aVar, P p10, InterfaceC6835l interfaceC6835l, InterfaceC6839p interfaceC6839p, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            interfaceC5384i = C5385j.f46088a;
        }
        InterfaceC5384i interfaceC5384i2 = interfaceC5384i;
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        int i12 = i10;
        if ((i11 & 4) != 0) {
            aVar = Ki.a.SUSPEND;
        }
        Ki.a aVar2 = aVar;
        if ((i11 & 8) != 0) {
            p10 = P.DEFAULT;
        }
        P p11 = p10;
        if ((i11 & 16) != 0) {
            interfaceC6835l = null;
        }
        return b(n10, interfaceC5384i2, i12, aVar2, p11, interfaceC6835l, interfaceC6839p);
    }
}
