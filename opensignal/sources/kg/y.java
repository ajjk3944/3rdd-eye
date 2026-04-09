package kg;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class y extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public z f14428a;

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        z zVar = this.f14428a;
        if (zVar == null) {
            return;
        }
        if (zVar.c()) {
            Log.isLoggable("FirebaseMessaging", 3);
            z zVar2 = this.f14428a;
            zVar2.f14433r.f14425f.schedule(zVar2, 0L, TimeUnit.SECONDS);
            context.unregisterReceiver(this);
            this.f14428a = null;
        }
    }
}
