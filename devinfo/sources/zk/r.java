package zk;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class r extends h {

    /* renamed from: k, reason: collision with root package name */
    public final a f38371k;

    public r(int i4, a aVar) {
        super(i4);
        this.f38371k = aVar;
        if (aVar != a.f38322a) {
            if (i4 < 1) {
                throw new IllegalArgumentException(r5.c.h(i4, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + nk.v.a(h.class).c() + " instead").toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b6, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object L(java.lang.Object r16, boolean r17) {
        /*
            r15 = this;
            zk.a r1 = r15.f38371k
            zk.a r2 = zk.a.f38324c
            yj.u r8 = yj.u.f37649a
            if (r1 != r2) goto L17
            java.lang.Object r1 = super.l(r16)
            boolean r2 = r1 instanceof zk.n
            if (r2 == 0) goto L16
            boolean r2 = r1 instanceof zk.m
            if (r2 == 0) goto L15
            goto L16
        L15:
            return r8
        L16:
            return r1
        L17:
            cl.u r6 = zk.j.f38349d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = zk.h.f38341f
            java.lang.Object r1 = r1.get(r15)
            zk.p r1 = (zk.p) r1
        L21:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = zk.h.f38337b
            long r2 = r2.getAndIncrement(r15)
            r4 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r4 = r4 & r2
            r7 = 0
            boolean r7 = r15.w(r2, r7)
            int r9 = zk.j.f38347b
            long r10 = (long) r9
            long r2 = r4 / r10
            long r12 = r4 % r10
            int r12 = (int) r12
            long r13 = r1.f2939c
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 == 0) goto L53
            zk.p r2 = zk.h.c(r15, r2, r1)
            if (r2 != 0) goto L52
            if (r7 == 0) goto L21
            java.lang.Throwable r1 = r15.t()
            zk.m r2 = new zk.m
            r2.<init>(r1)
            return r2
        L52:
            r1 = r2
        L53:
            r0 = r15
            r3 = r16
            r2 = r12
            int r12 = zk.h.g(r0, r1, r2, r3, r4, r6, r7)
            if (r12 == 0) goto Lb7
            r3 = 1
            if (r12 == r3) goto Lb6
            r3 = 2
            if (r12 == r3) goto L90
            r2 = 3
            if (r12 == r2) goto L88
            r2 = 4
            if (r12 == r2) goto L71
            r2 = 5
            if (r12 == r2) goto L6d
            goto L21
        L6d:
            r1.a()
            goto L21
        L71:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = zk.h.f38338c
            long r2 = r2.get(r15)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L7e
            r1.a()
        L7e:
            java.lang.Throwable r1 = r15.t()
            zk.m r2 = new zk.m
            r2.<init>(r1)
            return r2
        L88:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "unexpected"
            r1.<init>(r2)
            throw r1
        L90:
            if (r7 == 0) goto L9f
            r1.i()
            java.lang.Throwable r1 = r15.t()
            zk.m r2 = new zk.m
            r2.<init>(r1)
            return r2
        L9f:
            boolean r3 = r6 instanceof xk.u1
            if (r3 == 0) goto La6
            xk.u1 r6 = (xk.u1) r6
            goto La7
        La6:
            r6 = 0
        La7:
            if (r6 == 0) goto Lae
            int r12 = r2 + r9
            r6.a(r1, r12)
        Lae:
            long r3 = r1.f2939c
            long r3 = r3 * r10
            long r1 = (long) r2
            long r3 = r3 + r1
            r15.o(r3)
        Lb6:
            return r8
        Lb7:
            r1.a()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: zk.r.L(java.lang.Object, boolean):java.lang.Object");
    }

    @Override // zk.h, zk.x
    public final Object h(ck.c cVar, Object obj) throws Throwable {
        if (L(obj, true) instanceof m) {
            throw t();
        }
        return yj.u.f37649a;
    }

    @Override // zk.h, zk.x
    public final Object l(Object obj) {
        return L(obj, false);
    }

    @Override // zk.h
    public final boolean z() {
        return this.f38371k == a.f38323b;
    }
}
