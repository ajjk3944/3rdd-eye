package c1;

import V0.m;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: c1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0398b extends AbstractC0399c {
    public static final String i = m.h("BatteryNotLowTracker");

    @Override // c1.AbstractC0400d
    public final Object a() {
        Intent intentRegisterReceiver = this.f5886b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            return Boolean.valueOf(intentRegisterReceiver.getIntExtra("status", -1) == 1 || ((float) intentRegisterReceiver.getIntExtra("level", -1)) / ((float) intentRegisterReceiver.getIntExtra("scale", -1)) > 0.15f);
        }
        m.f().e(i, "getInitialState - null intent received", new Throwable[0]);
        return null;
    }

    @Override // c1.AbstractC0399c
    public final IntentFilter f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // c1.AbstractC0399c
    public final void g(Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        m.f().a(i, A.f.l("Received ", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.getClass();
        if (action.equals("android.intent.action.BATTERY_OKAY")) {
            c(Boolean.TRUE);
        } else if (action.equals("android.intent.action.BATTERY_LOW")) {
            c(Boolean.FALSE);
        }
    }
}
