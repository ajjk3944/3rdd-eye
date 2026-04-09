package J8;

import a8.C1674f;
import b9.C1992A;
import com.zipoapps.premiumhelper.e;
import g2.AbstractC4381e;
import p9.InterfaceC5480a;

/* compiled from: ErrorHandlingUtils.kt */
/* renamed from: J8.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0702q {
    public static final void a(String message) {
        kotlin.jvm.internal.l.f(message, "message");
        com.zipoapps.premiumhelper.e.f37006D.getClass();
        if (e.a.a().f37020j.f43910b.isDebugMode()) {
            throw new IllegalStateException(message.toString());
        }
        va.a.f47104a.c(message, new Object[0]);
    }

    public static final void b(AbstractC4381e abstractC4381e, InterfaceC5480a onSuccess, p9.l lVar, p9.l action) {
        kotlin.jvm.internal.l.f(onSuccess, "onSuccess");
        kotlin.jvm.internal.l.f(action, "action");
        try {
            action.invoke(abstractC4381e);
            C1992A c1992a = C1992A.f18074a;
            onSuccess.invoke();
        } catch (Exception e4) {
            if (lVar != null) {
                lVar.invoke(e4);
            }
        }
    }

    public static /* synthetic */ void c(AbstractC4381e abstractC4381e, C1674f c1674f, p9.l lVar, int i) {
        InterfaceC5480a c0697l = c1674f;
        if ((i & 1) != 0) {
            c0697l = new C0697l(0);
        }
        b(abstractC4381e, c0697l, C0698m.f2872b, lVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0078 -> B:21:0x0080). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0088 -> B:23:0x0089). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(g2.AbstractC4381e r14, int r15, long r16, p9.l r18, p9.l r19, h9.c r20) {
        /*
            r0 = r20
            boolean r1 = r0 instanceof J8.C0699n
            if (r1 == 0) goto L15
            r1 = r0
            J8.n r1 = (J8.C0699n) r1
            int r2 = r1.f2881t
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f2881t = r2
            goto L1a
        L15:
            J8.n r1 = new J8.n
            r1.<init>(r0)
        L1a:
            java.lang.Object r0 = r1.f2880s
            g9.a r2 = g9.a.COROUTINE_SUSPENDED
            int r3 = r1.f2881t
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L40
            if (r3 != r4) goto L38
            int r14 = r1.f2878q
            long r6 = r1.f2879r
            int r3 = r1.f2877p
            kotlin.jvm.internal.t r8 = r1.f2876o
            p9.l r9 = r1.f2875n
            p9.l r10 = r1.f2874m
            g2.e r11 = r1.f2873l
            b9.n.b(r0)
            goto L80
        L38:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L40:
            b9.n.b(r0)
            kotlin.jvm.internal.t r0 = new kotlin.jvm.internal.t
            r0.<init>()
            r6 = r16
            r3 = r19
            r9 = r0
            r8 = r1
            r10 = r5
            r0 = r15
            r1 = r18
        L52:
            int r11 = r10 + 1
            if (r10 <= 0) goto L88
            va.a$b r10 = va.a.f47104a
            java.lang.String r12 = "Applying retry delay"
            java.lang.Object[] r13 = new java.lang.Object[r5]
            r10.a(r12, r13)
            long r12 = (long) r11
            long r12 = r12 * r6
            r8.f2873l = r14
            r8.f2874m = r1
            r8.f2875n = r3
            r8.f2876o = r9
            r8.f2877p = r0
            r8.f2879r = r6
            r8.f2878q = r11
            r8.f2881t = r4
            java.lang.Object r10 = A9.O.a(r12, r8)
            if (r10 != r2) goto L78
            return r2
        L78:
            r10 = r11
            r11 = r14
            r14 = r10
            r10 = r1
            r1 = r8
            r8 = r9
            r9 = r3
            r3 = r0
        L80:
            r0 = r3
            r3 = r9
            r9 = r8
            r8 = r1
            r1 = r10
            r10 = r14
            r14 = r11
            goto L89
        L88:
            r10 = r11
        L89:
            H8.e r11 = new H8.e
            r12 = 1
            r11.<init>(r9, r12)
            b(r14, r11, r1, r3)
            if (r10 >= r0) goto L98
            boolean r11 = r9.f43657b
            if (r11 == 0) goto L52
        L98:
            b9.A r14 = b9.C1992A.f18074a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: J8.C0702q.d(g2.e, int, long, p9.l, p9.l, h9.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00db, code lost:
    
        if (A9.O.a(r14, r1) == r2) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10, types: [p9.l] */
    /* JADX WARN: Type inference failed for: r13v11, types: [p9.l] */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00db -> B:18:0x0046). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object f(int r18, long r19, long r21, double r23, k8.C r25, h9.c r26) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: J8.C0702q.f(int, long, long, double, k8.C, h9.c):java.lang.Object");
    }
}
