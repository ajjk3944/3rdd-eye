package s5;

import android.util.Log;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import r5.l;
import s1.ExecutorC5546b;

/* compiled from: ConfigCacheClient.java */
/* renamed from: s5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5576b {

    /* renamed from: d, reason: collision with root package name */
    public static final HashMap f46068d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final ExecutorC5546b f46069e = new ExecutorC5546b();

    /* renamed from: a, reason: collision with root package name */
    public final Executor f46070a;

    /* renamed from: b, reason: collision with root package name */
    public final C5578d f46071b;

    /* renamed from: c, reason: collision with root package name */
    public Task<com.google.firebase.remoteconfig.internal.b> f46072c = null;

    /* compiled from: ConfigCacheClient.java */
    /* renamed from: s5.b$a */
    public static class a<TResult> implements OnSuccessListener<TResult>, OnFailureListener, OnCanceledListener {

        /* renamed from: b, reason: collision with root package name */
        public final CountDownLatch f46073b = new CountDownLatch(1);

        @Override // com.google.android.gms.tasks.OnCanceledListener
        public final void onCanceled() {
            this.f46073b.countDown();
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public final void onFailure(Exception exc) {
            this.f46073b.countDown();
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        public final void onSuccess(TResult tresult) {
            this.f46073b.countDown();
        }
    }

    public C5576b(Executor executor, C5578d c5578d) {
        this.f46070a = executor;
        this.f46071b = c5578d;
    }

    public static Object a(Task task) throws ExecutionException, InterruptedException, TimeoutException {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        a aVar = new a();
        Executor executor = f46069e;
        task.addOnSuccessListener(executor, aVar);
        task.addOnFailureListener(executor, aVar);
        task.addOnCanceledListener(executor, aVar);
        if (!aVar.f46073b.await(5L, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        }
        if (task.isSuccessful()) {
            return task.getResult();
        }
        throw new ExecutionException(task.getException());
    }

    public static synchronized C5576b d(Executor executor, C5578d c5578d) {
        String str;
        HashMap map;
        try {
            str = c5578d.f46082b;
            map = f46068d;
            if (!map.containsKey(str)) {
                map.put(str, new C5576b(executor, c5578d));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (C5576b) map.get(str);
    }

    public final synchronized Task<com.google.firebase.remoteconfig.internal.b> b() {
        try {
            Task<com.google.firebase.remoteconfig.internal.b> task = this.f46072c;
            if (task == null || (task.isComplete() && !this.f46072c.isSuccessful())) {
                Executor executor = this.f46070a;
                C5578d c5578d = this.f46071b;
                Objects.requireNonNull(c5578d);
                this.f46072c = Tasks.call(executor, new l(c5578d, 1));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f46072c;
    }

    public final com.google.firebase.remoteconfig.internal.b c() {
        synchronized (this) {
            try {
                Task<com.google.firebase.remoteconfig.internal.b> task = this.f46072c;
                if (task != null && task.isSuccessful()) {
                    return this.f46072c.getResult();
                }
                try {
                    Task<com.google.firebase.remoteconfig.internal.b> taskB = b();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    return (com.google.firebase.remoteconfig.internal.b) a(taskB);
                } catch (InterruptedException | ExecutionException | TimeoutException e4) {
                    Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", e4);
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
