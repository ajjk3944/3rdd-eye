package O4;

import O4.v;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* compiled from: CrashlyticsController.java */
/* renamed from: O4.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class CallableC1474u implements Callable<Task<Void>> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Boolean f10331a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v.a f10332b;

    public CallableC1474u(v.a aVar, Boolean bool) {
        this.f10332b = aVar;
        this.f10331a = bool;
    }

    @Override // java.util.concurrent.Callable
    public final Task<Void> call() throws Exception {
        Boolean bool = this.f10331a;
        boolean zBooleanValue = bool.booleanValue();
        v.a aVar = this.f10332b;
        v vVar = v.this;
        if (zBooleanValue) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
            }
            boolean zBooleanValue2 = bool.booleanValue();
            J j4 = vVar.f10335b;
            if (!zBooleanValue2) {
                j4.getClass();
                throw new IllegalStateException("An invalid data collection token was used.");
            }
            j4.f10266f.trySetResult(null);
            ExecutorService executorService = (ExecutorService) vVar.f10338e.f1416b;
            return aVar.f10350b.onSuccessTask(executorService, new C1473t(this, executorService));
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
        }
        Iterator it = T4.e.e(vVar.f10340g.f12285c.listFiles(v.f10333r)).iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
        T4.e eVar = vVar.f10345m.f10284b.f12279b;
        T4.c.a(T4.e.e(eVar.f12287e.listFiles()));
        T4.c.a(T4.e.e(eVar.f12288f.listFiles()));
        T4.c.a(T4.e.e(eVar.f12289g.listFiles()));
        vVar.f10349q.trySetResult(null);
        return Tasks.forResult(null);
    }
}
