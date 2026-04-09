package n5;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import m0.C5308a;

/* compiled from: TopicsSubscriber.java */
/* renamed from: n5.B, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5359B {
    public static final long i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f44286j = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f44287a;

    /* renamed from: b, reason: collision with root package name */
    public final o f44288b;

    /* renamed from: c, reason: collision with root package name */
    public final l f44289c;

    /* renamed from: d, reason: collision with root package name */
    public final FirebaseMessaging f44290d;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f44292f;

    /* renamed from: h, reason: collision with root package name */
    public final z f44294h;

    /* renamed from: e, reason: collision with root package name */
    public final C5308a f44291e = new C5308a();

    /* renamed from: g, reason: collision with root package name */
    public boolean f44293g = false;

    public C5359B(FirebaseMessaging firebaseMessaging, o oVar, z zVar, l lVar, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f44290d = firebaseMessaging;
        this.f44288b = oVar;
        this.f44294h = zVar;
        this.f44289c = lVar;
        this.f44287a = context;
        this.f44292f = scheduledThreadPoolExecutor;
    }

    public static <T> void a(Task<T> task) throws IOException {
        try {
            Tasks.await(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e4) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e4);
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e10);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static boolean d() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        }
        return Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3);
    }

    public final void b(String str) throws IOException {
        String strA = this.f44290d.a();
        l lVar = this.f44289c;
        lVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        a(lVar.a(lVar.c(strA, "/topics/" + str, bundle)));
    }

    public final void c(String str) throws IOException {
        String strA = this.f44290d.a();
        l lVar = this.f44289c;
        lVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        a(lVar.a(lVar.c(strA, "/topics/" + str, bundle)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(y yVar) {
        synchronized (this.f44291e) {
            try {
                String str = yVar.f44393c;
                if (this.f44291e.containsKey(str)) {
                    ArrayDeque arrayDeque = (ArrayDeque) this.f44291e.get(str);
                    TaskCompletionSource taskCompletionSource = (TaskCompletionSource) arrayDeque.poll();
                    if (taskCompletionSource != null) {
                        taskCompletionSource.setResult(null);
                    }
                    if (arrayDeque.isEmpty()) {
                        this.f44291e.remove(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void f(boolean z10) {
        this.f44293g = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.C5359B.g():boolean");
    }

    public final void h(long j4) {
        this.f44292f.schedule(new RunnableC5360C(this, this.f44287a, this.f44288b, Math.min(Math.max(30L, 2 * j4), i)), j4, TimeUnit.SECONDS);
        f(true);
    }
}
