package Ni;

import Ii.AbstractC3060i0;
import Ii.U0;
import dh.InterfaceC5384i;
import kotlinx.coroutines.DispatchException;

/* renamed from: Ni.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3406h {

    /* renamed from: a, reason: collision with root package name */
    private static final C f16596a = new C("UNDEFINED");

    /* renamed from: b, reason: collision with root package name */
    public static final C f16597b = new C("REUSABLE_CLAIMED");

    /* JADX WARN: Removed duplicated region for block: B:27:0x008e A[Catch: all -> 0x0067, DONT_GENERATE, TryCatch #0 {all -> 0x0067, blocks: (B:11:0x003e, B:13:0x004c, B:15:0x0052, B:28:0x0091, B:18:0x0069, B:20:0x0079, B:25:0x0088, B:27:0x008e, B:33:0x009e, B:36:0x00a7, B:35:0x00a4, B:23:0x007f), top: B:44:0x003e, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(dh.InterfaceC5380e r6, java.lang.Object r7) {
        /*
            boolean r0 = r6 instanceof Ni.C3405g
            if (r0 == 0) goto Lb1
            Ni.g r6 = (Ni.C3405g) r6
            java.lang.Object r0 = Ii.D.b(r7)
            Ii.J r1 = r6.f16592d
            dh.i r2 = r6.getContext()
            boolean r1 = d(r1, r2)
            r2 = 1
            if (r1 == 0) goto L26
            r6.f16594f = r0
            r6.f9299c = r2
            Ii.J r7 = r6.f16592d
            dh.i r0 = r6.getContext()
            c(r7, r0, r6)
            goto Lb4
        L26:
            Ii.U0 r1 = Ii.U0.f9286a
            Ii.i0 r1 = r1.b()
            boolean r3 = r1.w0()
            if (r3 == 0) goto L3b
            r6.f16594f = r0
            r6.f9299c = r2
            r1.s0(r6)
            goto Lb4
        L3b:
            r1.u0(r2)
            dh.i r3 = r6.getContext()     // Catch: java.lang.Throwable -> L67
            Ii.y0$b r4 = Ii.InterfaceC3091y0.f9363O     // Catch: java.lang.Throwable -> L67
            dh.i$b r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L67
            Ii.y0 r3 = (Ii.InterfaceC3091y0) r3     // Catch: java.lang.Throwable -> L67
            if (r3 == 0) goto L69
            boolean r4 = r3.isActive()     // Catch: java.lang.Throwable -> L67
            if (r4 != 0) goto L69
            java.util.concurrent.CancellationException r7 = r3.getCancellationException()     // Catch: java.lang.Throwable -> L67
            r6.a(r0, r7)     // Catch: java.lang.Throwable -> L67
            Yg.u$a r0 = Yg.u.f25017b     // Catch: java.lang.Throwable -> L67
            java.lang.Object r7 = Yg.v.a(r7)     // Catch: java.lang.Throwable -> L67
            java.lang.Object r7 = Yg.u.c(r7)     // Catch: java.lang.Throwable -> L67
            r6.resumeWith(r7)     // Catch: java.lang.Throwable -> L67
            goto L91
        L67:
            r7 = move-exception
            goto La8
        L69:
            dh.e r0 = r6.f16593e     // Catch: java.lang.Throwable -> L67
            java.lang.Object r3 = r6.f16595g     // Catch: java.lang.Throwable -> L67
            dh.i r4 = r0.getContext()     // Catch: java.lang.Throwable -> L67
            java.lang.Object r3 = Ni.J.i(r4, r3)     // Catch: java.lang.Throwable -> L67
            Ni.C r5 = Ni.J.f16576a     // Catch: java.lang.Throwable -> L67
            if (r3 == r5) goto L7e
            Ii.Y0 r0 = Ii.H.m(r0, r4, r3)     // Catch: java.lang.Throwable -> L67
            goto L7f
        L7e:
            r0 = 0
        L7f:
            dh.e r5 = r6.f16593e     // Catch: java.lang.Throwable -> L9b
            r5.resumeWith(r7)     // Catch: java.lang.Throwable -> L9b
            Yg.J r7 = Yg.J.f24997a     // Catch: java.lang.Throwable -> L9b
            if (r0 == 0) goto L8e
            boolean r7 = r0.S0()     // Catch: java.lang.Throwable -> L67
            if (r7 == 0) goto L91
        L8e:
            Ni.J.f(r4, r3)     // Catch: java.lang.Throwable -> L67
        L91:
            boolean r7 = r1.z0()     // Catch: java.lang.Throwable -> L67
            if (r7 != 0) goto L91
        L97:
            r1.p0(r2)
            goto Lb4
        L9b:
            r7 = move-exception
            if (r0 == 0) goto La4
            boolean r0 = r0.S0()     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto La7
        La4:
            Ni.J.f(r4, r3)     // Catch: java.lang.Throwable -> L67
        La7:
            throw r7     // Catch: java.lang.Throwable -> L67
        La8:
            r6.f(r7)     // Catch: java.lang.Throwable -> Lac
            goto L97
        Lac:
            r6 = move-exception
            r1.p0(r2)
            throw r6
        Lb1:
            r6.resumeWith(r7)
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Ni.AbstractC3406h.b(dh.e, java.lang.Object):void");
    }

    public static final void c(Ii.J j10, InterfaceC5384i interfaceC5384i, Runnable runnable) {
        try {
            j10.Y(interfaceC5384i, runnable);
        } catch (Throwable th2) {
            throw new DispatchException(th2, j10, interfaceC5384i);
        }
    }

    public static final boolean d(Ii.J j10, InterfaceC5384i interfaceC5384i) throws DispatchException {
        try {
            return j10.m0(interfaceC5384i);
        } catch (Throwable th2) {
            throw new DispatchException(th2, j10, interfaceC5384i);
        }
    }

    public static final boolean e(C3405g c3405g) {
        Yg.J j10 = Yg.J.f24997a;
        AbstractC3060i0 abstractC3060i0B = U0.f9286a.b();
        if (abstractC3060i0B.x0()) {
            return false;
        }
        if (abstractC3060i0B.w0()) {
            c3405g.f16594f = j10;
            c3405g.f9299c = 1;
            abstractC3060i0B.s0(c3405g);
            return true;
        }
        abstractC3060i0B.u0(true);
        try {
            c3405g.run();
            do {
            } while (abstractC3060i0B.z0());
        } finally {
            try {
                return false;
            } finally {
            }
        }
        return false;
    }
}
