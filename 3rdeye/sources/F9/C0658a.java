package F9;

/* compiled from: Atomic.kt */
/* renamed from: F9.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0658a {

    /* renamed from: a, reason: collision with root package name */
    public static final y f1744a = new y("NO_DECISION");

    /* renamed from: b, reason: collision with root package name */
    public static final y f1745b = new y("UNDEFINED");

    /* renamed from: c, reason: collision with root package name */
    public static final y f1746c = new y("REUSABLE_CLAIMED");

    /* JADX WARN: Removed duplicated region for block: B:32:0x0090 A[Catch: all -> 0x006d, DONT_GENERATE, TryCatch #1 {all -> 0x006d, blocks: (B:16:0x004a, B:18:0x0058, B:20:0x005e, B:33:0x0093, B:23:0x006f, B:25:0x007d, B:30:0x008a, B:32:0x0090, B:38:0x00a0, B:41:0x00a9, B:40:0x00a6, B:28:0x0083), top: B:52:0x004a, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(f9.InterfaceC4347e r9, java.lang.Object r10) {
        /*
            boolean r0 = r9 instanceof F9.i
            if (r0 == 0) goto Lb4
            F9.i r9 = (F9.i) r9
            java.lang.Throwable r0 = b9.m.a(r10)
            if (r0 != 0) goto Le
            r1 = r10
            goto L14
        Le:
            A9.t r1 = new A9.t
            r2 = 0
            r1.<init>(r2, r0)
        L14:
            h9.c r0 = r9.f1756f
            f9.h r2 = r0.getContext()
            A9.A r3 = r9.f1755e
            boolean r2 = r3.P0(r2)
            r4 = 1
            if (r2 == 0) goto L2f
            r9.f1757g = r1
            r9.f207d = r4
            f9.h r10 = r0.getContext()
            r3.N0(r10, r9)
            return
        L2f:
            A9.a0 r2 = A9.N0.a()
            long r5 = r2.f221c
            r7 = 4294967296(0x100000000, double:2.121995791E-314)
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 < 0) goto L46
            r9.f1757g = r1
            r9.f207d = r4
            r2.S0(r9)
            goto Lae
        L46:
            r2.T0(r4)
            r3 = 0
            f9.h r5 = r0.getContext()     // Catch: java.lang.Throwable -> L6d
            A9.o0$a r6 = A9.InterfaceC0594o0.a.f263b     // Catch: java.lang.Throwable -> L6d
            f9.h$a r5 = r5.get(r6)     // Catch: java.lang.Throwable -> L6d
            A9.o0 r5 = (A9.InterfaceC0594o0) r5     // Catch: java.lang.Throwable -> L6d
            if (r5 == 0) goto L6f
            boolean r6 = r5.isActive()     // Catch: java.lang.Throwable -> L6d
            if (r6 != 0) goto L6f
            java.util.concurrent.CancellationException r10 = r5.A()     // Catch: java.lang.Throwable -> L6d
            r9.a(r1, r10)     // Catch: java.lang.Throwable -> L6d
            b9.m$a r10 = b9.n.a(r10)     // Catch: java.lang.Throwable -> L6d
            r9.resumeWith(r10)     // Catch: java.lang.Throwable -> L6d
            goto L93
        L6d:
            r10 = move-exception
            goto Laa
        L6f:
            java.lang.Object r1 = r9.f1758h     // Catch: java.lang.Throwable -> L6d
            f9.h r5 = r0.getContext()     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r1 = F9.A.c(r5, r1)     // Catch: java.lang.Throwable -> L6d
            F9.y r6 = F9.A.f1727a     // Catch: java.lang.Throwable -> L6d
            if (r1 == r6) goto L82
            A9.S0 r6 = A9.C0609x.c(r0, r5, r1)     // Catch: java.lang.Throwable -> L6d
            goto L83
        L82:
            r6 = r3
        L83:
            r0.resumeWith(r10)     // Catch: java.lang.Throwable -> L9d
            b9.A r10 = b9.C1992A.f18074a     // Catch: java.lang.Throwable -> L9d
            if (r6 == 0) goto L90
            boolean r10 = r6.f0()     // Catch: java.lang.Throwable -> L6d
            if (r10 == 0) goto L93
        L90:
            F9.A.a(r5, r1)     // Catch: java.lang.Throwable -> L6d
        L93:
            boolean r10 = r2.V0()     // Catch: java.lang.Throwable -> L6d
            if (r10 != 0) goto L93
        L99:
            r2.R0(r4)
            goto Lae
        L9d:
            r10 = move-exception
            if (r6 == 0) goto La6
            boolean r0 = r6.f0()     // Catch: java.lang.Throwable -> L6d
            if (r0 == 0) goto La9
        La6:
            F9.A.a(r5, r1)     // Catch: java.lang.Throwable -> L6d
        La9:
            throw r10     // Catch: java.lang.Throwable -> L6d
        Laa:
            r9.f(r10, r3)     // Catch: java.lang.Throwable -> Laf
            goto L99
        Lae:
            return
        Laf:
            r9 = move-exception
            r2.R0(r4)
            throw r9
        Lb4:
            r9.resumeWith(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: F9.C0658a.a(f9.e, java.lang.Object):void");
    }
}
