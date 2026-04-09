package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import java.util.concurrent.Executor;
import nk.k;
import t6.g;
import xk.x;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ConstraintTrackingWorker extends CoroutineWorker {
    public final WorkerParameters g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        k.e(context, "appContext");
        k.e(workerParameters, "workerParameters");
        this.g = workerParameters;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(androidx.work.impl.workers.ConstraintTrackingWorker r4, t6.u r5, o8.b r6, b7.r r7, ek.c r8) {
        /*
            r4.getClass()
            boolean r0 = r8 instanceof e7.b
            if (r0 == 0) goto L16
            r0 = r8
            e7.b r0 = (e7.b) r0
            int r1 = r0.f22432c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f22432c = r1
            goto L1b
        L16:
            e7.b r0 = new e7.b
            r0.<init>(r4, r8)
        L1b:
            java.lang.Object r4 = r0.f22430a
            int r8 = r0.f22432c
            r1 = 1
            if (r8 == 0) goto L30
            if (r8 != r1) goto L28
            ci.b.D(r4)
            goto L44
        L28:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L30:
            ci.b.D(r4)
            a0.g0 r4 = new a0.g0
            r8 = 0
            r4.<init>(r5, r6, r7, r8)
            r0.f22432c = r1
            java.lang.Object r4 = xk.x.h(r4, r0)
            dk.a r5 = dk.a.f22275a
            if (r4 != r5) goto L44
            return r5
        L44:
            java.lang.String r5 = "coroutineScope(...)"
            nk.k.d(r4, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.workers.ConstraintTrackingWorker.b(androidx.work.impl.workers.ConstraintTrackingWorker, t6.u, o8.b, b7.r, ek.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.work.WorkerParameters] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v2, types: [t6.u] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r8v3, types: [t6.l0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(androidx.work.impl.workers.ConstraintTrackingWorker r18, ek.c r19) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.workers.ConstraintTrackingWorker.c(androidx.work.impl.workers.ConstraintTrackingWorker, ek.c):java.lang.Object");
    }

    @Override // androidx.work.CoroutineWorker
    public final Object a(g gVar) {
        Executor backgroundExecutor = getBackgroundExecutor();
        k.d(backgroundExecutor, "getBackgroundExecutor(...)");
        return x.E(x.l(backgroundExecutor), new al.k(this, null, 7), gVar);
    }
}
