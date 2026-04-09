package pf;

import android.app.Application;
import android.content.Context;
import android.util.Log;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final wd.f f31875a;

    /* renamed from: b, reason: collision with root package name */
    public final sf.j f31876b;

    public o(wd.f fVar, sf.j jVar, ck.h hVar, x0 x0Var) {
        nk.k.e(fVar, "firebaseApp");
        nk.k.e(jVar, "settings");
        nk.k.e(hVar, "backgroundDispatcher");
        nk.k.e(x0Var, "sessionsActivityLifecycleCallbacks");
        this.f31875a = fVar;
        this.f31876b = jVar;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions 3.0.3.");
        fVar.a();
        Context applicationContext = fVar.f36614a.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(x0Var);
            xk.x.v(xk.x.b(hVar), null, null, new n(this, x0Var, null, 0), 3);
        } else {
            Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
        }
    }
}
