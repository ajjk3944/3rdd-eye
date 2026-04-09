package I5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes2.dex */
public final class k extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean zEquals = intent.getAction().equals("android.intent.action.SCREEN_OFF");
        l lVar = l.f2515d;
        if (zEquals) {
            lVar.a(true, lVar.f2518c);
            lVar.f2517b = true;
        } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
            lVar.a(false, lVar.f2518c);
            lVar.f2517b = false;
        }
    }
}
