package O4;

import android.util.Log;
import java.util.concurrent.TimeoutException;

/* compiled from: CrashlyticsController.java */
/* renamed from: O4.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1470p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f10321a;

    public C1470p(v vVar) {
        this.f10321a = vVar;
    }

    public final void a(V4.e eVar, Thread thread, Throwable th) {
        v vVar = this.f10321a;
        synchronized (vVar) {
            String str = "Handling uncaught exception \"" + th + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            try {
                try {
                    U.a(vVar.f10338e.b(new r(vVar, System.currentTimeMillis(), th, thread, eVar)));
                } catch (Exception e4) {
                    Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e4);
                }
            } catch (TimeoutException unused) {
                Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
            }
        }
    }
}
