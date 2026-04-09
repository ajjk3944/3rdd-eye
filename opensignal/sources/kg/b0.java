package kg;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import h7.h0;

/* loaded from: classes.dex */
public final class b0 extends Binder {

    /* renamed from: d, reason: collision with root package name */
    public final h0 f14349d;

    public b0(h0 h0Var) {
        this.f14349d = h0Var;
    }

    public final void a(c0 c0Var) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        Log.isLoggable("FirebaseMessaging", 3);
        Intent intent = c0Var.f14351a;
        h hVar = (h) this.f14349d.f10078a;
        dd.h hVar2 = new dd.h();
        hVar.f14363a.execute(new ch.a(hVar, intent, hVar2, 11));
        hVar2.f7294a.b(new e7.d(0), new io.sentry.android.replay.capture.e(12, c0Var));
    }
}
