package O4;

import O4.v;
import android.util.Log;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutorService;

/* compiled from: CrashlyticsController.java */
/* renamed from: O4.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1473t implements SuccessContinuation<V4.b, Void> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ExecutorService f10329b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CallableC1474u f10330c;

    public C1473t(CallableC1474u callableC1474u, ExecutorService executorService) {
        this.f10330c = callableC1474u;
        this.f10329b = executorService;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task<Void> then(V4.b bVar) throws Exception {
        if (bVar == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
            return Tasks.forResult(null);
        }
        v.a aVar = this.f10330c.f10332b;
        v.b(v.this);
        v vVar = v.this;
        vVar.f10345m.f(null, this.f10329b);
        vVar.f10349q.trySetResult(null);
        return Tasks.forResult(null);
    }
}
