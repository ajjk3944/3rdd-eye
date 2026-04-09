package androidx.work;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import defpackage.ea1;
import defpackage.fa1;
import defpackage.im;
import defpackage.l01;
import defpackage.la1;
import defpackage.n70;
import defpackage.ou0;
import defpackage.va1;
import defpackage.vd;
import defpackage.xb4;
import defpackage.yv;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class ListenableWorker {
    public final Context f;
    public final WorkerParameters g;
    public volatile boolean h;
    public boolean i;
    public boolean j;

    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.f = context;
        this.g = workerParameters;
    }

    public final Context getApplicationContext() {
        return this.f;
    }

    public Executor getBackgroundExecutor() {
        return this.g.f;
    }

    public n70 getForegroundInfoAsync() {
        ou0 ou0Var = new ou0();
        ou0Var.j(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return ou0Var;
    }

    public final UUID getId() {
        return this.g.a;
    }

    public final im getInputData() {
        return this.g.b;
    }

    public final Network getNetwork() {
        return (Network) this.g.d.i;
    }

    public final int getRunAttemptCount() {
        return this.g.e;
    }

    public final Set<String> getTags() {
        return this.g.c;
    }

    public l01 getTaskExecutor() {
        return this.g.g;
    }

    public final List<String> getTriggeredContentAuthorities() {
        return (List) this.g.d.g;
    }

    public final List<Uri> getTriggeredContentUris() {
        return (List) this.g.d.h;
    }

    public va1 getWorkerFactory() {
        return this.g.h;
    }

    public boolean isRunInForeground() {
        return this.j;
    }

    public final boolean isStopped() {
        return this.h;
    }

    public final boolean isUsed() {
        return this.i;
    }

    public final n70 setForegroundAsync(yv yvVar) {
        this.j = true;
        fa1 fa1Var = this.g.j;
        Context applicationContext = getApplicationContext();
        UUID id = getId();
        fa1Var.getClass();
        ou0 ou0Var = new ou0();
        ((xb4) fa1Var.a).j(new ea1(fa1Var, ou0Var, id, yvVar, applicationContext, 0));
        return ou0Var;
    }

    public n70 setProgressAsync(im imVar) {
        la1 la1Var = this.g.i;
        getApplicationContext();
        UUID id = getId();
        la1Var.getClass();
        ou0 ou0Var = new ou0();
        ((xb4) la1Var.b).j(new vd(la1Var, id, imVar, ou0Var, 1));
        return ou0Var;
    }

    public void setRunInForeground(boolean z) {
        this.j = z;
    }

    public final void setUsed() {
        this.i = true;
    }

    public abstract n70 startWork();

    public final void stop() {
        this.h = true;
        onStopped();
    }

    public void onStopped() {
    }
}
