package androidx.work;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import c2.C2047C;
import c2.C2049E;
import c2.RunnableC2046B;
import c2.RunnableC2048D;
import d2.C4268c;
import e2.InterfaceC4306b;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* compiled from: ListenableWorker.java */
/* loaded from: classes.dex */
public abstract class l {
    private Context mAppContext;
    private volatile int mStopReason = -256;
    private boolean mUsed;
    private WorkerParameters mWorkerParams;

    /* compiled from: ListenableWorker.java */
    public static abstract class a {

        /* compiled from: ListenableWorker.java */
        /* renamed from: androidx.work.l$a$a, reason: collision with other inner class name */
        public static final class C0267a extends a {

            /* renamed from: a, reason: collision with root package name */
            public final e f16946a;

            public C0267a() {
                this(e.f16893c);
            }

            @Override // androidx.work.l.a
            public final e a() {
                return this.f16946a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0267a.class != obj.getClass()) {
                    return false;
                }
                return this.f16946a.equals(((C0267a) obj).f16946a);
            }

            public final int hashCode() {
                return this.f16946a.hashCode() + (C0267a.class.getName().hashCode() * 31);
            }

            public final String toString() {
                return "Failure {mOutputData=" + this.f16946a + '}';
            }

            public C0267a(e eVar) {
                this.f16946a = eVar;
            }
        }

        /* compiled from: ListenableWorker.java */
        public static final class b extends a {
            @Override // androidx.work.l.a
            public final e a() {
                return e.f16893c;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && b.class == obj.getClass();
            }

            public final int hashCode() {
                return b.class.getName().hashCode();
            }

            public final String toString() {
                return "Retry";
            }
        }

        /* compiled from: ListenableWorker.java */
        public static final class c extends a {

            /* renamed from: a, reason: collision with root package name */
            public final e f16947a;

            public c() {
                this(e.f16893c);
            }

            @Override // androidx.work.l.a
            public final e a() {
                return this.f16947a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || c.class != obj.getClass()) {
                    return false;
                }
                return this.f16947a.equals(((c) obj).f16947a);
            }

            public final int hashCode() {
                return this.f16947a.hashCode() + (c.class.getName().hashCode() * 31);
            }

            public final String toString() {
                return "Success {mOutputData=" + this.f16947a + '}';
            }

            public c(e eVar) {
                this.f16947a = eVar;
            }
        }

        public abstract e a();
    }

    public l(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.mAppContext = context;
        this.mWorkerParams = workerParameters;
    }

    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.f16857f;
    }

    public A4.a<h> getForegroundInfoAsync() {
        C4268c c4268c = new C4268c();
        c4268c.j(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return c4268c;
    }

    public final UUID getId() {
        return this.mWorkerParams.f16852a;
    }

    public final e getInputData() {
        return this.mWorkerParams.f16853b;
    }

    public final Network getNetwork() {
        return this.mWorkerParams.f16855d.f16864c;
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.f16856e;
    }

    public final int getStopReason() {
        return this.mStopReason;
    }

    public final Set<String> getTags() {
        return this.mWorkerParams.f16854c;
    }

    public InterfaceC4306b getTaskExecutor() {
        return this.mWorkerParams.f16858g;
    }

    public final List<String> getTriggeredContentAuthorities() {
        return this.mWorkerParams.f16855d.f16862a;
    }

    public final List<Uri> getTriggeredContentUris() {
        return this.mWorkerParams.f16855d.f16863b;
    }

    public y getWorkerFactory() {
        return this.mWorkerParams.f16859h;
    }

    public final boolean isStopped() {
        return this.mStopReason != -256;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public final A4.a<Void> setForegroundAsync(h hVar) {
        C2047C c2047c = this.mWorkerParams.f16860j;
        Context applicationContext = getApplicationContext();
        UUID id = getId();
        c2047c.getClass();
        C4268c c4268c = new C4268c();
        c2047c.f18390a.d(new RunnableC2046B(c2047c, c4268c, id, hVar, applicationContext));
        return c4268c;
    }

    public A4.a<Void> setProgressAsync(e eVar) {
        C2049E c2049e = this.mWorkerParams.i;
        getApplicationContext();
        UUID id = getId();
        c2049e.getClass();
        C4268c c4268c = new C4268c();
        c2049e.f18399b.d(new RunnableC2048D(c2049e, id, eVar, c4268c));
        return c4268c;
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract A4.a<a> startWork();

    public final void stop(int i) {
        this.mStopReason = i;
        onStopped();
    }

    public void onStopped() {
    }
}
