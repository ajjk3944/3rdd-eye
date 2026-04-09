package w5;

/* compiled from: InstallationId.kt */
/* loaded from: classes2.dex */
public final class o {

    /* renamed from: c, reason: collision with root package name */
    public static final a f47434c = new a();

    /* renamed from: a, reason: collision with root package name */
    public final String f47435a;

    /* renamed from: b, reason: collision with root package name */
    public final String f47436b;

    /* compiled from: InstallationId.kt */
    public static final class a {
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0084, code lost:
        
            if (r10 == r1) goto L33;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r9v16 */
        /* JADX WARN: Type inference failed for: r9v17 */
        /* JADX WARN: Type inference failed for: r9v3 */
        /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r9v8 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object a(h5.c r9, h9.c r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof w5.n
                if (r0 == 0) goto L13
                r0 = r10
                w5.n r0 = (w5.n) r0
                int r1 = r0.f47433o
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f47433o = r1
                goto L18
            L13:
                w5.n r0 = new w5.n
                r0.<init>(r8, r10)
            L18:
                java.lang.Object r10 = r0.f47431m
                g9.a r1 = g9.a.COROUTINE_SUSPENDED
                int r2 = r0.f47433o
                java.lang.String r3 = ""
                java.lang.String r4 = "InstallationId"
                r5 = 2
                r6 = 1
                if (r2 == 0) goto L46
                if (r2 == r6) goto L3c
                if (r2 != r5) goto L34
                java.lang.Object r9 = r0.f47430l
                java.lang.String r9 = (java.lang.String) r9
                b9.n.b(r10)     // Catch: java.lang.Exception -> L32
                goto L87
            L32:
                r10 = move-exception
                goto L90
            L34:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L3c:
                java.lang.Object r9 = r0.f47430l
                h5.c r9 = (h5.c) r9
                b9.n.b(r10)     // Catch: java.lang.Exception -> L44
                goto L5d
            L44:
                r10 = move-exception
                goto L6c
            L46:
                b9.n.b(r10)
                com.google.android.gms.tasks.Task r10 = r9.a()     // Catch: java.lang.Exception -> L44
                java.lang.String r2 = "firebaseInstallations.getToken(false)"
                kotlin.jvm.internal.l.e(r10, r2)     // Catch: java.lang.Exception -> L44
                r0.f47430l = r9     // Catch: java.lang.Exception -> L44
                r0.f47433o = r6     // Catch: java.lang.Exception -> L44
                java.lang.Object r10 = E.u.l(r10, r0)     // Catch: java.lang.Exception -> L44
                if (r10 != r1) goto L5d
                goto L86
            L5d:
                h5.g r10 = (h5.g) r10     // Catch: java.lang.Exception -> L44
                java.lang.String r10 = r10.a()     // Catch: java.lang.Exception -> L44
                java.lang.String r2 = "{\n          firebaseInst…).await().token\n        }"
                kotlin.jvm.internal.l.e(r10, r2)     // Catch: java.lang.Exception -> L44
                r7 = r10
                r10 = r9
                r9 = r7
                goto L73
            L6c:
                java.lang.String r2 = "Error getting authentication token."
                android.util.Log.w(r4, r2, r10)
                r10 = r9
                r9 = r3
            L73:
                com.google.android.gms.tasks.Task r10 = r10.getId()     // Catch: java.lang.Exception -> L32
                java.lang.String r2 = "firebaseInstallations.id"
                kotlin.jvm.internal.l.e(r10, r2)     // Catch: java.lang.Exception -> L32
                r0.f47430l = r9     // Catch: java.lang.Exception -> L32
                r0.f47433o = r5     // Catch: java.lang.Exception -> L32
                java.lang.Object r10 = E.u.l(r10, r0)     // Catch: java.lang.Exception -> L32
                if (r10 != r1) goto L87
            L86:
                return r1
            L87:
                java.lang.String r0 = "{\n          firebaseInst…ions.id.await()\n        }"
                kotlin.jvm.internal.l.e(r10, r0)     // Catch: java.lang.Exception -> L32
                java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> L32
                r3 = r10
                goto L95
            L90:
                java.lang.String r0 = "Error getting Firebase installation id ."
                android.util.Log.w(r4, r0, r10)
            L95:
                w5.o r10 = new w5.o
                r10.<init>(r3, r9)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: w5.o.a.a(h5.c, h9.c):java.lang.Object");
        }
    }

    public o(String str, String str2) {
        this.f47435a = str;
        this.f47436b = str2;
    }
}
