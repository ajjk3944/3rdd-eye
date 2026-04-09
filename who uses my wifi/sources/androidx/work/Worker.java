package androidx.work;

import android.content.Context;
import defpackage.a9;
import defpackage.n70;
import defpackage.ou0;
import defpackage.r70;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class Worker extends ListenableWorker {
    public ou0 k;

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract r70 doWork();

    @Override // androidx.work.ListenableWorker
    public final n70 startWork() {
        this.k = new ou0();
        getBackgroundExecutor().execute(new a9(18, this));
        return this.k;
    }
}
