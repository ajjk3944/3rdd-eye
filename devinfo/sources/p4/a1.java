package p4;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a1 implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final gl.c f31169a = gl.d.a();

    /* renamed from: b, reason: collision with root package name */
    public final o.e f31170b = new o.e((byte) 0, 3);

    /* renamed from: c, reason: collision with root package name */
    public final al.f0 f31171c = new al.f0(new bh.p(2, null, 6));

    public a1(String str) {
    }

    @Override // p4.k0
    public final Object a(y yVar) {
        return new Integer(((AtomicInteger) this.f31170b.f30195b).incrementAndGet());
    }

    @Override // p4.k0
    public final Object b(ek.c cVar) {
        return new Integer(((AtomicInteger) this.f31170b.f30195b).get());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p4.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(mk.c r8, ek.c r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof p4.y0
            if (r0 == 0) goto L13
            r0 = r9
            p4.y0 r0 = (p4.y0) r0
            int r1 = r0.f31357e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31357e = r1
            goto L18
        L13:
            p4.y0 r0 = new p4.y0
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f31355c
            int r1 = r0.f31357e
            r2 = 2
            r3 = 1
            r4 = 0
            dk.a r5 = dk.a.f22275a
            if (r1 == 0) goto L45
            if (r1 == r3) goto L39
            if (r1 != r2) goto L31
            java.lang.Object r8 = r0.f31353a
            gl.a r8 = (gl.a) r8
            ci.b.D(r9)     // Catch: java.lang.Throwable -> L2f
            goto L67
        L2f:
            r9 = move-exception
            goto L6f
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            gl.c r8 = r0.f31354b
            java.lang.Object r1 = r0.f31353a
            mk.c r1 = (mk.c) r1
            ci.b.D(r9)
            r9 = r8
            r8 = r1
            goto L57
        L45:
            ci.b.D(r9)
            r0.f31353a = r8
            gl.c r9 = r7.f31169a
            r0.f31354b = r9
            r0.f31357e = r3
            java.lang.Object r1 = r9.c(r0)
            if (r1 != r5) goto L57
            goto L63
        L57:
            r0.f31353a = r9     // Catch: java.lang.Throwable -> L6b
            r0.f31354b = r4     // Catch: java.lang.Throwable -> L6b
            r0.f31357e = r2     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r8 = r8.invoke(r0)     // Catch: java.lang.Throwable -> L6b
            if (r8 != r5) goto L64
        L63:
            return r5
        L64:
            r6 = r9
            r9 = r8
            r8 = r6
        L67:
            r8.e(r4)
            return r9
        L6b:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L6f:
            r8.e(r4)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.a1.c(mk.c, ek.c):java.lang.Object");
    }

    @Override // p4.k0
    public final al.h d() {
        return this.f31171c;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p4.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(mk.e r6, ek.c r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof p4.z0
            if (r0 == 0) goto L13
            r0 = r7
            p4.z0 r0 = (p4.z0) r0
            int r1 = r0.f31372e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31372e = r1
            goto L18
        L13:
            p4.z0 r0 = new p4.z0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f31370c
            int r1 = r0.f31372e
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            boolean r6 = r0.f31369b
            gl.c r0 = r0.f31368a
            ci.b.D(r7)     // Catch: java.lang.Throwable -> L2a
            goto L53
        L2a:
            r7 = move-exception
            goto L5d
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            ci.b.D(r7)
            gl.c r7 = r5.f31169a
            boolean r1 = r7.f()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L59
            r0.f31368a = r7     // Catch: java.lang.Throwable -> L59
            r0.f31369b = r1     // Catch: java.lang.Throwable -> L59
            r0.f31372e = r2     // Catch: java.lang.Throwable -> L59
            java.lang.Object r6 = r6.invoke(r4, r0)     // Catch: java.lang.Throwable -> L59
            dk.a r0 = dk.a.f22275a
            if (r6 != r0) goto L50
            return r0
        L50:
            r0 = r7
            r7 = r6
            r6 = r1
        L53:
            if (r6 == 0) goto L58
            r0.e(r3)
        L58:
            return r7
        L59:
            r6 = move-exception
            r0 = r7
            r7 = r6
            r6 = r1
        L5d:
            if (r6 == 0) goto L62
            r0.e(r3)
        L62:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.a1.e(mk.e, ek.c):java.lang.Object");
    }
}
