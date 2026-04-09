package D9;

import D9.C0648j;

/* compiled from: SharingStarted.kt */
/* loaded from: classes3.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public static final B7.d f1158a = new B7.d(2);

    public static final A a(J j4) {
        return new A(j4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.io.Serializable b(D9.InterfaceC0644f r4, D9.InterfaceC0645g r5, h9.c r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof D9.C0650l
            if (r0 == 0) goto L13
            r0 = r6
            D9.l r0 = (D9.C0650l) r0
            int r1 = r0.f1215n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1215n = r1
            goto L18
        L13:
            D9.l r0 = new D9.l
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f1214m
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f1215n
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.jvm.internal.w r4 = r0.f1213l
            b9.n.b(r6)     // Catch: java.lang.Throwable -> L29
            goto L4b
        L29:
            r5 = move-exception
            goto L4f
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            b9.n.b(r6)
            kotlin.jvm.internal.w r6 = new kotlin.jvm.internal.w
            r6.<init>()
            D9.m r2 = new D9.m     // Catch: java.lang.Throwable -> L4d
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L4d
            r0.f1213l = r6     // Catch: java.lang.Throwable -> L4d
            r0.f1215n = r3     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r4 = r4.b(r2, r0)     // Catch: java.lang.Throwable -> L4d
            if (r4 != r1) goto L4b
            return r1
        L4b:
            r4 = 0
            return r4
        L4d:
            r5 = move-exception
            r4 = r6
        L4f:
            T r4 = r4.f43660b
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            if (r4 == 0) goto L5b
            boolean r6 = r4.equals(r5)
            if (r6 != 0) goto L7b
        L5b:
            f9.h r6 = r0.getContext()
            A9.o0$a r0 = A9.InterfaceC0594o0.a.f263b
            f9.h$a r6 = r6.get(r0)
            A9.o0 r6 = (A9.InterfaceC0594o0) r6
            if (r6 == 0) goto L7c
            boolean r0 = r6.isCancelled()
            if (r0 != 0) goto L70
            goto L7c
        L70:
            java.util.concurrent.CancellationException r6 = r6.A()
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L7b
            goto L7c
        L7b:
            throw r5
        L7c:
            if (r4 != 0) goto L7f
            return r5
        L7f:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L87
            b9.x.a(r4, r5)
            throw r4
        L87:
            b9.x.a(r5, r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: D9.H.b(D9.f, D9.g, h9.c):java.io.Serializable");
    }

    public static final InterfaceC0644f c(InterfaceC0644f interfaceC0644f) {
        C0648j.b bVar = C0648j.f1202a;
        if (interfaceC0644f instanceof I) {
            return interfaceC0644f;
        }
        C0648j.b bVar2 = C0648j.f1202a;
        C0648j.a aVar = C0648j.f1203b;
        if (interfaceC0644f instanceof C0643e) {
            C0643e c0643e = (C0643e) interfaceC0644f;
            if (c0643e.f1186c == bVar2 && c0643e.f1187d == aVar) {
                return (C0643e) interfaceC0644f;
            }
        }
        return new C0643e(interfaceC0644f, bVar2, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r3v0, types: [F9.y, T] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(D9.InterfaceC0644f r5, h9.c r6) {
        /*
            boolean r0 = r6 instanceof D9.q
            if (r0 == 0) goto L13
            r0 = r6
            D9.q r0 = (D9.q) r0
            int r1 = r0.f1241o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1241o = r1
            goto L18
        L13:
            D9.q r0 = new D9.q
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f1240n
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f1241o
            F9.y r3 = E9.c.f1489b
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            D9.o r5 = r0.f1239m
            kotlin.jvm.internal.w r0 = r0.f1238l
            b9.n.b(r6)     // Catch: E9.a -> L2d
            goto L5d
        L2d:
            r6 = move-exception
            goto L59
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            b9.n.b(r6)
            kotlin.jvm.internal.w r6 = new kotlin.jvm.internal.w
            r6.<init>()
            r6.f43660b = r3
            D9.o r2 = new D9.o
            r2.<init>(r6)
            r0.f1238l = r6     // Catch: E9.a -> L55
            r0.f1239m = r2     // Catch: E9.a -> L55
            r0.f1241o = r4     // Catch: E9.a -> L55
            java.lang.Object r5 = r5.b(r2, r0)     // Catch: E9.a -> L55
            if (r5 != r1) goto L53
            return r1
        L53:
            r0 = r6
            goto L5d
        L55:
            r5 = move-exception
            r0 = r6
            r6 = r5
            r5 = r2
        L59:
            java.lang.Object r1 = r6.f1484b
            if (r1 != r5) goto L6a
        L5d:
            T r5 = r0.f43660b
            if (r5 == r3) goto L62
            return r5
        L62:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.String r6 = "Expected at least one element"
            r5.<init>(r6)
            throw r5
        L6a:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: D9.H.d(D9.f, h9.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r3v0, types: [F9.y, T] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(D9.I r5, p9.p r6, h9.c r7) {
        /*
            boolean r0 = r7 instanceof D9.r
            if (r0 == 0) goto L13
            r0 = r7
            D9.r r0 = (D9.r) r0
            int r1 = r0.f1246p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1246p = r1
            goto L18
        L13:
            D9.r r0 = new D9.r
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f1245o
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f1246p
            F9.y r3 = E9.c.f1489b
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 != r4) goto L31
            D9.p r5 = r0.f1244n
            kotlin.jvm.internal.w r6 = r0.f1243m
            p9.p r0 = r0.f1242l
            b9.n.b(r7)     // Catch: E9.a -> L2f
            goto L63
        L2f:
            r7 = move-exception
            goto L5f
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            b9.n.b(r7)
            kotlin.jvm.internal.w r7 = new kotlin.jvm.internal.w
            r7.<init>()
            r7.f43660b = r3
            D9.p r2 = new D9.p
            r2.<init>(r6, r7)
            r0.f1242l = r6     // Catch: E9.a -> L5a
            r0.f1243m = r7     // Catch: E9.a -> L5a
            r0.f1244n = r2     // Catch: E9.a -> L5a
            r0.f1246p = r4     // Catch: E9.a -> L5a
            java.lang.Object r5 = r5.b(r2, r0)     // Catch: E9.a -> L5a
            if (r5 != r1) goto L57
            return r1
        L57:
            r0 = r6
            r6 = r7
            goto L63
        L5a:
            r5 = move-exception
            r0 = r6
            r6 = r7
            r7 = r5
            r5 = r2
        L5f:
            java.lang.Object r1 = r7.f1484b
            if (r1 != r5) goto L7c
        L63:
            T r5 = r6.f43660b
            if (r5 == r3) goto L68
            return r5
        L68:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Expected at least one element matching the predicate "
            r6.<init>(r7)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L7c:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: D9.H.e(D9.I, p9.p, h9.c):java.lang.Object");
    }
}
