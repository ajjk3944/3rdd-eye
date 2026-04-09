package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.l;
import kotlin.jvm.internal.l;

/* compiled from: CombineContinuationsWorker.kt */
/* loaded from: classes.dex */
public final class CombineContinuationsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombineContinuationsWorker(Context context, WorkerParameters workerParams) {
        super(context, workerParams);
        l.f(context, "context");
        l.f(workerParams, "workerParams");
    }

    @Override // androidx.work.Worker
    public final l.a doWork() {
        return new l.a.c(getInputData());
    }
}
