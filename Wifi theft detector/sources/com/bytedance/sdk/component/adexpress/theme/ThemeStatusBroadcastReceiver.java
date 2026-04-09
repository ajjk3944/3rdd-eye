package com.bytedance.sdk.component.adexpress.theme;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class ThemeStatusBroadcastReceiver extends BroadcastReceiver {
    private WeakReference<emc> emc;

    public void emc(emc emcVar) {
        this.emc = new WeakReference<>(emcVar);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        int intExtra = intent.getIntExtra("theme_status_change", 0);
        WeakReference<emc> weakReference = this.emc;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.emc.get().onThemeChanged(intExtra);
    }
}
