package tg;

import android.app.Application;
import android.content.Context;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final se.f f22819a;

    /* renamed from: b, reason: collision with root package name */
    public final wg.k f22820b;

    public n(se.f fVar, wg.k kVar, pq.h hVar, t0 t0Var) {
        br.l.e(fVar, "firebaseApp");
        br.l.e(kVar, "settings");
        br.l.e(hVar, "backgroundDispatcher");
        br.l.e(t0Var, "sessionsActivityLifecycleCallbacks");
        this.f22819a = fVar;
        this.f22820b = kVar;
        fVar.a();
        Context applicationContext = fVar.f22007a.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(t0Var);
            wt.w.s(wt.w.b(hVar), null, null, new a8.h(this, t0Var, (pq.c) null, 15), 3);
        } else {
            io.sentry.android.core.e0.d("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
        }
    }
}
