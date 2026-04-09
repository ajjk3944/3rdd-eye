package kotlinx.coroutines.channels;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.j0;

/* loaded from: classes4.dex */
public abstract class ProduceKt {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(kotlinx.coroutines.channels.l r4, l9.a r5, c9.c r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.channels.ProduceKt$awaitClose$1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.channels.ProduceKt$awaitClose$1 r0 = (kotlinx.coroutines.channels.ProduceKt$awaitClose$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ProduceKt$awaitClose$1 r0 = new kotlinx.coroutines.channels.ProduceKt$awaitClose$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r4 = r0.L$1
            r5 = r4
            l9.a r5 = (l9.a) r5
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.channels.l r4 = (kotlinx.coroutines.channels.l) r4
            kotlin.c.b(r6)     // Catch: java.lang.Throwable -> L32
            goto L75
        L32:
            r4 = move-exception
            goto L7b
        L34:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3c:
            kotlin.c.b(r6)
            kotlin.coroutines.d r6 = r0.getContext()
            kotlinx.coroutines.r1$b r2 = kotlinx.coroutines.r1.H8
            kotlin.coroutines.d$b r6 = r6.get(r2)
            if (r6 != r4) goto L7f
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L32
            r0.L$1 = r5     // Catch: java.lang.Throwable -> L32
            r0.label = r3     // Catch: java.lang.Throwable -> L32
            kotlinx.coroutines.p r6 = new kotlinx.coroutines.p     // Catch: java.lang.Throwable -> L32
            c9.c r2 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.c(r0)     // Catch: java.lang.Throwable -> L32
            r6.<init>(r2, r3)     // Catch: java.lang.Throwable -> L32
            r6.F()     // Catch: java.lang.Throwable -> L32
            kotlinx.coroutines.channels.ProduceKt$awaitClose$4$1 r2 = new kotlinx.coroutines.channels.ProduceKt$awaitClose$4$1     // Catch: java.lang.Throwable -> L32
            r2.<init>()     // Catch: java.lang.Throwable -> L32
            r4.w(r2)     // Catch: java.lang.Throwable -> L32
            java.lang.Object r4 = r6.w()     // Catch: java.lang.Throwable -> L32
            java.lang.Object r6 = kotlin.coroutines.intrinsics.a.f()     // Catch: java.lang.Throwable -> L32
            if (r4 != r6) goto L72
            d9.e.c(r0)     // Catch: java.lang.Throwable -> L32
        L72:
            if (r4 != r1) goto L75
            return r1
        L75:
            r5.invoke()
            y8.s r4 = y8.s.f25199a
            return r4
        L7b:
            r5.invoke()
            throw r4
        L7f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ProduceKt.a(kotlinx.coroutines.channels.l, l9.a, c9.c):java.lang.Object");
    }

    public static final n b(j0 j0Var, kotlin.coroutines.d dVar, int i10, BufferOverflow bufferOverflow, CoroutineStart coroutineStart, l9.l lVar, l9.p pVar) {
        k kVar = new k(CoroutineContextKt.e(j0Var, dVar), d.b(i10, bufferOverflow, null, 4, null));
        if (lVar != null) {
            kVar.U(lVar);
        }
        kVar.T0(coroutineStart, kVar, pVar);
        return kVar;
    }

    public static final n c(j0 j0Var, kotlin.coroutines.d dVar, int i10, l9.p pVar) {
        return b(j0Var, dVar, i10, BufferOverflow.f22240a, CoroutineStart.f22205a, null, pVar);
    }

    public static /* synthetic */ n d(j0 j0Var, kotlin.coroutines.d dVar, int i10, BufferOverflow bufferOverflow, CoroutineStart coroutineStart, l9.l lVar, l9.p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            dVar = EmptyCoroutineContext.f21979a;
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            bufferOverflow = BufferOverflow.f22240a;
        }
        if ((i11 & 8) != 0) {
            coroutineStart = CoroutineStart.f22205a;
        }
        if ((i11 & 16) != 0) {
            lVar = null;
        }
        l9.l lVar2 = lVar;
        return b(j0Var, dVar, i10, bufferOverflow, coroutineStart, lVar2, pVar);
    }

    public static /* synthetic */ n e(j0 j0Var, kotlin.coroutines.d dVar, int i10, l9.p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            dVar = EmptyCoroutineContext.f21979a;
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return c(j0Var, dVar, i10, pVar);
    }
}
