package O4;

import android.util.Log;

/* compiled from: CrashlyticsController.java */
/* loaded from: classes2.dex */
public final class x implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f10355b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Throwable f10356c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Thread f10357d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v f10358e;

    public x(v vVar, long j4, Throwable th, Thread thread) {
        this.f10358e = vVar;
        this.f10355b = j4;
        this.f10356c = th;
        this.f10357d = thread;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v vVar = this.f10358e;
        I i = vVar.f10346n;
        if (i == null || !i.f10260e.get()) {
            long j4 = this.f10355b / 1000;
            String strE = vVar.e();
            if (strE == null) {
                Log.w("FirebaseCrashlytics", "Tried to write a non-fatal exception while no session was open.", null);
                return;
            }
            T t10 = vVar.f10345m;
            t10.getClass();
            String strConcat = "Persisting non-fatal event for session ".concat(strE);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", strConcat, null);
            }
            t10.e(this.f10356c, this.f10357d, strE, com.vungle.ads.internal.presenter.g.ERROR, j4, false);
        }
    }
}
