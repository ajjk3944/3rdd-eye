package pf;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class t implements rf.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31896a;

    /* JADX WARN: Code restructure failed: missing block: B:36:0x008a, code lost:
    
        if (r10 == r6) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(df.d r9, ek.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof pf.w
            if (r0 == 0) goto L13
            r0 = r10
            pf.w r0 = (pf.w) r0
            int r1 = r0.f31912d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31912d = r1
            goto L18
        L13:
            pf.w r0 = new pf.w
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f31910b
            int r1 = r0.f31912d
            java.lang.String r2 = "FirebaseSessions"
            r3 = 2
            r4 = 1
            java.lang.String r5 = ""
            dk.a r6 = dk.a.f22275a
            if (r1 == 0) goto L47
            if (r1 == r4) goto L3d
            if (r1 != r3) goto L35
            java.lang.Object r9 = r0.f31909a
            java.lang.String r9 = (java.lang.String) r9
            ci.b.D(r10)     // Catch: java.lang.Exception -> L32
            goto L8d
        L32:
            r10 = move-exception
            goto L94
        L35:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3d:
            java.lang.Object r9 = r0.f31909a
            df.d r9 = (df.d) r9
            ci.b.D(r10)     // Catch: java.lang.Exception -> L45
            goto L64
        L45:
            r10 = move-exception
            goto L70
        L47:
            ci.b.D(r10)
            r10 = r9
            df.c r10 = (df.c) r10     // Catch: java.lang.Exception -> L45
            com.google.android.gms.tasks.Task r9 = r10.f()     // Catch: java.lang.Exception -> L45
            java.lang.String r1 = "getToken(...)"
            nk.k.d(r9, r1)     // Catch: java.lang.Exception -> L6c
            r0.f31909a = r10     // Catch: java.lang.Exception -> L6c
            r0.f31912d = r4     // Catch: java.lang.Exception -> L6c
            java.lang.Object r9 = pk.a.b(r9, r0)     // Catch: java.lang.Exception -> L6c
            if (r9 != r6) goto L61
            goto L8c
        L61:
            r7 = r10
            r10 = r9
            r9 = r7
        L64:
            df.a r10 = (df.a) r10     // Catch: java.lang.Exception -> L45
            java.lang.String r10 = r10.f22226a     // Catch: java.lang.Exception -> L45
            r7 = r10
            r10 = r9
            r9 = r7
            goto L77
        L6c:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L70:
            java.lang.String r1 = "Error getting authentication token."
            android.util.Log.w(r2, r1, r10)
            r10 = r9
            r9 = r5
        L77:
            df.c r10 = (df.c) r10     // Catch: java.lang.Exception -> L32
            com.google.android.gms.tasks.Task r10 = r10.d()     // Catch: java.lang.Exception -> L32
            java.lang.String r1 = "getId(...)"
            nk.k.d(r10, r1)     // Catch: java.lang.Exception -> L32
            r0.f31909a = r9     // Catch: java.lang.Exception -> L32
            r0.f31912d = r3     // Catch: java.lang.Exception -> L32
            java.lang.Object r10 = pk.a.b(r10, r0)     // Catch: java.lang.Exception -> L32
            if (r10 != r6) goto L8d
        L8c:
            return r6
        L8d:
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> L32
            if (r10 != 0) goto L92
            goto L99
        L92:
            r5 = r10
            goto L99
        L94:
            java.lang.String r0 = "Error getting Firebase installation id ."
            android.util.Log.w(r2, r0, r10)
        L99:
            pf.x r10 = new pf.x
            r10.<init>(r5, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: pf.t.a(df.d, ek.c):java.lang.Object");
    }

    @Override // xj.a
    public Object get() {
        switch (this.f31896a) {
            case 0:
                return g1.f31825a;
            default:
                return h1.f31834a;
        }
    }
}
