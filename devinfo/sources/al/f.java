package al;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f510a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f511b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ nk.u f512c;

    public f(g gVar, nk.u uVar, i iVar) {
        this.f512c = uVar;
        this.f511b = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    @Override // al.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.lang.Object r6, ck.c r7) throws java.lang.Throwable {
        /*
            r5 = this;
            int r0 = r5.f510a
            switch(r0) {
                case 0: goto L52;
                default: goto L5;
            }
        L5:
            boolean r0 = r7 instanceof al.y
            if (r0 == 0) goto L18
            r0 = r7
            al.y r0 = (al.y) r0
            int r1 = r0.f648d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.f648d = r1
            goto L1d
        L18:
            al.y r0 = new al.y
            r0.<init>(r5, r7)
        L1d:
            java.lang.Object r7 = r0.f646b
            int r1 = r0.f648d
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            al.f r6 = r0.f645a
            ci.b.D(r7)     // Catch: java.lang.Throwable -> L2c
            goto L48
        L2c:
            r7 = move-exception
            goto L4d
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            ci.b.D(r7)
            al.i r7 = r5.f511b     // Catch: java.lang.Throwable -> L4b
            r0.f645a = r5     // Catch: java.lang.Throwable -> L4b
            r0.f648d = r2     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r6 = r7.c(r6, r0)     // Catch: java.lang.Throwable -> L4b
            dk.a r7 = dk.a.f22275a
            if (r6 != r7) goto L48
            goto L4a
        L48:
            yj.u r7 = yj.u.f37649a
        L4a:
            return r7
        L4b:
            r7 = move-exception
            r6 = r5
        L4d:
            nk.u r6 = r6.f512c
            r6.f29986a = r7
            throw r7
        L52:
            boolean r0 = r7 instanceof al.e
            if (r0 == 0) goto L65
            r0 = r7
            al.e r0 = (al.e) r0
            int r1 = r0.f501c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L65
            int r1 = r1 - r2
            r0.f501c = r1
            goto L6a
        L65:
            al.e r0 = new al.e
            r0.<init>(r5, r7)
        L6a:
            java.lang.Object r7 = r0.f499a
            int r1 = r0.f501c
            yj.u r2 = yj.u.f37649a
            r3 = 1
            if (r1 == 0) goto L81
            if (r1 != r3) goto L79
            ci.b.D(r7)
            goto La1
        L79:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L81:
            ci.b.D(r7)
            nk.u r7 = r5.f512c
            java.lang.Object r1 = r7.f29986a
            cl.u r4 = bl.c.f2285b
            if (r1 == r4) goto L92
            boolean r1 = nk.k.a(r1, r6)
            if (r1 != 0) goto La1
        L92:
            r7.f29986a = r6
            r0.f501c = r3
            al.i r7 = r5.f511b
            java.lang.Object r6 = r7.c(r6, r0)
            dk.a r7 = dk.a.f22275a
            if (r6 != r7) goto La1
            r2 = r7
        La1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: al.f.c(java.lang.Object, ck.c):java.lang.Object");
    }

    public f(i iVar, nk.u uVar) {
        this.f511b = iVar;
        this.f512c = uVar;
    }
}
