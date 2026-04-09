package v5;

import java.util.concurrent.atomic.AtomicBoolean;
import t5.v;
import t5.w;
import t6.i0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class r implements w, s {

    /* renamed from: a, reason: collision with root package name */
    public final f f35926a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f35927b;

    /* renamed from: c, reason: collision with root package name */
    public final zj.l f35928c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f35929d;

    public r(f fVar, boolean z3) {
        nk.k.e(fVar, "delegate");
        this.f35926a = fVar;
        this.f35927b = z3;
        this.f35928c = new zj.l();
        this.f35929d = new AtomicBoolean(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // t5.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r6, mk.c r7, ek.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof v5.q
            if (r0 == 0) goto L13
            r0 = r8
            v5.q r0 = (v5.q) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            v5.q r0 = new v5.q
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f35924e
            int r1 = r0.g
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L38
            if (r1 != r2) goto L30
            v5.f r6 = r0.f35923d
            mk.c r7 = r0.f35922c
            java.lang.String r1 = r0.f35921b
            v5.r r0 = r0.f35920a
            ci.b.D(r8)
            r8 = r6
            r6 = r1
            goto L6f
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            ci.b.D(r8)
            java.util.concurrent.atomic.AtomicBoolean r8 = r5.f35929d
            boolean r8 = r8.get()
            r1 = 21
            if (r8 != 0) goto L98
            ck.h r8 = r0.getContext()
            i7.b r4 = v5.a.f35856b
            ck.f r8 = r8.O(r4)
            v5.a r8 = (v5.a) r8
            if (r8 == 0) goto L92
            v5.r r8 = r8.f35857a
            if (r8 != r5) goto L92
            r0.f35920a = r5
            r0.f35921b = r6
            r0.f35922c = r7
            v5.f r8 = r5.f35926a
            r0.f35923d = r8
            r0.g = r2
            gl.a r1 = r8.f35875b
            java.lang.Object r0 = r1.c(r0)
            dk.a r1 = dk.a.f22275a
            if (r0 != r1) goto L6e
            return r1
        L6e:
            r0 = r5
        L6f:
            v5.k r1 = new v5.k     // Catch: java.lang.Throwable -> L85
            v5.f r2 = r0.f35926a     // Catch: java.lang.Throwable -> L85
            d6.c r6 = r2.S(r6)     // Catch: java.lang.Throwable -> L85
            r1.<init>(r0, r6)     // Catch: java.lang.Throwable -> L85
            java.lang.Object r6 = r7.invoke(r1)     // Catch: java.lang.Throwable -> L87
            com.google.android.gms.internal.measurement.d5.c(r1, r3)     // Catch: java.lang.Throwable -> L85
            r8.e(r3)
            return r6
        L85:
            r6 = move-exception
            goto L8e
        L87:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> L89
        L89:
            r7 = move-exception
            com.google.android.gms.internal.measurement.d5.c(r1, r6)     // Catch: java.lang.Throwable -> L85
            throw r7     // Catch: java.lang.Throwable -> L85
        L8e:
            r8.e(r3)
            throw r6
        L92:
            java.lang.String r6 = "Attempted to use connection on a different coroutine"
            t6.i0.v(r1, r6)
            throw r3
        L98:
            java.lang.String r6 = "Connection is recycled"
            t6.i0.v(r1, r6)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: v5.r.a(java.lang.String, mk.c, ek.c):java.lang.Object");
    }

    @Override // t5.w
    public final Object b(v vVar, mk.e eVar, ek.j jVar) {
        if (this.f35929d.get()) {
            i0.v(21, "Connection is recycled");
            throw null;
        }
        a aVar = (a) jVar.getContext().O(a.f35856b);
        if (aVar != null && aVar.f35857a == this) {
            return g(vVar, eVar, jVar);
        }
        i0.v(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    @Override // v5.s
    public final d6.a c() {
        return this.f35926a;
    }

    @Override // t5.w
    public final Object d(ek.j jVar) {
        if (this.f35929d.get()) {
            i0.v(21, "Connection is recycled");
            throw null;
        }
        a aVar = (a) jVar.getContext().O(a.f35856b);
        if (aVar != null && aVar.f35857a == this) {
            return Boolean.valueOf(!this.f35928c.isEmpty());
        }
        i0.v(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(t5.v r8, ek.c r9) {
        /*
            r7 = this;
            java.lang.String r0 = "SAVEPOINT '"
            boolean r1 = r9 instanceof v5.n
            if (r1 == 0) goto L15
            r1 = r9
            v5.n r1 = (v5.n) r1
            int r2 = r1.f35907f
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f35907f = r2
            goto L1a
        L15:
            v5.n r1 = new v5.n
            r1.<init>(r7, r9)
        L1a:
            java.lang.Object r9 = r1.f35905d
            int r2 = r1.f35907f
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            v5.f r8 = r1.f35904c
            t5.v r2 = r1.f35903b
            v5.r r1 = r1.f35902a
            ci.b.D(r9)
            r9 = r8
            r8 = r2
            goto L50
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            ci.b.D(r9)
            r1.f35902a = r7
            r1.f35903b = r8
            v5.f r9 = r7.f35926a
            r1.f35904c = r9
            r1.f35907f = r3
            gl.a r2 = r9.f35875b
            java.lang.Object r1 = r2.c(r1)
            dk.a r2 = dk.a.f22275a
            if (r1 != r2) goto L4f
            return r2
        L4f:
            r1 = r7
        L50:
            r2 = 0
            zj.l r4 = r1.f35928c     // Catch: java.lang.Throwable -> L6e
            v5.f r1 = r1.f35926a     // Catch: java.lang.Throwable -> L6e
            int r5 = r4.f38315c     // Catch: java.lang.Throwable -> L6e
            boolean r6 = r4.isEmpty()     // Catch: java.lang.Throwable -> L6e
            if (r6 == 0) goto L82
            int r8 = r8.ordinal()     // Catch: java.lang.Throwable -> L6e
            if (r8 == 0) goto L7c
            if (r8 == r3) goto L76
            r0 = 2
            if (r8 != r0) goto L70
            java.lang.String r8 = "BEGIN EXCLUSIVE TRANSACTION"
            t6.i0.g(r1, r8)     // Catch: java.lang.Throwable -> L6e
            goto L96
        L6e:
            r8 = move-exception
            goto La4
        L70:
            ac.m r8 = new ac.m     // Catch: java.lang.Throwable -> L6e
            r8.<init>()     // Catch: java.lang.Throwable -> L6e
            throw r8     // Catch: java.lang.Throwable -> L6e
        L76:
            java.lang.String r8 = "BEGIN IMMEDIATE TRANSACTION"
            t6.i0.g(r1, r8)     // Catch: java.lang.Throwable -> L6e
            goto L96
        L7c:
            java.lang.String r8 = "BEGIN DEFERRED TRANSACTION"
            t6.i0.g(r1, r8)     // Catch: java.lang.Throwable -> L6e
            goto L96
        L82:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6e
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L6e
            r8.append(r5)     // Catch: java.lang.Throwable -> L6e
            r0 = 39
            r8.append(r0)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L6e
            t6.i0.g(r1, r8)     // Catch: java.lang.Throwable -> L6e
        L96:
            v5.m r8 = new v5.m     // Catch: java.lang.Throwable -> L6e
            r8.<init>(r5)     // Catch: java.lang.Throwable -> L6e
            r4.addLast(r8)     // Catch: java.lang.Throwable -> L6e
            yj.u r8 = yj.u.f37649a     // Catch: java.lang.Throwable -> L6e
            r9.e(r2)
            return r8
        La4:
            r9.e(r2)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: v5.r.e(t5.v, ek.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(boolean r8, ek.c r9) {
        /*
            r7 = this;
            java.lang.String r0 = "ROLLBACK TRANSACTION TO SAVEPOINT '"
            java.lang.String r1 = "RELEASE SAVEPOINT '"
            boolean r2 = r9 instanceof v5.o
            if (r2 == 0) goto L17
            r2 = r9
            v5.o r2 = (v5.o) r2
            int r3 = r2.f35913f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f35913f = r3
            goto L1c
        L17:
            v5.o r2 = new v5.o
            r2.<init>(r7, r9)
        L1c:
            java.lang.Object r9 = r2.f35911d
            int r3 = r2.f35913f
            r4 = 1
            if (r3 == 0) goto L37
            if (r3 != r4) goto L2f
            boolean r8 = r2.f35910c
            v5.f r3 = r2.f35909b
            v5.r r2 = r2.f35908a
            ci.b.D(r9)
            goto L50
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            ci.b.D(r9)
            r2.f35908a = r7
            v5.f r3 = r7.f35926a
            r2.f35909b = r3
            r2.f35910c = r8
            r2.f35913f = r4
            gl.a r9 = r3.f35875b
            java.lang.Object r9 = r9.c(r2)
            dk.a r2 = dk.a.f22275a
            if (r9 != r2) goto L4f
            return r2
        L4f:
            r2 = r7
        L50:
            r9 = 0
            zj.l r4 = r2.f35928c     // Catch: java.lang.Throwable -> L74
            v5.f r2 = r2.f35926a     // Catch: java.lang.Throwable -> L74
            boolean r5 = r4.isEmpty()     // Catch: java.lang.Throwable -> L74
            if (r5 != 0) goto Lb1
            java.lang.Object r5 = zj.n.l0(r4)     // Catch: java.lang.Throwable -> L74
            v5.m r5 = (v5.m) r5     // Catch: java.lang.Throwable -> L74
            r6 = 39
            if (r8 == 0) goto L8b
            r5.getClass()     // Catch: java.lang.Throwable -> L74
            boolean r8 = r4.isEmpty()     // Catch: java.lang.Throwable -> L74
            if (r8 == 0) goto L76
            java.lang.String r8 = "END TRANSACTION"
            t6.i0.g(r2, r8)     // Catch: java.lang.Throwable -> L74
            goto Lab
        L74:
            r8 = move-exception
            goto Lb9
        L76:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L74
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L74
            int r0 = r5.f35901a     // Catch: java.lang.Throwable -> L74
            r8.append(r0)     // Catch: java.lang.Throwable -> L74
            r8.append(r6)     // Catch: java.lang.Throwable -> L74
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L74
            t6.i0.g(r2, r8)     // Catch: java.lang.Throwable -> L74
            goto Lab
        L8b:
            boolean r8 = r4.isEmpty()     // Catch: java.lang.Throwable -> L74
            if (r8 == 0) goto L97
            java.lang.String r8 = "ROLLBACK TRANSACTION"
            t6.i0.g(r2, r8)     // Catch: java.lang.Throwable -> L74
            goto Lab
        L97:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L74
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L74
            int r0 = r5.f35901a     // Catch: java.lang.Throwable -> L74
            r8.append(r0)     // Catch: java.lang.Throwable -> L74
            r8.append(r6)     // Catch: java.lang.Throwable -> L74
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L74
            t6.i0.g(r2, r8)     // Catch: java.lang.Throwable -> L74
        Lab:
            yj.u r8 = yj.u.f37649a     // Catch: java.lang.Throwable -> L74
            r3.e(r9)
            return r8
        Lb1:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L74
            java.lang.String r0 = "Not in a transaction"
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L74
            throw r8     // Catch: java.lang.Throwable -> L74
        Lb9:
            r3.e(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: v5.r.f(boolean, ek.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(t5.v r10, mk.e r11, ek.c r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 198
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v5.r.g(t5.v, mk.e, ek.c):java.lang.Object");
    }
}
