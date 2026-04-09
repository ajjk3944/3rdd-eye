package al;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c extends d {

    /* renamed from: e, reason: collision with root package name */
    public final ek.j f487e;

    /* JADX WARN: Multi-variable type inference failed */
    public c(mk.e eVar, ck.h hVar, int i4, zk.a aVar) {
        super(eVar, hVar, i4, aVar);
        this.f487e = (ek.j) eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // al.d, bl.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(zk.u r5, ck.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof al.b
            if (r0 == 0) goto L13
            r0 = r6
            al.b r0 = (al.b) r0
            int r1 = r0.f477d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f477d = r1
            goto L1a
        L13:
            al.b r0 = new al.b
            ek.c r6 = (ek.c) r6
            r0.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r0.f475b
            int r1 = r0.f477d
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            zk.u r5 = r0.f474a
            ci.b.D(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            ci.b.D(r6)
            r0.f474a = r5
            r0.f477d = r2
            java.lang.Object r6 = super.c(r5, r0)
            dk.a r0 = dk.a.f22275a
            if (r6 != r0) goto L41
            return r0
        L41:
            zk.t r5 = (zk.t) r5
            zk.h r5 = r5.f38375d
            boolean r5 = r5.y()
            if (r5 == 0) goto L4e
            yj.u r5 = yj.u.f37649a
            return r5
        L4e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: al.c.c(zk.u, ck.c):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ek.j, mk.e] */
    @Override // al.d, bl.e
    public final bl.e d(ck.h hVar, int i4, zk.a aVar) {
        return new c(this.f487e, hVar, i4, aVar);
    }
}
