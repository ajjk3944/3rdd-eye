package androidx.core.app;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.util.ArrayList;
import java.util.HashMap;

@Deprecated
/* loaded from: classes.dex */
public abstract class JobIntentService extends Service {

    /* renamed from: h, reason: collision with root package name */
    public static final Object f2355h = new Object();

    /* renamed from: i, reason: collision with root package name */
    public static final HashMap f2356i = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public b f2357a;

    /* renamed from: b, reason: collision with root package name */
    public h f2358b;

    /* renamed from: c, reason: collision with root package name */
    public a f2359c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2360d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2361e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2362f = false;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f2363g;

    public final class a extends AsyncTask {
        public a() {
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            while (true) {
                e eVarA = JobIntentService.this.a();
                if (eVarA == null) {
                    return null;
                }
                JobIntentService.this.e(eVarA.getIntent());
                eVarA.h();
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onCancelled(Void r12) {
            JobIntentService.this.g();
        }

        @Override // android.os.AsyncTask
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void r12) {
            JobIntentService.this.g();
        }
    }

    public interface b {
        IBinder a();

        e b();
    }

    public static final class c extends h {

        /* renamed from: d, reason: collision with root package name */
        public final Context f2365d;

        /* renamed from: e, reason: collision with root package name */
        public final PowerManager.WakeLock f2366e;

        /* renamed from: f, reason: collision with root package name */
        public final PowerManager.WakeLock f2367f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f2368g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f2369h;

        public c(Context context, ComponentName componentName) {
            super(componentName);
            this.f2365d = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.f2366e = wakeLockNewWakeLock;
            wakeLockNewWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock wakeLockNewWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.f2367f = wakeLockNewWakeLock2;
            wakeLockNewWakeLock2.setReferenceCounted(false);
        }

        @Override // androidx.core.app.JobIntentService.h
        public void b() {
            synchronized (this) {
                try {
                    if (this.f2369h) {
                        if (this.f2368g) {
                            this.f2366e.acquire(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
                        }
                        this.f2369h = false;
                        this.f2367f.release();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.core.app.JobIntentService.h
        public void c() {
            synchronized (this) {
                try {
                    if (!this.f2369h) {
                        this.f2369h = true;
                        this.f2367f.acquire(TTAdConstant.AD_MAX_EVENT_TIME);
                        this.f2366e.release();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.core.app.JobIntentService.h
        public void d() {
            synchronized (this) {
                this.f2368g = false;
            }
        }
    }

    public final class d implements e {

        /* renamed from: a, reason: collision with root package name */
        public final Intent f2370a;

        /* renamed from: b, reason: collision with root package name */
        public final int f2371b;

        public d(Intent intent, int i10) {
            this.f2370a = intent;
            this.f2371b = i10;
        }

        @Override // androidx.core.app.JobIntentService.e
        public Intent getIntent() {
            return this.f2370a;
        }

        @Override // androidx.core.app.JobIntentService.e
        public void h() {
            JobIntentService.this.stopSelf(this.f2371b);
        }
    }

    public interface e {
        Intent getIntent();

        void h();
    }

    public static final class f extends JobServiceEngine implements b {

        /* renamed from: a, reason: collision with root package name */
        public final JobIntentService f2373a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f2374b;

        /* renamed from: c, reason: collision with root package name */
        public JobParameters f2375c;

        public final class a implements e {

            /* renamed from: a, reason: collision with root package name */
            public final JobWorkItem f2376a;

            public a(JobWorkItem jobWorkItem) {
                this.f2376a = jobWorkItem;
            }

            @Override // androidx.core.app.JobIntentService.e
            public Intent getIntent() {
                return this.f2376a.getIntent();
            }

            @Override // androidx.core.app.JobIntentService.e
            public void h() {
                synchronized (f.this.f2374b) {
                    try {
                        JobParameters jobParameters = f.this.f2375c;
                        if (jobParameters != null) {
                            jobParameters.completeWork(this.f2376a);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        public f(JobIntentService jobIntentService) {
            super(jobIntentService);
            this.f2374b = new Object();
            this.f2373a = jobIntentService;
        }

        @Override // androidx.core.app.JobIntentService.b
        public IBinder a() {
            return getBinder();
        }

        @Override // androidx.core.app.JobIntentService.b
        public e b() {
            synchronized (this.f2374b) {
                try {
                    JobParameters jobParameters = this.f2375c;
                    if (jobParameters == null) {
                        return null;
                    }
                    JobWorkItem jobWorkItemDequeueWork = jobParameters.dequeueWork();
                    if (jobWorkItemDequeueWork == null) {
                        return null;
                    }
                    jobWorkItemDequeueWork.getIntent().setExtrasClassLoader(this.f2373a.getClassLoader());
                    return new a(jobWorkItemDequeueWork);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public boolean onStartJob(JobParameters jobParameters) {
            this.f2375c = jobParameters;
            this.f2373a.c(false);
            return true;
        }

        public boolean onStopJob(JobParameters jobParameters) {
            boolean zB = this.f2373a.b();
            synchronized (this.f2374b) {
                this.f2375c = null;
            }
            return zB;
        }
    }

    public static final class g extends h {

        /* renamed from: d, reason: collision with root package name */
        public final JobInfo f2378d;

        /* renamed from: e, reason: collision with root package name */
        public final JobScheduler f2379e;

        public g(Context context, ComponentName componentName, int i10) {
            super(componentName);
            a(i10);
            this.f2378d = new JobInfo.Builder(i10, this.f2380a).setOverrideDeadline(0L).build();
            this.f2379e = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }
    }

    public static abstract class h {

        /* renamed from: a, reason: collision with root package name */
        public final ComponentName f2380a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f2381b;

        /* renamed from: c, reason: collision with root package name */
        public int f2382c;

        public h(ComponentName componentName) {
            this.f2380a = componentName;
        }

        public void a(int i10) {
            if (!this.f2381b) {
                this.f2381b = true;
                this.f2382c = i10;
            } else {
                if (this.f2382c == i10) {
                    return;
                }
                throw new IllegalArgumentException("Given job ID " + i10 + " is different than previous " + this.f2382c);
            }
        }

        public void b() {
        }

        public void c() {
        }

        public void d() {
        }
    }

    public JobIntentService() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f2363g = null;
        } else {
            this.f2363g = new ArrayList();
        }
    }

    public static h d(Context context, ComponentName componentName, boolean z10, int i10) {
        h cVar;
        HashMap map = f2356i;
        h hVar = (h) map.get(componentName);
        if (hVar != null) {
            return hVar;
        }
        if (Build.VERSION.SDK_INT < 26) {
            cVar = new c(context, componentName);
        } else {
            if (!z10) {
                throw new IllegalArgumentException("Can't be here without a job id");
            }
            cVar = new g(context, componentName, i10);
        }
        map.put(componentName, cVar);
        return cVar;
    }

    public e a() {
        b bVar = this.f2357a;
        if (bVar != null) {
            return bVar.b();
        }
        synchronized (this.f2363g) {
            try {
                if (this.f2363g.size() <= 0) {
                    return null;
                }
                return (e) this.f2363g.remove(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean b() {
        a aVar = this.f2359c;
        if (aVar != null) {
            aVar.cancel(this.f2360d);
        }
        this.f2361e = true;
        return f();
    }

    public void c(boolean z10) {
        if (this.f2359c == null) {
            this.f2359c = new a();
            h hVar = this.f2358b;
            if (hVar != null && z10) {
                hVar.c();
            }
            this.f2359c.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public abstract void e(Intent intent);

    public boolean f() {
        return true;
    }

    public void g() {
        ArrayList arrayList = this.f2363g;
        if (arrayList != null) {
            synchronized (arrayList) {
                try {
                    this.f2359c = null;
                    ArrayList arrayList2 = this.f2363g;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        c(false);
                    } else if (!this.f2362f) {
                        this.f2358b.b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        b bVar = this.f2357a;
        if (bVar != null) {
            return bVar.a();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f2357a = new f(this);
            this.f2358b = null;
        } else {
            this.f2357a = null;
            this.f2358b = d(this, new ComponentName(this, getClass()), false, 0);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ArrayList arrayList = this.f2363g;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f2362f = true;
                this.f2358b.b();
            }
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        if (this.f2363g == null) {
            return 2;
        }
        this.f2358b.d();
        synchronized (this.f2363g) {
            ArrayList arrayList = this.f2363g;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new d(intent, i11));
            c(true);
        }
        return 3;
    }
}
