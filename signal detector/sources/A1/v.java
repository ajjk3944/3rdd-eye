package A1;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.util.Log;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class v implements p {

    /* renamed from: g, reason: collision with root package name */
    public static final Executor f130g = AsyncTask.SERIAL_EXECUTOR;

    /* renamed from: a, reason: collision with root package name */
    public final Context f131a;

    /* renamed from: b, reason: collision with root package name */
    public final o f132b;

    /* renamed from: c, reason: collision with root package name */
    public final H1.h f133c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f134d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f135e;

    /* renamed from: f, reason: collision with root package name */
    public final t f136f = new t(0, this);

    public v(Context context, H1.h hVar, o oVar) {
        this.f131a = context.getApplicationContext();
        this.f133c = hVar;
        this.f132b = oVar;
    }

    @Override // A1.p
    public final boolean a() {
        f130g.execute(new u(this, 0));
        return true;
    }

    @Override // A1.p
    public final void b() {
        f130g.execute(new u(this, 1));
    }

    public final boolean c() {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f133c.get()).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (RuntimeException e6) {
            if (!Log.isLoggable("ConnectivityMonitor", 5)) {
                return true;
            }
            Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e6);
            return true;
        }
    }
}
