package O4;

import android.util.Log;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: CrashlyticsController.java */
/* renamed from: O4.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1471q implements SuccessContinuation {

    /* renamed from: b, reason: collision with root package name */
    public final Object f10322b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f10323c;

    public C1471q() {
        this.f10322b = new AtomicInteger();
        this.f10323c = new AtomicInteger();
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) throws Exception {
        if (((V4.b) obj) == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
            return Tasks.forResult(null);
        }
        v vVar = ((r) this.f10323c).f10328e;
        return Tasks.whenAll((Task<?>[]) new Task[]{v.b(vVar), vVar.f10345m.f(null, (ExecutorService) this.f10322b)});
    }

    public C1471q(r rVar, ExecutorService executorService, String str) {
        this.f10323c = rVar;
        this.f10322b = executorService;
    }
}
