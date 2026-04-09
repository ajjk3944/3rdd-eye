package androidx.lifecycle;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g extends k0 {

    /* renamed from: m, reason: collision with root package name */
    public va.o f1139m;

    @Override // androidx.lifecycle.k0, androidx.lifecycle.l0
    public final void f() {
        super.f();
        va.o oVar = this.f1139m;
        if (oVar != null) {
            xk.a0 a0Var = (xk.a0) oVar.g;
            ck.c cVar = null;
            if (a0Var != null) {
                a0Var.e(null);
            }
            oVar.g = null;
            if (((xk.a0) oVar.f36150f) != null) {
                return;
            }
            oVar.f36150f = xk.x.v((cl.d) oVar.f36148d, null, null, new al.p(oVar, cVar, 1), 3);
        }
    }

    @Override // androidx.lifecycle.k0, androidx.lifecycle.l0
    public final void g() {
        super.g();
        va.o oVar = this.f1139m;
        if (oVar != null) {
            if (((xk.a0) oVar.g) != null) {
                throw new IllegalStateException("Cancel call cannot happen without a maybeRun");
            }
            cl.d dVar = (cl.d) oVar.f36148d;
            el.e eVar = xk.g0.f37189a;
            oVar.g = xk.x.v(dVar, cl.o.f2935a.f37658f, null, new al.k(oVar, null, 1), 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(ek.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.lifecycle.f
            if (r0 == 0) goto L13
            r0 = r5
            androidx.lifecycle.f r0 = (androidx.lifecycle.f) r0
            int r1 = r0.f1131c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1131c = r1
            goto L18
        L13:
            androidx.lifecycle.f r0 = new androidx.lifecycle.f
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f1129a
            int r0 = r0.f1131c
            if (r0 == 0) goto L2d
            r1 = 1
            if (r0 != r1) goto L25
            ci.b.D(r5)
            return
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2d:
            ci.b.D(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.g.k(ek.c):void");
    }
}
