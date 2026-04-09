package kotlinx.coroutines.flow;

import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.r1;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class FlowKt__ShareKt {
    public static final x0 a(s0 s0Var) {
        return new u0(s0Var, null);
    }

    public static final d1 b(t0 t0Var) {
        return new v0(t0Var, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlinx.coroutines.flow.a1 c(kotlinx.coroutines.flow.b r7, int r8) {
        /*
            kotlinx.coroutines.channels.a$a r0 = kotlinx.coroutines.channels.a.I8
            int r0 = r0.a()
            int r0 = q9.e.b(r8, r0)
            int r0 = r0 - r8
            boolean r1 = r7 instanceof kotlinx.coroutines.flow.internal.ChannelFlow
            if (r1 == 0) goto L3c
            r1 = r7
            kotlinx.coroutines.flow.internal.ChannelFlow r1 = (kotlinx.coroutines.flow.internal.ChannelFlow) r1
            kotlinx.coroutines.flow.b r2 = r1.i()
            if (r2 == 0) goto L3c
            kotlinx.coroutines.flow.a1 r7 = new kotlinx.coroutines.flow.a1
            int r3 = r1.f22453b
            r4 = -3
            if (r3 == r4) goto L26
            r4 = -2
            if (r3 == r4) goto L26
            if (r3 == 0) goto L26
            r0 = r3
            goto L34
        L26:
            kotlinx.coroutines.channels.BufferOverflow r4 = r1.f22454c
            kotlinx.coroutines.channels.BufferOverflow r5 = kotlinx.coroutines.channels.BufferOverflow.f22240a
            r6 = 0
            if (r4 != r5) goto L31
            if (r3 != 0) goto L34
        L2f:
            r0 = r6
            goto L34
        L31:
            if (r8 != 0) goto L2f
            r0 = 1
        L34:
            kotlinx.coroutines.channels.BufferOverflow r8 = r1.f22454c
            kotlin.coroutines.d r1 = r1.f22452a
            r7.<init>(r2, r0, r8, r1)
            return r7
        L3c:
            kotlinx.coroutines.flow.a1 r8 = new kotlinx.coroutines.flow.a1
            kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.f22240a
            kotlin.coroutines.EmptyCoroutineContext r2 = kotlin.coroutines.EmptyCoroutineContext.f21979a
            r8.<init>(r7, r0, r1, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ShareKt.c(kotlinx.coroutines.flow.b, int):kotlinx.coroutines.flow.a1");
    }

    public static final r1 d(kotlinx.coroutines.j0 j0Var, kotlin.coroutines.d dVar, b bVar, s0 s0Var, b1 b1Var, Object obj) {
        return kotlinx.coroutines.i.c(j0Var, dVar, kotlin.jvm.internal.p.a(b1Var, b1.f22443a.a()) ? CoroutineStart.f22205a : CoroutineStart.f22208d, new FlowKt__ShareKt$launchSharing$1(b1Var, bVar, s0Var, obj, null));
    }

    public static final x0 e(x0 x0Var, l9.p pVar) {
        return new SubscribedSharedFlow(x0Var, pVar);
    }

    public static final x0 f(b bVar, kotlinx.coroutines.j0 j0Var, b1 b1Var, int i10) {
        a1 a1VarC = c(bVar, i10);
        s0 s0VarA = y0.a(i10, a1VarC.f22440b, a1VarC.f22441c);
        return new u0(s0VarA, d(j0Var, a1VarC.f22442d, a1VarC.f22439a, s0VarA, b1Var, y0.f22492a));
    }
}
