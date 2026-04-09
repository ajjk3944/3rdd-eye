package com.singular.sdk.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes2.dex */
class BroadcastReceivers {
    private static final SingularLog logger = SingularLog.getLogger("BroadcastReceivers");

    public static class NetworkChange extends BroadcastReceiver {
        private final SingularInstance singular;

        public NetworkChange(SingularInstance singularInstance) {
            this.singular = singularInstance;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            BroadcastReceivers.logger.debug("onReceive() action=%s ", intent.getAction());
            if (Utils.isConnected(context)) {
                this.singular.getApiManager().wakeUp();
            }
        }
    }
}
