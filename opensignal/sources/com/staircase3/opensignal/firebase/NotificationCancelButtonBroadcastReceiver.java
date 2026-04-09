package com.staircase3.opensignal.firebase;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import as.x;
import br.l;
import kc.f;
import kotlin.Metadata;
import kv.a;
import lq.j;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/staircase3/opensignal/firebase/NotificationCancelButtonBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "Lkv/a;", "<init>", "()V", "openSignal_externalRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NotificationCancelButtonBroadcastReceiver extends BroadcastReceiver implements a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f6064a = f.E(j.SYNCHRONIZED, new x(15, this));

    @Override // kv.a
    public final /* bridge */ jv.a getKoin() {
        return a.a.r(this);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, lq.h] */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        l.e(context, "context");
        ?? r02 = this.f6064a;
        com.staircase3.opensignal.utils.a.e((com.staircase3.opensignal.utils.a) r02.getValue(), "os_firebase_messaging_service", "notification", "received_negative_cancel", 8);
        if (intent != null) {
            int intExtra = intent.getIntExtra("NOTIFICATION_ID", 0);
            if (intExtra == 4123) {
                com.staircase3.opensignal.utils.a.e((com.staircase3.opensignal.utils.a) r02.getValue(), "boost_speedtest_notification", "boost_speedtest_notification", "received_negative_cancel", 8);
            } else if (intExtra == 5315) {
                com.staircase3.opensignal.utils.a.e((com.staircase3.opensignal.utils.a) r02.getValue(), "os_firebase_messaging_service", "interview_notification", "received_negative_swipe_dismiss", 8);
            }
            Object systemService = context.getSystemService("notification");
            l.c(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            ((NotificationManager) systemService).cancel(intExtra);
        }
    }
}
