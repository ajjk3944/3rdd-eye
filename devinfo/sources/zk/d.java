package zk;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class d extends nk.i implements mk.f {

    /* renamed from: i, reason: collision with root package name */
    public static final d f38329i = new d(3, h.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0075, code lost:
    
        return yj.u.f37649a;
     */
    @Override // mk.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r9, java.lang.Object r10, java.lang.Object r11) {
        /*
            r8 = this;
            r0 = r9
            zk.h r0 = (zk.h) r0
            r5 = r10
            fl.f r5 = (fl.f) r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r9 = zk.h.f38337b
            r0.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9 = zk.h.g
            java.lang.Object r9 = r9.get(r0)
            zk.p r9 = (zk.p) r9
        L13:
            boolean r10 = r0.x()
            if (r10 == 0) goto L20
            cl.u r9 = zk.j.f38355l
            fl.e r5 = (fl.e) r5
            r5.f24079e = r9
            goto L73
        L20:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r10 = zk.h.f38338c
            long r3 = r10.getAndIncrement(r0)
            int r10 = zk.j.f38347b
            long r10 = (long) r10
            long r1 = r3 / r10
            long r10 = r3 % r10
            int r10 = (int) r10
            long r6 = r9.f2939c
            int r11 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r11 == 0) goto L3e
            zk.p r11 = r0.q(r1, r9)
            if (r11 != 0) goto L3b
            goto L13
        L3b:
            r1 = r11
        L3c:
            r2 = r10
            goto L40
        L3e:
            r1 = r9
            goto L3c
        L40:
            java.lang.Object r9 = r0.I(r1, r2, r3, r5)
            r11 = r1
            cl.u r10 = zk.j.f38356m
            if (r9 != r10) goto L57
            boolean r9 = r5 instanceof xk.u1
            if (r9 == 0) goto L50
            xk.u1 r5 = (xk.u1) r5
            goto L51
        L50:
            r5 = 0
        L51:
            if (r5 == 0) goto L73
            r5.a(r11, r2)
            goto L73
        L57:
            cl.u r10 = zk.j.f38358o
            if (r9 != r10) goto L68
            long r9 = r0.u()
            int r9 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r9 >= 0) goto L66
            r11.a()
        L66:
            r9 = r11
            goto L13
        L68:
            cl.u r10 = zk.j.f38357n
            if (r9 == r10) goto L76
            r11.a()
            fl.e r5 = (fl.e) r5
            r5.f24079e = r9
        L73:
            yj.u r9 = yj.u.f37649a
            return r9
        L76:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "unexpected"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: zk.d.a(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
