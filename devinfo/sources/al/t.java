package al;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class t implements h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f614a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ek.j f615b;

    /* JADX WARN: Multi-variable type inference failed */
    public t(h hVar, mk.f fVar) {
        this.f614a = hVar;
        this.f615b = (ek.j) fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v4, types: [ek.j, mk.f] */
    /* JADX WARN: Type inference failed for: r9v6, types: [ek.j, mk.f] */
    @Override // al.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(al.i r9, ck.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof al.s
            if (r0 == 0) goto L13
            r0 = r10
            al.s r0 = (al.s) r0
            int r1 = r0.f605b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f605b = r1
            goto L18
        L13:
            al.s r0 = new al.s
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f604a
            int r1 = r0.f605b
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            dk.a r6 = dk.a.f22275a
            if (r1 == 0) goto L50
            if (r1 == r4) goto L44
            if (r1 == r3) goto L3c
            if (r1 != r2) goto L34
            java.lang.Object r9 = r0.f607d
            bl.w r9 = (bl.w) r9
            ci.b.D(r10)     // Catch: java.lang.Throwable -> L32
            goto L7c
        L32:
            r10 = move-exception
            goto L86
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            java.lang.Object r9 = r0.f607d
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            ci.b.D(r10)
            goto La0
        L44:
            al.i r9 = r0.f608e
            java.lang.Object r1 = r0.f607d
            al.t r1 = (al.t) r1
            ci.b.D(r10)     // Catch: java.lang.Throwable -> L4e
            goto L63
        L4e:
            r9 = move-exception
            goto L8c
        L50:
            ci.b.D(r10)
            al.h r10 = r8.f614a     // Catch: java.lang.Throwable -> L8a
            r0.f607d = r8     // Catch: java.lang.Throwable -> L8a
            r0.f608e = r9     // Catch: java.lang.Throwable -> L8a
            r0.f605b = r4     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r10 = r10.a(r9, r0)     // Catch: java.lang.Throwable -> L8a
            if (r10 != r6) goto L62
            goto L9f
        L62:
            r1 = r8
        L63:
            bl.w r10 = new bl.w
            ck.h r3 = r0.getContext()
            r10.<init>(r9, r3)
            ek.j r9 = r1.f615b     // Catch: java.lang.Throwable -> L82
            r0.f607d = r10     // Catch: java.lang.Throwable -> L82
            r0.f608e = r5     // Catch: java.lang.Throwable -> L82
            r0.f605b = r2     // Catch: java.lang.Throwable -> L82
            java.lang.Object r9 = r9.a(r10, r5, r0)     // Catch: java.lang.Throwable -> L82
            if (r9 != r6) goto L7b
            goto L9f
        L7b:
            r9 = r10
        L7c:
            r9.releaseIntercepted()
            yj.u r9 = yj.u.f37649a
            return r9
        L82:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L86:
            r9.releaseIntercepted()
            throw r10
        L8a:
            r9 = move-exception
            r1 = r8
        L8c:
            al.k1 r10 = new al.k1
            r10.<init>(r9)
            ek.j r1 = r1.f615b
            r0.f607d = r9
            r0.f608e = r5
            r0.f605b = r3
            java.lang.Object r10 = al.z0.d(r10, r1, r9, r0)
            if (r10 != r6) goto La0
        L9f:
            return r6
        La0:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: al.t.a(al.i, ck.c):java.lang.Object");
    }
}
