package bl;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class f extends e {

    /* renamed from: d, reason: collision with root package name */
    public final al.h f2291d;

    public f(al.h hVar, ck.h hVar2, int i4, zk.a aVar) {
        super(hVar2, i4, aVar);
        this.f2291d = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    @Override // bl.e, al.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(al.i r6, ck.c r7) {
        /*
            r5 = this;
            int r0 = r5.f2289b
            r1 = -3
            dk.a r2 = dk.a.f22275a
            if (r0 != r1) goto L6e
            ck.h r0 = r7.getContext()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            s2.u r3 = new s2.u
            r4 = 17
            r3.<init>(r4)
            ck.h r4 = r5.f2288a
            java.lang.Object r1 = r4.G(r1, r3)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L27
            ck.h r1 = r0.y(r4)
            goto L2c
        L27:
            r1 = 0
            ck.h r1 = xk.x.k(r0, r4, r1)
        L2c:
            boolean r3 = nk.k.a(r1, r0)
            if (r3 == 0) goto L39
            java.lang.Object r6 = r5.f(r6, r7)
            if (r6 != r2) goto L75
            return r6
        L39:
            ck.d r3 = ck.d.f2897a
            ck.f r4 = r1.O(r3)
            ck.f r0 = r0.O(r3)
            boolean r0 = nk.k.a(r4, r0)
            if (r0 == 0) goto L6e
            ck.h r0 = r7.getContext()
            boolean r3 = r6 instanceof bl.a0
            if (r3 != 0) goto L5c
            boolean r3 = r6 instanceof bl.u
            if (r3 == 0) goto L56
            goto L5c
        L56:
            al.c0 r3 = new al.c0
            r3.<init>(r6, r0)
            r6 = r3
        L5c:
            al.p r0 = new al.p
            r3 = 0
            r4 = 7
            r0.<init>(r5, r3, r4)
            java.lang.Object r3 = cl.b.m(r1)
            java.lang.Object r6 = bl.c.a(r1, r6, r3, r0, r7)
            if (r6 != r2) goto L75
            return r6
        L6e:
            java.lang.Object r6 = super.a(r6, r7)
            if (r6 != r2) goto L75
            return r6
        L75:
            yj.u r6 = yj.u.f37649a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: bl.f.a(al.i, ck.c):java.lang.Object");
    }

    @Override // bl.e
    public final Object c(zk.u uVar, ck.c cVar) {
        Object objF = f(new a0(uVar), cVar);
        return objF == dk.a.f22275a ? objF : yj.u.f37649a;
    }

    public abstract Object f(al.i iVar, ck.c cVar);

    @Override // bl.e
    public final String toString() {
        return this.f2291d + " -> " + super.toString();
    }
}
