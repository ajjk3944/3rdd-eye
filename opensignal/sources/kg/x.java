package kg;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.e5;
import com.google.firebase.messaging.FirebaseMessaging;
import h9.r2;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: i, reason: collision with root package name */
    public static final long f14419i = TimeUnit.HOURS.toSeconds(8);
    public static final /* synthetic */ int j = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f14420a;

    /* renamed from: b, reason: collision with root package name */
    public final n f14421b;

    /* renamed from: c, reason: collision with root package name */
    public final r2 f14422c;

    /* renamed from: d, reason: collision with root package name */
    public final FirebaseMessaging f14423d;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f14425f;

    /* renamed from: h, reason: collision with root package name */
    public final v f14427h;

    /* renamed from: e, reason: collision with root package name */
    public final u.e f14424e = new u.e(0);

    /* renamed from: g, reason: collision with root package name */
    public boolean f14426g = false;

    public x(FirebaseMessaging firebaseMessaging, n nVar, v vVar, r2 r2Var, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f14423d = firebaseMessaging;
        this.f14421b = nVar;
        this.f14427h = vVar;
        this.f14422c = r2Var;
        this.f14420a = context;
        this.f14425f = scheduledThreadPoolExecutor;
    }

    public static void a(dd.r rVar) throws IOException {
        try {
            e5.h(rVar, 30L, TimeUnit.SECONDS);
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

    public final void b(String str) throws IOException {
        String strA = this.f14423d.a();
        r2 r2Var = this.f14422c;
        r2Var.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        a(r2Var.V(r2Var.j1(strA, "/topics/" + str, bundle)));
    }

    public final void c(String str) throws IOException {
        String strA = this.f14423d.a();
        r2 r2Var = this.f14422c;
        r2Var.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        a(r2Var.V(r2Var.j1(strA, "/topics/" + str, bundle)));
    }

    public final synchronized void d(boolean z10) {
        this.f14426g = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004e A[Catch: IOException -> 0x003a, TRY_LEAVE, TryCatch #1 {IOException -> 0x003a, blocks: (B:12:0x0018, B:25:0x004e, B:17:0x0029, B:19:0x0031, B:22:0x003d, B:24:0x0045), top: B:77:0x0018 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kg.x.e():boolean");
    }

    public final void f(long j7) {
        this.f14425f.schedule(new z(this, this.f14420a, this.f14421b, Math.min(Math.max(30L, 2 * j7), f14419i)), j7, TimeUnit.SECONDS);
        d(true);
    }
}
