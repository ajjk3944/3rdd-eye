package c1;

import V0.m;
import android.content.Intent;
import android.content.IntentFilter;

/* loaded from: classes.dex */
public final class f extends AbstractC0399c {
    public static final String i = m.h("StorageNotLowTracker");

    @Override // c1.AbstractC0400d
    public final Object a() {
        Intent intentRegisterReceiver = this.f5886b.registerReceiver(null, f());
        if (intentRegisterReceiver == null || intentRegisterReceiver.getAction() == null) {
            return Boolean.TRUE;
        }
        String action = intentRegisterReceiver.getAction();
        action.getClass();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            return Boolean.FALSE;
        }
        if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            return Boolean.TRUE;
        }
        return null;
    }

    @Override // c1.AbstractC0399c
    public final IntentFilter f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
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
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            c(Boolean.FALSE);
        } else if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            c(Boolean.TRUE);
        }
    }
}
