package C5;

/* loaded from: classes3.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final B2.a f1184a = new B2.a("NO_VALUE", 1);

    /* renamed from: b, reason: collision with root package name */
    public static final B2.a f1185b = new B2.a("NONE", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final B2.a f1186c = new B2.a("PENDING", 1);

    public static final void a(Object[] objArr, long j6, Object obj) {
        objArr[((int) j6) & (objArr.length - 1)] = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(C5.b r4, j5.b r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof C5.g
            if (r0 == 0) goto L13
            r0 = r5
            C5.g r0 = (C5.g) r0
            int r1 = r0.f1167g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1167g = r1
            goto L18
        L13:
            C5.g r0 = new C5.g
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f1166f
            int r1 = r0.f1167g
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            C5.f r4 = r0.f1165e
            q5.o r0 = r0.f1164d
            R2.a.H(r5)     // Catch: D5.a -> L29
            goto L5a
        L29:
            r5 = move-exception
            goto L56
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            R2.a.H(r5)
            q5.o r5 = new q5.o
            r5.<init>()
            C5.f r1 = new C5.f
            r3 = 0
            r1.<init>(r3, r5)
            r0.f1164d = r5     // Catch: D5.a -> L52
            r0.f1165e = r1     // Catch: D5.a -> L52
            r0.f1167g = r2     // Catch: D5.a -> L52
            java.lang.Object r4 = r4.k(r1, r0)     // Catch: D5.a -> L52
            i5.a r0 = i5.EnumC2380a.f20635a
            if (r4 != r0) goto L50
            return r0
        L50:
            r0 = r5
            goto L5a
        L52:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r1
        L56:
            C5.f r1 = r5.f1293a
            if (r1 != r4) goto L5d
        L5a:
            java.lang.Object r4 = r0.f23299a
            return r4
        L5d:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: C5.l.b(C5.b, j5.b):java.lang.Object");
    }
}
