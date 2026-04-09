package lf;

import android.util.Log;
import com.applovin.impl.da;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import j$.util.Objects;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final HashMap f28740d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final da f28741e = new da(1);

    /* renamed from: a, reason: collision with root package name */
    public final Executor f28742a;

    /* renamed from: b, reason: collision with root package name */
    public final m f28743b;

    /* renamed from: c, reason: collision with root package name */
    public Task f28744c = null;

    public b(Executor executor, m mVar) {
        this.f28742a = executor;
        this.f28743b = mVar;
    }

    public static Object a(Task task) throws ExecutionException, TimeoutException {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        p6.i iVar = new p6.i(29);
        Executor executor = f28741e;
        task.addOnSuccessListener(executor, iVar);
        task.addOnFailureListener(executor, iVar);
        task.addOnCanceledListener(executor, iVar);
        if (!((CountDownLatch) iVar.f31385a).await(5L, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        }
        if (task.isSuccessful()) {
            return task.getResult();
        }
        throw new ExecutionException(task.getException());
    }

    public static synchronized b d(Executor executor, m mVar) {
        String str;
        HashMap map;
        try {
            str = mVar.f28803b;
            map = f28740d;
            if (!map.containsKey(str)) {
                map.put(str, new b(executor, mVar));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (b) map.get(str);
    }

    public final synchronized Task b() {
        try {
            Task task = this.f28744c;
            if (task == null || (task.isComplete() && !this.f28744c.isSuccessful())) {
                Executor executor = this.f28742a;
                m mVar = this.f28743b;
                Objects.requireNonNull(mVar);
                this.f28744c = Tasks.call(executor, new f7.l(3, mVar));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f28744c;
    }

    public final c c() {
        synchronized (this) {
            try {
                Task task = this.f28744c;
                if (task != null && task.isSuccessful()) {
                    return (c) this.f28744c.getResult();
                }
                try {
                    Task taskB = b();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    return (c) a(taskB);
                } catch (InterruptedException | ExecutionException | TimeoutException e2) {
                    Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", e2);
                    return null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Task e(c cVar) {
        f7.e eVar = new f7.e(1, this, cVar);
        Executor executor = this.f28742a;
        return Tasks.call(executor, eVar).onSuccessTask(executor, new com.applovin.impl.sdk.ad.f(11, this, cVar));
    }
}
