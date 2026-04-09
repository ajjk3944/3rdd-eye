package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzfmi extends BroadcastReceiver {
    final /* synthetic */ zzfmj zza;

    public zzfmi(zzfmj zzfmjVar) {
        this.zza = zzfmjVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
            zzfmj zzfmjVar = this.zza;
            zzfmjVar.zzd(true, zzfmjVar.zzd);
            zzfmjVar.zzc = true;
        } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
            zzfmj zzfmjVar2 = this.zza;
            zzfmjVar2.zzd(false, zzfmjVar2.zzd);
            zzfmjVar2.zzc = false;
        }
    }
}
