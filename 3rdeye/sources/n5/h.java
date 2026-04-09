package n5;

import C.C0635w;
import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p5.EnumC5466a;
import s1.ExecutorC5546b;

/* compiled from: EnhancedIntentService.java */
@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
/* loaded from: classes2.dex */
public abstract class h extends Service {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f44342g = 0;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f44343b;

    /* renamed from: c, reason: collision with root package name */
    public BinderC5362E f44344c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f44345d;

    /* renamed from: e, reason: collision with root package name */
    public int f44346e;

    /* renamed from: f, reason: collision with root package name */
    public int f44347f;

    /* compiled from: EnhancedIntentService.java */
    public class a {
        public a() {
        }
    }

    public h() {
        NamedThreadFactory namedThreadFactory = new NamedThreadFactory("Firebase-Messaging-Intent-Handle");
        EnumC5466a enumC5466a = EnumC5466a.LOW_POWER;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), namedThreadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f44343b = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f44345d = new Object();
        this.f44347f = 0;
    }

    public final void a(Intent intent) {
        if (intent != null) {
            C5361D.a(intent);
        }
        synchronized (this.f44345d) {
            try {
                int i = this.f44347f - 1;
                this.f44347f = i;
                if (i == 0) {
                    stopSelfResult(this.f44346e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void c(Intent intent);

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "Service received bind request");
            }
            if (this.f44344c == null) {
                this.f44344c = new BinderC5362E(new a());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f44344c;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.f44343b.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i10) {
        synchronized (this.f44345d) {
            this.f44346e = i10;
            this.f44347f++;
        }
        Intent intentB = b(intent);
        if (intentB == null) {
            a(intent);
            return 2;
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f44343b.execute(new J4.h(this, intentB, taskCompletionSource, 20));
        Task task = taskCompletionSource.getTask();
        if (task.isComplete()) {
            a(intent);
            return 2;
        }
        task.addOnCompleteListener(new ExecutorC5546b(), new C0635w(8, this, intent));
        return 3;
    }

    public Intent b(Intent intent) {
        return intent;
    }
}
