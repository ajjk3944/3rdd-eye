package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import defpackage.a9;
import defpackage.h80;
import defpackage.ha1;
import defpackage.l01;
import defpackage.n70;
import defpackage.ou0;
import defpackage.u91;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements u91 {
    public static final String p = h80.f("ConstraintTrkngWrkr");
    public final WorkerParameters k;
    public final Object l;
    public volatile boolean m;
    public final ou0 n;
    public ListenableWorker o;

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.k = workerParameters;
        this.l = new Object();
        this.m = false;
        this.n = new ou0();
    }

    @Override // defpackage.u91
    public final void c(ArrayList arrayList) {
        h80 h80VarD = h80.d();
        String.format("Constraints changed for %s", arrayList);
        h80VarD.a(new Throwable[0]);
        synchronized (this.l) {
            this.m = true;
        }
    }

    @Override // androidx.work.ListenableWorker
    public final l01 getTaskExecutor() {
        return ha1.j0(getApplicationContext()).s;
    }

    @Override // androidx.work.ListenableWorker
    public final boolean isRunInForeground() {
        ListenableWorker listenableWorker = this.o;
        return listenableWorker != null && listenableWorker.isRunInForeground();
    }

    @Override // androidx.work.ListenableWorker
    public final void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.o;
        if (listenableWorker == null || listenableWorker.isStopped()) {
            return;
        }
        this.o.stop();
    }

    @Override // androidx.work.ListenableWorker
    public final n70 startWork() {
        getBackgroundExecutor().execute(new a9(2, this));
        return this.n;
    }

    @Override // defpackage.u91
    public final void e(List list) {
    }
}
