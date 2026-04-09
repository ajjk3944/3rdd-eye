package androidx.work;

import android.content.Context;
import com.applovin.impl.sdk.ad.f;
import java.util.concurrent.Executor;
import jm.a;
import nk.k;
import t6.k0;
import t6.m;
import t6.t;
import t6.u;
import vd.b;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class Worker extends u {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        k.e(context, "context");
        k.e(workerParameters, "workerParams");
    }

    public abstract t doWork();

    public m getForegroundInfo() {
        throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
    }

    @Override // t6.u
    public b getForegroundInfoAsync() {
        Executor backgroundExecutor = getBackgroundExecutor();
        k.d(backgroundExecutor, "getBackgroundExecutor(...)");
        return a.n(new f(20, backgroundExecutor, new k0(this, 1)));
    }

    @Override // t6.u
    public final b startWork() {
        Executor backgroundExecutor = getBackgroundExecutor();
        k.d(backgroundExecutor, "getBackgroundExecutor(...)");
        return a.n(new f(20, backgroundExecutor, new k0(this, 0)));
    }
}
