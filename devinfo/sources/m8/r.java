package m8;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.util.Log;
import com.google.android.gms.internal.ads.hp;
import com.google.android.gms.internal.ads.kf;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class r implements o {
    public static final Executor g = AsyncTask.SERIAL_EXECUTOR;

    /* renamed from: a, reason: collision with root package name */
    public final Context f28975a;

    /* renamed from: b, reason: collision with root package name */
    public final n f28976b;

    /* renamed from: c, reason: collision with root package name */
    public final hp f28977c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f28978d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f28979e;

    /* renamed from: f, reason: collision with root package name */
    public final kf f28980f = new kf(10, this);

    public r(Context context, hp hpVar, n nVar) {
        this.f28975a = context.getApplicationContext();
        this.f28977c = hpVar;
        this.f28976b = nVar;
    }

    @Override // m8.o
    public final boolean a() {
        g.execute(new q(this, 0));
        return true;
    }

    @Override // m8.o
    public final void b() {
        g.execute(new q(this, 1));
    }

    public final boolean c() {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f28977c.get()).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (RuntimeException e2) {
            if (!Log.isLoggable("ConnectivityMonitor", 5)) {
                return true;
            }
            Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e2);
            return true;
        }
    }
}
