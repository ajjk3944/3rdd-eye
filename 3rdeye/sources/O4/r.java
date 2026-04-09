package O4;

import android.util.Log;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* compiled from: CrashlyticsController.java */
/* loaded from: classes2.dex */
public final class r implements Callable<Task<Void>> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f10324a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f10325b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Thread f10326c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ V4.e f10327d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v f10328e;

    public r(v vVar, long j4, Throwable th, Thread thread, V4.e eVar) {
        this.f10328e = vVar;
        this.f10324a = j4;
        this.f10325b = th;
        this.f10326c = thread;
        this.f10327d = eVar;
    }

    @Override // java.util.concurrent.Callable
    public final Task<Void> call() throws Exception {
        T4.e eVar;
        String str;
        long j4 = this.f10324a;
        long j10 = j4 / 1000;
        v vVar = this.f10328e;
        String strE = vVar.e();
        if (strE == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return Tasks.forResult(null);
        }
        vVar.f10336c.i();
        T t10 = vVar.f10345m;
        t10.getClass();
        String strConcat = "Persisting fatal event for session ".concat(strE);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", strConcat, null);
        }
        t10.e(this.f10325b, this.f10326c, strE, AppMeasurement.CRASH_ORIGIN, j10, true);
        try {
            eVar = vVar.f10340g;
            str = ".ae" + j4;
            eVar.getClass();
        } catch (IOException e4) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e4);
        }
        if (!new File(eVar.f12285c, str).createNewFile()) {
            throw new IOException("Create new file failed.");
        }
        V4.e eVar2 = this.f10327d;
        vVar.c(false, eVar2);
        new C1460f(vVar.f10339f);
        v.a(vVar, C1460f.f10308b, Boolean.FALSE);
        if (!vVar.f10335b.a()) {
            return Tasks.forResult(null);
        }
        ExecutorService executorService = (ExecutorService) vVar.f10338e.f1416b;
        return eVar2.i.get().getTask().onSuccessTask(executorService, new C1471q(this, executorService, strE));
    }
}
