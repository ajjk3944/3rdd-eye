package A9;

/* compiled from: CancellableContinuationImpl.kt */
/* renamed from: A9.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0585k {

    /* renamed from: a, reason: collision with root package name */
    public static final F9.y f254a = new F9.y("RESUME_TOKEN");

    public static final Object a(P0 p02, p9.p pVar) throws Throwable {
        Object c0602t;
        Object objS;
        C0572d0.d(p02, false, new Y(O.b(p02.f1784e.getContext()).B0(p02.f200f, p02, p02.f219d)), 3);
        try {
            if (androidx.work.s.n(pVar)) {
                kotlin.jvm.internal.z.b(2, pVar);
                c0602t = pVar.invoke(p02, p02);
            } else {
                c0602t = com.google.gson.internal.c.J(pVar, p02, p02);
            }
        } catch (Throwable th) {
            c0602t = new C0602t(false, th);
        }
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        if (c0602t == aVar || (objS = p02.S(c0602t)) == A0.f176b) {
            return aVar;
        }
        if (objS instanceof C0602t) {
            Throwable th2 = ((C0602t) objS).f272a;
            if (!(th2 instanceof O0) || ((O0) th2).f199b != p02) {
                throw th2;
            }
            if (c0602t instanceof C0602t) {
                throw ((C0602t) c0602t).f272a;
            }
        } else {
            c0602t = A0.b(objS);
        }
        return c0602t;
    }

    public static final Object b(long j4, p9.p pVar, h9.c cVar) throws Throwable {
        if (j4 <= 0) {
            throw new O0("Timed out immediately", null);
        }
        Object objA = a(new P0(j4, cVar), pVar);
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        return objA;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [A9.P0, T] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(long r6, p9.p r8, h9.c r9) {
        /*
            boolean r0 = r9 instanceof A9.Q0
            if (r0 == 0) goto L13
            r0 = r9
            A9.Q0 r0 = (A9.Q0) r0
            int r1 = r0.f205o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f205o = r1
            goto L18
        L13:
            A9.Q0 r0 = new A9.Q0
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f204n
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f205o
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.jvm.internal.w r6 = r0.f203m
            b9.n.b(r9)     // Catch: A9.O0 -> L29
            return r9
        L29:
            r7 = move-exception
            goto L59
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            b9.n.b(r9)
            r4 = 0
            int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r9 > 0) goto L3d
            goto L5f
        L3d:
            kotlin.jvm.internal.w r9 = new kotlin.jvm.internal.w
            r9.<init>()
            r0.f202l = r8     // Catch: A9.O0 -> L57
            r0.f203m = r9     // Catch: A9.O0 -> L57
            r0.f205o = r3     // Catch: A9.O0 -> L57
            A9.P0 r2 = new A9.P0     // Catch: A9.O0 -> L57
            r2.<init>(r6, r0)     // Catch: A9.O0 -> L57
            r9.f43660b = r2     // Catch: A9.O0 -> L57
            java.lang.Object r6 = a(r2, r8)     // Catch: A9.O0 -> L57
            if (r6 != r1) goto L56
            return r1
        L56:
            return r6
        L57:
            r7 = move-exception
            r6 = r9
        L59:
            A9.P0 r8 = r7.f199b
            T r6 = r6.f43660b
            if (r8 != r6) goto L61
        L5f:
            r6 = 0
            return r6
        L61:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: A9.C0585k.c(long, p9.p, h9.c):java.lang.Object");
    }
}
