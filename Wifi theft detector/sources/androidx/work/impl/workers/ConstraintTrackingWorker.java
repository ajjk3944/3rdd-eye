package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.k;
import d2.j;
import h2.c;
import h2.d;
import java.util.Collections;
import java.util.List;
import l2.p;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements c {

    /* renamed from: f, reason: collision with root package name */
    public static final String f4513f = k.f("ConstraintTrkngWrkr");

    /* renamed from: a, reason: collision with root package name */
    public WorkerParameters f4514a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4515b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f4516c;

    /* renamed from: d, reason: collision with root package name */
    public n2.a f4517d;

    /* renamed from: e, reason: collision with root package name */
    public ListenableWorker f4518e;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ConstraintTrackingWorker.this.e();
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.google.common.util.concurrent.a f4520a;

        public b(com.google.common.util.concurrent.a aVar) {
            this.f4520a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (ConstraintTrackingWorker.this.f4515b) {
                try {
                    if (ConstraintTrackingWorker.this.f4516c) {
                        ConstraintTrackingWorker.this.d();
                    } else {
                        ConstraintTrackingWorker.this.f4517d.q(this.f4520a);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public ConstraintTrackingWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f4514a = workerParameters;
        this.f4515b = new Object();
        this.f4516c = false;
        this.f4517d = n2.a.s();
    }

    public WorkDatabase a() {
        return j.k(getApplicationContext()).o();
    }

    @Override // h2.c
    public void b(List list) {
        k.c().a(f4513f, String.format("Constraints changed for %s", list), new Throwable[0]);
        synchronized (this.f4515b) {
            this.f4516c = true;
        }
    }

    public void c() {
        this.f4517d.o(ListenableWorker.a.a());
    }

    public void d() {
        this.f4517d.o(ListenableWorker.a.b());
    }

    public void e() {
        String strI = getInputData().i("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        if (TextUtils.isEmpty(strI)) {
            k.c().b(f4513f, "No worker to delegate to.", new Throwable[0]);
            c();
            return;
        }
        ListenableWorker listenableWorkerB = getWorkerFactory().b(getApplicationContext(), strI, this.f4514a);
        this.f4518e = listenableWorkerB;
        if (listenableWorkerB == null) {
            k.c().a(f4513f, "No worker to delegate to.", new Throwable[0]);
            c();
            return;
        }
        p pVarG = a().B().g(getId().toString());
        if (pVarG == null) {
            c();
            return;
        }
        d dVar = new d(getApplicationContext(), getTaskExecutor(), this);
        dVar.d(Collections.singletonList(pVarG));
        if (!dVar.c(getId().toString())) {
            k.c().a(f4513f, String.format("Constraints not met for delegate %s. Requesting retry.", strI), new Throwable[0]);
            d();
            return;
        }
        k.c().a(f4513f, String.format("Constraints met for delegate %s", strI), new Throwable[0]);
        try {
            com.google.common.util.concurrent.a aVarStartWork = this.f4518e.startWork();
            aVarStartWork.addListener(new b(aVarStartWork), getBackgroundExecutor());
        } catch (Throwable th) {
            k kVarC = k.c();
            String str = f4513f;
            kVarC.a(str, String.format("Delegated worker %s threw exception in startWork.", strI), th);
            synchronized (this.f4515b) {
                try {
                    if (this.f4516c) {
                        k.c().a(str, "Constraints were unmet, Retrying.", new Throwable[0]);
                        d();
                    } else {
                        c();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // h2.c
    public void f(List list) {
    }

    @Override // androidx.work.ListenableWorker
    public o2.a getTaskExecutor() {
        return j.k(getApplicationContext()).p();
    }

    @Override // androidx.work.ListenableWorker
    public boolean isRunInForeground() {
        ListenableWorker listenableWorker = this.f4518e;
        return listenableWorker != null && listenableWorker.isRunInForeground();
    }

    @Override // androidx.work.ListenableWorker
    public void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.f4518e;
        if (listenableWorker == null || listenableWorker.isStopped()) {
            return;
        }
        this.f4518e.stop();
    }

    @Override // androidx.work.ListenableWorker
    public com.google.common.util.concurrent.a startWork() {
        getBackgroundExecutor().execute(new a());
        return this.f4517d;
    }
}
