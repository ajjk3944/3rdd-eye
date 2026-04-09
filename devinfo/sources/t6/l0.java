package t6;

import android.content.Context;
import androidx.work.WorkerParameters;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class l0 {
    public final u a(Context context, String str, WorkerParameters workerParameters) {
        nk.k.e(context, "appContext");
        nk.k.e(str, "workerClassName");
        nk.k.e(workerParameters, "workerParameters");
        try {
            Class<? extends U> clsAsSubclass = Class.forName(str).asSubclass(u.class);
            nk.k.b(clsAsSubclass);
            try {
                Object objNewInstance = clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                nk.k.b(objNewInstance);
                u uVar = (u) objNewInstance;
                if (!uVar.isUsed()) {
                    return uVar;
                }
                throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
            } catch (Throwable th2) {
                v.e().d(m0.f34384a, "Could not instantiate ".concat(str), th2);
                throw th2;
            }
        } catch (Throwable th3) {
            v.e().d(m0.f34384a, "Invalid class: ".concat(str), th3);
            throw th3;
        }
    }
}
