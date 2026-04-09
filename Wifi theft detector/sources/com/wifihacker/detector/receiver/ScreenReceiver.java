package com.wifihacker.detector.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.wifihacker.detector.HackerApplication;
import com.wifihacker.detector.mvp.view.activity.ScreenLockActivity;
import g8.o;
import g8.u;

/* loaded from: classes3.dex */
public class ScreenReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (o.c().b(context, "switch_open_lock_screen", true) && intent.getAction().equals("android.intent.action.SCREEN_OFF") && u.f(context)) {
            Intent intent2 = new Intent(context, (Class<?>) ScreenLockActivity.class);
            intent2.addFlags(268435456);
            if (!o.c().b(context, "switch_open_lock_screen", true) || !o.c().b(context, "IS_CHARGING", true) || u.d(context) == null || HackerApplication.l().r()) {
                return;
            }
            context.startActivity(intent2);
        }
    }
}
