package com.vungle.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: RingerModeReceiver.kt */
/* loaded from: classes2.dex */
public final class n extends BroadcastReceiver {
    private com.vungle.ads.internal.ui.e webClient;

    public final com.vungle.ads.internal.ui.e getWebClient() {
        return this.webClient;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action;
        com.vungle.ads.internal.ui.e eVar;
        if (intent != null) {
            try {
                action = intent.getAction();
            } catch (Exception e4) {
                String localizedMessage = e4.getLocalizedMessage();
                if (localizedMessage != null) {
                    k.Companion.e("RingerModeReceiver", localizedMessage);
                    return;
                }
                return;
            }
        } else {
            action = null;
        }
        if (kotlin.jvm.internal.l.b(action, "android.media.RINGER_MODE_CHANGED")) {
            int intExtra = intent.getIntExtra("android.media.EXTRA_RINGER_MODE", -1);
            k.Companion.d("RingerModeReceiver", "receive ringermode: " + intExtra);
            if (intExtra == 0) {
                com.vungle.ads.internal.ui.e eVar2 = this.webClient;
                if (eVar2 != null) {
                    eVar2.notifySilentModeChange(true);
                    return;
                }
                return;
            }
            if (intExtra != 1) {
                if (intExtra == 2 && (eVar = this.webClient) != null) {
                    eVar.notifySilentModeChange(false);
                    return;
                }
                return;
            }
            com.vungle.ads.internal.ui.e eVar3 = this.webClient;
            if (eVar3 != null) {
                eVar3.notifySilentModeChange(true);
            }
        }
    }

    public final void setWebClient(com.vungle.ads.internal.ui.e eVar) {
        this.webClient = eVar;
    }
}
