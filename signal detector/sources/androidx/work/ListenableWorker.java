package androidx.work;

import A2.RunnableC0114b;
import V0.f;
import V0.g;
import V0.t;
import V2.e;
import Y2.W;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.Keep;
import f1.o;
import f1.p;
import f4.InterfaceFutureC2326a;
import g1.k;
import h1.InterfaceC2361a;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class ListenableWorker {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5658a;

    /* renamed from: b, reason: collision with root package name */
    public final WorkerParameters f5659b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f5660c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5661d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5662e;

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.f5658a = context;
        this.f5659b = workerParameters;
    }

    public final Context getApplicationContext() {
        return this.f5658a;
    }

    public Executor getBackgroundExecutor() {
        return this.f5659b.f5670f;
    }

    public InterfaceFutureC2326a getForegroundInfoAsync() {
        k kVar = new k();
        kVar.j(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return kVar;
    }

    public final UUID getId() {
        return this.f5659b.f5665a;
    }

    public final f getInputData() {
        return this.f5659b.f5666b;
    }

    public final Network getNetwork() {
        return (Network) this.f5659b.f5668d.f3870d;
    }

    public final int getRunAttemptCount() {
        return this.f5659b.f5669e;
    }

    public final Set<String> getTags() {
        return this.f5659b.f5667c;
    }

    public InterfaceC2361a getTaskExecutor() {
        return this.f5659b.f5671g;
    }

    public final List<String> getTriggeredContentAuthorities() {
        return (List) this.f5659b.f5668d.f3868b;
    }

    public final List<Uri> getTriggeredContentUris() {
        return (List) this.f5659b.f5668d.f3869c;
    }

    public t getWorkerFactory() {
        return this.f5659b.f5672h;
    }

    public boolean isRunInForeground() {
        return this.f5662e;
    }

    public final boolean isStopped() {
        return this.f5660c;
    }

    public final boolean isUsed() {
        return this.f5661d;
    }

    public void onStopped() {
    }

    public final InterfaceFutureC2326a setForegroundAsync(g gVar) {
        this.f5662e = true;
        o oVar = this.f5659b.f5673j;
        Context applicationContext = getApplicationContext();
        UUID id = getId();
        oVar.getClass();
        k kVar = new k();
        ((e) oVar.f20070a).o(new W(oVar, kVar, id, gVar, applicationContext));
        return kVar;
    }

    public InterfaceFutureC2326a setProgressAsync(f fVar) {
        p pVar = this.f5659b.i;
        getApplicationContext();
        UUID id = getId();
        pVar.getClass();
        k kVar = new k();
        ((e) pVar.f20075b).o(new RunnableC0114b(pVar, id, fVar, kVar, 4, false));
        return kVar;
    }

    public void setRunInForeground(boolean z6) {
        this.f5662e = z6;
    }

    public final void setUsed() {
        this.f5661d = true;
    }

    public abstract InterfaceFutureC2326a startWork();

    public final void stop() {
        this.f5660c = true;
        onStopped();
    }
}
