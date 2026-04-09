package j2;

import android.view.Choreographer;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class l0 implements ck.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27218a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f27219b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f27220c;

    public l0(Choreographer choreographer, j0 j0Var) {
        this.f27218a = 0;
        this.f27219b = choreographer;
        this.f27220c = j0Var;
    }

    private final Object b(mk.c cVar, ek.c cVar2) {
        j0 j0Var = (j0) this.f27220c;
        xk.h hVar = new xk.h(1, a.a.r(cVar2));
        hVar.s();
        k0 k0Var = new k0(hVar, this, cVar);
        if (nk.k.a(j0Var.f27191c, (Choreographer) this.f27219b)) {
            synchronized (j0Var.f27193e) {
                j0Var.g.add(k0Var);
                if (!j0Var.j) {
                    j0Var.j = true;
                    j0Var.f27191c.postFrameCallback(j0Var.f27197k);
                }
            }
            hVar.u(new c2.w(5, j0Var, k0Var));
        } else {
            ((Choreographer) this.f27219b).postFrameCallback(k0Var);
            hVar.u(new c2.w(6, this, k0Var));
        }
        return hVar.r();
    }

    @Override // ck.h
    public final Object G(Object obj, mk.e eVar) {
        switch (this.f27218a) {
        }
        return eVar.invoke(obj, this);
    }

    @Override // ck.h
    public final ck.h L(ck.g gVar) {
        switch (this.f27218a) {
        }
        return wd.b.C(this, gVar);
    }

    @Override // ck.h
    public final ck.f O(ck.g gVar) {
        switch (this.f27218a) {
        }
        return wd.b.p(this, gVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(mk.c r7, ek.c r8) {
        /*
            r6 = this;
            int r0 = r6.f27218a
            switch(r0) {
                case 0: goto Lc1;
                case 1: goto L91;
                default: goto L5;
            }
        L5:
            boolean r0 = r8 instanceof u0.e1
            if (r0 == 0) goto L18
            r0 = r8
            u0.e1 r0 = (u0.e1) r0
            int r1 = r0.f34778d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.f34778d = r1
            goto L1d
        L18:
            u0.e1 r0 = new u0.e1
            r0.<init>(r6, r8)
        L1d:
            java.lang.Object r8 = r0.f34776b
            dk.a r1 = dk.a.f22275a
            int r2 = r0.f34778d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            ci.b.D(r8)
            goto L8d
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            mk.c r7 = r0.f34775a
            ci.b.D(r8)
            goto L7d
        L3d:
            ci.b.D(r8)
            java.lang.Object r8 = r6.f27220c
            b5.i0 r8 = (b5.i0) r8
            r0.f34775a = r7
            r0.f34778d = r4
            boolean r2 = r8.e()
            if (r2 == 0) goto L51
            yj.u r8 = yj.u.f37649a
            goto L7a
        L51:
            xk.h r2 = new xk.h
            ck.c r5 = a.a.r(r0)
            r2.<init>(r4, r5)
            r2.s()
            java.lang.Object r4 = r8.f1822c
            monitor-enter(r4)
            java.lang.Object r5 = r8.f1821b     // Catch: java.lang.Throwable -> L8e
            java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch: java.lang.Throwable -> L8e
            r5.add(r2)     // Catch: java.lang.Throwable -> L8e
            monitor-exit(r4)
            g1.a r4 = new g1.a
            r5 = 2
            r4.<init>(r5, r8, r2)
            r2.u(r4)
            java.lang.Object r8 = r2.r()
            if (r8 != r1) goto L78
            goto L7a
        L78:
            yj.u r8 = yj.u.f37649a
        L7a:
            if (r8 != r1) goto L7d
            goto L8c
        L7d:
            java.lang.Object r8 = r6.f27219b
            j2.l0 r8 = (j2.l0) r8
            r2 = 0
            r0.f34775a = r2
            r0.f34778d = r3
            java.lang.Object r8 = r8.a(r7, r0)
            if (r8 != r1) goto L8d
        L8c:
            r8 = r1
        L8d:
            return r8
        L8e:
            r7 = move-exception
            monitor-exit(r4)
            throw r7
        L91:
            xk.h r0 = new xk.h
            ck.c r8 = a.a.r(r8)
            r1 = 1
            r0.<init>(r1, r8)
            r0.s()
            java.lang.Object r8 = r6.f27220c
            androidx.lifecycle.f1 r8 = (androidx.lifecycle.f1) r8
            u0.d r1 = new u0.d
            r1.<init>()
            r1.f34760a = r0
            r1.f34761b = r7
            java.lang.Object r7 = r6.f27219b
            u0.n1 r7 = (u0.n1) r7
            u0.f r7 = r8.o(r1, r7)
            c2.d0 r8 = new c2.d0
            r1 = 3
            r8.<init>(r1, r7)
            r0.u(r8)
            java.lang.Object r7 = r0.r()
            return r7
        Lc1:
            java.lang.Object r7 = r6.b(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.l0.a(mk.c, ek.c):java.lang.Object");
    }

    @Override // ck.f
    public final ck.g getKey() {
        switch (this.f27218a) {
        }
        return u0.e.f34768c;
    }

    @Override // ck.h
    public final ck.h y(ck.h hVar) {
        switch (this.f27218a) {
        }
        return wd.b.O(this, hVar);
    }

    public l0(l0 l0Var) {
        this.f27218a = 2;
        this.f27219b = l0Var;
        this.f27220c = new b5.i0(13, false);
    }

    public l0(u0.n1 n1Var) {
        this.f27218a = 1;
        this.f27219b = n1Var;
        this.f27220c = new androidx.lifecycle.f1(1);
    }
}
