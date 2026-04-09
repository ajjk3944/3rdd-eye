package oi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import com.liuzh.deviceinfo.widget.OverViewWidget4x2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public int f30562a;

    /* renamed from: b, reason: collision with root package name */
    public int f30563b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f30564c;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if ("android.location.PROVIDERS_CHANGED".equals(action)) {
            Boolean bool = OverViewWidget4x2.f21394a;
            boolean z3 = Settings.Secure.getInt(context.getContentResolver(), "location_mode") != 0;
            Boolean bool2 = this.f30564c;
            if (bool2 == null || bool2.booleanValue() != z3) {
                this.f30564c = Boolean.valueOf(z3);
                OverViewWidget4x2.c();
                return;
            }
            return;
        }
        if ("android.net.wifi.WIFI_STATE_CHANGED".equals(action)) {
            int intExtra = intent.getIntExtra("wifi_state", 0);
            if (intExtra == 1 || (intExtra == 3 && this.f30563b != intExtra)) {
                this.f30563b = intExtra;
                OverViewWidget4x2.c();
                return;
            }
            return;
        }
        if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(action)) {
            int intExtra2 = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 0);
            if (intExtra2 == 12 || (intExtra2 == 10 && this.f30562a != intExtra2)) {
                this.f30562a = intExtra2;
                OverViewWidget4x2.c();
            }
        }
    }
}
