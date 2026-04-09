package androidx.work.impl.background.systemalarm;

import T1.z;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import androidx.work.m;
import androidx.work.s;
import c2.o;

/* loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f16909a = m.g("ConstrntProxyUpdtRecvr");

    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Intent f16910b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f16911c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ BroadcastReceiver.PendingResult f16912d;

        public a(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f16910b = intent;
            this.f16911c = context;
            this.f16912d = pendingResult;
        }

        @Override // java.lang.Runnable
        public final void run() {
            BroadcastReceiver.PendingResult pendingResult = this.f16912d;
            Context context = this.f16911c;
            Intent intent = this.f16910b;
            try {
                boolean booleanExtra = intent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = intent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = intent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = intent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                m.e().a(ConstraintProxyUpdateReceiver.f16909a, "Updating proxies: (BatteryNotLowProxy (" + booleanExtra + "), BatteryChargingProxy (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy (" + booleanExtra4 + "), ");
                o.a(context, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                o.a(context, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                o.a(context, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                o.a(context, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                pendingResult.finish();
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            z.c(context).f12233d.d(new a(intent, context, goAsync()));
        } else {
            m.e().a(f16909a, s.d("Ignoring unknown action ", action));
        }
    }
}
