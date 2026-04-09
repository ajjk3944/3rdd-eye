package K4;

import E3.m;
import O4.CallableC1466l;
import O4.F;
import O4.v;
import O4.x;
import android.util.Log;

/* compiled from: FirebaseCrashlytics.java */
/* loaded from: classes2.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final F f3148a;

    public e(F f10) {
        this.f3148a = f10;
    }

    public static e a() {
        e eVar = (e) B4.e.c().b(e.class);
        if (eVar != null) {
            return eVar;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    public final void b(Throwable th) {
        if (th == null) {
            Log.w("FirebaseCrashlytics", "A null value was passed to recordException. Ignoring.", null);
            return;
        }
        v vVar = this.f3148a.f10240g;
        Thread threadCurrentThread = Thread.currentThread();
        vVar.getClass();
        x xVar = new x(vVar, System.currentTimeMillis(), th, threadCurrentThread);
        m mVar = vVar.f10338e;
        mVar.getClass();
        mVar.a(new CallableC1466l(xVar));
    }
}
