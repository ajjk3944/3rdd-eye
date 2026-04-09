package Ii;

import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlinx.coroutines.TimeoutCancellationException;
import mh.InterfaceC6839p;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes4.dex */
public abstract class W0 {

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        long f9289a;

        /* renamed from: b, reason: collision with root package name */
        Object f9290b;

        /* renamed from: c, reason: collision with root package name */
        Object f9291c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f9292d;

        /* renamed from: e, reason: collision with root package name */
        int f9293e;

        a(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f9292d = obj;
            this.f9293e |= PduHandle.NONE;
            return W0.d(0L, null, this);
        }
    }

    public static final TimeoutCancellationException a(long j10, X x10, InterfaceC3091y0 interfaceC3091y0) {
        return new TimeoutCancellationException("Timed out waiting for " + j10 + " ms", interfaceC3091y0);
    }

    private static final Object b(V0 v02, InterfaceC6839p interfaceC6839p) {
        A0.j(v02, Y.b(v02.f16627d.getContext()).p(v02.f9288e, v02, v02.getContext()));
        return Oi.b.c(v02, v02, interfaceC6839p);
    }

    public static final Object c(long j10, InterfaceC6839p interfaceC6839p, InterfaceC5380e interfaceC5380e) {
        if (j10 <= 0) {
            throw new TimeoutCancellationException("Timed out immediately");
        }
        Object objB = b(new V0(j10, interfaceC5380e), interfaceC6839p);
        if (objB == AbstractC5467b.g()) {
            kotlin.coroutines.jvm.internal.h.c(interfaceC5380e);
        }
        return objB;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(long r7, mh.InterfaceC6839p r9, dh.InterfaceC5380e r10) {
        /*
            boolean r0 = r10 instanceof Ii.W0.a
            if (r0 == 0) goto L13
            r0 = r10
            Ii.W0$a r0 = (Ii.W0.a) r0
            int r1 = r0.f9293e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9293e = r1
            goto L18
        L13:
            Ii.W0$a r0 = new Ii.W0$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f9292d
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f9293e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 != r4) goto L34
            java.lang.Object r7 = r0.f9291c
            kotlin.jvm.internal.N r7 = (kotlin.jvm.internal.N) r7
            java.lang.Object r8 = r0.f9290b
            mh.p r8 = (mh.InterfaceC6839p) r8
            Yg.v.b(r10)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L32
            goto L6f
        L32:
            r8 = move-exception
            goto L70
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            Yg.v.b(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L46
            return r3
        L46:
            kotlin.jvm.internal.N r10 = new kotlin.jvm.internal.N
            r10.<init>()
            r0.f9290b = r9     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            r0.f9291c = r10     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            r0.f9289a = r7     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            r0.f9293e = r4     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            Ii.V0 r2 = new Ii.V0     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            r2.<init>(r7, r0)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            r10.f51689a = r2     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            java.lang.Object r7 = b(r2, r9)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            java.lang.Object r8 = eh.AbstractC5467b.g()     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            if (r7 != r8) goto L6b
            kotlin.coroutines.jvm.internal.h.c(r0)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            goto L6b
        L68:
            r8 = move-exception
            r7 = r10
            goto L70
        L6b:
            if (r7 != r1) goto L6e
            return r1
        L6e:
            r10 = r7
        L6f:
            return r10
        L70:
            Ii.y0 r9 = r8.coroutine
            java.lang.Object r7 = r7.f51689a
            if (r9 != r7) goto L77
            return r3
        L77:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Ii.W0.d(long, mh.p, dh.e):java.lang.Object");
    }
}
