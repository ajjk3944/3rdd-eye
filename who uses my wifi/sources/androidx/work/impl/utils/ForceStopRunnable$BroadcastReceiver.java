package androidx.work.impl.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.h80;
import defpackage.xv;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class ForceStopRunnable$BroadcastReceiver extends BroadcastReceiver {
    static {
        h80.f("ForceStopRunnable$Rcvr");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
            return;
        }
        int i = h80.d().g;
        xv.b(context);
    }
}
