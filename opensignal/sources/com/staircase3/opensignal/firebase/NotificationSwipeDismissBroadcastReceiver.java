package com.staircase3.opensignal.firebase;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import as.x;
import kc.f;
import kotlin.Metadata;
import kv.a;
import lq.j;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/staircase3/opensignal/firebase/NotificationSwipeDismissBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "Lkv/a;", "<init>", "()V", "openSignal_externalRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NotificationSwipeDismissBroadcastReceiver extends BroadcastReceiver implements a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f6065a = f.E(j.SYNCHRONIZED, new x(16, this));

    @Override // kv.a
    public final /* bridge */ jv.a getKoin() {
        return a.a.r(this);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, lq.h] */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            int intExtra = intent.getIntExtra("NOTIFICATION_ID", 0);
            ?? r32 = this.f6065a;
            if (intExtra == 4123) {
                com.staircase3.opensignal.utils.a.e((com.staircase3.opensignal.utils.a) r32.getValue(), "boost_speedtest_notification", "notification", "received_negative_swipe_dismiss", 8);
            } else {
                if (intExtra != 5315) {
                    return;
                }
                com.staircase3.opensignal.utils.a.e((com.staircase3.opensignal.utils.a) r32.getValue(), "os_firebase_messaging_service", "notification", "received_negative_swipe_dismiss", 8);
            }
        }
    }
}
