package kotlinx.coroutines;

import kotlin.coroutines.EmptyCoroutineContext;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class j {
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(kotlin.coroutines.d r4, l9.p r5) {
        /*
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            kotlin.coroutines.c$b r1 = kotlin.coroutines.c.F8
            kotlin.coroutines.d$b r1 = r4.get(r1)
            kotlin.coroutines.c r1 = (kotlin.coroutines.c) r1
            if (r1 != 0) goto L1f
            kotlinx.coroutines.p2 r1 = kotlinx.coroutines.p2.f22589a
            kotlinx.coroutines.c1 r1 = r1.b()
            kotlinx.coroutines.k1 r2 = kotlinx.coroutines.k1.f22571a
            kotlin.coroutines.d r4 = r4.plus(r1)
            kotlin.coroutines.d r4 = kotlinx.coroutines.CoroutineContextKt.e(r2, r4)
            goto L42
        L1f:
            boolean r2 = r1 instanceof kotlinx.coroutines.c1
            r3 = 0
            if (r2 == 0) goto L27
            kotlinx.coroutines.c1 r1 = (kotlinx.coroutines.c1) r1
            goto L28
        L27:
            r1 = r3
        L28:
            if (r1 == 0) goto L36
            boolean r2 = r1.m0()
            if (r2 == 0) goto L31
            r3 = r1
        L31:
            if (r3 != 0) goto L34
            goto L36
        L34:
            r1 = r3
            goto L3c
        L36:
            kotlinx.coroutines.p2 r1 = kotlinx.coroutines.p2.f22589a
            kotlinx.coroutines.c1 r1 = r1.a()
        L3c:
            kotlinx.coroutines.k1 r2 = kotlinx.coroutines.k1.f22571a
            kotlin.coroutines.d r4 = kotlinx.coroutines.CoroutineContextKt.e(r2, r4)
        L42:
            kotlinx.coroutines.g r2 = new kotlinx.coroutines.g
            r2.<init>(r4, r0, r1)
            kotlinx.coroutines.CoroutineStart r4 = kotlinx.coroutines.CoroutineStart.f22205a
            r2.T0(r4, r2, r5)
            java.lang.Object r4 = r2.U0()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.j.a(kotlin.coroutines.d, l9.p):java.lang.Object");
    }

    public static /* synthetic */ Object b(kotlin.coroutines.d dVar, l9.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            dVar = EmptyCoroutineContext.f21979a;
        }
        return i.e(dVar, pVar);
    }
}
